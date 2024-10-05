package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aync implements Runnable {
    final /* synthetic */ aycd a;
    final /* synthetic */ ayni b;

    public aync(ayni ayniVar, aycd aycdVar) {
        this.b = ayniVar;
        this.a = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.u.c(this.a);
    }
}
