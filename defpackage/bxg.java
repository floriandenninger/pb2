package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxg extends AnimatorListenerAdapter {
    final /* synthetic */ bxj a;

    public bxg(bxj bxjVar) {
        this.a = bxjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bxe) arrayList.get(i)).a();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }
}
