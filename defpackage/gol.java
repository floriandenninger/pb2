package defpackage;

import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gol implements gof {
    public static final gol a = new gol();
    public arhz b;
    public Object c;

    private gol() {
        this.c = null;
        this.b = null;
    }

    public gol(jah jahVar) {
        jahVar.getClass();
        this.c = jahVar;
        aqwf aqwfVar = jahVar.a.h;
        arhz arhzVar = (aqwfVar == null ? aqwf.a : aqwfVar).f;
        this.b = arhzVar == null ? arhz.a : arhzVar;
    }

    @Override // defpackage.gof
    public final gok a() {
        arhn arhnVar;
        aric aricVar;
        arhr arhrVar;
        arib aribVar;
        arhz arhzVar = this.b;
        if (arhzVar != null) {
            arhnVar = arhn.b(arhzVar.p);
            if (arhnVar == null) {
                arhnVar = arhn.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
            }
        } else {
            arhnVar = arhn.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
        }
        arhz arhzVar2 = this.b;
        if (arhzVar2 != null) {
            aricVar = aric.b(arhzVar2.o);
            if (aricVar == null) {
                aricVar = aric.INLINE_SCRUBBING_UI_STYLE_UNKNOWN;
            }
        } else {
            aricVar = aric.INLINE_SCRUBBING_UI_STYLE_UNKNOWN;
        }
        arhz arhzVar3 = this.b;
        if (arhzVar3 != null) {
            arhrVar = arhr.b(arhzVar3.q);
            if (arhrVar == null) {
                arhrVar = arhr.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
            }
        } else {
            arhrVar = arhr.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
        }
        arhz arhzVar4 = this.b;
        if (arhzVar4 != null) {
            aribVar = arib.b(arhzVar4.r);
            if (aribVar == null) {
                aribVar = arib.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
            }
        } else {
            aribVar = arib.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
        }
        goj a2 = gok.a();
        a2.b(arhnVar);
        a2.e(aricVar);
        a2.c(arhrVar);
        a2.d(aribVar);
        return a2.a();
    }

    @Override // defpackage.gof
    public final apxf b() {
        arhz arhzVar = this.b;
        if (arhzVar == null || (arhzVar.b & 512) == 0) {
            return null;
        }
        apxf apxfVar = arhzVar.j;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.gof
    public final apxf c() {
        arhz arhzVar = this.b;
        if (arhzVar == null || (arhzVar.b & 256) == 0) {
            return null;
        }
        apxf apxfVar = arhzVar.i;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.gof
    public final aqyg d() {
        arhz arhzVar = this.b;
        if (arhzVar == null || (arhzVar.b & 16) == 0) {
            return null;
        }
        aqyg aqygVar = arhzVar.f;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    @Override // defpackage.gof
    public final avgg e() {
        arhz arhzVar = this.b;
        if (arhzVar == null || (arhzVar.b & 2) == 0) {
            return null;
        }
        avgg avggVar = arhzVar.c;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.gof
    public final String f() {
        arhz arhzVar = this.b;
        if (arhzVar == null || (arhzVar.b & 1024) == 0) {
            return null;
        }
        return arhzVar.k;
    }

    @Override // defpackage.gof
    public final List g() {
        arhz arhzVar = this.b;
        if (arhzVar != null) {
            return arhzVar.d;
        }
        return null;
    }

    @Override // defpackage.gof
    public final boolean h() {
        int dM;
        arhz arhzVar = this.b;
        return (arhzVar == null || (dM = amkq.dM(arhzVar.s)) == 0 || dM != 2) ? false : true;
    }

    @Override // defpackage.gof
    public final /* synthetic */ boolean i() {
        return evr.bt(this);
    }

    @Override // defpackage.gof
    public final /* synthetic */ boolean j() {
        return evr.bu(this);
    }

    @Override // defpackage.gof
    public final /* synthetic */ boolean k(gof gofVar) {
        return evr.bv(this, gofVar);
    }

    @Override // defpackage.gof
    public final int l() {
        arhz arhzVar = this.b;
        if (arhzVar != null) {
            aswc aswcVar = arhzVar.l;
            if (aswcVar == null) {
                aswcVar = aswc.a;
            }
            if ((aswcVar.b & 1) != 0) {
                aswc aswcVar2 = this.b.l;
                if (aswcVar2 == null) {
                    aswcVar2 = aswc.a;
                }
                int cW = amkq.cW(aswcVar2.c);
                if (cW == 0) {
                    return 1;
                }
                return cW;
            }
        }
        return 1;
    }

    @Override // defpackage.gof
    public final /* synthetic */ void m() {
        evr.bw(this);
    }

    public gol(mge mgeVar) {
        arhz arhzVar;
        mgeVar.getClass();
        this.c = mgeVar;
        aulq aulqVar = mgeVar.a().c;
        if ((aulqVar == null ? aulq.a : aulqVar).pY(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aulq aulqVar2 = mgeVar.a().c;
            arhzVar = (arhz) (aulqVar2 == null ? aulq.a : aulqVar2).pX(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arhzVar = null;
        }
        this.b = arhzVar;
    }

    public gol(mgf mgfVar) {
        arhz arhzVar;
        mgfVar.getClass();
        this.c = mgfVar;
        aulq aulqVar = mgfVar.a().c;
        if ((aulqVar == null ? aulq.a : aulqVar).pY(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aulq aulqVar2 = mgfVar.a().c;
            arhzVar = (arhz) (aulqVar2 == null ? aulq.a : aulqVar2).pX(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arhzVar = null;
        }
        this.b = arhzVar;
    }

    public gol(apoj apojVar) {
        apojVar.getClass();
        this.c = apojVar;
        this.b = null;
    }

    public gol(aqjc aqjcVar) {
        aulq aulqVar;
        arhz arhzVar;
        aulq aulqVar2;
        aqjcVar.getClass();
        this.c = aqjcVar;
        if (aqjcVar.c == 22) {
            aulqVar = (aulq) aqjcVar.d;
        } else {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            if (aqjcVar.c == 22) {
                aulqVar2 = (aulq) aqjcVar.d;
            } else {
                aulqVar2 = aulq.a;
            }
            arhzVar = (arhz) aulqVar2.pX(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arhzVar = null;
        }
        this.b = arhzVar;
    }

    public gol(arhz arhzVar) {
        arhzVar.getClass();
        this.c = arhzVar;
        this.b = arhzVar;
    }

    public gol(arih arihVar) {
        arhz arhzVar;
        arihVar.getClass();
        this.c = arihVar;
        arig arigVar = arihVar.h;
        if ((arigVar == null ? arig.a : arigVar).b == 83537025) {
            arig arigVar2 = arihVar.h;
            arigVar2 = arigVar2 == null ? arig.a : arigVar2;
            if (arigVar2.b == 83537025) {
                arhzVar = (arhz) arigVar2.c;
            } else {
                arhzVar = arhz.a;
            }
        } else {
            arhzVar = null;
        }
        this.b = arhzVar;
    }

    public gol(auhd auhdVar) {
        auhdVar.getClass();
        this.c = auhdVar;
        this.b = null;
    }

    public gol(auhe auheVar) {
        auheVar.getClass();
        this.c = auheVar;
        this.b = null;
    }

    public gol(auhk auhkVar) {
        auhkVar.getClass();
        this.c = auhkVar;
        this.b = null;
    }

    public gol(auhl auhlVar) {
        auhlVar.getClass();
        this.c = auhlVar;
        this.b = null;
    }

    public gol(auhx auhxVar) {
        arhz arhzVar;
        auhxVar.getClass();
        this.c = auhxVar;
        aulq aulqVar = auhxVar.c;
        if ((aulqVar == null ? aulq.a : aulqVar).pY(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aulq aulqVar2 = auhxVar.c;
            arhzVar = (arhz) (aulqVar2 == null ? aulq.a : aulqVar2).pX(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arhzVar = null;
        }
        this.b = arhzVar;
    }
}
