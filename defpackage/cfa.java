package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfa {
    public final cdz a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new cez(this);

    public cfa(Executor executor) {
        this.a = new cdz(executor);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
