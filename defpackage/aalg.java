package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aalg implements ayqx {
    private final ayqx a;
    private final aali b;

    public aalg(ayqx ayqxVar, aali aaliVar) {
        this.a = ayqxVar;
        this.b = aaliVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.a.qc();
        aali aaliVar = this.b;
        if (aaliVar.a.aO()) {
            return;
        }
        aaliVar.sh();
    }
}
