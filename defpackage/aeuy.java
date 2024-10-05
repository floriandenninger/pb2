package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeuy implements Runnable {
    public final /* synthetic */ aeut a;
    private final /* synthetic */ int b;

    public /* synthetic */ aeuy(aeut aeutVar, int i) {
        this.b = i;
        this.a = aeutVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.aa();
                return;
            } else {
                this.a.s.b(null);
                return;
            }
        }
        aeut aeutVar = this.a;
        long g = aeutVar.g();
        long f = aeutVar.f() - g;
        aezf aezfVar = aeutVar.i.n;
        if (aezfVar == null || !aezfVar.g().k(g, f)) {
            return;
        }
        aeutVar.X(aezfVar);
    }
}
