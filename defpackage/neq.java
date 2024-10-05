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
public final class neq implements ajom {
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
    private nep p;
    private nep q;
    private nep r;

    /* JADX INFO: Access modifiers changed from: protected */
    public neq(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
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
        nep nepVar = this.r;
        nepVar.getClass();
        nepVar.b.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        auhj auhjVar = (auhj) obj;
        ajokVar.getClass();
        auhjVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.sparkles_text_on_home_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new nep(this, R.layout.promoted_sparkles_text_home_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new nep(this, R.layout.promoted_sparkles_text_home);
            }
            this.r = this.p;
        }
        nep nepVar = this.r;
        augy augyVar = auhjVar.c;
        if (augyVar == null) {
            augyVar = augy.a;
        }
        augy augyVar2 = augyVar;
        augu[] n = muf.n(auhjVar.d);
        aulq aulqVar = auhjVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        atlt atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        apxf apxfVar = null;
        if ((auhjVar.b & 4) != 0) {
            aoxy aoxyVar2 = auhjVar.f;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        nepVar.f = ajokVar.a;
        aulq aulqVar2 = augyVar2.p;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        apmg apmgVar = (apmg) ahbj.n(aulqVar2, ButtonRendererOuterClass.buttonRenderer);
        ncd ncdVar = nepVar.a;
        if ((augyVar2.b & 2048) != 0 && (apxfVar = augyVar2.n) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, augyVar2.s);
        nepVar.b.F(ajokVar.a, auhjVar, auhjVar.h, augyVar2, n, aoxyVar, auhjVar.g.I());
        nepVar.c.d(nepVar.f, auhjVar, augyVar2, atltVar);
        nepVar.d.c(nepVar.f, apmgVar, atltVar);
        this.l.addView(this.r.e);
    }
}
