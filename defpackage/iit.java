package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iit implements Runnable {
    public final /* synthetic */ ijo a;
    private final /* synthetic */ int b;

    public /* synthetic */ iit(ijo ijoVar, int i) {
        this.b = i;
        this.a = ijoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.aN(37419);
            return;
        }
        if (i == 1) {
            this.a.aN(37419);
            return;
        }
        ijo ijoVar = this.a;
        ijoVar.aq.b();
        if (ijoVar.al.d()) {
            ijoVar.aq.a();
        }
    }
}
