package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afhk implements Runnable {
    final /* synthetic */ afhl a;
    private final /* synthetic */ int b;

    public afhk(afhl afhlVar, int i) {
        this.b = i;
        this.a = afhlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            afhl afhlVar = this.a;
            afhlVar.d.unregisterListener(afhlVar);
            Looper.myLooper().quit();
            return;
        }
        Looper.prepare();
        this.a.g = new Handler();
        afhl afhlVar2 = this.a;
        if (!afhlVar2.d.registerListener(afhlVar2, afhlVar2.e, afhl.b, this.a.g)) {
            this.a.e = null;
        }
        Looper.loop();
    }
}
