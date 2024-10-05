package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzn implements bzf {
    private final Handler a = ail.b(Looper.getMainLooper());

    @Override // defpackage.bzf
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.bzf
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
