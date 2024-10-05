package com.google.android.libraries.youtube.ads.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
import defpackage.nhp;
import defpackage.xmo;
import defpackage.xmp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdsInlineWebsite extends WebView {
    public xmp a;

    public AdsInlineWebsite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWebViewClient(new xmo(this));
        getSettings().setJavaScriptEnabled(true);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        xmp xmpVar = this.a;
        if (xmpVar != null && motionEvent.getActionMasked() == 0) {
            nhp nhpVar = (nhp) xmpVar;
            nhpVar.e.a.I(3, nhpVar.g, null);
        }
        if (parent != null) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
