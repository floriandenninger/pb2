package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahrq extends aixi implements View.OnClickListener {
    private static final int[] j = {R.attr.selectableItemBackgroundBorderless};
    public final Context a;
    public final aqte b;
    public final CreatorEndscreenOverlayPresenter c;
    public final ahrp d;
    public TextView e;
    public final float f;
    public final Animation.AnimationListener g;
    public final AlphaAnimation h;
    public final AlphaAnimation i;
    private FrameLayout k;
    private FrameLayout r;
    private ImageView s;

    public ahrq(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqte aqteVar) {
        super(aqteVar.l, aqteVar.m, 1, 1, null);
        ahro ahroVar = new ahro(this);
        this.g = ahroVar;
        this.a = context;
        aqteVar.getClass();
        this.b = aqteVar;
        this.c = creatorEndscreenOverlayPresenter;
        this.d = creatorEndscreenOverlayPresenter;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.h = alphaAnimation;
        alphaAnimation.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.i = alphaAnimation2;
        alphaAnimation2.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        alphaAnimation2.setAnimationListener(ahroVar);
        this.f = context.getResources().getDimension(R.dimen.endscreen_element_text_size) * 6.0f;
    }

    public static void e(FrameLayout frameLayout) {
        TypedArray obtainStyledAttributes = frameLayout.getContext().obtainStyledAttributes(j);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        frameLayout.setForeground(drawable);
    }

    @Override // defpackage.aixi
    protected final void a() {
        this.d.k(this);
    }

    @Override // defpackage.aixi
    public final void b(boolean z, boolean z2, boolean z3) {
        this.d.r(this);
    }

    public View c() {
        aqyg aqygVar;
        if (this.k == null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_video, (ViewGroup) this.c.g, false);
            this.k = frameLayout;
            frameLayout.setOnClickListener(this);
            this.r = (FrameLayout) this.k.findViewById(R.id.image_container);
            ImageView d = d();
            int bn = aocz.bn(this.b.c);
            if (bn == 0 || bn != 6) {
                d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                d.setScaleType(ImageView.ScaleType.FIT_CENTER);
                d.setBackgroundColor(wbs.W(this.a, R.attr.ytStaticWhite).orElse(0));
            }
            this.r.addView(d, -1, -1);
            e(this.r);
            TextView textView = (TextView) this.k.findViewById(R.id.title_text);
            this.e = textView;
            aqte aqteVar = this.b;
            if ((aqteVar.b & 4096) != 0) {
                aqygVar = aqteVar.n;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView, ajcq.b(aqygVar));
            f(this.k);
        }
        return this.k;
    }

    public ImageView d() {
        if (this.s == null) {
            this.s = new ImageView(this.a);
        }
        return this.s;
    }

    public void f(View view) {
        aqyg aqygVar;
        aqte aqteVar = this.b;
        aqyg aqygVar2 = null;
        if ((aqteVar.b & 4096) != 0) {
            aqygVar = aqteVar.n;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        CharSequence i = ajcq.i(aqygVar);
        if (i == null) {
            aqte aqteVar2 = this.b;
            if ((aqteVar2.b & 4096) != 0 && (aqygVar2 = aqteVar2.n) == null) {
                aqygVar2 = aqyg.a;
            }
            i = ajcq.b(aqygVar2);
        }
        view.setContentDescription(i);
    }

    public void g(ahsb ahsbVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        TextView textView = ahsbVar.f;
        aqte aqteVar = this.b;
        aqyg aqygVar4 = null;
        if ((aqteVar.b & 4096) != 0) {
            aqygVar = aqteVar.n;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = ahsbVar.g;
        aqte aqteVar2 = this.b;
        if ((aqteVar2.b & 8192) != 0) {
            aqygVar2 = aqteVar2.o;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = ahsbVar.h;
        aqte aqteVar3 = this.b;
        if ((aqteVar3.b & 131072) != 0) {
            aqygVar3 = aqteVar3.r;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        textView3.setText(ajcq.b(aqygVar3));
        TextView textView4 = ahsbVar.i;
        aqte aqteVar4 = this.b;
        if ((aqteVar4.b & 262144) != 0 && (aqygVar4 = aqteVar4.s) == null) {
            aqygVar4 = aqyg.a;
        }
        textView4.setText(ajcq.b(aqygVar4));
        int bn = aocz.bn(this.b.c);
        if (bn != 0 && bn == 6) {
            ahsbVar.d.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void h(ajjz ajjzVar) {
        ImageView d = d();
        avgg avggVar = this.b.d;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(d, avggVar);
    }

    public boolean i() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == c()) {
            this.d.o(this);
        }
    }
}
