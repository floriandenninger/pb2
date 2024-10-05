package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* loaded from: classes5.dex */
public interface TemporalAccessor {
    int get(TemporalField temporalField);

    long getLong(TemporalField temporalField);

    boolean isSupported(TemporalField temporalField);

    Object query(TemporalQuery temporalQuery);

    ValueRange range(TemporalField temporalField);

    /* renamed from: j$.time.temporal.TemporalAccessor$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static ValueRange $default$range(TemporalAccessor temporalAccessor, TemporalField temporalField) {
            if (temporalField instanceof ChronoField) {
                if (temporalAccessor.isSupported(temporalField)) {
                    return temporalField.range();
                }
                String valueOf = String.valueOf(temporalField);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Unsupported field: ");
                sb.append(valueOf);
                throw new UnsupportedTemporalTypeException(sb.toString());
            }
            Objects.requireNonNull(temporalField, "field");
            return temporalField.rangeRefinedBy(temporalAccessor);
        }

        public static int $default$get(TemporalAccessor temporalAccessor, TemporalField temporalField) {
            ValueRange range = temporalAccessor.range(temporalField);
            if (!range.isIntValue()) {
                String valueOf = String.valueOf(temporalField);
                StringBuilder sb = new StringBuilder(valueOf.length() + 54);
                sb.append("Invalid field ");
                sb.append(valueOf);
                sb.append(" for get() method, use getLong() instead");
                throw new UnsupportedTemporalTypeException(sb.toString());
            }
            long j = temporalAccessor.getLong(temporalField);
            if (range.isValidValue(j)) {
                return (int) j;
            }
            String valueOf2 = String.valueOf(temporalField);
            String valueOf3 = String.valueOf(range);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 56 + valueOf3.length());
            sb2.append("Invalid value for ");
            sb2.append(valueOf2);
            sb2.append(" (valid values ");
            sb2.append(valueOf3);
            sb2.append("): ");
            sb2.append(j);
            throw new DateTimeException(sb2.toString());
        }

        public static Object $default$query(TemporalAccessor temporalAccessor, TemporalQuery temporalQuery) {
            if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.precision()) {
                return null;
            }
            return temporalQuery.queryFrom(temporalAccessor);
        }
    }
}
