package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class itu implements ayrs {
    public final /* synthetic */ ivj a;
    private final /* synthetic */ int b;

    public /* synthetic */ itu(ivj ivjVar, int i) {
        this.b = i;
        this.a = ivjVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.bC.g(true);
            return;
        }
        if (i == 1) {
            this.a.ba.q();
            return;
        }
        if (i == 2) {
            ivj ivjVar = this.a;
            ivi iviVar = (ivi) obj;
            iuh iuhVar = new iuh(ivjVar, 5);
            iuh iuhVar2 = new iuh(ivjVar, 0);
            iviVar.a.ifPresent(iuhVar);
            iviVar.b.ifPresent(iuhVar2);
            return;
        }
        if (i == 3) {
            this.a.bj((apxf) ((ammw) obj).b);
            return;
        }
        if (i == 4) {
            this.a.bs((apxf) ((ammw) obj).b);
            return;
        }
        if (i == 5) {
            final ivj ivjVar2 = this.a;
            final arjp arjpVar = (arjp) obj;
            mgr q = ivjVar2.q();
            if (q == null) {
                return;
            }
            q.ll(aulm.a, new zfi() { // from class: itx
                @Override // defpackage.zfi
                public final void a(Object obj2) {
                    ivj ivjVar3 = ivj.this;
                    arjp arjpVar2 = arjpVar;
                    aaqh aaqhVar = (aaqh) obj2;
                    if (aaqhVar instanceof aauc) {
                        aauc aaucVar = (aauc) aaqhVar;
                        aaucVar.t = arjpVar2;
                        aaucVar.d(whu.T(ivjVar3.ai));
                        aaucVar.s(1);
                    }
                }
            }, new iux(0), null);
            return;
        }
        this.a.bm();
    }
}
