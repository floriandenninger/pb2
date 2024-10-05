package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmq extends WebViewClient {
    final /* synthetic */ AdsWebView a;

    public xmq(AdsWebView adsWebView) {
        this.a = adsWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        xmr xmrVar = this.a.a;
        if (xmrVar != null) {
            nhu nhuVar = (nhu) xmrVar;
            nhuVar.e();
            nhuVar.a.a();
            if (nhuVar.b.j()) {
                if (!nhuVar.g) {
                    if (nhuVar.h) {
                        if (nhuVar.e != null && nhuVar.d != null) {
                            ashg ashgVar = ashg.a;
                            aone createBuilder = asht.a.createBuilder();
                            createBuilder.copyOnWrite();
                            asht ashtVar = (asht) createBuilder.instance;
                            ashgVar.getClass();
                            ashtVar.p = ashgVar;
                            ashtVar.b |= 1073741824;
                            asht ashtVar2 = (asht) createBuilder.build();
                            apbu apbuVar = nhuVar.e;
                            if ((apbuVar.b & 64) != 0) {
                                nhuVar.d.I(3, new acqx(apbuVar.h), ashtVar2);
                            }
                        }
                        nhuVar.h = false;
                        return;
                    }
                    return;
                }
                int c = (int) (nhuVar.c.c() - nhuVar.f);
                if (nhuVar.e != null && nhuVar.d != null) {
                    aone createBuilder2 = ashg.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    ashg ashgVar2 = (ashg) createBuilder2.instance;
                    ashgVar2.b |= 1;
                    ashgVar2.c = c;
                    ashg ashgVar3 = (ashg) createBuilder2.build();
                    aone createBuilder3 = asht.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    asht ashtVar3 = (asht) createBuilder3.instance;
                    ashgVar3.getClass();
                    ashtVar3.p = ashgVar3;
                    ashtVar3.b |= 1073741824;
                    nhuVar.d.u(new acqx(nhuVar.e.h), (asht) createBuilder3.build());
                }
                nhuVar.g = false;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        xmr xmrVar = this.a.a;
        if (xmrVar != null) {
            nhu nhuVar = (nhu) xmrVar;
            nhuVar.f = nhuVar.c.c();
            nhuVar.a.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
