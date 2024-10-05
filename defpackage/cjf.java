package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjf implements ciz {
    public final String a;
    public final cil b;
    public final ciw c;
    public final cil d;
    public final cil e;
    public final cil f;
    public final cil g;
    public final cil h;
    public final boolean i;
    public final int j;

    public cjf(String str, int i, cil cilVar, ciw ciwVar, cil cilVar2, cil cilVar3, cil cilVar4, cil cilVar5, cil cilVar6, boolean z) {
        this.a = str;
        this.j = i;
        this.b = cilVar;
        this.c = ciwVar;
        this.d = cilVar2;
        this.e = cilVar3;
        this.f = cilVar4;
        this.g = cilVar5;
        this.h = cilVar6;
        this.i = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new cgz(cfzVar, cjpVar, this);
    }
}
