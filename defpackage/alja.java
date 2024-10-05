package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alja extends AnimatorListenerAdapter {
    final /* synthetic */ aljc a;

    public alja(aljc aljcVar) {
        this.a = aljcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        aljc aljcVar = this.a;
        List list = aljcVar.f;
        if (list == null || aljcVar.g) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bxe) it.next()).a();
        }
    }
}
