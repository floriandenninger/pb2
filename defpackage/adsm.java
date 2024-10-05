package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adsm extends WebViewClient {
    final /* synthetic */ adso a;

    public adsm(adso adsoVar) {
        this.a = adsoVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.a.c.setVisibility(0);
        this.a.b.setVisibility(8);
        this.a.c.evaluateJavascript("window.consentFlowCompleted = function(approved) { window.approvalJsInterface.consentFlowCompleted(approved); }", null);
        if (str.contains("oauth/consent")) {
            this.a.e.n(new acqx(acsb.c(36385)));
            this.a.e.n(new acqx(acsb.c(36386)));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceResponse.getStatusCode() == 400 && webResourceRequest.getUrl().toString().contains("oauth/consent")) {
            adso adsoVar = this.a;
            adsoVar.c(2, adsoVar.f.qR().getString(R.string.mdx_tv_signin_error_snackbar_message));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
