package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpr implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ qpu b;

    public qpr(qpu qpuVar, int i) {
        this.b = qpuVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k(this.a);
    }
}
