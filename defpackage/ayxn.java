package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxn extends ayvs {
    final ayrv c;
    final int d;
    final int e;

    public ayxn(aypn aypnVar, ayrv ayrvVar, int i, int i2) {
        super(aypnVar);
        this.c = ayrvVar;
        this.d = i;
        this.e = i2;
    }

    public static aypq a(banw banwVar, ayrv ayrvVar, int i, int i2) {
        return new ayxm(banwVar, ayrvVar, i, i2);
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        if (aype.b(this.b, banwVar, this.c)) {
            return;
        }
        this.b.aa(a(banwVar, this.c, this.d, this.e));
    }
}
