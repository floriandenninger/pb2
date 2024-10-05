package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;

/* loaded from: classes5.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable {
    ChronoLocalDateTime atTime(LocalTime localTime);

    int compareTo(ChronoLocalDate chronoLocalDate);

    Chronology getChronology();

    int hashCode();

    @Override // j$.time.temporal.TemporalAccessor
    boolean isSupported(TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate minus(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate plus(long j, TemporalUnit temporalUnit);

    long toEpochDay();

    String toString();

    @Override // j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDate with(TemporalField temporalField, long j);

    /* renamed from: j$.time.chrono.ChronoLocalDate$-CC */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static boolean $default$isSupported(ChronoLocalDate chronoLocalDate, TemporalField temporalField) {
            if (temporalField instanceof ChronoField) {
                return temporalField.isDateBased();
            }
            return temporalField != null && temporalField.isSupportedBy(chronoLocalDate);
        }

        public static ChronoLocalDate $default$with(ChronoLocalDate chronoLocalDate, TemporalAdjuster temporalAdjuster) {
            Temporal adjustInto;
            Chronology chronology = chronoLocalDate.getChronology();
            adjustInto = temporalAdjuster.adjustInto(chronoLocalDate);
            return ChronoLocalDateImpl.ensureValid(chronology, adjustInto);
        }

        public static ChronoLocalDate $default$with(ChronoLocalDate chronoLocalDate, TemporalField temporalField, long j) {
            if (temporalField instanceof ChronoField) {
                String valueOf = String.valueOf(temporalField);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Unsupported field: ");
                sb.append(valueOf);
                throw new UnsupportedTemporalTypeException(sb.toString());
            }
            return ChronoLocalDateImpl.ensureValid(chronoLocalDate.getChronology(), temporalField.adjustInto(chronoLocalDate, j));
        }

        public static ChronoLocalDate $default$plus(ChronoLocalDate chronoLocalDate, long j, TemporalUnit temporalUnit) {
            if (temporalUnit instanceof ChronoUnit) {
                String valueOf = String.valueOf(temporalUnit);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unsupported unit: ");
                sb.append(valueOf);
                throw new UnsupportedTemporalTypeException(sb.toString());
            }
            return ChronoLocalDateImpl.ensureValid(chronoLocalDate.getChronology(), temporalUnit.addTo(chronoLocalDate, j));
        }

        public static Object $default$query(ChronoLocalDate chronoLocalDate, TemporalQuery temporalQuery) {
            if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.localTime()) {
                return null;
            }
            if (temporalQuery == TemporalQueries.chronology()) {
                return chronoLocalDate.getChronology();
            }
            if (temporalQuery == TemporalQueries.precision()) {
                return ChronoUnit.DAYS;
            }
            return temporalQuery.queryFrom(chronoLocalDate);
        }

        public static Temporal $default$adjustInto(ChronoLocalDate chronoLocalDate, Temporal temporal) {
            return temporal.with(ChronoField.EPOCH_DAY, chronoLocalDate.toEpochDay());
        }

        public static int $default$compareTo(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
            int i = (chronoLocalDate.toEpochDay() > chronoLocalDate2.toEpochDay() ? 1 : (chronoLocalDate.toEpochDay() == chronoLocalDate2.toEpochDay() ? 0 : -1));
            return i == 0 ? chronoLocalDate.getChronology().compareTo(chronoLocalDate2.getChronology()) : i;
        }

        public static boolean $default$isAfter(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
            return chronoLocalDate.toEpochDay() > chronoLocalDate2.toEpochDay();
        }

        public static boolean $default$isBefore(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
            return chronoLocalDate.toEpochDay() < chronoLocalDate2.toEpochDay();
        }
    }
}
