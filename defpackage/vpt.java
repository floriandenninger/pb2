package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpt extends apm {
    public final vms a;
    public final vmq b;
    public final vna c;
    public final aov d;
    public int e;

    public vpt(vms vmsVar, vmq vmqVar, vna vnaVar) {
        this.a = vmsVar;
        this.b = vmqVar;
        this.c = vnaVar;
        vpy vpyVar = new vpy(vmsVar, vmqVar, vnaVar);
        aov aovVar = new aov();
        this.d = aovVar;
        aovVar.n(vpyVar, new aox() { // from class: vps
            @Override // defpackage.aox
            public final void a(Object obj) {
                amru q;
                vpt vptVar = vpt.this;
                vpu vpuVar = (vpu) obj;
                if (vpuVar.b.b.h() || vpuVar.a.b.h() || vpuVar.c.b.h()) {
                    aov aovVar2 = vptVar.d;
                    vptVar.e = 5;
                    aovVar2.j(vpz.a(5));
                    return;
                }
                aov aovVar3 = vptVar.d;
                if (vpuVar.a.a.isEmpty()) {
                    if (vpuVar.b.a.isEmpty()) {
                        if (!vpuVar.c.a.isEmpty()) {
                            q = amru.r(vls.g(vpuVar.c, 39, vpv.b));
                        } else {
                            q = amru.q();
                        }
                    } else {
                        q = amru.s(vls.f(vpuVar.b), vls.g(vpuVar.c, 31, vpv.b));
                    }
                } else {
                    q = amru.t(vls.g(vpuVar.a, 7, vpv.a), vls.f(vpuVar.b), vls.g(vpuVar.c, 23, vpv.b));
                }
                aovVar3.j(new vpz(q, 4));
            }
        });
        this.e = 1;
        aovVar.j(vpz.a(1));
    }
}
