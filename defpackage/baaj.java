package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class baaj extends azxb {
    private final baah b;

    public baaj(int i, int i2, long j) {
        this.b = new baah(i, i2, j);
    }

    public void close() {
        this.b.close();
    }

    public final void e(Runnable runnable, baan baanVar, boolean z) {
        runnable.getClass();
        try {
            this.b.a(runnable, baanVar, z);
        } catch (RejectedExecutionException unused) {
            azwr.b.l(baah.g(runnable, baanVar));
        }
    }

    @Override // defpackage.azwj
    public final void so(azsv azsvVar, Runnable runnable) {
        azsvVar.getClass();
        try {
            baah.e(this.b, runnable);
        } catch (RejectedExecutionException unused) {
            azwr.b.so(azsvVar, runnable);
        }
    }

    @Override // defpackage.azwj
    public String toString() {
        return super.toString() + "[scheduler = " + this.b + ']';
    }
}
