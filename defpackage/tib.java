package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tib implements tho {
    private final /* synthetic */ int i;
    public static final /* synthetic */ tib h = new tib(6);
    public static final /* synthetic */ tib g = new tib(5);
    public static final /* synthetic */ tib f = new tib(4);
    public static final /* synthetic */ tib e = new tib(3);
    public static final /* synthetic */ tib d = new tib(2);
    public static final /* synthetic */ tib c = new tib(1);
    public static final /* synthetic */ tib b = new tib(0);

    private /* synthetic */ tib(int i) {
        this.i = i;
    }

    @Override // defpackage.tho
    public final anhy a(aooy aooyVar) {
        int i = this.i;
        if (i == 0) {
            final thq thqVar = (thq) aooyVar;
            return anaf.O(new thn() { // from class: thy
                @Override // defpackage.thn
                public final void a(aoox aooxVar) {
                    thq thqVar2 = thq.this;
                    if ((thqVar2.b & 1) != 0) {
                        ((aong) aooxVar).e(anck.a, Long.valueOf(thqVar2.c));
                    }
                }
            });
        }
        if (i == 1) {
            final thf thfVar = (thf) aooyVar;
            return anaf.O(new thn() { // from class: thx
                @Override // defpackage.thn
                public final void a(aoox aooxVar) {
                    int i2 = thf.this.c;
                    ((aone) aooxVar).copyOnWrite();
                    ancr ancrVar = (ancr) ((aong) aooxVar).instance;
                    ancr ancrVar2 = ancr.a;
                    ancrVar.b |= 2;
                    ancrVar.d = i2;
                }
            });
        }
        if (i == 2) {
            final ancr ancrVar = (ancr) aooyVar;
            return anaf.O(new thn() { // from class: thz
                @Override // defpackage.thn
                public final void a(aoox aooxVar) {
                    aong aongVar = (aong) ancr.this.toBuilder();
                    aongVar.copyOnWrite();
                    ancr ancrVar2 = (ancr) aongVar.instance;
                    ancrVar2.b &= -2;
                    ancrVar2.c = 0;
                    aongVar.copyOnWrite();
                    ancr ancrVar3 = (ancr) aongVar.instance;
                    ancrVar3.b &= -3;
                    ancrVar3.d = -1;
                    aongVar.copyOnWrite();
                    ((ancr) aongVar.instance).e = ancr.emptyIntList();
                    aongVar.copyOnWrite();
                    ancr ancrVar4 = (ancr) aongVar.instance;
                    ancrVar4.b &= -5;
                    ancrVar4.f = ancr.a.f;
                    aongVar.copyOnWrite();
                    ancr ancrVar5 = (ancr) aongVar.instance;
                    ancrVar5.b &= -9;
                    ancrVar5.g = 0;
                    aongVar.copyOnWrite();
                    ancr ancrVar6 = (ancr) aongVar.instance;
                    ancrVar6.h = null;
                    ancrVar6.b &= -17;
                    aongVar.copyOnWrite();
                    ancr ancrVar7 = (ancr) aongVar.instance;
                    ancrVar7.b &= -33;
                    ancrVar7.i = 0;
                    aongVar.copyOnWrite();
                    ancr ancrVar8 = (ancr) aongVar.instance;
                    ancrVar8.b &= -129;
                    ancrVar8.j = -1;
                    aongVar.copyOnWrite();
                    ancr ancrVar9 = (ancr) aongVar.instance;
                    ancrVar9.k = null;
                    ancrVar9.b &= -257;
                    ((aone) aooxVar).mergeFrom(aongVar.build());
                }
            });
        }
        if (i == 3) {
            final aosi aosiVar = (aosi) aooyVar;
            return anaf.O(new thn() { // from class: tia
                @Override // defpackage.thn
                public final void a(aoox aooxVar) {
                    aosi aosiVar2 = aosi.this;
                    ((aone) aooxVar).copyOnWrite();
                    ancr ancrVar2 = (ancr) ((aong) aooxVar).instance;
                    ancr ancrVar3 = ancr.a;
                    aosiVar2.getClass();
                    ancrVar2.h = aosiVar2;
                    ancrVar2.b |= 16;
                }
            });
        }
        if (i == 4) {
            final ujv ujvVar = (ujv) aooyVar;
            return anaf.O(new thn() { // from class: ujs
                @Override // defpackage.thn
                public final void a(aoox aooxVar) {
                    ujv ujvVar2 = ujv.this;
                    aonk aonkVar = anco.b;
                    anco ancoVar = ujvVar2.b;
                    if (ancoVar == null) {
                        ancoVar = anco.a;
                    }
                    ((aong) aooxVar).e(aonkVar, ancoVar);
                }
            });
        }
        if (i == 5) {
            final ujw ujwVar = (ujw) aooyVar;
            return anaf.O(new thn() { // from class: ujt
                @Override // defpackage.thn
                public final void a(aoox aooxVar) {
                    ujw ujwVar2 = ujw.this;
                    aonk aonkVar = ancp.b;
                    ancp ancpVar = ujwVar2.b;
                    if (ancpVar == null) {
                        ancpVar = ancp.a;
                    }
                    ((aong) aooxVar).e(aonkVar, ancpVar);
                }
            });
        }
        final aoew aoewVar = (aoew) aooyVar;
        return anaf.O(new thn() { // from class: vma
            @Override // defpackage.thn
            public final void a(aoox aooxVar) {
                aong aongVar = (aong) aooxVar;
                aongVar.e(aoew.b, aoew.this);
            }
        });
    }
}
