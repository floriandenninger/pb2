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
public final class nfd implements ajom, ggr, gmf, fgp {
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
    public final fgq m;
    public final akbd n;
    public final ajyw o;
    private final Resources p;
    private nfc q;
    private nfc r;
    private nfc s;
    private final InlinePlaybackLifecycleController t;
    private boolean u = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public nfd(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, fgq fgqVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
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
        this.p = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
        this.t = inlinePlaybackLifecycleController;
        this.m = fgqVar;
        this.o = ajywVar;
        this.n = akbdVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.l;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        nfc nfcVar = this.s;
        nfcVar.getClass();
        nfcVar.b.c();
        this.s.a(this, false);
        this.u = false;
    }

    @Override // defpackage.ggr
    public final View g() {
        nfc nfcVar = this.s;
        FrameLayout frameLayout = this.l;
        if (nfcVar.f) {
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
        return (gmfVar instanceof nfd) && ((nfd) gmfVar).l == this.l;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        mgg mggVar = (mgg) obj;
        ajokVar.getClass();
        mggVar.getClass();
        this.l.removeAllViews();
        if (this.p.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.r == null) {
                this.r = new nfc(this, R.layout.promoted_sparkles_text_home_themed_cta_large_square_form_landscape);
            }
            this.s = this.r;
        } else {
            if (this.q == null) {
                this.q = new nfc(this, R.layout.promoted_sparkles_text_home_themed_cta_large_square_form);
            }
            this.s = this.q;
        }
        nfc nfcVar = this.s;
        nfcVar.e = mggVar.a();
        nfcVar.f = (mggVar.a().b & 128) != 0;
        nfcVar.g = mggVar.a().l;
        auhl auhlVar = mggVar.a;
        apxf apxfVar = null;
        String str = (auhlVar.b & 64) != 0 ? auhlVar.h : null;
        augy a = mggVar.a();
        if (mggVar.d == null) {
            aony aonyVar = mggVar.a.d;
            mggVar.d = new augu[aonyVar.size()];
            for (int i = 0; i < aonyVar.size(); i++) {
                mggVar.d[i] = (augu) aonyVar.get(i);
            }
        }
        augu[] auguVarArr = mggVar.d;
        auhl auhlVar2 = mggVar.a;
        if ((auhlVar2.b & 2) != 0) {
            if (mggVar.c == null) {
                aulq aulqVar = auhlVar2.e;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                mggVar.c = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
            }
            atltVar = mggVar.c;
        } else {
            atltVar = null;
        }
        if (mggVar.b == null) {
            aoxy aoxyVar = mggVar.a.f;
            if (aoxyVar == null) {
                aoxyVar = aoxy.a;
            }
            mggVar.b = aoxyVar;
        }
        aoxy aoxyVar2 = mggVar.b;
        if (mggVar.e == null) {
            mggVar.e = mggVar.a.g.I();
        }
        byte[] bArr = mggVar.e;
        nfcVar.j = ajokVar.a;
        aulq aulqVar2 = a.p;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        apmg apmgVar = (apmg) ahbj.n(aulqVar2, ButtonRendererOuterClass.buttonRenderer);
        ncd ncdVar = nfcVar.a;
        if ((a.b & 2048) != 0 && (apxfVar = a.n) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, a.s);
        nfcVar.b.F(ajokVar.a, mggVar, str, a, auguVarArr, aoxyVar2, bArr);
        nfcVar.c.k(nfcVar.j, mggVar, a, atltVar, Integer.valueOf(wbs.W(nfcVar.i.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        nfcVar.d.c(nfcVar.j, apmgVar, atltVar);
        this.l.addView(this.s.h);
        this.s.a(this, true);
        this.u = true;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        nfc nfcVar = this.s;
        if (nfcVar.f && fhgVar != fhg.NONE) {
            nfcVar.c.m(nfcVar.e);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        if (!this.u) {
            return ayph.f();
        }
        nfc nfcVar = this.s;
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.t;
        fhg g = this.m.g();
        if (!nfcVar.f || g != fhg.NONE) {
            return ayph.f();
        }
        return nfcVar.c.g(i, inlinePlaybackLifecycleController, nfcVar.e, nfcVar.g);
    }
}
