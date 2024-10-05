package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anmj extends anjt {
    public anmj(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anmt anmtVar = (anmt) obj;
        anre anreVar = new anre(anmtVar.c.I());
        anmv anmvVar = anmtVar.d;
        if (anmvVar == null) {
            anmvVar = anmv.a;
        }
        return new anrh(anreVar, anmvVar.b);
    }
}
