package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqr {
    public final mqn a;
    public final ViewSwitcher b;
    public final ViewSwitcher c;
    public final Handler d = new Handler();
    public final Runnable e = new Runnable() { // from class: mqo
        @Override // java.lang.Runnable
        public final void run() {
            mqr mqrVar = mqr.this;
            mqrVar.h = true;
            if (mqrVar.b.getDisplayedChild() == 1) {
                ViewSwitcher viewSwitcher = mqrVar.b;
                mqn mqnVar = mqrVar.a;
                viewSwitcher.setInAnimation(mqnVar.a(0.0f, 1.0f, mqnVar.c, R.interpolator.mtrl_fast_out_linear_in));
                mqn mqnVar2 = mqrVar.a;
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.setStartOffset(250L);
                animationSet.addAnimation(mqnVar2.a(0.0f, 1.0f, mqnVar2.d, R.interpolator.mtrl_linear_out_slow_in));
                animationSet.addAnimation(mqnVar2.b(mqnVar2.b, 0, mqnVar2.d, R.interpolator.mtrl_linear_out_slow_in));
                mqq mqqVar = mqrVar.g;
                if (mqqVar != null) {
                    animationSet.setAnimationListener(new mqp(mqqVar, mqrVar.i));
                }
                mqrVar.c.setInAnimation(animationSet);
                ViewSwitcher viewSwitcher2 = mqrVar.b;
                mqn mqnVar3 = mqrVar.a;
                viewSwitcher2.setOutAnimation(mqnVar3.a(1.0f, 0.0f, mqnVar3.c, R.interpolator.mtrl_fast_out_linear_in));
                ViewSwitcher viewSwitcher3 = mqrVar.c;
                mqn mqnVar4 = mqrVar.a;
                AnimationSet animationSet2 = new AnimationSet(true);
                animationSet2.setStartOffset(50L);
                animationSet2.addAnimation(mqnVar4.a(1.0f, 0.0f, mqnVar4.d, R.interpolator.mtrl_fast_out_linear_in));
                animationSet2.addAnimation(mqnVar4.b(0, -mqnVar4.a, mqnVar4.d, R.interpolator.mtrl_fast_out_linear_in));
                viewSwitcher3.setOutAnimation(animationSet2);
            } else if (mqrVar.b.getDisplayedChild() == 0) {
                ViewSwitcher viewSwitcher4 = mqrVar.b;
                mqn mqnVar5 = mqrVar.a;
                viewSwitcher4.setInAnimation(mqnVar5.a(0.0f, 1.0f, mqnVar5.c, R.interpolator.mtrl_fast_out_linear_in));
                mqn mqnVar6 = mqrVar.a;
                AnimationSet animationSet3 = new AnimationSet(true);
                animationSet3.setStartOffset(200L);
                animationSet3.addAnimation(mqnVar6.a(0.0f, 1.0f, mqnVar6.d, R.interpolator.mtrl_linear_out_slow_in));
                animationSet3.addAnimation(mqnVar6.b(-mqnVar6.b, 0, mqnVar6.d, R.interpolator.mtrl_linear_out_slow_in));
                mqq mqqVar2 = mqrVar.g;
                if (mqqVar2 != null) {
                    animationSet3.setAnimationListener(new mqp(mqqVar2, mqrVar.i));
                }
                mqrVar.c.setInAnimation(animationSet3);
                ViewSwitcher viewSwitcher5 = mqrVar.b;
                mqn mqnVar7 = mqrVar.a;
                viewSwitcher5.setOutAnimation(mqnVar7.a(1.0f, 0.0f, mqnVar7.c, R.interpolator.mtrl_fast_out_linear_in));
                ViewSwitcher viewSwitcher6 = mqrVar.c;
                mqn mqnVar8 = mqrVar.a;
                AnimationSet animationSet4 = new AnimationSet(true);
                animationSet4.addAnimation(mqnVar8.a(1.0f, 0.0f, mqnVar8.d, R.interpolator.mtrl_fast_out_linear_in));
                animationSet4.addAnimation(mqnVar8.b(0, mqnVar8.a, mqnVar8.d, R.interpolator.mtrl_fast_out_linear_in));
                viewSwitcher6.setOutAnimation(animationSet4);
            } else {
                String.format(Locale.US, "Error displaying illegal view %d", Integer.valueOf(mqrVar.b.getDisplayedChild()));
            }
            mqrVar.b.showNext();
            mqrVar.c.showNext();
            if (mqrVar.i) {
                mqrVar.d.postDelayed(mqrVar.e, mqrVar.f);
            }
        }
    };
    public final int f;
    public final mqq g;
    public boolean h;
    public boolean i;
    private final ajjz j;
    private final ImageView k;
    private final TextView l;
    private aqta m;

    public mqr(Context context, ajjz ajjzVar, ViewSwitcher viewSwitcher, ViewSwitcher viewSwitcher2, ImageView imageView, TextView textView, mqq mqqVar) {
        this.j = ajjzVar;
        this.b = viewSwitcher;
        this.c = viewSwitcher2;
        this.k = imageView;
        this.l = textView;
        this.a = new mqn(context);
        this.g = mqqVar;
        this.f = context.getResources().getInteger(R.integer.endorsement_swap_period_ms);
    }

    public final void a() {
        this.d.removeCallbacks(this.e);
    }

    public final void b() {
        this.i = false;
        if (this.m != null) {
            this.h = false;
            this.d.removeCallbacks(this.e);
            if (this.b.getDisplayedChild() == 0) {
                this.d.post(this.e);
            }
        }
    }

    public final void c() {
        this.i = true;
        if (this.m == null || this.h) {
            return;
        }
        this.h = true;
        this.d.post(this.e);
    }

    public final void d() {
        this.b.setDisplayedChild(1);
        this.c.setDisplayedChild(1);
    }

    public final void e(aqta aqtaVar) {
        this.m = aqtaVar;
        if (aqtaVar == null) {
            d();
            return;
        }
        ajjz ajjzVar = this.j;
        ImageView imageView = this.k;
        avgg avggVar = aqtaVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, this.j.c());
        TextView textView = this.l;
        aqyg aqygVar = aqtaVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        this.b.setInAnimation(null);
        this.b.setOutAnimation(null);
        this.c.setInAnimation(null);
        this.c.setOutAnimation(null);
        this.b.setDisplayedChild(1);
        this.c.setDisplayedChild(1);
        this.h = false;
    }
}
