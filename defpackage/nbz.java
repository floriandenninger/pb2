package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.NativeAdBadgeRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nbz extends nby {
    private final View A;
    private final View B;
    private final ImageView C;
    private final TextView D;
    private Integer E;
    private ViewGroup.MarginLayoutParams F;
    private Float G;
    protected final View x;
    protected final ImageView y;
    protected final ImageView z;

    /* JADX INFO: Access modifiers changed from: protected */
    public nbz(Context context, ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, boolean z2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, ajutVar, ajuwVar, view, view2, z, z2, ajywVar, akbdVar, null, null, null, null, null);
        View findViewById = view2.findViewById(R.id.thumbnail_wrapper);
        this.x = findViewById;
        this.y = (ImageView) findViewById.findViewById(R.id.thumbnail);
        this.z = (ImageView) findViewById.findViewById(R.id.icon);
        View findViewById2 = view2.findViewById(R.id.overlay_badge_layout);
        this.A = findViewById2;
        View findViewById3 = findViewById2.findViewById(R.id.native_overlay_badge);
        this.B = findViewById3;
        this.C = (ImageView) findViewById3.findViewById(R.id.overlay_badge_icon);
        this.D = (TextView) findViewById3.findViewById(R.id.overlay_badge_text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void u(View view, int i) {
        if (view != null && (view.getLayoutParams() instanceof GridLayout.LayoutParams)) {
            yny.z(view, new zhg(GridLayout.spec(i), 0), GridLayout.LayoutParams.class);
        }
    }

    private final void v(avgg avggVar, arfs arfsVar, atlz atlzVar, boolean z, aqyg aqygVar) {
        if (avggVar != null) {
            this.m.h(this.y, avggVar);
        } else {
            ImageView imageView = this.y;
            imageView.setImageDrawable(aii.a(imageView.getContext(), z ? R.drawable.native_ad_fallback_square_thumbnail : R.drawable.native_ad_fallback_thumbnail));
        }
        if (aqygVar != null) {
            String valueOf = String.valueOf(this.y.getContentDescription());
            String str = ((aqyi) aqygVar.c.get(0)).c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(str);
            this.y.setContentDescription(sb.toString());
        }
        if (z) {
            q();
        } else {
            s();
        }
        if (arfsVar != null) {
            ImageView imageView2 = this.z;
            ajut ajutVar = this.n;
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView2.setImageResource(ajutVar.a(b));
            this.z.setVisibility(0);
        } else {
            this.z.setVisibility(8);
        }
        whu.I(this.A, atlzVar != null);
        Spanned spanned = null;
        aqyg aqygVar2 = null;
        if (atlzVar != null) {
            Drawable background = this.B.getBackground();
            if (background instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
                int i = atlzVar.e;
                if (i != 0) {
                    gradientDrawable.setColor(i);
                } else {
                    gradientDrawable.setColor(this.B.getResources().getColor(R.color.native_thumbnail_badge_background_color));
                }
            }
            if ((1 & atlzVar.b) == 0) {
                this.C.setVisibility(8);
            } else {
                ImageView imageView3 = this.C;
                ajut ajutVar2 = this.n;
                arfs arfsVar2 = atlzVar.c;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b2 = arfr.b(arfsVar2.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                imageView3.setImageResource(ajutVar2.a(b2));
                this.C.setVisibility(0);
            }
        } else {
            atlzVar = null;
        }
        TextView textView = this.D;
        if (atlzVar != null) {
            if ((atlzVar.b & 2) != 0 && (aqygVar2 = atlzVar.d) == null) {
                aqygVar2 = aqyg.a;
            }
            spanned = ajcq.b(aqygVar2);
        }
        whu.G(textView, spanned);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(acra acraVar, Object obj, augy augyVar, auge augeVar, boolean z, boolean z2) {
        avgg avggVar;
        super.p(acraVar, obj, augyVar, augeVar, z2);
        aqyg aqygVar = null;
        if ((augyVar.b & 1) != 0) {
            avgg avggVar2 = augyVar.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avggVar = avggVar2;
        } else {
            avggVar = null;
        }
        aulq aulqVar = augyVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        atlz atlzVar = (atlz) ahbj.n(aulqVar, NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        if (z && (aqygVar = augyVar.f) == null) {
            aqygVar = aqyg.a;
        }
        v(avggVar, null, atlzVar, false, aqygVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nby
    public void b(acra acraVar, Object obj, augh aughVar, augi augiVar, boolean z) {
        avgg avggVar;
        atlz atlzVar;
        super.b(acraVar, obj, aughVar, augiVar, z);
        aqyg aqygVar = null;
        if ((aughVar.b & 4) != 0) {
            avgg avggVar2 = aughVar.d;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avggVar = avggVar2;
        } else {
            avggVar = null;
        }
        aulq aulqVar = aughVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aulq aulqVar2 = aughVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atlzVar = (atlz) aulqVar2.pX(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        } else {
            atlzVar = null;
        }
        if ((aughVar.b & 1) != 0 && (aqygVar = aughVar.c) == null) {
            aqygVar = aqyg.a;
        }
        v(avggVar, null, atlzVar, false, aqygVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nby, defpackage.nbw
    public void c(acra acraVar, Object obj, augh aughVar) {
        avgg avggVar;
        super.c(acraVar, obj, aughVar);
        atlz atlzVar = null;
        if ((aughVar.b & 4) != 0) {
            avgg avggVar2 = aughVar.d;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avggVar = avggVar2;
        } else {
            avggVar = null;
        }
        aulq aulqVar = aughVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aulq aulqVar2 = aughVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atlzVar = (atlz) aulqVar2.pX(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        }
        v(avggVar, null, atlzVar, false, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nby
    public void i(acra acraVar, Object obj, auhm auhmVar, atlt atltVar) {
        avgg avggVar;
        arfs arfsVar;
        super.i(acraVar, obj, auhmVar, atltVar);
        atlz atlzVar = null;
        if ((auhmVar.b & 1) != 0) {
            avgg avggVar2 = auhmVar.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avggVar = avggVar2;
        } else {
            avggVar = null;
        }
        if ((auhmVar.b & 4) != 0) {
            arfs arfsVar2 = auhmVar.e;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            arfsVar = arfsVar2;
        } else {
            arfsVar = null;
        }
        aulq aulqVar = auhmVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aulq aulqVar2 = auhmVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atlzVar = (atlz) aulqVar2.pX(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        }
        v(avggVar, arfsVar, atlzVar, auhmVar.u, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nby
    public void k(acra acraVar, Object obj, augy augyVar, atlt atltVar, Integer num) {
        avgg avggVar;
        super.k(acraVar, obj, augyVar, atltVar, num);
        arfs arfsVar = null;
        if ((augyVar.b & 1) != 0) {
            avgg avggVar2 = augyVar.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avggVar = avggVar2;
        } else {
            avggVar = null;
        }
        if ((augyVar.b & 4) != 0 && (arfsVar = augyVar.e) == null) {
            arfsVar = arfs.a;
        }
        arfs arfsVar2 = arfsVar;
        aulq aulqVar = augyVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        v(avggVar, arfsVar2, (atlz) ahbj.n(aulqVar, NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer), augyVar.w, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nby
    public void l(acra acraVar, Object obj, augz augzVar, atlt atltVar, Integer num) {
        avgg avggVar;
        arfs arfsVar;
        super.l(acraVar, obj, augzVar, atltVar, num);
        atlz atlzVar = null;
        if ((augzVar.b & 1) != 0) {
            avgg avggVar2 = augzVar.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avggVar = avggVar2;
        } else {
            avggVar = null;
        }
        if ((augzVar.b & 8) != 0) {
            arfs arfsVar2 = augzVar.f;
            if (arfsVar2 == null) {
                arfsVar2 = arfs.a;
            }
            arfsVar = arfsVar2;
        } else {
            arfsVar = null;
        }
        aulq aulqVar = augzVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aulq aulqVar2 = augzVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atlzVar = (atlz) aulqVar2.pX(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        }
        v(avggVar, arfsVar, atlzVar, augzVar.z, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        View view = this.x;
        if (view instanceof FixedAspectRatioFrameLayout) {
            if (this.G == null) {
                FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) view;
                this.G = Float.valueOf(fixedAspectRatioFrameLayout.a);
                fixedAspectRatioFrameLayout.a = 1.0f;
                return;
            }
            return;
        }
        if (this.E == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            this.E = Integer.valueOf(layoutParams.height);
            yny.z(this.x, yny.n(layoutParams.width + 18), ViewGroup.LayoutParams.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextView textView = this.d;
        if (textView == null || (marginLayoutParams = this.F) == null) {
            return;
        }
        yny.z(textView, yny.h(yny.o(marginLayoutParams.leftMargin), yny.v(this.F.topMargin), yny.u(this.F.rightMargin), yny.k(this.F.bottomMargin)), ViewGroup.MarginLayoutParams.class);
        this.F = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        View view = this.x;
        if (!(view instanceof FixedAspectRatioFrameLayout)) {
            Integer num = this.E;
            if (num != null) {
                yny.z(view, yny.n(num.intValue()), ViewGroup.LayoutParams.class);
                this.E = null;
                return;
            }
            return;
        }
        Float f = this.G;
        if (f != null) {
            ((FixedAspectRatioFrameLayout) view).a = f.floatValue();
            this.G = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(Integer num) {
        TextView textView = this.d;
        if (textView != null && (textView.getLayoutParams() instanceof GridLayout.LayoutParams)) {
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.d.getLayoutParams();
            if (this.F == null) {
                this.F = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            yny.z(this.d, yny.h(yny.o(layoutParams.leftMargin), yny.v(layoutParams.topMargin), yny.u(layoutParams.rightMargin), yny.k(num.intValue())), ViewGroup.MarginLayoutParams.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nbz(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(null, ajjzVar, ajutVar, ajuwVar, view, view2, z, false, ajywVar, akbdVar, null, null, null, null, null);
    }
}
