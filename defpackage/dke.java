package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dke extends Handler implements dkf {
    public dke(Looper looper) {
        super(looper);
    }

    @Override // defpackage.dkf
    public final void a(Runnable runnable) {
        removeCallbacks(runnable);
    }

    @Override // defpackage.dkf
    public final void b() {
    }

    @Override // defpackage.dkf
    public final void c(Runnable runnable) {
        post(runnable);
    }
}
