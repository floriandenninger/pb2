package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbi implements agbr {
    @Override // defpackage.agbr
    public final void a(apeo apeoVar, acra acraVar, agbs agbsVar, dy dyVar) {
        if (apeoVar == null) {
            return;
        }
        apek apekVar = apeoVar.e;
        if (apekVar == null) {
            apekVar = apek.a;
        }
        if (apekVar.l || !apekVar.k.isEmpty()) {
            dyVar.t = apekVar.k;
            dyVar.u = apekVar.m;
        }
    }
}
