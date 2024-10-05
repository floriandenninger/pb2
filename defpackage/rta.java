package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rta extends WebViewClient {
    final /* synthetic */ rtb a;

    public rta(rtb rtbVar) {
        this.a = rtbVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.d(str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String uri = webResourceRequest.getUrl().toString();
        if (rtb.c.matcher(uri).matches()) {
            return;
        }
        this.a.n(uri);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.a.d(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null || rtb.c.matcher(str).matches()) {
            return null;
        }
        amxd listIterator = rtb.b.listIterator();
        while (listIterator.hasNext()) {
            if (str.startsWith((String) listIterator.next())) {
                return null;
            }
        }
        return new WebResourceResponse("text/plain", "UTF-8", null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        amxd listIterator = rtb.a.listIterator();
        while (listIterator.hasNext()) {
            if (str.startsWith((String) listIterator.next())) {
                return false;
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.a.ao(intent);
        return true;
    }
}
