package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ikn implements View.OnClickListener, ilc, ilg {
    public final ilh A;
    public final amsj C;
    private final aaea D;
    private final ajjz E;
    private final ViewGroup F;
    private final TextView G;
    private final ggy H;
    private final ftn I;
    private final ajdw K;
    private int L;
    private int M;
    private int N;
    private ViewGroup O;
    private View P;
    private View Q;
    private View R;
    private TextView S;
    private TextView T;
    private Button U;
    private YouTubeButton V;
    private ViewGroup W;
    private CircularImageView X;
    private TextView Y;
    private TextView Z;
    public final ikm a;
    private ajkj aa;
    private ftl ab;
    private final amsj ac;
    private final amsj ad;
    private final ajoy ae;
    public final ilp b;
    public final ViewGroup c;
    public final View d;
    public final ViewGroup e;
    public final aahd f;
    public final imd g;
    public final acqz h;
    public final ajut i;
    public View j;
    public View k;
    public LottieAnimationView l;
    public ViewGroup m;
    public View n;
    public TextView o;
    public TextView p;
    public TextView q;
    public long r;
    public boolean s;
    public ilw t;
    public ftm u;
    public aukf v;
    public acsc w;

    /* renamed from: J, reason: collision with root package name */
    private final ayqw f222J = new ayqw();
    public final List x = new ArrayList();
    public final List y = new ArrayList();
    public final AnimatorSet z = new AnimatorSet();
    public boolean B = false;

    public ikn(amsj amsjVar, amsj amsjVar2, ilp ilpVar, ajjz ajjzVar, aahd aahdVar, ggy ggyVar, acqz acqzVar, ftn ftnVar, ajyw ajywVar, amsj amsjVar3, ajut ajutVar, ajoy ajoyVar, ajdw ajdwVar, yqw yqwVar, final axze axzeVar, aaea aaeaVar, ViewGroup viewGroup, ikm ikmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.C = amsjVar;
        this.ad = amsjVar2;
        this.b = ilpVar;
        this.E = ajjzVar;
        this.ac = amsjVar3;
        this.c = viewGroup;
        this.a = ikmVar;
        this.h = acqzVar;
        this.I = ftnVar;
        this.H = ggyVar;
        this.f = aahdVar;
        acqz acqzVar2 = (acqz) ajywVar.a.get();
        acqzVar2.getClass();
        ghd ghdVar = (ghd) ajywVar.c.get();
        amsj amsjVar4 = (amsj) ajywVar.b.get();
        amsjVar4.getClass();
        this.g = new imd(ggyVar, acqzVar2, ghdVar, amsjVar4, null, null, null);
        this.A = new ilh(ajjzVar, aahdVar, acqzVar, ajutVar);
        this.ae = ajoyVar;
        this.i = ajutVar;
        this.K = ajdwVar;
        this.D = aaeaVar;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.reel_player_header_container);
        viewGroup2.getClass();
        this.F = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.reel_player_footer_container);
        viewGroup3.getClass();
        this.e = viewGroup3;
        this.d = viewGroup.findViewById(R.id.reel_persistent_edu_button_group);
        this.G = (TextView) viewGroup.findViewById(R.id.reel_persistent_edu_button_label);
        final byte[] bArr7 = null;
        final byte[] bArr8 = null;
        final byte[] bArr9 = null;
        yqwVar.f(new Callable(axzeVar, bArr7, bArr8, bArr9) { // from class: ikb
            public final /* synthetic */ axze b;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.b.a.a.Y(axyz.u).B().ax(new ikg(ikn.this, 1));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(int r8, defpackage.aukd r9, final defpackage.auzj r10, final boolean r11) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikn.A(int, aukd, auzj, boolean):void");
    }

    private final void B(String str, int i, aukd aukdVar, boolean z, boolean z2) {
        Spanned spanned;
        Spanned spanned2;
        Spanned spanned3;
        boolean z3 = i == 5;
        int i2 = z3 ? R.layout.reel_player_header_video : R.layout.reel_player_header_story;
        View findViewById = this.F.findViewById(R.id.reel_header_group);
        this.j = findViewById;
        if (findViewById != null && (str == null || !str.equals(findViewById.getTag()))) {
            this.F.removeAllViews();
            this.j = null;
            this.aa = null;
        }
        if (this.j == null) {
            View inflate = LayoutInflater.from(this.F.getContext()).inflate(i2, this.F, false);
            this.j = inflate;
            inflate.setTag(str);
            this.F.addView(this.j);
        }
        etx.M(this.j, true);
        this.o = (TextView) this.j.findViewById(R.id.reel_main_title);
        this.p = (TextView) this.j.findViewById(R.id.reel_byline_text);
        this.S = (TextView) this.j.findViewById(i == 5 ? 0 : R.id.reel_timestamp_story);
        this.n = this.j.findViewById(R.id.reel_byline_separator);
        this.X = (CircularImageView) this.j.findViewById(R.id.reel_channel_thumbnail);
        if (z3) {
            this.Q = this.n;
        }
        ikc ikcVar = new ikc(this, 1);
        CircularImageView circularImageView = this.X;
        if (circularImageView != null) {
            circularImageView.setOnClickListener(ikcVar);
        }
        TextView textView = this.p;
        if (textView != null) {
            textView.setOnClickListener(ikcVar);
        }
        if (z && aukdVar != null && (aukdVar.b & 64) != 0) {
            c(aukdVar.h);
        }
        if (z && aukdVar != null && (aukdVar.b & 1) != 0) {
            aqyg aqygVar = aukdVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            adyu.cd(aqygVar, this.h.mM());
        }
        if (aukdVar == null || (aukdVar.b & 2) == 0) {
            spanned = null;
        } else {
            aqyg aqygVar2 = aukdVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            spanned = ajcq.b(aqygVar2);
        }
        if (aukdVar == null || (aukdVar.b & 1) == 0) {
            spanned2 = null;
        } else {
            aqyg aqygVar3 = aukdVar.c;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            spanned2 = ajcq.b(aqygVar3);
        }
        if (aukdVar == null || (aukdVar.b & 8) == 0) {
            spanned3 = null;
        } else {
            aqyg aqygVar4 = aukdVar.f;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            spanned3 = ajcq.b(aqygVar4);
        }
        if (spanned3 == null || spanned3.length() == 0 || spanned3.equals(spanned2)) {
            spanned3 = spanned2;
            spanned2 = null;
        }
        etx.M(this.o, spanned2 != null);
        etx.M(this.p, spanned3 != null);
        t(this.o, spanned2);
        TextView textView2 = this.p;
        if (textView2 != null) {
            t(textView2, spanned3);
            if (!z3 && spanned2 != null) {
                this.p.setTypeface(Typeface.DEFAULT);
            }
        }
        etx.M(this.S, spanned != null);
        t(this.S, spanned);
        etx.M(this.n, (spanned3 == null || spanned == null) ? false : true);
        if (aukdVar == null || (aukdVar.b & 16) == 0) {
            this.aa = null;
            this.X.setImageResource(R.color.yt_black1);
        } else if (this.aa == null) {
            ajkj ajkjVar = new ajkj(this.E, new yzw(), this.X, false);
            this.aa = ajkjVar;
            avgg avggVar = aukdVar.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajkjVar.k(avggVar);
        }
        etx.M(this.X, true);
        if (i == 3) {
            this.M = R.id.reel_header_subscribe_button;
        } else if (i == 4) {
            this.N = R.id.reel_header_menu_button;
        }
        a(this.c, z3, z2);
    }

    private final TextView C(ViewGroup viewGroup, int i, apmg apmgVar, ikn iknVar, boolean z) {
        if (apmgVar == null) {
            return null;
        }
        TextView x = x(viewGroup, i, R.drawable.ic_comment_white_24);
        x.setId(R.id.reel_dyn_comment);
        q(x, R.string.reel_footer_comment);
        r(x, apmgVar);
        x.setContentDescription(w(apmgVar));
        x.setOnClickListener(iknVar);
        x.setEnabled(!apmgVar.h);
        x.setAlpha(true != apmgVar.h ? 1.0f : 0.3f);
        if (z && (apmgVar.b & 1048576) != 0) {
            c(apmgVar.t);
        }
        return x;
    }

    private static final TextView D(int i, ViewGroup viewGroup, int i2, aqyg aqygVar, int i3, int i4, boolean z) {
        if (aqygVar == null) {
            return null;
        }
        TextView x = x(viewGroup, i2, i3);
        x.setId(i);
        s(x, aqygVar);
        if (i4 != 0) {
            x.setContentDescription(x.getResources().getString(i4));
        }
        if (z) {
            x.setFocusableInTouchMode(true);
            x.setBackground(null);
        }
        return x;
    }

    private final void E(ViewGroup viewGroup, int i, asni asniVar, boolean z) {
        if (asniVar != null) {
            TextView x = x(viewGroup, i, R.drawable.reel_like_icon);
            x.setId(R.id.reel_dyn_like);
            q(x, R.string.reel_footer_like);
            if (z && (asniVar.b & 4096) != 0) {
                c(asniVar.n);
            }
            this.H.c(x);
            this.H.i((aong) asniVar.toBuilder());
            this.H.e();
            return;
        }
        this.H.i(null);
        this.H.d();
    }

    private static final TextView F(ViewGroup viewGroup, int i, View.OnClickListener onClickListener) {
        TextView x = x(viewGroup, i, R.drawable.quantum_ic_more_horiz_white_24);
        x.setId(R.id.reel_dyn_overflow_menu);
        q(x, R.string.reel_player_menu_title_text);
        x.setContentDescription(x.getResources().getString(R.string.reel_accessibility_menu));
        x.setOnClickListener(onClickListener);
        return x;
    }

    public static void a(ViewGroup viewGroup, boolean z, boolean z2) {
        View findViewById = viewGroup.findViewById(R.id.reel_close_button);
        whu.I(findViewById, z2);
        if (findViewById == null || !(findViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        yny.z(findViewById, yny.v(z ? 0 : findViewById.getContext().getResources().getDimensionPixelSize(R.dimen.reel_close_button_margin_top)), ViewGroup.MarginLayoutParams.class);
    }

    public static View h(ViewGroup viewGroup, int i, int i2, int i3) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        viewGroup.addView(inflate);
        etx.M(inflate, true);
        if (i2 == R.layout.reel_player_dyn_cell2) {
            inflate = inflate.findViewById(R.id.reel_dyn_icon2);
        }
        if (i3 == 0 || !(inflate instanceof TextView)) {
            if (i3 != 0 && (inflate instanceof ImageView)) {
                ((ImageView) inflate).setImageResource(i3);
            }
        } else {
            TextView textView = (TextView) inflate;
            if (i == 4 || i == 11) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, 0, 0, 0);
            } else {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i3, 0, 0);
            }
        }
        return inflate;
    }

    public static int i(aukf aukfVar) {
        int i;
        if ((aukfVar.b & 4096) != 0) {
            i = aobq.bU(aukfVar.o);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (i == 0 || i == 1) {
            return 10;
        }
        return i;
    }

    private final ajck k() {
        return new ikl(this);
    }

    private final asni l(aukf aukfVar) {
        int i = aukfVar.b & 1;
        asnj asnjVar = aukfVar.c;
        if (asnjVar == null) {
            asnjVar = asnj.a;
        }
        asni W = etx.W(1 == i, asnjVar);
        if (W != null) {
            return this.ad.n(W);
        }
        return null;
    }

    private final void m(boolean z, ViewGroup viewGroup) {
        aukh aukhVar;
        int i;
        int bW;
        viewGroup.removeAllViews();
        aukf aukfVar = this.v;
        if (aukfVar == null || (aukfVar.b & 8388608) == 0) {
            aukhVar = null;
        } else {
            aukhVar = aukfVar.y;
            if (aukhVar == null) {
                aukhVar = aukh.a;
            }
        }
        if (aukhVar == null || (aukhVar.b & 1) == 0) {
            i = 2;
        } else {
            i = aobq.bX(aukhVar.c);
            if (i == 0) {
                i = 1;
            }
        }
        if (i == 2) {
            this.P = h(viewGroup, 12, R.layout.reel_player_right_cell_menu_A, 0);
        } else {
            n(viewGroup);
        }
        asni l = l(this.v);
        if (l != null) {
            if (z && (l.b & 4096) != 0) {
                c(l.n);
            }
            TextView textView = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.reel_right_like_icon);
            textView.setId(R.id.reel_dyn_like);
            q(textView, R.string.reel_footer_like);
            aujs aujsVar = this.D.a().u;
            if (aujsVar == null) {
                aujsVar = aujs.a;
            }
            if (aujsVar.f) {
                this.H.d = new ikj(this);
            }
            this.H.c(textView);
            this.ac.m(textView, R.drawable.ic_right_like_off_32c, R.drawable.ic_right_like_on_32c);
            aukf aukfVar2 = this.v;
            if ((aukfVar2.b & 262144) != 0 && (bW = aobq.bW(aukfVar2.t)) != 0 && bW == 4) {
                TextView textView2 = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.reel_right_dislike_icon);
                textView2.setId(R.id.reel_dyn_dislike);
                q(textView2, R.string.reel_footer_dislike);
                this.H.a(textView2);
                this.ac.m(textView2, R.drawable.ic_right_dislike_off_32c, R.drawable.ic_right_dislike_on_32c);
            }
            this.H.i((aong) l.toBuilder());
            this.H.e();
        } else {
            this.H.i(null);
            this.H.d();
        }
        aukf aukfVar3 = this.v;
        boolean z2 = (aukfVar3.b & 8192) != 0;
        aulq aulqVar = aukfVar3.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg V = etx.V(z2, aulqVar);
        if (V != null) {
            TextView textView3 = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.ic_right_comment_32c);
            this.Z = textView3;
            textView3.setId(R.id.reel_dyn_comment);
            q(textView3, R.string.reel_footer_comment);
            r(textView3, V);
            textView3.setContentDescription(w(V));
            textView3.setOnClickListener(this);
            textView3.setEnabled(!V.h);
            textView3.setAlpha(true != V.h ? 1.0f : 0.3f);
            if (z && (V.b & 1048576) != 0) {
                c(V.t);
            }
            this.ac.l(textView3, R.dimen.reel_player_right_large_icon_size, R.drawable.ic_right_comment_32c);
        }
        aukf aukfVar4 = this.v;
        boolean z3 = (aukfVar4.b & 524288) != 0;
        aulq aulqVar2 = aukfVar4.u;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        apmg V2 = etx.V(z3, aulqVar2);
        if (V2 != null) {
            if (z && (V2.b & 1048576) != 0) {
                c(V2.t);
            }
            TextView textView4 = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.ic_right_share_32c);
            textView4.setId(R.id.reel_dyn_share);
            aqyg aqygVar = V2.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            s(textView4, aqygVar);
            this.ac.l(textView4, R.dimen.reel_player_right_large_icon_size, R.drawable.ic_right_share_32c);
            this.f222J.d(awxt.d(textView4).aK(TimeUnit.MILLISECONDS).ax(new ikg(this, 0)));
        }
        if (i == 2) {
            n(viewGroup);
        } else {
            this.P = h(viewGroup, 12, R.layout.reel_player_right_cell_menu_B, 0);
        }
        View view = this.P;
        if (view != null) {
            view.setId(R.id.reel_right_cell_menu);
            this.ac.l(this.P, R.dimen.reel_player_right_small_icon_size, R.drawable.quantum_ic_more_horiz_white_24);
        }
    }

    private final void n(ViewGroup viewGroup) {
        ilh ilhVar = this.A;
        aukf aukfVar = this.v;
        if (ilhVar.f != null && (aukfVar.b & 33554432) != 0) {
            ilhVar.c();
        }
        if (ilhVar.e != null && (aukfVar.b & 33554432) == 0) {
            ilhVar.c();
        }
        View view = ilhVar.f;
        if (view != null && view.findViewById(R.id.pivot_button_icon) == null) {
            ilhVar.c();
        }
        View view2 = ilhVar.e;
        if (view2 != null) {
            ilh.b(viewGroup, view2);
            return;
        }
        View view3 = ilhVar.f;
        if (view3 != null) {
            ilh.b(viewGroup, view3);
            return;
        }
        if ((aukfVar.b & 33554432) == 0) {
            ilhVar.f = ilh.a(viewGroup, R.layout.reel_player_right_cell_audio);
            ilhVar.f.setId(R.id.reel_pivot_button);
            ilhVar.g = (LottieAnimationView) ilhVar.f.findViewById(R.id.reel_pivot_anim_icon);
            ilhVar.i = ilhVar.f.findViewById(R.id.pivot_button_scrim);
            ilhVar.h = (ImageView) ilhVar.f.findViewById(R.id.pivot_button_icon);
            ilhVar.j = new ajkj(ilhVar.a, new yzw(), (ImageView) ilhVar.f.findViewById(R.id.reel_pivot_thumbnail), false);
            return;
        }
        ilhVar.e = ilh.a(viewGroup, R.layout.reel_player_forced_mute_button);
        ilhVar.e.setId(R.id.reel_player_forced_mute_button);
    }

    private final void o() {
        this.x.clear();
        TextView textView = this.o;
        if (textView != null) {
            this.x.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        TextView textView2 = this.p;
        if (textView2 != null) {
            this.x.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        TextView textView3 = this.S;
        if (textView3 != null) {
            this.x.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        CircularImageView circularImageView = this.X;
        if (circularImageView != null) {
            this.x.add(ObjectAnimator.ofFloat(circularImageView, (Property<CircularImageView, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        View findViewById = this.c.findViewById(this.M);
        if (findViewById != null) {
            this.x.add(ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        YouTubeButton youTubeButton = this.V;
        if (youTubeButton != null) {
            this.x.add(ObjectAnimator.ofFloat(youTubeButton, (Property<YouTubeButton, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        ViewGroup viewGroup = this.O;
        if (viewGroup != null) {
            this.x.add(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        View view = this.R;
        if (view != null) {
            this.x.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        Button button = this.U;
        if (button != null) {
            this.x.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        ViewGroup viewGroup2 = this.W;
        if (viewGroup2 != null) {
            this.x.add(ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        this.z.playTogether(this.x);
        this.z.start();
    }

    private final void p() {
        this.z.cancel();
        this.z.setDuration(100L);
        this.z.playTogether(this.y);
        this.z.addListener(new iki(this));
        this.z.start();
    }

    private static void q(TextView textView, int i) {
        if (textView != null) {
            textView.setText(i);
        }
    }

    private static void r(TextView textView, apmg apmgVar) {
        if ((apmgVar.b & 256) != 0) {
            aqyg aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            s(textView, aqygVar);
        }
    }

    private static void s(TextView textView, aqyg aqygVar) {
        t(textView, ajcq.b(aqygVar));
    }

    private static void t(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    private static void u(View view, int i) {
        if (view != null) {
            yny.z(view, yny.x(view.getResources().getDimensionPixelSize(i)), ViewGroup.LayoutParams.class);
        }
    }

    private final void v(View view) {
        ilh ilhVar = this.A;
        ilhVar.e = view.findViewById(R.id.reel_player_forced_mute_button);
        ilhVar.f = view.findViewById(R.id.reel_pivot_button);
        ilhVar.j = new ajkj(ilhVar.a, new yzw(), (ImageView) ilhVar.f.findViewById(R.id.reel_pivot_thumbnail), false);
    }

    private static final String w(apmg apmgVar) {
        aott aottVar = apmgVar.s;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) == 0) {
            return null;
        }
        aott aottVar2 = apmgVar.s;
        if (aottVar2 == null) {
            aottVar2 = aott.a;
        }
        aots aotsVar2 = aottVar2.c;
        if (aotsVar2 == null) {
            aotsVar2 = aots.a;
        }
        return aotsVar2.c;
    }

    private static TextView x(ViewGroup viewGroup, int i, int i2) {
        int i3;
        if (i == 4) {
            i3 = R.layout.reel_player_dyn_cell2;
        } else if (i == 11) {
            i3 = R.layout.reel_player_dyn_cell2_vert;
        } else {
            i3 = etx.am(i) ? R.layout.reel_player_right_cell : etx.ao(i) ? R.layout.reel_player_dyn_footer_vert_cell : R.layout.reel_player_dyn_cell1;
        }
        return (TextView) h(viewGroup, i, i3, i2);
    }

    private final void y(int i, boolean z, ViewGroup viewGroup) {
        int i2;
        int i3;
        int bW;
        viewGroup.removeAllViews();
        boolean z2 = i == 6 || i == 8 || i == 10 || i == 11;
        asni l = l(this.v);
        aukf aukfVar = this.v;
        if ((aukfVar.b & 262144) == 0 || (bW = aobq.bW(aukfVar.t)) == 0 || bW != 4 || i == 11) {
            E(viewGroup, i, l, z);
            if (!z2) {
                h(viewGroup, i, R.layout.reel_player_dyn_space, 0);
            }
        } else if (l != null) {
            TextView x = x(viewGroup, i, R.drawable.reel_like_icon);
            TextView x2 = x(viewGroup, i, R.drawable.reel_dislike_icon);
            x.setId(R.id.reel_dyn_like);
            x2.setId(R.id.reel_dyn_dislike);
            q(x, R.string.reel_footer_like);
            q(x2, R.string.reel_footer_dislike);
            if (z && (l.b & 4096) != 0) {
                c(l.n);
            }
            this.H.c(x);
            this.H.a(x2);
            this.H.i((aong) l.toBuilder());
            this.H.e();
        } else {
            this.H.i(null);
            this.H.d();
        }
        aukf aukfVar2 = this.v;
        boolean z3 = (aukfVar2.b & 8192) != 0;
        aulq aulqVar = aukfVar2.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg V = etx.V(z3, aulqVar);
        if (V != null) {
            this.Z = C(viewGroup, i, V, this, z);
        }
        aukf aukfVar3 = this.v;
        int i4 = aukfVar3.b & 524288;
        if (i4 != 0) {
            boolean z4 = i4 != 0;
            aulq aulqVar2 = aukfVar3.u;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmg V2 = etx.V(z4, aulqVar2);
            V2.getClass();
            if (z && (V2.b & 1048576) != 0) {
                c(V2.t);
            }
            aqyg aqygVar = V2.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            aqyg aqygVar2 = aqygVar;
            i3 = R.layout.reel_player_dyn_space;
            i2 = 0;
            this.f222J.d(awxt.d(D(R.id.reel_dyn_share, viewGroup, i, aqygVar2, R.drawable.ic_share_white_24dp, 0, false)).aK(TimeUnit.MILLISECONDS).ax(new ikg(this, 2)));
        } else {
            i2 = 0;
            i3 = R.layout.reel_player_dyn_space;
        }
        if (V == null && (this.v.b & 524288) == 0 && !z2) {
            h(viewGroup, i, i3, i2);
            h(viewGroup, i, i3, i2);
        }
        if (this.M == 0) {
            this.q = (TextView) h(viewGroup, i, R.layout.reel_player_dyn_subs_button, i2);
        }
        if (this.N == 0) {
            TextView F = F(viewGroup, i, this);
            this.P = F;
            z(F, i);
        }
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            yny.z(childAt, yny.x(i2), LinearLayout.LayoutParams.class);
            yny.z(childAt, yny.w(1.0f), LinearLayout.LayoutParams.class);
        }
    }

    private final void z(View view, int i) {
        if (view == null || view.getResources() == null || view.getResources().getConfiguration() == null || view.getResources().getConfiguration().fontScale <= 1.0f || i != 4) {
            return;
        }
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), (int) this.j.getResources().getDimension(R.dimen.reel_player_dyn_footer_padding_end_large_font), view.getPaddingBottom());
    }

    public final void b() {
        Context context = this.e.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_player_right_footer, this.e, false);
        this.k = inflate;
        this.e.addView(inflate);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_player_right_footer_bottom_padding);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.e.setPadding(0, 0, 0, dimensionPixelSize);
    }

    public final void c(aomf aomfVar) {
        this.h.mM().n(new acqx(aomfVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0886  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r20, defpackage.aukf r21, boolean r22, boolean r23, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint r24) {
        /*
            Method dump skipped, instructions count: 2446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikn.d(java.lang.String, aukf, boolean, boolean, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint):void");
    }

    public final void e() {
        this.H.c.clear();
        etx.M(this.T, false);
        etx.M(this.P, false);
        etx.M(this.q, false);
        etx.M(this.V, false);
        etx.M(null, false);
        etx.M(null, false);
        etx.M(this.Y, false);
        etx.M(this.Z, false);
        etx.M(this.c.findViewById(this.L), false);
        etx.M(this.d, false);
        CircularImageView circularImageView = this.X;
        if (circularImageView != null) {
            circularImageView.setOnClickListener(null);
            this.X = null;
        }
        this.o = null;
        TextView textView = this.p;
        if (textView != null) {
            textView.setOnClickListener(null);
            this.p = null;
        }
        this.T = null;
        this.P = null;
        this.q = null;
        this.V = null;
        this.n = null;
        this.Q = null;
        this.Y = null;
        this.Z = null;
        this.U = null;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            etx.M(this.W, false);
            this.W = null;
        }
        this.K.b(null);
        this.f222J.c();
    }

    @Override // defpackage.ilg
    public final void g(auka aukaVar) {
        if ((aukaVar.b & 1) != 0) {
            aqyg aqygVar = aukaVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar);
            allo n = allo.n(this.c.findViewById(R.id.forced_mute_snackbar_layout), b, 5000);
            n.l();
            n.n = new ikh();
            int i = 2;
            if ((aukaVar.b & 2) != 0) {
                aulq aulqVar = aukaVar.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    aulq aulqVar2 = aukaVar.d;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                    int i2 = apmgVar.b;
                    if ((i2 & 256) != 0 && (i2 & 32768) != 0) {
                        View findViewById = n.f.findViewById(R.id.snackbar_action);
                        aqyg aqygVar2 = apmgVar.i;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        Spanned b2 = ajcq.b(aqygVar2);
                        findViewById.setContentDescription(b2);
                        findViewById.setBackground(null);
                        n.o(b2, new ike(this, apmgVar, i));
                    }
                }
            }
            allj alljVar = n.f;
            alljVar.setContentDescription(b);
            alljVar.setBackground(this.c.getContext().getDrawable(R.drawable.snackbar_rounded_corner));
            alljVar.setPadding(0, 0, 0, 0);
            if ((aukaVar.b & 4) != 0) {
                c(aukaVar.e);
            }
            n.h();
        }
    }

    public final int j() {
        int bU;
        aukf aukfVar = this.v;
        if (aukfVar == null || (bU = aobq.bU(aukfVar.o)) == 0) {
            return 1;
        }
        return bU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        if (r7 != 55) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r7, defpackage.auzl r8, boolean r9) {
        /*
            r6 = this;
            r0 = 2132083382(0x7f1502b6, float:1.9806905E38)
            r1 = 2132083383(0x7f1502b7, float:1.9806907E38)
            r2 = 2132083385(0x7f1502b9, float:1.980691E38)
            r3 = 1
            r4 = 2132083381(0x7f1502b5, float:1.9806903E38)
            if (r7 == 0) goto L6b
            if (r8 == 0) goto L6b
            r7 = 0
            if (r9 == 0) goto L21
            int r5 = r8.b
            r5 = r5 & 2
            if (r5 == 0) goto L21
            avfc r7 = r8.d
            if (r7 != 0) goto L2e
            avfc r7 = defpackage.avfc.a
            goto L2e
        L21:
            if (r9 != 0) goto L2e
            int r5 = r8.b
            r5 = r5 & r3
            if (r5 == 0) goto L2e
            avfc r7 = r8.c
            if (r7 != 0) goto L2e
            avfc r7 = defpackage.avfc.a
        L2e:
            if (r7 == 0) goto L6b
            int r8 = r7.b
            r8 = r8 & 4
            if (r8 == 0) goto L6b
            int r7 = r7.e
            avez r7 = defpackage.avez.b(r7)
            if (r7 != 0) goto L40
            avez r7 = defpackage.avez.THEME_ATTRIBUTE_UNKNOWN
        L40:
            if (r9 != 0) goto L52
            int r7 = r7.ordinal()
            switch(r7) {
                case 51: goto L4e;
                case 52: goto L4a;
                case 53: goto L63;
                case 54: goto L49;
                case 55: goto L67;
                case 56: goto L6e;
                default: goto L49;
            }
        L49:
            goto L6b
        L4a:
            r0 = 2132083384(0x7f1502b8, float:1.9806909E38)
            goto L6e
        L4e:
            r0 = 2132083386(0x7f1502ba, float:1.9806913E38)
            goto L6e
        L52:
            int r7 = r7.ordinal()
            r8 = 49
            if (r7 == r8) goto L67
            r8 = 50
            if (r7 == r8) goto L63
            r8 = 55
            if (r7 == r8) goto L6e
            goto L6b
        L63:
            r0 = 2132083383(0x7f1502b7, float:1.9806907E38)
            goto L6e
        L67:
            r0 = 2132083385(0x7f1502b9, float:1.980691E38)
            goto L6e
        L6b:
            r0 = 2132083381(0x7f1502b5, float:1.9806903E38)
        L6e:
            android.view.ViewGroup r7 = r6.c
            android.content.Context r7 = r7.getContext()
            android.view.ContextThemeWrapper r8 = new android.view.ContextThemeWrapper
            r8.<init>(r7, r0)
            if (r3 == r9) goto L7f
            r7 = 2131232963(0x7f0808c3, float:1.808205E38)
            goto L82
        L7f:
            r7 = 2131232964(0x7f0808c4, float:1.8082052E38)
        L82:
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r7)
            if (r7 == 0) goto L8d
            android.widget.TextView r8 = r6.q
            r8.setBackground(r7)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikn.f(boolean, auzl, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0063  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.P
            r1 = 0
            if (r6 != r0) goto Lc
            ikm r6 = r5.a
            r6.a()
        La:
            r6 = r1
            goto L61
        Lc:
            r0 = 1
            r2 = 0
            if (r6 == 0) goto L4d
            android.widget.TextView r3 = r5.Y
            if (r6 == r3) goto L4d
            android.widget.TextView r3 = r5.Z
            if (r6 != r3) goto L19
            goto L4d
        L19:
            android.view.View r3 = r5.R
            if (r6 != r3) goto L33
            aukf r6 = r5.v
            int r3 = r6.b
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            aulq r6 = r6.z
            if (r6 != 0) goto L2e
            aulq r6 = defpackage.aulq.a
        L2e:
            apmg r6 = defpackage.etx.V(r0, r6)
            goto L61
        L33:
            com.google.android.libraries.youtube.common.ui.YouTubeButton r3 = r5.V
            if (r6 != r3) goto La
            aukf r6 = r5.v
            int r3 = r6.b
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r3 & r4
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            aulq r6 = r6.D
            if (r6 != 0) goto L48
            aulq r6 = defpackage.aulq.a
        L48:
            apmg r6 = defpackage.etx.V(r0, r6)
            goto L61
        L4d:
            aukf r6 = r5.v
            int r3 = r6.b
            r3 = r3 & 8192(0x2000, float:1.148E-41)
            if (r3 == 0) goto L56
            goto L57
        L56:
            r0 = 0
        L57:
            aulq r6 = r6.p
            if (r6 != 0) goto L5d
            aulq r6 = defpackage.aulq.a
        L5d:
            apmg r6 = defpackage.etx.V(r0, r6)
        L61:
            if (r6 == 0) goto L86
            aahd r0 = r5.f
            apxf r2 = r6.p
            if (r2 != 0) goto L6b
            apxf r2 = defpackage.apxf.a
        L6b:
            r0.a(r2)
            int r0 = r6.b
            r2 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L86
            acqz r0 = r5.h
            acra r0 = r0.mM()
            acqx r2 = new acqx
            aomf r6 = r6.t
            r2.<init>(r6)
            r6 = 3
            r0.I(r6, r2, r1)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikn.onClick(android.view.View):void");
    }
}
