package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahmn implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ ahmt b;

    public ahmn(ahmt ahmtVar, float f) {
        this.b = ahmtVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.g(this.a);
    }
}
