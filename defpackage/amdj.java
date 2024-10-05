package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amdj implements anhh {
    final /* synthetic */ amdi a;

    public amdj(amdi amdiVar) {
        this.a = amdiVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        amsx i;
        amdi amdiVar = this.a;
        synchronized (amdiVar.a) {
            amso amsoVar = new amso(4);
            amsr amsrVar = (amsr) amdiVar.b.get("com.google.apps.tiktok.account.data.AllAccounts");
            if (amsrVar != null) {
                amvc amvcVar = amsoVar.a;
                amvcVar.getClass();
                amvc amvcVar2 = amsrVar instanceof amvr ? ((amvr) amsrVar).b : null;
                if (amvcVar2 != null) {
                    amvcVar.h(Math.max(amvcVar.c, amvcVar2.c));
                    for (int a = amvcVar2.a(); a >= 0; a = amvcVar2.e(a)) {
                        amsoVar.b(amvcVar2.g(a), amvcVar2.c(a));
                    }
                } else {
                    Set j = amsrVar.j();
                    amvc amvcVar3 = amsoVar.a;
                    amvcVar3.h(Math.max(amvcVar3.c, j.size()));
                    for (amux amuxVar : amsrVar.j()) {
                        amsoVar.b(amuxVar.a, amuxVar.a());
                    }
                }
            }
            i = amsoVar.a().i();
        }
        amxd listIterator = ((amtg) i).listIterator();
        while (listIterator.hasNext()) {
            amdk amdkVar = (amdk) listIterator.next();
            if (amdkVar != null) {
                amdkVar.a();
            }
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}
