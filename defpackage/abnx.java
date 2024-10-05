package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abnx extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ abnz b;

    public abnx(abnz abnzVar, boolean z) {
        this.b = abnzVar;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.g.setVisibility(8);
        if (this.a) {
            this.b.f.removeAllViews();
            abnz abnzVar = this.b;
            abnzVar.p = false;
            abgh abghVar = abnzVar.l;
            if (abghVar != null) {
                abhf abhfVar = (abhf) abghVar;
                asot asotVar = abhfVar.d;
                if (asotVar != null) {
                    abhfVar.c(asotVar.c);
                }
                abgh abghVar2 = abhfVar.c;
                if (abghVar2 != null) {
                    ntb ntbVar = (ntb) abghVar2;
                    ntbVar.k = false;
                    ntbVar.i();
                }
            }
            abnz abnzVar2 = this.b;
            if (abnzVar2.r) {
                return;
            }
            abnzVar2.k.a(abnzVar2);
        }
    }
}
