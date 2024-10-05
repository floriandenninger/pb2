package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahib implements Runnable {
    final /* synthetic */ ahic a;

    public ahib(ahic ahicVar) {
        this.a = ahicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            if (this.a.c) {
                Looper.prepare();
                this.a.d = new Handler();
                Looper.loop();
            }
        }
    }
}
