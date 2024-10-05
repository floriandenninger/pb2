package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tcy implements Runnable {
    final /* synthetic */ tcz a;

    public tcy(tcz tczVar) {
        this.a = tczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.getStatus() != AsyncTask.Status.FINISHED) {
            this.a.cancel(true);
            this.a.a(15, 15);
        }
    }
}
