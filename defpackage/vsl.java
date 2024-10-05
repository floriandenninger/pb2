package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsl extends AnimatorListenerAdapter {
    final /* synthetic */ vsm a;
    private final vsi b;

    public vsl(vsm vsmVar, vsi vsiVar) {
        this.a = vsmVar;
        this.b = vsiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vsm vsmVar = this.a;
        vsmVar.d = this.b;
        vsmVar.e = null;
        Iterator it = vsmVar.f.iterator();
        while (it.hasNext()) {
            ((vsj) it.next()).H();
        }
    }
}
