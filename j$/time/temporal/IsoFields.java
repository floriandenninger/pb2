package j$.time.temporal;

import j$.time.Clock$OffsetClock$$ExternalSyntheticBackport0;
import j$.time.DayOfWeek;
import j$.time.Duration;
import j$.time.Instant$$ExternalSyntheticBackport8;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;

/* loaded from: classes5.dex */
public abstract class IsoFields {
    public static final TemporalField DAY_OF_QUARTER = Field.DAY_OF_QUARTER;
    public static final TemporalField QUARTER_OF_YEAR = Field.QUARTER_OF_YEAR;
    public static final TemporalField WEEK_OF_WEEK_BASED_YEAR = Field.WEEK_OF_WEEK_BASED_YEAR;
    public static final TemporalField WEEK_BASED_YEAR = Field.WEEK_BASED_YEAR;
    public static final TemporalUnit WEEK_BASED_YEARS = Unit.WEEK_BASED_YEARS;
    public static final TemporalUnit QUARTER_YEARS = Unit.QUARTER_YEARS;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public abstract class Field implements TemporalField {
        public static final Field DAY_OF_QUARTER = new AnonymousClass1("DAY_OF_QUARTER", 0);
        public static final Field QUARTER_OF_YEAR = new AnonymousClass2("QUARTER_OF_YEAR", 1);
        public static final Field WEEK_OF_WEEK_BASED_YEAR = new AnonymousClass3("WEEK_OF_WEEK_BASED_YEAR", 2);
        public static final Field WEEK_BASED_YEAR = new AnonymousClass4("WEEK_BASED_YEAR", 3);
        private static final /* synthetic */ Field[] $VALUES = $values();
        private static final int[] QUARTER_DAYS = {0, 90, 181, 273, 0, 91, 182, 274};

        @Override // j$.time.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        /* renamed from: j$.time.temporal.IsoFields$Field$1, reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass1 extends Field {
            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }

            private AnonymousClass1(String str, int i) {
                super(str, i);
            }

            @Override // j$.time.temporal.TemporalField
            public ValueRange range() {
                return ValueRange.of(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR) && temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && temporalAccessor.isSupported(ChronoField.YEAR) && IsoFields.isIso(temporalAccessor);
            }

