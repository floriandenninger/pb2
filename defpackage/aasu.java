package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aasu extends aasp {
    public aasu(aarm aarmVar, ysl yslVar, aooy aooyVar, ykr ykrVar, ykq ykqVar) {
        super(aarmVar, yslVar, aooyVar, ykrVar, ykqVar);
    }

    public final anhy g(aaru aaruVar, Executor executor) {
        return o(aaruVar, executor, null);
    }

    public abstract Object h(aooy aooyVar);

    public final void i(aaru aaruVar, afwx afwxVar) {
        j(aaruVar, aasw.d, afwxVar);
    }

    public final void j(aaru aaruVar, aasq aasqVar, afwx afwxVar) {
        k(aaruVar, aasqVar, afwxVar, null);
    }

    public final void k(aaru aaruVar, aasq aasqVar, afwx afwxVar, aart aartVar) {
        afwxVar.getClass();
        f(aaruVar, new aast(this, aasqVar, aaruVar, afwxVar), aartVar);
    }

    public void l(aooy aooyVar) {
    }

    public void m(aaru aaruVar, Object obj) {
    }

    public void n(aaru aaruVar) {
    }

    public final anhy o(final aaru aaruVar, Executor executor, aart aartVar) {
        return aney.i(anfq.h(anht.q(c(aaruVar, executor, aartVar)), new amml() { // from class: aasr
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aasu aasuVar = aasu.this;
                aaru aaruVar2 = aaruVar;
                aooy aooyVar = (aooy) obj;
                aasuVar.l(aooyVar);
                Object h = aasuVar.h(aooyVar);
                aasuVar.m(aaruVar2, h);
                return h;
            }
        }, angq.a), cnq.class, new anfz() { // from class: aass
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                aasu.this.n(aaruVar);
                return anaf.N((cnq) obj);
            }
        }, angq.a);
    }
}
