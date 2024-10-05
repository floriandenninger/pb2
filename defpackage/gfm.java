package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfm implements gfb {
    private final ardu a;

    public gfm(String str, String str2, String str3) {
        aone createBuilder = ardu.a.createBuilder();
        aong aongVar = (aong) arfs.a.createBuilder();
        arfr arfrVar = arfr.PLAY_ARROW;
        aongVar.copyOnWrite();
        arfs arfsVar = (arfs) aongVar.instance;
        arfsVar.c = arfrVar.pV;
        arfsVar.b |= 1;
        createBuilder.copyOnWrite();
        ardu arduVar = (ardu) createBuilder.instance;
        arfs arfsVar2 = (arfs) aongVar.build();
        arfsVar2.getClass();
        arduVar.e = arfsVar2;
        arduVar.b |= 1;
        aone createBuilder2 = aots.a.createBuilder();
        zhq.m(str3);
        createBuilder2.copyOnWrite();
        aots aotsVar = (aots) createBuilder2.instance;
        aotsVar.b |= 2;
        aotsVar.c = str3;
        createBuilder.copyOnWrite();
        ardu arduVar2 = (ardu) createBuilder.instance;
        aots aotsVar2 = (aots) createBuilder2.build();
        aotsVar2.getClass();
        arduVar2.f = aotsVar2;
        arduVar2.b |= 8;
        aone createBuilder3 = atrr.a.createBuilder();
        createBuilder3.copyOnWrite();
        atrr atrrVar = (atrr) createBuilder3.instance;
        atrrVar.b |= 1;
        atrrVar.c = str2;
        zhq.m(str);
        createBuilder3.copyOnWrite();
        atrr atrrVar2 = (atrr) createBuilder3.instance;
        atrrVar2.b |= 2;
        atrrVar2.d = str;
        createBuilder3.copyOnWrite();
        atrr atrrVar3 = (atrr) createBuilder3.instance;
        atrrVar3.b |= 4;
        atrrVar3.e = 0;
        atrr atrrVar4 = (atrr) createBuilder3.build();
        aong aongVar2 = (aong) apxf.a.createBuilder();
        aongVar2.e(atrs.a, atrrVar4);
        createBuilder.copyOnWrite();
        ardu arduVar3 = (ardu) createBuilder.instance;
        apxf apxfVar = (apxf) aongVar2.build();
        apxfVar.getClass();
        arduVar3.d = apxfVar;
        arduVar3.c = 3;
        this.a = (ardu) createBuilder.build();
    }

    @Override // defpackage.gfb
    public final apxf a() {
        ardu arduVar = this.a;
        if (arduVar.c == 3) {
            return (apxf) arduVar.d;
        }
        return null;
    }

    @Override // defpackage.gfb
    public final apxf b() {
        ardu arduVar = this.a;
        if (arduVar.c == 2) {
            return (apxf) arduVar.d;
        }
        return null;
    }

    @Override // defpackage.gfb
    public final arfs c() {
        ardu arduVar = this.a;
        if ((arduVar.b & 1) == 0) {
            return null;
        }
        arfs arfsVar = arduVar.e;
        return arfsVar == null ? arfs.a : arfsVar;
    }

    @Override // defpackage.gfb
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.gfb
    public final String e() {
        ardu arduVar = this.a;
        if ((arduVar.b & 8) == 0) {
            return null;
        }
        aots aotsVar = arduVar.f;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }
}
