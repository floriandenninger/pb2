package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, TemporalAdjuster, Comparable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final transient String id;
    private final int totalSeconds;
    private static final ConcurrentMap SECONDS_CACHE = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap ID_CACHE = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);
    public static final ZoneOffset MIN = ofTotalSeconds(-64800);
    public static final ZoneOffset MAX = ofTotalSeconds(64800);

    private static int totalSeconds(int i, int i2, int i3) {
        return (i * 3600) + (i2 * 60) + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset of(java.lang.String r8) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r8, r0)
            java.util.concurrent.ConcurrentMap r0 = j$.time.ZoneOffset.ID_CACHE
            java.lang.Object r0 = r0.get(r8)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r8.length()
            r1 = 2
            r2 = 3
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L71
            if (r0 == r2) goto L8d
            r1 = 5
            if (r0 == r1) goto L68
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L5f
            r5 = 7
            if (r0 == r5) goto L4f
            r1 = 9
            if (r0 == r1) goto L42
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            int r2 = r8.length()
            if (r2 == 0) goto L39
            java.lang.String r8 = r1.concat(r8)
            goto L3e
        L39:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1)
        L3e:
            r0.<init>(r8)
            throw r0
        L42:
            int r0 = parseNumber(r8, r3, r4)
            int r1 = parseNumber(r8, r6, r3)
            int r2 = parseNumber(r8, r5, r3)
            goto L93
        L4f:
            int r0 = parseNumber(r8, r3, r4)
            int r2 = parseNumber(r8, r2, r4)
            int r1 = parseNumber(r8, r1, r4)
            r7 = r2
            r2 = r1
            r1 = r7
            goto L93
        L5f:
            int r0 = parseNumber(r8, r3, r4)
            int r1 = parseNumber(r8, r6, r3)
            goto L92
        L68:
            int r0 = parseNumber(r8, r3, r4)
            int r1 = parseNumber(r8, r2, r4)
            goto L92
        L71:
            char r0 = r8.charAt(r4)
            char r8 = r8.charAt(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        L8d:
            int r0 = parseNumber(r8, r3, r4)
            r1 = 0
        L92:
            r2 = 0
        L93:
            char r3 = r8.charAt(r4)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto Lb7
            if (r3 == r5) goto Lb7
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            int r2 = r8.length()
            if (r2 == 0) goto Lae
            java.lang.String r8 = r1.concat(r8)
            goto Lb3
        Lae:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1)
        Lb3:
            r0.<init>(r8)
            throw r0
        Lb7:
            if (r3 != r5) goto Lc1
            int r8 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r8 = ofHoursMinutesSeconds(r8, r0, r1)
            return r8
        Lc1:
            j$.time.ZoneOffset r8 = ofHoursMinutesSeconds(r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.of(java.lang.String):j$.time.ZoneOffset");
    }

    private static int parseNumber(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            String valueOf = String.valueOf(charSequence);
            StringBuilder sb = new StringBuilder(valueOf.length() + 58);
            sb.append("Invalid ID for ZoneOffset, colon not found when expected: ");
            sb.append(valueOf);
            throw new DateTimeException(sb.toString());
        }
        char charAt = charSequence.charAt(i);
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return ((charAt - '0') * 10) + (charAt2 - '0');
        }
        String valueOf2 = String.valueOf(charSequence);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 57);
        sb2.append("Invalid ID for ZoneOffset, non numeric characters found: ");
        sb2.append(valueOf2);
        throw new DateTimeException(sb2.toString());
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i, int i2, int i3) {
        validate(i, i2, i3);
        return ofTotalSeconds(totalSeconds(i, i2, i3));
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.query(TemporalQueries.offset());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        String valueOf = String.valueOf(temporalAccessor);
        String name = temporalAccessor.getClass().getName();
        StringBuilder sb = new StringBuilder(valueOf.length() + 60 + name.length());
        sb.append("Unable to obtain ZoneOffset from TemporalAccessor: ");
        sb.append(valueOf);
        sb.append(" of type ");
        sb.append(name);
        throw new DateTimeException(sb.toString());
    }

    private static void validate(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            StringBuilder sb = new StringBuilder(85);
            sb.append("Zone offset hours not in valid range: value ");
            sb.append(i);
            sb.append(" is not in the range -18 to 18");
            throw new DateTimeException(sb.toString());
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            StringBuilder sb2 = new StringBuilder(87);
            sb2.append("Zone offset minutes not in valid range: value ");
            sb2.append(i2);
            sb2.append(" is not in the range -59 to 59");
            throw new DateTimeException(sb2.toString());
        }
        if (i3 < -59 || i3 > 59) {
            StringBuilder sb3 = new StringBuilder(87);
            sb3.append("Zone offset seconds not in valid range: value ");
            sb3.append(i3);
            sb3.append(" is not in the range -59 to 59");
            throw new DateTimeException(sb3.toString());
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset ofTotalSeconds(int i) {
        if (i < -64800 || i > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = SECONDS_CACHE;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(valueOf);
            ID_CACHE.putIfAbsent(zoneOffset2.getId(), zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i);
    }

    private ZoneOffset(int i) {
        this.totalSeconds = i;
        this.id = buildId(i);
    }

    private static String buildId(int i) {
        if (i == 0) {
            return "Z";
        }
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder();
        int i2 = abs / 3600;
        int i3 = (abs / 60) % 60;
        sb.append(i < 0 ? "-" : "+");
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        sb.append(i3 < 10 ? ":0" : ":");
        sb.append(i3);
        int i4 = abs % 60;
        if (i4 != 0) {
            sb.append(i4 >= 10 ? ":" : ":0");
            sb.append(i4);
        }
        return sb.toString();
    }

    public int getTotalSeconds() {
        return this.totalSeconds;
    }

    @Override // j$.time.ZoneId
    public String getId() {
        return this.id;
    }

    @Override // j$.time.ZoneId
    public ZoneRules getRules() {
        return ZoneRules.of(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.totalSeconds;
        }
        if (temporalField instanceof ChronoField) {
            String valueOf = String.valueOf(temporalField);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Unsupported field: ");
            sb.append(valueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.totalSeconds;
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

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        return (temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.zone()) ? this : TemporalAccessor.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.OFFSET_SECONDS, this.totalSeconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.totalSeconds - this.totalSeconds;
    }

    @Override // j$.time.ZoneId
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.totalSeconds == ((ZoneOffset) obj).totalSeconds;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.totalSeconds;
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.id;
    }

    private Object writeReplace() {
        return new Ser((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    void write(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        writeExternal(dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        int i = this.totalSeconds;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset readExternal(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(readByte * 900);
    }
}
