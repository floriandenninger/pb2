package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acvz {
    final adgf a;
    final adgj b;
    public final long c = System.currentTimeMillis();

    public acvz(adgf adgfVar, adgj adgjVar) {
        this.a = adgfVar;
        this.b = adgjVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
