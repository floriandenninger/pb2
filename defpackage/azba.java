package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azba extends ayvs {
    final ayrv c;
    final int d;

    public azba(aypn aypnVar, ayrv ayrvVar, int i) {
        super(aypnVar);
        this.c = ayrvVar;
        this.d = i;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        if (aype.b(this.b, banwVar, this.c)) {
            return;
        }
        this.b.aa(new azaz(banwVar, this.c, this.d));
    }
}
