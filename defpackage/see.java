package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class see extends WebView {
    public see(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
