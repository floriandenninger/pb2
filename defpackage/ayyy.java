package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayyy extends ayvs {
    final ayrv c;

    public ayyy(aypn aypnVar, ayrv ayrvVar) {
        super(aypnVar);
        this.c = ayrvVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        if (banwVar instanceof aysx) {
            this.b.aa(new ayyw((aysx) banwVar, this.c));
        } else {
            this.b.aa(new ayyx(banwVar, this.c));
        }
    }
}
