package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqc implements upq {
    public static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService");
    public final anic b;
    public final axpg c;

    public uqc(upp uppVar, final Context context, anic anicVar, axpg axpgVar, azrw azrwVar, azrw azrwVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        uppVar.a(anicVar, axpgVar, azrwVar);
        this.b = anicVar;
        this.c = axpgVar;
        amkq.x(new amnv() { // from class: upz
            @Override // defpackage.amnv
            public final Object get() {
                Object j;
                uqc uqcVar = uqc.this;
                Context context2 = context;
                synchronized (uqcVar) {
                    String b = uon.b();
                    String concat = String.valueOf(b).concat(".trace");
                    File filesDir = context2.getFilesDir();
                    String valueOf = String.valueOf(b);
                    File file = new File(filesDir, valueOf.length() != 0 ? "primes_profiling_".concat(valueOf) : new String("primes_profiling_"));
                    if (file.exists() || file.mkdir()) {
                        File file2 = new File(file, concat);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (RuntimeException e) {
                            ((amxh) ((amxh) ((amxh) uqc.a.c()).h(e)).i("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).q("Exception when clearing trace file.");
                        }
                        j = ammv.j(file2);
                    } else {
                        ((amxh) ((amxh) uqc.a.c()).i("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "lambda$new$0", 117, "CpuProfilingService.java")).q("Could not create directory");
                        j = amlr.a;
                    }
                }
                return j;
            }
        });
        amkq.x(new uqa(azrwVar2, 0));
    }

    @Override // defpackage.upq, defpackage.uyo
    public final void a() {
        anaf.R(new Runnable() { // from class: uqb
            @Override // java.lang.Runnable
            public final void run() {
                uqc.this.b();
            }
        }, this.b);
    }

    public final synchronized void b() {
    }
}
