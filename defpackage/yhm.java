package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yhm extends WebChromeClient {
    final /* synthetic */ yho a;

    public yhm(yho yhoVar) {
        this.a = yhoVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        mi miVar = this.a.a;
        if (miVar != null) {
            miVar.dismiss();
        }
    }
}
