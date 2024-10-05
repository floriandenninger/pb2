package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndf implements ajom, ggr, gmf, fgp {
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
    public final ViewGroup k;
    public final FrameLayout l;
    public nde m;
    public final boolean n;
    public final fgq o;
    public final akbd p;
    public final ajyw q;
    private final Resources r;
    private nde s;
    private nde t;
    private final InlinePlaybackLifecycleController u;
    private boolean v = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public ndf(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, boolean z, ypa ypaVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, fgq fgqVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajutVar;
        this.e = ajuwVar;
        this.f = wyzVar;
        this.g = tdvVar;
        this.h = wzqVar;
        this.i = euvVar;
        this.j = ypaVar;
        this.r = context.getResources();
        this.n = z;
        this.k = viewGroup;
        this.l = new FrameLayout(context);
        this.u = inlinePlaybackLifecycleController;
        this.o = fgqVar;
        this.q = ajywVar;
        this.p = akbdVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.l;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        nde ndeVar = this.m;
        ndeVar.getClass();
        ndeVar.a.c();
        this.m.b(this, false);
        this.v = false;
    }

    public final void d() {
        if (this.r.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.t == null) {
                this.t = new nde(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_compact_form_landscape);
            }
            this.m = this.t;
        } else {
            if (this.s == null) {
                this.s = new nde(this, R.layout.promoted_sparkles_text_ctd_home_themed_cta_compact_form);
            }
            this.m = this.s;
        }
    }

    @Override // defpackage.ggr
    public final View g() {
        nde ndeVar = this.m;
        FrameLayout frameLayout = this.l;
        if (ndeVar.f) {
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
        return (gmfVar instanceof ndf) && ((ndf) gmfVar).l == this.l;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        auhd auhdVar = (auhd) obj;
        ajokVar.getClass();
        auhdVar.getClass();
        this.l.removeAllViews();
        d();
        nde ndeVar = this.m;
        augz augzVar = auhdVar.c;
        if (augzVar == null) {
            augzVar = augz.a;
        }
        ndeVar.e = augzVar;
        augz augzVar2 = auhdVar.c;
        if (augzVar2 == null) {
            augzVar2 = augz.a;
        }
        ndeVar.f = (augzVar2.b & 8192) != 0;
        augz augzVar3 = auhdVar.c;
        if (augzVar3 == null) {
            augzVar3 = augz.a;
        }
        ndeVar.g = augzVar3.p;
        augu[] auguVarArr = (augu[]) auhdVar.d.toArray(new augu[0]);
        String str = (auhdVar.b & 64) != 0 ? auhdVar.h : null;
        augz augzVar4 = auhdVar.c;
        if (augzVar4 == null) {
            augzVar4 = augz.a;
        }
        augz augzVar5 = augzVar4;
        if ((auhdVar.b & 2) != 0) {
            aulq aulqVar = auhdVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atltVar = null;
        }
        aoxy aoxyVar = auhdVar.f;
        if (aoxyVar == null) {
            aoxyVar = aoxy.a;
        }
        ndeVar.a(ajokVar, auhdVar, str, augzVar5, auguVarArr, atltVar, aoxyVar, auhdVar.g.I());
        this.l.addView(this.m.d);
        this.m.b(this, true);
        this.v = true;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        nde ndeVar = this.m;
        if (ndeVar.f && fhgVar != fhg.NONE) {
            ndeVar.b.n(ndeVar.e);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        if (!this.v) {
            return ayph.f();
        }
        nde ndeVar = this.m;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.u;
        fhg g = this.o.g();
        if (!ndeVar.f || g != fhg.NONE) {
            return ayph.f();
        }
        return ndeVar.b.h(i, inlinePlaybackLifecycleController, ndeVar.e, ndeVar.g);
    }
}
