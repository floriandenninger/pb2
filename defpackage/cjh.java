package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjh implements ciz {
    public final String a;
    public final cil b;
    public final cil c;
    public final civ d;
    public final boolean e;

    public cjh(String str, cil cilVar, cil cilVar2, civ civVar, boolean z) {
        this.a = str;
        this.b = cilVar;
        this.c = cilVar2;
        this.d = civVar;
        this.e = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new chb(cfzVar, cjpVar, this);
    }
}
