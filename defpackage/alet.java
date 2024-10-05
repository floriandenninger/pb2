package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alet {
    private final aeg a = new aeg();
    private final aeg b = new aeg();

    public static alet a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        alet aletVar = null;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
                if (loadAnimator instanceof AnimatorSet) {
                    aletVar = c(((AnimatorSet) loadAnimator).getChildAnimations());
                } else if (loadAnimator != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(loadAnimator);
                    aletVar = c(arrayList);
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(Integer.toHexString(resourceId));
                Log.w("MotionSpec", valueOf.length() != 0 ? "Can't load animation resource ID #0x".concat(valueOf) : new String("Can't load animation resource ID #0x"), e);
            }
        }
        return aletVar;
    }

    private static alet c(List list) {
        alet aletVar = new alet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                aletVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = aleq.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = aleq.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = aleq.d;
                }
                aleu aleuVar = new aleu(startDelay, duration, interpolator);
                aleuVar.a = objectAnimator.getRepeatCount();
                aleuVar.b = objectAnimator.getRepeatMode();
                aletVar.a.put(propertyName, aleuVar);
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return aletVar;
    }

    public final aleu b(String str) {
        if (this.a.get(str) == null) {
            throw new IllegalArgumentException();
        }
        return (aleu) this.a.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alet) {
            return this.a.equals(((alet) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
