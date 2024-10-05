package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class geg implements gee {
    public TextView a;
    private final Context b;
    private final ajut c;
    private Animation d;
    private Animation e;
    private ged f;
    private FrameLayout h;
    private FrameLayout i;
    private boolean j = false;
    private final gdv g = new gdv();

    public geg(Context context, ajut ajutVar) {
        this.b = context;
        this.c = ajutVar;
    }

    private final void i() {
        this.i.addView(this.h);
        FrameLayout frameLayout = (FrameLayout) this.i.findViewById(R.id.content_pill_layout);
        this.h = frameLayout;
        this.a = (TextView) frameLayout.findViewById(R.id.content_pill_text);
    }

    @Override // defpackage.gee
    public final ammv a() {
        return b().h() ? ammv.i(this.a) : amlr.a;
    }

    @Override // defpackage.gee
    public final ammv b() {
        return ammv.i(this.f);
    }

    @Override // defpackage.gee
    public final ammv c() {
        return b().h() ? ammv.i(this.h) : amlr.a;
    }

    @Override // defpackage.gee
    public final void d(boolean z) {
        TextView textView = this.a;
        if (textView == null || this.i == null) {
            return;
        }
        if (!z) {
            textView.setVisibility(8);
            return;
        }
        gdv gdvVar = this.g;
        if (gdvVar.b) {
            return;
        }
        if (gdvVar.a) {
            this.e.cancel();
        }
        this.a.startAnimation(this.d);
    }

    @Override // defpackage.gee
    public final void e(FrameLayout frameLayout) {
        f();
        this.i = frameLayout;
        if (this.h != null) {
            i();
        }
    }

    @Override // defpackage.gee
    public final void f() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 != null && (frameLayout = this.h) != null) {
            frameLayout2.removeView(frameLayout);
        }
        this.f = null;
        this.i = null;
        this.g.a();
    }

    @Override // defpackage.gee
    public final void g(ged gedVar, boolean z) {
        if (this.i != null) {
            if (this.h == null) {
                this.h = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.content_pill, (ViewGroup) this.i, false);
                i();
            }
            if (!this.j) {
                this.e = AnimationUtils.loadAnimation(this.b, R.anim.pill_fade_in_translate_to_top);
                Animation loadAnimation = AnimationUtils.loadAnimation(this.b, R.anim.pill_fade_out);
                this.d = loadAnimation;
                loadAnimation.setAnimationListener(new gef(this));
                this.j = true;
            }
            if (gedVar != this.f) {
                this.f = gedVar;
                this.a.setText(gedVar.a);
                Drawable drawable = this.b.getResources().getDrawable(this.c.a(gedVar.b));
                if (drawable != null) {
                    jm.u(this.a, drawable, null, null);
                }
                Context context = this.b;
                TextView textView = this.a;
                int color = context.getResources().getColor(R.color.yt_white1);
                int color2 = this.b.getResources().getColor(R.color.yt_white1);
                int color3 = this.b.getResources().getColor(R.color.content_pill_color);
                if (b().h()) {
                    avfc avfcVar = ((ged) b().c()).f;
                    avez b = avez.b(avfcVar.c);
                    if (b == null) {
                        b = avez.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a = akbg.a(context, b, color);
                    avez b2 = avez.b(avfcVar.e);
                    if (b2 == null) {
                        b2 = avez.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a2 = akbg.a(context, b2, color3);
                    avez b3 = avez.b(avfcVar.d);
                    if (b3 == null) {
                        b3 = avez.THEME_ATTRIBUTE_UNKNOWN;
                    }
                    int a3 = akbg.a(context, b3, color2);
                    if (textView != null) {
                        textView.setTextColor(a);
                    }
                    if (textView != null) {
                        textView.setBackgroundTintList(ColorStateList.valueOf(a2));
                    }
                    if (drawable != null) {
                        drawable.setTint(a3);
                    }
                }
            }
            this.h.bringToFront();
            this.a.setVisibility(0);
            if (z) {
                gdv gdvVar = this.g;
                if (gdvVar.a) {
                    return;
                }
                if (gdvVar.b) {
                    this.d.cancel();
                }
                this.a.startAnimation(this.e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Controller must be initialized for a feed before the content pill can be shown.");
    }

    @Override // defpackage.gee
    public final boolean h() {
        TextView textView = this.a;
        return textView != null && (textView.getVisibility() == 0 || this.g.a);
    }
}
