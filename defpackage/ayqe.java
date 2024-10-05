package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayqe implements Runnable, ayqx {
    final Runnable a;
    final ayqh b;
    Thread c;

    public ayqe(Runnable runnable, ayqh ayqhVar) {
        this.a = runnable;
        this.b = ayqhVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.c == Thread.currentThread()) {
            ayqh ayqhVar = this.b;
            if (ayqhVar instanceof azoz) {
                azoz azozVar = (azoz) ayqhVar;
                if (azozVar.c) {
                    return;
                }
                azozVar.c = true;
                azozVar.b.shutdown();
                return;
            }
        }
        this.b.qc();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            qc();
            this.c = null;
        }
    }
}
