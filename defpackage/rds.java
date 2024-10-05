package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rds implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ rdt b;

    public rds(rdt rdtVar, long j) {
        this.b = rdtVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f(this.a);
    }
}
