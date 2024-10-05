package defpackage;

import com.google.protos.youtube.api.innertube.AdPreviewRendererOuterClass;
import com.google.protos.youtube.api.innertube.SkipAdRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xlb extends xkt {
    public boolean a;
    private final acra f;
    private final xcl g;

    public xlb(acra acraVar, xcl xclVar) {
        super(xkd.b().a());
        this.f = acraVar;
        this.g = xclVar;
    }

    private static final aoxw a(xkd xkdVar) {
        auve auveVar = xkdVar.a;
        if (auveVar == null) {
            return null;
        }
        aulq aulqVar = auveVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(AdPreviewRendererOuterClass.adPreviewRenderer)) {
            return null;
        }
        aulq aulqVar2 = xkdVar.a.b;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (aoxw) aulqVar2.pX(AdPreviewRendererOuterClass.adPreviewRenderer);
    }

    private static final auvf f(xkd xkdVar) {
        auve auveVar = xkdVar.a;
        if (auveVar == null) {
            return null;
        }
        aulq aulqVar = auveVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(SkipAdRendererOuterClass.skipButtonRenderer)) {
            return null;
        }
        aulq aulqVar2 = xkdVar.a.c;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (auvf) aulqVar2.pX(SkipAdRendererOuterClass.skipButtonRenderer);
    }

    @Override // defpackage.xkt
    public final /* synthetic */ void b(Object obj, boolean z) {
        xkd xkdVar = (xkd) obj;
        xfn xfnVar = xkdVar.i;
        if (xfnVar != ((xkd) this.b).i) {
            ((xkl) this.c).f(xfnVar);
        }
        if (!xkdVar.c.equals(((xkd) this.b).c)) {
            ((xkl) this.c).e(xkdVar.c);
        }
        if (!xkdVar.c.equals(((xkd) this.b).c)) {
            ((xkl) this.c).e(xkdVar.c);
        }
        xkd xkdVar2 = (xkd) this.b;
        int i = xkdVar2.d;
        int i2 = xkdVar.d;
        if (i != i2 || xkdVar2.e != xkdVar.e) {
            xkl xklVar = (xkl) this.c;
            boolean z2 = true;
            if (!this.a && !xkdVar.e) {
                z2 = false;
            }
            xklVar.j(i2, z2);
        }
        int i3 = xkdVar.g;
        if (i3 != ((xkd) this.b).g && i3 != -1 && xkdVar.d == 0) {
            ((xkl) this.c).d(i3);
        }
        int i4 = xkdVar.h;
        if (i4 != ((xkd) this.b).h && i4 != -1) {
            ((xkl) this.c).c(i4);
        }
        float f = xkdVar.f;
        if (f != ((xkd) this.b).f) {
            ((xkl) this.c).k(f);
        }
        auvf f2 = f(xkdVar);
        if (!amkq.b(f((xkd) this.b), f2)) {
            ((xkl) this.c).i(f2);
            if (f2 != null) {
                this.f.D(new acqx(f2.e));
            }
        }
        aoxw a = a(xkdVar);
        if (!amkq.b(a((xkd) this.b), a)) {
            ((xkl) this.c).h(a);
            if (a != null) {
                this.f.D(new acqx(a.g));
            }
        }
        if (!xkdVar.b.equals(((xkd) this.b).b) && !xkdVar.b.equals(xki.a)) {
            ((xkl) this.c).l(xkdVar.b, xkdVar.l, this.g.f);
            if (xkdVar.m) {
                ((xkl) this.c).g(xkdVar.n, xkdVar.o);
            }
        }
        if (this.d == z || !z) {
            return;
        }
        ((xkl) this.c).b();
    }

    @Override // defpackage.xkt
    public final void d() {
    }
}
