package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axgl implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ axgm c;

    public axgl(axgm axgmVar, int i, int i2) {
        this.c = axgmVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a <= 0 || this.b <= 0) {
            this.c.a.getHolder().setSizeFromLayout();
        } else {
            this.c.a.getHolder().setFixedSize(this.a, this.b);
        }
    }
}
