package com.google.android.libraries.youtube.livecreation.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aclk;
import defpackage.acll;
import defpackage.aclm;
import defpackage.acln;
import defpackage.aclo;
import defpackage.aclp;
import defpackage.aclq;
import defpackage.zev;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WaitingIndicatorView extends RelativeLayout {
    public Circle a;
    public TextView b;
    public aclq c;
    public boolean d;
    public boolean e;
    public int f;
    private AnimatorSet g;
    private CountDownTimer h;
    private boolean i;

    public WaitingIndicatorView(Context context) {
        this(context, null);
    }

    public final void a() {
        c();
        boolean isPowerSaveMode = ((PowerManager) getContext().getSystemService("power")).isPowerSaveMode();
        this.i = isPowerSaveMode;
        if (isPowerSaveMode) {
            return;
        }
        this.g = new AnimatorSet();
        float f = this.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.addUpdateListener(new aclk(this));
        ofFloat.addListener(new acll(this));
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(650L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat2.addUpdateListener(new aclm(this, f));
        ofFloat2.addListener(new acln(this));
        ofFloat2.setDuration(350L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b, "translationY", 50.0f, 0.0f);
        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.b, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(300L);
        this.g.play(ofFloat).before(ofFloat2);
        this.g.play(ofFloat).with(ofFloat3).with(ofFloat4);
        this.g.addListener(new aclo(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(this.g).after(true == zev.e(getContext()) ? 5000L : 300L);
        animatorSet.start();
    }

    public final void b(int i) {
        if (!this.i) {
            this.f = i;
            this.e = true;
            this.d = true;
        } else {
            this.b.setVisibility(0);
            aclp aclpVar = new aclp(this, TimeUnit.SECONDS.toMillis(3L) + 300);
            this.h = aclpVar;
            aclpVar.start();
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.g.end();
            this.g.cancel();
            this.g = null;
        }
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.h = null;
        }
        this.d = false;
        this.e = false;
        this.f = 0;
        this.a.setVisibility(4);
        this.b.setVisibility(4);
        this.b.setText("");
    }

    public WaitingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        LayoutInflater.from(context).inflate(R.layout.lc_waiting_indicator, (ViewGroup) this, true);
        this.a = (Circle) findViewById(R.id.circle);
        this.b = (TextView) findViewById(R.id.digit);
    }
}
