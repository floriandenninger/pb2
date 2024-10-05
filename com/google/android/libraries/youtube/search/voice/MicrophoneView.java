package com.google.android.libraries.youtube.search.voice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;
import defpackage.akft;
import defpackage.akfu;
import defpackage.amkq;
import defpackage.tjr;
import defpackage.wbs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MicrophoneView extends RelativeLayout {
    public ImageView a;
    public int b;
    private BitmapSoundLevelsView c;
    private FloatingActionButton d;
    private FloatingActionButton e;
    private Animation f;
    private ProgressBar g;
    private int h;
    private int i;

    public MicrophoneView(Context context) {
        super(context);
        h(context);
    }

    private final void h(Context context) {
        this.i = wbs.W(context, R.attr.ytBrandRed).orElse(0);
        this.h = wbs.W(context, R.attr.ytIconActiveOther).orElse(0);
    }

    private static final void i(View view, int i) {
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(i).start();
    }

    public final void b(int i) {
        amkq.E(i <= 100);
        BitmapSoundLevelsView bitmapSoundLevelsView = this.c;
        amkq.E(i <= 100);
        bitmapSoundLevelsView.a = i;
    }

    public final void c() {
        this.b = 2;
        a();
    }

    public final void d() {
        this.b = 1;
        a();
    }

    public final void e() {
        this.b = 4;
        a();
    }

    public final void f() {
        this.b = 3;
        a();
    }

    public final void g() {
        if (this.a.getVisibility() == 4) {
            return;
        }
        this.a.setAnimation(this.f);
        this.f.start();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (BitmapSoundLevelsView) findViewById(R.id.sound_levels);
        this.d = (FloatingActionButton) findViewById(R.id.enabled_microphone);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.disabled_microphone);
        this.e = floatingActionButton;
        floatingActionButton.setColorFilter(this.h);
        this.a = (ImageView) findViewById(R.id.pulsing_circle);
        this.g = (ProgressBar) findViewById(R.id.loading_view);
        this.g.setIndeterminateDrawable(new tjr(-1.0f, getContext().getResources().getDimensionPixelSize(R.dimen.buffering_progress_max_thickness), getContext().getResources().getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{this.i}));
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.pulsing_circle_anim_search);
        this.f = loadAnimation;
        loadAnimation.setAnimationListener(new akft(this));
    }

    final void a() {
        int i = this.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.c.setEnabled(false);
            this.c.setVisibility(8);
            this.a.setVisibility(4);
            Animation animation = this.f;
            if (animation != null) {
                animation.cancel();
                this.f.reset();
            }
            this.g.setVisibility(8);
            this.d.setVisibility(8);
            this.e.animate().alpha(1.0f).setListener(null).start();
            this.e.setVisibility(0);
            return;
        }
        if (i2 == 1) {
            this.e.setVisibility(0);
            this.c.setEnabled(true);
            this.c.setVisibility(0);
            this.a.setVisibility(0);
            g();
            i(this.c, 218);
            i(this.e, 218);
            return;
        }
        if (i2 == 2) {
            this.e.setVisibility(0);
            this.c.setEnabled(true);
            this.c.setVisibility(0);
            this.a.setVisibility(0);
            g();
            this.d.setVisibility(0);
            FloatingActionButton floatingActionButton = this.e;
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.animate().alpha(0.0f).setDuration(536L).setListener(new akfu(floatingActionButton));
            i(this.d, 536);
            return;
        }
        if (i2 != 3) {
            return;
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.c.setEnabled(false);
        this.c.setVisibility(4);
        this.a.setVisibility(4);
        Animation animation2 = this.f;
        if (animation2 != null) {
            animation2.cancel();
            this.f.reset();
        }
        this.g.setVisibility(0);
    }

    public MicrophoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context);
    }

    public MicrophoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(context);
    }
}
