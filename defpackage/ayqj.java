package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayqj implements ayqm {
    public static ayqj A(Callable callable) {
        azmx azmxVar = new azmx(callable);
        ayrv ayrvVar = aynu.o;
        return azmxVar;
    }

    public static ayqj C(Callable callable) {
        aysw.b(callable, "callable is null");
        azng azngVar = new azng(callable);
        ayrv ayrvVar = aynu.o;
        return azngVar;
    }

    public static ayqj D(Future future) {
        return b(aypn.v(future));
    }

    public static ayqj F(Object obj) {
        aysw.b(obj, "item is null");
        aznj aznjVar = new aznj(obj);
        ayrv ayrvVar = aynu.o;
        return aznjVar;
    }

    public static ayqj H() {
        ayqj ayqjVar = aznm.a;
        ayrv ayrvVar = aynu.o;
        return ayqjVar;
    }

    public static ayqj P(ayqm ayqmVar) {
        ayrv ayrvVar = aynu.o;
        return (ayqj) ayqmVar;
    }

    public static ayqj Q(ayqm ayqmVar, ayqm ayqmVar2, ayro ayroVar) {
        return R(aysu.c(ayroVar), ayqmVar, ayqmVar2);
    }

    public static ayqj R(ayrv ayrvVar, ayqm... ayqmVarArr) {
        azod azodVar = new azod(ayqmVarArr, ayrvVar);
        ayrv ayrvVar2 = aynu.o;
        return azodVar;
    }

    private ayqj a(long j, TimeUnit timeUnit, ayqi ayqiVar, ayqm ayqmVar) {
        aysw.b(timeUnit, "unit is null");
        aysw.b(ayqiVar, "scheduler is null");
        aznw aznwVar = new aznw(this, j, timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.o;
        return aznwVar;
    }

    private static ayqj b(aypn aypnVar) {
        azap azapVar = new azap(aypnVar, null, 0);
        ayrv ayrvVar = aynu.o;
        return azapVar;
    }

    public static ayqj p(ayql ayqlVar) {
        aysw.b(ayqlVar, "source is null");
        azmj azmjVar = new azmj(ayqlVar);
        ayrv ayrvVar = aynu.o;
        return azmjVar;
    }

    public static ayqj q(Callable callable) {
        azmk azmkVar = new azmk(callable);
        ayrv ayrvVar = aynu.o;
        return azmkVar;
    }

    public static ayqj z(Throwable th) {
        aysw.b(th, "exception is null");
        return A(aysu.f(th));
    }

    public final ayqj B(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azmz azmzVar = new azmz(this, ayrvVar);
        ayrv ayrvVar2 = aynu.o;
        return azmzVar;
    }

    public final ayqj E() {
        azni azniVar = new azni(this);
        ayrv ayrvVar = aynu.o;
        return azniVar;
    }

    public final ayqj G(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        aznl aznlVar = new aznl(this, ayrvVar);
        ayrv ayrvVar2 = aynu.o;
        return aznlVar;
    }

    public final ayqj I(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        azno aznoVar = new azno(this, ayqiVar);
        ayrv ayrvVar = aynu.o;
        return aznoVar;
    }

    public final ayqj J(ayrv ayrvVar) {
        aysw.b(ayrvVar, "resumeFunctionInCaseOfError is null");
        azns aznsVar = new azns(this, ayrvVar);
        ayrv ayrvVar2 = aynu.o;
        return aznsVar;
    }

    public final ayqj K(ayrv ayrvVar) {
        aysw.b(ayrvVar, "resumeFunction is null");
        aznq aznqVar = new aznq(this, ayrvVar, null);
        ayrv ayrvVar2 = aynu.o;
        return aznqVar;
    }

    public final ayqj L(Object obj) {
        aysw.b(obj, "value is null");
        aznq aznqVar = new aznq(this, null, obj);
        ayrv ayrvVar = aynu.o;
        return aznqVar;
    }

    public final ayqj M(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        aznu aznuVar = new aznu(this, ayqiVar);
        ayrv ayrvVar = aynu.o;
        return aznuVar;
    }

    public final ayqj N(long j, TimeUnit timeUnit) {
        return a(4L, timeUnit, azre.a(), null);
    }

    public final ayqj O(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        return a(j, timeUnit, ayqiVar, null);
    }

    public final ayqj S(ayqm ayqmVar, ayro ayroVar) {
        return Q(this, ayqmVar, ayroVar);
    }

    public final ayqk T(ayqk ayqkVar) {
        Z(ayqkVar);
        return ayqkVar;
    }

    public final ayqx U() {
        return W(aysu.d, aysu.e);
    }

    public final ayqx V(ayrs ayrsVar) {
        return W(ayrsVar, aysu.e);
    }

    public final ayqx W(ayrs ayrsVar, ayrs ayrsVar2) {
        aysw.b(ayrsVar, "onSuccess is null");
        aysw.b(ayrsVar2, "onError is null");
        aytn aytnVar = new aytn(ayrsVar, ayrsVar2);
        Z(aytnVar);
        return aytnVar;
    }

    public final Object X() {
        aytk aytkVar = new aytk();
        Z(aytkVar);
        return aytkVar.c();
    }

    public final Future Y() {
        aytr aytrVar = new aytr();
        T(aytrVar);
        return aytrVar;
    }

    @Override // defpackage.ayqm
    public final void Z(ayqk ayqkVar) {
        aysw.b(ayqkVar, "observer is null");
        ayro ayroVar = aynu.u;
        aysw.b(ayqkVar, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            aa(ayqkVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aynu.c(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void aa(ayqk ayqkVar);

    public final ayph c(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        aznb aznbVar = new aznb(this, ayrvVar);
        ayrv ayrvVar2 = aynu.p;
        return aznbVar;
    }

    public final ayph e() {
        ayur ayurVar = new ayur(this);
        ayrv ayrvVar = aynu.p;
        return ayurVar;
    }

    public final aypn f(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        aznf aznfVar = new aznf(this, ayrvVar);
        ayrv ayrvVar2 = aynu.j;
        return aznfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypn g() {
        if (this instanceof aysy) {
            return ((aysy) this).a();
        }
        azny aznyVar = new azny(this);
        ayrv ayrvVar = aynu.j;
        return aznyVar;
    }

    public final ayps h(ayrw ayrwVar) {
        aysw.b(ayrwVar, "predicate is null");
        azco azcoVar = new azco(this, ayrwVar);
        ayrv ayrvVar = aynu.n;
        return azcoVar;
    }

    public final ayps i(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        aznd azndVar = new aznd(this, ayrvVar);
        ayrv ayrvVar2 = aynu.n;
        return azndVar;
    }

    public final ayps j() {
        azdc azdcVar = new azdc(this);
        ayrv ayrvVar = aynu.n;
        return azdcVar;
    }

    public final aypy k(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azfb azfbVar = new azfb(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azfbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypy l() {
        if (this instanceof aysz) {
            return ((aysz) this).a();
        }
        azoa azoaVar = new azoa(this);
        ayrv ayrvVar = aynu.l;
        return azoaVar;
    }

    public final ayqj m() {
        azmh azmhVar = new azmh(this);
        ayrv ayrvVar = aynu.o;
        return azmhVar;
    }

    public final ayqj n(Class cls) {
        return G(aysu.a(cls));
    }

    public final ayqj o(ayqn ayqnVar) {
        aysw.b(ayqnVar, "transformer is null");
        ayqm a = ayqnVar.a(this);
        P(a);
        return (ayqj) a;
    }

    public final ayqj r(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        return s(15L, timeUnit, ayqiVar, false);
    }

    public final ayqj s(long j, TimeUnit timeUnit, ayqi ayqiVar, boolean z) {
        aysw.b(timeUnit, "unit is null");
        aysw.b(ayqiVar, "scheduler is null");
        azmo azmoVar = new azmo(this, timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.o;
        return azmoVar;
    }

    public final ayqj t(aypk aypkVar) {
        azmq azmqVar = new azmq(this, aypkVar);
        ayrv ayrvVar = aynu.o;
        return azmqVar;
    }

    public final ayqj u(ayqb ayqbVar) {
        azms azmsVar = new azms(this, ayqbVar);
        ayrv ayrvVar = aynu.o;
        return azmsVar;
    }

    public final ayqj v(long j, TimeUnit timeUnit) {
        return w(j, timeUnit, azre.a());
    }

    public final ayqj w(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        return u(aypy.am(j, timeUnit, ayqiVar));
    }

    public final ayqj x(ayrs ayrsVar) {
        aysw.b(ayrsVar, "onError is null");
        azmu azmuVar = new azmu(this, ayrsVar);
        ayrv ayrvVar = aynu.o;
        return azmuVar;
    }

    public final ayqj y(ayrs ayrsVar) {
        aysw.b(ayrsVar, "onSuccess is null");
        azmw azmwVar = new azmw(this, ayrsVar);
        ayrv ayrvVar = aynu.o;
        return azmwVar;
    }
}
