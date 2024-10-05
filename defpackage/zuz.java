package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zuz extends AnimatorListenerAdapter {
    final /* synthetic */ ChooseFilterView a;

    public zuz(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zvk zvkVar = this.a.a;
        View c = zvkVar.c(zvkVar.c);
        if (c != null) {
            c.sendAccessibilityEvent(8);
        }
    }
}
