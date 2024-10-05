package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axkh implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Handler b;
    final /* synthetic */ axki c;

    public axkh(axki axkiVar, Runnable runnable, Handler handler) {
        this.c = axkiVar;
        this.a = runnable;
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        this.b.removeCallbacks(this);
        this.b.postDelayed(this, this.c.c);
    }
}
