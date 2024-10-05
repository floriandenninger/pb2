package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfw implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cfz a;

    public cfw(cfz cfzVar) {
        this.a = cfzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        cfz cfzVar = this.a;
        cjq cjqVar = cfzVar.k;
        if (cjqVar != null) {
            cjqVar.l(cfzVar.b.c());
        }
    }
}
