package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gdx implements gee {
    public LinearLayout a;
    private final Context b;
    private FrameLayout d;
    private TextView e;
    private ImageView f;
    private AlphaAnimation h;
    private TranslateAnimation i;
    private TranslateAnimation j;
    private AnimationSet k;
    private AnimationSet l;
    private ValueAnimator m;
    private ged n;
    private final ajut o;
    private FrameLayout p;
    private Resources.Theme q;
    private final aadw r;
    private boolean g = false;
    private final gdv c = new gdv();

    public gdx(Context context, ajut ajutVar, aadw aadwVar) {
        this.b = context;
        this.o = ajutVar;
        this.r = aadwVar;
    }

    private final void i() {
        this.p.addView(this.d);
        FrameLayout frameLayout = (FrameLayout) this.p.findViewById(R.id.bar_wrapper);
        this.d = frameLayout;
        this.a = (LinearLayout) frameLayout.findViewById(R.id.bar_layout);
        this.e = (TextView) this.d.findViewById(R.id.bar_text);
        this.f = (ImageView) this.d.findViewById(R.id.bar_icon);
    }

    @Override // defpackage.gee
    public final ammv a() {
        return b().h() ? ammv.i(this.a) : amlr.a;
    }

    @Override // defpackage.gee
    public final ammv b() {
        return ammv.i(this.n);
    }

    @Override // defpackage.gee
    public final ammv c() {
        return b().h() ? ammv.i(this.d) : amlr.a;
    }

    @Override // defpackage.gee
    public final void d(boolean z) {
        if (this.p == null || this.d == null) {
            return;
        }
        if (z) {
            if (this.c.b) {
                this.j.cancel();
            }
            if (this.c.a) {
                this.i.cancel();
            }
            this.a.startAnimation(this.j);
            return;
        }
        this.a.setVisibility(8);
    }

    @Override // defpackage.gee
    public final void e(FrameLayout frameLayout) {
        f();
        this.p = frameLayout;
        if (this.d != null) {
            i();
        }
    }

    @Override // defpackage.gee
    public final void f() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.p;
        if (frameLayout2 != null && (frameLayout = this.d) != null) {
            frameLayout2.removeView(frameLayout);
        }
        this.n = null;
        this.p = null;
        this.c.a();
    }

    @Override // defpackage.gee
    public final void g(ged gedVar, boolean z) {
        if (this.p != null) {
            if (this.d == null) {
                this.d = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.bar, (ViewGroup) this.p, false);
                i();
                LinearLayout linearLayout = this.a;
                whu.E(linearLayout, linearLayout.getBackground());
            }
            this.q = this.p.getContext().getTheme();
            if (!this.g) {
                this.h = (AlphaAnimation) AnimationUtils.loadAnimation(this.b, R.anim.bar_text_fade_in);
                this.i = (TranslateAnimation) AnimationUtils.loadAnimation(this.b, R.anim.bar_entry_translation);
                this.j = (TranslateAnimation) AnimationUtils.loadAnimation(this.b, R.anim.bar_exit_translation);
                this.k = (AnimationSet) AnimationUtils.loadAnimation(this.b, R.anim.bar_icon_entry);
                this.l = (AnimationSet) AnimationUtils.loadAnimation(this.b, R.anim.bar_icon_remind_rotation);
                ValueAnimator ofInt = ValueAnimator.ofInt(51, 0);
                this.m = ofInt;
                ofInt.setDuration(this.b.getResources().getInteger(R.integer.bar_color_pulse_duration));
                this.m.setStartDelay(this.b.getResources().getInteger(R.integer.bar_color_pulse_offset));
                if (Build.VERSION.SDK_INT >= 22) {
                    anq anqVar = new anq();
                    this.h.setInterpolator(anqVar);
                    this.i.setInterpolator(anqVar);
                    this.j.setInterpolator(anqVar);
                    this.k.setInterpolator(anqVar);
                    this.l.setInterpolator(anqVar);
                    this.m.setInterpolator(anqVar);
                }
                gdv gdvVar = this.c;
                TranslateAnimation translateAnimation = this.i;
                TranslateAnimation translateAnimation2 = this.j;
                LinearLayout linearLayout2 = this.a;
                gdvVar.a();
                translateAnimation.setAnimationListener(new gdt(gdvVar));
                translateAnimation2.setAnimationListener(new gdu(gdvVar, linearLayout2));
            }
            if (!this.g) {
                final int orElse = wbs.W(this.p.getContext(), R.attr.ytFilledButtonText).orElse(0);
                this.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gdw
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        gdx gdxVar = gdx.this;
                        int i = orElse;
                        LinearLayout linearLayout3 = gdxVar.a;
                        if (linearLayout3 != null) {
                            linearLayout3.getBackground().setColorFilter(whu.S(i, ((Integer) valueAnimator.getAnimatedValue()).intValue()), PorterDuff.Mode.SRC_ATOP);
                        }
                    }
                });
            }
            this.g = true;
            if (gedVar != this.n) {
                this.n = gedVar;
                this.e.setText(gedVar.a);
                int a = this.o.a(gedVar.b);
                if (a == 0) {
                    a = this.o.a(arfr.REFRESH);
                }
                this.f.setImageDrawable(this.b.getResources().getDrawable(a));
                int i = gedVar.i;
                TypedValue typedValue = new TypedValue();
                this.b.getTheme().resolveAttribute(i == 2 ? R.attr.ytTextAppearanceButton : R.attr.ytTextAppearanceTitle1, typedValue, true);
                jm.s(this.e, typedValue.data);
                int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(gedVar.i == 2 ? R.dimen.bar_between_icon_and_text_padding_prominent : R.dimen.bar_between_icon_and_text_padding_default);
                TextView textView = this.e;
                textView.setPaddingRelative(dimensionPixelSize, textView.getPaddingTop(), this.e.getPaddingEnd(), this.e.getPaddingBottom());
                Context context = this.b;
                TextView textView2 = this.e;
                ImageView imageView = this.f;
                LinearLayout linearLayout3 = this.a;
                int Q = wbs.Q(context, R.attr.ytFilledButtonText);
                int Q2 = wbs.Q(this.b, R.attr.ytFilledButtonText);
                int Q3 = wbs.Q(this.b, R.attr.ytThemedBlue);
                if (b().h()) {
                    avfc avfcVar = ((ged) b().c()).f;
                    avez b = avez.b(avfcVar.c);
                    if (b == null) {
                        b = avez.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a2 = akbg.a(context, b, Q);
                    avez b2 = avez.b(avfcVar.e);
                    if (b2 == null) {
                        b2 = avez.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a3 = akbg.a(context, b2, Q3);
                    avez b3 = avez.b(avfcVar.d);
                    if (b3 == null) {
                        b3 = avez.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a4 = akbg.a(context, b3, Q2);
                    if (textView2 != null) {
                        textView2.setTextColor(a2);
                    }
                    if (linearLayout3 != null) {
                        linearLayout3.setBackgroundTintList(ColorStateList.valueOf(a3));
                    }
                    if (imageView != null) {
                        imageView.setImageTintList(ColorStateList.valueOf(a4));
                    }
                }
                int i2 = gedVar.g;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 != 5) {
                    FrameLayout frameLayout = this.d;
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), (int) this.b.getResources().getDimension(R.dimen.bar_shadow_height));
                } else {
                    FrameLayout frameLayout2 = this.d;
                    frameLayout2.setPadding(frameLayout2.getPaddingLeft(), this.d.getPaddingTop(), this.d.getPaddingRight(), 0);
                }
                int i4 = gedVar.i;
                int dimension = (int) this.b.getResources().getDimension(R.dimen.bar_height);
                if (i4 == 2) {
                    dimension = (int) this.b.getResources().getDimension(R.dimen.bar_height_prominent);
                }
                this.a.getLayoutParams().height = dimension;
            }
            if (evr.aC(this.r)) {
                this.d.setElevation(8.0f);
            }
            this.d.bringToFront();
            this.a.setVisibility(0);
            if (!z || this.c.a) {
                return;
            }
            this.a.startAnimation(this.i);
            this.e.startAnimation(this.h);
            this.f.startAnimation(this.k);
            return;
        }
        throw new IllegalStateException("Controller must be initialized for a feed before the content pill can be shown.");
    }

    @Override // defpackage.gee
    public final boolean h() {
        LinearLayout linearLayout = this.a;
        return linearLayout != null && (linearLayout.getVisibility() == 0 || this.c.a);
    }
}
