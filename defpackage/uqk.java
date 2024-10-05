package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqk extends uqg implements upq, unz, uog, uoe {
    public static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl");
    volatile und b;
    public final axpg c;
    public volatile boolean d;
    private final boolean f;
    private final Context g;
    private final Executor h;
    private final upo i;
    private final ammv j;
    private final uok k;
    private final Runnable p;
    private final ajoy q;
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicInteger l = new AtomicInteger();
    private final AtomicInteger m = new AtomicInteger();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicBoolean o = new AtomicBoolean(false);

    public uqk(upp uppVar, Context context, Executor executor, axpg axpgVar, ammv ammvVar, uok uokVar, ajoy ajoyVar, final azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = axpgVar;
        this.j = ammvVar;
        this.k = uokVar;
        this.q = ajoyVar;
        this.i = uppVar.a(angq.a, axpgVar, null);
        this.g = context;
        this.h = executor;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        this.f = bool.booleanValue();
        this.p = new Runnable() { // from class: uqi
            @Override // java.lang.Runnable
            public final void run() {
                uqk.this.d = ((Boolean) azrwVar.get()).booleanValue();
            }
        };
    }

    private final void i(final bacq bacqVar, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        anaf.T(new anfy() { // from class: uqh
            @Override // defpackage.anfy
            public final anhy a() {
                uqk uqkVar = uqk.this;
                AtomicInteger atomicInteger2 = atomicInteger;
                bacq bacqVar2 = bacqVar;
                if (atomicInteger2.getAndDecrement() <= 0) {
                    return anhv.a;
                }
                return uqkVar.f(bacqVar2, (uqf) uqkVar.c.get());
            }
        }, this.h);
    }

    @Override // defpackage.upq, defpackage.uyo
    public final void a() {
        ((uql) ((azrw) ((amna) this.j).a).get()).a(this);
        this.k.a(this);
        i(bacq.PRIMES_CRASH_MONITORING_INITIALIZED, this.l);
        if (this.f) {
            e();
        }
        anaf.R(this.p, this.h);
    }

    @Override // defpackage.unz
    public final void b(Activity activity, Bundle bundle) {
        ((amxh) ((amxh) a.c()).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 294, "CrashMetricServiceImpl.java")).q("onActivityCreated");
        if (this.o.getAndSet(true)) {
            return;
        }
        i(bacq.PRIMES_FIRST_ACTIVITY_LAUNCHED, this.m);
    }

    @Override // defpackage.uoe
    public final void c(Activity activity) {
        und undVar;
        Class<?> cls = activity.getClass();
        if (!ammx.e(null)) {
            String valueOf = String.valueOf(cls.getSimpleName());
            undVar = new und(valueOf.length() != 0 ? "null".concat(valueOf) : new String("null"));
        } else {
            undVar = new und(cls.getSimpleName());
        }
        this.b = undVar;
    }

    @Override // defpackage.uog
    public final void d(Activity activity) {
        this.b = null;
    }

    @Override // defpackage.uqg
    public final void e() {
        if (this.e.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new uqj(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy f(bacq bacqVar, uqf uqfVar) {
        if (uqfVar.b()) {
            float f = uqfVar.a;
            utz D = this.q.D(f / 100.0f);
            if (D.b.nextFloat() >= D.a) {
                return anhv.a;
            }
            upo upoVar = this.i;
            upj a2 = upk.a();
            aone createBuilder = bact.a.createBuilder();
            aone createBuilder2 = bacr.a.createBuilder();
            createBuilder2.copyOnWrite();
            bacr bacrVar = (bacr) createBuilder2.instance;
            bacrVar.b |= 2;
            bacrVar.d = (int) (100.0f / f);
            createBuilder2.copyOnWrite();
            bacr bacrVar2 = (bacr) createBuilder2.instance;
            bacrVar2.c = bacqVar.getNumber();
            bacrVar2.b |= 1;
            createBuilder.copyOnWrite();
            bact bactVar = (bact) createBuilder.instance;
            bacr bacrVar3 = (bacr) createBuilder2.build();
            bacrVar3.getClass();
            bactVar.i = bacrVar3;
            bactVar.b |= 128;
            a2.d((bact) createBuilder.build());
            return upoVar.b(a2.a());
        }
        return anhv.a;
    }

    public final void g(bach bachVar) {
        unw unwVar;
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        uqf uqfVar = (uqf) this.c.get();
        if (uqfVar.b()) {
            if (this.d) {
                unx unxVar = this.i.e;
                synchronized (unxVar.a) {
                    if (unxVar.a.isEmpty()) {
                        unwVar = unw.a;
                    } else {
                        unwVar = new unw((uny[]) unxVar.a.values().toArray(new uny[0]));
                    }
                }
            } else {
                unwVar = null;
            }
            upo upoVar = this.i;
            upj a2 = upk.a();
            aone createBuilder = bact.a.createBuilder();
            createBuilder.copyOnWrite();
            bact bactVar = (bact) createBuilder.instance;
            bachVar.getClass();
            bactVar.h = bachVar;
            bactVar.b |= 64;
            a2.d((bact) createBuilder.build());
            a2.b = null;
            a2.e = unwVar;
            upoVar.b(a2.a());
            while (this.l.getAndDecrement() > 0) {
                f(bacq.PRIMES_CRASH_MONITORING_INITIALIZED, uqfVar);
            }
            while (this.m.getAndDecrement() > 0) {
                f(bacq.PRIMES_FIRST_ACTIVITY_LAUNCHED, uqfVar);
            }
            while (this.n.getAndDecrement() > 0) {
                f(bacq.PRIMES_CUSTOM_LAUNCHED, uqfVar);
            }
        }
    }

    public final aone h() {
        aone createBuilder = bach.a.createBuilder();
        createBuilder.copyOnWrite();
        bach.a((bach) createBuilder.instance);
        und undVar = this.b;
        String str = undVar == null ? null : undVar.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            bach bachVar = (bach) createBuilder.instance;
            bachVar.b |= 4;
            bachVar.e = str;
        }
        try {
            aone createBuilder2 = bacd.a.createBuilder();
            bacc s = uou.s(this.g);
            createBuilder2.copyOnWrite();
            bacd bacdVar = (bacd) createBuilder2.instance;
            s.getClass();
            bacdVar.c = s;
            bacdVar.b |= 1;
            createBuilder.copyOnWrite();
            bach bachVar2 = (bach) createBuilder.instance;
            bacd bacdVar2 = (bacd) createBuilder2.build();
            bacdVar2.getClass();
            bachVar2.d = bacdVar2;
            bachVar2.b |= 2;
        } catch (RuntimeException e) {
            ((amxh) ((amxh) ((amxh) a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "createCrashMetric", (char) 212, "CrashMetricServiceImpl.java")).q("Failed to get process stats.");
        }
        return createBuilder;
    }
}
