package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjt implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ pka c;

    public pjt(pka pkaVar, int i, int i2) {
        this.c = pkaVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.h(this.a, this.b);
    }
}
