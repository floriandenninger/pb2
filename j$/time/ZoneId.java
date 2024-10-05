package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQueries;
import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ZoneId implements Serializable {
    public static final Map SHORT_IDS = ZoneId$$ExternalSyntheticBackport2.m(new Map.Entry[]{ZoneId$$ExternalSyntheticBackport1.m("ACT", "Australia/Darwin"), ZoneId$$ExternalSyntheticBackport1.m("AET", "Australia/Sydney"), ZoneId$$ExternalSyntheticBackport1.m("AGT", "America/Argentina/Buenos_Aires"), ZoneId$$ExternalSyntheticBackport1.m("ART", "Africa/Cairo"), ZoneId$$ExternalSyntheticBackport1.m("AST", "America/Anchorage"), ZoneId$$ExternalSyntheticBackport1.m("BET", "America/Sao_Paulo"), ZoneId$$ExternalSyntheticBackport1.m("BST", "Asia/Dhaka"), ZoneId$$ExternalSyntheticBackport1.m("CAT", "Africa/Harare"), ZoneId$$ExternalSyntheticBackport1.m("CNT", "America/St_Johns"), ZoneId$$ExternalSyntheticBackport1.m("CST", "America/Chicago"), ZoneId$$ExternalSyntheticBackport1.m("CTT", "Asia/Shanghai"), ZoneId$$ExternalSyntheticBackport1.m("EAT", "Africa/Addis_Ababa"), ZoneId$$ExternalSyntheticBackport1.m("ECT", "Europe/Paris"), ZoneId$$ExternalSyntheticBackport1.m("IET", "America/Indiana/Indianapolis"), ZoneId$$ExternalSyntheticBackport1.m("IST", "Asia/Kolkata"), ZoneId$$ExternalSyntheticBackport1.m("JST", "Asia/Tokyo"), ZoneId$$ExternalSyntheticBackport1.m("MIT", "Pacific/Apia"), ZoneId$$ExternalSyntheticBackport1.m("NET", "Asia/Yerevan"), ZoneId$$ExternalSyntheticBackport1.m("NST", "Pacific/Auckland"), ZoneId$$ExternalSyntheticBackport1.m("PLT", "Asia/Karachi"), ZoneId$$ExternalSyntheticBackport1.m("PNT", "America/Phoenix"), ZoneId$$ExternalSyntheticBackport1.m("PRT", "America/Puerto_Rico"), ZoneId$$ExternalSyntheticBackport1.m("PST", "America/Los_Angeles"), ZoneId$$ExternalSyntheticBackport1.m("SST", "Pacific/Guadalcanal"), ZoneId$$ExternalSyntheticBackport1.m("VST", "Asia/Ho_Chi_Minh"), ZoneId$$ExternalSyntheticBackport1.m("EST", "-05:00"), ZoneId$$ExternalSyntheticBackport1.m("MST", "-07:00"), ZoneId$$ExternalSyntheticBackport1.m("HST", "-10:00")});
    private static final long serialVersionUID = 8352817235686L;

    public abstract String getId();

    public abstract ZoneRules getRules();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void write(DataOutput dataOutput);

    public static ZoneId ofOffset(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException(str.length() != 0 ? "prefix should be GMT, UTC or UT, is: ".concat(str) : new String("prefix should be GMT, UTC or UT, is: "));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.getId());
        }
        return new ZoneRegion(str, zoneOffset.getRules());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId of(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.of(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return ofWithPrefix(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return ofWithPrefix(str, 2, z);
        }
        return ZoneRegion.ofId(str, z);
    }

    private static ZoneId ofWithPrefix(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return ofOffset(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return ZoneRegion.ofId(str, z);
        }
        try {
            ZoneOffset of = ZoneOffset.of(str.substring(i));
            if (of == ZoneOffset.UTC) {
                return ofOffset(substring, of);
            }
            return ofOffset(substring, of);
        } catch (DateTimeException e) {
            throw new DateTimeException(str.length() != 0 ? "Invalid ID for offset-based ZoneId: ".concat(str) : new String("Invalid ID for offset-based ZoneId: "), e);
        }
    }

    public static ZoneId from(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zone());
        if (zoneId != null) {
            return zoneId;
        }
        String valueOf = String.valueOf(temporalAccessor);
        String name = temporalAccessor.getClass().getName();
        StringBuilder sb = new StringBuilder(valueOf.length() + 56 + name.length());
        sb.append("Unable to obtain ZoneId from TemporalAccessor: ");
        sb.append(valueOf);
        sb.append(" of type ");
        sb.append(name);
        throw new DateTimeException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != ZoneRegion.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(Instant.EPOCH);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }
}
