package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ammb extends ammd {
    final ammd a;
    final ammd b;

    public ammb(ammd ammdVar, ammd ammdVar2) {
        this.a = ammdVar;
        this.b = ammdVar2;
    }

    @Override // defpackage.ammd
    public final boolean b(char c) {
        return this.a.b(c) || this.b.b(c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append("CharMatcher.or(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