            @Override // j$.time.temporal.IsoFields.Field, j$.time.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long j = temporalAccessor.getLong(Field.QUARTER_OF_YEAR);
                if (j == 1) {
                    return IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? ValueRange.of(1L, 91L) : ValueRange.of(1L, 90L);
                }
                if (j == 2) {
                    return ValueRange.of(1L, 91L);
                }
                if (j == 3 || j == 4) {
                    return ValueRange.of(1L, 92L);
                }
                return range();
            }

            @Override // j$.time.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(ChronoField.DAY_OF_YEAR) - Field.QUARTER_DAYS[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public Temporal adjustInto(Temporal temporal, long j) {
                long from = getFrom(temporal);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.with(chronoField, temporal.getLong(chronoField) + (j - from));
            }
        }

        private static /* synthetic */ Field[] $values() {
            return new Field[]{DAY_OF_QUARTER, QUARTER_OF_YEAR, WEEK_OF_WEEK_BASED_YEAR, WEEK_BASED_YEAR};
        }

        private Field(String str, int i) {
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }

        /* renamed from: j$.time.temporal.IsoFields$Field$2, reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass2 extends Field {
            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }

            private AnonymousClass2(String str, int i) {
                super(str, i);
            }

            @Override // j$.time.temporal.TemporalField
            public ValueRange range() {
                return ValueRange.of(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && IsoFields.isIso(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.IsoFields.Field, j$.time.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
                }
                return super.rangeRefinedBy(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public Temporal adjustInto(Temporal temporal, long j) {
                long from = getFrom(temporal);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.with(chronoField, temporal.getLong(chronoField) + ((j - from) * 3));
            }
        }

        /* renamed from: j$.time.temporal.IsoFields$Field$3, reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass3 extends Field {
            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }

            private AnonymousClass3(String str, int i) {
                super(str, i);
            }

            @Override // j$.time.temporal.TemporalField
            public ValueRange range() {
                return ValueRange.of(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && IsoFields.isIso(temporalAccessor);
            }

            @Override // j$.time.temporal.IsoFields.Field, j$.time.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return Field.getWeekRange(LocalDate.from(temporalAccessor));
            }

            @Override // j$.time.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return Field.getWeek(LocalDate.from(temporalAccessor));
            }

            @Override // j$.time.temporal.TemporalField
            public Temporal adjustInto(Temporal temporal, long j) {
                range().checkValidValue(j, this);
                return temporal.plus(Instant$$ExternalSyntheticBackport8.m(j, getFrom(temporal)), ChronoUnit.WEEKS);
            }
        }

        /* renamed from: j$.time.temporal.IsoFields$Field$4, reason: invalid class name */
        /* loaded from: classes5.dex */
        enum AnonymousClass4 extends Field {
            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }

            private AnonymousClass4(String str, int i) {
                super(str, i);
            }

            @Override // j$.time.temporal.TemporalField
            public ValueRange range() {
                return ChronoField.YEAR.range();
            }

            @Override // j$.time.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && IsoFields.isIso(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                return Field.getWeekBasedYear(LocalDate.from(temporalAccessor));
            }

            @Override // j$.time.temporal.IsoFields.Field, j$.time.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                return super.rangeRefinedBy(temporalAccessor);
            }

            @Override // j$.time.temporal.TemporalField
            public Temporal adjustInto(Temporal temporal, long j) {
                if (!isSupportedBy(temporal)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int checkValidIntValue = range().checkValidIntValue(j, Field.WEEK_BASED_YEAR);
                LocalDate from = LocalDate.from(temporal);
                int i = from.get(ChronoField.DAY_OF_WEEK);
                int week = Field.getWeek(from);
                if (week == 53 && Field.getWeekRange(checkValidIntValue) == 52) {
                    week = 52;
                }
                return temporal.with(LocalDate.of(checkValidIntValue, 1, 4).plusDays((i - r6.get(r0)) + ((week - 1) * 7)));
            }
        }

        @Override // j$.time.temporal.TemporalField
        public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
            return range();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ValueRange getWeekRange(LocalDate localDate) {
            return ValueRange.of(1L, getWeekRange(getWeekBasedYear(localDate)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i) {
            LocalDate of = LocalDate.of(i, 1, 1);
            if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
                return (of.getDayOfWeek() == DayOfWeek.WEDNESDAY && of.isLeapYear()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(LocalDate localDate) {
            int ordinal = localDate.getDayOfWeek().ordinal();
            int dayOfYear = localDate.getDayOfYear() - 1;
            int i = (3 - ordinal) + dayOfYear;
            int i2 = (i - ((i / 7) * 7)) - 3;
            if (i2 < -3) {
                i2 += 7;
            }
            if (dayOfYear < i2) {
                return (int) getWeekRange(localDate.withDayOfYear(180).minusYears(1L)).getMaximum();
            }
            int i3 = ((dayOfYear - i2) / 7) + 1;
            if (i3 == 53) {
                if (!(i2 == -3 || (i2 == -2 && localDate.isLeapYear()))) {
                    return 1;
                }
            }
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(LocalDate localDate) {
            int year = localDate.getYear();
            int dayOfYear = localDate.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
            }
            if (dayOfYear >= 363) {
                return ((dayOfYear - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
            }
            return year;
        }
    }

    /* loaded from: classes5.dex */
    enum Unit implements TemporalUnit {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

        private final Duration duration;
        private final String name;

        @Override // j$.time.temporal.TemporalUnit
        public boolean isDateBased() {
            return true;
        }

        @Override // j$.time.temporal.TemporalUnit
        public boolean isDurationEstimated() {
            return true;
        }

        @Override // j$.time.temporal.TemporalUnit
        public boolean isTimeBased() {
            return false;
        }

        Unit(String str, Duration duration) {
            this.name = str;
            this.duration = duration;
        }

        @Override // j$.time.temporal.TemporalUnit
        public Duration getDuration() {
            return this.duration;
        }

        @Override // j$.time.temporal.TemporalUnit
        public Temporal addTo(Temporal temporal, long j) {
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$IsoFields$Unit[ordinal()];
            if (i == 1) {
                return temporal.with(IsoFields.WEEK_BASED_YEAR, Clock$OffsetClock$$ExternalSyntheticBackport0.m(temporal.get(r0), j));
            }
            if (i == 2) {
                return temporal.plus(j / 4, ChronoUnit.YEARS).plus((j % 4) * 3, ChronoUnit.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // j$.time.temporal.TemporalUnit
        public long between(Temporal temporal, Temporal temporal2) {
            if (temporal.getClass() != temporal2.getClass()) {
                return temporal.until(temporal2, this);
            }
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$IsoFields$Unit[ordinal()];
            if (i == 1) {
                TemporalField temporalField = IsoFields.WEEK_BASED_YEAR;
                return Instant$$ExternalSyntheticBackport8.m(temporal2.getLong(temporalField), temporal.getLong(temporalField));
            }
            if (i == 2) {
                return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    /* renamed from: j$.time.temporal.IsoFields$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$IsoFields$Unit;

        static {
            int[] iArr = new int[Unit.values().length];
            $SwitchMap$java$time$temporal$IsoFields$Unit = iArr;
            try {
                iArr[Unit.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$IsoFields$Unit[Unit.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static boolean isIso(TemporalAccessor temporalAccessor) {
        return Chronology.CC.from(temporalAccessor).equals(IsoChronology.INSTANCE);
    }
}
