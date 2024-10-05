package defpackage;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yhp extends WebViewClient {
    private static final String b = "yhp";
    public final List a = new ArrayList();

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        for (yhr yhrVar : this.a) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "onPageCommitVisible: ".concat(valueOf);
            }
            if (!yhrVar.a && yhrVar.f) {
                yhrVar.b.a();
            }
            if (((Boolean) yhrVar.e.get()).booleanValue() && yhrVar.f) {
                yhrVar.d.c("stcw_fv");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        for (yhr yhrVar : this.a) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "onPageFinished: ".concat(valueOf);
            }
            if (!yhrVar.a) {
                yhrVar.b.a();
            }
            if (((Boolean) yhrVar.e.get()).booleanValue()) {
                if (!yhrVar.f) {
                    yhrVar.d.c("stcw_fv");
                }
                yhrVar.d.c("stcw_ld");
                yhrVar.e.set(false);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        for (yhr yhrVar : this.a) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "onPageStarted: ".concat(valueOf);
            }
            if (!yhrVar.a) {
                yhrVar.b.c();
            }
            if (str.equals(yhrVar.c)) {
                yhrVar.d.c("stcw_as");
                yhrVar.e.set(true);
            } else {
                yhrVar.e.set(false);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!renderProcessGoneDetail.didCrash()) {
            String str = b;
            String url = webView.getUrl();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61 + String.valueOf(url).length());
            sb.append("customWebView::");
            sb.append(str);
            sb.append(" WebView crashed due to out of memory on URL: ");
            sb.append(url);
            afsi.b(1, 11, sb.toString());
        } else {
            String str2 = b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 54);
            sb2.append("customWebView::");
            sb2.append(str2);
            sb2.append(" WebView crashed due to internal error.");
            afsi.b(1, 11, sb2.toString());
        }
        for (yhr yhrVar : this.a) {
            yhrVar.d.c("stcw_e");
            if (((Boolean) yhrVar.e.get()).booleanValue()) {
                yhrVar.e.set(false);
            }
            yht yhtVar = yhrVar.h;
            yhtVar.c(yhtVar.b);
            yhrVar.h.a.e(new Exception("CustomWebView Crashed"));
            yhrVar.g.a();
        }
        return true;
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
