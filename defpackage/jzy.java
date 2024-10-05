package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzy implements kbj {
    private final kbi a;
    private final jvc b;
    private final /* synthetic */ int c;

    public jzy(kbi kbiVar, jvc jvcVar, int i) {
        this.c = i;
        this.a = kbiVar;
        this.b = jvcVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        if (this.c == 0) {
            amru a = ((jzv) this.a).a(this.b.a()).a(juaVar);
            if (a.isEmpty()) {
                return amru.q();
            }
            aone createBuilder = auoy.a.createBuilder();
            aong aongVar = (aong) askd.a.createBuilder();
            aongVar.copyOnWrite();
            askd askdVar = (askd) aongVar.instance;
            askdVar.c |= 8;
            askdVar.i = "downloads_page_disclaimer_item_section_identifier";
            aongVar.cn((askg) ((kbh) a.get(0)).a);
            askd askdVar2 = (askd) aongVar.build();
            createBuilder.copyOnWrite();
            auoy auoyVar = (auoy) createBuilder.instance;
            askdVar2.getClass();
            auoyVar.j = askdVar2;
            auoyVar.b |= 16;
            return amru.r(new kbh((auoy) createBuilder.build()));
        }
        kbi kbiVar = this.a;
        this.b.a();
        amru a2 = ((jzs) kbiVar).b().a(juaVar);
        if (!a2.isEmpty()) {
            aone createBuilder2 = auoy.a.createBuilder();
            aong aongVar2 = (aong) askd.a.createBuilder();
            aongVar2.copyOnWrite();
            askd askdVar3 = (askd) aongVar2.instance;
            askdVar3.c |= 8;
            askdVar3.i = "downloads_page_banner_item_section_identifier";
            aongVar2.cn((askg) ((kbh) a2.get(0)).a);
            askd askdVar4 = (askd) aongVar2.build();
            createBuilder2.copyOnWrite();
            auoy auoyVar2 = (auoy) createBuilder2.instance;
            askdVar4.getClass();
            auoyVar2.j = askdVar4;
            auoyVar2.b |= 16;
            return amru.r(new kbh((auoy) createBuilder2.build()));
        }
        return amru.q();
    }
}
