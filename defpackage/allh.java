package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class allh implements Runnable {
    final /* synthetic */ allk a;
    private final /* synthetic */ int b;

    public allh(allk allkVar, int i) {
        this.b = i;
        this.a = allkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        if (this.b != 0) {
            allk allkVar = this.a;
            if (allkVar.f == null || (context = allkVar.e) == null) {
                return;
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            allk allkVar2 = this.a;
            int[] iArr = new int[2];
            allkVar2.f.getLocationOnScreen(iArr);
            int height = (i - (iArr[1] + allkVar2.f.getHeight())) + ((int) this.a.f.getTranslationY());
            allk allkVar3 = this.a;
            if (height < allkVar3.l) {
                ViewGroup.LayoutParams layoutParams = allkVar3.f.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(allk.c, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.a.l - height;
                this.a.f.requestLayout();
                return;
            }
            return;
        }
        allj alljVar = this.a.f;
        if (alljVar == null) {
            return;
        }
        if (alljVar.getParent() != null) {
            this.a.f.setVisibility(0);
        }
        allk allkVar4 = this.a;
        if (allkVar4.f.a != 1) {
            int b = allkVar4.b();
            allkVar4.f.setTranslationY(b);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(b, 0);
            valueAnimator.setInterpolator(aleq.b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new alla(allkVar4));
            valueAnimator.addUpdateListener(new alkz(allkVar4, 2));
            valueAnimator.start();
            return;
        }
        ValueAnimator c = allkVar4.c(0.0f, 1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(aleq.d);
        ofFloat.addUpdateListener(new alkz(allkVar4, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(c, ofFloat);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new alkx(allkVar4));
        animatorSet.start();
    }
}
