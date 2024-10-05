package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gff extends AnimatorListenerAdapter {
    final /* synthetic */ gfi a;

    public gff(gfi gfiVar) {
        this.a = gfiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        arej arejVar;
        gfi gfiVar = this.a;
        FloatingActionButton floatingActionButton = gfiVar.d;
        Object orElse = Optional.ofNullable(gfiVar.e).map(evy.o).orElse(null);
        gfi gfiVar2 = this.a;
        acra acraVar = gfiVar2.k;
        if (floatingActionButton != null && acraVar != null && gfiVar2.f == null && (orElse instanceof aqeq)) {
            aqeq aqeqVar = (aqeq) orElse;
            if ((aqeqVar.b & 64) != 0) {
                aqep aqepVar = aqeqVar.g;
                if (aqepVar == null) {
                    aqepVar = aqep.a;
                }
                if (aqepVar.b == 102716411) {
                    arejVar = (arej) aqepVar.c;
                } else {
                    arejVar = arej.a;
                }
                this.a.b.b(arejVar, floatingActionButton, orElse, acraVar);
            }
        }
        this.a.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Optional.ofNullable(this.a.d).ifPresent(gfd.e);
    }
}
