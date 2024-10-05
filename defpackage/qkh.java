package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qkh implements Runnable {
    final /* synthetic */ qkm a;
    final /* synthetic */ int b;

    public qkh(qkm qkmVar, int i) {
        this.a = qkmVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o.y(this.b);
    }
}
