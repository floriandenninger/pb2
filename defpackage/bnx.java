package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bnx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;
    final /* synthetic */ bof c;

    public bnx(bof bofVar, Map map, Map map2) {
        this.c = bofVar;
        this.a = map;
        this.b = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boj bojVar;
        int i;
        bpv bpvVar;
        this.c.o.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        bof bofVar = this.c;
        Map map = this.a;
        Map map2 = this.b;
        Set set = bofVar.r;
        if (set == null || bofVar.s == null) {
            return;
        }
        int size = set.size() - bofVar.s.size();
        int i2 = 0;
        bny bnyVar = new bny(bofVar, 0);
        int firstVisiblePosition = bofVar.o.getFirstVisiblePosition();
        boolean z = true;
        boolean z2 = false;
        while (i2 < bofVar.o.getChildCount()) {
            View childAt = bofVar.o.getChildAt(i2);
            bpv bpvVar2 = (bpv) bofVar.p.getItem(firstVisiblePosition + i2);
            Rect rect = (Rect) map.get(bpvVar2);
            int top = childAt.getTop();
            if (rect != null) {
                i = rect.top;
            } else {
                i = (bofVar.y * size) + top;
            }
            AnimationSet animationSet = new AnimationSet(z);
            Set set2 = bofVar.r;
            if (set2 == null || !set2.contains(bpvVar2)) {
                bpvVar = bpvVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                bpvVar = bpvVar2;
                alphaAnimation.setDuration(bofVar.S);
                animationSet.addAnimation(alphaAnimation);
                i = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i - top, 0.0f);
            translateAnimation.setDuration(bofVar.R);
            animationSet.addAnimation(translateAnimation);
            z = true;
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(bofVar.U);
            if (!z2) {
                animationSet.setAnimationListener(bnyVar);
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            bpv bpvVar3 = bpvVar;
            map.remove(bpvVar3);
            map2.remove(bpvVar3);
            i2++;
            z2 = true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            bpv bpvVar4 = (bpv) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(bpvVar4);
            if (bofVar.s.contains(bpvVar4)) {
                bojVar = new boj(bitmapDrawable, rect2);
                bojVar.h = 1.0f;
                bojVar.i = 0.0f;
                bojVar.e = bofVar.T;
                bojVar.d = bofVar.U;
            } else {
                int i3 = bofVar.y;
                boj bojVar2 = new boj(bitmapDrawable, rect2);
                bojVar2.g = i3 * size;
                bojVar2.e = bofVar.R;
                bojVar2.d = bofVar.U;
                bojVar2.m = new bnr(bofVar, bpvVar4);
                bofVar.t.add(bpvVar4);
                bojVar = bojVar2;
            }
            bofVar.o.a.add(bojVar);
        }
    }
}
