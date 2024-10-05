package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayng implements Runnable {
    final /* synthetic */ ayoc a;
    final /* synthetic */ ayni b;

    public ayng(ayni ayniVar, ayoc ayocVar) {
        this.b = ayniVar;
        this.a = ayocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.u.d(this.a);
    }
}
