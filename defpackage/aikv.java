package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aikv extends WebViewClient {
    final /* synthetic */ String a;
    final /* synthetic */ aikx b;
    private boolean c = false;

    public aikv(aikx aikxVar, String str) {
        this.b = aikxVar;
        this.a = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.c) {
            return;
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "page finished:".concat(valueOf);
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(this.a);
        if (TextUtils.equals(parse.getAuthority(), parse2.getAuthority()) && TextUtils.equals(parse.getHost(), parse2.getHost()) && TextUtils.equals(parse.getPath(), parse2.getPath())) {
            aikx aikxVar = this.b;
            Activity activity = (Activity) aikxVar.a.get();
            if (activity == null || activity.isFinishing()) {
                afsi.b(1, 10, "AgeVerificationDialog was attempted to be shown although the activity was destroyed.");
            } else {
                aikxVar.d.show();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String.valueOf(str).length();
        String.valueOf(str2).length();
        this.c = true;
        this.b.c();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if ("youtube://player/KavSuccess".equals(str)) {
            aikx aikxVar = this.b;
            aikxVar.a();
            aikxVar.h.a();
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
