package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayqf implements Runnable, ayqx {
    final Runnable a;
    final ayqh b;
    volatile boolean c;

    public ayqf(Runnable runnable, ayqh ayqhVar) {
        this.a = runnable;
        this.b = ayqhVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c = true;
        this.b.qc();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            aynu.c(th);
            this.b.qc();
            throw azqi.b(th);
        }
    }
}
