package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rjg implements Runnable {
    final /* synthetic */ rfg a;
    final /* synthetic */ rji b;
    private final /* synthetic */ int c;

    public rjg(rji rjiVar, rfg rfgVar, int i) {
        this.c = i;
        this.b = rjiVar;
        this.a = rfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            synchronized (this.b) {
                this.b.a = false;
                if (!this.b.c.A()) {
                    this.b.c.aF().j.a("Connected to remote service");
                    this.b.c.z(this.a);
                }
            }
            return;
        }
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.A()) {
                this.b.c.aF().k.a("Connected to service");
                this.b.c.z(this.a);
            }
        }
    }
}
