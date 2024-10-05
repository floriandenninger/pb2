package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rim implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ rip b;

    public rim(rip ripVar, long j) {
        this.b = ripVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g().e(this.a);
        this.b.d = null;
    }
}
