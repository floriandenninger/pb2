package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjv extends jhl {
    private static avzd h(agnv agnvVar, boolean z) {
        if (agnvVar.s() && z) {
            return null;
        }
        return evr.bI(agnvVar.m(), agnvVar.h);
    }

    @Override // defpackage.jhl
    protected final amsx a(agsw agswVar) {
        avzd h;
        amsv i = amsx.i();
        for (agnv agnvVar : agswVar.j()) {
            if (agnvVar != null && (h = h(agnvVar, true)) != null) {
                i.c(h);
            }
        }
        return i.g();
    }

    @Override // defpackage.jhl
    protected final void c(aalc aalcVar, agnv agnvVar) {
        avzd h = h(agnvVar, false);
        if (h != null) {
            aalcVar.k(h);
        }
    }

    @Override // defpackage.jhl
    protected final void e(aalc aalcVar, String str) {
        aalcVar.g(fhe.A(str));
    }

    @Override // defpackage.jhl
    protected final void f(aalc aalcVar, agnv agnvVar) {
        aalcVar.k(evr.bI(agnvVar.m(), agnvVar.h));
    }
}
