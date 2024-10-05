package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbs {
    protected final View a;
    protected final View b;
    protected final ImageView c;
    protected final ImageView d;
    protected final View e;
    protected final View f;
    protected final View g;
    protected final View h;
    protected final TextView i;
    protected final View j;
    protected final fqw k;
    protected final GradientDrawable l;
    public Integer m;
    private final ajut n;
    private final TextView o;
    private final TextView p;
    private final View q;
    private final View r;
    private final ImageView s;
    private final TextView t;
    private final TextView u;
    private boolean v;
    private boolean w;

    public nbs(ajut ajutVar, View view, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.n = ajutVar;
        view.getClass();
        this.a = view;
        View findViewById = view.findViewById(R.id.thumbnail_wrapper);
        this.b = findViewById;
        this.c = (ImageView) findViewById.findViewById(R.id.thumbnail);
        this.d = (ImageView) findViewById.findViewById(R.id.icon);
        this.p = (TextView) view.findViewById(R.id.title);
        this.o = (TextView) view.findViewById(R.id.description);
        this.q = view.findViewById(R.id.overlay_badge_layout);
        View findViewById2 = view.findViewById(R.id.cta_button_wrapper);
        this.e = findViewById2;
        this.f = findViewById2.findViewById(R.id.cta_button_start_filler);
        this.g = findViewById2.findViewById(R.id.cta_button_touchable_wrapper);
        this.h = findViewById2.findViewById(R.id.cta_button_end_filler);
        this.i = (TextView) findViewById2.findViewById(R.id.cta_button);
        View findViewById3 = findViewById2.findViewById(R.id.ad_cta_button);
        this.j = findViewById3;
        View findViewById4 = view.findViewById(R.id.one_point_five_click_overlay);
        this.r = findViewById4;
        this.s = (ImageView) findViewById4.findViewById(R.id.one_point_five_click_overlay_icon);
        this.t = (TextView) findViewById4.findViewById(R.id.one_point_five_click_overlay_text);
        this.u = (TextView) findViewById4.findViewById(R.id.one_point_five_click_overlay_text_secondary);
        if (findViewById3 != null) {
            this.k = ajywVar.r(null, findViewById3);
        } else {
            this.k = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.l = gradientDrawable;
        gradientDrawable.setShape(0);
    }

    private static final void c(TextView textView, int i) {
        if (TextUtils.isEmpty(textView.getText())) {
            textView.setVisibility(8);
        } else if (i > 0) {
            textView.setMaxLines(i);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public final void a() {
        this.v = this.p.getVisibility() == 0;
        this.w = this.o.getVisibility() == 0;
    }

    public final void b(arfs arfsVar, arfs arfsVar2, Spanned spanned, Spanned spanned2, aowm aowmVar, augx augxVar, augn augnVar, boolean z, boolean z2) {
        View view;
        View view2;
        View view3;
        View view4;
        whu.I(this.p, this.v);
        whu.I(this.o, this.w);
        int i = 0;
        boolean z3 = z && !(arfsVar2 == null && spanned == null && spanned2 == null);
        if (arfsVar == null || z3) {
            this.d.setVisibility(8);
        } else {
            ImageView imageView = this.d;
            ajut ajutVar = this.n;
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
            this.d.setVisibility(0);
        }
        whu.I(this.q, !z3);
        this.r.setVisibility(true != z3 ? 8 : 0);
        if (z) {
            if (arfsVar2 != null) {
                ImageView imageView2 = this.s;
                ajut ajutVar2 = this.n;
                arfr b2 = arfr.b(arfsVar2.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                imageView2.setImageResource(ajutVar2.a(b2));
                this.s.setVisibility(0);
            } else {
                this.s.setVisibility(8);
            }
            whu.G(this.t, spanned);
            whu.G(this.u, spanned2);
        }
        if (aowmVar == null || this.j == null || this.k == null || !z) {
            view = null;
        } else {
            this.e.setVisibility(0);
            this.i.setVisibility(8);
            this.j.setVisibility(0);
            View view5 = this.j;
            this.k.c(aowmVar);
            view = view5;
        }
        if (this.e.getVisibility() == 0 && (view2 = this.f) != null && (view3 = this.g) != null && (view4 = this.h) != null && view != null) {
            nbz.o(this.e, view2, view3, view4, view, augxVar);
        }
        if (z) {
            if (augnVar != null) {
                this.l.setColor(augnVar.b);
                whu.E(this.a, this.l);
            } else {
                whu.E(this.a, null);
            }
        }
        if (z2) {
            this.c.setScaleType(ImageView.ScaleType.CENTER_CROP);
            c(this.p, 2);
            int i2 = true != z ? 0 : 3;
            TextView textView = this.o;
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setVisibility(8);
                return;
            }
            int measuredHeight = textView.getVisibility() != 8 ? textView.getMeasuredHeight() : 0;
            if (i2 > 0) {
                textView.setMaxLines(3);
                textView.measure(0, 0);
            }
            int measuredHeight2 = (i2 > 0 ? textView.getMeasuredHeight() : 0) - measuredHeight;
            textView.getLayoutParams().height = measuredHeight;
            textView.setVisibility(0);
            nbr nbrVar = new nbr(textView, measuredHeight2, measuredHeight, i2);
            nbrVar.setDuration((int) ((Math.abs(measuredHeight2) / textView.getContext().getResources().getDisplayMetrics().density) * 5.0f));
            textView.startAnimation(nbrVar);
            return;
        }
        this.c.setScaleType(z ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER_CROP);
        Integer num = this.m;
        if (num != null) {
            i = num.intValue();
        } else if (true == z) {
            i = 3;
        }
        c(this.p, 2);
        c(this.o, i);
    }
}
