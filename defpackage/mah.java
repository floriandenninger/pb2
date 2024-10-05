package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mah implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ mai b;

    public mah(mai maiVar, ViewTreeObserver viewTreeObserver) {
        this.b = maiVar;
        this.a = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.removeOnGlobalLayoutListener(this);
        this.b.l();
    }
}
