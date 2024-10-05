package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bk implements Runnable {
    final /* synthetic */ bl a;

    public bk(bl blVar) {
        this.a = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bl blVar = this.a;
        blVar.b.endViewTransition(blVar.c);
        this.a.d.b();
    }
}
