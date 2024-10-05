package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.common.tutorial.ClingView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ClingView a;

    public fwf(ClingView clingView) {
        this.a = clingView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.postInvalidate();
    }
}
