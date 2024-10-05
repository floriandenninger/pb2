package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hzm extends WebViewClient {
    final /* synthetic */ hzp a;

    public hzm(hzp hzpVar) {
        this.a = hzpVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.a.a = webView.getTitle();
    }
}
