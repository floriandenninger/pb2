package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lif extends lhr {
    public View a;
    public afsy ae;
    public wcf af;
    public axzg ag;
    private WebView ah;
    public View b;
    public lie c;
    public ayqi d;
    public ayqi e;

    public static lif o() {
        return new lif();
    }

    @JavascriptInterface
    public void consentError() {
        p();
    }

    @JavascriptInterface
    public void consentGiven() {
        p();
    }

    @JavascriptInterface
    public void consentNotGiven() {
        p();
    }

    @JavascriptInterface
    public void consentRevoked() {
        p();
    }

    @JavascriptInterface
    public void initialLoadCompleted() {
        View findViewById = this.a.findViewById(R.id.progress_loader);
        this.b = findViewById;
        findViewById.setVisibility(4);
    }

    @JavascriptInterface
    public void initialLoadFailed() {
        p();
    }

    @JavascriptInterface
    public void initialLoadSkipped() {
        p();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vaa_consent_webview, viewGroup, false);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.progress_loader);
        WebView webView = (WebView) this.a.findViewById(R.id.webview);
        this.ah = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.ah.addJavascriptInterface(this, "gsa_assistant_vaa");
        this.ah.setWebViewClient(new lid(this));
        ayqj.C(new Callable() { // from class: lic
            @Override // java.util.concurrent.Callable
            public final Object call() {
                lif lifVar = lif.this;
                return ammv.i(lifVar.af.a(lifVar.ae.c()));
            }
        }).L(amlr.a).h(khf.i).x(khe.m).x(new fjx((String) this.ag.a.a.Y(axzd.h).B().as("https://myactivity.google.com/embedded/consent/assistant/vaa").X(), 8)).s(new ayrv() { // from class: lib
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                lif lifVar = lif.this;
                ammw ammwVar = (ammw) obj;
                return afsu.a(lifVar.C(), (Account) ammwVar.b, (String) ammwVar.a).G(lifVar.d).z(lifVar.e).F((String) ammwVar.a);
            }
        }).V(new oqp(this.ah, 1), new ayrs() { // from class: lia
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                lif.this.p();
            }
        });
        return this.a;
    }

    public final void p() {
        lie lieVar = this.c;
        if (lieVar != null) {
            lieVar.a();
        }
    }
}
