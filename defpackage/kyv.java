package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyv extends jsn {
    private final jpf a;

    public kyv(jpf jpfVar) {
        super(agnv.class, kyt.class);
        this.a = jpfVar;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        agnv agnvVar = (agnv) obj;
        agnp agnpVar = agnvVar.a;
        kys kysVar = new kys();
        kysVar.e = false;
        kysVar.c(agnpVar.f());
        kysVar.d(agnpVar.j());
        kysVar.b = 1;
        kysVar.d = aify.g(agnvVar.m(), "PPSV", 0, mcy.U(agnvVar.f(), agnvVar.h));
        kysVar.g = agnpVar.i();
        this.a.h(agnpVar.d.getTime());
        long j = agnvVar.i;
        if (!agnvVar.n().contains(":")) {
            kysVar.f = wbs.az(agnvVar.a.a());
        } else {
            kysVar.f = agnvVar.n();
        }
        agnb agnbVar = agnpVar.a;
        if (agnbVar != null) {
            kysVar.c = agnbVar.b;
        }
        avgg k = agnvVar.k();
        if (k == null) {
            k = avgg.a;
        }
        kysVar.b(k);
        return kysVar.a();
    }
}
