package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jon implements agoy {
    private final aais a;
    private final azrw b;
    private final azrw c;

    public jon(aais aaisVar, azrw azrwVar, azrw azrwVar2) {
        this.a = aaisVar;
        this.b = azrwVar;
        this.c = azrwVar2;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        return anaf.O(amru.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        agou agouVar;
        Boolean bool;
        anhy b;
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        int i = bU - 1;
        if (i != 2) {
            if (i == 3) {
                final jmm jmmVar = (jmm) this.b.get();
                aqvj aqvjVar = jmmVar.d.b.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45358636L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45358636L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45358636L);
                    bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                } else {
                    bool = false;
                }
                if (bool.booleanValue()) {
                    b = anfq.i(anht.q(wbs.I(jmmVar.c.a())), new anfz() { // from class: jml
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            jmm jmmVar2 = jmm.this;
                            jub a = jmmVar2.a();
                            a.d(aqme.DOWNLOAD_RECS_FEATURE_TYPE_DOWNLOAD_RECS);
                            a.e((aswl) obj);
                            return ((juc) jmmVar2.a.get()).b(a, jmmVar2.b);
                        }
                    }, jmmVar.b);
                } else {
                    b = ((juc) jmmVar.a.get()).b(jmmVar.a(), jmmVar.b);
                }
                return anfq.i(anht.q(b), jom.a, angq.a);
            }
            Object[] objArr = new Object[2];
            int bU2 = anaf.bU(atpqVar.c);
            if (bU2 == 0) {
                bU2 = 1;
            }
            objArr[0] = Integer.valueOf(bU2 - 1);
            objArr[1] = 136;
            zga.e("Could not handle action: %s for type %s", objArr);
            return anaf.O(agou.c);
        }
        aair c = this.a.c();
        asxi asxiVar = (asxi) c.f(fhe.d()).g(asxi.class).X();
        if (asxiVar == null || asxiVar.getItems() == null) {
            agouVar = agou.a;
        } else {
            aajl c2 = ((aajv) c).c();
            amrp f = amru.f();
            axzg axzgVar = (axzg) this.c.get();
            for (asxj asxjVar : asxiVar.getItems()) {
                if (asxjVar.b == 1) {
                    String str = (String) asxjVar.c;
                    aone createBuilder = atpq.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atpq atpqVar2 = (atpq) createBuilder.instance;
                    atpqVar2.c = 2;
                    atpqVar2.b |= 1;
                    String d = aalt.d(197, aalt.g(str));
                    createBuilder.copyOnWrite();
                    atpq atpqVar3 = (atpq) createBuilder.instance;
                    d.getClass();
                    atpqVar3.b |= 2;
                    atpqVar3.d = d;
                    f.h((atpq) createBuilder.build());
                }
            }
            asvu asvuVar = axzgVar.b.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.bZ) {
                c2.a(fhe.d());
                evr.bO(c2, "Error deleting list entity and associated sub entities");
            } else {
                c2.a(fhe.d());
                evr.bN(c2, "Error deleting list entity and associated sub entities");
            }
            agot a = agou.a();
            a.a = 2;
            a.b(f.g());
            agouVar = a.a();
        }
        return anaf.O(agouVar);
    }
}
