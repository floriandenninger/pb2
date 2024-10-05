package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class etn extends erx {
    public etn(eto etoVar) {
        super(etoVar.a, etoVar.b, etoVar.c, etoVar.f, etoVar.d, etoVar.e, etoVar.g, null, null);
    }

    @Override // defpackage.erx
    public final /* synthetic */ apxf d(Object obj) {
        apxf apxfVar = ((arcl) obj).i;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ atdf e(Object obj) {
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 512) == 0) {
            return null;
        }
        atdf atdfVar = arclVar.l;
        return atdfVar == null ? atdf.a : atdfVar;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ auzj f(Object obj) {
        arcl arclVar = (arcl) obj;
        arcm arcmVar = arclVar.j;
        if (arcmVar == null) {
            arcmVar = arcm.a;
        }
        if (arcmVar.b != 55419609) {
            return null;
        }
        arcm arcmVar2 = arclVar.j;
        if (arcmVar2 == null) {
            arcmVar2 = arcm.a;
        }
        if (arcmVar2.b == 55419609) {
            return (auzj) arcmVar2.c;
        }
        return auzj.a;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ avgg g(Object obj) {
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 2) == 0) {
            return null;
        }
        avgg avggVar = arclVar.c;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence h(Object obj) {
        aqyg aqygVar;
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 64) != 0) {
            aqygVar = arclVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence i(Object obj) {
        aqyg aqygVar;
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 32) != 0) {
            aqygVar = arclVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence j(Object obj) {
        aqyg aqygVar;
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 16) != 0) {
            aqygVar = arclVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence k(Object obj) {
        aqyg aqygVar;
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 4) != 0) {
            aqygVar = arclVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence l(Object obj) {
        aqyg aqygVar;
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 8) != 0) {
            aqygVar = arclVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ Object m(Object obj, auzj auzjVar) {
        arcl arclVar = (arcl) obj;
        if ((arclVar.b & 256) == 0) {
            return arclVar;
        }
        aone builder = arclVar.toBuilder();
        arcm arcmVar = arclVar.j;
        if (arcmVar == null) {
            arcmVar = arcm.a;
        }
        aone builder2 = arcmVar.toBuilder();
        builder2.copyOnWrite();
        arcm arcmVar2 = (arcm) builder2.instance;
        auzjVar.getClass();
        arcmVar2.c = auzjVar;
        arcmVar2.b = 55419609;
        builder.copyOnWrite();
        arcl arclVar2 = (arcl) builder.instance;
        arcm arcmVar3 = (arcm) builder2.build();
        arcmVar3.getClass();
        arclVar2.j = arcmVar3;
        arclVar2.b |= 256;
        return (arcl) builder.build();
    }

    @Override // defpackage.erx
    public final /* synthetic */ List n(Object obj) {
        return ((arcl) obj).k;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ byte[] o(Object obj) {
        return ((arcl) obj).m.I();
    }
}
