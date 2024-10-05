package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uju implements thk {
    final /* synthetic */ Context a;

    public uju(Context context) {
        this.a = context;
    }

    @Override // defpackage.thk
    public final /* synthetic */ ammv a(tfp tfpVar) {
        return amlr.a;
    }

    @Override // defpackage.thk
    public final /* synthetic */ ammv b(tfp tfpVar) {
        return amlr.a;
    }

    @Override // defpackage.thk
    public final anhy c(tfp tfpVar, anhy anhyVar) {
        aone createBuilder = aosp.a.createBuilder();
        aosn a = aoso.a();
        String packageName = this.a.getPackageName();
        a.copyOnWrite();
        ((aoso) a.instance).o(packageName);
        createBuilder.copyOnWrite();
        aosp aospVar = (aosp) createBuilder.instance;
        aoso aosoVar = (aoso) a.build();
        aosoVar.getClass();
        aospVar.c = aosoVar;
        aospVar.b |= 1;
        return anaf.O(createBuilder.build());
    }

    @Override // defpackage.thk
    public final /* synthetic */ anhy d(tfp tfpVar, anhy anhyVar) {
        return sgf.L();
    }

    @Override // defpackage.thk
    public final String e(tfp tfpVar) {
        return "ONEGOOGLE_MOBILE";
    }

    @Override // defpackage.thk
    public final /* synthetic */ anhy f() {
        throw null;
    }

    @Override // defpackage.thk
    public final void g(tfp tfpVar) {
    }
}
