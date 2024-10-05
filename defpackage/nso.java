package defpackage;

import android.view.animation.Animation;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nso implements Animation.AnimationListener {
    final /* synthetic */ nsp a;

    public nso(nsp nspVar) {
        this.a = nspVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        TextView textView = this.a.f;
        if (textView == null) {
            return;
        }
        textView.post(new Runnable() { // from class: nsn
            @Override // java.lang.Runnable
            public final void run() {
                nso.this.a.m(false);
            }
        });
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
