package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lhk implements Runnable {
    public final /* synthetic */ lho a;
    private final /* synthetic */ int b;

    public /* synthetic */ lhk(lho lhoVar, int i) {
        this.b = i;
        this.a = lhoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.c();
            return;
        }
        if (i == 1) {
            this.a.d();
            return;
        }
        if (i == 2) {
            lho lhoVar = this.a;
            lhoVar.e();
            lhoVar.l.removeView(lhoVar.m);
            lhoVar.o = 0;
            return;
        }
        lho lhoVar2 = this.a;
        SlimStatusBar slimStatusBar = lhoVar2.m;
        int i2 = lhoVar2.b;
        int i3 = lhoVar2.c;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator G = mcy.G(slimStatusBar, i2, i3, 400L);
        Animator G2 = mcy.G(slimStatusBar, i3, i2, 400L);
        G2.setStartDelay(200L);
        animatorSet.playSequentially(G, G2);
        lhoVar2.k = animatorSet;
        lhoVar2.k.start();
    }
}
