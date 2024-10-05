package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axfj implements Runnable {
    final /* synthetic */ ozh a;
    final /* synthetic */ axfl b;

    public axfj(axfl axflVar, ozh ozhVar) {
        this.b = axflVar;
        this.a = ozhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.e(this.a);
    }
}
