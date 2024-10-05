package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aero implements Runnable {
    public final /* synthetic */ aeru a;
    private final /* synthetic */ int b;

    public /* synthetic */ aero(aeru aeruVar, int i) {
        this.b = i;
        this.a = aeruVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.f();
            return;
        }
        if (i == 1) {
            this.a.d();
            return;
        }
        if (i == 2) {
            this.a.m();
            return;
        }
        if (i == 3) {
            this.a.n();
            return;
        }
        if (i == 4) {
            this.a.q();
        } else if (i != 5) {
            this.a.v();
        } else {
            this.a.r();
        }
    }
}
