package defpackage;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class umu extends WebChromeClient {
    final /* synthetic */ umw a;

    public umu(umw umwVar) {
        this.a = umwVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (z) {
            return false;
        }
        WebView webView2 = new WebView(this.a.qR());
        webView.addView(webView2);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        webView2.setWebViewClient(new umt(this));
        return true;
    }
}
