package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zf extends zl {
    final /* synthetic */ int a;
    final /* synthetic */ wv b;
    final /* synthetic */ zn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(zn znVar, wv wvVar, int i, float f, float f2, float f3, float f4, int i2, wv wvVar2) {
        super(wvVar, i, f, f2, f3, f4);
        this.c = znVar;
        this.a = i2;
        this.b = wvVar2;
    }

    @Override // defpackage.zl, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        if (this.a <= 0) {
            zn znVar = this.c;
            znVar.j.f(znVar.m, this.b);
        } else {
            this.c.a.add(this.b.a);
            this.k = true;
            if (this.a > 0) {
                zn znVar2 = this.c;
                znVar2.m.post(new zg(znVar2, this));
            }
        }
        zn znVar3 = this.c;
        View view = znVar3.p;
        View view2 = this.b.a;
        if (view == view2) {
            znVar3.m(view2);
        }
    }
}
