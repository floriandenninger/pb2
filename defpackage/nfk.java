package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfk implements ajom {
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
    public final akbd m;
    public final ajyw n;
    private final Resources o;
    private nfj p;
    private nfj q;
    private nfj r;

    /* JADX INFO: Access modifiers changed from: protected */
    public nfk(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
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
        this.o = context.getResources();
        this.k = viewGroup;
        this.l = new FrameLayout(context);
        this.n = ajywVar;
        this.m = akbdVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.l;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        nfj nfjVar = this.r;
        nfjVar.getClass();
        nfjVar.b.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        aoxy aoxyVar;
        apmg apmgVar;
        auhn auhnVar = (auhn) obj;
        ajokVar.getClass();
        auhnVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new nfj(this, R.layout.promoted_sparkles_text_product_home_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new nfj(this, R.layout.promoted_sparkles_text_product_home);
            }
            this.r = this.p;
        }
        nfj nfjVar = this.r;
        auhm auhmVar = auhnVar.c;
        if (auhmVar == null) {
            auhmVar = auhm.a;
        }
        auhm auhmVar2 = auhmVar;
        augu[] n = muf.n(auhnVar.d);
        aulq aulqVar = auhnVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apxf apxfVar = null;
        if (aulqVar.pY(MutedSparklesRendererOuterClass.mutedSparklesRenderer)) {
            aulq aulqVar2 = auhnVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atltVar = (atlt) aulqVar2.pX(MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atltVar = null;
        }
        if ((auhnVar.b & 4) != 0) {
            aoxy aoxyVar2 = auhnVar.f;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        byte[] I = auhnVar.g.I();
        nfjVar.f = ajokVar.a;
        aulq aulqVar3 = auhmVar2.n;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar4 = auhmVar2.n;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            apmgVar = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ncd ncdVar = nfjVar.a;
        if ((auhmVar2.b & 512) != 0 && (apxfVar = auhmVar2.l) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, auhmVar2.q);
        nfjVar.b.H(ajokVar.a, auhnVar, auhnVar.h, auhmVar2, n, aoxyVar, I);
        nfjVar.c.i(nfjVar.f, auhnVar, auhmVar2, atltVar);
        nfjVar.d.c(nfjVar.f, apmgVar, atltVar);
        this.l.addView(this.r.e);
    }
}
