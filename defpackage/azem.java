package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azem extends ayps {
    final aypv[] a;
    final ayrv b;

    public azem(aypv[] aypvVarArr, ayrv ayrvVar) {
        this.a = aypvVarArr;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        aypv[] aypvVarArr = this.a;
        azek azekVar = new azek(ayptVar, this.b);
        ayptVar.se(azekVar);
        for (int i = 0; i < 2 && !azekVar.e(); i++) {
            aypv aypvVar = aypvVarArr[i];
            if (aypvVar != null) {
                aypvVar.Y(azekVar.c[i]);
            } else {
                azekVar.c(new NullPointerException("One of the sources is null"), i);
                return;
            }
        }
    }
}
