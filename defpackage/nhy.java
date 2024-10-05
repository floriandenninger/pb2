package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhy extends WebViewClient {
    final /* synthetic */ nhz a;

    public nhy(nhz nhzVar) {
        this.a = nhzVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        nhz nhzVar = this.a;
        acra acraVar = nhzVar.e.a;
        acqx acqxVar = nhzVar.g;
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashd.a.createBuilder();
        aone createBuilder3 = ashe.a.createBuilder();
        long d = this.a.c.d();
        long j = this.a.h;
        createBuilder3.copyOnWrite();
        ashe asheVar = (ashe) createBuilder3.instance;
        asheVar.b |= 1;
        asheVar.c = (int) (d - j);
        nhz nhzVar2 = this.a;
        int i = nhzVar2.i + 1;
        nhzVar2.i = i;
        createBuilder3.copyOnWrite();
        ashe asheVar2 = (ashe) createBuilder3.instance;
        asheVar2.b |= 2;
        asheVar2.d = i;
        ashe asheVar3 = (ashe) createBuilder3.build();
        createBuilder2.copyOnWrite();
        ashd ashdVar = (ashd) createBuilder2.instance;
        asheVar3.getClass();
        ashdVar.d = asheVar3;
        ashdVar.c = 2;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashd ashdVar2 = (ashd) createBuilder2.build();
        ashdVar2.getClass();
        ashtVar.t = ashdVar2;
        ashtVar.c |= 1024;
        acraVar.w(acqxVar, (asht) createBuilder.build());
        nhz nhzVar3 = this.a;
        atwm atwmVar = nhzVar3.f;
        if ((atwmVar.b & 64) != 0) {
            aahd aahdVar = nhzVar3.b;
            apxf apxfVar = atwmVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
        this.a.d.evaluateJavascript("if (onAdData) { onAdData({}, { exit: function() { PlayableAdJavascriptInterface.onExit(); }}); }", null);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        nhz nhzVar = this.a;
        nhzVar.h = nhzVar.c.d();
        nhz nhzVar2 = this.a;
        atwm atwmVar = nhzVar2.f;
        if ((atwmVar.b & 32) != 0) {
            aahd aahdVar = nhzVar2.b;
            apxf apxfVar = atwmVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        nhz nhzVar = this.a;
        atwm atwmVar = nhzVar.f;
        if ((atwmVar.b & 256) != 0) {
            aahd aahdVar = nhzVar.b;
            apxf apxfVar = atwmVar.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.a.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
