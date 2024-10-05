package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yuh implements ysl {
    private final yvg a;
    private final boolean b;
    private final ThreadPoolExecutor c;
    private final ThreadPoolExecutor d;
    private final yuy e;
    private final AtomicInteger f;

    @Override // defpackage.ysl
    public final yvo a(yvo yvoVar) {
        yue yueVar = (yue) this.e;
        yve yveVar = new yve(yueVar.o, yueVar.x, yvoVar);
        if (this.a.d(yvoVar, yveVar)) {
            return yvoVar;
        }
        d(yvoVar, yveVar);
        return yvoVar;
    }

    @Override // defpackage.ysl
    public final anhy b(yvo yvoVar) {
        SettableFuture f = SettableFuture.f();
        yvc yvcVar = new yvc(f, ((yue) this.e).x, yvoVar);
        if (this.a.d(yvoVar, yvcVar)) {
            return f;
        }
        d(yvoVar, yvcVar);
        return f;
    }

    @Override // defpackage.ysl
    public final void c() {
        if (this.b) {
            this.d.prestartAllCoreThreads();
            ThreadPoolExecutor threadPoolExecutor = this.c;
            if (threadPoolExecutor != this.d) {
                threadPoolExecutor.prestartAllCoreThreads();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(yvo yvoVar, yuf yufVar) {
        ThreadPoolExecutor threadPoolExecutor = yvoVar.i ? this.c : this.d;
        try {
            yuy yuyVar = this.e;
            threadPoolExecutor.execute(new yvi(threadPoolExecutor, yvoVar, yuyVar, this.a, yufVar, ((yue) yuyVar).s, String.valueOf(this.f.getAndIncrement())));
        } catch (RejectedExecutionException e) {
            yufVar.a(yvoVar, cnm.a(new cnq(e)));
        }
    }

    public yuh(yuy yuyVar) {
        yvg yvgVar;
        ThreadPoolExecutor u;
        this.e = yuyVar;
        yue yueVar = (yue) yuyVar;
        this.b = yueVar.f.c;
        boolean z = false;
        if (yueVar.w == null) {
            synchronized (yuyVar) {
                if (((yue) yuyVar).w == null) {
                    apdq apdqVar = ((yum) ((yue) yuyVar).p).a;
                    if (((yue) yuyVar).l == 1 || !apdqVar.d) {
                        u = yuyVar.u();
                    } else {
                        int i = apdqVar.f;
                        int i2 = apdqVar.g;
                        long j = apdqVar.e;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
                        String str = ((yue) yuyVar).m;
                        u = new ThreadPoolExecutor(i, i2, j, timeUnit, linkedBlockingDeque, new yna(0, str.length() != 0 ? "cronetPrio-".concat(str) : new String("cronetPrio-")));
                    }
                    ((yue) yuyVar).w = u;
                    if (((yue) yuyVar).w == null) {
                        throw new NullPointerException("priorityExecutor() cannot return null");
                    }
                }
            }
        }
        this.c = yueVar.w;
        this.d = yuyVar.u();
        if (!yueVar.u) {
            synchronized (yuyVar) {
                if (!((yue) yuyVar).u) {
                    apdx a = yny.a(((yue) yuyVar).d.a());
                    apdw apdwVar = a.i;
                    apdwVar = apdwVar == null ? apdw.a : apdwVar;
                    if ((a.b & 512) != 0 && apdwVar.c) {
                        z = true;
                    }
                    ((yue) yuyVar).t = z;
                    ((yue) yuyVar).u = true;
                }
            }
        }
        if (yueVar.t) {
            yvgVar = new yus(this);
        } else {
            yvgVar = yvg.b;
        }
        this.a = yvgVar;
        this.f = new AtomicInteger();
    }
}
