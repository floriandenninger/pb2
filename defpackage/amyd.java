package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amyd implements amxt {
    private final amxt a;
    private final Object b;

    public amyd(amxt amxtVar, Object obj) {
        anaf.d(amxtVar, "log site key");
        this.a = amxtVar;
        anaf.d(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amyd)) {
            return false;
        }
        amyd amydVar = (amyd) obj;
        return this.a.equals(amydVar.a) && this.b.equals(amydVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(valueOf);
        sb.append("', qualifier='");
        sb.append(valueOf2);
        sb.append("' }");
        return sb.toString();
    }
}
