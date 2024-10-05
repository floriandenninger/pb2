package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class goh implements Runnable {
    final /* synthetic */ goi a;

    public goh(goi goiVar) {
        this.a = goiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            Runnable runnable = this.a.a;
            if (runnable != null) {
                runnable.run();
                this.a.a = null;
            }
        }
    }
}
