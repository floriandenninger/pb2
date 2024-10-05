package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alni {
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public int j;
    public ColorStateList k;
    public CharSequence l;
    public boolean m;
    public TextView n;
    public int o;
    public ColorStateList p;
    private LinearLayout q;
    private int r;
    private FrameLayout s;
    private final float t;

    public alni(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.b = textInputLayout;
        this.t = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    static final boolean o(int i) {
        return i == 0 || i == 1;
    }

    private final int p(boolean z, int i, int i2) {
        return z ? this.a.getResources().getDimensionPixelSize(i) : i2;
    }

    private final TextView q(int i) {
        if (i == 1) {
            return this.h;
        }
        if (i != 2) {
            return null;
        }
        return this.n;
    }

    private final void r(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 != i ? 0.0f : 1.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(aleq.a);
            list.add(ofFloat);
            if (i3 == i) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.t, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(aleq.d);
                list.add(ofFloat2);
            }
        }
    }

    public final int a() {
        TextView textView = this.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final void b(TextView textView, int i) {
        if (this.q == null && this.s == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.q = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.q, -1, -2);
            this.s = new FrameLayout(this.a);
            this.q.addView(this.s, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.a != null) {
                c();
            }
        }
        if (o(i)) {
            this.s.setVisibility(0);
            this.s.addView(textView);
        } else {
            this.q.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.q.setVisibility(0);
        this.r++;
    }

    public final void c() {
        EditText editText;
        if (this.q == null || (editText = this.b.a) == null) {
            return;
        }
        boolean h = alkd.h(this.a);
        jw.Y(this.q, p(h, R.dimen.material_helper_text_font_1_3_padding_horizontal, jw.i(editText)), p(h, R.dimen.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), p(h, R.dimen.material_helper_text_font_1_3_padding_horizontal, jw.h(editText)), 0);
    }

    public final void d() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void e() {
        this.f = null;
        d();
        if (this.d == 1) {
            if (!this.m || TextUtils.isEmpty(this.l)) {
                this.e = 0;
            } else {
                this.e = 2;
            }
        }
        l(this.d, this.e, n(this.h, null));
    }

    public final void g(CharSequence charSequence) {
        this.i = charSequence;
        TextView textView = this.h;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final void h(int i) {
        this.j = i;
        TextView textView = this.h;
        if (textView != null) {
            this.b.M(textView, i);
        }
    }

    public final void i(ColorStateList colorStateList) {
        this.k = colorStateList;
        TextView textView = this.h;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void j(int i) {
        this.o = i;
        TextView textView = this.n;
        if (textView != null) {
            jm.s(textView, i);
        }
    }

    public final void k(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.n;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void l(int i, int i2, boolean z) {
        TextView q;
        TextView q2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = animatorSet;
            ArrayList arrayList = new ArrayList();
            r(arrayList, this.m, this.n, 2, i, i2);
            r(arrayList, this.g, this.h, 1, i, i2);
            akwg.v(animatorSet, arrayList);
            animatorSet.addListener(new alnh(this, i2, q(i), i, q(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (q2 = q(i2)) != null) {
                q2.setVisibility(0);
                q2.setAlpha(1.0f);
            }
            if (i != 0 && (q = q(i)) != null) {
                q.setVisibility(4);
                if (i == 1) {
                    q.setText((CharSequence) null);
                }
            }
            this.d = i2;
        }
        this.b.P();
        this.b.Q(z);
        this.b.S();
    }

    public final boolean m() {
        return (this.e != 1 || this.h == null || TextUtils.isEmpty(this.f)) ? false : true;
    }

    public final boolean n(TextView textView, CharSequence charSequence) {
        return jw.al(this.b) && this.b.isEnabled() && !(this.e == this.d && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void f(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.q == null) {
            return;
        }
        if (!o(i) || (frameLayout = this.s) == null) {
            this.q.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.r - 1;
        this.r = i2;
        LinearLayout linearLayout = this.q;
        if (i2 == 0) {
            linearLayout.setVisibility(8);
        }
    }
}
