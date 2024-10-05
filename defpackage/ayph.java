package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayph implements aypk {
    public static ayph A() {
        ayph ayphVar = ayuz.a;
        ayrv ayrvVar = aynu.p;
        return ayphVar;
    }

    public static ayph G(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        aysw.b(timeUnit, "unit is null");
        ayvm ayvmVar = new ayvm(j, timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.p;
        return ayvmVar;
    }

    public static ayph H(aypk aypkVar) {
        ayrv ayrvVar = aynu.p;
        return (ayph) aypkVar;
    }

    private static NullPointerException W(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    private ayph a(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar, ayrm ayrmVar2, ayrm ayrmVar3, ayrm ayrmVar4) {
        aysw.b(ayrsVar, "onSubscribe is null");
        aysw.b(ayrsVar2, "onError is null");
        aysw.b(ayrmVar, "onComplete is null");
        aysw.b(ayrmVar4, "onDispose is null");
        ayvf ayvfVar = new ayvf(this, ayrsVar, ayrsVar2, ayrmVar, ayrmVar4);
        ayrv ayrvVar = aynu.p;
        return ayvfVar;
    }

    private static ayph b(banv banvVar, int i, boolean z) {
        aysw.c(Integer.MAX_VALUE, "maxConcurrency");
        ayuw ayuwVar = new ayuw(banvVar);
        ayrv ayrvVar = aynu.p;
        return ayuwVar;
    }

    private ayph d(long j, TimeUnit timeUnit, ayqi ayqiVar, aypk aypkVar) {
        aysw.b(timeUnit, "unit is null");
        aysw.b(ayqiVar, "scheduler is null");
        ayvk ayvkVar = new ayvk(this, j, timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.p;
        return ayvkVar;
    }

    public static ayph f() {
        ayph ayphVar = ayul.a;
        ayrv ayrvVar = aynu.p;
        return ayphVar;
    }

    public static ayph h(banv banvVar) {
        return i(banvVar, 2);
    }

    public static ayph i(banv banvVar, int i) {
        aysw.c(2, "prefetch");
        ayud ayudVar = new ayud(banvVar);
        ayrv ayrvVar = aynu.p;
        return ayudVar;
    }

    public static ayph j(aypj aypjVar) {
        aysw.b(aypjVar, "source is null");
        ayuf ayufVar = new ayuf(aypjVar);
        ayrv ayrvVar = aynu.p;
        return ayufVar;
    }

    public static ayph k(Callable callable) {
        aysw.b(callable, "completableSupplier");
        ayug ayugVar = new ayug(callable);
        ayrv ayrvVar = aynu.p;
        return ayugVar;
    }

    public static ayph s(Throwable th) {
        aysw.b(th, "error is null");
        ayum ayumVar = new ayum(th);
        ayrv ayrvVar = aynu.p;
        return ayumVar;
    }

    public static ayph t(ayrm ayrmVar) {
        aysw.b(ayrmVar, "run is null");
        ayun ayunVar = new ayun(ayrmVar);
        ayrv ayrvVar = aynu.p;
        return ayunVar;
    }

    public static ayph u(Callable callable) {
        aysw.b(callable, "callable is null");
        ayuo ayuoVar = new ayuo(callable);
        ayrv ayrvVar = aynu.p;
        return ayuoVar;
    }

    public static ayph v(Future future) {
        return t(new aysn(future));
    }

    public static ayph w(Runnable runnable) {
        aysw.b(runnable, "run is null");
        ayup ayupVar = new ayup(runnable);
        ayrv ayrvVar = aynu.p;
        return ayupVar;
    }

    public static ayph y(aypk... aypkVarArr) {
        ayuy ayuyVar = new ayuy(aypkVarArr);
        ayrv ayrvVar = aynu.p;
        return ayuyVar;
    }

    public static ayph z(banv banvVar) {
        return b(banvVar, Integer.MAX_VALUE, true);
    }

    public final ayph B(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        ayvb ayvbVar = new ayvb(this, ayqiVar);
        ayrv ayrvVar = aynu.p;
        return ayvbVar;
    }

    public final ayph C() {
        return D(aysu.f);
    }

    public final ayph D(ayrw ayrwVar) {
        aysw.b(ayrwVar, "predicate is null");
        ayvd ayvdVar = new ayvd(this, ayrwVar);
        ayrv ayrvVar = aynu.p;
        return ayvdVar;
    }

    public final ayph E(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        ayvh ayvhVar = new ayvh(this, ayqiVar);
        ayrv ayrvVar = aynu.p;
        return ayvhVar;
    }

    public final ayph F(long j, TimeUnit timeUnit) {
        return d(j, timeUnit, azre.a(), null);
    }

    public final aypi I(aypi aypiVar) {
        U(aypiVar);
        return aypiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypn J() {
        if (this instanceof aysy) {
            return ((aysy) this).a();
        }
        ayvn ayvnVar = new ayvn(this);
        ayrv ayrvVar = aynu.j;
        return ayvnVar;
    }

    public final ayps K(aypv aypvVar) {
        azcf azcfVar = new azcf(aypvVar, this);
        ayrv ayrvVar = aynu.n;
        return azcfVar;
    }

    public final ayps L() {
        if (this instanceof azdg) {
            azde azdeVar = new azde(((azdg) this).a);
            ayrv ayrvVar = aynu.n;
            return azdeVar;
        }
        azcz azczVar = new azcz(this);
        ayrv ayrvVar2 = aynu.n;
        return azczVar;
    }

    public final aypy M(ayqb ayqbVar) {
        aysw.b(ayqbVar, "next is null");
        azeo azeoVar = new azeo(this, ayqbVar);
        ayrv ayrvVar = aynu.l;
        return azeoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypy N() {
        if (this instanceof aysz) {
            return ((aysz) this).a();
        }
        ayvp ayvpVar = new ayvp(this);
        ayrv ayrvVar = aynu.l;
        return ayvpVar;
    }

    public final ayqj O(ayqm ayqmVar) {
        azmq azmqVar = new azmq(ayqmVar, this);
        ayrv ayrvVar = aynu.o;
        return azmqVar;
    }

    public final ayqj P(Object obj) {
        ayvr ayvrVar = new ayvr(this, obj);
        ayrv ayrvVar = aynu.o;
        return ayvrVar;
    }

    public final ayqx Q() {
        aytq aytqVar = new aytq();
        U(aytqVar);
        return aytqVar;
    }

    public final ayqx R(ayrm ayrmVar) {
        aysw.b(ayrmVar, "onComplete is null");
        aytm aytmVar = new aytm(ayrmVar);
        U(aytmVar);
        return aytmVar;
    }

    public final ayqx S(ayrm ayrmVar, ayrs ayrsVar) {
        aysw.b(ayrsVar, "onError is null");
        aysw.b(ayrmVar, "onComplete is null");
        aytm aytmVar = new aytm(ayrsVar, ayrmVar);
        U(aytmVar);
        return aytmVar;
    }

    public final void T() {
        aytk aytkVar = new aytk();
        U(aytkVar);
        aytkVar.c();
    }

    @Override // defpackage.aypk
    public final void U(aypi aypiVar) {
        aysw.b(aypiVar, "observer is null");
        try {
            ayro ayroVar = aynu.v;
            aysw.b(aypiVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            V(aypiVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
            throw W(th);
        }
    }

    protected abstract void V(aypi aypiVar);

    public final ayph c(aypk aypkVar) {
        ayty aytyVar = new ayty(this, aypkVar);
        ayrv ayrvVar = aynu.p;
        return aytyVar;
    }

    public final ayph e() {
        ayua ayuaVar = new ayua(this);
        ayrv ayrvVar = aynu.p;
        return ayuaVar;
    }

    public final ayph g(aypl ayplVar) {
        aysw.b(ayplVar, "transformer is null");
        aypk a = ayplVar.a(this);
        H(a);
        return (ayph) a;
    }

    public final ayph l(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        return m(j, timeUnit, ayqiVar, false);
    }

    public final ayph m(long j, TimeUnit timeUnit, ayqi ayqiVar, boolean z) {
        aysw.b(timeUnit, "unit is null");
        ayui ayuiVar = new ayui(this, j, timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.p;
        return ayuiVar;
    }

    public final ayph n(ayrm ayrmVar) {
        ayuk ayukVar = new ayuk(this, ayrmVar);
        ayrv ayrvVar = aynu.p;
        return ayukVar;
    }

    public final ayph o(ayrm ayrmVar) {
        return a(aysu.d, aysu.d, ayrmVar, aysu.c, aysu.c, aysu.c);
    }

    public final ayph p(ayrm ayrmVar) {
        return a(aysu.d, aysu.d, aysu.c, aysu.c, aysu.c, ayrmVar);
    }

    public final ayph q(ayrs ayrsVar) {
        return a(aysu.d, ayrsVar, aysu.c, aysu.c, aysu.c, aysu.c);
    }

    public final ayph r(ayrs ayrsVar) {
        return a(ayrsVar, aysu.d, aysu.c, aysu.c, aysu.c, aysu.c);
    }

    public final ayph x() {
        ayut ayutVar = new ayut(this);
        ayrv ayrvVar = aynu.p;
        return ayutVar;
    }
}
