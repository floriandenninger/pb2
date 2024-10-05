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
/* renamed from: new, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cnew implements ajom, ggr, gmf, fgp {
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
    public final boolean k;
    public final fgq l;
    public final ViewGroup m;
    public final FrameLayout n;
    public final akbd o;
    public final ajyw p;
    private final Resources q;
    private final InlinePlaybackLifecycleController r;
    private boolean s = false;
    private nev t;
    private nev u;
    private nev v;

    /* JADX INFO: Access modifiers changed from: protected */
    public Cnew(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, boolean z, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, fgq fgqVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
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
        this.q = context.getResources();
        this.m = viewGroup;
        this.n = new FrameLayout(context);
        this.k = z;
        this.r = inlinePlaybackLifecycleController;
        this.l = fgqVar;
        this.p = ajywVar;
        this.o = akbdVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.n;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        nev nevVar = this.v;
        nevVar.getClass();
        nevVar.b.c();
        this.v.a(this, false);
        this.s = false;
    }

    @Override // defpackage.ggr
    public final View g() {
        nev nevVar = this.v;
        FrameLayout frameLayout = this.n;
        if (nevVar.f) {
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
        return (gmfVar instanceof Cnew) && ((Cnew) gmfVar).n == this.n;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        auhk auhkVar = (auhk) obj;
        ajokVar.getClass();
        auhkVar.getClass();
        this.n.removeAllViews();
        if (this.q.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.u == null) {
                this.u = new nev(this, R.layout.promoted_sparkles_text_home_themed_cta_form_landscape);
            }
            this.v = this.u;
        } else {
            if (this.t == null) {
                this.t = new nev(this, R.layout.promoted_sparkles_text_home_themed_cta_form);
            }
            this.v = this.t;
        }
        nev nevVar = this.v;
        augy augyVar = auhkVar.c;
        if (augyVar == null) {
            augyVar = augy.a;
        }
        nevVar.e = augyVar;
        augy augyVar2 = auhkVar.c;
        if (augyVar2 == null) {
            augyVar2 = augy.a;
        }
        nevVar.f = (augyVar2.b & 128) != 0;
        augy augyVar3 = auhkVar.c;
        if (augyVar3 == null) {
            augyVar3 = augy.a;
        }
        nevVar.g = augyVar3.l;
        augy augyVar4 = auhkVar.c;
        if (augyVar4 == null) {
            augyVar4 = augy.a;
        }
        augy augyVar5 = augyVar4;
        augu[] auguVarArr = (augu[]) auhkVar.d.toArray(new augu[0]);
        aulq aulqVar = auhkVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        atlt atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        apxf apxfVar = null;
        if ((auhkVar.b & 4) != 0) {
            aoxy aoxyVar2 = auhkVar.f;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        nevVar.j = ajokVar.a;
        aulq aulqVar2 = augyVar5.p;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        apmg apmgVar = (apmg) ahbj.n(aulqVar2, ButtonRendererOuterClass.buttonRenderer);
        ncd ncdVar = nevVar.a;
        if ((augyVar5.b & 2048) != 0 && (apxfVar = augyVar5.n) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, augyVar5.s);
        nevVar.b.F(ajokVar.a, auhkVar, auhkVar.h, augyVar5, auguVarArr, aoxyVar, auhkVar.g.I());
        nevVar.c.k(nevVar.j, auhkVar, augyVar5, atltVar, Integer.valueOf(wbs.W(nevVar.i.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        nevVar.d.c(nevVar.j, apmgVar, atltVar);
        this.n.addView(this.v.h);
        this.v.a(this, true);
        this.s = true;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        nev nevVar = this.v;
        if (nevVar.f && fhgVar != fhg.NONE) {
            nevVar.c.m(nevVar.e);
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
        nev nevVar = this.v;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.r;
        fhg g = this.l.g();
        if (!nevVar.f || g != fhg.NONE) {
            return ayph.f();
        }
        return nevVar.c.g(i, inlinePlaybackLifecycleController, nevVar.e, nevVar.g);
    }
}
