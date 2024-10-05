package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nby extends nbw {
    protected final ajjz m;
    protected final ajut n;
    protected final View o;
    protected final View p;
    protected final View q;
    protected final View r;
    protected final TextView s;
    protected final View t;
    protected final fyl u;
    protected final fqw v;
    public boolean w;
    private final boolean x;
    private final goi y;

    /* JADX INFO: Access modifiers changed from: protected */
    public nby(Context context, ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, boolean z2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajuwVar, view, view2, z2, akbdVar);
        this.m = ajjzVar;
        this.n = ajutVar;
        this.x = z;
        View findViewById = view2.findViewById(R.id.cta_button_wrapper);
        this.o = findViewById;
        this.p = findViewById.findViewById(R.id.cta_button_start_filler);
        this.q = findViewById.findViewById(R.id.cta_button_touchable_wrapper);
        this.r = findViewById.findViewById(R.id.cta_button_end_filler);
        TextView textView = (TextView) findViewById.findViewById(R.id.cta_button);
        this.s = textView;
        View findViewById2 = findViewById.findViewById(R.id.ad_cta_button);
        this.t = findViewById2;
        fyl h = nck.h(view.getContext());
        this.u = h;
        view.setBackground(h);
        whu.E(textView, textView.getBackground());
        if (findViewById2 != null) {
            this.v = ajywVar.r(null, findViewById2);
        } else {
            this.v = null;
        }
        this.y = new goi(new Handler());
        this.w = false;
    }

    private final void a() {
        this.y.a();
    }

    public static void o(View view, View view2, View view3, View view4, View view5, augx augxVar) {
        augx augxVar2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
        ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams4 instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams2;
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams3;
            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams4;
            if (augxVar != null) {
                aone builder = augxVar.toBuilder();
                float f = augxVar.d;
                if (f < 0.0f) {
                    builder.copyOnWrite();
                    augx augxVar3 = (augx) builder.instance;
                    augxVar3.b |= 2;
                    augxVar3.d = 0.0f;
                } else if (f > 1.0f) {
                    builder.copyOnWrite();
                    augx augxVar4 = (augx) builder.instance;
                    augxVar4.b |= 2;
                    augxVar4.d = 1.0f;
                }
                augxVar2 = (augx) builder.build();
            } else {
                augxVar2 = null;
            }
            if (augxVar2 == null) {
                layoutParams.width = -2;
                layoutParams6.width = 0;
                layoutParams7.width = -2;
                layoutParams8.width = 0;
                layoutParams5.width = -2;
                layoutParams6.weight = 0.0f;
                layoutParams7.weight = 0.0f;
                layoutParams8.weight = 0.0f;
            } else if (augxVar2.d == 1.0f) {
                layoutParams.width = -1;
                layoutParams6.width = 0;
                layoutParams7.width = -1;
                layoutParams8.width = 0;
                layoutParams5.width = -1;
                layoutParams6.weight = 0.0f;
                layoutParams7.weight = 0.0f;
                layoutParams8.weight = 0.0f;
            } else {
                layoutParams.width = -1;
                layoutParams6.width = 0;
                layoutParams7.width = -2;
                layoutParams8.width = 0;
                layoutParams5.width = -1;
                float f2 = augxVar2.d;
                float f3 = 1.0f - f2;
                layoutParams7.weight = f2;
                int bs = anaf.bs(augxVar2.c);
                if (bs == 0) {
                    bs = 1;
                }
                int i = bs - 1;
                if (i == 2) {
                    layoutParams6.weight = f3;
                    layoutParams8.weight = 0.0f;
                } else if (i == 3) {
                    float f4 = f3 / 2.0f;
                    layoutParams6.weight = f4;
                    layoutParams8.weight = f4;
                } else {
                    layoutParams6.weight = 0.0f;
                    layoutParams8.weight = f3;
                }
            }
            view.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    private final void q(Spanned spanned, aowm aowmVar, augx augxVar, boolean z) {
        TextView textView;
        TextView textView2;
        View view;
        View view2;
        View view3;
        if (aowmVar == null) {
            whu.G(this.s, spanned);
            textView = this.s;
            whu.I(this.o, spanned != null);
            View view4 = this.t;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        } else if (this.t == null || this.v == null) {
            this.o.setVisibility(8);
            textView = null;
        } else {
            this.o.setVisibility(0);
            this.s.setVisibility(8);
            this.t.setVisibility(0);
            ?? r8 = this.t;
            this.v.c(aowmVar);
            textView2 = r8;
            this.w = true;
            if (this.x && this.o.getVisibility() == 0 && (view = this.p) != null && (view2 = this.q) != null && (view3 = this.r) != null && textView2 != null) {
                o(this.o, view, view2, view3, textView2, augxVar);
            }
            this.u.e(z);
        }
        textView2 = textView;
        this.w = true;
        if (this.x) {
            o(this.o, view, view2, view3, textView2, augxVar);
        }
        this.u.e(z);
    }

    private final boolean r() {
        return (this.t == null || this.v == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(acra acraVar, Object obj, augh aughVar, augi augiVar, boolean z) {
        aowm aowmVar;
        Spanned b;
        super.c(acraVar, obj, aughVar);
        aulq aulqVar = augiVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        augx augxVar = null;
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aulq aulqVar2 = augiVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aowmVar = (aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aowmVar = null;
        }
        if (aowmVar == null) {
            b = null;
        } else {
            aqyg aqygVar = aowmVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            b = ajcq.b(aqygVar);
        }
        if (z) {
            if ((augiVar.b & 8) != 0 && (augxVar = augiVar.f) == null) {
                augxVar = augx.a;
            }
        } else if ((augiVar.b & 4) != 0 && (augxVar = augiVar.e) == null) {
            augxVar = augx.a;
        }
        q(b, aowmVar, augxVar, augiVar.k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nbw
    public void c(acra acraVar, Object obj, augh aughVar) {
        super.c(acraVar, obj, aughVar);
        q(null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(acra acraVar, Object obj, auhm auhmVar, atlt atltVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        augn augnVar;
        atdc atdcVar;
        aowm aowmVar;
        augx augxVar;
        auhmVar.getClass();
        if ((auhmVar.b & 8) != 0) {
            aqygVar = auhmVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((auhmVar.b & 16) != 0) {
            aqygVar2 = auhmVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if ((auhmVar.b & 32768) != 0) {
            augn augnVar2 = auhmVar.s;
            if (augnVar2 == null) {
                augnVar2 = augn.a;
            }
            augnVar = augnVar2;
        } else {
            augnVar = null;
        }
        aulq aulqVar = auhmVar.n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        boolean z = aulqVar.pY(ButtonRendererOuterClass.buttonRenderer) && atltVar != null;
        aulq aulqVar2 = auhmVar.n;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(MenuRendererOuterClass.menuRenderer)) {
            aulq aulqVar3 = auhmVar.n;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            atdcVar = (atdc) aulqVar3.pX(MenuRendererOuterClass.menuRenderer);
        } else {
            atdcVar = null;
        }
        super.e(acraVar, obj, b, b2, augnVar, z, atdcVar);
        aulq aulqVar4 = auhmVar.k;
        if (aulqVar4 == null) {
            aulqVar4 = aulq.a;
        }
        if (aulqVar4.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aulq aulqVar5 = auhmVar.k;
            if (aulqVar5 == null) {
                aulqVar5 = aulq.a;
            }
            aowmVar = (aowm) aulqVar5.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aowmVar = null;
        }
        if ((auhmVar.b & 65536) != 0) {
            augxVar = auhmVar.t;
            if (augxVar == null) {
                augxVar = augx.a;
            }
        } else {
            augxVar = null;
        }
        q(null, aowmVar, augxVar, auhmVar.r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(acra acraVar, Object obj, auhp auhpVar, atlt atltVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        augn augnVar;
        atdc atdcVar;
        aowm aowmVar;
        auhpVar.getClass();
        if ((auhpVar.b & 1) != 0) {
            aqygVar = auhpVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((auhpVar.b & 2) != 0) {
            aqygVar2 = auhpVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if ((auhpVar.b & 128) != 0) {
            augn augnVar2 = auhpVar.l;
            if (augnVar2 == null) {
                augnVar2 = augn.a;
            }
            augnVar = augnVar2;
        } else {
            augnVar = null;
        }
        aulq aulqVar = auhpVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        boolean z = aulqVar.pY(ButtonRendererOuterClass.buttonRenderer) && atltVar != null;
        aulq aulqVar2 = auhpVar.h;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(MenuRendererOuterClass.menuRenderer)) {
            aulq aulqVar3 = auhpVar.h;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            atdcVar = (atdc) aulqVar3.pX(MenuRendererOuterClass.menuRenderer);
        } else {
            atdcVar = null;
        }
        super.e(acraVar, obj, b, b2, augnVar, z, atdcVar);
        aulq aulqVar4 = auhpVar.m;
        if (aulqVar4 == null) {
            aulqVar4 = aulq.a;
        }
        if (aulqVar4.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aulq aulqVar5 = auhpVar.m;
            if (aulqVar5 == null) {
                aulqVar5 = aulq.a;
            }
            aowmVar = (aowm) aulqVar5.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aowmVar = null;
        }
        q(null, aowmVar, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(acra acraVar, Object obj, augy augyVar, atlt atltVar, Integer num) {
        aone aoneVar;
        aqyg aqygVar;
        super.d(acraVar, obj, augyVar, atltVar);
        aulq aulqVar = augyVar.i;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        augx augxVar = null;
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aulq aulqVar2 = augyVar.i;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aoneVar = ((aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)).toBuilder();
        } else {
            aoneVar = null;
        }
        if (aoneVar != null) {
            aowm aowmVar = (aowm) aoneVar.instance;
            if ((aowmVar.b & 1) != 0) {
                aqyg aqygVar2 = aowmVar.e;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                if ((aqygVar2.b & 1) != 0 && num != null) {
                    int intValue = num.intValue();
                    aoneVar.copyOnWrite();
                    aowm aowmVar2 = (aowm) aoneVar.instance;
                    aowmVar2.c = 3;
                    aowmVar2.d = Integer.valueOf(intValue);
                }
            }
        }
        if ((augyVar.b & 32) != 0) {
            aqygVar = augyVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        aowm aowmVar3 = aoneVar != null ? (aowm) aoneVar.build() : null;
        if ((augyVar.b & 262144) != 0 && (augxVar = augyVar.v) == null) {
            augxVar = augx.a;
        }
        q(b, aowmVar3, augxVar, augyVar.t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(acra acraVar, Object obj, augz augzVar, atlt atltVar, Integer num) {
        aqyg aqygVar;
        aqyg aqygVar2;
        augn augnVar;
        atdc atdcVar;
        aone aoneVar;
        aqyg aqygVar3;
        augzVar.getClass();
        augx augxVar = null;
        if ((augzVar.b & 16) != 0) {
            aqygVar = augzVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((augzVar.b & 512) != 0) {
            aqygVar2 = augzVar.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if ((augzVar.b & 2097152) != 0) {
            augn augnVar2 = augzVar.x;
            if (augnVar2 == null) {
                augnVar2 = augn.a;
            }
            augnVar = augnVar2;
        } else {
            augnVar = null;
        }
        aulq aulqVar = augzVar.s;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        boolean z = aulqVar.pY(ButtonRendererOuterClass.buttonRenderer) && atltVar != null;
        aulq aulqVar2 = augzVar.s;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(MenuRendererOuterClass.menuRenderer)) {
            aulq aulqVar3 = augzVar.s;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            atdcVar = (atdc) aulqVar3.pX(MenuRendererOuterClass.menuRenderer);
        } else {
            atdcVar = null;
        }
        super.e(acraVar, obj, b, b2, augnVar, z, atdcVar);
        aulq aulqVar4 = augzVar.m;
        if (aulqVar4 == null) {
            aulqVar4 = aulq.a;
        }
        if (aulqVar4.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aulq aulqVar5 = augzVar.m;
            if (aulqVar5 == null) {
                aulqVar5 = aulq.a;
            }
            aoneVar = ((aowm) aulqVar5.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)).toBuilder();
        } else {
            aoneVar = null;
        }
        if (aoneVar != null) {
            aqyg aqygVar4 = ((aowm) aoneVar.instance).e;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            if ((aqygVar4.b & 1) != 0 && num != null) {
                int intValue = num.intValue();
                aoneVar.copyOnWrite();
                aowm aowmVar = (aowm) aoneVar.instance;
                aowmVar.c = 3;
                aowmVar.d = Integer.valueOf(intValue);
            }
        }
        if ((augzVar.b & 1024) != 0) {
            aqygVar3 = augzVar.l;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b3 = ajcq.b(aqygVar3);
        aowm aowmVar2 = aoneVar != null ? (aowm) aoneVar.build() : null;
        if ((augzVar.b & 4194304) != 0 && (augxVar = augzVar.y) == null) {
            augxVar = augx.a;
        }
        q(b3, aowmVar2, augxVar, augzVar.w);
    }

    public final void m(augy augyVar) {
        a();
        if (!r() || (augyVar.b & 64) == 0 || this.w) {
            return;
        }
        aulq aulqVar = augyVar.i;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        this.v.c((aowm) aulqVar.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        this.w = true;
    }

    public final void n(augz augzVar) {
        a();
        if (!r() || (augzVar.b & 2048) == 0 || this.w) {
            return;
        }
        aulq aulqVar = augzVar.m;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        this.v.c((aowm) aulqVar.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        this.w = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(acra acraVar, Object obj, augy augyVar, auge augeVar, boolean z) {
        aowm aowmVar;
        Spanned b;
        augx augxVar = null;
        super.d(acraVar, obj, augyVar, null);
        aulq aulqVar = augeVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aulq aulqVar2 = augeVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aowmVar = (aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aowmVar = null;
        }
        if (aowmVar == null) {
            b = null;
        } else {
            aqyg aqygVar = aowmVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            b = ajcq.b(aqygVar);
        }
        if (z) {
            if ((augeVar.b & 8) != 0 && (augxVar = augeVar.f) == null) {
                augxVar = augx.a;
            }
        } else if ((augeVar.b & 4) != 0 && (augxVar = augeVar.e) == null) {
            augxVar = augx.a;
        }
        q(b, aowmVar, augxVar, augeVar.l);
    }

    public final ayph g(int i, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, augy augyVar, boolean z) {
        if (i != 0 || z) {
            if (r() && (augyVar.b & 128) != 0 && this.w) {
                aulq aulqVar = augyVar.j;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                this.y.c(new nbx(this, (aowm) aulqVar.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer), 0), augyVar.k);
            }
            return inlinePlaybackLifecycleController.h();
        }
        m(augyVar);
        return ayph.f();
    }

    public final ayph h(int i, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, augz augzVar, boolean z) {
        if (i != 0 || z) {
            if (r() && (augzVar.b & 8192) != 0 && this.w) {
                aulq aulqVar = augzVar.o;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                this.y.c(new nbx(this, (aowm) aulqVar.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer), 1), augzVar.n);
            }
            return inlinePlaybackLifecycleController.h();
        }
        n(augzVar);
        return ayph.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nby(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(null, ajjzVar, ajutVar, ajuwVar, view, view2, z, false, ajywVar, akbdVar, null, null, null, null, null);
    }
}
