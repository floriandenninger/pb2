package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gpn extends WebViewClient {
    private final gps a;
    private final FrameLayout b;
    private final WebView c;

    public gpn(gps gpsVar, FrameLayout frameLayout, WebView webView) {
        this.a = gpsVar;
        this.b = frameLayout;
        this.c = webView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.a.c(webView, str);
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }
}
