package com.google.android.libraries.youtube.ads.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.nhu;
import defpackage.xmq;
import defpackage.xmr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdsWebView extends WebView {
    public xmr a;
    private WebViewClient b;

    public AdsWebView(Context context) {
        super(context);
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View a(ViewParent viewParent) {
        if (viewParent == 0) {
            return null;
        }
        if (viewParent instanceof View) {
            View view = (View) viewParent;
            String resourceName = view.getId() != -1 ? view.getResources().getResourceName(view.getId()) : null;
            if (resourceName != null && resourceName.endsWith(":id/panel_content")) {
                return view;
            }
        }
        return a(viewParent.getParent());
    }

    private final void b() {
        xmq xmqVar = new xmq(this);
        this.b = xmqVar;
        setWebViewClient(xmqVar);
        setScrollBarStyle(33554432);
        setScrollbarFadingEnabled(false);
        getSettings().setJavaScriptEnabled(true);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        super.destroy();
        this.a = null;
    }

    @Override // android.webkit.WebView
    public final WebViewClient getWebViewClient() {
        return this.b;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View a = a(getParent());
        if (a != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = a.getHeight();
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        performClick();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        xmr xmrVar = this.a;
        if (xmrVar != null) {
            ((nhu) xmrVar).h = true;
        }
        return super.performClick();
    }

    public AdsWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public AdsWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public AdsWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }

    public AdsWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        b();
    }
}
