package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.FooterActionButton;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class altg implements alti {
    final boolean a;
    final boolean b;
    final boolean c;
    LinearLayout d;
    public alth e;
    public alth f;
    ColorStateList g;
    ColorStateList h;
    int i;
    int j;
    final int k;
    public final altb l;
    private final Context m;
    private final ViewStub n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int s;
    private final int t;

    static {
        new AtomicInteger(1);
    }

    public altg(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.g = null;
        this.h = null;
        altb altbVar = new altb();
        this.l = altbVar;
        Context context = templateLayout.getContext();
        this.m = context;
        this.n = (ViewStub) templateLayout.findViewById(R.id.suc_layout_footer);
        alsk alskVar = (alsk) templateLayout;
        this.a = alskVar.f();
        this.b = alskVar.e();
        this.c = alskVar.g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alsl.a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.k = dimensionPixelSize;
        this.q = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.r = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
        this.i = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int color = obtainStyledAttributes.getColor(12, 0);
        this.s = color;
        int color2 = obtainStyledAttributes.getColor(14, 0);
        this.t = color2;
        int resourceId = obtainStyledAttributes.getResourceId(13, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(15, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            alth b = alta.b(resourceId2, context);
            alta.k("setSecondaryButton");
            h();
            also alsoVar = new also(b);
            alsoVar.m = g(b, R.style.SucPartnerCustomizationButton_Secondary, altc.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR);
            alsoVar.a = altc.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
            alsoVar.b = altc.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA;
            alsoVar.c = altc.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR;
            alsoVar.d = i(b.a);
            alsoVar.k = altc.CONFIG_FOOTER_BUTTON_RADIUS;
            alsoVar.l = altc.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
            alsoVar.e = altc.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
            alsoVar.f = altc.CONFIG_FOOTER_SECONDARY_BUTTON_MARGIN_START;
            alsoVar.g = altc.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
            alsoVar.h = altc.CONFIG_FOOTER_BUTTON_MIN_HEIGHT;
            alsoVar.i = altc.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
            alsoVar.j = altc.CONFIG_FOOTER_BUTTON_TEXT_STYLE;
            alsp a = alsoVar.a();
            FooterActionButton j = j(b, a);
            this.p = j.getId();
            this.h = j.getTextColors();
            j.b = false;
            this.f = b;
            c(j, color2);
            k(j, a);
            d();
            altbVar.b(true, true);
        }
        if (resourceId != 0) {
            alth b2 = alta.b(resourceId, context);
            alta.k("setPrimaryButton");
            h();
            also alsoVar2 = new also(b2);
            alsoVar2.m = g(b2, R.style.SucPartnerCustomizationButton_Primary, altc.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR);
            alsoVar2.a = altc.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
            alsoVar2.b = altc.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA;
            alsoVar2.c = altc.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR;
            alsoVar2.d = i(b2.a);
            alsoVar2.k = altc.CONFIG_FOOTER_BUTTON_RADIUS;
            alsoVar2.l = altc.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
            alsoVar2.e = altc.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
            alsoVar2.f = altc.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START;
            alsoVar2.g = altc.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
            alsoVar2.h = altc.CONFIG_FOOTER_BUTTON_MIN_HEIGHT;
            alsoVar2.i = altc.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
            alsoVar2.j = altc.CONFIG_FOOTER_BUTTON_TEXT_STYLE;
            alsp a2 = alsoVar2.a();
            FooterActionButton j2 = j(b2, a2);
            this.o = j2.getId();
            this.g = j2.getTextColors();
            j2.b = true;
            this.e = b2;
            c(j2, color);
            k(j2, a2);
            d();
            altbVar.c(true, true);
        }
    }

    private final int g(alth althVar, int i, altc altcVar) {
        int i2 = althVar.c;
        if (i2 != 0 && !this.a) {
            i = i2;
        }
        if (!this.a) {
            return i;
        }
        int c = alte.f(this.m).c(this.m, altcVar);
        return c == 0 ? R.style.SucPartnerCustomizationButton_Secondary : c == 0 ? i : R.style.SucPartnerCustomizationButton_Primary;
    }

    private final LinearLayout h() {
        int a;
        if (this.d == null) {
            if (this.n != null) {
                this.n.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.m, R.style.SucPartnerCustomizationButtonBar_Stackable)));
                this.n.setLayoutResource(R.layout.suc_footer_button_bar);
                LinearLayout linearLayout = (LinearLayout) this.n.inflate();
                this.d = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setId(View.generateViewId());
                    linearLayout.setPadding(this.i, this.q, this.j, this.r);
                    if (l()) {
                        linearLayout.setGravity(8388629);
                    }
                }
                LinearLayout linearLayout2 = this.d;
                if (linearLayout2 != null && this.a) {
                    if (!this.c) {
                        linearLayout2.setBackgroundColor(alte.f(this.m).c(this.m, altc.CONFIG_FOOTER_BAR_BG_COLOR));
                    }
                    if (alte.f(this.m).l(altc.CONFIG_FOOTER_BUTTON_PADDING_TOP)) {
                        this.q = (int) alte.f(this.m).a(this.m, altc.CONFIG_FOOTER_BUTTON_PADDING_TOP);
                    }
                    if (alte.f(this.m).l(altc.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM)) {
                        this.r = (int) alte.f(this.m).a(this.m, altc.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM);
                    }
                    if (alte.f(this.m).l(altc.CONFIG_FOOTER_BAR_PADDING_START)) {
                        this.i = (int) alte.f(this.m).a(this.m, altc.CONFIG_FOOTER_BAR_PADDING_START);
                    }
                    if (alte.f(this.m).l(altc.CONFIG_FOOTER_BAR_PADDING_END)) {
                        this.j = (int) alte.f(this.m).a(this.m, altc.CONFIG_FOOTER_BAR_PADDING_END);
                    }
                    linearLayout2.setPadding(this.i, this.q, this.j, this.r);
                    if (alte.f(this.m).l(altc.CONFIG_FOOTER_BAR_MIN_HEIGHT) && (a = (int) alte.f(this.m).a(this.m, altc.CONFIG_FOOTER_BAR_MIN_HEIGHT)) > 0) {
                        linearLayout2.setMinimumHeight(a);
                    }
                }
            } else {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
        }
        return this.d;
    }

    private static altc i(int i) {
        switch (i) {
            case 1:
                return altc.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return altc.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return altc.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return altc.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return altc.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return altc.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return altc.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return altc.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    private final FooterActionButton j(alth althVar, alsp alspVar) {
        FooterActionButton footerActionButton = (FooterActionButton) LayoutInflater.from(new ContextThemeWrapper(this.m, alspVar.m)).inflate(R.layout.suc_button, (ViewGroup) null, false);
        footerActionButton.setId(View.generateViewId());
        footerActionButton.setText(althVar.b);
        footerActionButton.setOnClickListener(althVar);
        footerActionButton.setVisibility(0);
        footerActionButton.setEnabled(true);
        footerActionButton.a = althVar;
        footerActionButton.getId();
        return footerActionButton;
    }

    private final void k(Button button, alsp alspVar) {
        int c;
        RippleDrawable rippleDrawable;
        GradientDrawable gradientDrawable;
        if (this.a) {
            Context context = this.m;
            boolean z = this.b;
            int id = button.getId();
            int i = this.o;
            if (!z) {
                if (button.isEnabled()) {
                    alta.h(context, button, alspVar.e);
                }
                altc altcVar = alspVar.a;
                altc altcVar2 = alspVar.b;
                altc altcVar3 = alspVar.c;
                alta.j(Build.VERSION.SDK_INT >= 29, "Update button background only support on sdk Q or higher");
                int c2 = alte.f(context).c(context, altcVar);
                float o = alte.f(context).o(context, altcVar2);
                int c3 = alte.f(context).c(context, altcVar3);
                int[] iArr = {-16842910};
                int[] iArr2 = new int[0];
                if (c2 != 0) {
                    if (o <= 0.0f) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
                        float f = obtainStyledAttributes.getFloat(0, 0.26f);
                        obtainStyledAttributes.recycle();
                        o = f;
                    }
                    if (c3 == 0) {
                        c3 = c2;
                    }
                    ColorStateList colorStateList = new ColorStateList(new int[][]{iArr, iArr2}, new int[]{alta.g(c3, o), c2});
                    button.getBackground().mutate().setState(new int[0]);
                    button.refreshDrawableState();
                    button.setBackgroundTintList(colorStateList);
                }
            }
            altc altcVar4 = alspVar.e;
            altc altcVar5 = alspVar.l;
            if (z) {
                c = button.getTextColors().getDefaultColor();
            } else {
                c = alte.f(context).c(context, altcVar4);
            }
            float o2 = alte.f(context).o(context, altcVar5);
            Drawable background = button.getBackground();
            if (background instanceof InsetDrawable) {
                rippleDrawable = (RippleDrawable) ((InsetDrawable) background).getDrawable();
            } else {
                rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
            }
            if (rippleDrawable != null) {
                rippleDrawable.setColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, StateSet.NOTHING}, new int[]{alta.g(c, o2), 0}));
            }
            altc altcVar6 = alspVar.f;
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (alte.f(context).l(altcVar6) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins((int) alte.f(context).a(context, altcVar6), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            float a = alte.f(context).a(context, alspVar.g);
            if (a > 0.0f) {
                button.setTextSize(0, a);
            }
            altc altcVar7 = alspVar.h;
            if (alte.f(context).l(altcVar7)) {
                float a2 = alte.f(context).a(context, altcVar7);
                if (a2 > 0.0f) {
                    button.setMinHeight((int) a2);
                }
            }
            altc altcVar8 = alspVar.i;
            altc altcVar9 = alspVar.j;
            Typeface create = Typeface.create(alte.f(context).h(context, altcVar8), alte.f(context).l(altcVar9) ? alte.f(context).p(context, altcVar9) : 0);
            if (create != null) {
                button.setTypeface(create);
            }
            altc altcVar10 = alspVar.k;
            if (Build.VERSION.SDK_INT >= 24) {
                float a3 = alte.f(context).a(context, altcVar10);
                Drawable background2 = button.getBackground();
                if (background2 instanceof InsetDrawable) {
                    gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) background2).getDrawable()).getDrawable(0);
                } else if (background2 instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable2 = (RippleDrawable) background2;
                    if (rippleDrawable2.getDrawable(0) instanceof GradientDrawable) {
                        gradientDrawable = (GradientDrawable) rippleDrawable2.getDrawable(0);
                    } else {
                        gradientDrawable = (GradientDrawable) ((InsetDrawable) rippleDrawable2.getDrawable(0)).getDrawable();
                    }
                } else {
                    gradientDrawable = null;
                }
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius(a3);
                }
            }
            altc altcVar11 = alspVar.d;
            if (button != null) {
                Drawable d = altcVar11 != null ? alte.f(context).d(context, altcVar11) : null;
                if (d != null) {
                    d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
                }
                Drawable drawable = id != i ? null : d;
                if (id == i) {
                    d = null;
                }
                button.setCompoundDrawablesRelative(d, null, drawable, null);
            }
            if (this.b) {
                return;
            }
            altc altcVar12 = alspVar.e;
            if (button.isEnabled()) {
                alta.h(this.m, button, altcVar12);
            } else {
                button.setTextColor(this.o != button.getId() ? this.h : this.g);
            }
        }
    }

    private final boolean l() {
        if (alte.f(this.m).l(altc.CONFIG_FOOTER_BUTTON_ALIGNED_END)) {
            return alte.f(this.m).j(this.m, altc.CONFIG_FOOTER_BUTTON_ALIGNED_END, false);
        }
        return false;
    }

    public final Button a() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.o);
    }

    public final Button b() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.p);
    }

    protected final void c(Button button, int i) {
        if (i != 0) {
            button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        this.d.addView(button);
        Button a = a();
        Button b = b();
        int i2 = 0;
        boolean z = a != null && a.getVisibility() == 0;
        boolean z2 = b != null && b.getVisibility() == 0;
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            if (!z && !z2) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    protected final void d() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout h = h();
        Button a = a();
        Button b = b();
        h.removeAllViews();
        int i = this.m.getResources().getConfiguration().orientation;
        if (b != null) {
            h.addView(b);
        }
        if (!l()) {
            LinearLayout h2 = h();
            View view = new View(this.m);
            view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            view.setVisibility(4);
            h2.addView(view);
        }
        if (a != null) {
            h.addView(a);
        }
        if (a != null && (layoutParams2 = (LinearLayout.LayoutParams) a.getLayoutParams()) != null) {
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
            a.setLayoutParams(layoutParams2);
        }
        if (b == null || (layoutParams = (LinearLayout.LayoutParams) b.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
        b.setLayoutParams(layoutParams);
    }

    public final boolean e() {
        return a() != null && a().getVisibility() == 0;
    }

    public final boolean f() {
        return b() != null && b().getVisibility() == 0;
    }
}
