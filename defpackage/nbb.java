package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbb implements ajom {
    public final Context a;
    public final ajjz b;
    public final aahd c;
    public final ajut d;
    public final ajuw e;
    public final wyz f;
    public final tdv g;
    public final wzq h;
    public final ypa i;
    public final euv j;
    public final ViewGroup k;
    public final FrameLayout l;
    public final akbd m;
    public final ajyw n;
    private final Resources o;
    private nba p;
    private nba q;
    private nba r;

    /* JADX INFO: Access modifiers changed from: protected */
    public nbb(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, ypa ypaVar, ViewGroup viewGroup, euv euvVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajutVar;
        this.e = ajuwVar;
        this.f = wyzVar;
        this.g = tdvVar;
        this.h = wzqVar;
        this.i = ypaVar;
        this.j = euvVar;
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
        nba nbaVar = this.r;
        nbaVar.getClass();
        nbaVar.b.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        apmg apmgVar;
        apxf apxfVar;
        augg auggVar = (augg) obj;
        ajokVar.getClass();
        auggVar.getClass();
        this.l.removeAllViews();
        if (this.o.getBoolean(R.bool.discovery_app_promo_compact_form_use_landscape_layout)) {
            if (this.q == null) {
                this.q = new nba(this, R.layout.promoted_discovery_app_promo_compact_form_landscape);
            }
            this.r = this.q;
        } else {
            if (this.p == null) {
                this.p = new nba(this, R.layout.promoted_discovery_app_promo_compact_form_portrait);
            }
            this.r = this.p;
        }
        nba nbaVar = this.r;
        augh aughVar = auggVar.c;
        if (aughVar == null) {
            aughVar = augh.a;
        }
        augh aughVar2 = aughVar;
        augu[] n = muf.n(auggVar.d);
        if ((auggVar.b & 2) != 0) {
            aoxy aoxyVar2 = auggVar.e;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        nbaVar.f = ajokVar.a;
        aulq aulqVar = aughVar2.m;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = aughVar2.m;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ncd ncdVar = nbaVar.a;
        if ((aughVar2.b & 256) != 0) {
            apxfVar = aughVar2.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        apxf apxfVar2 = aughVar2.l;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        ncdVar.b = apxfVar;
        ncdVar.c = amru.r(apxfVar2);
        nbaVar.b.E(ajokVar.a, auggVar, auggVar.g, aughVar2, n, aoxyVar, auggVar.f.I());
        nbaVar.c.c(nbaVar.f, auggVar, aughVar2);
        nbaVar.d.c(nbaVar.f, apmgVar, null);
        this.l.addView(this.r.e);
    }
}
