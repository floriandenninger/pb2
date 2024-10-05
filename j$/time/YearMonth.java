package j$.time;

import j$.lang.DesugarMath$$ExternalSyntheticBackport2;
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
public final class YearMonth implements Temporal, TemporalAdjuster, Comparable, Serializable {
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    private final int month;
    private final int year;

    public static YearMonth of(int i, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.CC.from(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            String valueOf = String.valueOf(temporalAccessor);
            String name = temporalAccessor.getClass().getName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 59 + name.length());
            sb.append("Unable to obtain YearMonth from TemporalAccessor: ");
            sb.append(valueOf);
            sb.append(" of type ");
            sb.append(name);
            throw new DateTimeException(sb.toString(), e);
        }
    }

    private YearMonth(int i, int i2) {
        this.year = i;
        this.month = i2;
    }

    private YearMonth with(int i, int i2) {
        return (this.year == i && this.month == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.of(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int i;
        if (temporalField instanceof ChronoField) {
            int i2 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i2 == 1) {
                i = this.month;
            } else {
                if (i2 == 2) {
                    return getProlepticMonth();
                }
                if (i2 == 3) {
                    int i3 = this.year;
                    if (i3 < 1) {
                        i3 = 1 - i3;
                    }
                    return i3;
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return this.year < 1 ? 0 : 1;
                    }
                    String valueOf = String.valueOf(temporalField);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                    sb.append("Unsupported field: ");
                    sb.append(valueOf);
                    throw new UnsupportedTemporalTypeException(sb.toString());
                }
                i = this.year;
            }
            return i;
        }
        return temporalField.getFrom(this);
    }

    private long getProlepticMonth() {
        return ((this.year * 12) + this.month) - 1;
    }

    public int getYear() {
        return this.year;
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth with(TemporalAdjuster temporalAdjuster) {
        return (YearMonth) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i == 1) {
                return withMonth((int) j);
            }
            if (i == 2) {
                return plusMonths(j - getProlepticMonth());
            }
            if (i == 3) {
                if (this.year < 1) {
                    j = 1 - j;
                }
                return withYear((int) j);
            }
            if (i == 4) {
                return withYear((int) j);
            }
            if (i == 5) {
                return getLong(ChronoField.ERA) == j ? this : withYear(1 - this.year);
            }
            String valueOf = String.valueOf(temporalField);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Unsupported field: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return (YearMonth) temporalField.adjustInto(this, j);
    }

    public YearMonth withYear(int i) {
        ChronoField.YEAR.checkValidValue(i);
        return with(i, this.month);
    }

    public YearMonth withMonth(int i) {
        ChronoField.MONTH_OF_YEAR.checkValidValue(i);
        return with(this.year, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.YearMonth$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth plus(long j, TemporalUnit temporalUnit) {
        long m;
        long m2;
        long m3;
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusMonths(j);
                case 2:
                    return plusYears(j);
                case 3:
                    m = DesugarMath$$ExternalSyntheticBackport3.m(j, 10);
                    return plusYears(m);
                case 4:
                    m2 = DesugarMath$$ExternalSyntheticBackport3.m(j, 100);
                    return plusYears(m2);
                case 5:
                    m3 = DesugarMath$$ExternalSyntheticBackport3.m(j, 1000);
                    return plusYears(m3);
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((TemporalField) chronoField, Clock$OffsetClock$$ExternalSyntheticBackport0.m(getLong(chronoField), j));
                default:
                    String valueOf = String.valueOf(temporalUnit);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Unsupported unit: ");
                    sb.append(valueOf);
                    throw new UnsupportedTemporalTypeException(sb.toString());
            }
        }
        return (YearMonth) temporalUnit.addTo(this, j);
    }

    public YearMonth plusYears(long j) {
        return j == 0 ? this : with(ChronoField.YEAR.checkValidIntValue(this.year + j), this.month);
    }

    public YearMonth plusMonths(long j) {
        long m;
        if (j == 0) {
            return this;
        }
        long j2 = (this.year * 12) + (this.month - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        m = DesugarMath$$ExternalSyntheticBackport2.m(j2, 12);
        return with(chronoField.checkValidIntValue(m), YearMonth$$ExternalSyntheticBackport0.m(j2, 12) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public YearMonth minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.MONTHS;
        }
        return TemporalAccessor.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        if (!Chronology.CC.from(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.with(ChronoField.PROLEPTIC_MONTH, getProlepticMonth());
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth from = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long prolepticMonth = from.getProlepticMonth() - getProlepticMonth();
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return prolepticMonth;
                case 2:
                    return prolepticMonth / 12;
                case 3:
                    return prolepticMonth / 120;
                case 4:
                    return prolepticMonth / 1200;
                case 5:
                    return prolepticMonth / 12000;
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return from.getLong(chronoField) - getLong(chronoField);
                default:
                    String valueOf = String.valueOf(temporalUnit);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Unsupported unit: ");
                    sb.append(valueOf);
                    throw new UnsupportedTemporalTypeException(sb.toString());
            }
        }
        return temporalUnit.between(this, from);
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        int i = this.year - yearMonth.year;
        return i == 0 ? this.month - yearMonth.month : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.year == yearMonth.year && this.month == yearMonth.month;
    }

    public int hashCode() {
        return this.year ^ (this.month << 27);
    }

    public String toString() {
        int abs = Math.abs(this.year);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.year;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.year);
        }
        sb.append(this.month < 10 ? "-0" : "-");
        sb.append(this.month);
        return sb.toString();
    }

    private Object writeReplace() {
        return new Ser((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static YearMonth readExternal(DataInput dataInput) {
        return of(dataInput.readInt(), dataInput.readByte());
    }
}
