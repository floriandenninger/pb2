package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vag implements vap {
    final /* synthetic */ ExpandingScrollView a;
    private final /* synthetic */ int b;

    public vag(ExpandingScrollView expandingScrollView, int i) {
        this.b = i;
        this.a = expandingScrollView;
    }

    @Override // defpackage.vap
    public final void a(MotionEvent motionEvent) {
        if (this.b == 0) {
            View view = this.a.i;
            if (view != null) {
                view.dispatchTouchEvent(motionEvent);
                return;
            }
            return;
        }
        ExpandingScrollView.j(this.a, motionEvent);
    }
}
