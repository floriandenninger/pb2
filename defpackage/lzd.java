package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzd implements mak {
    public final aahd a;
    public String b;
    public int c;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final Context l;
    private AnimationSet n;
    private final Interpolator m = jg.o(0.05f, 0.0f, 0.0f, 1.0f);
    private boolean o = false;

    public lzd(Context context, aadw aadwVar, aahd aahdVar) {
        this.l = context;
        asvu asvuVar = aadwVar.b().e;
        this.e = (asvuVar == null ? asvu.a : asvuVar).B;
        asvu asvuVar2 = aadwVar.b().e;
        this.f = (asvuVar2 == null ? asvu.a : asvuVar2).C;
        this.g = evr.ba(aadwVar);
        asvu asvuVar3 = aadwVar.b().e;
        this.i = (asvuVar3 == null ? asvu.a : asvuVar3).Y;
        asvu asvuVar4 = aadwVar.b().e;
        this.j = (asvuVar4 == null ? asvu.a : asvuVar4).Z;
        this.h = evr.bb(aadwVar);
        this.k = evr.al(aadwVar).h() ? (String) evr.al(aadwVar).c() : "default";
        this.a = aahdVar;
    }

    private final InsetDrawable i() {
        PaintDrawable paintDrawable = new PaintDrawable(wbs.W(this.l, R.attr.ytBadgeChipBackground).orElse(0));
        paintDrawable.setCornerRadius(yjk.K(this.l.getResources().getDisplayMetrics(), 2));
        return new InsetDrawable((Drawable) paintDrawable, this.l.getResources().getDimensionPixelSize(R.dimen.search_bar_inset_start), yjk.K(this.l.getResources().getDisplayMetrics(), 8), this.l.getResources().getDimensionPixelSize(R.dimen.search_bar_inset_end), yjk.K(this.l.getResources().getDisplayMetrics(), 8));
    }

    private final InsetDrawable j() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(wbs.W(this.l, R.attr.ytBadgeChipBackground).orElse(0));
        return new InsetDrawable((Drawable) shapeDrawable, yjk.K(this.l.getResources().getDisplayMetrics(), 8));
    }

    private final void l(View view, apxf apxfVar) {
        view.setOnClickListener(new lzc(this, apxfVar));
    }

    private final void m(ImageView imageView, boolean z, boolean z2) {
        if (z2) {
            imageView.setImageDrawable(aii.a(this.l, R.drawable.yt_icon_header));
        } else if (z) {
            imageView.setImageDrawable(wbs.T(this.l, R.attr.ytPremiumWordmarkHeader));
        } else {
            imageView.setImageDrawable(wbs.T(this.l, R.attr.ytWordmarkHeader));
        }
    }

    @Override // defpackage.mak
    public final View a(LayoutInflater layoutInflater) {
        if (this.e) {
            View inflate = layoutInflater.inflate(R.layout.action_bar_search_results_view_mic, (ViewGroup) null);
            inflate.findViewById(R.id.search_box).setBackgroundDrawable(i());
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.voice_search);
            appCompatImageView.setBackgroundDrawable(j());
            k(appCompatImageView);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.action_bar_search_results_view_grey, (ViewGroup) null);
        inflate2.setBackgroundDrawable(i());
        return inflate2;
    }

    @Override // defpackage.mak
    public final View b(LayoutInflater layoutInflater) {
        if (!this.g) {
            return layoutInflater.inflate(R.layout.action_bar_ringo, (ViewGroup) null);
        }
        if (!yjk.aa(this.l) || !this.h) {
            return layoutInflater.inflate(R.layout.action_bar_ringo_background, (ViewGroup) null);
        }
        return layoutInflater.inflate(R.layout.action_bar_ringo_background_static, (ViewGroup) null);
    }

    @Override // defpackage.mak
    public final View c(LayoutInflater layoutInflater) {
        if (this.f) {
            View inflate = layoutInflater.inflate(R.layout.action_bar_search_view_mic_out, (ViewGroup) null);
            inflate.findViewById(R.id.search_box).setBackgroundDrawable(i());
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.voice_search);
            appCompatImageView.setBackgroundDrawable(j());
            k(appCompatImageView);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.action_bar_search_view_grey, (ViewGroup) null);
        inflate2.setBackgroundDrawable(i());
        k((AppCompatImageView) inflate2.findViewById(R.id.voice_search));
        return inflate2;
    }

    @Override // defpackage.mak
    public final void d(View view) {
        if (this.h && this.o) {
            yny.z(view.findViewById(R.id.search_box), yny.x(yjk.N(this.l) / 2), af.class);
        }
    }

    @Override // defpackage.fzs
    public final void e(String str) {
        this.b = str;
    }

    @Override // defpackage.fzs
    public final void f() {
        this.c = 10349;
    }

    @Override // defpackage.mak
    public final void g(View view, apxf apxfVar, boolean z, boolean z2) {
        if (this.g) {
            if (!yjk.aa(this.l) || !this.h) {
                TextView textView = (TextView) view.findViewById(R.id.search_box);
                View view2 = (ImageView) view.findViewById(R.id.search_icon);
                ImageView imageView = (ImageView) view.findViewById(R.id.youtube_logo);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.youtube_text);
                l(textView, apxfVar);
                l(view2, apxfVar);
                textView.setBackgroundDrawable(i());
                if (!this.i) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.setMarginStart(0);
                    textView.setLayoutParams(layoutParams);
                    return;
                }
                if (this.j) {
                    imageView.setImageDrawable(aii.a(this.l, R.drawable.yt_icon_header));
                    if (z2) {
                        imageView2.setVisibility(8);
                    } else if (z) {
                        imageView2.setImageDrawable(wbs.T(this.l, R.attr.ytPremiumWordmarkText));
                    } else {
                        imageView2.setImageDrawable(wbs.T(this.l, R.attr.ytWordmarkText));
                    }
                } else {
                    imageView.setVisibility(8);
                    m(imageView2, z, z2);
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams2.setMarginStart(0);
                    textView.setLayoutParams(layoutParams2);
                }
                imageView2.animate().alpha(0.0f).setStartDelay(1100L).setDuration(300L).setInterpolator(this.m).setListener(new lzb(imageView2));
                if (this.n == null) {
                    this.n = new AnimationSet(true);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    this.n.addAnimation(new ScaleAnimation(0.6f, 1.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f));
                    this.n.addAnimation(alphaAnimation);
                    this.n.setStartOffset(1100L);
                    this.n.setDuration(400L);
                    this.n.setInterpolator(this.m);
                }
                textView.startAnimation(this.n);
                return;
            }
            View findViewById = view.findViewById(R.id.search_box);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.youtube_logo);
            findViewById.setBackgroundDrawable(i());
            l(findViewById, apxfVar);
            m(imageView3, z, z2);
            yny.z(findViewById, yny.x(yjk.N(this.l) / 2), af.class);
        }
    }

    @Override // defpackage.mak
    public final void h(boolean z) {
        this.o = z;
    }

    private final void k(AppCompatImageView appCompatImageView) {
        char c;
        String str = this.k;
        int hashCode = str.hashCode();
        if (hashCode == -791090288) {
            if (str.equals("pattern")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 109618859) {
            if (hashCode == 110330781 && str.equals("thick")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("solid")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            appCompatImageView.setImageResource(R.drawable.yt_fill_mic_alt_black_24);
            return;
        }
        if (c == 1) {
            appCompatImageView.setImageResource(R.drawable.yt_fill_mic_pattern_black_24);
        } else if (c == 2) {
            appCompatImageView.setImageResource(R.drawable.yt_outline_mic_alt_black_24);
        } else {
            appCompatImageView.setImageResource(R.drawable.yt_outline_mic_black_24);
        }
    }
}
