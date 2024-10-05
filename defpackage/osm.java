package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class osm implements ypd {
    public final afsy a;
    public final acpl b;
    public final azrl c;
    public final azrl d;
    private final ywr e;
    private final wkk f;
    private final Executor g;
    private final boolean h;
    private final aadw i;

    /* JADX WARN: Multi-variable type inference failed */
    public osm(ywr ywrVar, afsy afsyVar, ypa ypaVar, acpl acplVar, aadw aadwVar, axzg axzgVar, wkk wkkVar, Executor executor, byte[] bArr) {
        Boolean bool;
        this.e = ywrVar;
        this.a = afsyVar;
        this.b = acplVar;
        this.i = aadwVar;
        this.f = wkkVar;
        this.g = executor;
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45357307L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45357307L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45357307L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.h = bool.booleanValue();
        this.c = azrl.e();
        this.d = azrl.e();
        ypaVar.g(this);
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a() {
        fof fofVar = (fof) this.e.c();
        String d = this.a.c().d();
        foa foaVar = foa.a;
        aoot aootVar = fofVar.f;
        if (aootVar.containsKey(d)) {
            foaVar = (foa) aootVar.get(d);
        }
        if ((foaVar.b & 2) != 0) {
            return foaVar.d;
        }
        apwy b = this.i.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if ((asvuVar.c & 262144) == 0) {
            return 75;
        }
        asvu asvuVar2 = b.e;
        if (asvuVar2 == null) {
            asvuVar2 = asvu.a;
        }
        awbp awbpVar = asvuVar2.G;
        if (awbpVar == null) {
            awbpVar = awbp.a;
        }
        return awbpVar.d;
    }

    public final void b() {
        this.c.c(Boolean.valueOf(g()));
        this.d.c(Integer.valueOf(a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (this.h) {
            afsx c = this.a.c();
            fof fofVar = (fof) this.e.c();
            String d = c.d();
            final foa foaVar = foa.a;
            aoot aootVar = fofVar.f;
            if (aootVar.containsKey(d)) {
                foaVar = (foa) aootVar.get(d);
            }
            ynm.i(wbs.b(c, this.f, this.g), new ynl() { // from class: osi
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    osm osmVar = osm.this;
                    foa foaVar2 = foaVar;
                    if (!((Boolean) obj).booleanValue() || foaVar2.c || foaVar2.e) {
                        return;
                    }
                    osmVar.d(true);
                }
            });
        }
    }

    public final void d(final boolean z) {
        if (g() == z) {
            return;
        }
        ynm.i(this.e.b(new amml() { // from class: osl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                osm osmVar = osm.this;
                boolean z2 = z;
                fof fofVar = (fof) obj;
                String d = osmVar.a.c().d();
                foa foaVar = foa.a;
                aoot aootVar = fofVar.f;
                if (aootVar.containsKey(d)) {
                    foaVar = (foa) aootVar.get(d);
                }
                aone builder = fofVar.toBuilder();
                String d2 = osmVar.a.c().d();
                aone builder2 = foaVar.toBuilder();
                builder2.copyOnWrite();
                foa foaVar2 = (foa) builder2.instance;
                foaVar2.b |= 1;
                foaVar2.c = z2;
                builder2.copyOnWrite();
                foa foaVar3 = (foa) builder2.instance;
                foaVar3.b |= 4;
                foaVar3.e = true;
                builder.j(d2, (foa) builder2.build());
                return (fof) builder.build();
            }
        }), new ynl() { // from class: osj
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                osm osmVar = osm.this;
                boolean z2 = z;
                osmVar.c.c(Boolean.valueOf(z2));
                awbl a = awbm.a();
                a.copyOnWrite();
                awbm.c((awbm) a.instance, z2);
                awbm awbmVar = (awbm) a.build();
                arpn a2 = arpp.a();
                a2.copyOnWrite();
                ((arpp) a2.instance).ei(awbmVar);
                osmVar.b.c((arpp) a2.build());
            }
        });
    }

    public final void e(final int i) {
        amkq.E(i > 0);
        if (a() == i) {
            return;
        }
        ynm.i(this.e.b(new amml() { // from class: osk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                osm osmVar = osm.this;
                int i2 = i;
                fof fofVar = (fof) obj;
                String d = osmVar.a.c().d();
                foa foaVar = foa.a;
                aoot aootVar = fofVar.f;
                if (aootVar.containsKey(d)) {
                    foaVar = (foa) aootVar.get(d);
                }
                aone builder = fofVar.toBuilder();
                String d2 = osmVar.a.c().d();
                aone builder2 = foaVar.toBuilder();
                builder2.copyOnWrite();
                foa foaVar2 = (foa) builder2.instance;
                foaVar2.b |= 2;
                foaVar2.d = i2;
                builder.j(d2, (foa) builder2.build());
                return (fof) builder.build();
            }
        }), new ynl() { // from class: osh
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                osm osmVar = osm.this;
                int i2 = i;
                osmVar.d.c(Integer.valueOf(i2));
                awbn a = awbo.a();
                a.copyOnWrite();
                awbo.c((awbo) a.instance, i2);
                awbo awboVar = (awbo) a.build();
                arpn a2 = arpp.a();
                a2.copyOnWrite();
                ((arpp) a2.instance).ej(awboVar);
                osmVar.b.c((arpp) a2.build());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        fof fofVar = (fof) this.e.c();
        String d = this.a.c().d();
        foa foaVar = foa.a;
        aoot aootVar = fofVar.f;
        if (aootVar.containsKey(d)) {
            foaVar = (foa) aootVar.get(d);
        }
        if (foaVar.c || !wbs.d(this.a.c()) || foaVar.e) {
            return foaVar.c;
        }
        return true;
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
            c();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
