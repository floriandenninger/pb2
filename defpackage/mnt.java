package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnt extends ajpc implements View.OnClickListener, ajyc, ggr, gmf {
    private final gaf A;
    private final int B;
    private aqjc C;
    private final azrw D;
    private mpq E;
    private final int F;
    private final int G;
    private final ajun H;
    public final Context a;
    public mgv b;
    public final int c;
    final FixedAspectRatioFrameLayout d;
    final LinearLayout e;
    final ImageView f;
    View.OnClickListener g;
    ViewTreeObserver.OnPreDrawListener h;
    final TextView i;
    final TextView j;
    final TextView k;
    final ImageView l;
    final ImageView m;
    final ImageView n;
    final TextureView o;
    final FrameLayout p;
    private final Resources q;
    private final ajjz r;
    private final aahd s;
    private final ajuw t;
    private final ajyf u;
    private final ajco v;
    private final ajtf x;
    private final zbb y;
    private final InlinePlaybackLifecycleController z;

    public mnt(Context context, ajjz ajjzVar, aahd aahdVar, ajyg ajygVar, ajuw ajuwVar, ajtd ajtdVar, azrw azrwVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ajoy ajoyVar, ajun ajunVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.r = ajjzVar;
        this.s = aahdVar;
        this.t = ajuwVar;
        Resources resources = context.getResources();
        this.q = resources;
        this.D = azrwVar;
        this.z = inlinePlaybackLifecycleController;
        this.H = ajunVar;
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) LayoutInflater.from(context).inflate(R.layout.default_promo_panel, (ViewGroup) null);
        this.d = fixedAspectRatioFrameLayout;
        ImageView imageView = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.background_image);
        this.m = imageView;
        this.l = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.avatar_image);
        this.o = (TextureView) fixedAspectRatioFrameLayout.findViewById(R.id.texture_view);
        this.p = (FrameLayout) fixedAspectRatioFrameLayout.findViewById(R.id.inline_playback_view);
        this.n = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.foreground_image);
        this.f = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.contextual_menu_anchor);
        LinearLayout linearLayout = (LinearLayout) fixedAspectRatioFrameLayout.findViewById(R.id.text_layout);
        this.e = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.title);
        this.i = textView;
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.description);
        this.j = textView2;
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.action_button);
        this.k = textView3;
        ajyf a = ajygVar.a(textView3);
        this.u = a;
        a.c = this;
        this.y = whu.Q(fixedAspectRatioFrameLayout.findViewById(R.id.background_scrim));
        this.A = ajoyVar.J(context, (ViewStub) fixedAspectRatioFrameLayout.findViewById(R.id.featured_badge));
        fixedAspectRatioFrameLayout.setOnClickListener(this);
        this.c = resources.getDimensionPixelSize(R.dimen.promo_panel_text_layout_top_bottom_margin);
        this.F = resources.getDimensionPixelSize(R.dimen.promo_panel_foreground_image_max_height);
        this.G = resources.getDimensionPixelSize(R.dimen.promo_panel_text_layout_active_item_indicator_margin);
        ajcn a2 = ajco.a();
        a2.a = context;
        a2.c = new ajrv(aahdVar);
        this.v = a2.a();
        ColorStateList S = wbs.S(context, R.attr.ytOverlayTextPrimary);
        ajte ajteVar = ajtdVar.a;
        ajteVar.a = textView;
        ajteVar.b = textView2;
        ajteVar.c = imageView;
        ajteVar.d = S;
        ajteVar.e = S;
        ajteVar.f = wbs.S(context, android.R.attr.textColorLink);
        this.x = ajteVar.a();
        this.B = wbs.Q(context, R.attr.ytGeneralBackgroundB);
    }

    public static int h(Context context, int i) {
        return (int) context.getResources().getFraction(R.fraction.promo_panel_avatar_height_width_ratio, i, 1);
    }

    public static hx k(Context context, avgg avggVar, int i) {
        avgf J2 = ahbw.J(avggVar);
        if (J2 == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int K = yjk.K(displayMetrics, J2.d);
        int K2 = yjk.K(displayMetrics, J2.e);
        if (K2 <= i || i == -1) {
            i = K2;
        } else {
            K = (int) ((J2.d / J2.e) * i);
        }
        return new hx(Integer.valueOf(K), Integer.valueOf(i));
    }

    public static avgg m(aqjc aqjcVar) {
        if (aqjcVar == null || (aqjcVar.b & 64) == 0) {
            return null;
        }
        aqja aqjaVar = aqjcVar.k;
        if (aqjaVar == null) {
            aqjaVar = aqja.a;
        }
        if ((aqjaVar.b & 1) == 0) {
            return null;
        }
        aqja aqjaVar2 = aqjcVar.k;
        if (aqjaVar2 == null) {
            aqjaVar2 = aqja.a;
        }
        if ((aqjaVar2.b & 2) == 0) {
            return null;
        }
        aqja aqjaVar3 = aqjcVar.k;
        if (aqjaVar3 == null) {
            aqjaVar3 = aqja.a;
        }
        int ap = aobq.ap(aqjaVar3.d);
        if (ap == 0 || ap != 2) {
            return null;
        }
        aqja aqjaVar4 = aqjcVar.k;
        if (aqjaVar4 == null) {
            aqjaVar4 = aqja.a;
        }
        avgg avggVar = aqjaVar4.c;
        return avggVar == null ? avgg.a : avggVar;
    }

    public static avgg n(Context context, aqjc aqjcVar) {
        avgl avglVar;
        if (aqjcVar == null) {
            return null;
        }
        avgm avgmVar = aqjcVar.h;
        if (avgmVar == null) {
            avgmVar = avgm.a;
        }
        if ((avgmVar.b & 1) == 0) {
            return null;
        }
        avgm avgmVar2 = aqjcVar.i;
        if (avgmVar2 == null) {
            avgmVar2 = avgm.a;
        }
        if ((avgmVar2.b & 1) == 0) {
            return null;
        }
        if (yjk.aa(context)) {
            avgm avgmVar3 = aqjcVar.i;
            if (avgmVar3 == null) {
                avgmVar3 = avgm.a;
            }
            avglVar = avgmVar3.c;
            if (avglVar == null) {
                avglVar = avgl.a;
            }
        } else {
            avgm avgmVar4 = aqjcVar.h;
            if (avgmVar4 == null) {
                avgmVar4 = avgm.a;
            }
            avglVar = avgmVar4.c;
            if (avglVar == null) {
                avglVar = avgl.a;
            }
        }
        if (etx.t(context.getResources().getConfiguration().orientation)) {
            avgg avggVar = avglVar.d;
            return avggVar == null ? avgg.a : avggVar;
        }
        avgg avggVar2 = avglVar.c;
        return avggVar2 == null ? avgg.a : avggVar2;
    }

    private final arhz p() {
        aulq aulqVar;
        aqjc aqjcVar = this.C;
        if (!(aqjcVar.c == 22 ? (aulq) aqjcVar.d : aulq.a).pY(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            return null;
        }
        aqjc aqjcVar2 = this.C;
        if (aqjcVar2.c == 22) {
            aulqVar = (aulq) aqjcVar2.d;
        } else {
            aulqVar = aulq.a;
        }
        return (arhz) aulqVar.pX(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
    }

    private static void q(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i2;
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.E != null) {
            yny.A(this.p, new ejz(16), yny.y(-1, -1), FrameLayout.LayoutParams.class);
            this.p.setX(0.0f);
            this.p.removeAllViews();
            this.E.b(ajosVar);
            this.E = null;
        }
        this.m.setBackgroundColor(this.B);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d2  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnt.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqjc) obj).x.I();
    }

    public final float f(ajok ajokVar) {
        float fraction = this.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
        Object obj = ajokVar.d.get("carousel_aspect_ratio");
        return obj instanceof Float ? ((Float) obj).floatValue() : fraction;
    }

    @Override // defpackage.ggr
    public final View g() {
        mpq mpqVar = this.E;
        if (mpqVar == null) {
            return null;
        }
        return mpqVar.g();
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
        mpq mpqVar = this.E;
        if (mpqVar != null) {
            mpqVar.i(z);
        }
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    public final void o(int i) {
        int e = jw.e(this.d);
        int i2 = e == 1 ? i : 0;
        if (e == 1) {
            i = 0;
        }
        int childCount = this.e.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = this.e.getChildAt(childCount);
            if ((childAt instanceof TextView) && childAt.getVisibility() == 0) {
                q(childAt, i2, i);
                return;
            }
        }
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        if (gmfVar instanceof mnt) {
            return ((mnt) gmfVar).C.equals(this.C);
        }
        return false;
    }

    @Override // defpackage.ajyc
    public final void oC(aong aongVar) {
        if (this.E != null) {
            this.z.p();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        aqjc aqjcVar = this.C;
        if (aqjcVar == null) {
            return;
        }
        aahd aahdVar = this.s;
        apxf apxfVar2 = null;
        if ((aqjcVar.b & 128) != 0) {
            apxfVar = aqjcVar.m;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        aahdVar.c(apxfVar, acrc.i(this.C, false));
        aahd aahdVar2 = this.s;
        aqjc aqjcVar2 = this.C;
        if ((aqjcVar2.b & 256) != 0 && (apxfVar2 = aqjcVar2.n) == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar2.c(apxfVar2, acrc.g(this.C));
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        if (i == 0) {
            if (this.C.c == 22) {
                return this.z.i(evr.bp(p()));
            }
        } else if (this.C.c == 22) {
            return this.z.j(evr.bp(p()), this, i != 2 ? 0 : 2);
        }
        return ayph.f();
    }
}
