package com.google.android.apps.youtube.app.watch.playback;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.MiniplayerRendererOuterClass;
import defpackage.aahd;
import defpackage.ahef;
import defpackage.ahej;
import defpackage.aign;
import defpackage.ainy;
import defpackage.aixh;
import defpackage.anaf;
import defpackage.any;
import defpackage.aok;
import defpackage.apxf;
import defpackage.aryi;
import defpackage.aryr;
import defpackage.atel;
import defpackage.aulq;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.nnd;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MinimizedPlaybackPolicyController implements any, fgp, ypd {
    public atel a;
    public int b;
    public fhg c;
    private final ypa d;
    private final fgq e;
    private final aahd f;
    private final nnd g;
    private final ainy h;
    private boolean i;

    public MinimizedPlaybackPolicyController(ypa ypaVar, fgq fgqVar, aahd aahdVar, nnd nndVar, ainy ainyVar) {
        this.d = ypaVar;
        this.e = fgqVar;
        this.f = aahdVar;
        this.g = nndVar;
        this.h = ainyVar;
    }

    public static atel g(PlayerResponseModel playerResponseModel) {
        aryr aryrVar;
        if (playerResponseModel != null && (aryrVar = playerResponseModel.a) != null) {
            aryi aryiVar = aryrVar.f;
            if (aryiVar == null) {
                aryiVar = aryi.a;
            }
            if ((aryiVar.b & 512) != 0) {
                aryi aryiVar2 = aryrVar.f;
                if (aryiVar2 == null) {
                    aryiVar2 = aryi.a;
                }
                aulq aulqVar = aryiVar2.i;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(MiniplayerRendererOuterClass.miniplayerRenderer)) {
                    aryi aryiVar3 = aryrVar.f;
                    if (aryiVar3 == null) {
                        aryiVar3 = aryi.a;
                    }
                    aulq aulqVar2 = aryiVar3.i;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    return (atel) aulqVar2.pX(MiniplayerRendererOuterClass.miniplayerRenderer);
                }
            }
        }
        return null;
    }

    public final void h(int i, fhg fhgVar, atel atelVar) {
        int bF;
        if (fhgVar == null || fhgVar == fhg.NONE) {
            this.i = false;
        }
        if (atelVar != null && (bF = anaf.bF(atelVar.b)) != 0 && bF == 5 && i == 2 && fhgVar == fhg.WATCH_WHILE_MINIMIZED) {
            if (this.b != 3 || this.c != fhg.WATCH_WHILE_MINIMIZED) {
                this.h.a();
                if (this.i) {
                    return;
                }
                aahd aahdVar = this.f;
                apxf apxfVar = atelVar.c;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
                this.i = true;
                return;
            }
            this.g.q();
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class, ahej.class};
        }
        if (i == 0) {
            ahef ahefVar = (ahef) obj;
            atel g = ahefVar.c() == aign.NEW ? null : g(ahefVar.b());
            h(this.b, this.c, g);
            this.a = g;
            return null;
        }
        if (i == 1) {
            int a = ((ahej) obj).a();
            if (a != 2) {
                if (a != 3) {
                    return null;
                }
                a = 3;
            }
            h(a, this.c, this.a);
            this.b = a;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.d.g(this);
        this.e.i(this);
        aixh o = this.h.o();
        if (o != null) {
            this.a = g(o.c());
            this.b = true != this.h.d() ? 0 : 2;
            this.c = this.e.g();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.d.m(this);
        this.e.j(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        h(this.b, fhgVar, this.a);
        this.c = fhgVar;
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
