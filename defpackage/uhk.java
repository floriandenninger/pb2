package defpackage;

import android.animation.AnimatorSet;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uhk implements Runnable {
    public final /* synthetic */ ExpressSignInLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ uhk(ExpressSignInLayout expressSignInLayout, int i) {
        this.b = i;
        this.a = expressSignInLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ExpressSignInLayout expressSignInLayout = this.a;
            AnimatorSet animatorSet = expressSignInLayout.q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            expressSignInLayout.g(true);
            return;
        }
        this.a.j(false);
    }
}
