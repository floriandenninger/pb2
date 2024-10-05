package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbk implements ajom, ggr, gmf {
    public static final asht a;
    public static final asht b;
    private boolean A;
    public final Context c;
    public final ajop d;
    public final ajjz e;
    public final aahd f;
    public final ajut g;
    public final ajuw h;
    public final wyz i;
    public final tdv j;
    public final wzq k;
    public final ypa l;
    public final euv m;
    public final ViewGroup n;
    public final FrameLayout o;
    public final InlinePlaybackLifecycleController p;
    public final mgu q;
    public final gfz r;
    public final mhg s;
    public final akbd t;
    public gol u;
    public final ajyw v;
    private final Resources w;
    private nbj x;
    private nbj y;
    private nbj z;

    static {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashs.a.createBuilder();
        createBuilder2.copyOnWrite();
        ashs ashsVar = (ashs) createBuilder2.instance;
        ashsVar.b |= 1;
        ashsVar.c = true;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashs ashsVar2 = (ashs) createBuilder2.build();
        ashsVar2.getClass();
        ashtVar.o = ashsVar2;
        ashtVar.b |= 67108864;
        a = (asht) createBuilder.build();
        aone createBuilder3 = asht.a.createBuilder();
        aone createBuilder4 = ashs.a.createBuilder();
        createBuilder4.copyOnWrite();
        ashs ashsVar3 = (ashs) createBuilder4.instance;
        ashsVar3.b = 1 | ashsVar3.b;
        ashsVar3.c = false;
        createBuilder3.copyOnWrite();
        asht ashtVar2 = (asht) createBuilder3.instance;
        ashs ashsVar4 = (ashs) createBuilder4.build();
        ashsVar4.getClass();
        ashtVar2.o = ashsVar4;
        ashtVar2.b |= 67108864;
        b = (asht) createBuilder3.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nbk(Context context, ajop ajopVar, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, ypa ypaVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mgu mguVar, gfz gfzVar, mhg mhgVar, ViewGroup viewGroup, euv euvVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = context;
        this.d = ajopVar;
        this.e = ajjzVar;
        this.f = aahdVar;
        this.g = ajutVar;
        this.h = ajuwVar;
        this.i = wyzVar;
        this.j = tdvVar;
        this.k = wzqVar;
        this.l = ypaVar;
        this.m = euvVar;
        this.p = inlinePlaybackLifecycleController;
        this.q = mguVar;
        this.r = gfzVar;
        this.s = mhgVar;
        this.w = context.getResources();
        this.n = viewGroup;
        this.o = new FrameLayout(context);
        this.v = ajywVar;
        this.t = akbdVar;
    }

    private final void d(boolean z, boolean z2) {
        if (this.w.getConfiguration().orientation == 2) {
            if (this.y == null) {
                this.y = new nbj(this, R.layout.promoted_discovery_app_promo_landscape, false, true);
            }
            this.z = this.y;
            return;
        }
        if (z2) {
            nbj nbjVar = this.x;
            if (nbjVar == null || z != nbjVar.h) {
                if (z) {
                    this.x = new nbj(this, R.layout.promoted_discovery_app_promo_portrait, true, false);
                } else {
                    this.x = new nbj(this, R.layout.promoted_discovery_app_promo_disable_inline_muted_playback_portrait, false, false);
                }
            }
            this.z = this.x;
            return;
        }
        if (this.x == null) {
            if (z) {
                this.x = new nbj(this, R.layout.promoted_discovery_app_promo_portrait, true, false);
            } else {
                this.x = new nbj(this, R.layout.promoted_discovery_app_promo_disable_inline_muted_playback_portrait, false, false);
            }
            this.z = this.x;
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.o;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        nbj nbjVar = this.z;
        nbjVar.getClass();
        nbjVar.i = false;
        nbjVar.b.c();
        if (nbjVar.h) {
            nbjVar.c.b(ajosVar);
        }
        this.A = false;
        this.u = null;
        this.o.removeAllViews();
        this.y = null;
        this.x = null;
        d(this.z.h, true);
        this.o.addView(this.z.a());
    }

    @Override // defpackage.ggr
    public final View g() {
        nbj nbjVar = this.z;
        if (nbjVar.h) {
            return ((ncb) nbjVar.c).C;
        }
        return null;
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
        this.A = z;
        nbj nbjVar = this.z;
        if (nbjVar.h && nbjVar.i != z) {
            nbjVar.i = z;
            if (z) {
                nbjVar.c.i();
            }
        }
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        if (!(gmfVar instanceof nbk)) {
            return false;
        }
        nbj nbjVar = this.z;
        gol golVar = ((nbk) gmfVar).u;
        gol golVar2 = this.u;
        if (!nbjVar.h) {
            return false;
        }
        nbc nbcVar = nbjVar.c;
        return nbc.f(golVar, golVar2);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apmg apmgVar;
        apxf apxfVar;
        aqyg aqygVar;
        mgf mgfVar = (mgf) obj;
        ajokVar.getClass();
        mgfVar.getClass();
        this.o.removeAllViews();
        d(!r0.i, mgfVar.a.j);
        i(this.A);
        nbj nbjVar = this.z;
        if (mgfVar.c == null) {
            augh aughVar = mgfVar.a.c;
            if (aughVar == null) {
                aughVar = augh.a;
            }
            mgfVar.c = aughVar;
        }
        augh aughVar2 = mgfVar.c;
        augi a2 = mgfVar.a();
        if (mgfVar.e == null) {
            aony aonyVar = mgfVar.a.e;
            mgfVar.e = new augw[aonyVar.size()];
            for (int i = 0; i < aonyVar.size(); i++) {
                mgfVar.e[i] = (augw) aonyVar.get(i);
            }
        }
        augw[] augwVarArr = mgfVar.e;
        if (mgfVar.b == null) {
            aoxy aoxyVar = mgfVar.a.f;
            if (aoxyVar == null) {
                aoxyVar = aoxy.a;
            }
            mgfVar.b = aoxyVar;
        }
        aoxy aoxyVar2 = mgfVar.b;
        nbjVar.f = ajokVar.a;
        acra acraVar = nbjVar.f;
        if (mgfVar.f == null) {
            mgfVar.f = mgfVar.a.g.I();
        }
        acraVar.u(new acqx(mgfVar.f), nbjVar.k.r.o() ? a : b);
        aulq aulqVar = aughVar2.m;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = aughVar2.m;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        nbjVar.g = apmgVar;
        apxf apxfVar2 = a2.g;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        apxf apxfVar3 = a2.i;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        ngr ngrVar = nbjVar.a;
        if ((aughVar2.b & 256) != 0) {
            apxfVar = aughVar2.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        apxf apxfVar4 = aughVar2.l;
        if (apxfVar4 == null) {
            apxfVar4 = apxf.a;
        }
        amru r = amru.r(apxfVar4);
        ngrVar.b = apxfVar;
        ngrVar.c = r;
        ngrVar.d = apxfVar2;
        ngrVar.e = apxfVar3;
        nhb nhbVar = nbjVar.b;
        acra acraVar2 = nbjVar.f;
        augj augjVar = mgfVar.a;
        nhbVar.E(acraVar2, mgfVar, (augjVar.b & 32) != 0 ? augjVar.h : null, aughVar2, augwVarArr, aoxyVar2, null);
        if (nbjVar.h) {
            nbjVar.k.u = evr.bp(mgfVar);
            ngr ngrVar2 = nbjVar.a;
            boolean z = nbjVar.h;
            nbk nbkVar = nbjVar.k;
            gol golVar = nbkVar.u;
            aahd aahdVar = nbkVar.f;
            mhg mhgVar = nbkVar.s;
            ngrVar2.f = z;
            ngrVar2.g = golVar;
            ngrVar2.h = aahdVar;
            ngrVar2.i = ajokVar;
            ngrVar2.j = mhgVar;
            nbc nbcVar = nbjVar.c;
            acra acraVar3 = nbjVar.f;
            nbcVar.oB(ajokVar, nbkVar.u);
            ((ncb) nbcVar).f.b(acraVar3, mgfVar, aughVar2, a2, false);
            float f = aughVar2.f;
            int i2 = aughVar2.g;
            int i3 = aughVar2.h;
            if ((aughVar2.b & 8192) != 0) {
                aqygVar = aughVar2.p;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b2 = ajcq.b(aqygVar);
            aqyg aqygVar2 = a2.j;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            Spanned b3 = ajcq.b(aqygVar2);
            avgg avggVar = a2.h;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            muf.p(nbcVar.a, nbcVar.b, f, i2, i3);
            muf.q(nbcVar.c, b2);
            muf.q(nbcVar.d, b3);
            muf.r(nbcVar.e, avggVar, nbcVar.h);
        } else {
            nbjVar.d.b(nbjVar.f, mgfVar, aughVar2, a2, nbjVar.j);
        }
        nbjVar.e.c(nbjVar.f, nbjVar.g, null);
        this.o.addView(this.z.a());
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        nbj nbjVar = this.z;
        return !nbjVar.h ? ayph.f() : nbjVar.c.d(i, this);
    }
}
