package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stp implements swv {
    public final sxd a;
    public final axpg b;
    public final boolean c;

    public stp(sxd sxdVar, axpg axpgVar, ammv ammvVar) {
        this.a = sxdVar;
        this.b = axpgVar;
        this.c = ((Boolean) ammvVar.e(false)).booleanValue();
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awop.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        awop awopVar = (awop) obj;
        return ayqj.F(awopVar).c(new sto(this, awopVar, swuVar, 0));
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
