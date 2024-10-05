package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gbv implements gam {
    private final /* synthetic */ int d;
    public static final /* synthetic */ gbv c = new gbv(2);
    public static final /* synthetic */ gbv b = new gbv(1);
    public static final /* synthetic */ gbv a = new gbv(0);

    private /* synthetic */ gbv(int i) {
        this.d = i;
    }

    @Override // defpackage.gam
    public final gbi a(akbn akbnVar) {
        int i = this.d;
        if (i == 0) {
            akby akbyVar = (akby) akbnVar;
            if (akbyVar == null) {
                return null;
            }
            return akbyVar;
        }
        if (i != 1) {
            akcb akcbVar = (akcb) akbnVar;
            if (akcbVar == null) {
                return null;
            }
            if (akcbVar instanceof gcq) {
                return (gcq) akcbVar;
            }
            gcm d = gcq.d();
            d.k(akcbVar.k());
            d.m(akcbVar.j(), akcbVar.h());
            d.d(akcbVar.e());
            d.b = akcbVar.g();
            return d.b();
        }
        akbq akbqVar = (akbq) akbnVar;
        if (akbqVar == null) {
            return null;
        }
        if (akbqVar instanceof gbm) {
            return (gbm) akbqVar;
        }
        awos h = akbqVar.h();
        if (h == null) {
            return null;
        }
        gbl d2 = gbm.d();
        d2.d = h;
        d2.e = akbqVar.f();
        d2.d(akbqVar.e());
        return d2.a();
    }
}
