package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bpx {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Runnable b;
    public long c;
    public long d;
    public boolean e;

    public bpx(Runnable runnable) {
        this.b = runnable;
    }
}
