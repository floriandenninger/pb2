package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.cardboard.ExternalSurfaceManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgf implements axgc {
    private final Runnable a;
    private final long b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public axgf(long j, long j2) {
        this.a = new bapd(j, 1);
        this.b = j2;
    }

    @Override // defpackage.axgc
    public final void a() {
        this.c.removeCallbacks(this.a);
    }

    @Override // defpackage.axgc
    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }

    @Override // defpackage.axgc
    public final void c() {
        this.c.post(this.a);
    }
}
