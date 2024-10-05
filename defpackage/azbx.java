package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbx extends ayvs {
    final banv[] c;
    final ayrv d;

    public azbx(aypn aypnVar, banv[] banvVarArr, ayrv ayrvVar) {
        super(aypnVar);
        this.c = banvVarArr;
        this.d = ayrvVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        banv[] banvVarArr = this.c;
        azbv azbvVar = new azbv(banwVar, this.d);
        banwVar.f(azbvVar);
        azbw[] azbwVarArr = azbvVar.c;
        AtomicReference atomicReference = azbvVar.e;
        for (int i = 0; i < 2 && atomicReference.get() != azqb.a; i++) {
            banvVarArr[i].ab(azbwVarArr[i]);
        }
        this.b.aa(azbvVar);
    }
}
