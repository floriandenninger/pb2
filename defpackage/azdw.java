package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdw implements Runnable {
    final aypt a;
    final aypv b;

    public azdw(aypt ayptVar, aypv aypvVar) {
        this.a = ayptVar;
        this.b = aypvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.Y(this.a);
    }
}
