package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.setupdesign.view.BottomScrollView;
import com.google.android.youtube.R;
import defpackage.alsk;
import defpackage.alta;
import defpackage.altc;
import defpackage.alte;
import defpackage.altj;
import defpackage.alto;
import defpackage.altp;
import defpackage.altw;
import defpackage.alty;
import defpackage.altz;
import defpackage.alub;
import defpackage.aluc;
import defpackage.alud;
import defpackage.alue;
import defpackage.aluf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlifLayout extends alsk {
    private ColorStateList c;
    private boolean d;
    private boolean e;
    private ColorStateList f;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    private final void l(AttributeSet attributeSet, int i) {
        int a;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, altp.g, i, 0);
        this.e = f() && obtainStyledAttributes.getBoolean(4, false);
        j(alty.class, new alty(this, attributeSet, i));
        j(altw.class, new altw(this, attributeSet, i));
        j(altz.class, new altz(this, attributeSet, i));
        j(aluc.class, new aluc(this, attributeSet, i));
        j(alub.class, new alub(this));
        j(alud.class, new alud());
        View findViewById = findViewById(R.id.sud_scroll_view);
        ScrollView scrollView = findViewById instanceof ScrollView ? (ScrollView) findViewById : null;
        if (scrollView != null) {
            if (scrollView instanceof BottomScrollView) {
            } else {
                String valueOf = String.valueOf(scrollView);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Cannot set non-BottomScrollView. Found=");
                sb.append(valueOf);
                Log.w("ScrollViewDelegate", sb.toString());
            }
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.c = colorStateList;
            m();
            ProgressBar a2 = ((aluc) i(aluc.class)).a();
            if (a2 != null) {
                a2.setIndeterminateTintList(colorStateList);
                a2.setProgressBackgroundTintList(colorStateList);
            }
        }
        if (this.e) {
            if (!g()) {
                getRootView().setBackgroundColor(alte.f(getContext()).c(getContext(), altc.CONFIG_LAYOUT_BACKGROUND_COLOR));
            }
            View findViewById2 = findViewById(R.id.sud_layout_content);
            if (findViewById2 != null) {
                alta.K(findViewById2);
                Context context = findViewById2.getContext();
                boolean l = alte.f(context).l(altc.CONFIG_CONTENT_PADDING_TOP);
                if (alta.J(findViewById2) && l && (a = (int) alte.f(context).a(context, altc.CONFIG_CONTENT_PADDING_TOP)) != findViewById2.getPaddingTop()) {
                    findViewById2.setPadding(findViewById2.getPaddingStart(), a, findViewById2.getPaddingEnd(), findViewById2.getPaddingBottom());
                }
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sud_glif_land_middle_horizontal_spacing);
        View findViewById3 = findViewById(R.id.sud_landscape_header_area);
        if (findViewById3 != null && alte.f(getContext()).l(altc.CONFIG_LAYOUT_MARGIN_END)) {
            findViewById3.setPadding(findViewById3.getPaddingStart(), findViewById3.getPaddingTop(), (dimensionPixelSize / 2) - ((int) alte.f(getContext()).a(getContext(), altc.CONFIG_LAYOUT_MARGIN_END)), findViewById3.getPaddingBottom());
        }
        View findViewById4 = findViewById(R.id.sud_landscape_content_area);
        if (findViewById4 != null && alte.f(getContext()).l(altc.CONFIG_LAYOUT_MARGIN_START)) {
            findViewById4.setPadding(findViewById3 != null ? (dimensionPixelSize / 2) - ((int) alte.f(getContext()).a(getContext(), altc.CONFIG_LAYOUT_MARGIN_START)) : 0, findViewById4.getPaddingTop(), findViewById4.getPaddingEnd(), findViewById4.getPaddingBottom());
        }
        this.f = obtainStyledAttributes.getColorStateList(0);
        m();
        this.d = obtainStyledAttributes.getBoolean(1, true);
        m();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.sud_layout_sticky_header);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        obtainStyledAttributes.recycle();
    }

    private final void m() {
        int defaultColor;
        Drawable colorDrawable;
        if (findViewById(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.f;
            if (colorStateList != null) {
                defaultColor = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.c;
                defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.d) {
                colorDrawable = new alto(defaultColor);
            } else {
                colorDrawable = new ColorDrawable(defaultColor);
            }
            ((altj) i(altj.class)).a(colorDrawable);
        }
    }

    @Override // defpackage.alsk, com.google.android.setupcompat.internal.TemplateLayout
    protected final View b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_glif_template;
        }
        return h(layoutInflater, R.style.SudThemeGlif_Light, i);
    }

    @Override // defpackage.alsk, com.google.android.setupcompat.internal.TemplateLayout
    protected final ViewGroup c(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.c(i);
    }

    public final boolean k() {
        return this.e || (f() && alte.n(getContext()));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        ImageView b;
        int H;
        super.onFinishInflate();
        altz altzVar = (altz) i(altz.class);
        if (((GlifLayout) altzVar.a).k()) {
            ImageView b2 = altzVar.b();
            FrameLayout a = altzVar.a();
            if (b2 != null && a != null) {
                Context context = b2.getContext();
                int H2 = alta.H(context);
                if (H2 != 0) {
                    alta.L(b2, H2);
                }
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                if (alte.f(context).l(altc.CONFIG_ICON_MARGIN_TOP) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) alte.f(context).a(context, altc.CONFIG_ICON_MARGIN_TOP), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                if (alte.f(context).l(altc.CONFIG_ICON_SIZE)) {
                    b2.getViewTreeObserver().addOnPreDrawListener(new alue(b2));
                    ViewGroup.LayoutParams layoutParams2 = b2.getLayoutParams();
                    layoutParams2.height = (int) alte.f(context).a(context, altc.CONFIG_ICON_SIZE);
                    layoutParams2.width = -2;
                    b2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
        } else if (((alsk) altzVar.a).f() && (b = altzVar.b()) != null && (H = alta.H(b.getContext())) != 0) {
            alta.L(b, H);
        }
        alty altyVar = (alty) i(alty.class);
        TextView textView = (TextView) altyVar.a.findViewById(R.id.suc_layout_title);
        boolean f = ((alsk) altyVar.a).f();
        if (((GlifLayout) altyVar.a).k()) {
            View findViewById = altyVar.a.findViewById(R.id.sud_layout_header);
            if (textView != null) {
                alta.G(textView, new aluf(altc.CONFIG_HEADER_TEXT_COLOR, null, altc.CONFIG_HEADER_TEXT_SIZE, altc.CONFIG_HEADER_FONT_FAMILY, null, altc.CONFIG_HEADER_TEXT_MARGIN_TOP, altc.CONFIG_HEADER_TEXT_MARGIN_BOTTOM, alta.H(textView.getContext())));
            }
            ViewGroup viewGroup = (ViewGroup) findViewById;
            if (viewGroup != null && alta.J(viewGroup)) {
                Context context2 = viewGroup.getContext();
                viewGroup.setBackgroundColor(alte.f(context2).c(context2, altc.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
                if (alte.f(context2).l(altc.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM)) {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, (int) alte.f(context2).a(context2, altc.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM));
                        viewGroup.setLayoutParams(layoutParams3);
                    }
                }
            }
            alta.K(findViewById);
            altyVar.c();
        } else if (f && textView != null) {
            alta.F(textView, new aluf(null, null, null, null, null, null, null, alta.H(textView.getContext())));
        }
        if (altyVar.b) {
            altyVar.b(textView);
        }
        altw altwVar = (altw) i(altw.class);
        TextView textView2 = (TextView) altwVar.a.findViewById(R.id.sud_layout_subtitle);
        if (((GlifLayout) altwVar.a).k()) {
            if (textView2 != null) {
                alta.G(textView2, new aluf(altc.CONFIG_DESCRIPTION_TEXT_COLOR, altc.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, altc.CONFIG_DESCRIPTION_TEXT_SIZE, altc.CONFIG_DESCRIPTION_FONT_FAMILY, altc.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, altc.CONFIG_DESCRIPTION_TEXT_MARGIN_TOP, altc.CONFIG_DESCRIPTION_TEXT_MARGIN_BOTTOM, alta.H(textView2.getContext())));
            }
        } else if (((alsk) altwVar.a).f() && textView2 != null) {
            alta.F(textView2, new aluf(null, null, null, null, null, null, null, alta.H(textView2.getContext())));
        }
        aluc alucVar = (aluc) i(aluc.class);
        ProgressBar a2 = alucVar.a();
        if (alucVar.b && a2 != null) {
            if (((GlifLayout) alucVar.a).k()) {
                Context context3 = a2.getContext();
                ViewGroup.LayoutParams layoutParams4 = a2.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    int i = marginLayoutParams3.topMargin;
                    if (alte.f(context3).l(altc.CONFIG_PROGRESS_BAR_MARGIN_TOP)) {
                        i = (int) alte.f(context3).b(context3, altc.CONFIG_PROGRESS_BAR_MARGIN_TOP, context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_top));
                    }
                    int i2 = marginLayoutParams3.bottomMargin;
                    if (alte.f(context3).l(altc.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM)) {
                        i2 = (int) alte.f(context3).b(context3, altc.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM, context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                    }
                    if (i != marginLayoutParams3.topMargin || i2 != marginLayoutParams3.bottomMargin) {
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, i, marginLayoutParams3.rightMargin, i2);
                    }
                }
            } else {
                Context context4 = a2.getContext();
                ViewGroup.LayoutParams layoutParams5 = a2.getLayoutParams();
                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, (int) context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_top), marginLayoutParams4.rightMargin, (int) context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                }
            }
        }
        TextView textView3 = (TextView) findViewById(R.id.sud_layout_description);
        if (textView3 != null) {
            if (this.e) {
                alta.G(textView3, new aluf(altc.CONFIG_DESCRIPTION_TEXT_COLOR, altc.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, altc.CONFIG_DESCRIPTION_TEXT_SIZE, altc.CONFIG_DESCRIPTION_FONT_FAMILY, altc.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, null, null, alta.H(textView3.getContext())));
            } else if (f()) {
                alta.F(textView3, new aluf(null, null, null, null, null, null, null, alta.H(textView3.getContext())));
            }
        }
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.d = true;
        this.e = false;
        l(null, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = false;
        l(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.e = false;
        l(attributeSet, i);
    }
}
