package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iyy implements Runnable {
    final /* synthetic */ iyz a;

    public iyy(iyz iyzVar) {
        this.a = iyzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iyz iyzVar = this.a;
        if (iyzVar.c.compareAndSet(0, 1)) {
            iyzVar.a.addAll(iyzVar.b.a());
            iyzVar.c.compareAndSet(1, 2);
        }
    }
}
