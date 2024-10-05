package defpackage;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class umt extends WebViewClient {
    final /* synthetic */ umu a;

    public umt(umu umuVar) {
        this.a = umuVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.a.a.ao(new Intent("android.intent.action.VIEW").setData(webResourceRequest.getUrl()));
        return true;
    }
}
