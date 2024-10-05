package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aypy implements ayqb {
    public static aypy I() {
        aypy aypyVar = azhb.a;
        ayrv ayrvVar = aynu.l;
        return aypyVar;
    }

    public static aypy J(Throwable th) {
        aysw.b(th, "exception is null");
        return K(aysu.f(th));
    }

    public static aypy K(Callable callable) {
        aysw.b(callable, "errorSupplier is null");
        azhc azhcVar = new azhc(callable);
        ayrv ayrvVar = aynu.l;
        return azhcVar;
    }

    public static aypy Q(Object... objArr) {
        azhw azhwVar = new azhw(objArr);
        ayrv ayrvVar = aynu.l;
        return azhwVar;
    }

    public static aypy R(Callable callable) {
        aysw.b(callable, "supplier is null");
        azhx azhxVar = new azhx(callable);
        ayrv ayrvVar = aynu.l;
        return azhxVar;
    }

    public static aypy S(Future future) {
        aysw.b(future, "future is null");
        azhy azhyVar = new azhy(future);
        ayrv ayrvVar = aynu.l;
        return azhyVar;
    }

    public static aypy T(Iterable iterable) {
        aysw.b(iterable, "source is null");
        azia aziaVar = new azia(iterable);
        ayrv ayrvVar = aynu.l;
        return aziaVar;
    }

    public static aypy V(long j, long j2, TimeUnit timeUnit, ayqi ayqiVar) {
        aysw.b(timeUnit, "unit is null");
        azio azioVar = new azio(Math.max(0L, j), Math.max(0L, j2), timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.l;
        return azioVar;
    }

    public static aypy W(Object obj) {
        aysw.b(obj, "item is null");
        azip azipVar = new azip(obj);
        ayrv ayrvVar = aynu.l;
        return azipVar;
    }

    public static aypy X(Object obj, Object obj2) {
        aysw.b(obj, "item1 is null");
        aysw.b(obj2, "item2 is null");
        return Q(obj, obj2);
    }

    public static aypy Z(Iterable iterable) {
        return T(iterable).M(aysu.a);
    }

    public static aypy aa(ayqb ayqbVar, ayqb ayqbVar2) {
        return Q(ayqbVar, ayqbVar2).aI(aysu.a, 2);
    }

    public static aypy am(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        aysw.b(timeUnit, "unit is null");
        aysw.b(ayqiVar, "scheduler is null");
        azlf azlfVar = new azlf(Math.max(j, 0L), timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.l;
        return azlfVar;
    }

    public static aypy l(Iterable iterable, ayrv ayrvVar) {
        int i = aypn.a;
        aysw.b(ayrvVar, "combiner is null");
        aysw.c(i, "bufferSize");
        azfu azfuVar = new azfu(null, iterable, ayrvVar, i + i);
        ayrv ayrvVar2 = aynu.l;
        return azfuVar;
    }

    public static aypy m(ayqb ayqbVar, ayqb ayqbVar2, ayro ayroVar) {
        aysw.b(ayqbVar, "source1 is null");
        aysw.b(ayqbVar2, "source2 is null");
        return n(new ayqb[]{ayqbVar, ayqbVar2}, aysu.c(ayroVar), aypn.a);
    }

    public static aypy n(ayqb[] ayqbVarArr, ayrv ayrvVar, int i) {
        aysw.b(ayrvVar, "combiner is null");
        aysw.c(i, "bufferSize");
        azfu azfuVar = new azfu(ayqbVarArr, null, ayrvVar, i + i);
        ayrv ayrvVar2 = aynu.l;
        return azfuVar;
    }

    public static aypy o(ayqb ayqbVar, ayqb ayqbVar2, ayqb ayqbVar3, ayrt ayrtVar) {
        aysw.b(ayqbVar, "source1 is null");
        aysw.b(ayqbVar3, "source3 is null");
        return n(new ayqb[]{ayqbVar, ayqbVar2, ayqbVar3}, aysu.d(ayrtVar), aypn.a);
    }

    public static aypy q(ayqb... ayqbVarArr) {
        azfx azfxVar = new azfx(Q(ayqbVarArr), aysu.a, aypn.a);
        ayrv ayrvVar = aynu.l;
        return azfxVar;
    }

    public static aypy v(ayqa ayqaVar) {
        aysw.b(ayqaVar, "source is null");
        azgc azgcVar = new azgc(ayqaVar);
        ayrv ayrvVar = aynu.l;
        return azgcVar;
    }

    public static aypy y(Callable callable) {
        aysw.b(callable, "supplier is null");
        azgg azggVar = new azgg(callable);
        ayrv ayrvVar = aynu.l;
        return azggVar;
    }

    public final aypy A(ayrv ayrvVar, Callable callable) {
        aysw.b(ayrvVar, "keySelector is null");
        aysw.b(callable, "collectionSupplier is null");
        azgn azgnVar = new azgn(this, ayrvVar, callable);
        ayrv ayrvVar2 = aynu.l;
        return azgnVar;
    }

    public final aypy B() {
        azgp azgpVar = new azgp(this, aysw.a);
        ayrv ayrvVar = aynu.l;
        return azgpVar;
    }

    public final aypy C(ayrm ayrmVar) {
        aysw.b(ayrmVar, "onFinally is null");
        azgr azgrVar = new azgr(this, ayrmVar);
        ayrv ayrvVar = aynu.l;
        return azgrVar;
    }

    public final aypy D(ayrm ayrmVar) {
        return aL(aysu.d, aysu.d, ayrmVar);
    }

    public final aypy E(ayrm ayrmVar) {
        return F(aysu.d, ayrmVar);
    }

    public final aypy F(ayrs ayrsVar, ayrm ayrmVar) {
        aysw.b(ayrsVar, "onSubscribe is null");
        aysw.b(ayrmVar, "onDispose is null");
        azgu azguVar = new azgu(this, ayrsVar, ayrmVar);
        ayrv ayrvVar = aynu.l;
        return azguVar;
    }

    public final aypy G(ayrs ayrsVar) {
        return aL(ayrsVar, aysu.d, aysu.c);
    }

    public final aypy H(ayrs ayrsVar) {
        return F(ayrsVar, aysu.c);
    }

    public final aypy L(ayrw ayrwVar) {
        aysw.b(ayrwVar, "predicate is null");
        azhe azheVar = new azhe(this, ayrwVar);
        ayrv ayrvVar = aynu.l;
        return azheVar;
    }

    public final aypy M(ayrv ayrvVar) {
        return aI(ayrvVar, Integer.MAX_VALUE);
    }

    public final aypy N(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azhu azhuVar = new azhu(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azhuVar;
    }

    public final aypy O(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azhq azhqVar = new azhq(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azhqVar;
    }

    public final aypy P(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azht azhtVar = new azht(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azhtVar;
    }

    public final aypy U() {
        azii aziiVar = new azii(this);
        ayrv ayrvVar = aynu.l;
        return aziiVar;
    }

    public final aypy Y(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azis azisVar = new azis(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azisVar;
    }

    public final Iterable aA() {
        int i = aypn.a;
        aysw.c(i, "bufferSize");
        return new azfe(this, i);
    }

    public final Object aB() {
        aytj aytjVar = new aytj();
        aE(aytjVar);
        Object f = aytjVar.f();
        if (f != null) {
            return f;
        }
        throw new NoSuchElementException();
    }

    public final Object aC(Object obj) {
        aytj aytjVar = new aytj();
        aE(aytjVar);
        Object f = aytjVar.f();
        return f != null ? f : obj;
    }

    public final Object aD(ayrv ayrvVar) {
        try {
            aysw.b(ayrvVar, "converter is null");
            return ayrvVar.a(this);
        } catch (Throwable th) {
            aynu.c(th);
            throw azqi.b(th);
        }
    }

    @Override // defpackage.ayqb
    public final void aE(ayqd ayqdVar) {
        aysw.b(ayqdVar, "observer is null");
        try {
            ayro ayroVar = aynu.t;
            aysw.b(ayqdVar, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            f(ayqdVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final aypy aF() {
        azqe azqeVar = azqe.a;
        aysw.c(2, "count");
        aysw.c(1, "skip");
        aysw.b(azqeVar, "bufferSupplier is null");
        azfk azfkVar = new azfk(this, azqeVar);
        ayrv ayrvVar = aynu.l;
        return azfkVar;
    }

    public final aypy aG(ayrv ayrvVar) {
        return r(ayrvVar, Integer.MAX_VALUE, aypn.a, true);
    }

    public final aypy aH(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        aysw.b(timeUnit, "unit is null");
        aysw.b(ayqiVar, "scheduler is null");
        azgl azglVar = new azgl(this, j, timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.l;
        return azglVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypy aI(ayrv ayrvVar, int i) {
        int i2 = aypn.a;
        aysw.b(ayrvVar, "mapper is null");
        aysw.c(i, "maxConcurrency");
        aysw.c(i2, "bufferSize");
        if (this instanceof aytd) {
            Object call = ((aytd) this).call();
            if (call == null) {
                return I();
            }
            return ayeq.p(call, ayrvVar);
        }
        azhh azhhVar = new azhh(this, ayrvVar, i, i2);
        ayrv ayrvVar2 = aynu.l;
        return azhhVar;
    }

    public final azqo aJ() {
        aysw.c(1, "bufferSize");
        return azjx.b(this, new azjv(1));
    }

    public final aypy aK(TimeUnit timeUnit) {
        ayqi a = azre.a();
        aysw.b(timeUnit, "unit is null");
        aysw.b(a, "scheduler is null");
        azkw azkwVar = new azkw(this, timeUnit, a);
        ayrv ayrvVar = aynu.l;
        return azkwVar;
    }

    public final aypy aL(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        aysw.b(ayrsVar, "onNext is null");
        aysw.b(ayrsVar2, "onError is null");
        aysw.b(ayrmVar, "onComplete is null");
        azgt azgtVar = new azgt(this, ayrsVar, ayrsVar2, ayrmVar);
        ayrv ayrvVar = aynu.l;
        return azgtVar;
    }

    public final ayqx aM(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        aysw.b(ayrsVar, "onNext is null");
        aysw.b(ayrsVar2, "onError is null");
        aysw.b(ayrmVar, "onComplete is null");
        aytu aytuVar = new aytu(ayrsVar, ayrsVar2, ayrmVar);
        aE(aytuVar);
        return aytuVar;
    }

    public final aypy ab(ayqi ayqiVar) {
        int i = aypn.a;
        aysw.b(ayqiVar, "scheduler is null");
        aysw.c(i, "bufferSize");
        aziv azivVar = new aziv(this, ayqiVar, i);
        ayrv ayrvVar = aynu.l;
        return azivVar;
    }

    public final aypy ac(ayrv ayrvVar) {
        aysw.b(ayrvVar, "valueSupplier is null");
        aziz azizVar = new aziz(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azizVar;
    }

    public final aypy ad(Object obj, ayro ayroVar) {
        aysw.b(obj, "initialValue is null");
        Callable f = aysu.f(obj);
        aysw.b(ayroVar, "accumulator is null");
        azkb azkbVar = new azkb(this, f, ayroVar);
        ayrv ayrvVar = aynu.l;
        return azkbVar;
    }

    public final aypy ae() {
        AtomicReference atomicReference = new AtomicReference();
        azjd azjdVar = new azjd(new azjc(atomicReference), this, atomicReference);
        ayrv ayrvVar = aynu.m;
        return azjdVar.aN();
    }

    public final aypy af(long j) {
        if (j <= 0) {
            ayrv ayrvVar = aynu.l;
            return this;
        }
        azkf azkfVar = new azkf(this, j);
        ayrv ayrvVar2 = aynu.l;
        return azkfVar;
    }

    public final aypy ag(ayqb ayqbVar) {
        return q(ayqbVar, this);
    }

    public final aypy ah(Object obj) {
        aysw.b(obj, "item is null");
        return q(W(obj), this);
    }

    public final aypy ai(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        azki azkiVar = new azki(this, ayqiVar);
        ayrv ayrvVar = aynu.l;
        return azkiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypy aj(ayrv ayrvVar) {
        int i = aypn.a;
        aysw.b(ayrvVar, "mapper is null");
        aysw.c(i, "bufferSize");
        if (this instanceof aytd) {
            Object call = ((aytd) this).call();
            if (call == null) {
                return I();
            }
            return ayeq.p(call, ayrvVar);
        }
        azkn azknVar = new azkn(this, ayrvVar, i);
        ayrv ayrvVar2 = aynu.l;
        return azknVar;
    }

    public final aypy ak(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("count >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        azkp azkpVar = new azkp(this, j);
        ayrv ayrvVar = aynu.l;
        return azkpVar;
    }

    public final aypy al(ayrw ayrwVar) {
        aysw.b(ayrwVar, "stopPredicate is null");
        azku azkuVar = new azku(this, ayrwVar);
        ayrv ayrvVar = aynu.l;
        return azkuVar;
    }

    public final aypy an(ayqb ayqbVar) {
        int i = aypn.a;
        aysw.c(i, "bufferSize");
        azlm azlmVar = new azlm(this, ayqbVar, i);
        ayrv ayrvVar = aynu.l;
        return azlmVar;
    }

    public final aypy ao(ayqb ayqbVar, ayro ayroVar) {
        aysw.b(ayqbVar, "other is null");
        aysw.b(ayroVar, "combiner is null");
        azlp azlpVar = new azlp(this, ayroVar, ayqbVar);
        ayrv ayrvVar = aynu.l;
        return azlpVar;
    }

    public final aypy ap(ayqb ayqbVar, ayro ayroVar) {
        ayrv c = aysu.c(ayroVar);
        int i = aypn.a;
        aysw.c(i, "bufferSize");
        azls azlsVar = new azls(new ayqb[]{this, ayqbVar}, c, i);
        ayrv ayrvVar = aynu.l;
        return azlsVar;
    }

    public final ayqj aq(Callable callable, ayrn ayrnVar) {
        aysw.b(callable, "initialValueSupplier is null");
        aysw.b(ayrnVar, "collector is null");
        azfr azfrVar = new azfr(this, callable, ayrnVar);
        ayrv ayrvVar = aynu.o;
        return azfrVar;
    }

    public final ayqj ar(Object obj, ayrn ayrnVar) {
        aysw.b(obj, "initialValue is null");
        return aq(aysu.f(obj), ayrnVar);
    }

    public final ayqj as(Object obj) {
        aysw.b(obj, "defaultItem is null");
        azha azhaVar = new azha(this, obj);
        ayrv ayrvVar = aynu.o;
        return azhaVar;
    }

    public final ayqj at() {
        azha azhaVar = new azha(this, null);
        ayrv ayrvVar = aynu.o;
        return azhaVar;
    }

    public final ayqj au(Object obj) {
        azkd azkdVar = new azkd(this, obj);
        ayrv ayrvVar = aynu.o;
        return azkdVar;
    }

    public final ayqj av() {
        aysw.c(16, "capacityHint");
        azlj azljVar = new azlj(this);
        ayrv ayrvVar = aynu.o;
        return azljVar;
    }

    public final ayqx aw() {
        return aM(aysu.d, aysu.e, aysu.c);
    }

    public final ayqx ax(ayrs ayrsVar) {
        return aM(ayrsVar, aysu.e, aysu.c);
    }

    public final ayqx ay(ayrs ayrsVar, ayrs ayrsVar2) {
        return aM(ayrsVar, ayrsVar2, aysu.c);
    }

    public final ayqx az(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        return aM(ayrsVar, ayrsVar2, ayrmVar);
    }

    protected abstract void f(ayqd ayqdVar);

    public final ayph g(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azhn azhnVar = new azhn(this, ayrvVar);
        ayrv ayrvVar2 = aynu.p;
        return azhnVar;
    }

    public final ayph h() {
        azim azimVar = new azim(this);
        ayrv ayrvVar = aynu.p;
        return azimVar;
    }

    public final aypn i(aypg aypgVar) {
        ayyj ayyjVar = new ayyj(this);
        aypg aypgVar2 = aypg.MISSING;
        int ordinal = aypgVar.ordinal();
        if (ordinal == 0) {
            return ayyjVar;
        }
        if (ordinal == 1) {
            ayzk ayzkVar = new ayzk(ayyjVar);
            ayrv ayrvVar = aynu.j;
            return ayzkVar;
        }
        if (ordinal != 3) {
            if (ordinal == 4) {
                return ayyjVar.G();
            }
            return ayyjVar.F();
        }
        ayzi ayziVar = new ayzi(ayyjVar);
        ayrv ayrvVar2 = aynu.j;
        return ayziVar;
    }

    public final ayps j() {
        azgy azgyVar = new azgy(this);
        ayrv ayrvVar = aynu.n;
        return azgyVar;
    }

    public final aypy k(Class cls) {
        return Y(aysu.a(cls));
    }

    public final aypy p(ayqc ayqcVar) {
        aysw.b(ayqcVar, "composer is null");
        ayqb a = ayqcVar.a(this);
        ayrv ayrvVar = aynu.l;
        return (aypy) a;
    }

    public final aypy r(ayrv ayrvVar, int i, int i2, boolean z) {
        aysw.b(ayrvVar, "mapper is null");
        aysw.c(i, "maxConcurrency");
        aysw.c(i2, "prefetch");
        azfz azfzVar = new azfz(this, ayrvVar, true != z ? 2 : 3, i, i2);
        ayrv ayrvVar2 = aynu.l;
        return azfzVar;
    }

    public final aypy s(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azhu azhuVar = new azhu(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azhuVar;
    }

    public final aypy t(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        aysw.c(2, "prefetch");
        azew azewVar = new azew(this, ayrvVar);
        ayrv ayrvVar2 = aynu.l;
        return azewVar;
    }

    public final aypy u(ayqb ayqbVar) {
        aysw.b(ayqbVar, "other is null");
        aysw.b(ayqbVar, "source2 is null");
        return q(this, ayqbVar);
    }

    public final aypy w(long j, TimeUnit timeUnit) {
        ayqi a = azre.a();
        aysw.b(timeUnit, "unit is null");
        aysw.b(a, "scheduler is null");
        azgf azgfVar = new azgf(this, j, timeUnit, a);
        ayrv ayrvVar = aynu.l;
        return azgfVar;
    }

    public final aypy x(Object obj) {
        azkk azkkVar = new azkk(this, W(obj));
        ayrv ayrvVar = aynu.l;
        return azkkVar;
    }

    public final aypy z(long j, TimeUnit timeUnit) {
        return aH(j, timeUnit, azre.a());
    }
}
