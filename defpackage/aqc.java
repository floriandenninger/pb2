package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqc extends aqe {
    public volatile aqb a;
    public volatile aqb b;
    public List c;
    private Executor k;

    public aqc(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        aqb aqbVar = this.a;
        Executor executor = this.k;
        if (aqbVar.f == 1) {
            aqbVar.f = 2;
            executor.execute(aqbVar.c);
            return;
        }
        int i = aqbVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void b(List list) {
        this.c = list;
        Object obj = this.e;
        if (obj != null) {
            if (apw.b(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(obj);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ((aow) obj).l(list);
            } else {
                ((aow) obj).j(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aqb aqbVar) {
        if (this.b == aqbVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.aqe
    public final void d() {
        if (this.a != null) {
            if (!this.g) {
                this.j = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
                this.a = null;
                return;
            }
            boolean z2 = this.a.a;
            aqb aqbVar = this.a;
            aqbVar.d.set(true);
            if (aqbVar.c.cancel(false)) {
                this.b = this.a;
            }
            this.a = null;
        }
    }
}
