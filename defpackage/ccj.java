package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccj implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ SystemForegroundService b;

    public ccj(SystemForegroundService systemForegroundService, int i) {
        this.b = systemForegroundService;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.cancel(this.a);
    }
}
