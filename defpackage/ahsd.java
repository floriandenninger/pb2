package defpackage;

import android.content.Context;
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
public final class ahsd implements View.OnClickListener {
    public final ViewGroup a;
    public final ahsb b;
    public ahrq c;
    public final Animation d;
    public final Animation e;
    public aigf f;
    private final CreatorEndscreenOverlayPresenter g;
    private final ahsc h;
    private final int i;

    public ahsd(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, ViewGroup viewGroup) {
        context.getClass();
        this.g = creatorEndscreenOverlayPresenter;
        viewGroup.getClass();
        this.a = viewGroup;
        this.h = creatorEndscreenOverlayPresenter;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        ahsb ahsbVar = new ahsb();
        this.b = ahsbVar;
        ahsbVar.a = (FrameLayout) layoutInflater.inflate(R.layout.endscreen_hovercard_layout, (ViewGroup) creatorEndscreenOverlayPresenter.g, false);
        ahsbVar.a.setOnClickListener(this);
        ahsbVar.a.findViewById(R.id.background_tint);
        ahsbVar.b = ahsbVar.a.findViewById(R.id.hovercard_layout);
        ahsbVar.c = ahsbVar.b.findViewById(R.id.hovercard_info_view);
        ahsbVar.c.setOnClickListener(this);
        ahsbVar.d = (ImageView) ahsbVar.a.findViewById(R.id.hovercard_thumbnail);
        ahsbVar.e = (ImageView) ahsbVar.a.findViewById(R.id.hovercard_thumbnail_circular);
        ahsbVar.f = (TextView) ahsbVar.a.findViewById(R.id.hovercard_title);
        ahsbVar.g = (TextView) ahsbVar.a.findViewById(R.id.hovercard_details);
        ahsbVar.h = (TextView) ahsbVar.a.findViewById(R.id.hovercard_watch_button);
        ahsbVar.j = (TextView) ahsbVar.a.findViewById(R.id.hovercard_price_label);
        ahsbVar.k = (TextView) ahsbVar.a.findViewById(R.id.hovercard_additional_fees_label);
        ahsbVar.l = (TextView) ahsbVar.a.findViewById(R.id.hovercard_additional_info_label);
        ahsbVar.i = (TextView) ahsbVar.a.findViewById(R.id.hovercard_cancel_button);
        ahsbVar.h.setOnClickListener(this);
        ahsbVar.i.setOnClickListener(this);
        ahsbVar.m = (FrameLayout) ahsbVar.b.findViewById(R.id.hovercard_subscribe_container);
        this.i = yjk.K(context.getResources().getDisplayMetrics(), 400);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.d = alphaAnimation;
        alphaAnimation.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.e = alphaAnimation2;
        alphaAnimation2.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        alphaAnimation2.setAnimationListener(new ahsa(this));
    }

    public final void a(boolean z) {
        if (!z) {
            b();
            return;
        }
        if (this.b.a != null) {
            if (!this.e.hasStarted() || this.e.hasEnded()) {
                this.b.a.clearAnimation();
                this.d.reset();
                this.b.a.startAnimation(this.e);
            }
        }
    }

    public final void b() {
        FrameLayout frameLayout = this.b.a;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        this.a.removeView(this.b.a);
    }

    public final void c() {
        float f = this.f == aigf.FULLSCREEN ? 0.6f : 0.9f;
        if (this.b.b == null) {
            return;
        }
        yny.z(this.b.b, yny.x(Math.min(this.i, (int) (this.a.getWidth() * f))), ViewGroup.LayoutParams.class);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.hovercard_watch_button || view.getId() == R.id.hovercard_info_view) {
            this.h.n(this.c);
        } else if (view.getId() == R.id.hovercard_cancel_button || view.getId() == R.id.background) {
            this.h.m();
        }
    }
}
