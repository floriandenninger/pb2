package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amko implements ayop {
    private final /* synthetic */ int a;

    public amko(int i) {
        this.a = i;
    }

    @Override // defpackage.ayop
    public final /* synthetic */ ayoq a(axzp axzpVar, axzo axzoVar) {
        int i = this.a;
        if (i == 0) {
            return new amkp(axzpVar, axzoVar);
        }
        if (i != 1) {
            return i != 2 ? new aocy(axzpVar, axzoVar) : new aobp(axzpVar, axzoVar);
        }
        return new sge(axzpVar, axzoVar);
    }
}
