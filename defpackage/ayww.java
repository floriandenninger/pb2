package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayww extends ayvs {
    final ayrv c;

    public ayww(aypn aypnVar, ayrv ayrvVar) {
        super(aypnVar);
        this.c = ayrvVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        if (banwVar instanceof aysx) {
            this.b.aa(new aywu((aysx) banwVar, this.c));
        } else {
            this.b.aa(new aywv(banwVar, this.c));
        }
    }
}
