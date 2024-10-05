package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kao implements kbj {
    private final Map a;
    private final jvc b;
    private final fjq c;
    private final aahv d;

    public kao(Map map, jvc jvcVar, fjq fjqVar, aahv aahvVar) {
        this.a = map;
        this.b = jvcVar;
        this.c = fjqVar;
        this.d = aahvVar;
    }

    private final ammv b(kal kalVar, Class cls, ammv ammvVar, jua juaVar) {
        kbi kbiVar = (kbi) this.a.get(kalVar);
        kbiVar.getClass();
        amru a = kbiVar.a(ammvVar).a(juaVar);
        return a.isEmpty() ? amlr.a : ammv.i((aooy) cls.cast(((kbh) a.get(0)).a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        ammv a = this.b.a();
        aong aongVar = (aong) askd.a.createBuilder();
        aongVar.copyOnWrite();
        askd askdVar = (askd) aongVar.instance;
        askdVar.c |= 8;
        askdVar.i = "downloads_page_recommendations_item_section_identifier";
        aone createBuilder = askf.a.createBuilder();
        aone createBuilder2 = aqnd.a.createBuilder();
        aone createBuilder3 = aqna.a.createBuilder();
        createBuilder3.copyOnWrite();
        aqna aqnaVar = (aqna) createBuilder3.instance;
        aqnaVar.b |= 1;
        aqnaVar.c = true;
        aqna aqnaVar2 = (aqna) createBuilder3.build();
        createBuilder2.copyOnWrite();
        aqnd aqndVar = (aqnd) createBuilder2.instance;
        aqnaVar2.getClass();
        aqndVar.c = aqnaVar2;
        aqndVar.b = 3;
        aulm ao = mcy.ao((aqnd) createBuilder2.build());
        createBuilder.copyOnWrite();
        askf askfVar = (askf) createBuilder.instance;
        ao.getClass();
        askfVar.e = ao;
        askfVar.b |= 4;
        aongVar.co((askf) createBuilder.build());
        ammv b = b(kal.SECTION_HEADER, askb.class, amlr.a, juaVar);
        if (b.h()) {
            askb askbVar = (askb) b.c();
            aongVar.copyOnWrite();
            askd askdVar2 = (askd) aongVar.instance;
            askdVar2.d = askbVar;
            askdVar2.c |= 1;
        }
        ammv b2 = b(kal.HABANERO_ENTRY_POINT, askg.class, amlr.a, juaVar);
        if (b2.h()) {
            aongVar.cn((askg) b2.c());
        }
        if (this.c.b() && !mcy.ag(a, this.d.c())) {
            try {
                final jvc jvcVar = this.b;
                aair c = jvcVar.d.c();
                amxe it = ((amru) c.f(fhe.d()).g(asxi.class).x(new ayrv() { // from class: jvb
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        jvc jvcVar2 = jvc.this;
                        amrp f = amru.f();
                        for (asxj asxjVar : ((asxi) obj).getItems()) {
                            if (asxjVar.b == 1) {
                                if (jvcVar2.c.c().f(fhe.h(aalt.g((String) asxjVar.c))).g(awil.class).X() == null) {
                                    f.h(asxjVar.b == 1 ? (String) asxjVar.c : "");
                                }
                            }
                        }
                        return f.g();
                    }
                }).O(jtu.k).t(new joz(c, 2)).av().G(jtu.j).X()).iterator();
                while (it.hasNext()) {
                    ammv b3 = b(kal.VIDEO, askg.class, ammv.i((asxd) it.next()), juaVar);
                    if (b3.h()) {
                        aongVar.cn((askg) b3.c());
                    }
                }
            } catch (RuntimeException e) {
                if (e.getCause() instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    zga.d("Failed to get rec entities.", e);
                } else {
                    throw e;
                }
            }
        }
        if (((askd) aongVar.instance).e.size() == 0) {
            return amru.q();
        }
        aone createBuilder4 = auoy.a.createBuilder();
        createBuilder4.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder4.instance;
        askd askdVar3 = (askd) aongVar.build();
        askdVar3.getClass();
        auoyVar.j = askdVar3;
        auoyVar.b |= 16;
        return amru.r(new kbh((auoy) createBuilder4.build()));
    }
}
