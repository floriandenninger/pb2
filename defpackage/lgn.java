package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgn implements ajol, lgl {
    final /* synthetic */ lgo a;

    public lgn(lgo lgoVar) {
        this.a = lgoVar;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        lgo lgoVar = this.a;
        if (i != 0) {
            return;
        }
        Object c = ajngVar.c(0);
        if ((c instanceof arev) && mcy.J((arev) c)) {
            ajokVar.f("refinement_selection_listener", lgoVar.b);
            ajokVar.f("refinement_selection_controller", lgoVar.a);
        }
    }

    @Override // defpackage.lgl
    public final void k(auoa auoaVar, int i) {
        lgl lglVar;
        lgl a;
        lgm lgmVar = this.a.a;
        auoa auoaVar2 = lgmVar.b;
        int i2 = lgmVar.c;
        lgmVar.b = auoaVar;
        lgmVar.c = i;
        if (auoaVar2 != null && (a = lgmVar.a(auoaVar2)) != null) {
            a.k(auoaVar2, i2);
        }
        lgl a2 = lgmVar.a(auoaVar);
        if (a2 != null) {
            a2.k(auoaVar, i);
        }
        WeakReference weakReference = this.a.d;
        if (weakReference == null || (lglVar = (lgl) weakReference.get()) == null) {
            return;
        }
        lglVar.k(auoaVar, i);
    }
}
