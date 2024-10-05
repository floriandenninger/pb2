package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahch extends ahcn {
    private final String a;

    public ahch(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
    }

    @Override // defpackage.ahcn
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahcn) {
            return this.a.equals(((ahcn) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("OfflineDrmSessionExpirationUpdateEvent{videoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
