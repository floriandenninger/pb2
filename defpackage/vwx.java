package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vwx implements Runnable {
    final /* synthetic */ vya a;
    final /* synthetic */ boolean b;
    final /* synthetic */ vwz c;

    public vwx(vwz vwzVar, vya vyaVar, boolean z) {
        this.c = vwzVar;
        this.a = vyaVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.q(this.a, this.b);
        this.a.d();
    }
}
