package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzc extends ayvs {
    final ayqi c;
    final int d;

    public ayzc(aypn aypnVar, ayqi ayqiVar, int i) {
        super(aypnVar);
        this.c = ayqiVar;
        this.d = i;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        ayqh a = this.c.a();
        if (banwVar instanceof aysx) {
            this.b.aa(new ayza((aysx) banwVar, a, this.d));
        } else {
            this.b.aa(new ayzb(banwVar, a, this.d));
        }
    }
}
