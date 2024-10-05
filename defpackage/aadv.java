package defpackage;

import android.os.ConditionVariable;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aadv implements MessageQueue.IdleHandler, aadr {
    public final azrw b;
    public volatile int d;
    public final aads f;
    public acpg g;
    private final Executor h;
    public final ConditionVariable c = new ConditionVariable();
    public final FutureTask e = new FutureTask(new Callable() { // from class: aadu
        @Override // java.util.concurrent.Callable
        public final Object call() {
            aadv aadvVar = aadv.this;
            aadvVar.d = ((aosf) ((ywr) aadvVar.f.a.get()).c()).c;
            try {
                boolean z = false;
                if (aadvVar.d != 0) {
                    int a = ((zfy) aadvVar.b.get()).a("failsafe_maxnumber_uncaught_exception", -1);
                    if (a <= 0) {
                        aadvVar.d = 0;
                        aadvVar.f.a();
                    } else if (aadvVar.d >= a) {
                        z = true;
                    }
                }
                aadvVar.c.open();
                return Boolean.valueOf(z);
            } catch (Throwable th) {
                aadvVar.c.open();
                throw th;
            }
        }
    });

    public aadv(azrw azrwVar, Executor executor, aads aadsVar) {
        this.b = azrwVar;
        this.h = executor;
        this.f = aadsVar;
    }

    @Override // defpackage.aadr
    public final ConditionVariable a() {
        return this.c;
    }

    @Override // defpackage.aadr
    public final /* synthetic */ Future b() {
        return this.e;
    }

    @Override // defpackage.aadr
    public final void c() {
        aads aadsVar = this.f;
        aadsVar.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(aadsVar);
    }

    @Override // defpackage.aadr
    public final void d(Executor executor) {
        if (executor != null) {
            executor.execute(this.e);
        } else {
            this.e.run();
        }
    }

    @Override // defpackage.aadr
    public final void e(acpg acpgVar) {
        yjk.f();
        this.g = acpgVar;
        Looper.myQueue().addIdleHandler(this);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.h.execute(new Runnable() { // from class: aadt
            @Override // java.lang.Runnable
            public final void run() {
                aadv aadvVar = aadv.this;
                aadvVar.f.c = true;
                try {
                    if (((Boolean) aadvVar.e.get()).booleanValue() || aadvVar.d != 0) {
                        acpg acpgVar = aadvVar.g;
                        int i = aadvVar.d;
                        boolean booleanValue = ((Boolean) aadvVar.e.get()).booleanValue();
                        boolean e = acpgVar.b.e("failsafe_clear_cache_release_13_02", false);
                        aone createBuilder = auxr.a.createBuilder();
                        createBuilder.copyOnWrite();
                        auxr auxrVar = (auxr) createBuilder.instance;
                        auxrVar.b = 1 | auxrVar.b;
                        auxrVar.c = booleanValue;
                        createBuilder.copyOnWrite();
                        auxr auxrVar2 = (auxr) createBuilder.instance;
                        auxrVar2.b |= 4;
                        auxrVar2.d = i;
                        createBuilder.copyOnWrite();
                        auxr auxrVar3 = (auxr) createBuilder.instance;
                        auxrVar3.b |= 8;
                        auxrVar3.e = e;
                        auxr auxrVar4 = (auxr) createBuilder.build();
                        arpn a = arpp.a();
                        a.copyOnWrite();
                        ((arpp) a.instance).dH(auxrVar4);
                        ((acpl) acpgVar.a.get()).c((arpp) a.build());
                    }
                    aadvVar.f.a();
                } catch (InterruptedException | ExecutionException unused) {
                    afsi.b(2, 18, "Fail to read crashcounter");
                }
            }
        });
        return false;
    }
}
