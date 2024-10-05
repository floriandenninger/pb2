package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aqi {
    private static Handler a;
    public volatile int f = 1;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();
    public final FutureTask c = new aqg(this, new aqf(this));

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Object obj) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Object obj) {
        Handler handler;
        synchronized (aqi.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        handler.post(new aqh(this, obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
