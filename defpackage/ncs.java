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
public final class ncs implements ajom {
    public final Context a;
    public final ajjz b;
    public final aahd c;
    public final ajut d;
    public final ajuw e;
    public final wyz f;
    public final tdv g;
    public final wzq h;
    public final ypa i;
    public final ViewGroup j;
    public final FrameLayout k;
    public final euv l;
    public final akbd m;
    public final ajyw n;
    private final Resources o;
    private ned p;
    private ned q;
    private ned r;

    /* JADX INFO: Access modifiers changed from: protected */
    public ncs(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajutVar;
        this.e = ajuwVar;
        this.f = wyzVar;
        this.g = tdvVar;
        this.h = wzqVar;
        this.l = euvVar;
        this.i = ypaVar;
        this.o = context.getResources();
        this.j = viewGroup;
        this.k = new FrameLayout(context);
        this.n = ajywVar;
        this.m = akbdVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.k;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ned nedVar = this.r;
        nedVar.getClass();
        nedVar.b.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        apmg apmgVar;
        auha auhaVar = (auha) obj;
        ajokVar.getClass();
        auhaVar.getClass();
        this.k.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new ned(this, R.layout.promoted_sparkles_text_ctd_home_compact_form_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new ned(this, R.layout.promoted_sparkles_text_ctd_home_compact_form);
            }
            this.r = this.p;
        }
        ned nedVar = this.r;
        augz augzVar = auhaVar.c;
        if (augzVar == null) {
            augzVar = augz.a;
        }
        augz augzVar2 = augzVar;
        augu[] n = muf.n(auhaVar.d);
        aulq aulqVar = auhaVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        atlt atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        apxf apxfVar = null;
        if ((auhaVar.b & 4) != 0) {
            aoxy aoxyVar2 = auhaVar.f;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
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
        nedVar.b.G(ajokVar.a, auhaVar, auhaVar.h, augzVar2, n, aoxyVar, auhaVar.g.I());
        nedVar.c.v(nedVar.g, auhaVar, augzVar2, atltVar);
        nedVar.d.c(nedVar.g, apmgVar, atltVar);
        this.k.addView(this.r.e);
    }
}
