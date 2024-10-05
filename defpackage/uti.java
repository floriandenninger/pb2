package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uti extends uou implements uog, upq {
    public static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl");
    public static final long b = TimeUnit.HOURS.toMillis(12);
    public final upo c;
    public final Application d;
    public final axpg e;
    public final uty f;
    private final uok g;
    private final Executor h;

    public uti(upp uppVar, Context context, uok uokVar, Executor executor, axpg axpgVar, uty utyVar, azrw azrwVar) {
        super(null);
        this.c = uppVar.a(executor, axpgVar, azrwVar);
        this.h = executor;
        this.d = (Application) context;
        this.e = axpgVar;
        this.f = utyVar;
        this.g = uokVar;
    }

    @Override // defpackage.upq, defpackage.uyo
    public final void a() {
        this.g.a(this);
    }

    @Override // defpackage.uog
    public final void d(Activity activity) {
        this.g.b(this);
        anaf.T(new anfy() { // from class: uth
            @Override // defpackage.anfy
            public final anhy a() {
                uti utiVar = uti.this;
                if (((utg) utiVar.e.get()).a) {
                    ((amxh) ((amxh) uti.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 104, "StorageMetricServiceImpl.java")).q("Ignoring storage metric request, triggering mechanism didn't match manual capture configuration");
                    return anhv.a;
                }
                if (slf.e(utiVar.d)) {
                    uqq.i();
                    uty utyVar = utiVar.f;
                    long j = uti.b;
                    uqq.i();
                    if (slf.e(utyVar.b)) {
                        long j2 = -1;
                        long j3 = slf.e(utyVar.b) ? ((SharedPreferences) utyVar.d.get()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                        long d = utyVar.c.d();
                        if (d < j3) {
                            if (!((SharedPreferences) utyVar.d.get()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                                ((amxh) ((amxh) uty.a.c()).i("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 50, "PersistentRateLimiting.java")).q("Failure storing timestamp to SharedPreferences");
                            }
                            j2 = -1;
                            j3 = -1;
                        }
                        if (j3 != j2 && d <= j3 + j) {
                            ((amxh) ((amxh) uti.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 114, "StorageMetricServiceImpl.java")).q("Ignoring storage metric request, storage metric collection occurred too recently.");
                            return anhv.a;
                        }
                    }
                    if (!utiVar.c.c(null)) {
                        return anhv.a;
                    }
                    PackageStats a2 = utd.a(utiVar.d);
                    if (a2 == null) {
                        return anaf.N(new IllegalStateException("PackageStats capture failed."));
                    }
                    aone createBuilder = bact.a.createBuilder();
                    aone createBuilder2 = bacn.a.createBuilder();
                    long j4 = a2.cacheSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar = (bacn) createBuilder2.instance;
                    bacnVar.b |= 1;
                    bacnVar.c = j4;
                    long j5 = a2.codeSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar2 = (bacn) createBuilder2.instance;
                    bacnVar2.b |= 2;
                    bacnVar2.d = j5;
                    long j6 = a2.dataSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar3 = (bacn) createBuilder2.instance;
                    bacnVar3.b |= 4;
                    bacnVar3.e = j6;
                    long j7 = a2.externalCacheSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar4 = (bacn) createBuilder2.instance;
                    bacnVar4.b |= 8;
                    bacnVar4.f = j7;
                    long j8 = a2.externalCodeSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar5 = (bacn) createBuilder2.instance;
                    bacnVar5.b |= 16;
                    bacnVar5.g = j8;
                    long j9 = a2.externalDataSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar6 = (bacn) createBuilder2.instance;
                    bacnVar6.b |= 32;
                    bacnVar6.h = j9;
                    long j10 = a2.externalMediaSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar7 = (bacn) createBuilder2.instance;
                    bacnVar7.b |= 64;
                    bacnVar7.i = j10;
                    long j11 = a2.externalObbSize;
                    createBuilder2.copyOnWrite();
                    bacn bacnVar8 = (bacn) createBuilder2.instance;
                    bacnVar8.b |= 128;
                    bacnVar8.j = j11;
                    aone builder = ((bacn) createBuilder2.build()).toBuilder();
                    ammv ammvVar = ((utg) utiVar.e.get()).b;
                    createBuilder.copyOnWrite();
                    bact bactVar = (bact) createBuilder.instance;
                    bacn bacnVar9 = (bacn) builder.build();
                    bacnVar9.getClass();
                    bactVar.j = bacnVar9;
                    bactVar.b |= 256;
                    uty utyVar2 = utiVar.f;
                    if (!slf.e(utyVar2.b) || !((SharedPreferences) utyVar2.d.get()).edit().putLong("primes.packageMetric.lastSendTime", utyVar2.c.d()).commit()) {
                        ((amxh) ((amxh) uti.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 147, "StorageMetricServiceImpl.java")).q("Failure storing timestamp persistently");
                    }
                    upo upoVar = utiVar.c;
                    upj a3 = upk.a();
                    a3.d((bact) createBuilder.build());
                    return upoVar.b(a3.a());
                }
                ((amxh) ((amxh) uti.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 110, "StorageMetricServiceImpl.java")).q("Device locked.");
                return anhv.a;
            }
        }, this.h);
    }
}
