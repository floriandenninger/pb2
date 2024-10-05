package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;

/* loaded from: classes5.dex */
public enum Month implements TemporalAccessor, TemporalAdjuster {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final Month[] ENUMS = values();

    public static Month of(int i) {
        if (i < 1 || i > 12) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid value for MonthOfYear: ");
            sb.append(i);
            throw new DateTimeException(sb.toString());
        }
        return ENUMS[i - 1];
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return TemporalAccessor.CC.$default$get(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            String valueOf = String.valueOf(temporalField);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Unsupported field: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return temporalField.getFrom(this);
    }

    public Month plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.Month$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$Month;

        static {
            int[] iArr = new int[Month.values().length];
            $SwitchMap$java$time$Month = iArr;
            try {
                iArr[Month.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$Month[Month.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$Month[Month.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$Month[Month.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$Month[Month.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$Month[Month.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$Month[Month.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$Month[Month.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$Month[Month.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$Month[Month.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$Month[Month.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$Month[Month.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public int length(boolean z) {
        int i = AnonymousClass1.$SwitchMap$java$time$Month[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public int minLength() {
        int i = AnonymousClass1.$SwitchMap$java$time$Month[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    public int maxLength() {
        int i = AnonymousClass1.$SwitchMap$java$time$Month[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public int firstDayOfYear(boolean z) {
        switch (AnonymousClass1.$SwitchMap$java$time$Month[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
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
        return temporal.with(ChronoField.MONTH_OF_YEAR, getValue());
    }
}
