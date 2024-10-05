package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afwu implements afwx {
    private final afwx a;
    private boolean b;

    public afwu(afwx afwxVar) {
        afwxVar.getClass();
        this.a = afwxVar;
    }

    public final void d() {
        this.b = true;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.b) {
            return;
        }
        this.a.kY(cnqVar);
    }

    @Override // defpackage.cnl
    public final void kZ(Object obj) {
        if (this.b) {
            return;
        }
        this.a.kZ(obj);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
