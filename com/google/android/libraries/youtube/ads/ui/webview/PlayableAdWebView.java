package com.google.android.libraries.youtube.ads.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayableAdWebView extends WebView {
    public View.OnTouchListener a;

    public PlayableAdWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.a = null;
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.a;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        if (getParent() != null) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
