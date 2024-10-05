package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axfk implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ axfl c;

    public axfk(axfl axflVar, long j, long j2) {
        this.c = axflVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.f(this.a, this.b);
    }
}
