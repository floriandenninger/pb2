package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneId$$ExternalSyntheticBackport0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.ValueRange;
import j$.util.Objects;

/* loaded from: classes5.dex */
public interface Chronology extends Comparable {
    int compareTo(Chronology chronology);

    ChronoLocalDate date(TemporalAccessor temporalAccessor);

    boolean equals(Object obj);

    String getCalendarType();

    String getId();

    int hashCode();

    ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor);

    ValueRange range(ChronoField chronoField);

    String toString();

    ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId);

    ChronoZonedDateTime zonedDateTime(TemporalAccessor temporalAccessor);

    /* renamed from: j$.time.chrono.Chronology$-CC */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static Chronology from(TemporalAccessor temporalAccessor) {
            Objects.requireNonNull(temporalAccessor, "temporal");
            return (Chronology) ZoneId$$ExternalSyntheticBackport0.m((Chronology) temporalAccessor.query(TemporalQueries.chronology()), IsoChronology.INSTANCE);
        }

        public static Chronology of(String str) {
            return AbstractChronology.of(str);
        }

        public static ChronoLocalDateTime $default$localDateTime(Chronology chronology, TemporalAccessor temporalAccessor) {
            try {
                return chronology.date(temporalAccessor).atTime(LocalTime.from(temporalAccessor));
            } catch (DateTimeException e) {
                String valueOf = String.valueOf(temporalAccessor.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 60);
                sb.append("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
                sb.append(valueOf);
                throw new DateTimeException(sb.toString(), e);
            }
        }

        public static ChronoZonedDateTime $default$zonedDateTime(Chronology chronology, TemporalAccessor temporalAccessor) {
            try {
                ZoneId from = ZoneId.from(temporalAccessor);
                try {
                    return chronology.zonedDateTime(Instant.from(temporalAccessor), from);
                } catch (DateTimeException unused) {
                    return ChronoZonedDateTimeImpl.ofBest(ChronoLocalDateTimeImpl.ensureValid(chronology, chronology.localDateTime(temporalAccessor)), from, null);
                }
            } catch (DateTimeException e) {
                String valueOf = String.valueOf(temporalAccessor.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 60);
                sb.append("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ");
                sb.append(valueOf);
                throw new DateTimeException(sb.toString(), e);
            }
        }

        public static ChronoZonedDateTime $default$zonedDateTime(Chronology chronology, Instant instant, ZoneId zoneId) {
            return ChronoZonedDateTimeImpl.ofInstant(chronology, instant, zoneId);
        }
    }
}
