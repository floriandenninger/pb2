package defpackage;

import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class umv extends WebViewClient {
    final /* synthetic */ umw a;

    public umv(umw umwVar) {
        this.a = umwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(android.net.Uri r9) {
        /*
            r8 = this;
            umw r0 = r8.a
            java.lang.String r0 = r0.b
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r9.getScheme()
            java.lang.String r2 = r0.getScheme()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto Lb5
            java.lang.String r1 = r9.getHost()
            java.lang.String r3 = r0.getHost()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb5
            java.lang.String r1 = r9.getPath()
            java.lang.String r0 = r0.getPath()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb5
            umx r0 = com.google.android.libraries.parenttools.youtube.ParentToolsResult.c()
            java.util.Set r1 = r9.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto Lab
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "EXIT_STATUS"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L3f
            java.lang.String r3 = r9.getQueryParameter(r3)     // Catch: java.lang.IllegalArgumentException -> L9f
            int r5 = r3.hashCode()     // Catch: java.lang.IllegalArgumentException -> L9f
            r6 = -1848781195(0xffffffff91cdd675, float:-3.2475466E-28)
            r7 = 2
            if (r5 == r6) goto L81
            r6 = -1715644859(0xffffffff99bd5645, float:-1.9576986E-23)
            if (r5 == r6) goto L77
            r6 = -889497983(0xffffffffcafb5681, float:-8235840.5)
            if (r5 == r6) goto L6d
            goto L8b
        L6d:
            java.lang.String r5 = "PARENT_TOOLS_EXIT_STATUS_ONBOARDED"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8b
            r3 = 2
            goto L8c
        L77:
            java.lang.String r5 = "PARENT_TOOLS_EXIT_STATUS_UNKNOWN"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8b
            r3 = 0
            goto L8c
        L81:
            java.lang.String r5 = "PARENT_TOOLS_EXIT_STATUS_NOT_ONBOARDED"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8b
            r3 = 1
            goto L8c
        L8b:
            r3 = -1
        L8c:
            if (r3 == 0) goto L9a
            if (r3 == r4) goto L9b
            if (r3 != r7) goto L94
            r7 = 3
            goto L9b
        L94:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9f
            r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L9f
            throw r3     // Catch: java.lang.IllegalArgumentException -> L9f
        L9a:
            r7 = 1
        L9b:
            r0.b(r7)     // Catch: java.lang.IllegalArgumentException -> L9f
            goto L3f
        L9f:
            r3 = move-exception
            java.lang.String r5 = "ParentToolsFragment"
            java.lang.String r6 = "EXIT_STATUS parameter value was not a valid enum name!"
            android.util.Log.e(r5, r6, r3)
            r0.b(r4)
            goto L3f
        Lab:
            com.google.android.libraries.parenttools.youtube.ParentToolsResult r9 = r0.a()
            umw r0 = r8.a
            r0.o(r9, r4)
            return r4
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umv.a(android.net.Uri):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        umw umwVar = this.a;
        umwVar.d.setVisibility(8);
        umwVar.c.setVisibility(0);
        ums umsVar = (ums) umwVar.C();
        if (umsVar != null) {
            umsVar.b();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Log.e("ParentToolsFragment", String.format("Error reported from web, error code=%d, description=%s, url=%s", Integer.valueOf(i), str, str2));
        if (i != -1) {
            this.a.a();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Log.e("ParentToolsFragment", String.format("HTTP error reported from web, status code=%d, url=%s", Integer.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl()));
        this.a.d(String.valueOf(webResourceResponse.getStatusCode()));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Log.e("ParentToolsFragment", String.format("SSL error reported from web, url=%s", sslError.getUrl()));
        this.a.a();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Log.e("ParentToolsFragment", String.format("Error reported from web, error code=%d, description=%s, url=%s", Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription(), webResourceRequest.getUrl()));
        if (webResourceError.getErrorCode() != -1) {
            this.a.a();
        }
    }
}
