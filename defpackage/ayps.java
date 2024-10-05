package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayps implements aypv {
    public static ayps J(aypv aypvVar) {
        ayrv ayrvVar = aynu.n;
        return (ayps) aypvVar;
    }

    public static ayps K(aypv aypvVar, aypv aypvVar2, ayro ayroVar) {
        return L(aysu.c(ayroVar), aypvVar, aypvVar2);
    }

    public static ayps L(ayrv ayrvVar, aypv... aypvVarArr) {
        azem azemVar = new azem(aypvVarArr, ayrvVar);
        ayrv ayrvVar2 = aynu.n;
        return azemVar;
    }

    public static ayps i(aypu aypuVar) {
        aysw.b(aypuVar, "onSubscribe is null");
        azcd azcdVar = new azcd(aypuVar);
        ayrv ayrvVar = aynu.n;
        return azcdVar;
    }

    public static ayps p() {
        azck azckVar = azck.a;
        ayrv ayrvVar = aynu.n;
        return azckVar;
    }

    public static ayps q(Throwable th) {
        aysw.b(th, "exception is null");
        azcl azclVar = new azcl(th);
        ayrv ayrvVar = aynu.n;
        return azclVar;
    }

    public static ayps u(Callable callable) {
        aysw.b(callable, "callable is null");
        azcx azcxVar = new azcx(callable);
        ayrv ayrvVar = aynu.n;
        return azcxVar;
    }

    public static ayps v(Future future) {
        aysw.b(future, "future is null");
        azda azdaVar = new azda(future);
        ayrv ayrvVar = aynu.n;
        return azdaVar;
    }

    public static ayps w(Object obj) {
        aysw.b(obj, "item is null");
        azdh azdhVar = new azdh(obj);
        ayrv ayrvVar = aynu.n;
        return azdhVar;
    }

    public static ayps y() {
        azdj azdjVar = azdj.a;
        ayrv ayrvVar = aynu.n;
        return azdjVar;
    }

    public final ayps A() {
        return B(aysu.f);
    }

    public final ayps B(ayrw ayrwVar) {
        aysw.b(ayrwVar, "predicate is null");
        azdn azdnVar = new azdn(this, ayrwVar);
        ayrv ayrvVar = aynu.n;
        return azdnVar;
    }

    public final ayps C(aypv aypvVar) {
        return D(aysu.b(aypvVar));
    }

    public final ayps D(ayrv ayrvVar) {
        azdq azdqVar = new azdq(this, ayrvVar);
        ayrv ayrvVar2 = aynu.n;
        return azdqVar;
    }

    public final ayps E(ayrv ayrvVar) {
        aysw.b(ayrvVar, "valueSupplier is null");
        azds azdsVar = new azds(this, ayrvVar);
        ayrv ayrvVar2 = aynu.n;
        return azdsVar;
    }

    public final ayps F(Object obj) {
        aysw.b(obj, "item is null");
        return E(aysu.b(obj));
    }

    public final ayps G(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        azdx azdxVar = new azdx(this, ayqiVar);
        ayrv ayrvVar = aynu.n;
        return azdxVar;
    }

    public final ayps H(aypv aypvVar) {
        azdz azdzVar = new azdz(this, aypvVar);
        ayrv ayrvVar = aynu.n;
        return azdzVar;
    }

    public final ayps I(aypv aypvVar) {
        azef azefVar = new azef(this, aypvVar);
        ayrv ayrvVar = aynu.n;
        return azefVar;
    }

    public final ayps M(aypv aypvVar, ayro ayroVar) {
        return K(this, aypvVar, ayroVar);
    }

    public final aypt N(aypt ayptVar) {
        Y(ayptVar);
        return ayptVar;
    }

    public final aypy O(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azet azetVar = new azet(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azetVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypy P() {
        if (this instanceof aysz) {
            return ((aysz) this).a();
        }
        azeh azehVar = new azeh(this);
        ayrv ayrvVar = aynu.l;
        return azehVar;
    }

    public final ayqj Q(ayqm ayqmVar) {
        azec azecVar = new azec(this, ayqmVar);
        ayrv ayrvVar = aynu.o;
        return azecVar;
    }

    public final ayqj R() {
        azej azejVar = new azej(this, null);
        ayrv ayrvVar = aynu.o;
        return azejVar;
    }

    public final ayqj S(Object obj) {
        aysw.b(obj, "defaultValue is null");
        azej azejVar = new azej(this, obj);
        ayrv ayrvVar = aynu.o;
        return azejVar;
    }

    public final ayqx T() {
        return W(aysu.d, aysu.e, aysu.c);
    }

    public final ayqx U(ayrs ayrsVar) {
        return W(ayrsVar, aysu.e, aysu.c);
    }

    public final ayqx V(ayrs ayrsVar, ayrs ayrsVar2) {
        return W(ayrsVar, ayrsVar2, aysu.c);
    }

    public final ayqx W(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        aysw.b(ayrsVar, "onSuccess is null");
        aysw.b(ayrsVar2, "onError is null");
        aysw.b(ayrmVar, "onComplete is null");
        azcb azcbVar = new azcb(ayrsVar, ayrsVar2, ayrmVar);
        N(azcbVar);
        return azcbVar;
    }

    public final Object X() {
        aytk aytkVar = new aytk();
        Y(aytkVar);
        return aytkVar.c();
    }

    @Override // defpackage.aypv
    public final void Y(aypt ayptVar) {
        aysw.b(ayptVar, "observer is null");
        ayro ayroVar = aynu.s;
        aysw.b(ayptVar, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            Z(ayptVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aynu.c(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void Z(aypt ayptVar);

    public final ayph c(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azcq azcqVar = new azcq(this, ayrvVar);
        ayrv ayrvVar2 = aynu.p;
        return azcqVar;
    }

    public final ayph e() {
        azdg azdgVar = new azdg(this);
        ayrv ayrvVar = aynu.p;
        return azdgVar;
    }

    public final ayps f() {
        azca azcaVar = new azca(this);
        ayrv ayrvVar = aynu.n;
        return azcaVar;
    }

    public final ayps g(Class cls) {
        return x(aysu.a(cls));
    }

    public final ayps h(aypw aypwVar) {
        aysw.b(aypwVar, "transformer is null");
        aypv a = aypwVar.a(this);
        J(a);
        return (ayps) a;
    }

    public final ayps j(Object obj) {
        aysw.b(obj, "defaultItem is null");
        return H(w(obj));
    }

    public final ayps k(ayrs ayrsVar) {
        azch azchVar = new azch(this, ayrsVar);
        ayrv ayrvVar = aynu.n;
        return azchVar;
    }

    public final ayps l(ayrm ayrmVar) {
        ayrs ayrsVar = aysu.d;
        ayrs ayrsVar2 = aysu.d;
        aysw.b(ayrmVar, "onComplete is null");
        azdu azduVar = new azdu(this, ayrsVar, ayrsVar2, ayrmVar);
        ayrv ayrvVar = aynu.n;
        return azduVar;
    }

    public final ayps m(ayrs ayrsVar) {
        ayrs ayrsVar2 = aysu.d;
        aysw.b(ayrsVar, "onError is null");
        azdu azduVar = new azdu(this, ayrsVar2, ayrsVar, aysu.c);
        ayrv ayrvVar = aynu.n;
        return azduVar;
    }

    public final ayps n(ayrn ayrnVar) {
        azcj azcjVar = new azcj(this, ayrnVar);
        ayrv ayrvVar = aynu.n;
        return azcjVar;
    }

    public final ayps o(ayrs ayrsVar) {
        aysw.b(ayrsVar, "onSuccess is null");
        azdu azduVar = new azdu(this, ayrsVar, aysu.d, aysu.c);
        ayrv ayrvVar = aynu.n;
        return azduVar;
    }

    public final ayps r(ayrw ayrwVar) {
        aysw.b(ayrwVar, "predicate is null");
        azcm azcmVar = new azcm(this, ayrwVar);
        ayrv ayrvVar = aynu.n;
        return azcmVar;
    }

    public final ayps s(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azcw azcwVar = new azcw(this, ayrvVar);
        ayrv ayrvVar2 = aynu.n;
        return azcwVar;
    }

    public final ayps t(ayrv ayrvVar, ayrv ayrvVar2, Callable callable) {
        aysw.b(ayrvVar, "onSuccessMapper is null");
        aysw.b(ayrvVar2, "onErrorMapper is null");
        aysw.b(callable, "onCompleteSupplier is null");
        azct azctVar = new azct(this, ayrvVar, ayrvVar2, callable);
        ayrv ayrvVar3 = aynu.n;
        return azctVar;
    }

    public final ayps x(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azdi azdiVar = new azdi(this, ayrvVar);
        ayrv ayrvVar2 = aynu.n;
        return azdiVar;
    }

    public final ayps z(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        azdl azdlVar = new azdl(this, ayqiVar);
        ayrv ayrvVar = aynu.n;
        return azdlVar;
    }
}
