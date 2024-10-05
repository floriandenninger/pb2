package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class joz implements ayrv {
    public final /* synthetic */ aair a;
    private final /* synthetic */ int b;

    public /* synthetic */ joz(aair aairVar, int i) {
        this.b = i;
        this.a = aairVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return this.a.f((String) obj);
            }
            return this.a.f((String) obj).g(asxd.class);
        }
        aalc c = this.a.c();
        amrp f = amru.f();
        for (awiv awivVar : ((awiu) obj).getDownloads()) {
            if (awivVar.b == 3) {
                String str = (String) awivVar.c;
                aone createBuilder = atpq.a.createBuilder();
                createBuilder.copyOnWrite();
                atpq atpqVar = (atpq) createBuilder.instance;
                atpqVar.c = 2;
                atpqVar.b |= 1;
                String d = aalt.d(197, aalt.g(str));
                createBuilder.copyOnWrite();
                atpq atpqVar2 = (atpq) createBuilder.instance;
                d.getClass();
                atpqVar2.b = 2 | atpqVar2.b;
                atpqVar2.d = d;
                f.h((atpq) createBuilder.build());
            }
        }
        ayph b = c.a(fhe.w()).b();
        amru g = f.g();
        agot a = agou.a();
        a.a = 2;
        a.b(g);
        return b.K(ayps.w(a.a())).F(agou.c);
    }
}
