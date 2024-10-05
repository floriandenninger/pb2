package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import j$.time.Duration;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aicr {
    public AnimatorSet a;
    private final Duration b;
    private final amru c;
    private final amru d;
    private final Animator.AnimatorListener e;

    public aicr() {
    }

    public aicr(Duration duration, amru amruVar, amru amruVar2, Animator.AnimatorListener animatorListener) {
        this.b = duration;
        this.c = amruVar;
        this.d = amruVar2;
        this.e = animatorListener;
    }

    public static aicq a() {
        aicq aicqVar = new aicq();
        aicqVar.c(Duration.ofMillis(200L));
        return aicqVar;
    }

    public final void b() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet == null) {
            return;
        }
        animatorSet.end();
    }

    public final void c() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet == null) {
            this.a = new AnimatorSet();
            ArrayList arrayList = new ArrayList(this.c.size());
            Duration duration = Duration.ZERO;
            amru amruVar = this.c;
            int size = amruVar.size();
            for (int i = 0; i < size; i++) {
                View view = (View) amruVar.get(i);
                ArrayList arrayList2 = new ArrayList(this.d.size());
                amru amruVar2 = this.d;
                int size2 = amruVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aicp aicpVar = (aicp) amruVar2.get(i2);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", aicpVar.a, aicpVar.b);
                    ofFloat.setDuration(aicpVar.c.toMillis());
                    arrayList2.add(ofFloat);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(arrayList2);
                animatorSet2.setStartDelay(duration.toMillis());
                arrayList.add(animatorSet2);
                duration = duration.plus(this.b);
            }
            if (this.e != null) {
                ((Animator) arrayList.get(0)).addListener(this.e);
            }
            this.a.playTogether(arrayList);
        } else if (animatorSet.isStarted()) {
            return;
        }
        amru amruVar3 = this.c;
        int size3 = amruVar3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            View view2 = (View) amruVar3.get(i3);
            view2.setVisibility(0);
            view2.setAlpha(this.d.isEmpty() ? 0.0f : ((aicp) this.d.get(0)).a);
        }
        this.a.start();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aicr) {
            aicr aicrVar = (aicr) obj;
            if (this.b.equals(aicrVar.b) && amkq.aV(this.c, aicrVar.c) && amkq.aV(this.d, aicrVar.d)) {
                Animator.AnimatorListener animatorListener = this.e;
                Animator.AnimatorListener animatorListener2 = aicrVar.e;
                if (animatorListener != null ? animatorListener.equals(animatorListener2) : animatorListener2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Animator.AnimatorListener animatorListener = this.e;
        return hashCode ^ (animatorListener == null ? 0 : animatorListener.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 109 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SequentialAlphaAnimationHelper{delayBetweenAnimationsInSequence=");
        sb.append(valueOf);
        sb.append(", views=");
        sb.append(valueOf2);
        sb.append(", animationSteps=");
        sb.append(valueOf3);
        sb.append(", animatorListener=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
