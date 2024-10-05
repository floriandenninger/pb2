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
public final class nav implements ajom, ggr, gmf {
    public static final asht a;
    public static final asht b;
    private nau A;
    private boolean B;
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
    public final fvf v;
    public final ajyw w;
    private final Resources x;
    private nau y;
    private nau z;

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
    public nav(Context context, ajop ajopVar, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, ypa ypaVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mgu mguVar, gfz gfzVar, mhg mhgVar, ViewGroup viewGroup, euv euvVar, ajyw ajywVar, akbd akbdVar, fvf fvfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
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
        this.x = context.getResources();
        this.n = viewGroup;
        this.o = new FrameLayout(context);
        this.w = ajywVar;
        this.t = akbdVar;
        this.v = fvfVar;
    }

    private final void d(boolean z, boolean z2) {
        if (this.x.getConfiguration().orientation == 2) {
            if (this.z == null) {
                this.z = new nau(this, R.layout.promoted_discovery_action_landscape, false, true);
            }
            this.A = this.z;
            return;
        }
        if (z2) {
            nau nauVar = this.y;
            if (nauVar == null || z != nauVar.i) {
                if (z) {
                    this.y = new nau(this, R.layout.promoted_discovery_action_portrait, true, false);
                } else {
                    this.y = new nau(this, R.layout.promoted_discovery_action_disable_inline_muted_playback_portrait, false, false);
                }
            }
            this.A = this.y;
            return;
        }
        if (this.y == null) {
            if (z) {
                this.y = new nau(this, R.layout.promoted_discovery_action_portrait, true, false);
            } else {
                this.y = new nau(this, R.layout.promoted_discovery_action_disable_inline_muted_playback_portrait, false, false);
            }
            this.A = this.y;
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.o;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        nau nauVar = this.A;
        nauVar.getClass();
        nauVar.j = false;
        nauVar.a.c();
        if (nauVar.i) {
            nauVar.b.b(ajosVar);
        }
        this.B = false;
        this.u = null;
        this.o.removeAllViews();
        this.z = null;
        this.y = null;
        d(this.A.i, true);
        this.o.addView(this.A.a());
    }

    @Override // defpackage.ggr
    public final View g() {
        nau nauVar = this.A;
        if (nauVar.i) {
            return ((ncb) nauVar.b).C;
        }
        return null;
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
        this.B = z;
        nau nauVar = this.A;
        if (nauVar.i && nauVar.j != z) {
            nauVar.j = z;
            if (z) {
                nauVar.b.i();
            }
        }
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        if (!(gmfVar instanceof nav)) {
            return false;
        }
        nau nauVar = this.A;
        gol golVar = ((nav) gmfVar).u;
        gol golVar2 = this.u;
        if (!nauVar.i) {
            return false;
        }
        nal nalVar = nauVar.b;
        return nal.f(golVar, golVar2);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        mge mgeVar = (mge) obj;
        ajokVar.getClass();
        mgeVar.getClass();
        this.o.removeAllViews();
        d(!r2.i, mgeVar.a.j);
        i(this.B);
        nau nauVar = this.A;
        if (mgeVar.c == null) {
            augy augyVar = mgeVar.a.c;
            if (augyVar == null) {
                augyVar = augy.a;
            }
            mgeVar.c = augyVar;
        }
        augy augyVar2 = mgeVar.c;
        auge a2 = mgeVar.a();
        if (mgeVar.e == null) {
            aony aonyVar = mgeVar.a.e;
            mgeVar.e = new augv[aonyVar.size()];
            for (int i = 0; i < aonyVar.size(); i++) {
                mgeVar.e[i] = (augv) aonyVar.get(i);
            }
        }
        augv[] augvVarArr = mgeVar.e;
        if (mgeVar.b == null) {
            aoxy aoxyVar = mgeVar.a.f;
            if (aoxyVar == null) {
                aoxyVar = aoxy.a;
            }
            mgeVar.b = aoxyVar;
        }
        aoxy aoxyVar2 = mgeVar.b;
        nauVar.g = ajokVar.a;
        nauVar.g.u(new acqx(mgeVar.b()), nauVar.l.r.o() ? a : b);
        aulq aulqVar = augyVar2.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        nauVar.h = (apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer);
        apxf apxfVar2 = a2.g;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        apxf apxfVar3 = a2.i;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        ngr ngrVar = nauVar.m;
        if ((augyVar2.b & 2048) != 0) {
            apxfVar = augyVar2.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        aony aonyVar2 = augyVar2.s;
        ngrVar.b = apxfVar;
        ngrVar.c = aonyVar2;
        ngrVar.d = apxfVar2;
        ngrVar.e = apxfVar3;
        nhb nhbVar = nauVar.a;
        acra acraVar = nauVar.g;
        augf augfVar = mgeVar.a;
        nhbVar.F(acraVar, mgeVar, (augfVar.b & 32) != 0 ? augfVar.h : null, augyVar2, augvVarArr, aoxyVar2, null);
        if (nauVar.i) {
            nauVar.l.u = evr.bp(mgeVar);
            ngr ngrVar2 = nauVar.m;
            boolean z = nauVar.i;
            nav navVar = nauVar.l;
            gol golVar = navVar.u;
            aahd aahdVar = navVar.f;
            mhg mhgVar = navVar.s;
            ngrVar2.f = z;
            ngrVar2.g = golVar;
            ngrVar2.h = aahdVar;
            ngrVar2.i = ajokVar;
            ngrVar2.j = mhgVar;
            nal nalVar = nauVar.b;
            acra acraVar2 = nauVar.g;
            nalVar.oB(ajokVar, navVar.u);
            ((ncb) nalVar).f.p(acraVar2, mgeVar, augyVar2, a2, false);
            aqyg aqygVar2 = a2.j;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            Spanned b2 = ajcq.b(aqygVar2);
            if ((augyVar2.b & 1024) != 0) {
                aqygVar = augyVar2.m;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b3 = ajcq.b(aqygVar);
            avgg avggVar = a2.h;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            muf.q(nalVar.a, b2);
            muf.q(nalVar.c, b3);
            muf.r(nalVar.b, avggVar, nalVar.h);
        } else {
            nauVar.c.a(nauVar.g, mgeVar, augyVar2, a2, (augyVar2.b & 8) != 0, nauVar.k);
        }
        auge a3 = mgeVar.a();
        nauVar.f = String.format("PDTBState:%s", a3.k);
        aulq aulqVar2 = a3.d;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        final apmp apmpVar = (apmp) ahbj.n(aulqVar2, ButtonRendererOuterClass.toggleButtonRenderer);
        nauVar.e.b(apmpVar);
        if (apmpVar != null && ((nbm) nauVar.l.m.c(nauVar.f, nbm.class, "PDTBState", new euu() { // from class: nap
            @Override // defpackage.euu
            public final Object a() {
                return new nbm(apmp.this.e);
            }
        }, mgeVar.b())).a != apmpVar.e) {
            nauVar.e.c();
        }
        nauVar.e.d();
        nauVar.d.c(nauVar.g, nauVar.h, null);
        this.o.addView(this.A.a());
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        nau nauVar = this.A;
        return !nauVar.i ? ayph.f() : nauVar.b.d(i, this);
    }
}
