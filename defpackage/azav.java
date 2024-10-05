package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azav implements Runnable {
    final banx a;
    final long b;

    public azav(banx banxVar, long j) {
        this.a = banxVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.sj(this.b);
    }
}
