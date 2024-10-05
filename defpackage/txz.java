package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class txz extends BroadcastReceiver {
    static final AtomicBoolean a = new AtomicBoolean(false);
    public static final /* synthetic */ int b = 0;

    public static void b(tya tyaVar, Intent intent, twd twdVar, long j) {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(tyaVar.a(intent));
            tyaVar.b(intent, twdVar, j);
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }

    public abstract tya a(Context context);

    public abstract boolean c();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        if (intent == null) {
            tzk.c("ChimeBroadcastReceiver", new IllegalArgumentException(), "Null Intent received.", new Object[0]);
            return;
        }
        final long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        amkq.E(true);
        long j = (intent.getFlags() & 268435456) > 0 ? 8500L : 58500L;
        amkq.E(true);
        tvz e = twd.e();
        e.a = Long.valueOf(j);
        e.b(SystemClock.uptimeMillis());
        twd a2 = e.a();
        tzk.d("ChimeBroadcastReceiver", "Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        tzk.d("ChimeBroadcastReceiver", "Phenotype initialized.", new Object[0]);
        try {
            tzc a3 = tzb.a(context);
            a3.kf();
            tyo.j(context);
            a3.ke();
            if (c() && a3.aB().i) {
                tzk.d("ChimeBroadcastReceiver", "BroadcastReceiver disabled by host app in ChimeConfig", new Object[0]);
                return;
            }
            final tya a4 = a(context);
            if (a4.c(intent)) {
                tzk.d("ChimeBroadcastReceiver", "Validation OK for action [%s].", intent.getAction());
                tyu aG = tzb.a(context).aG();
                if (!tyo.m(context)) {
                    aG.d(new Runnable() { // from class: txx
                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2 = intent;
                            tya tyaVar = a4;
                            long j2 = micros;
                            int i = txz.b;
                            tzk.d("ChimeBroadcastReceiver", "Executing action in Service [%s].", intent2.getAction());
                            txz.b(tyaVar, intent2, twd.b(), j2);
                        }
                    });
                } else {
                    boolean compareAndSet = a.compareAndSet(false, true);
                    if (axru.a.get().c() && compareAndSet) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
                        if (elapsedRealtime <= axru.a.get().a()) {
                            a2 = a2.c(elapsedRealtime);
                        }
                    }
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    boolean isOrderedBroadcast = isOrderedBroadcast();
                    final twd twdVar = a2;
                    Runnable runnable = new Runnable() { // from class: txy
                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2 = intent;
                            tya tyaVar = a4;
                            twd twdVar2 = twdVar;
                            long j2 = micros;
                            int i = txz.b;
                            tzk.d("ChimeBroadcastReceiver", "Executing action in BroadcastReceiver [%s].", intent2.getAction());
                            txz.b(tyaVar, intent2, twdVar2, j2);
                        }
                    };
                    if (!axru.b()) {
                        a2 = twd.b();
                    }
                    aG.c(goAsync, isOrderedBroadcast, runnable, a2);
                }
            } else {
                tzk.d("ChimeBroadcastReceiver", "Validation failed for action [%s].", intent.getAction());
            }
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (IllegalStateException e2) {
            tzk.f("ChimeBroadcastReceiver", e2, "BroadcastReceiver stopped", new Object[0]);
        }
    }
}
