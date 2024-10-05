package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yhn extends WebViewClient {
    final /* synthetic */ yho a;

    public yhn(yho yhoVar) {
        this.a = yhoVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        mi miVar;
        super.onPageFinished(webView, str);
        if (str.equals("about:blank") || (miVar = this.a.a) == null || miVar.isShowing()) {
            return;
        }
        this.a.a.show();
    }
}
