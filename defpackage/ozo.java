package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ozo implements Runnable {
    final /* synthetic */ ozs a;
    private final /* synthetic */ int b;

    public ozo(ozs ozsVar, int i) {
        this.b = i;
        this.a = ozsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.c.d();
            return;
        }
        if (i == 1) {
            this.a.c.e();
        } else if (i != 2) {
            this.a.c.f();
        } else {
            this.a.c.c();
        }
    }
}
