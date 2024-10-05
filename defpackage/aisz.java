package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisz implements aisn {
    private final afvq a;
    private final afvq b;

    public aisz(Executor executor, yrw yrwVar, zjl zjlVar, shf shfVar, ylz ylzVar) {
        afrk afrkVar = new afrk(zjlVar);
        this.a = afvv.a(ylzVar, afuq.a(executor, new afvg(yrwVar, afrkVar, afrkVar)), shfVar, TimeUnit.HOURS.toMillis(2L));
        this.b = afuq.a(executor, new afvg(yrwVar, afrkVar, new afrb()));
    }

    @Override // defpackage.aisn
    public final void a(aism aismVar, ykl yklVar) {
        zhq.m(aismVar.a.i());
        this.a.c(aismVar, yklVar);
    }

    @Override // defpackage.aisn
    public final void b(aism aismVar, ykl yklVar) {
        zhq.m(aismVar.a.i());
        this.b.c(aismVar, yklVar);
    }
}
