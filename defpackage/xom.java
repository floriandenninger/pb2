package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xom {
    public final shf a;
    public final WeakHashMap b = new WeakHashMap();
    public long c = -1;

    public xom(shf shfVar) {
        this.a = shfVar;
    }

    public static Animator a(View view, long j) {
        View findViewById = view.findViewById(R.id.avatar);
        View findViewById2 = view.findViewById(R.id.comment);
        View findViewById3 = view.findViewById(R.id.metadata);
        View findViewById4 = view.findViewById(R.id.action_bar);
        if (findViewById == null || findViewById2 == null || findViewById3 == null || findViewById4 == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(e(findViewById, 0, j), e(findViewById2, 0, j), e(findViewById3, 1, j), e(findViewById4, 2, j));
        return animatorSet;
    }

    private static Animator d(View view, int i, float f, float f2) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2).setDuration(i);
    }

    private static Animator e(View view, int i, long j) {
        int i2 = i * 75;
        int i3 = i2 + 300;
        int i4 = i3 + 750;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        long j2 = i2;
        if (j < j2) {
            animatorSet.setStartDelay(j2 - j);
        }
        long j3 = i3;
        if (j < j3) {
            float min = (float) Math.min(j3 - j, 300L);
            float f = ((min / 300.0f) * 0.5f) + 0.5f;
            view.setAlpha(f);
            arrayList.add(d(view, (int) min, f, 0.5f));
        }
        long j4 = i4;
        if (j < j4) {
            float min2 = (float) Math.min(j4 - j, 750L);
            float f2 = 1.0f - ((min2 / 750.0f) * 0.5f);
            if (arrayList.isEmpty()) {
                view.setAlpha(f2);
            }
            arrayList.add(d(view, (int) min2, f2, 1.0f));
        }
        if (arrayList.isEmpty()) {
            view.setAlpha(1.0f);
        }
        arrayList.add(d(view, (int) Math.min(2200 - j, 1000L), 1.0f, 1.0f));
        animatorSet.playSequentially(arrayList);
        return animatorSet;
    }

    private static void f(Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }

    public final void b() {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            f((Animator) it.next());
        }
        this.b.clear();
    }

    public final void c(View view) {
        Animator animator = (Animator) this.b.remove(view);
        if (animator != null) {
            f(animator);
        }
    }
}
