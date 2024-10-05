package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpy extends aov {
    public ammv e = amlr.a;
    public ammv f = amlr.a;
    public ammv g = amlr.a;
    private final vms h;
    private final vmq i;
    private final vna j;

    public vpy(vms vmsVar, vmq vmqVar, vna vnaVar) {
        this.h = vmsVar;
        this.i = vmqVar;
        this.j = vnaVar;
        final int i = 0;
        n(vmsVar.a(), new aox(this) { // from class: vpx
            public final /* synthetic */ vpy a;

            {
                this.a = this;
            }

            @Override // defpackage.aox
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    vpy vpyVar = this.a;
                    vpyVar.e = ammv.j((vnb) obj);
                    vpyVar.p();
                } else if (i2 == 1) {
                    vpy vpyVar2 = this.a;
                    vpyVar2.f = ammv.j((vmr) obj);
                    vpyVar2.p();
                } else {
                    vpy vpyVar3 = this.a;
                    vpyVar3.g = ammv.j((vnb) obj);
                    vpyVar3.p();
                }
            }
        });
        final int i2 = 1;
        n(vmqVar.e, new aox(this) { // from class: vpx
            public final /* synthetic */ vpy a;

            {
                this.a = this;
            }

            @Override // defpackage.aox
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    vpy vpyVar = this.a;
                    vpyVar.e = ammv.j((vnb) obj);
                    vpyVar.p();
                } else if (i22 == 1) {
                    vpy vpyVar2 = this.a;
                    vpyVar2.f = ammv.j((vmr) obj);
                    vpyVar2.p();
                } else {
                    vpy vpyVar3 = this.a;
                    vpyVar3.g = ammv.j((vnb) obj);
                    vpyVar3.p();
                }
            }
        });
        aot a = vnaVar.a();
        final int i3 = 2;
        n(a, new aox(this) { // from class: vpx
            public final /* synthetic */ vpy a;

            {
                this.a = this;
            }

            @Override // defpackage.aox
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    vpy vpyVar = this.a;
                    vpyVar.e = ammv.j((vnb) obj);
                    vpyVar.p();
                } else if (i22 == 1) {
                    vpy vpyVar2 = this.a;
                    vpyVar2.f = ammv.j((vmr) obj);
                    vpyVar2.p();
                } else {
                    vpy vpyVar3 = this.a;
                    vpyVar3.g = ammv.j((vnb) obj);
                    vpyVar3.p();
                }
            }
        });
    }

    public final void p() {
        if (this.e.h() && this.f.h() && this.g.h()) {
            j(new vpu((vnb) this.e.c(), (vmr) this.f.c(), (vnb) this.g.c()));
            o(this.h.a());
            o(this.i.e);
            o(this.j.a());
        }
    }
}
