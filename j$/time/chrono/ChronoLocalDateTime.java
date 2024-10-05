package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;

/* loaded from: classes5.dex */
public interface ChronoLocalDateTime extends Temporal, TemporalAdjuster, Comparable {
    ChronoZonedDateTime atZone(ZoneId zoneId);

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    Chronology getChronology();

    int hashCode();

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime minus(long j, TemporalUnit temporalUnit);

    long toEpochSecond(ZoneOffset zoneOffset);

    ChronoLocalDate toLocalDate();

    LocalTime toLocalTime();

    String toString();

    /* renamed from: j$.time.chrono.ChronoLocalDateTime$-CC */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static Chronology $default$getChronology(ChronoLocalDateTime chronoLocalDateTime) {
            return chronoLocalDateTime.toLocalDate().getChronology();
        }

        public static Object $default$query(ChronoLocalDateTime chronoLocalDateTime, TemporalQuery temporalQuery) {
            if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset()) {
                return null;
            }
            if (temporalQuery == TemporalQueries.localTime()) {
                return chronoLocalDateTime.toLocalTime();
            }
            if (temporalQuery == TemporalQueries.chronology()) {
                return chronoLocalDateTime.getChronology();
            }
            if (temporalQuery == TemporalQueries.precision()) {
                return ChronoUnit.NANOS;
            }
            return temporalQuery.queryFrom(chronoLocalDateTime);
        }

        public static Temporal $default$adjustInto(ChronoLocalDateTime chronoLocalDateTime, Temporal temporal) {
            return temporal.with(ChronoField.EPOCH_DAY, chronoLocalDateTime.toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, chronoLocalDateTime.toLocalTime().toNanoOfDay());
        }

        public static long $default$toEpochSecond(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
            Objects.requireNonNull(zoneOffset, "offset");
            return ((chronoLocalDateTime.toLocalDate().toEpochDay() * 86400) + chronoLocalDateTime.toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
        }

        public static int $default$compareTo(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
            int compareTo = chronoLocalDateTime.toLocalDate().compareTo(chronoLocalDateTime2.toLocalDate());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = chronoLocalDateTime.toLocalTime().compareTo(chronoLocalDateTime2.toLocalTime());
            return compareTo2 == 0 ? chronoLocalDateTime.getChronology().compareTo(chronoLocalDateTime2.getChronology()) : compareTo2;
        }

        public static boolean $default$isAfter(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
            long epochDay = chronoLocalDateTime.toLocalDate().toEpochDay();
            long epochDay2 = chronoLocalDateTime2.toLocalDate().toEpochDay();
            return epochDay > epochDay2 || (epochDay == epochDay2 && chronoLocalDateTime.toLocalTime().toNanoOfDay() > chronoLocalDateTime2.toLocalTime().toNanoOfDay());
        }

        public static boolean $default$isBefore(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
            long epochDay = chronoLocalDateTime.toLocalDate().toEpochDay();
            long epochDay2 = chronoLocalDateTime2.toLocalDate().toEpochDay();
            return epochDay < epochDay2 || (epochDay == epochDay2 && chronoLocalDateTime.toLocalTime().toNanoOfDay() < chronoLocalDateTime2.toLocalTime().toNanoOfDay());
        }
    }
}
