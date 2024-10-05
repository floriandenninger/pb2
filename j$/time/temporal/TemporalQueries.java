package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;

/* loaded from: classes5.dex */
public abstract class TemporalQueries {
    static final TemporalQuery ZONE_ID = new TemporalQuery() { // from class: j$.time.temporal.TemporalQueries.1
        public String toString() {
            return "ZoneId";
        }

        @Override // j$.time.temporal.TemporalQuery
        public ZoneId queryFrom(TemporalAccessor temporalAccessor) {
            return (ZoneId) temporalAccessor.query(TemporalQueries.ZONE_ID);
        }
    };
    static final TemporalQuery CHRONO = new TemporalQuery() { // from class: j$.time.temporal.TemporalQueries.2
        public String toString() {
            return "Chronology";
        }

        @Override // j$.time.temporal.TemporalQuery
        public Chronology queryFrom(TemporalAccessor temporalAccessor) {
            return (Chronology) temporalAccessor.query(TemporalQueries.CHRONO);
        }
    };
    static final TemporalQuery PRECISION = new TemporalQuery() { // from class: j$.time.temporal.TemporalQueries.3
        public String toString() {
            return "Precision";
        }

        @Override // j$.time.temporal.TemporalQuery
        public TemporalUnit queryFrom(TemporalAccessor temporalAccessor) {
            return (TemporalUnit) temporalAccessor.query(TemporalQueries.PRECISION);
        }
    };
    static final TemporalQuery OFFSET = new TemporalQuery() { // from class: j$.time.temporal.TemporalQueries.4
        public String toString() {
            return "ZoneOffset";
        }

        @Override // j$.time.temporal.TemporalQuery
        public ZoneOffset queryFrom(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            if (temporalAccessor.isSupported(chronoField)) {
                return ZoneOffset.ofTotalSeconds(temporalAccessor.get(chronoField));
            }
            return null;
        }
    };
    static final TemporalQuery ZONE = new TemporalQuery() { // from class: j$.time.temporal.TemporalQueries.5
        public String toString() {
            return "Zone";
        }

        @Override // j$.time.temporal.TemporalQuery
        public ZoneId queryFrom(TemporalAccessor temporalAccessor) {
            ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.ZONE_ID);
            return zoneId != null ? zoneId : (ZoneId) temporalAccessor.query(TemporalQueries.OFFSET);
        }
    };
    static final TemporalQuery LOCAL_DATE = new TemporalQuery() { // from class: j$.time.temporal.TemporalQueries.6
        public String toString() {
            return "LocalDate";
        }

        @Override // j$.time.temporal.TemporalQuery
        public LocalDate queryFrom(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.EPOCH_DAY;
            if (temporalAccessor.isSupported(chronoField)) {
                return LocalDate.ofEpochDay(temporalAccessor.getLong(chronoField));
            }
            return null;
        }
    };
    static final TemporalQuery LOCAL_TIME = new TemporalQuery() { // from class: j$.time.temporal.TemporalQueries.7
        public String toString() {
            return "LocalTime";
        }

        @Override // j$.time.temporal.TemporalQuery
        public LocalTime queryFrom(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.NANO_OF_DAY;
            if (temporalAccessor.isSupported(chronoField)) {
                return LocalTime.ofNanoOfDay(temporalAccessor.getLong(chronoField));
            }
            return null;
        }
    };

    public static TemporalQuery zoneId() {
        return ZONE_ID;
    }

    public static TemporalQuery chronology() {
        return CHRONO;
    }

    public static TemporalQuery precision() {
        return PRECISION;
    }

    public static TemporalQuery zone() {
        return ZONE;
    }

    public static TemporalQuery offset() {
        return OFFSET;
    }

    public static TemporalQuery localDate() {
        return LOCAL_DATE;
    }

    public static TemporalQuery localTime() {
        return LOCAL_TIME;
    }
}
