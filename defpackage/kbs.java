package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbs implements kbj {
    private final Map a;
    private final aahv b;
    private final fif c;
    private final fjs d;
    private final fjq e;
    private final axzf f;

    public kbs(Map map, aahv aahvVar, fif fifVar, fjs fjsVar, fjq fjqVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = map;
        this.b = aahvVar;
        this.c = fifVar;
        this.d = fjsVar;
        this.e = fjqVar;
        this.f = axzfVar;
    }

    private final ammv b(kal kalVar, Class cls, ammv ammvVar, Object obj) {
        kbi kbiVar = (kbi) this.a.get(kalVar);
        kbiVar.getClass();
        amru a = kbiVar.a(ammvVar).a((jua) obj);
        return a.isEmpty() ? amlr.a : ammv.j((aooy) cls.cast(((kbh) a.get(0)).a));
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        aqnf aqnfVar;
        aqmz aqmzVar;
        aqog aqogVar;
        asvu asvuVar = this.f.a.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        int q = ((!asvuVar.cb || (aqogVar = (aqog) this.b.c().f(fhe.j()).X()) == null || !aqogVar.getShouldPersistDownloadsSectionExpandedState().booleanValue()) && this.e.b() && this.d.e()) ? this.f.q() : -1;
        if (!juaVar.b.h()) {
            aqnf b = aqnf.b(((aqng) juaVar.c.instance).c);
            if (b == null) {
                b = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
            aqnfVar = b;
        } else {
            aqnd aqndVar = (aqnd) juaVar.b.c();
            if (aqndVar.b == 2) {
                aqmzVar = (aqmz) aqndVar.c;
            } else {
                aqmzVar = aqmz.a;
            }
            aqnfVar = aqnf.b(aqmzVar.d);
            if (aqnfVar == null) {
                aqnfVar = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
            q = q != -1 ? aqmzVar.e : -1;
        }
        aone createBuilder = askf.a.createBuilder();
        aulm am = mcy.am(aqmy.REQUEST_TYPE_UNSPECIFIED, aqnfVar, q);
        createBuilder.copyOnWrite();
        askf askfVar = (askf) createBuilder.instance;
        am.getClass();
        askfVar.e = am;
        askfVar.b |= 4;
        aong aongVar = (aong) askd.a.createBuilder();
        aongVar.cy(createBuilder);
        aongVar.copyOnWrite();
        askd askdVar = (askd) aongVar.instance;
        askdVar.c |= 8;
        askdVar.i = "downloads_page_downloads_item_section_identifier";
        ammv b2 = b(kal.SECTION_HEADER, askb.class, amlr.a, juaVar);
        if (b2.h()) {
            askb askbVar = (askb) b2.c();
            aongVar.copyOnWrite();
            askd askdVar2 = (askd) aongVar.instance;
            askdVar2.d = askbVar;
            askdVar2.c |= 1;
        }
        ArrayList arrayList = new ArrayList();
        fif fifVar = this.c;
        fib a = fid.a();
        a.b(aqnfVar);
        a.c(q);
        a.d(fic.TIME_DESCENDING);
        fie fieVar = (fie) fifVar.b(a.a()).X();
        amru amruVar = fieVar.b;
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            aakt aaktVar = (aakt) amruVar.get(i);
            ammv b3 = b(aaktVar instanceof awil ? kal.VIDEO : kal.PLAYLIST, askg.class, ammv.i(aaktVar), juaVar);
            if (b3.h()) {
                arrayList.add((askg) b3.c());
            }
        }
        int size2 = fieVar.a - fieVar.b.size();
        if (size2 > 0) {
            ammv b4 = b(kal.EXPAND_BUTTON, askg.class, ammv.j(Integer.valueOf(size2)), juaVar);
            if (b4.h()) {
                arrayList.add((askg) b4.c());
            }
        }
        if (arrayList.isEmpty()) {
            ammv b5 = b(kal.ZERO_STATE, askg.class, amlr.a, juaVar);
            if (b5.h()) {
                aongVar.cn((askg) b5.c());
            }
        } else {
            aongVar.cm(arrayList);
        }
        aone createBuilder2 = auoy.a.createBuilder();
        createBuilder2.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder2.instance;
        askd askdVar3 = (askd) aongVar.build();
        askdVar3.getClass();
        auoyVar.j = askdVar3;
        auoyVar.b |= 16;
        return amru.r(new kbh((auoy) createBuilder2.build()));
    }
}
