package j$.time.chrono;

import j$.lang.DesugarMath$$ExternalSyntheticBackport3;
import j$.time.Clock$OffsetClock$$ExternalSyntheticBackport0;
import j$.time.LocalTime;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class ChronoLocalDateImpl implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // j$.time.temporal.TemporalAdjuster
    public /* synthetic */ Temporal adjustInto(Temporal temporal) {
        Temporal with;
        with = temporal.with(ChronoField.EPOCH_DAY, toEpochDay());
        return with;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ ChronoLocalDateTime atTime(LocalTime localTime) {
        ChronoLocalDateTime of;
        of = ChronoLocalDateTimeImpl.of(this, localTime);
        return of;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return ChronoLocalDate.CC.$default$compareTo((ChronoLocalDate) this, chronoLocalDate);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((ChronoLocalDate) obj);
        return compareTo;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int get(TemporalField temporalField) {
        return TemporalAccessor.CC.$default$get(this, temporalField);
    }

    public abstract /* synthetic */ Era getEra();

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean isSupported(TemporalField temporalField) {
        return ChronoLocalDate.CC.$default$isSupported(this, temporalField);
    }

    abstract ChronoLocalDate plusDays(long j);

    abstract ChronoLocalDate plusMonths(long j);

    abstract ChronoLocalDate plusYears(long j);

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ Object query(TemporalQuery temporalQuery) {
        return ChronoLocalDate.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public abstract /* synthetic */ long toEpochDay();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDate ensureValid(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        String id = chronology.getId();
        String id2 = chronoLocalDate.getChronology().getId();
        StringBuilder sb = new StringBuilder(String.valueOf(id).length() + 41 + String.valueOf(id2).length());
        sb.append("Chronology mismatch, expected: ");
        sb.append(id);
        sb.append(", actual: ");
        sb.append(id2);
        throw new ClassCastException(sb.toString());
    }

    @Override // j$.time.temporal.Temporal
    public ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return ChronoLocalDate.CC.$default$with(this, temporalAdjuster);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate with(TemporalField temporalField, long j) {
        return ChronoLocalDate.CC.$default$with(this, temporalField, j);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        long m;
        long m2;
        long m3;
        long m4;
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    m = DesugarMath$$ExternalSyntheticBackport3.m(j, 7);
                    return plusDays(m);
                case 3:
                    return plusMonths(j);
                case 4:
                    return plusYears(j);
                case 5:
                    m2 = DesugarMath$$ExternalSyntheticBackport3.m(j, 10);
                    return plusYears(m2);
                case 6:
                    m3 = DesugarMath$$ExternalSyntheticBackport3.m(j, 100);
                    return plusYears(m3);
                case 7:
                    m4 = DesugarMath$$ExternalSyntheticBackport3.m(j, 1000);
                    return plusYears(m4);
                case 8:
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
        return ChronoLocalDate.CC.$default$plus(this, j, temporalUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoLocalDateImpl$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate minus(long j, TemporalUnit temporalUnit) {
        ChronoLocalDate ensureValid;
        ensureValid = ensureValid(getChronology(), Temporal.CC.$default$minus(this, j, temporalUnit));
        return ensureValid;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate date = getChronology().date(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return daysUntil(date);
                case 2:
                    return daysUntil(date) / 7;
                case 3:
                    return monthsUntil(date);
                case 4:
                    return monthsUntil(date) / 12;
                case 5:
                    return monthsUntil(date) / 120;
                case 6:
                    return monthsUntil(date) / 1200;
                case 7:
                    return monthsUntil(date) / 12000;
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return date.getLong(chronoField) - getLong(chronoField);
                default:
                    String valueOf = String.valueOf(temporalUnit);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Unsupported unit: ");
                    sb.append(valueOf);
                    throw new UnsupportedTemporalTypeException(sb.toString());
            }
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, date);
    }

    private long daysUntil(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate.toEpochDay() - toEpochDay();
    }

    private long monthsUntil(ChronoLocalDate chronoLocalDate) {
        if (getChronology().range(ChronoField.MONTH_OF_YEAR).getMaximum() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j = getLong(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.getLong(chronoField) * 32) + chronoLocalDate.get(chronoField2)) - (j + get(chronoField2))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long j = getLong(ChronoField.YEAR_OF_ERA);
        long j2 = getLong(ChronoField.MONTH_OF_YEAR);
        long j3 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 >= 10 ? "-" : "-0");
        sb.append(j3);
        return sb.toString();
    }
}
