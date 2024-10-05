package j$.time;

import j$.lang.DesugarMath$$ExternalSyntheticBackport2;
import j$.lang.DesugarMath$$ExternalSyntheticBackport3;
import j$.nio.file.attribute.FileTime$$ExternalSyntheticBackport0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class Duration implements TemporalAmount, Comparable, Serializable {
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(1000000000);

    public static Duration ofDays(long j) {
        long m;
        m = DesugarMath$$ExternalSyntheticBackport3.m(j, 86400);
        return create(m, 0);
    }

    public static Duration ofHours(long j) {
        long m;
        m = DesugarMath$$ExternalSyntheticBackport3.m(j, 3600);
        return create(m, 0);
    }

    public static Duration ofMinutes(long j) {
        long m;
        m = DesugarMath$$ExternalSyntheticBackport3.m(j, 60);
        return create(m, 0);
    }

    public static Duration ofSeconds(long j) {
        return create(j, 0);
    }

    public static Duration ofSeconds(long j, long j2) {
        return create(Clock$OffsetClock$$ExternalSyntheticBackport0.m(j, DesugarMath$$ExternalSyntheticBackport2.m(j2, 1000000000L)), (int) FileTime$$ExternalSyntheticBackport0.m(j2, 1000000000L));
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return create(j2, i * 1000000);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return create(j2, i);
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        return ZERO.plus(j, temporalUnit);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long until = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j2 = temporal2.getLong(chronoField) - temporal.getLong(chronoField);
                if (until > 0 && j2 < 0) {
                    until++;
                } else if (until < 0 && j2 > 0) {
                    until--;
                }
                j = j2;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(until, j);
        }
    }

    private static Duration create(long j, int i) {
        if ((i | j) == 0) {
            return ZERO;
        }
        return new Duration(j, i);
    }

    private Duration(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public int getNano() {
        return this.nanos;
    }

    public Duration plus(Duration duration) {
        return plus(duration.getSeconds(), duration.getNano());
    }

    public Duration plus(long j, TemporalUnit temporalUnit) {
        long m;
        Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            m = DesugarMath$$ExternalSyntheticBackport3.m(j, 86400);
            return plus(m, 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new UnsupportedTemporalTypeException("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return this;
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return plusNanos(j);
            }
            if (i == 2) {
                return plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000);
            }
            if (i == 3) {
                return plusMillis(j);
            }
            if (i == 4) {
                return plusSeconds(j);
            }
            return plusSeconds(DesugarMath$$ExternalSyntheticBackport3.m(temporalUnit.getDuration().seconds, j));
        }
        return plusSeconds(temporalUnit.getDuration().multipliedBy(j).getSeconds()).plusNanos(r7.getNano());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.Duration$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Duration plusSeconds(long j) {
        return plus(j, 0L);
    }

    public Duration plusMillis(long j) {
        return plus(j / 1000, (j % 1000) * 1000000);
    }

    public Duration plusNanos(long j) {
        return plus(0L, j);
    }

    private Duration plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(Clock$OffsetClock$$ExternalSyntheticBackport0.m(Clock$OffsetClock$$ExternalSyntheticBackport0.m(this.seconds, j), j2 / 1000000000), this.nanos + (j2 % 1000000000));
    }

    public Duration minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j == 1 ? this : create(toBigDecimalSeconds().multiply(BigDecimal.valueOf(j)));
    }

    private BigDecimal toBigDecimalSeconds() {
        return BigDecimal.valueOf(this.seconds).add(BigDecimal.valueOf(this.nanos, 9));
    }

    private static Duration create(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(BI_NANOS_PER_SECOND);
        if (divideAndRemainder[0].bitLength() > 63) {
            String valueOf = String.valueOf(bigIntegerExact);
            StringBuilder sb = new StringBuilder(valueOf.length() + 30);
            sb.append("Exceeds capacity of Duration: ");
            sb.append(valueOf);
            throw new ArithmeticException(sb.toString());
        }
        return ofSeconds(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
    }

    @Override // j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        long j = this.seconds;
        if (j != 0) {
            temporal = temporal.plus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? temporal.plus(i, ChronoUnit.NANOS) : temporal;
    }

    public long toDays() {
        return this.seconds / 86400;
    }

    public long toHours() {
        return this.seconds / 3600;
    }

    public long toSeconds() {
        return this.seconds;
    }

    public long toMillis() {
        long m;
        long j = this.seconds;
        long j2 = this.nanos;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        m = DesugarMath$$ExternalSyntheticBackport3.m(j, 1000);
        return Clock$OffsetClock$$ExternalSyntheticBackport0.m(m, j2 / 1000000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int i = (this.seconds > duration.seconds ? 1 : (this.seconds == duration.seconds ? 0 : -1));
        return i != 0 ? i : this.nanos - duration.nanos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.seconds == duration.seconds && this.nanos == duration.nanos;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.seconds;
        if (j < 0 && this.nanos > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.seconds >= 0 || this.nanos <= 0) {
            sb.append(i2);
        } else if (i2 == 0) {
            sb.append("-0");
        } else {
            sb.append(i2);
        }
        if (this.nanos > 0) {
            int length = sb.length();
            if (this.seconds < 0) {
                sb.append(2000000000 - this.nanos);
            } else {
                sb.append(this.nanos + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Duration readExternal(DataInput dataInput) {
        return ofSeconds(dataInput.readLong(), dataInput.readInt());
    }
}
