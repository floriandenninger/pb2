package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzt implements kbj {
    private final Map a;
    private final jvc b;

    public jzt(Map map, jvc jvcVar) {
        this.a = map;
        this.b = jvcVar;
    }

    private final void b(kal kalVar, jua juaVar, ammv ammvVar, aong aongVar) {
        kbi kbiVar = (kbi) this.a.get(kalVar);
        kbiVar.getClass();
        amru a = kbiVar.a(ammvVar).a(juaVar);
        if (a.isEmpty()) {
            return;
        }
        aongVar.cn((askg) ((kbh) a.get(0)).a);
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        ammv a = this.b.a();
        aong aongVar = (aong) askd.a.createBuilder();
        aongVar.copyOnWrite();
        askd askdVar = (askd) aongVar.instance;
        askdVar.c |= 8;
        askdVar.i = "downloads_page_banner_item_section_identifier";
        b(kal.TRAVEL_BANNER, juaVar, a, aongVar);
        if (((askd) aongVar.instance).e.size() == 0) {
            b(kal.TEXIT_BANNER, juaVar, a, aongVar);
        }
        if (((askd) aongVar.instance).e.size() == 1) {
            aone createBuilder = auoy.a.createBuilder();
            createBuilder.copyOnWrite();
            auoy auoyVar = (auoy) createBuilder.instance;
            askd askdVar2 = (askd) aongVar.build();
            askdVar2.getClass();
            auoyVar.j = askdVar2;
            auoyVar.b |= 16;
            return amru.r(new kbh((auoy) createBuilder.build()));
        }
        return amru.q();
    }
}
