package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adks {
    public final adgn a;

    public adks() {
    }

    public adks(adgn adgnVar) {
        this.a = adgnVar;
    }

    public static adkr a() {
        adkr adkrVar = new adkr();
        adkrVar.b(new adgn(""));
        return adkrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adks) {
            return this.a.equals(((adks) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("DialSessionInfo{hardwareDeviceId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
