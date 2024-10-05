package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uyr {
    public final uyq a;
    public Animator b = new AnimatorSet();

    public uyr(uyq uyqVar) {
        this.a = uyqVar;
    }

    public final void a() {
        if (this.b.isStarted()) {
            this.b.end();
        }
    }
}
