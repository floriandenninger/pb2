package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyx implements tyu {
    private static final AtomicInteger c = new AtomicInteger();
    public Context a;
    public ExecutorService b;

    @Override // defpackage.tyu
    public final Future a(Callable callable) {
        return this.b.submit(callable);
    }

    @Override // defpackage.tyu
    public final void b(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // defpackage.tyu
    public final void c(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, twd twdVar) {
        int incrementAndGet = c.incrementAndGet();
        boolean b = axru.b();
        final tyt tytVar = new tyt(pendingResult, z, incrementAndGet);
        if (b && !twdVar.d()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tyv
                @Override // java.lang.Runnable
                public final void run() {
                    tyt.this.a();
                }
            }, twdVar.a());
        }
        PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
        String valueOf = String.valueOf(this.a.getPackageName());
        this.b.execute(new tyw(incrementAndGet, powerManager.newWakeLock(1, valueOf.length() != 0 ? "ChimeExecutorApi::".concat(valueOf) : new String("ChimeExecutorApi::")), runnable, b, tytVar, z, pendingResult));
    }

    @Override // defpackage.tyu
    public final void d(Runnable runnable) {
        ChimeExecutorApiService.b(this.a, runnable);
    }
}
