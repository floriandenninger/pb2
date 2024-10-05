package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndl implements ajom, ggr, gmf, fgp {
    public final Context a;
    public final ajjz b;
    public final aahd c;
    public final ajut d;
    public final ajuw e;
    public final wyz f;
    public final tdv g;
    public final wzq h;
    public final euv i;
    public final ypa j;
    public final fgq k;
    public final ViewGroup l;
    public final FrameLayout m;
    public final boolean n;
    public final akbd o;
    public final ajyw p;
    private final Resources q;
    private final InlinePlaybackLifecycleController r;
    private boolean s = false;
    private ndk t;
    private ndk u;
    private ndk v;

    /* JADX INFO: Access modifiers changed from: protected */
    public ndl(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, boolean z, ypa ypaVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, fgq fgqVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajutVar;
        this.e = ajuwVar;
        this.f = wyzVar;
        this.g = tdvVar;
        this.h = wzqVar;
        this.i = euvVar;
        this.n = z;
        this.j = ypaVar;
        this.q = context.getResources();
        this.l = viewGroup;
        this.m = new FrameLayout(context);
        this.r = inlinePlaybackLifecycleController;
        this.k = fgqVar;
        this.p = ajywVar;
        this.o = akbdVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.m;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ndk ndkVar = this.v;
        ndkVar.getClass();
        ndkVar.b.c();
        this.v.a(this, false);
        this.s = false;
    }

    @Override // defpackage.ggr
    public final View g() {
        ndk ndkVar = this.v;
        FrameLayout frameLayout = this.m;
        if (ndkVar.h) {
            return frameLayout;
        }
        return null;
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        return (gmfVar instanceof ndl) && ((ndl) gmfVar).m == this.m;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        apmg apmgVar;
        auhe auheVar = (auhe) obj;
        ajokVar.getClass();
        auheVar.getClass();
        this.m.removeAllViews();
        if (this.q.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.u == null) {
                this.u = new ndk(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_form_landscape);
            }
            this.v = this.u;
        } else {
            if (this.t == null) {
                this.t = new ndk(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_form);
            }
            this.v = this.t;
        }
        ndk ndkVar = this.v;
        augz augzVar = auheVar.c;
        if (augzVar == null) {
            augzVar = augz.a;
        }
        ndkVar.g = augzVar;
        augz augzVar2 = auheVar.c;
        if (augzVar2 == null) {
            augzVar2 = augz.a;
        }
        ndkVar.h = (augzVar2.b & 8192) != 0;
        augz augzVar3 = auheVar.c;
        if (augzVar3 == null) {
            augzVar3 = augz.a;
        }
        ndkVar.i = augzVar3.p;
        aony aonyVar = auheVar.d;
        augu[] auguVarArr = new augu[aonyVar.size()];
        for (int i = 0; i < aonyVar.size(); i++) {
            auguVarArr[i] = (augu) aonyVar.get(i);
        }
        apxf apxfVar = null;
        String str = (auheVar.b & 64) != 0 ? auheVar.h : null;
        augz augzVar4 = auheVar.c;
        if (augzVar4 == null) {
            augzVar4 = augz.a;
        }
        augz augzVar5 = augzVar4;
        if ((auheVar.b & 2) != 0) {
            aulq aulqVar = auheVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atltVar = null;
        }
        aoxy aoxyVar = auheVar.f;
        if (aoxyVar == null) {
            aoxyVar = aoxy.a;
        }
        aoxy aoxyVar2 = aoxyVar;
        byte[] I = auheVar.g.I();
        ndkVar.j = ajokVar.a;
        aulq aulqVar2 = augzVar5.s;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar3 = augzVar5.s;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            apmgVar = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ncd ncdVar = ndkVar.a;
        if ((augzVar5.b & 32768) != 0 && (apxfVar = augzVar5.q) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, augzVar5.v);
        ndkVar.b.G(ajokVar.a, auheVar, str, augzVar5, auguVarArr, aoxyVar2, I);
        ndkVar.c.l(ndkVar.j, auheVar, augzVar5, atltVar, Integer.valueOf(wbs.W(ndkVar.f.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        ndkVar.d.c(ndkVar.j, apmgVar, atltVar);
        this.m.addView(this.v.e);
        this.v.a(this, true);
        this.s = true;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        ndk ndkVar = this.v;
        if (ndkVar.h && fhgVar != fhg.NONE) {
            ndkVar.c.n(ndkVar.g);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        if (!this.s) {
            return ayph.f();
        }
        ndk ndkVar = this.v;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.r;
        fhg g = this.k.g();
        if (!ndkVar.h || g != fhg.NONE) {
            return ayph.f();
        }
        return ndkVar.c.h(i, inlinePlaybackLifecycleController, ndkVar.g, ndkVar.i);
    }
}
