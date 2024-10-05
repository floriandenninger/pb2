package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtv {
    private final fif a;
    private final fix b;

    public jtv(fif fifVar, fix fixVar) {
        this.a = fifVar;
        this.b = fixVar;
    }

    public final ayqj a() {
        eng engVar;
        fif fifVar = this.a;
        fib a = fid.a();
        a.b(aqnf.FILTER_TYPE_NONE);
        aypy k = fifVar.b(a.a()).G(jtu.b).k(jtu.c);
        fix fixVar = this.b;
        fib a2 = fid.a();
        a2.b(aqnf.FILTER_TYPE_NONE);
        fid a3 = a2.a();
        aypy Y = fixVar.b.b(a3).G(eoe.p).k(fiv.b).Y(eoe.r);
        aypy Y2 = fixVar.c.b(a3).G(eoe.p).k(fiv.b).Y(eoe.s);
        fiz fizVar = (fiz) fixVar.a;
        aair a4 = fizVar.a.a(fizVar.b.c());
        aypy O = a4.f(fhe.d()).g(asxi.class).x(fiv.d).H(ayps.w(amru.q())).O(fiv.g);
        int ordinal = ((aqnf) a3.a.e(aqnf.FILTER_TYPE_NONE)).ordinal();
        int i = 1;
        if (ordinal == 0 || ordinal == 1) {
            engVar = eng.n;
        } else if (ordinal != 2) {
            engVar = ordinal != 3 ? eng.o : eng.m;
        } else {
            engVar = eng.l;
        }
        aypy L = O.L(engVar).Y(fiv.e).L(eng.p);
        a4.getClass();
        return aypy.aa(k, aypy.aa(Y, Y2).av().G(fiv.c).B(new odk(L.t(new fiy(a4, 0)).av().G(fiv.f).G(eoe.p).k(fiv.b).Y(eoe.t), i)).k(jtu.c)).av().G(jtu.d).G(jtu.a);
    }
}
