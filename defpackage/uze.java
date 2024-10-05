package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class uze extends WebViewClient {
    private static final amyi a = amyi.m("SaferWebViewClient");
    private final uzg b;
    private final uzg c;

    public uze(uzg uzgVar, uzg uzgVar2) {
        this.b = uzgVar;
        this.c = uzgVar2;
    }

    private static WebResourceResponse b(boolean z) {
        if (z) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    private static boolean c(WebView webView, boolean z, boolean z2) {
        if (z2) {
            return true;
        }
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    private final boolean d(Uri uri) {
        boolean z = true;
        if (!uzf.a.matcher(uri.toString()).find() && !this.c.c(uri)) {
            z = false;
        }
        if (!z) {
            ((amyf) a.k().i("com/google/android/libraries/saferwebview/SaferWebViewClient", "isResourceAllowlisted", 273, "SaferWebViewClient.java")).s("Uri '%s' is not allowed as resource", uzf.b(uri));
        }
        return z;
    }

    @Deprecated
    public boolean a(String str) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return b(d(webResourceRequest.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean a2;
        boolean c = this.b.c(webResourceRequest.getUrl());
        if (c) {
            webResourceRequest.getUrl().toString();
            a2 = false;
        } else {
            a2 = a(webResourceRequest.getUrl().toString());
        }
        return c(webView, c, a2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return b(d(Uri.parse(str)));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean c = this.b.c(Uri.parse(str));
        return c(webView, c, c ? false : a(str));
    }
}
