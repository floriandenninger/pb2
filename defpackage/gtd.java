package defpackage;

import com.google.protos.youtube.api.innertube.HorizontalListRendererOuterClass;
import com.google.protos.youtube.api.innertube.ItemSectionRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gtd implements ajtu {
    private final int a;
    private final ohm b;
    private final gsz c;

    public gtd(ohm ohmVar, gsz gszVar) {
        this.a = ohmVar.b();
        this.b = ohmVar;
        this.c = gszVar;
    }

    @Override // defpackage.ajtu
    public final void a(ajcf ajcfVar) {
        arfa arfaVar;
        avvq avvqVar;
        askd askdVar;
        if (this.a == this.b.b()) {
            aulp a = ajcfVar.a();
            aull aullVar = a != null ? (aull) a.pX(aull.b) : null;
            if (aullVar == null) {
                return;
            }
            aulq aulqVar = aullVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(HorizontalListRendererOuterClass.horizontalListRenderer)) {
                aulq aulqVar2 = aullVar.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                arfaVar = (arfa) aulqVar2.pX(HorizontalListRendererOuterClass.horizontalListRenderer);
            } else {
                arfaVar = null;
            }
            if (arfaVar != null) {
                ohm ohmVar = this.b;
                if (ohmVar instanceof ohl) {
                    ((ohl) ohmVar).i(arfaVar.c);
                    this.c.a((arfaVar.b & 512) != 0 ? arfaVar.g : null);
                    return;
                }
            }
            aulq aulqVar3 = aullVar.c;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            if (aulqVar3.pY(avvs.a)) {
                aulq aulqVar4 = aullVar.c;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                avvqVar = (avvq) aulqVar4.pX(avvs.a);
            } else {
                avvqVar = null;
            }
            if (avvqVar != null) {
                ohm ohmVar2 = this.b;
                if (ohmVar2 instanceof ohp) {
                    ((ohp) ohmVar2).i(avvqVar.c);
                    this.c.a((avvqVar.b & 256) != 0 ? avvqVar.j : null);
                    return;
                }
            }
            aulq aulqVar5 = aullVar.c;
            if (aulqVar5 == null) {
                aulqVar5 = aulq.a;
            }
            if (aulqVar5.pY(ItemSectionRendererOuterClass.itemSectionRenderer)) {
                aulq aulqVar6 = aullVar.c;
                if (aulqVar6 == null) {
                    aulqVar6 = aulq.a;
                }
                askdVar = (askd) aulqVar6.pX(ItemSectionRendererOuterClass.itemSectionRenderer);
            } else {
                askdVar = null;
            }
            if (askdVar != null) {
                ohm ohmVar3 = this.b;
                if (ohmVar3 instanceof ohq) {
                    ohq ohqVar = (ohq) ohmVar3;
                    aony aonyVar = askdVar.e;
                    if (!aonyVar.isEmpty()) {
                        ohqVar.H(mjw.l);
                        aong aongVar = (aong) askd.a.createBuilder();
                        aongVar.cm(aonyVar);
                        ohqVar.nk(new aalz((askd) aongVar.build()));
                        ohqVar.a++;
                    }
                    this.c.a((askdVar.c & 1024) != 0 ? askdVar.n : null);
                }
            }
        }
    }
}
