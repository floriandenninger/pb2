package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjn implements ciz {
    public final cil a;
    public final cil b;
    public final cil c;
    public final boolean d;
    public final int e;

    public cjn(int i, cil cilVar, cil cilVar2, cil cilVar3, boolean z) {
        this.e = i;
        this.a = cilVar;
        this.b = cilVar2;
        this.c = cilVar3;
        this.d = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new che(cjpVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Trim Path: {start: ");
        sb.append(valueOf);
        sb.append(", end: ");
        sb.append(valueOf2);
        sb.append(", offset: ");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
