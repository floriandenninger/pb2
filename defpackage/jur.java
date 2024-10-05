package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jur implements ypd {
    public final agpd a;
    public final ypa b;
    private final fka c;
    private final afsy d;
    private final ayqi e;
    private final jyu f;
    private ammv g = amlr.a;

    public jur(fka fkaVar, agpd agpdVar, ypa ypaVar, afsy afsyVar, ayqi ayqiVar, jyu jyuVar) {
        this.a = agpdVar;
        this.c = fkaVar;
        this.b = ypaVar;
        this.d = afsyVar;
        this.e = ayqiVar;
        this.f = jyuVar;
    }

    public static atpq d(int i) {
        aone createBuilder = atpq.a.createBuilder();
        createBuilder.copyOnWrite();
        atpq atpqVar = (atpq) createBuilder.instance;
        atpqVar.c = i - 1;
        atpqVar.b |= 1;
        aong aongVar = (aong) atpo.b.createBuilder();
        aongVar.cq(atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI);
        atpo atpoVar = (atpo) aongVar.build();
        createBuilder.copyOnWrite();
        atpq atpqVar2 = (atpq) createBuilder.instance;
        atpoVar.getClass();
        atpqVar2.e = atpoVar;
        atpqVar2.b |= 4;
        String w = fhe.w();
        createBuilder.copyOnWrite();
        atpq atpqVar3 = (atpq) createBuilder.instance;
        w.getClass();
        atpqVar3.b |= 2;
        atpqVar3.d = w;
        return (atpq) createBuilder.build();
    }

    public final void a() {
        this.f.a().h(iub.o).V(new juq(this, 1), izw.m);
    }

    public final void b() {
        if (this.g.h()) {
            ((ayqx) this.g.c()).qc();
            this.g = amlr.a;
        }
    }

    public final void c() {
        this.g = ammv.j(((ywp) this.c.c.get()).b.A(new fjx(this.d.c().b(), 0)).E(this.e).G().ai().n().X(new juq(this, 0)));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            b();
            c();
            return null;
        }
        if (i == 1) {
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
