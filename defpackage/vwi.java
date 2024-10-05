package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vwi implements Runnable {
    final /* synthetic */ vwl a;
    private final /* synthetic */ int b;

    public vwi(vwl vwlVar, int i) {
        this.b = i;
        this.a = vwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.s();
            return;
        }
        this.a.q();
        this.a.r();
        this.a.s();
        this.a.g();
    }
}
