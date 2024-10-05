package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advs extends ykv {
    private final advq a;
    private final aadw c;

    public advs(aadw aadwVar, advq advqVar) {
        this.c = aadwVar;
        this.a = advqVar;
    }

    @Override // defpackage.ykv
    protected final void a() {
        apwy b = this.c.b();
        apdx d = adyu.d(b);
        if (d == null || !d.f) {
            return;
        }
        advq advqVar = this.a;
        apdo apdoVar = null;
        if (b != null) {
            apdn apdnVar = b.d;
            if (apdnVar == null) {
                apdnVar = apdn.a;
            }
            if ((apdnVar.b & 2) != 0) {
                apdn apdnVar2 = b.d;
                if (apdnVar2 == null) {
                    apdnVar2 = apdn.a;
                }
                if ((apdnVar2.b & 2) != 0) {
                    apdn apdnVar3 = b.d;
                    if (apdnVar3 == null) {
                        apdnVar3 = apdn.a;
                    }
                    apdoVar = apdnVar3.d;
                    if (apdoVar == null) {
                        apdoVar = apdo.a;
                    }
                }
            }
        }
        boolean z = true;
        if (apdoVar != null && (apdoVar.b & 1) != 0) {
            atmi atmiVar = apdoVar.c;
            if (atmiVar == null) {
                atmiVar = atmi.a;
            }
            if (!atmiVar.d) {
                z = false;
            }
        }
        advqVar.a(z);
    }
}
