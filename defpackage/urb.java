package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class urb extends ure implements uog, upq {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl");
    private final Application b;
    private final uok c;
    private final uqv d;
    private final ArrayMap e;
    private final upo f;
    private final azrw g;
    private final upw h;
    private final amnv i;
    private final azrw j;
    private final ura k;

    public urb(upp uppVar, Context context, uok uokVar, axpg axpgVar, uqv uqvVar, azrw azrwVar, azrw azrwVar2, Executor executor, upw upwVar, final azrw azrwVar3, boolean z) {
        ArrayMap arrayMap = new ArrayMap();
        this.e = arrayMap;
        amkq.N(Build.VERSION.SDK_INT >= 24);
        this.f = uppVar.a(executor, axpgVar, azrwVar2);
        Application application = (Application) context;
        this.b = application;
        this.c = uokVar;
        this.g = azrwVar;
        this.d = uqvVar;
        this.h = upwVar;
        this.i = amkq.x(new amnv() { // from class: uqx
            @Override // defpackage.amnv
            public final Object get() {
                return urb.this.e(azrwVar3);
            }
        });
        this.j = azrwVar3;
        this.k = new ura(new uqy(application, arrayMap));
    }

    @Override // defpackage.upq, defpackage.uyo
    public void a() {
        this.c.a(this.k);
        this.c.a(this.d);
    }

    public anhy c(Activity activity) {
        urc urcVar;
        baco bacoVar;
        int i;
        uqz a2 = uqz.a(activity);
        uue uueVar = this.f.c;
        boolean z = uueVar.c;
        uuj uujVar = uueVar.b;
        if (!z || !uujVar.c()) {
            return anhv.a;
        }
        synchronized (this.e) {
            urcVar = (urc) this.e.remove(a2);
            if (this.e.isEmpty()) {
                this.k.d();
            }
        }
        if (urcVar == null) {
            ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 377, "FrameMetricServiceImpl.java")).s("Measurement not found: %s", a2);
            return anhv.a;
        }
        String b = a2.b();
        if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
            for (urf urfVar : ((urg) this.j.get()).c) {
                int b2 = uqw.b(urfVar.b);
                if (b2 == 0) {
                    b2 = 1;
                }
                switch (b2 - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = urcVar.h;
                        break;
                    case 3:
                        i = urcVar.j;
                        break;
                    case 4:
                        i = urcVar.k;
                        break;
                    case 5:
                        i = urcVar.l;
                        break;
                    case 6:
                        i = urcVar.m;
                        break;
                    case 7:
                        i = urcVar.o;
                        break;
                    default:
                        ((amxh) ((amxh) a.c()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "endTraceSectionAndEmitCounters", 518, "FrameMetricServiceImpl.java")).s("UNKNOWN COUNTER with %s as the name", urfVar.c);
                        continue;
                }
                Trace.setCounter(urfVar.c.replace("%EVENT_NAME%", b), i);
            }
            Trace.endAsyncSection(String.format("J<%s>", b), 352691800);
        }
        if (urcVar.j != 0) {
            if (((urg) this.j.get()).d && urcVar.o <= TimeUnit.SECONDS.toMillis(9L) && urcVar.h != 0) {
                this.h.a((String) this.i.get());
            }
            aone createBuilder = bact.a.createBuilder();
            long d = urcVar.d.d();
            long j = urcVar.e;
            aone createBuilder2 = bacl.a.createBuilder();
            createBuilder2.copyOnWrite();
            bacl baclVar = (bacl) createBuilder2.instance;
            baclVar.b |= 16;
            baclVar.g = ((int) (d - j)) + 1;
            int i2 = urcVar.h;
            createBuilder2.copyOnWrite();
            bacl baclVar2 = (bacl) createBuilder2.instance;
            baclVar2.b |= 1;
            baclVar2.c = i2;
            int i3 = urcVar.j;
            createBuilder2.copyOnWrite();
            bacl baclVar3 = (bacl) createBuilder2.instance;
            baclVar3.b |= 2;
            baclVar3.d = i3;
            int i4 = urcVar.k;
            createBuilder2.copyOnWrite();
            bacl baclVar4 = (bacl) createBuilder2.instance;
            baclVar4.b |= 4;
            baclVar4.e = i4;
            int i5 = urcVar.m;
            createBuilder2.copyOnWrite();
            bacl baclVar5 = (bacl) createBuilder2.instance;
            baclVar5.b |= 32;
            baclVar5.h = i5;
            int i6 = urcVar.o;
            createBuilder2.copyOnWrite();
            bacl baclVar6 = (bacl) createBuilder2.instance;
            baclVar6.b |= 64;
            baclVar6.i = i6;
            int i7 = urcVar.l;
            createBuilder2.copyOnWrite();
            bacl baclVar7 = (bacl) createBuilder2.instance;
            baclVar7.b |= 8;
            baclVar7.f = i7;
            if (urcVar.p != Integer.MIN_VALUE) {
                int[] iArr = urc.c;
                int[] iArr2 = urcVar.g;
                int i8 = urcVar.p;
                aone createBuilder3 = baco.a.createBuilder();
                int i9 = 0;
                while (true) {
                    if (i9 < 52) {
                        if (iArr[i9] <= i8) {
                            int i10 = iArr2[i9];
                            if (i10 > 0 || (i9 > 0 && iArr2[i9 - 1] > 0)) {
                                createBuilder3.cf(i10);
                                createBuilder3.ce(iArr[i9]);
                            }
                            i9++;
                        } else {
                            createBuilder3.cf(0);
                            createBuilder3.ce(i8 + 1);
                            bacoVar = (baco) createBuilder3.build();
                        }
                    } else {
                        if (iArr2[51] > 0) {
                            createBuilder3.ce(i8 + 1);
                            createBuilder3.cf(0);
                        }
                        bacoVar = (baco) createBuilder3.build();
                    }
                }
                createBuilder2.copyOnWrite();
                bacl baclVar8 = (bacl) createBuilder2.instance;
                bacoVar.getClass();
                baclVar8.n = bacoVar;
                baclVar8.b |= 2048;
                int i11 = urcVar.i;
                createBuilder2.copyOnWrite();
                bacl baclVar9 = (bacl) createBuilder2.instance;
                baclVar9.b |= 512;
                baclVar9.l = i11;
                int i12 = urcVar.n;
                createBuilder2.copyOnWrite();
                bacl baclVar10 = (bacl) createBuilder2.instance;
                baclVar10.b |= 1024;
                baclVar10.m = i12;
            }
            for (int i13 = 0; i13 < 28; i13++) {
                if (urcVar.f[i13] > 0) {
                    aone createBuilder4 = back.a.createBuilder();
                    int i14 = urcVar.f[i13];
                    createBuilder4.copyOnWrite();
                    back backVar = (back) createBuilder4.instance;
                    backVar.b |= 1;
                    backVar.c = i14;
                    int i15 = urc.b[i13];
                    createBuilder4.copyOnWrite();
                    back backVar2 = (back) createBuilder4.instance;
                    backVar2.b |= 2;
                    backVar2.d = i15;
                    int i16 = i13 + 1;
                    if (i16 < 28) {
                        int i17 = urc.b[i16];
                        createBuilder4.copyOnWrite();
                        back backVar3 = (back) createBuilder4.instance;
                        backVar3.b |= 4;
                        backVar3.e = i17 - 1;
                    }
                    createBuilder2.copyOnWrite();
                    bacl baclVar11 = (bacl) createBuilder2.instance;
                    back backVar4 = (back) createBuilder4.build();
                    backVar4.getClass();
                    aony aonyVar = baclVar11.j;
                    if (!aonyVar.c()) {
                        baclVar11.j = aonm.mutableCopy(aonyVar);
                    }
                    baclVar11.j.add(backVar4);
                }
            }
            aone builder = ((bacl) createBuilder2.build()).toBuilder();
            int a3 = uqw.a(this.b);
            builder.copyOnWrite();
            bacl baclVar12 = (bacl) builder.instance;
            baclVar12.b |= 256;
            baclVar12.k = a3;
            createBuilder.copyOnWrite();
            bact bactVar = (bact) createBuilder.instance;
            bacl baclVar13 = (bacl) builder.build();
            baclVar13.getClass();
            bactVar.l = baclVar13;
            bactVar.b |= 2048;
            bact bactVar2 = (bact) createBuilder.build();
            upo upoVar = this.f;
            upj a4 = upk.a();
            a4.d(bactVar2);
            a4.b = null;
            a4.c = "Activity";
            a4.a = a2.b();
            a4.b(true);
            return upoVar.b(a4.a());
        }
        return anhv.a;
    }

    @Override // defpackage.uog
    public void d(Activity activity) {
        synchronized (this.e) {
            this.e.clear();
        }
    }

    public /* synthetic */ String e(azrw azrwVar) {
        return ((urg) azrwVar.get()).b.replace("%PACKAGE_NAME%", this.b.getPackageName());
    }

    public void f(Activity activity) {
        uqz a2 = uqz.a(activity);
        if (this.f.c(a2.b())) {
            synchronized (this.e) {
                if (this.e.size() >= 25) {
                    ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 305, "FrameMetricServiceImpl.java")).s("Too many concurrent measurements, ignoring %s", a2);
                    return;
                }
                urc urcVar = (urc) this.e.put(a2, (urc) this.g.get());
                if (urcVar != null) {
                    this.e.put(a2, urcVar);
                    ((amxh) ((amxh) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 318, "FrameMetricServiceImpl.java")).s("measurement already started: %s", a2);
                    return;
                }
                if (this.e.size() == 1) {
                    this.k.c();
                }
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    Trace.beginAsyncSection(String.format("J<%s>", a2.b()), 352691800);
                }
            }
        }
    }
}
