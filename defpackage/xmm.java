package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmm extends xmn {
    public acra ae;
    public Executor af;
    public Executor ag;
    public afsy ah;
    public wcf ai;
    public ewd aj;
    private aotm ak;
    private WebView al;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(0, R.style.AboutThisAdWebViewDialog_FullScreen);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        try {
            this.ak = (aotm) aonm.parseFrom(aotm.a, this.m.getByteArray("about_this_ad_renderer"), aomw.b());
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.about_this_ad_webview_layout, viewGroup, false);
            WebView webView = (WebView) viewGroup2.findViewById(R.id.webview);
            this.al = webView;
            webView.setWebViewClient(new xmj(this.ak, this.ae));
            this.al.setScrollBarStyle(33554432);
            this.al.setScrollbarFadingEnabled(false);
            this.al.getSettings().setJavaScriptEnabled(true);
            this.al.addJavascriptInterface(this, "aboutthisad");
            anbj anbjVar = this.ak.b;
            if (anbjVar == null) {
                anbjVar = anbj.a;
            }
            String str = new anbi(anbjVar.b).a;
            this.al.loadUrl((String) ayqj.C(new Callable() { // from class: xml
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    xmm xmmVar = xmm.this;
                    return ammv.i(xmmVar.ai.a(xmmVar.ah.c()));
                }
            }).L(amlr.a).h(oht.h).x(suj.m).x(new fjx(str, 13)).s(new ayrv() { // from class: xmk
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    xmm xmmVar = xmm.this;
                    ammw ammwVar = (ammw) obj;
                    return afsu.a(xmmVar.C(), (Account) ammwVar.b, (String) ammwVar.a).G(azre.b(xmmVar.af)).z(azre.b(xmmVar.ag)).F((String) ammwVar.a);
                }
            }).S(str).X());
            return viewGroup2;
        } catch (aoob e) {
            zga.f("AboutThisAdWebviewDialogFragment", "Failed to deserialize the ATA Renderer.", e);
            return null;
        }
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        if (str == null) {
            zga.m("AboutThisAdWebviewDialogFragment", "Received no postMessage data from the ATA page.");
            return;
        }
        int i = 1;
        try {
            aotj aotjVar = (aotj) aonm.parseFrom(aotj.b, Base64.decode(str, 2), aomw.b());
            final ewd ewdVar = this.aj;
            Iterator<E> it = new aonw(aotjVar.c, aotj.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aotk aotkVar = (aotk) it.next();
                aotk aotkVar2 = aotk.ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED;
                int ordinal = aotkVar.ordinal();
                if (ordinal == 0) {
                    zga.m("AboutThisAdWebViewListenerImpl", String.format("Unknown callback value received from ATA %s", aotkVar.name()));
                } else if (ordinal == 1) {
                    if (ewdVar.a) {
                        int ca = amkq.ca(ewdVar.b.c);
                        if (ca != 0 && ca == 3) {
                            if (ewdVar.f.isPresent()) {
                                ewdVar.c.d(ewdVar.f.get());
                            } else {
                                afsi.b(1, 1, "Tried to hide ad, but enclosing event is NULL for AboutThisAd");
                            }
                        }
                        int ca2 = amkq.ca(ewdVar.b.c);
                        if (ca2 != 0 && ca2 == 2) {
                            if (ewdVar.h == null) {
                                afsi.b(1, 1, "Tried to skip ad, but ad skip callback is NULL for AboutThisAd");
                            } else {
                                ewdVar.d.execute(new Runnable() { // from class: ewc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ewd.this.h.e();
                                    }
                                });
                            }
                        }
                    }
                    if (!ewdVar.g) {
                        ewdVar.d.execute(new gkr(ewdVar.e, i));
                    }
                } else if (ordinal == 2 || ordinal == 3) {
                    ewdVar.a = true;
                }
            }
            if (new aonw(aotjVar.c, aotj.a).contains(aotk.CLOSE)) {
                this.ae.q(new acqx(this.ak.c), null);
                dismiss();
            }
        } catch (aoob e) {
            zga.c("AboutThisAdWebviewDialogFragment", String.format("Unable to parse protocol buffer: %s\nMessage: %s", e, str));
        }
    }
}
