package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.IsoChronology;
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
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    public static final OffsetDateTime MIN = LocalDateTime.MIN.atOffset(ZoneOffset.MAX);
    public static final OffsetDateTime MAX = LocalDateTime.MAX.atOffset(ZoneOffset.MIN);

    private static int compareInstant(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        if (offsetDateTime.getOffset().equals(offsetDateTime2.getOffset())) {
            return offsetDateTime.toLocalDateTime().compareTo((ChronoLocalDateTime) offsetDateTime2.toLocalDateTime());
        }
        int i = (offsetDateTime.toEpochSecond() > offsetDateTime2.toEpochSecond() ? 1 : (offsetDateTime.toEpochSecond() == offsetDateTime2.toEpochSecond() ? 0 : -1));
        return i == 0 ? offsetDateTime.toLocalTime().getNano() - offsetDateTime2.toLocalTime().getNano() : i;
    }

    public static OffsetDateTime of(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.of(localDate, localTime), zoneOffset);
    }

    public static OffsetDateTime of(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    public static OffsetDateTime from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset from = ZoneOffset.from(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.query(TemporalQueries.localDate());
            LocalTime localTime = (LocalTime) temporalAccessor.query(TemporalQueries.localTime());
            if (localDate != null && localTime != null) {
                return of(localDate, localTime, from);
            }
            return ofInstant(Instant.from(temporalAccessor), from);
        } catch (DateTimeException e) {
            String valueOf = String.valueOf(temporalAccessor);
            String name = temporalAccessor.getClass().getName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 64 + name.length());
            sb.append("Unable to obtain OffsetDateTime from TemporalAccessor: ");
            sb.append(valueOf);
            sb.append(" of type ");
            sb.append(name);
            throw new DateTimeException(sb.toString(), e);
        }
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.dateTime = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.offset = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private OffsetDateTime with(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.dateTime == localDateTime && this.offset.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return (temporalField instanceof ChronoField) || (temporalField != null && temporalField.isSupportedBy(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return this.dateTime.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.OffsetDateTime$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.dateTime.get(temporalField);
        }
        return TemporalAccessor.CC.$default$get(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.dateTime.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public ZoneOffset getOffset() {
        return this.offset;
    }

    public OffsetDateTime withOffsetSameInstant(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.offset)) {
            return this;
        }
        return new OffsetDateTime(this.dateTime.plusSeconds(zoneOffset.getTotalSeconds() - this.offset.getTotalSeconds()), zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.dateTime;
    }

    public LocalDate toLocalDate() {
        return this.dateTime.toLocalDate();
    }

    public LocalTime toLocalTime() {
        return this.dateTime.toLocalTime();
    }

    public int getNano() {
        return this.dateTime.getNano();
    }

    @Override // j$.time.temporal.Temporal
    public OffsetDateTime with(TemporalAdjuster temporalAdjuster) {
        if ((temporalAdjuster instanceof LocalDate) || (temporalAdjuster instanceof LocalTime) || (temporalAdjuster instanceof LocalDateTime)) {
            return with(this.dateTime.with(temporalAdjuster), this.offset);
        }
        if (temporalAdjuster instanceof Instant) {
            return ofInstant((Instant) temporalAdjuster, this.offset);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            return with(this.dateTime, (ZoneOffset) temporalAdjuster);
        }
        if (temporalAdjuster instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAdjuster;
        }
        return (OffsetDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // j$.time.temporal.Temporal
    public OffsetDateTime with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i == 1) {
                return ofInstant(Instant.ofEpochSecond(j, getNano()), this.offset);
            }
            if (i == 2) {
                return with(this.dateTime, ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j)));
            }
            return with(this.dateTime.with(temporalField, j), this.offset);
        }
        return (OffsetDateTime) temporalField.adjustInto(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public OffsetDateTime plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return with(this.dateTime.plus(j, temporalUnit), this.offset);
        }
        return (OffsetDateTime) temporalUnit.addTo(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public OffsetDateTime minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.zone()) {
            return getOffset();
        }
        if (temporalQuery == TemporalQueries.zoneId()) {
            return null;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            return toLocalDate();
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return toLocalTime();
        }
        if (temporalQuery == TemporalQueries.chronology()) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay()).with(ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime from = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.dateTime.until(from.withOffsetSameInstant(this.offset).dateTime, temporalUnit);
        }
        return temporalUnit.between(this, from);
    }

    public long toEpochSecond() {
        return this.dateTime.toEpochSecond(this.offset);
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetDateTime offsetDateTime) {
        int compareInstant = compareInstant(this, offsetDateTime);
        return compareInstant == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime) offsetDateTime.toLocalDateTime()) : compareInstant;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.dateTime.equals(offsetDateTime.dateTime) && this.offset.equals(offsetDateTime.offset);
    }

    public int hashCode() {
        return this.dateTime.hashCode() ^ this.offset.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.dateTime.toString());
        String valueOf2 = String.valueOf(this.offset.toString());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private Object writeReplace() {
        return new Ser((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        this.dateTime.writeExternal(objectOutput);
        this.offset.writeExternal(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime readExternal(ObjectInput objectInput) {
        return of(LocalDateTime.readExternal(objectInput), ZoneOffset.readExternal(objectInput));
    }
}
