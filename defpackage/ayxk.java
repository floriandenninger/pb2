package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxk extends ayvs {
    final ayrw c;

    public ayxk(aypn aypnVar, ayrw ayrwVar) {
        super(aypnVar);
        this.c = ayrwVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        if (banwVar instanceof aysx) {
            this.b.aa(new ayxi((aysx) banwVar, this.c));
        } else {
            this.b.aa(new ayxj(banwVar, this.c));
        }
    }
}
