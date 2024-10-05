package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjl implements ciz {
    public final cir a;
    public final boolean b;
    private final String c;
    private final int d;

    public cjl(String str, int i, cir cirVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = cirVar;
        this.b = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new chc(cfzVar, cjpVar, this);
    }

    public final String toString() {
        String str = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("ShapePath{name=");
        sb.append(str);
        sb.append(", index=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
