package defpackage;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yho extends WebChromeClient {
    protected mi a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!z2 && !z) {
            return false;
        }
        mh mhVar = new mh(webView.getContext());
        yhl yhlVar = new yhl(webView.getContext());
        yhlVar.getSettings().setJavaScriptEnabled(true);
        yhlVar.setWebChromeClient(new yhm(this));
        yhlVar.setWebViewClient(new yhn(this));
        mhVar.p(yhlVar);
        ((WebView.WebViewTransport) message.obj).setWebView(yhlVar);
        message.sendToTarget();
        this.a = mhVar.b();
        return true;
    }
}
