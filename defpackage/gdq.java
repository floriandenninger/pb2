package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gdq extends LinearLayout {
    private final ImageView A;
    private final YouTubeTextView B;
    public Drawable a;
    public Drawable b;
    public final ImageView c;
    public final ImageView d;
    public gdp e;
    public int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private Drawable y;
    private Drawable z;

    public gdq(Context context) {
        this(context, true);
    }

    private static void h(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    private final void i(boolean z) {
        Typeface a;
        int i;
        gdp gdpVar = this.e;
        gdpVar.getClass();
        YouTubeTextView youTubeTextView = this.B;
        if (gdpVar.e) {
            a = ajct.ROBOTO_MEDIUM.a(getContext());
        } else {
            a = ajct.ROBOTO_REGULAR.a(getContext());
        }
        youTubeTextView.setTypeface(a);
        YouTubeTextView youTubeTextView2 = this.B;
        gdp gdpVar2 = this.e;
        if (z) {
            i = gdpVar2.d ? gdpVar2.o : 0;
        } else {
            i = gdpVar2.m;
        }
        jw.Y(youTubeTextView2, i, youTubeTextView2.getPaddingTop(), this.e.n, this.B.getPaddingBottom());
    }

    public final gdo a() {
        gdo gdoVar = new gdo(null);
        gdoVar.f(false);
        gdoVar.d(false);
        gdoVar.b(true);
        gdoVar.x(false);
        gdoVar.k(0);
        gdoVar.m(R.attr.colorControlHighlight);
        gdoVar.u(R.attr.colorControlHighlight);
        gdoVar.h(this.p);
        gdoVar.a = Integer.valueOf(this.r);
        gdoVar.q(this.r);
        gdoVar.r(this.s);
        gdoVar.j(this.n);
        gdoVar.c(this.v);
        gdoVar.p(false);
        gdoVar.o(false);
        gdoVar.i(0);
        gdoVar.w(false);
        gdoVar.s(17);
        return gdoVar;
    }

    public final void b(aptg aptgVar) {
        Spanned spanned;
        this.e.getClass();
        yny.B(this, -2, -2);
        setOrientation(0);
        setMinimumHeight(this.u);
        setMinimumWidth(this.e.p);
        setClickable(this.e.g);
        this.B.setSingleLine(!this.e.i);
        this.B.setGravity(this.e.r);
        gdp gdpVar = this.e;
        gdpVar.getClass();
        if (gdpVar.b) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.A.setVisibility(0);
            i(true);
            this.e.getClass();
            this.z = getResources().getDrawable(R.drawable.quantum_ic_check_box_outline_blank_white_24);
            this.y = getResources().getDrawable(R.drawable.quantum_ic_check_box_white_24);
            if (this.e.w.h()) {
                h(this.z, ((Integer) this.e.w.c()).intValue());
                h(this.y, ((Integer) this.e.w.c()).intValue());
            }
        } else if (gdpVar.c) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            this.A.setVisibility(8);
            i(true);
        } else if (gdpVar.a) {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.A.setVisibility(8);
            i(true);
        } else {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.A.setVisibility(8);
            i(false);
        }
        e(true != aptgVar.i ? 2 : 1, this.g);
        if ((aptgVar.b & 2) != 0) {
            aqyg aqygVar = aptgVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            spanned = ajcq.b(aqygVar);
        } else {
            spanned = null;
        }
        this.B.setText(spanned);
        aott aottVar = aptgVar.h;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) != 0) {
            aott aottVar2 = aptgVar.h;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar2 = aottVar2.c;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            if (!aotsVar2.c.isEmpty()) {
                aott aottVar3 = aptgVar.h;
                if (aottVar3 == null) {
                    aottVar3 = aott.a;
                }
                aots aotsVar3 = aottVar3.c;
                if (aotsVar3 == null) {
                    aotsVar3 = aots.a;
                }
                setContentDescription(aotsVar3.c);
                return;
            }
        }
        setContentDescription(null);
    }

    public final void c(aptg aptgVar) {
        gdo a = a();
        g(a, aptgVar);
        this.e = a.a();
        b(aptgVar);
    }

    public final void d(int i) {
        this.e.getClass();
        e(i, true);
    }

    public final void e(int i, boolean z) {
        this.e.getClass();
        this.f = i;
        setSelected(i == 1);
        if (this.e.h) {
            setBackground(wbs.T(getContext(), R.attr.ytTouchFeedbackCircle));
        } else {
            setTouchDelegate(null);
            gdp gdpVar = this.e;
            setBackgroundResource(isSelected() ? gdpVar.u : gdpVar.v);
            if (z) {
                Context context = getContext();
                gdp gdpVar2 = this.e;
                setBackground(new RippleDrawable(wbs.S(context, isSelected() ? gdpVar2.x : gdpVar2.y), getBackground(), null));
            } else {
                akba a = akba.a(getContext());
                a.b = getBackground();
                a.c(this.e.q);
                setBackground(a.b());
            }
        }
        YouTubeTextView youTubeTextView = this.B;
        gdp gdpVar3 = this.e;
        youTubeTextView.setTextColor(isSelected() ? gdpVar3.s : gdpVar3.t);
        if (this.e.b) {
            this.A.setImageDrawable(isSelected() ? this.y : this.z);
        }
        gdp gdpVar4 = this.e;
        gdpVar4.getClass();
        if (!gdpVar4.c || this.a == null || this.b == null) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setImageDrawable(isSelected() ? this.a : this.b);
        }
    }

    public final void f(int i) {
        this.B.setMinimumWidth(i);
        this.B.setMaxWidth(Integer.MAX_VALUE);
    }

    public final void g(gdo gdoVar, aptg aptgVar) {
        gdoVar.e(false);
        gdoVar.d(aptgVar.c == 6);
        gdoVar.f(aptgVar.c == 7);
        aqyg aqygVar = aptgVar.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        gdoVar.g(!TextUtils.isEmpty(ajcq.b(aqygVar)));
        apti aptiVar = aptgVar.e;
        if (aptiVar == null) {
            aptiVar = apti.a;
        }
        apth b = apth.b(aptiVar.c);
        if (b == null) {
            b = apth.STYLE_UNKNOWN;
        }
        if (b != apth.STYLE_RELATED) {
            apti aptiVar2 = aptgVar.e;
            if (aptiVar2 == null) {
                aptiVar2 = apti.a;
            }
            apth b2 = apth.b(aptiVar2.c);
            if (b2 == null) {
                b2 = apth.STYLE_UNKNOWN;
            }
            if (b2 != apth.STYLE_HOME_FILTER) {
                apti aptiVar3 = aptgVar.e;
                if (aptiVar3 == null) {
                    aptiVar3 = apti.a;
                }
                apth b3 = apth.b(aptiVar3.c);
                if (b3 == null) {
                    b3 = apth.STYLE_UNKNOWN;
                }
                if (b3 != apth.STYLE_PREMIUM_CHIP) {
                    apti aptiVar4 = aptgVar.e;
                    if (aptiVar4 == null) {
                        aptiVar4 = apti.a;
                    }
                    apth b4 = apth.b(aptiVar4.c);
                    if (b4 == null) {
                        b4 = apth.STYLE_UNKNOWN;
                    }
                    if (b4 != apth.STYLE_DEFAULT) {
                        apti aptiVar5 = aptgVar.e;
                        if (aptiVar5 == null) {
                            aptiVar5 = apti.a;
                        }
                        apth b5 = apth.b(aptiVar5.c);
                        if (b5 == null) {
                            b5 = apth.STYLE_UNKNOWN;
                        }
                        if (b5 != apth.STYLE_EXPLORE_LAUNCHER_CHIP) {
                            apti aptiVar6 = aptgVar.e;
                            if (aptiVar6 == null) {
                                aptiVar6 = apti.a;
                            }
                            apth b6 = apth.b(aptiVar6.c);
                            if (b6 == null) {
                                b6 = apth.STYLE_UNKNOWN;
                            }
                            if (b6 != apth.STYLE_SHORTS_CHIP) {
                                apti aptiVar7 = aptgVar.e;
                                if (aptiVar7 == null) {
                                    aptiVar7 = apti.a;
                                }
                                apth b7 = apth.b(aptiVar7.c);
                                if (b7 == null) {
                                    b7 = apth.STYLE_UNKNOWN;
                                }
                                if (b7 == apth.STYLE_REFRESH_TO_NOVEL_CHIP) {
                                    gdoVar.t(R.drawable.chip_cloud_chip_r2n_unselected_background);
                                    gdoVar.v(this.k);
                                    gdoVar.l(R.drawable.chip_cloud_chip_r2n_selected_background);
                                    gdoVar.n(this.k);
                                    return;
                                }
                                gdoVar.t(R.drawable.chip_cloud_chip_default_background);
                                gdoVar.v(this.h);
                                gdoVar.l(R.drawable.chip_cloud_chip_primary_background);
                                gdoVar.n(this.i);
                                return;
                            }
                        }
                        gdoVar.t(R.drawable.chip_cloud_chip_launcher);
                        gdoVar.l(R.drawable.chip_cloud_chip_launcher);
                        gdoVar.v(this.k);
                        gdoVar.n(this.k);
                        gdoVar.u(R.attr.ytTouchResponse);
                        gdoVar.m(R.attr.ytTouchResponseInverse);
                        gdoVar.j(this.o);
                        gdoVar.r(this.t);
                        gdoVar.c(this.w);
                        gdoVar.h(this.q);
                        gdoVar.p(true);
                        if ((aptgVar.b & 2) == 0) {
                            gdoVar.q(0);
                            gdoVar.i(this.o);
                            apti aptiVar8 = aptgVar.e;
                            if (aptiVar8 == null) {
                                aptiVar8 = apti.a;
                            }
                            apth b8 = apth.b(aptiVar8.c);
                            if (b8 == null) {
                                b8 = apth.STYLE_UNKNOWN;
                            }
                            if (b8 == apth.STYLE_EXPLORE_LAUNCHER_CHIP) {
                                gdoVar.x(true);
                            }
                        }
                        apti aptiVar9 = aptgVar.e;
                        if (aptiVar9 == null) {
                            aptiVar9 = apti.a;
                        }
                        apth b9 = apth.b(aptiVar9.c);
                        if (b9 == null) {
                            b9 = apth.STYLE_UNKNOWN;
                        }
                        if (b9 == apth.STYLE_SHORTS_CHIP) {
                            if (aptgVar.c == 7) {
                                arfr b10 = arfr.b(((arfs) aptgVar.d).c);
                                if (b10 == null) {
                                    b10 = arfr.UNKNOWN;
                                }
                                if (b10 == arfr.PLAY_ARROW) {
                                    gdoVar.b = ammv.j(Integer.valueOf(this.m));
                                    return;
                                }
                            }
                            gdoVar.o(true);
                            return;
                        }
                        return;
                    }
                }
            }
            boolean z = (aptgVar.b & 2) == 0 && aptgVar.c != 7;
            gdoVar.b(!z);
            gdoVar.k(z ? this.x : 0);
            gdoVar.t(true != z ? R.drawable.chip_cloud_chip_filter_unselected_background : R.drawable.chip_cloud_chip_filter_ghost_background);
            gdoVar.v(this.k);
            gdoVar.l(R.drawable.chip_cloud_chip_filter_selected_background);
            gdoVar.n(this.l);
            gdoVar.u(R.attr.ytTouchResponse);
            gdoVar.m(R.attr.ytTouchResponseInverse);
            return;
        }
        gdoVar.t(R.drawable.chip_cloud_chip_disabled_background);
        gdoVar.v(this.j);
        gdoVar.l(R.drawable.chip_cloud_chip_primary_background);
        gdoVar.n(this.i);
    }

    public gdq(Context context, boolean z) {
        super(context, null);
        this.g = z;
        Resources resources = getResources();
        this.v = getResources().getDimensionPixelSize(R.dimen.cloud_chip_corner_radius);
        this.w = getResources().getDimensionPixelSize(R.dimen.launcher_chip_corner_radius);
        this.n = resources.getDimensionPixelOffset(R.dimen.cloud_chip_icon_start_margin);
        this.o = resources.getDimensionPixelOffset(R.dimen.launcher_chip_icon_start_margin);
        this.p = resources.getDimensionPixelOffset(R.dimen.cloud_chip_icon_height);
        this.q = resources.getDimensionPixelOffset(R.dimen.cloud_chip_icon_height_launcher);
        this.r = resources.getDimensionPixelOffset(R.dimen.cloud_chip_text_padding);
        this.s = resources.getDimensionPixelOffset(R.dimen.cloud_chip_title_start_padding_with_image);
        this.t = resources.getDimensionPixelOffset(R.dimen.launcher_chip_text_start_padding);
        resources.getDimensionPixelOffset(R.dimen.cloud_chip_text_end_padding_with_multiselect_circle);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cloud_chip_height);
        this.u = dimensionPixelSize;
        this.x = resources.getDimensionPixelSize(R.dimen.cloud_chip_ghost_width);
        this.h = wbs.Q(context, R.attr.ytThemedBlue);
        this.i = wbs.Q(context, R.attr.ytFilledButtonText);
        this.j = wbs.Q(context, R.attr.ytIconActiveOther);
        this.k = wbs.Q(context, R.attr.ytTextPrimary);
        this.l = wbs.Q(context, R.attr.ytTextPrimaryInverse);
        this.m = wbs.Q(context, R.attr.ytBrandRed);
        View.inflate(context, R.layout.chip_cloud_chip, this);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setMinimumHeight(dimensionPixelSize);
        setOrientation(0);
        this.c = (ImageView) findViewById(R.id.avatar);
        this.d = (ImageView) findViewById(R.id.icon);
        this.A = (ImageView) findViewById(R.id.checkbox_icon);
        this.B = (YouTubeTextView) findViewById(R.id.text);
    }
}
