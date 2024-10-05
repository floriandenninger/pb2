package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nee implements ajom {
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
    private ned o;

    /* JADX INFO: Access modifiers changed from: protected */
    public nee(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
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
        ned nedVar = this.o;
        nedVar.getClass();
        nedVar.b.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        apmg apmgVar;
        auhh auhhVar = (auhh) obj;
        ajokVar.getClass();
        auhhVar.getClass();
        this.l.removeAllViews();
        if (this.o == null) {
            this.o = new ned(this);
        }
        ned nedVar = this.o;
        augu[] auguVarArr = (augu[]) auhhVar.d.toArray(new augu[0]);
        apxf apxfVar = null;
        String str = (auhhVar.b & 64) != 0 ? auhhVar.h : null;
        augz augzVar = auhhVar.c;
        if (augzVar == null) {
            augzVar = augz.a;
        }
        augz augzVar2 = augzVar;
        if ((auhhVar.b & 2) != 0) {
            aulq aulqVar = auhhVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atltVar = null;
        }
        aoxy aoxyVar = auhhVar.f;
        if (aoxyVar == null) {
            aoxyVar = aoxy.a;
        }
        aoxy aoxyVar2 = aoxyVar;
        byte[] I = auhhVar.g.I();
        nedVar.g = ajokVar.a;
        aulq aulqVar2 = augzVar2.s;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar3 = augzVar2.s;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            apmgVar = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ncd ncdVar = nedVar.a;
        if ((augzVar2.b & 32768) != 0 && (apxfVar = augzVar2.q) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, augzVar2.v);
        nedVar.b.G(ajokVar.a, auhhVar, str, augzVar2, auguVarArr, aoxyVar2, I);
        nedVar.c.l(nedVar.g, auhhVar, augzVar2, atltVar, Integer.valueOf(wbs.W(nedVar.f.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        nedVar.d.c(nedVar.g, apmgVar, atltVar);
        this.l.addView(this.o.e);
    }
}
