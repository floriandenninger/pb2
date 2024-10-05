package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hzn extends WebChromeClient {
    final /* synthetic */ hzp a;

    public hzn(hzp hzpVar) {
        this.a = hzpVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        this.a.b = bitmap;
    }
}
