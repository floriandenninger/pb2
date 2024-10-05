package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mr implements Runnable {
    final /* synthetic */ ne a;
    private final /* synthetic */ int b;

    public mr(ne neVar, int i) {
        this.b = i;
        this.a = neVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ne neVar = this.a;
            if ((neVar.A & 1) != 0) {
                neVar.M(0);
            }
            ne neVar2 = this.a;
            if ((neVar2.A & 4096) != 0) {
                neVar2.M(108);
            }
            ne neVar3 = this.a;
            neVar3.z = false;
            neVar3.A = 0;
            return;
        }
        ne neVar4 = this.a;
        neVar4.l.showAtLocation(neVar4.k, 55, 0, 0);
        this.a.N();
        if (this.a.S()) {
            this.a.k.setAlpha(0.0f);
            ne neVar5 = this.a;
            ka q = jw.q(neVar5.k);
            q.c(1.0f);
            neVar5.n = q;
            this.a.n.f(new mq(this));
            return;
        }
        this.a.k.setAlpha(1.0f);
        this.a.k.setVisibility(0);
    }
}
