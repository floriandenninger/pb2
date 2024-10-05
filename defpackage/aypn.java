package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aypn implements banv {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static aypn B(Iterable iterable) {
        return w(iterable).t(aysu.a);
    }

    public static aypn C(banv banvVar, banv banvVar2) {
        aysw.b(banvVar, "source1 is null");
        aysw.b(banvVar2, "source2 is null");
        return u(banvVar, banvVar2).af(aysu.a, 2);
    }

    public static aypn D(banv banvVar, banv banvVar2, banv banvVar3) {
        return u(banvVar, banvVar2, banvVar3).af(aysu.a, 3);
    }

    public static aypn Q(long j, TimeUnit timeUnit) {
        return R(j, timeUnit, azre.a());
    }

    public static aypn R(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        aysw.b(timeUnit, "unit is null");
        aysw.b(ayqiVar, "scheduler is null");
        azbn azbnVar = new azbn(Math.max(0L, j), timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.j;
        return azbnVar;
    }

    public static aypn d(ayrv ayrvVar, banv... banvVarArr) {
        int i = a;
        aysw.b(ayrvVar, "combiner is null");
        aysw.c(i, "bufferSize");
        aywb aywbVar = new aywb(banvVarArr, ayrvVar, i);
        ayrv ayrvVar2 = aynu.j;
        return aywbVar;
    }

    public static aypn e(banv banvVar, banv banvVar2, ayro ayroVar) {
        aysw.b(banvVar, "source1 is null");
        aysw.b(banvVar2, "source2 is null");
        return d(aysu.c(ayroVar), banvVar, banvVar2);
    }

    public static aypn g(banv banvVar, banv banvVar2, banv banvVar3, banv banvVar4, ayru ayruVar) {
        aysw.b(banvVar2, "source2 is null");
        return d(aysu.e(ayruVar), banvVar, banvVar2, banvVar3, banvVar4);
    }

    public static aypn i(banv... banvVarArr) {
        aywd aywdVar = new aywd(banvVarArr);
        ayrv ayrvVar = aynu.j;
        return aywdVar;
    }

    public static aypn k(aypp ayppVar, aypg aypgVar) {
        aysw.b(ayppVar, "source is null");
        aysw.b(aypgVar, "mode is null");
        aywl aywlVar = new aywl(ayppVar, aypgVar);
        ayrv ayrvVar = aynu.j;
        return aywlVar;
    }

    public static aypn r() {
        aypn aypnVar = ayxh.b;
        ayrv ayrvVar = aynu.j;
        return aypnVar;
    }

    public static aypn sm(banv banvVar, banv banvVar2, banv banvVar3, ayrt ayrtVar) {
        aysw.b(banvVar, "source1 is null");
        aysw.b(banvVar2, "source2 is null");
        aysw.b(banvVar3, "source3 is null");
        return d(aysu.d(ayrtVar), banvVar, banvVar2, banvVar3);
    }

    public static aypn u(Object... objArr) {
        ayyc ayycVar = new ayyc(objArr);
        ayrv ayrvVar = aynu.j;
        return ayycVar;
    }

    public static aypn v(Future future) {
        ayyd ayydVar = new ayyd(future);
        ayrv ayrvVar = aynu.j;
        return ayydVar;
    }

    public static aypn w(Iterable iterable) {
        aysw.b(iterable, "source is null");
        ayyh ayyhVar = new ayyh(iterable);
        ayrv ayrvVar = aynu.j;
        return ayyhVar;
    }

    public static aypn z(Object obj) {
        aysw.b(obj, "item is null");
        ayyv ayyvVar = new ayyv(obj);
        ayrv ayrvVar = aynu.j;
        return ayyvVar;
    }

    public final aypn A(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        ayyy ayyyVar = new ayyy(this, ayrvVar);
        ayrv ayrvVar2 = aynu.j;
        return ayyyVar;
    }

    public final aypn E(ayqi ayqiVar) {
        int i = a;
        aysw.b(ayqiVar, "scheduler is null");
        aysw.c(i, "bufferSize");
        ayzc ayzcVar = new ayzc(this, ayqiVar, i);
        ayrv ayrvVar = aynu.j;
        return ayzcVar;
    }

    public final aypn F() {
        int i = a;
        aysw.c(i, "capacity");
        ayze ayzeVar = new ayze(this, i);
        ayrv ayrvVar = aynu.j;
        return ayzeVar;
    }

    public final aypn G() {
        ayzm ayzmVar = new ayzm(this);
        ayrv ayrvVar = aynu.j;
        return ayzmVar;
    }

    public final aypn H(ayro ayroVar) {
        aysw.b(ayroVar, "accumulator is null");
        azaj azajVar = new azaj(this, ayroVar);
        ayrv ayrvVar = aynu.j;
        return azajVar;
    }

    public final aypn I(Object obj, ayro ayroVar) {
        aysw.b(obj, "initialValue is null");
        Callable f = aysu.f(obj);
        aysw.b(ayroVar, "accumulator is null");
        azal azalVar = new azal(this, f, ayroVar);
        ayrv ayrvVar = aynu.j;
        return azalVar;
    }

    public final aypn J() {
        int i = a;
        aysw.c(i, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        ayzs ayzsVar = new ayzs(new ayzp(atomicReference, i), this, atomicReference, i);
        ayrv ayrvVar = aynu.k;
        return ayzsVar.c();
    }

    public final aypn K(Object obj) {
        return i(z(obj), this);
    }

    public final aypn L(ayqi ayqiVar) {
        aysw.b(ayqiVar, "scheduler is null");
        aysw.b(ayqiVar, "scheduler is null");
        azax azaxVar = new azax(this, ayqiVar, !(this instanceof aywl));
        ayrv ayrvVar = aynu.j;
        return azaxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypn M(ayrv ayrvVar) {
        int i = a;
        aysw.b(ayrvVar, "mapper is null");
        aysw.c(i, "bufferSize");
        if (this instanceof aytd) {
            Object call = ((aytd) this).call();
            if (call == null) {
                return r();
            }
            return aype.a(call, ayrvVar);
        }
        azba azbaVar = new azba(this, ayrvVar, i);
        ayrv ayrvVar2 = aynu.j;
        return azbaVar;
    }

    public final aypn N(ayrv ayrvVar) {
        aysw.b(ayrvVar, "mapper is null");
        azer azerVar = new azer(this, ayrvVar);
        ayrv ayrvVar2 = aynu.j;
        return azerVar;
    }

    public final aypn O(ayrw ayrwVar) {
        aysw.b(ayrwVar, "stopPredicate is null");
        azbh azbhVar = new azbh(this, ayrwVar);
        ayrv ayrvVar = aynu.j;
        return azbhVar;
    }

    public final aypn P(banv banvVar) {
        aysw.b(banvVar, "other is null");
        azbf azbfVar = new azbf(this, banvVar);
        ayrv ayrvVar = aynu.j;
        return azbfVar;
    }

    public final aypn S(banv banvVar, ayro ayroVar) {
        aysw.b(banvVar, "other is null");
        aysw.b(ayroVar, "combiner is null");
        azbu azbuVar = new azbu(this, ayroVar, banvVar);
        ayrv ayrvVar = aynu.j;
        return azbuVar;
    }

    public final aypn T(banv banvVar, banv banvVar2, ayrt ayrtVar) {
        aysw.b(banvVar, "source1 is null");
        aysw.b(banvVar2, "source2 is null");
        azbx azbxVar = new azbx(this, new banv[]{banvVar, banvVar2}, aysu.d(ayrtVar));
        ayrv ayrvVar = aynu.j;
        return azbxVar;
    }

    public final aypy U() {
        azic azicVar = new azic(this);
        ayrv ayrvVar = aynu.l;
        return azicVar;
    }

    public final ayqj V(Object obj) {
        azap azapVar = new azap(this, obj, 1);
        ayrv ayrvVar = aynu.o;
        return azapVar;
    }

    public final ayqx W() {
        return ao(aysu.d, aysu.e, ayyu.a);
    }

    public final ayqx X(ayrs ayrsVar) {
        return ao(ayrsVar, aysu.e, ayyu.a);
    }

    public final ayqx Y(ayrs ayrsVar, ayrs ayrsVar2) {
        return ao(ayrsVar, ayrsVar2, ayyu.a);
    }

    public final Object Z() {
        azpr azprVar = new azpr();
        aa(azprVar);
        if (azprVar.getCount() != 0) {
            try {
                boolean z = aynu.x;
                azprVar.await();
            } catch (InterruptedException e) {
                banx banxVar = azprVar.c;
                azprVar.c = azqb.a;
                if (banxVar != null) {
                    banxVar.sd();
                }
                throw azqi.b(e);
            }
        }
        Throwable th = azprVar.b;
        if (th == null) {
            Object obj = azprVar.a;
            if (obj != null) {
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw azqi.b(th);
    }

    public final void aa(aypq aypqVar) {
        aysw.b(aypqVar, "s is null");
        try {
            ayro ayroVar = aynu.r;
            aysw.b(aypqVar, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            ac(aypqVar);
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

    @Override // defpackage.banv
    public final void ab(banw banwVar) {
        if (banwVar instanceof aypq) {
            aa((aypq) banwVar);
        } else {
            aysw.b(banwVar, "s is null");
            aa(new azpu(banwVar));
        }
    }

    protected abstract void ac(banw banwVar);

    public final aypn ad(int i) {
        azqe azqeVar = azqe.a;
        aysw.c(i, "count");
        aysw.c(1, "skip");
        aysw.b(azqeVar, "bufferSupplier is null");
        ayvx ayvxVar = new ayvx(this, i, azqeVar);
        ayrv ayrvVar = aynu.j;
        return ayvxVar;
    }

    public final aypn ae(ayrv ayrvVar) {
        return ag(ayrvVar, Integer.MAX_VALUE, a);
    }

    public final aypn af(ayrv ayrvVar, int i) {
        return ag(ayrvVar, i, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aypn ag(ayrv ayrvVar, int i, int i2) {
        aysw.b(ayrvVar, "mapper is null");
        aysw.c(i, "maxConcurrency");
        aysw.c(i2, "bufferSize");
        if (this instanceof aytd) {
            Object call = ((aytd) this).call();
            if (call == null) {
                return r();
            }
            return aype.a(call, ayrvVar);
        }
        ayxn ayxnVar = new ayxn(this, ayrvVar, i, i2);
        ayrv ayrvVar2 = aynu.j;
        return ayxnVar;
    }

    public final ayrk ah() {
        aysw.c(1, "bufferSize");
        azac azacVar = new azac(0);
        AtomicReference atomicReference = new AtomicReference();
        azag azagVar = new azag(new azad(atomicReference, azacVar), this, atomicReference, azacVar);
        ayrv ayrvVar = aynu.k;
        return azagVar;
    }

    public final aypn ai() {
        azar azarVar = new azar(this);
        ayrv ayrvVar = aynu.j;
        return azarVar;
    }

    public final aypn aj() {
        azbc azbcVar = new azbc(this);
        ayrv ayrvVar = aynu.j;
        return azbcVar;
    }

    public final aypn ak(TimeUnit timeUnit) {
        ayqi a2 = azre.a();
        aysw.b(timeUnit, "unit is null");
        aysw.b(a2, "scheduler is null");
        azbj azbjVar = new azbj(this, timeUnit, a2);
        ayrv ayrvVar = aynu.j;
        return azbjVar;
    }

    public final aypn al(TimeUnit timeUnit) {
        return l(5000L, timeUnit);
    }

    public final aypn am(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        aysw.b(ayrsVar, "onNext is null");
        aysw.b(ayrsVar2, "onError is null");
        aysw.b(ayrmVar, "onComplete is null");
        aywz aywzVar = new aywz(this, ayrsVar, ayrsVar2, ayrmVar);
        ayrv ayrvVar = aynu.j;
        return aywzVar;
    }

    public final aypn an(ayrs ayrsVar, ayrm ayrmVar) {
        aysw.b(ayrsVar, "onSubscribe is null");
        aysw.b(ayrmVar, "onCancel is null");
        ayxb ayxbVar = new ayxb(this, ayrsVar, ayrmVar);
        ayrv ayrvVar = aynu.j;
        return ayxbVar;
    }

    public final ayqx ao(ayrs ayrsVar, ayrs ayrsVar2, ayrs ayrsVar3) {
        aysw.b(ayrsVar, "onNext is null");
        aysw.b(ayrsVar2, "onError is null");
        aysw.b(ayrsVar3, "onSubscribe is null");
        azps azpsVar = new azps(ayrsVar, ayrsVar2, ayrsVar3);
        aa(azpsVar);
        return azpsVar;
    }

    public final aypn h(aypr ayprVar) {
        aysw.b(ayprVar, "composer is null");
        banv a2 = ayprVar.a(this);
        if (a2 instanceof aypn) {
            ayrv ayrvVar = aynu.j;
        } else {
            aysw.b(a2, "source is null");
            ayyk ayykVar = new ayyk(a2);
            ayrv ayrvVar2 = aynu.j;
            a2 = ayykVar;
        }
        return (aypn) a2;
    }

    public final aypn j(banv banvVar) {
        aysw.b(banvVar, "other is null");
        aysw.b(banvVar, "source2 is null");
        return i(this, banvVar);
    }

    public final aypn l(long j, TimeUnit timeUnit) {
        return m(j, timeUnit, azre.a());
    }

    public final aypn m(long j, TimeUnit timeUnit, ayqi ayqiVar) {
        aysw.b(timeUnit, "unit is null");
        aysw.b(ayqiVar, "scheduler is null");
        aywo aywoVar = new aywo(this, j, timeUnit, ayqiVar);
        ayrv ayrvVar = aynu.j;
        return aywoVar;
    }

    public final aypn n() {
        return o(aysu.a);
    }

    public final aypn o(ayrv ayrvVar) {
        aysw.b(ayrvVar, "keySelector is null");
        ayww aywwVar = new ayww(this, ayrvVar);
        ayrv ayrvVar2 = aynu.j;
        return aywwVar;
    }

    public final aypn p(ayrs ayrsVar) {
        return am(aysu.d, ayrsVar, aysu.c);
    }

    public final aypn q(ayrs ayrsVar) {
        return am(ayrsVar, aysu.d, aysu.c);
    }

    public final aypn s(ayrw ayrwVar) {
        aysw.b(ayrwVar, "predicate is null");
        ayxk ayxkVar = new ayxk(this, ayrwVar);
        ayrv ayrvVar = aynu.j;
        return ayxkVar;
    }

    public final aypn t(ayrv ayrvVar) {
        int i = a;
        return ag(ayrvVar, i, i);
    }

    public final aypn x(ayrv ayrvVar) {
        int i = a;
        aysw.b(ayrvVar, "keySelector is null");
        aysw.c(i, "bufferSize");
        ayyn ayynVar = new ayyn(this, ayrvVar, i);
        ayrv ayrvVar2 = aynu.j;
        return ayynVar;
    }

    public final aypn y() {
        ayyp ayypVar = new ayyp(this);
        ayrv ayrvVar = aynu.j;
        return ayypVar;
    }
}
