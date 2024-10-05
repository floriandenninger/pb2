package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahci extends ahdw {
    private final String a;

    public ahci(String str) {
        this.a = str;
    }

    @Override // defpackage.ahdw
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahdw) {
            return this.a.equals(((ahdw) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("StaleConfigEvent{videoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
