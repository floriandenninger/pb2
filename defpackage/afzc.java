package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzc implements afyy {
    private final acpl a;

    public afzc(acpl acplVar) {
        this.a = acplVar;
    }

    @Override // defpackage.afyy
    public final void a(aqkg aqkgVar) {
        acpl acplVar = this.a;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cq(aqkgVar);
        acplVar.c((arpp) a.build());
    }

    @Override // defpackage.afyy
    public final void b() {
    }
}
