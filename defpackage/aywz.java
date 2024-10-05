package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aywz extends ayvs {
    final ayrs c;
    final ayrs d;
    final ayrm e;

    public aywz(aypn aypnVar, ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        super(aypnVar);
        this.c = ayrsVar;
        this.d = ayrsVar2;
        this.e = ayrmVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        if (banwVar instanceof aysx) {
            this.b.aa(new aywx((aysx) banwVar, this.c, this.d, this.e));
        } else {
            this.b.aa(new aywy(banwVar, this.c, this.d, this.e));
        }
    }
}
