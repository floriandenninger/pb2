package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjg implements ciz {
    public final String a;
    public final ciw b;
    public final ciw c;
    public final cil d;
    public final boolean e;

    public cjg(String str, ciw ciwVar, ciw ciwVar2, cil cilVar, boolean z) {
        this.a = str;
        this.b = ciwVar;
        this.c = ciwVar2;
        this.d = cilVar;
        this.e = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new cha(cfzVar, cjpVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("RectangleShape{position=");
        sb.append(valueOf);
        sb.append(", size=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
