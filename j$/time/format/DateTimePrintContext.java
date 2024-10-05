package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneId$$ExternalSyntheticBackport0;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class DateTimePrintContext {
    private DateTimeFormatter formatter;
    private int optional;
    private TemporalAccessor temporal;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimePrintContext(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        this.temporal = adjust(temporalAccessor, dateTimeFormatter);
        this.formatter = dateTimeFormatter;
    }

    private static TemporalAccessor adjust(final TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.getChronology();
        ZoneId zone = dateTimeFormatter.getZone();
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        Chronology chronology2 = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        final ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
        final ChronoLocalDate chronoLocalDate = null;
        if (Objects.equals(chronology, chronology2)) {
            chronology = null;
        }
        if (Objects.equals(zone, zoneId)) {
            zone = null;
        }
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        final Chronology chronology3 = chronology != null ? chronology : chronology2;
        if (zone != null) {
            if (temporalAccessor.isSupported(ChronoField.INSTANT_SECONDS)) {
                return ((Chronology) ZoneId$$ExternalSyntheticBackport0.m(chronology3, IsoChronology.INSTANCE)).zonedDateTime(Instant.from(temporalAccessor), zone);
            }
            if (zone.normalized() instanceof ZoneOffset) {
                ChronoField chronoField = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.isSupported(chronoField) && temporalAccessor.get(chronoField) != zone.getRules().getOffset(Instant.EPOCH).getTotalSeconds()) {
                    String valueOf = String.valueOf(zone);
                    String valueOf2 = String.valueOf(temporalAccessor);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 135 + valueOf2.length());
                    sb.append("Unable to apply override zone '");
                    sb.append(valueOf);
                    sb.append("' because the temporal object being formatted has a different offset but does not represent an instant: ");
                    sb.append(valueOf2);
                    throw new DateTimeException(sb.toString());
                }
            }
        }
        if (zone != null) {
            zoneId = zone;
        }
        if (chronology != null) {
            if (temporalAccessor.isSupported(ChronoField.EPOCH_DAY)) {
                chronoLocalDate = chronology3.date(temporalAccessor);
            } else if (chronology != IsoChronology.INSTANCE || chronology2 != null) {
                for (ChronoField chronoField2 : ChronoField.values()) {
                    if (chronoField2.isDateBased() && temporalAccessor.isSupported(chronoField2)) {
                        String valueOf3 = String.valueOf(chronology);
                        String valueOf4 = String.valueOf(temporalAccessor);
                        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 141 + valueOf4.length());
                        sb2.append("Unable to apply override chronology '");
                        sb2.append(valueOf3);
                        sb2.append("' because the temporal object being formatted contains date fields but does not represent a whole date: ");
                        sb2.append(valueOf4);
                        throw new DateTimeException(sb2.toString());
                    }
                }
            }
        }
        return new TemporalAccessor() { // from class: j$.time.format.DateTimePrintContext.1
            @Override // j$.time.temporal.TemporalAccessor
            public /* synthetic */ int get(TemporalField temporalField) {
                return TemporalAccessor.CC.$default$get(this, temporalField);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public boolean isSupported(TemporalField temporalField) {
                if (ChronoLocalDate.this != null && temporalField.isDateBased()) {
                    return ChronoLocalDate.this.isSupported(temporalField);
                }
                return temporalAccessor.isSupported(temporalField);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public ValueRange range(TemporalField temporalField) {
                if (ChronoLocalDate.this != null && temporalField.isDateBased()) {
                    return ChronoLocalDate.this.range(temporalField);
                }
                return temporalAccessor.range(temporalField);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public long getLong(TemporalField temporalField) {
                if (ChronoLocalDate.this != null && temporalField.isDateBased()) {
                    return ChronoLocalDate.this.getLong(temporalField);
                }
                return temporalAccessor.getLong(temporalField);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public Object query(TemporalQuery temporalQuery) {
                if (temporalQuery == TemporalQueries.chronology()) {
                    return chronology3;
                }
                if (temporalQuery == TemporalQueries.zoneId()) {
                    return zoneId;
                }
                if (temporalQuery == TemporalQueries.precision()) {
                    return temporalAccessor.query(temporalQuery);
                }
                return temporalQuery.queryFrom(this);
            }

            public String toString() {
                String str;
                String valueOf5 = String.valueOf(temporalAccessor);
                Chronology chronology4 = chronology3;
                String str2 = "";
                if (chronology4 != null) {
                    String valueOf6 = String.valueOf(chronology4);
                    StringBuilder sb3 = new StringBuilder(valueOf6.length() + 17);
                    sb3.append(" with chronology ");
                    sb3.append(valueOf6);
                    str = sb3.toString();
                } else {
                    str = "";
                }
                ZoneId zoneId2 = zoneId;
                if (zoneId2 != null) {
                    String valueOf7 = String.valueOf(zoneId2);
                    StringBuilder sb4 = new StringBuilder(valueOf7.length() + 11);
                    sb4.append(" with zone ");
                    sb4.append(valueOf7);
                    str2 = sb4.toString();
                }
                StringBuilder sb5 = new StringBuilder(valueOf5.length() + String.valueOf(str).length() + String.valueOf(str2).length());
                sb5.append(valueOf5);
                sb5.append(str);
                sb5.append(str2);
                return sb5.toString();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TemporalAccessor getTemporal() {
        return this.temporal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale getLocale() {
        return this.formatter.getLocale();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecimalStyle getDecimalStyle() {
        return this.formatter.getDecimalStyle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startOptional() {
        this.optional++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void endOptional() {
        this.optional--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object getValue(TemporalQuery temporalQuery) {
        Object query = this.temporal.query(temporalQuery);
        if (query != null || this.optional != 0) {
            return query;
        }
        String valueOf = String.valueOf(temporalQuery);
        String valueOf2 = String.valueOf(this.temporal);
        StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
        sb.append("Unable to extract ");
        sb.append(valueOf);
        sb.append(" from temporal ");
        sb.append(valueOf2);
        throw new DateTimeException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long getValue(TemporalField temporalField) {
        if (this.optional <= 0 || this.temporal.isSupported(temporalField)) {
            return Long.valueOf(this.temporal.getLong(temporalField));
        }
        return null;
    }

    public String toString() {
        return this.temporal.toString();
    }
}
