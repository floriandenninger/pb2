package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ceg implements Runnable {
    public static final /* synthetic */ int g = 0;
    final Context a;
    final cda b;
    final ListenableWorker c;
    final byu d;
    final cfa e;
    public final cex f = cex.h();

    static {
        ajbh.S("WorkForegroundRunnable");
    }

    public ceg(Context context, cda cdaVar, ListenableWorker listenableWorker, byu byuVar, cfa cfaVar) {
        this.a = context;
        this.b = cdaVar;
        this.c = listenableWorker;
        this.d = byuVar;
        this.e = cfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b.q || aij.f()) {
            this.f.e(null);
            return;
        }
        cex h = cex.h();
        this.e.c.execute(new cee(h));
        h.d(new cef(this, h), this.e.c);
    }
}
