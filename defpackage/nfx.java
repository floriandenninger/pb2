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
public final class nfx implements ajom {
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
    private nfw p;
    private nfw q;
    private nfw r;

    /* JADX INFO: Access modifiers changed from: protected */
    public nfx(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
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
        nfw nfwVar = this.r;
        nfwVar.getClass();
        nfwVar.b.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        aoxy aoxyVar;
        apmg apmgVar;
        auhq auhqVar = (auhq) obj;
        ajokVar.getClass();
        auhqVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_search_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new nfw(this, R.layout.promoted_sparkles_text_search_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new nfw(this, R.layout.promoted_sparkles_text_search_potrait);
            }
            this.r = this.p;
        }
        nfw nfwVar = this.r;
        auhp auhpVar = auhqVar.c;
        if (auhpVar == null) {
            auhpVar = auhp.a;
        }
        auhp auhpVar2 = auhpVar;
        augu[] auguVarArr = (augu[]) auhqVar.d.toArray(new augu[0]);
        aulq aulqVar = auhqVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apxf apxfVar = null;
        if (aulqVar.pY(MutedSparklesRendererOuterClass.mutedSparklesRenderer)) {
            aulq aulqVar2 = auhqVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atltVar = (atlt) aulqVar2.pX(MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atltVar = null;
        }
        if ((auhqVar.b & 4) != 0) {
            aoxy aoxyVar2 = auhqVar.f;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        nfwVar.f = ajokVar.a;
        aulq aulqVar3 = auhpVar2.h;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar4 = auhpVar2.h;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            apmgVar = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ncd ncdVar = nfwVar.a;
        if ((auhpVar2.b & 8) != 0 && (apxfVar = auhpVar2.f) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, auhpVar2.k);
        nhb nhbVar = nfwVar.b;
        acra acraVar = ajokVar.a;
        String str = auhqVar.h;
        byte[] I = auhqVar.g.I();
        aony aonyVar = auhpVar2.g;
        apln aplnVar = auhpVar2.j;
        if (aplnVar == null) {
            aplnVar = apln.a;
        }
        nhbVar.I(acraVar, auhqVar, str, aonyVar, auguVarArr, aplnVar, auhpVar2.i, aoxyVar, I);
        nfwVar.c.j(nfwVar.f, auhqVar, auhpVar2, atltVar);
        nfwVar.d.c(nfwVar.f, apmgVar, atltVar);
        this.l.addView(this.r.e);
    }
}
