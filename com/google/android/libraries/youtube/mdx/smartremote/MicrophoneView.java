package com.google.android.libraries.youtube.mdx.smartremote;

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
import defpackage.adqm;
import defpackage.tjr;
import defpackage.wbs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MicrophoneView extends RelativeLayout {
    public BitmapSoundLevelsView a;
    public ImageView b;
    public int c;
    private FloatingActionButton d;
    private FloatingActionButton e;
    private Animation f;
    private ProgressBar g;
    private int h;
    private int i;

    public MicrophoneView(Context context) {
        super(context);
        d(context);
    }

    private final void d(Context context) {
        this.i = wbs.W(context, R.attr.ytBrandRed).orElse(0);
        this.h = wbs.W(context, R.attr.ytIconActiveOther).orElse(0);
    }

    private static final void e(View view) {
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(218L).start();
    }

    public final void b() {
        this.c = 1;
        a();
    }

    public final void c() {
        if (this.b.getVisibility() == 4) {
            return;
        }
        this.b.setAnimation(this.f);
        this.f.start();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (BitmapSoundLevelsView) findViewById(R.id.sound_levels);
        this.d = (FloatingActionButton) findViewById(R.id.enabled_microphone);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.disabled_microphone);
        this.e = floatingActionButton;
        floatingActionButton.setColorFilter(this.h);
        this.b = (ImageView) findViewById(R.id.pulsing_circle);
        this.g = (ProgressBar) findViewById(R.id.loading_view);
        this.g.setIndeterminateDrawable(new tjr(-1.0f, getContext().getResources().getDimensionPixelSize(R.dimen.buffering_progress_max_thickness), getContext().getResources().getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{this.i}));
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.pulsing_circle_anim);
        this.f = loadAnimation;
        loadAnimation.setAnimationListener(new adqm(this));
    }

    public final void a() {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            this.e.setVisibility(0);
            this.a.setEnabled(true);
            this.a.setVisibility(0);
            this.b.setVisibility(0);
            c();
            e(this.a);
            e(this.e);
            return;
        }
        this.a.setEnabled(false);
        this.a.setVisibility(8);
        this.b.setVisibility(4);
        Animation animation = this.f;
        if (animation != null) {
            animation.cancel();
            this.f.reset();
        }
        this.g.setVisibility(8);
        this.d.setVisibility(4);
        this.e.setVisibility(0);
    }

    public MicrophoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public MicrophoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context);
    }
}
