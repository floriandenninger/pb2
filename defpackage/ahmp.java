package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahmp implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ahmt b;

    public ahmp(ahmt ahmtVar, int i) {
        this.b = ahmtVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.h(this.a, 0);
    }
}
