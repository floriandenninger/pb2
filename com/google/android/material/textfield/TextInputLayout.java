package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.youtube.R;
import defpackage.aih;
import defpackage.ajm;
import defpackage.aleq;
import defpackage.algc;
import defpackage.alhw;
import defpackage.alhx;
import defpackage.alkd;
import defpackage.alkg;
import defpackage.alkl;
import defpackage.alms;
import defpackage.alng;
import defpackage.alni;
import defpackage.alnt;
import defpackage.alnu;
import defpackage.alnv;
import defpackage.alnw;
import defpackage.alnx;
import defpackage.alny;
import defpackage.bvx;
import defpackage.bwh;
import defpackage.gl;
import defpackage.jm;
import defpackage.jw;
import defpackage.nz;
import defpackage.so;
import defpackage.ud;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {
    private CharSequence A;
    private TextView B;
    private ColorStateList C;
    private int D;
    private bvx E;
    private bvx F;
    private ColorStateList G;
    private ColorStateList H;
    private CharSequence I;

    /* renamed from: J, reason: collision with root package name */
    private final TextView f179J;
    private final TextView K;
    private boolean L;
    private CharSequence M;
    private alkg N;
    private alkl O;
    private final int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private final Rect W;
    public EditText a;
    private int aA;
    private ColorStateList aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private boolean aH;
    private ValueAnimator aI;
    private boolean aJ;
    private final Rect aa;
    private final RectF ab;
    private final CheckableImageButton ac;
    private ColorStateList ad;
    private boolean ae;
    private PorterDuff.Mode af;
    private boolean ag;
    private Drawable ah;
    private int ai;
    private final LinkedHashSet aj;
    private int ak;
    private final SparseArray al;
    private final LinkedHashSet am;
    private ColorStateList an;
    private boolean ao;
    private PorterDuff.Mode ap;
    private boolean aq;
    private Drawable ar;
    private int as;
    private Drawable at;
    private final CheckableImageButton au;
    private ColorStateList av;
    private ColorStateList aw;
    private ColorStateList ax;
    private int ay;
    private int az;
    public boolean b;
    public int c;
    public boolean d;
    public TextView e;
    public boolean f;
    public CharSequence g;
    public boolean h;
    public alkg i;
    public int j;
    public int k;
    public final CheckableImageButton l;
    public boolean m;
    public final alhw n;
    public boolean o;
    public boolean p;
    private final FrameLayout q;
    private final LinearLayout r;
    private final LinearLayout s;
    private final FrameLayout t;
    private CharSequence u;
    private int v;
    private int w;
    private final alni x;
    private int y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public static void W(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        aF(checkableImageButton);
    }

    private final int Z() {
        float c;
        if (!this.L) {
            return 0;
        }
        int i = this.j;
        if (i == 0 || i == 1) {
            c = this.n.c();
        } else {
            if (i != 2) {
                return 0;
            }
            c = this.n.c() / 2.0f;
        }
        return (int) c;
    }

    private final boolean aA() {
        return this.ak != 0;
    }

    private final boolean aB() {
        return this.j == 1 && this.a.getMinLines() <= 1;
    }

    private final boolean aC() {
        boolean z;
        if (this.a == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((this.ac.getDrawable() != null || this.I != null) && this.r.getMeasuredWidth() > 0) {
            int measuredWidth = this.r.getMeasuredWidth() - this.a.getPaddingLeft();
            if (this.ah == null || this.ai != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ah = colorDrawable;
                this.ai = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ah;
            if (drawable != drawable2) {
                this.a.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ah != null) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                this.a.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ah = null;
                z = true;
            }
            z = false;
        }
        if ((this.au.getVisibility() == 0 || ((aA() && T()) || this.g != null)) && this.s.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.K.getMeasuredWidth() - this.a.getPaddingRight();
            if (this.au.getVisibility() == 0) {
                checkableImageButton = this.au;
            } else if (aA() && T()) {
                checkableImageButton = this.l;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.a.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ar;
            if (drawable3 == null || this.as == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.ar = colorDrawable2;
                    this.as = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.ar;
                if (drawable4 != drawable5) {
                    this.at = drawable4;
                    this.a.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                    return true;
                }
            } else {
                this.as = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.a.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ar, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ar != null) {
            Drawable[] compoundDrawablesRelative4 = this.a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ar) {
                this.a.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.at, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ar = null;
            return z2;
        }
        return z;
    }

    private static final void aD(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            if (!z) {
                if (z2) {
                    z2 = true;
                }
            }
            drawable = gl.c(drawable).mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static final bvx aE() {
        bvx bvxVar = new bvx();
        bvxVar.b = 87L;
        bvxVar.c = aleq.a;
        return bvxVar;
    }

    private static void aF(CheckableImageButton checkableImageButton) {
        boolean ag = jw.ag(checkableImageButton);
        checkableImageButton.setFocusable(ag);
        checkableImageButton.setClickable(ag);
        checkableImageButton.c = ag;
        checkableImageButton.setLongClickable(false);
        jw.V(checkableImageButton, true != ag ? 2 : 1);
    }

    private static void aG(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        aF(checkableImageButton);
    }

    private final int aa(int i, boolean z) {
        int compoundPaddingLeft = i + this.a.getCompoundPaddingLeft();
        return (this.I == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f179J.getMeasuredWidth()) + this.f179J.getPaddingLeft();
    }

    private final int ab(int i, boolean z) {
        int compoundPaddingRight = i - this.a.getCompoundPaddingRight();
        return (this.I == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f179J.getMeasuredWidth() - this.f179J.getPaddingRight());
    }

    private final alng ac() {
        alng alngVar = (alng) this.al.get(this.ak);
        return alngVar != null ? alngVar : (alng) this.al.get(0);
    }

    private final void ad() {
        aD(this.l, this.ao, this.an, this.aq, this.ap);
    }

    private final void ae() {
        aD(this.ac, this.ae, this.ad, this.ag, this.af);
    }

    private final void af() {
        if (az()) {
            ((alms) this.i).v(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void ag() {
        TextView textView = this.B;
        if (textView == null || !this.f) {
            return;
        }
        textView.setText((CharSequence) null);
        bwh.b(this.q, this.F);
        this.B.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ai() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.ai():void");
    }

    private static void aj(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                aj((ViewGroup) childAt, z);
            }
        }
    }

    private final void ak(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] copyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copyOf, length, length2);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = gl.c(drawable).mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private final void al(boolean z) {
        this.au.setVisibility(true != z ? 8 : 0);
        this.t.setVisibility(true != z ? 0 : 8);
        aw();
        if (aA()) {
            return;
        }
        aC();
    }

    private final void am(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.M)) {
            return;
        }
        this.M = charSequence;
        this.n.t(charSequence);
        if (this.m) {
            return;
        }
        ai();
    }

    private final void an(boolean z) {
        if (this.f == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.B = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            bvx aE = aE();
            this.E = aE;
            aE.a = 67L;
            this.F = aE();
            jw.au(this.B);
            H(this.D);
            I(this.C);
            TextView textView = this.B;
            if (textView != null) {
                this.q.addView(textView);
                this.B.setVisibility(0);
            }
        } else {
            TextView textView2 = this.B;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.B = null;
        }
        this.f = z;
    }

    private final void ao() {
        if (this.e != null) {
            EditText editText = this.a;
            O(editText == null ? 0 : editText.getText().length());
        }
    }

    private final void ap() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.e;
        if (textView != null) {
            M(textView, this.d ? this.y : this.z);
            if (!this.d && (colorStateList2 = this.G) != null) {
                this.e.setTextColor(colorStateList2);
            }
            if (!this.d || (colorStateList = this.H) == null) {
                return;
            }
            this.e.setTextColor(colorStateList);
        }
    }

    private final void aq() {
        if (this.j != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.q.getLayoutParams();
            int Z = Z();
            if (Z != layoutParams.topMargin) {
                layoutParams.topMargin = Z;
                this.q.requestLayout();
            }
        }
    }

    private final void ar(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.a;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.a;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean m = this.x.m();
        ColorStateList colorStateList2 = this.aw;
        if (colorStateList2 != null) {
            this.n.l(colorStateList2);
            this.n.p(this.aw);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.aw;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.aG);
            } else {
                i = this.aG;
            }
            this.n.l(ColorStateList.valueOf(i));
            this.n.p(ColorStateList.valueOf(i));
        } else if (m) {
            alhw alhwVar = this.n;
            TextView textView2 = this.x.h;
            alhwVar.l(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.d && (textView = this.e) != null) {
            this.n.l(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ax) != null) {
            this.n.l(colorStateList);
        }
        if (z3 || !this.aH || (isEnabled() && z4)) {
            if (z2 || this.m) {
                ValueAnimator valueAnimator = this.aI;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aI.cancel();
                }
                if (!z || !this.o) {
                    this.n.s(1.0f);
                } else {
                    g(1.0f);
                }
                this.m = false;
                if (az()) {
                    ai();
                }
                as();
                au();
                ax();
                return;
            }
            return;
        }
        if (z2 || !this.m) {
            ValueAnimator valueAnimator2 = this.aI;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aI.cancel();
            }
            if (!z || !this.o) {
                this.n.s(0.0f);
            } else {
                g(0.0f);
            }
            if (az() && !((alms) this.i).g.isEmpty()) {
                af();
            }
            this.m = true;
            ag();
            au();
            ax();
        }
    }

    private final void as() {
        EditText editText = this.a;
        R(editText == null ? 0 : editText.getText().length());
    }

    private final void at() {
        if (this.a == null) {
            return;
        }
        jw.Y(this.f179J, V() ? 0 : jw.i(this.a), this.a.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.a.getCompoundPaddingBottom());
    }

    private final void au() {
        TextView textView = this.f179J;
        int i = 8;
        if (this.I != null && !this.m) {
            i = 0;
        }
        textView.setVisibility(i);
        aC();
    }

    private final void av(boolean z, boolean z2) {
        int defaultColor = this.aB.getDefaultColor();
        int colorForState = this.aB.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.aB.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.V = colorForState2;
        } else if (z2) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    private final void aw() {
        if (this.a == null) {
            return;
        }
        int i = 0;
        if (!T() && this.au.getVisibility() != 0) {
            i = jw.h(this.a);
        }
        jw.Y(this.K, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.a.getPaddingTop(), i, this.a.getPaddingBottom());
    }

    private final void ax() {
        int visibility = this.K.getVisibility();
        boolean z = (this.g == null || this.m) ? false : true;
        this.K.setVisibility(true != z ? 8 : 0);
        if (visibility != this.K.getVisibility()) {
            ac().c(z);
        }
        aC();
    }

    private final boolean ay() {
        return this.S >= 0 && this.V != 0;
    }

    private final boolean az() {
        return this.L && !TextUtils.isEmpty(this.M) && (this.i instanceof alms);
    }

    public final void A(boolean z) {
        alni alniVar = this.x;
        if (alniVar.m == z) {
            return;
        }
        alniVar.d();
        if (z) {
            alniVar.n = new AppCompatTextView(alniVar.a);
            alniVar.n.setId(R.id.textinput_helper_text);
            alniVar.n.setTextAlignment(5);
            alniVar.n.setVisibility(4);
            jw.au(alniVar.n);
            alniVar.j(alniVar.o);
            alniVar.k(alniVar.p);
            alniVar.b(alniVar.n, 1);
        } else {
            alniVar.d();
            int i = alniVar.d;
            if (i == 2) {
                alniVar.e = 0;
            }
            alniVar.l(i, alniVar.e, alniVar.n(alniVar.n, null));
            alniVar.f(alniVar.n, 1);
            alniVar.n = null;
            alniVar.b.P();
            alniVar.b.S();
        }
        alniVar.m = z;
    }

    public final void B(CharSequence charSequence) {
        if (this.L) {
            am(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public final void C(boolean z) {
        if (z != this.L) {
            this.L = z;
            if (!z) {
                this.h = false;
                if (!TextUtils.isEmpty(this.M) && TextUtils.isEmpty(this.a.getHint())) {
                    this.a.setHint(this.M);
                }
                am(null);
            } else {
                CharSequence hint = this.a.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.M)) {
                        B(hint);
                    }
                    this.a.setHint((CharSequence) null);
                }
                this.h = true;
            }
            if (this.a != null) {
                aq();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        if (this.ax != colorStateList) {
            if (this.aw == null) {
                this.n.l(colorStateList);
            }
            this.ax = colorStateList;
            if (this.a != null) {
                Q(false);
            }
        }
    }

    public final void E(int i) {
        this.w = i;
        EditText editText = this.a;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public final void F(int i) {
        this.v = i;
        EditText editText = this.a;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public final void G(CharSequence charSequence) {
        if (this.f && TextUtils.isEmpty(charSequence)) {
            an(false);
        } else {
            if (!this.f) {
                an(true);
            }
            this.A = charSequence;
        }
        as();
    }

    public final void H(int i) {
        this.D = i;
        TextView textView = this.B;
        if (textView != null) {
            jm.s(textView, i);
        }
    }

    public final void I(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            TextView textView = this.B;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public final void J(CharSequence charSequence) {
        this.I = true != TextUtils.isEmpty(charSequence) ? charSequence : null;
        this.f179J.setText(charSequence);
        au();
    }

    public final void K(CharSequence charSequence) {
        if (this.ac.getContentDescription() != charSequence) {
            this.ac.setContentDescription(charSequence);
        }
    }

    public final void L(boolean z) {
        if (V() != z) {
            this.ac.setVisibility(true != z ? 8 : 0);
            at();
            aC();
        }
    }

    public final void M(TextView textView, int i) {
        try {
            jm.s(textView, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            jm.s(textView, 2132083619);
            textView.setTextColor(aih.d(getContext(), R.color.design_error));
        }
    }

    public final void N(alnw alnwVar) {
        EditText editText = this.a;
        if (editText != null) {
            jw.M(editText, alnwVar);
        }
    }

    public final void O(int i) {
        boolean z = this.d;
        int i2 = this.c;
        if (i2 == -1) {
            this.e.setText(String.valueOf(i));
            this.e.setContentDescription(null);
            this.d = false;
        } else {
            this.d = i > i2;
            Context context = getContext();
            TextView textView = this.e;
            int i3 = this.c;
            int i4 = true != this.d ? R.string.character_counter_content_description : R.string.character_counter_overflowed_content_description;
            Integer valueOf = Integer.valueOf(i);
            textView.setContentDescription(context.getString(i4, valueOf, Integer.valueOf(i3)));
            if (z != this.d) {
                ap();
            }
            this.e.setText(ajm.a().b(getContext().getString(R.string.character_counter_pattern, valueOf, Integer.valueOf(this.c))));
        }
        if (this.a == null || z == this.d) {
            return;
        }
        Q(false);
        S();
        P();
    }

    public final void P() {
        Drawable background;
        TextView textView;
        EditText editText = this.a;
        if (editText == null || this.j != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (ud.d(background)) {
            background = background.mutate();
        }
        if (this.x.m()) {
            background.setColorFilter(so.b(this.x.a(), PorterDuff.Mode.SRC_IN));
        } else if (!this.d || (textView = this.e) == null) {
            gl.d(background);
            this.a.refreshDrawableState();
        } else {
            background.setColorFilter(so.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
    }

    public final void Q(boolean z) {
        ar(z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.S():void");
    }

    public final boolean T() {
        return this.t.getVisibility() == 0 && this.l.getVisibility() == 0;
    }

    public final boolean U() {
        return this.x.m;
    }

    public final boolean V() {
        return this.ac.getVisibility() == 0;
    }

    public final void X() {
        aG(this.ac, null);
    }

    public final void Y() {
        W(this.ac);
    }

    public final Drawable a() {
        return this.l.getDrawable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 16;
            this.q.addView(view, layoutParams2);
            this.q.setLayoutParams(layoutParams);
            aq();
            EditText editText = (EditText) view;
            if (this.a == null) {
                this.a = editText;
                F(this.v);
                E(this.w);
                ah();
                N(new alnw(this));
                alhw alhwVar = this.n;
                Typeface typeface = this.a.getTypeface();
                boolean w = alhwVar.w(typeface);
                boolean x = alhwVar.x(typeface);
                if (w || x) {
                    alhwVar.h();
                }
                this.n.r(this.a.getTextSize());
                int gravity = this.a.getGravity();
                this.n.m((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                this.n.q(gravity);
                this.a.addTextChangedListener(new alnt(this));
                if (this.aw == null) {
                    this.aw = this.a.getHintTextColors();
                }
                if (this.L) {
                    if (TextUtils.isEmpty(this.M)) {
                        CharSequence hint = this.a.getHint();
                        this.u = hint;
                        B(hint);
                        this.a.setHint((CharSequence) null);
                    }
                    this.h = true;
                }
                if (this.e != null) {
                    O(this.a.getText().length());
                }
                P();
                this.x.c();
                this.r.bringToFront();
                this.s.bringToFront();
                this.t.bringToFront();
                this.au.bringToFront();
                Iterator it = this.aj.iterator();
                while (it.hasNext()) {
                    ((alnx) it.next()).a(this);
                }
                at();
                aw();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                ar(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    public final CharSequence b() {
        alni alniVar = this.x;
        if (alniVar.g) {
            return alniVar.f;
        }
        return null;
    }

    public final CharSequence c() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    public final CharSequence d() {
        if (this.f) {
            return this.A;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.a;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.u != null) {
            boolean z = this.h;
            this.h = false;
            CharSequence hint = editText.getHint();
            this.a.setHint(this.u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.a.setHint(hint);
                this.h = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.q.getChildCount());
        for (int i2 = 0; i2 < this.q.getChildCount(); i2++) {
            View childAt = this.q.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.a) {
                newChild.setHint(c());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.p = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.p = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.L) {
            this.n.e(canvas);
        }
        alkg alkgVar = this.N;
        if (alkgVar != null) {
            Rect bounds = alkgVar.getBounds();
            bounds.top = bounds.bottom - this.S;
            this.N.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.aJ) {
            return;
        }
        this.aJ = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        alhw alhwVar = this.n;
        boolean y = alhwVar != null ? alhwVar.y(drawableState) : false;
        if (this.a != null) {
            Q(jw.al(this) && isEnabled());
        }
        P();
        S();
        if (y) {
            invalidate();
        }
        this.aJ = false;
    }

    public final void e(alnx alnxVar) {
        this.aj.add(alnxVar);
        if (this.a != null) {
            alnxVar.a(this);
        }
    }

    public final void f(alny alnyVar) {
        this.am.add(alnyVar);
    }

    final void g(float f) {
        if (this.n.a == f) {
            return;
        }
        if (this.aI == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aI = valueAnimator;
            valueAnimator.setInterpolator(aleq.b);
            this.aI.setDuration(167L);
            this.aI.addUpdateListener(new alnv(this));
        }
        this.aI.setFloatValues(this.n.a, f);
        this.aI.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.a;
        return editText != null ? editText.getBaseline() + getPaddingTop() + Z() : super.getBaseline();
    }

    public final void h() {
        ak(this.l, this.an);
    }

    public final void i() {
        ak(this.ac, this.ad);
    }

    public final void j(int i) {
        if (this.aA != i) {
            this.aA = i;
            S();
        }
    }

    public final void k(boolean z) {
        if (this.b != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.e = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                this.e.setMaxLines(1);
                this.x.b(this.e, 2);
                ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                ap();
                ao();
            } else {
                this.x.f(this.e, 2);
                this.e = null;
            }
            this.b = z;
        }
    }

    public final void l(int i) {
        if (this.c != i) {
            if (i <= 0) {
                i = -1;
            }
            this.c = i;
            if (this.b) {
                ao();
            }
        }
    }

    public final void m(boolean z) {
        this.l.a(z);
    }

    public final void n(CharSequence charSequence) {
        if (this.l.getContentDescription() != charSequence) {
            this.l.setContentDescription(charSequence);
        }
    }

    public final void o(int i) {
        p(i != 0 ? nz.b(getContext(), i) : null);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.a;
        if (editText != null) {
            Rect rect = this.W;
            alhx.a(this, editText, rect);
            if (this.N != null) {
                this.N.setBounds(rect.left, rect.bottom - this.U, rect.right, rect.bottom);
            }
            if (this.L) {
                this.n.r(this.a.getTextSize());
                int gravity = this.a.getGravity();
                this.n.m((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                this.n.q(gravity);
                alhw alhwVar = this.n;
                if (this.a != null) {
                    Rect rect2 = this.aa;
                    boolean z2 = jw.e(this) == 1;
                    rect2.bottom = rect.bottom;
                    int i5 = this.j;
                    if (i5 == 1) {
                        rect2.left = aa(rect.left, z2);
                        rect2.top = rect.top + this.R;
                        rect2.right = ab(rect.right, z2);
                    } else if (i5 == 2) {
                        rect2.left = rect.left + this.a.getPaddingLeft();
                        rect2.top = rect.top - Z();
                        rect2.right = rect.right - this.a.getPaddingRight();
                    } else {
                        rect2.left = aa(rect.left, z2);
                        rect2.top = getPaddingTop();
                        rect2.right = ab(rect.right, z2);
                    }
                    alhwVar.j(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    alhw alhwVar2 = this.n;
                    if (this.a != null) {
                        Rect rect3 = this.aa;
                        alhwVar2.f(alhwVar2.l);
                        float f = -alhwVar2.l.ascent();
                        rect3.left = rect.left + this.a.getCompoundPaddingLeft();
                        if (aB()) {
                            compoundPaddingTop = (int) (rect.centerY() - (f / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.a.getCompoundPaddingTop();
                        }
                        rect3.top = compoundPaddingTop;
                        rect3.right = rect.right - this.a.getCompoundPaddingRight();
                        if (aB()) {
                            compoundPaddingBottom = (int) (rect3.top + f);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.a.getCompoundPaddingBottom();
                        }
                        rect3.bottom = compoundPaddingBottom;
                        alhwVar2.n(rect3.left, rect3.top, rect3.right, rect3.bottom);
                        this.n.h();
                        if (!az() || this.m) {
                            return;
                        }
                        ai();
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int max;
        boolean z;
        EditText editText;
        super.onMeasure(i, i2);
        if (this.a != null && this.a.getMeasuredHeight() < (max = Math.max(this.s.getMeasuredHeight(), this.r.getMeasuredHeight()))) {
            this.a.setMinimumHeight(max);
            z = true;
        } else {
            z = false;
        }
        boolean aC = aC();
        if (z || aC) {
            this.a.post(new alnu(this, 0));
        }
        if (this.B != null && (editText = this.a) != null) {
            this.B.setGravity(editText.getGravity());
            this.B.setPadding(this.a.getCompoundPaddingLeft(), this.a.getCompoundPaddingTop(), this.a.getCompoundPaddingRight(), this.a.getCompoundPaddingBottom());
        }
        at();
        aw();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        v(savedState.a);
        if (savedState.b) {
            this.l.post(new alnu(this, 1));
        }
        B(savedState.e);
        z(savedState.f);
        G(savedState.g);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.x.m()) {
            savedState.a = b();
        }
        boolean z = false;
        if (aA() && this.l.a) {
            z = true;
        }
        savedState.b = z;
        savedState.e = c();
        alni alniVar = this.x;
        savedState.f = alniVar.m ? alniVar.l : null;
        savedState.g = d();
        return savedState;
    }

    public final void p(Drawable drawable) {
        this.l.setImageDrawable(drawable);
        if (drawable != null) {
            ad();
            h();
        }
    }

    public final void q(int i) {
        int i2 = this.ak;
        this.ak = i;
        Iterator it = this.am.iterator();
        while (it.hasNext()) {
            ((alny) it.next()).a(this, i2);
        }
        u(i != 0);
        if (ac().f(this.j)) {
            ac().b();
            ad();
            return;
        }
        int i3 = this.j;
        StringBuilder sb = new StringBuilder(93);
        sb.append("The current box background mode ");
        sb.append(i3);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void r(View.OnClickListener onClickListener) {
        aG(this.l, onClickListener);
    }

    public final void s(ColorStateList colorStateList) {
        if (this.an != colorStateList) {
            this.an = colorStateList;
            this.ao = true;
            ad();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        aj(this, z);
        super.setEnabled(z);
    }

    public final void t(PorterDuff.Mode mode) {
        if (this.ap != mode) {
            this.ap = mode;
            this.aq = true;
            ad();
        }
    }

    public final void u(boolean z) {
        if (T() != z) {
            this.l.setVisibility(true != z ? 8 : 0);
            aw();
            aC();
        }
    }

    public final void v(CharSequence charSequence) {
        if (!this.x.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                w(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            alni alniVar = this.x;
            alniVar.d();
            alniVar.f = charSequence;
            alniVar.h.setText(charSequence);
            int i = alniVar.d;
            if (i != 1) {
                alniVar.e = 1;
            }
            alniVar.l(i, alniVar.e, alniVar.n(alniVar.h, charSequence));
            return;
        }
        this.x.e();
    }

    public final void w(boolean z) {
        alni alniVar = this.x;
        if (alniVar.g == z) {
            return;
        }
        alniVar.d();
        if (z) {
            alniVar.h = new AppCompatTextView(alniVar.a);
            alniVar.h.setId(R.id.textinput_error);
            alniVar.h.setTextAlignment(5);
            alniVar.h(alniVar.j);
            alniVar.i(alniVar.k);
            alniVar.g(alniVar.i);
            alniVar.h.setVisibility(4);
            jw.au(alniVar.h);
            alniVar.b(alniVar.h, 0);
        } else {
            alniVar.e();
            alniVar.f(alniVar.h, 0);
            alniVar.h = null;
            alniVar.b.P();
            alniVar.b.S();
        }
        alniVar.g = z;
    }

    public final void x(Drawable drawable) {
        this.au.setImageDrawable(drawable);
        boolean z = false;
        if (drawable != null && this.x.g) {
            z = true;
        }
        al(z);
    }

    public final void y(ColorStateList colorStateList) {
        this.x.i(colorStateList);
    }

    public final void z(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (U()) {
                A(false);
                return;
            }
            return;
        }
        if (!U()) {
            A(true);
        }
        alni alniVar = this.x;
        alniVar.d();
        alniVar.l = charSequence;
        alniVar.n.setText(charSequence);
        int i = alniVar.d;
        if (i != 2) {
            alniVar.e = 2;
        }
        alniVar.l(i, alniVar.e, alniVar.n(alniVar.n, charSequence));
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public final void R(int i) {
        if (i != 0 || this.m) {
            ag();
            return;
        }
        TextView textView = this.B;
        if (textView == null || !this.f) {
            return;
        }
        textView.setText(this.A);
        bwh.b(this.q, this.E);
        this.B.setVisibility(0);
        this.B.bringToFront();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0635  */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r30, android.util.AttributeSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private final void ah() {
        int i = this.j;
        if (i == 0) {
            this.i = null;
            this.N = null;
        } else if (i == 1) {
            this.i = new alkg(this.O);
            this.N = new alkg();
        } else if (i == 2) {
            if (!this.L || (this.i instanceof alms)) {
                this.i = new alkg(this.O);
            } else {
                this.i = new alms(this.O);
            }
            this.N = null;
        } else {
            StringBuilder sb = new StringBuilder(72);
            sb.append(i);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        EditText editText = this.a;
        if (editText != null && this.i != null && editText.getBackground() == null && this.j != 0) {
            jw.O(this.a, this.i);
        }
        S();
        if (this.j == 1) {
            if (alkd.i(getContext())) {
                this.R = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (alkd.h(getContext())) {
                this.R = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.a != null && this.j == 1) {
            if (alkd.i(getContext())) {
                EditText editText2 = this.a;
                jw.Y(editText2, jw.i(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), jw.h(this.a), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (alkd.h(getContext())) {
                EditText editText3 = this.a;
                jw.Y(editText3, jw.i(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), jw.h(this.a), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.j != 0) {
            aq();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new algc(5);
        CharSequence a;
        boolean b;
        CharSequence e;
        CharSequence f;
        CharSequence g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.b = parcel.readInt() == 1;
            this.e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.e);
            String valueOf3 = String.valueOf(this.f);
            String valueOf4 = String.valueOf(this.g);
            int length = String.valueOf(hexString).length();
            int length2 = String.valueOf(valueOf).length();
            int length3 = String.valueOf(valueOf2).length();
            StringBuilder sb = new StringBuilder(length + 70 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append("TextInputLayout.SavedState{");
            sb.append(hexString);
            sb.append(" error=");
            sb.append(valueOf);
            sb.append(" hint=");
            sb.append(valueOf2);
            sb.append(" helperText=");
            sb.append(valueOf3);
            sb.append(" placeholderText=");
            sb.append(valueOf4);
            sb.append("}");
            return sb.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.a, parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
            TextUtils.writeToParcel(this.e, parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
