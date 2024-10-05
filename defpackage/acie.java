package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acie implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;

    public acie(View view) {
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        yny.z(this.a, yny.l(acif.a), ahh.class);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
