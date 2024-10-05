package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class almf extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private almc e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.graphics.drawable.RippleDrawable] */
    public almf(TabLayout tabLayout, Context context) {
        super(context);
        kw kwVar;
        this.d = tabLayout;
        this.f = 2;
        int i = tabLayout.p;
        if (i != 0) {
            Drawable b = nz.b(context, i);
            this.c = b;
            if (b != null && b.isStateful()) {
                b.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.j != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList a = aljx.a(tabLayout.j);
            boolean z = tabLayout.y;
            gradientDrawable = new RippleDrawable(a, true == z ? null : gradientDrawable, true == z ? null : gradientDrawable2);
        }
        jw.O(this, gradientDrawable);
        tabLayout.invalidate();
        jw.Y(this, tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            kwVar = new kw(PointerIcon.getSystemIcon(context2, 1002));
        } else {
            kwVar = new kw(null);
        }
        jw.ay(this, kwVar);
    }

    private static final void c(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new alme(view));
    }

    public final void a(almc almcVar) {
        if (almcVar != this.e) {
            this.e = almcVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Drawable drawable;
        almc almcVar = this.e;
        boolean z = false;
        if (this.b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = this.a.getMaxLines();
        }
        jm.s(this.a, this.d.g);
        ColorStateList colorStateList = this.d.h;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView2 = this.a;
        ImageView imageView2 = this.b;
        almc almcVar2 = this.e;
        Drawable mutate = (almcVar2 == null || (drawable = almcVar2.a) == null) ? null : gl.c(drawable).mutate();
        if (mutate != null) {
            mutate.setTintList(this.d.i);
            PorterDuff.Mode mode = this.d.m;
            if (mode != null) {
                mutate.setTintMode(mode);
            }
        }
        almc almcVar3 = this.e;
        CharSequence charSequence = almcVar3 != null ? almcVar3.b : null;
        if (imageView2 != null) {
            if (mutate != null) {
                imageView2.setImageDrawable(mutate);
                imageView2.setVisibility(0);
                setVisibility(0);
            } else {
                imageView2.setVisibility(8);
                imageView2.setImageDrawable(null);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z2 = !isEmpty;
        if (textView2 != null) {
            if (z2) {
                textView2.setText(charSequence);
                int i = this.e.f;
                textView2.setVisibility(0);
                setVisibility(0);
            } else {
                textView2.setVisibility(8);
                textView2.setText((CharSequence) null);
            }
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            int r = (z2 && imageView2.getVisibility() == 0) ? (int) alkd.r(getContext(), 8) : 0;
            if (this.d.v) {
                if (r != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(r);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (r != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = r;
                marginLayoutParams.setMarginEnd(0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        almc almcVar4 = this.e;
        CharSequence charSequence2 = almcVar4 != null ? almcVar4.c : null;
        if (Build.VERSION.SDK_INT > 23) {
            if (true == isEmpty) {
                charSequence = charSequence2;
            }
            gm.r(this, charSequence);
        }
        c(this.b);
        c(this.a);
        if (almcVar != null && !TextUtils.isEmpty(almcVar.c)) {
            setContentDescription(almcVar.c);
        }
        if (almcVar != null) {
            TabLayout tabLayout = almcVar.g;
            if (tabLayout != null) {
                int a = tabLayout.a();
                if (a != -1 && a == almcVar.d) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.c;
        if (drawable != null && drawable.isStateful() && this.c.setState(drawableState)) {
            invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ks c = ks.c(accessibilityNodeInfo);
        c.u(kw.d(0, 1, this.e.d, 1, isSelected()));
        if (isSelected()) {
            c.s(false);
            c.b.removeAction((AccessibilityNodeInfo.AccessibilityAction) kr.b.j);
        }
        c.b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.d.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.d.n;
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.d.o;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (this.d.u != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.e.a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
