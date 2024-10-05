package j$.time;

import j$.lang.DesugarMath$$ExternalSyntheticBackport3;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class Year implements Temporal, TemporalAdjuster, Comparable, Serializable {
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    private static final long serialVersionUID = -23038383694477807L;
    private final int year;

    public static Year of(int i) {
        ChronoField.YEAR.checkValidValue(i);
        return new Year(i);
    }

    public static Year from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Year) {
            return (Year) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.CC.from(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(ChronoField.YEAR));
        } catch (DateTimeException e) {
            String valueOf = String.valueOf(temporalAccessor);
            String name = temporalAccessor.getClass().getName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 54 + name.length());
            sb.append("Unable to obtain Year from TemporalAccessor: ");
            sb.append(valueOf);
            sb.append(" of type ");
            sb.append(name);
            throw new DateTimeException(sb.toString(), e);
        }
    }

    private Year(int i) {
        this.year = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.of(1L, this.year <= 0 ? 1000000000L : 999999999L);
        }
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                int i2 = this.year;
                if (i2 < 1) {
                    i2 = 1 - i2;
                }
                return i2;
            }
            if (i == 2) {
                return this.year;
            }
            if (i == 3) {
                return this.year < 1 ? 0 : 1;
            }
            String valueOf = String.valueOf(temporalField);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Unsupported field: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return temporalField.getFrom(this);
    }

    @Override // j$.time.temporal.Temporal
    public Year with(TemporalAdjuster temporalAdjuster) {
        return (Year) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public Year with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i == 1) {
                if (this.year < 1) {
                    j = 1 - j;
                }
                return of((int) j);
            }
            if (i == 2) {
                return of((int) j);
            }
            if (i == 3) {
                return getLong(ChronoField.ERA) == j ? this : of(1 - this.year);
            }
            String valueOf = String.valueOf(temporalField);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Unsupported field: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return (Year) temporalField.adjustInto(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.Year$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // j$.time.temporal.Temporal
    public Year plus(long j, TemporalUnit temporalUnit) {
        long m;
        long m2;
        long m3;
        if (temporalUnit instanceof ChronoUnit) {
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return plusYears(j);
            }
            if (i == 2) {
                m = DesugarMath$$ExternalSyntheticBackport3.m(j, 10);
                return plusYears(m);
            }
            if (i == 3) {
                m2 = DesugarMath$$ExternalSyntheticBackport3.m(j, 100);
                return plusYears(m2);
            }
            if (i == 4) {
                m3 = DesugarMath$$ExternalSyntheticBackport3.m(j, 1000);
                return plusYears(m3);
            }
            if (i == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return with((TemporalField) chronoField, Clock$OffsetClock$$ExternalSyntheticBackport0.m(getLong(chronoField), j));
            }
            String valueOf = String.valueOf(temporalUnit);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Unsupported unit: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return (Year) temporalUnit.addTo(this, j);
    }

    public Year plusYears(long j) {
        return j == 0 ? this : of(ChronoField.YEAR.checkValidIntValue(this.year + j));
    }

    @Override // j$.time.temporal.Temporal
    public Year minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.YEARS;
        }
        return TemporalAccessor.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        if (!Chronology.CC.from(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.with(ChronoField.YEAR, this.year);
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Year from = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long j = from.year - this.year;
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return j;
            }
            if (i == 2) {
                return j / 10;
            }
            if (i == 3) {
                return j / 100;
            }
            if (i == 4) {
                return j / 1000;
            }
            if (i == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return from.getLong(chronoField) - getLong(chronoField);
            }
            String valueOf = String.valueOf(temporalUnit);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Unsupported unit: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return temporalUnit.between(this, from);
    }

    @Override // java.lang.Comparable
    public int compareTo(Year year) {
        return this.year - year.year;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Year) && this.year == ((Year) obj).year;
    }

    public int hashCode() {
        return this.year;
    }

    public String toString() {
        return Integer.toString(this.year);
    }

    private Object writeReplace() {
        return new Ser((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Year readExternal(DataInput dataInput) {
        return of(dataInput.readInt());
    }
}
