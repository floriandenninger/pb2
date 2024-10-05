package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wit implements afwx {
    final /* synthetic */ afsy a;
    final /* synthetic */ wiz b;
    final /* synthetic */ aahd c;
    final /* synthetic */ ci d;

    public wit(afsy afsyVar, wiz wizVar, aahd aahdVar, ci ciVar) {
        this.a = afsyVar;
        this.b = wizVar;
        this.c = aahdVar;
        this.d = ciVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.a.t()) {
            return;
        }
        zga.b("Failed to fetch kids onboarding status, finishing the App.");
        this.d.finishAffinity();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        wck wckVar = (wck) obj;
        for (aati aatiVar : wckVar.a) {
            for (aata aataVar : aatiVar.c()) {
                if (aataVar.f != null) {
                    if (this.a.t()) {
                        this.b.k("Kids account deboarded");
                    }
                    this.c.a(aataVar.d());
                    return;
                }
            }
            if (!this.a.t()) {
                for (aata aataVar2 : aatiVar.c()) {
                    if (aataVar2.p() || aataVar2.m()) {
                        if (aataVar2.d != null) {
                            this.c.a(aataVar2.d());
                            return;
                        }
                    }
                }
            }
        }
        if (this.a.t()) {
            return;
        }
        Iterator it = wckVar.b.c().iterator();
        while (it.hasNext()) {
            if (((aatc) it.next()).a) {
                zga.b("Failed to fetch kids onboarding status, finishing the App.");
                this.d.finishAffinity();
                return;
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
