package com.google.android.apps.youtube.app.webviewfallback;

import android.accounts.Account;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import defpackage.afsu;
import defpackage.afsy;
import defpackage.aynu;
import defpackage.aypn;
import defpackage.ayqj;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrv;
import defpackage.aysw;
import defpackage.ayxf;
import defpackage.ayxy;
import defpackage.azre;
import defpackage.azrw;
import defpackage.oht;
import defpackage.oqj;
import defpackage.oqm;
import defpackage.oqo;
import defpackage.oqp;
import defpackage.oqq;
import defpackage.oqs;
import defpackage.oqu;
import defpackage.oqx;
import defpackage.oqz;
import defpackage.ord;
import defpackage.org;
import defpackage.orp;
import defpackage.wbs;
import defpackage.wcf;
import defpackage.zgx;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WebViewFallbackActivity extends oqm {
    public static final String b = String.valueOf(WebViewFallbackActivity.class.getName()).concat("#FORCE_ON");
    public WebView c;
    public oqo d;
    public oqx e;
    public ord f;
    public org g;
    public afsy h;
    public orp i;
    public ScheduledExecutorService j;
    public CookieManager k;
    public azrw l;
    public Executor m;
    public wcf n;
    private final ayqw o;
    private final ayqw p;

    public WebViewFallbackActivity() {
        ayqw ayqwVar = new ayqw();
        this.o = ayqwVar;
        this.p = new ayqw(ayqwVar);
    }

    public final void b(String str) {
        this.c.loadUrl(str);
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        if (this.c.canGoBack()) {
            this.c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.getSettings().setJavaScriptEnabled(true);
        this.c.getSettings().setDomStorageEnabled(true);
        this.c.getSettings().setSupportMultipleWindows(false);
        WebSettings settings = this.c.getSettings();
        String userAgentString = this.c.getSettings().getUserAgentString();
        String ab = wbs.ab(this, zgx.c(this), getClass().getSimpleName());
        if (!userAgentString.contains(ab)) {
            StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(ab).length());
            sb.append(userAgentString);
            sb.append(" ");
            sb.append(ab);
            userAgentString = sb.toString();
        }
        settings.setUserAgentString(userAgentString);
        this.c.setWebViewClient(this.f);
        this.c.setWebChromeClient(this.e);
        String valueOf = String.valueOf(this.c.getSettings().getUserAgentString());
        if (valueOf.length() != 0) {
            "WebViewFallbackActivity user_agent: ".concat(valueOf);
        }
        this.k.setAcceptCookie(true);
        Uri.Builder buildUpon = Uri.parse(this.g.d()).buildUpon();
        buildUpon.appendQueryParameter("hl", getResources().getConfiguration().locale.getLanguage());
        buildUpon.appendQueryParameter("override_hl", "1");
        String builder = buildUpon.toString();
        Account b2 = this.n.b(this.h.c());
        if (this.k.hasCookies() || b2 == null) {
            b(builder);
        } else {
            this.p.d(afsu.a(this, b2, builder).G(azre.b(this.j)).z(ayqr.a()).S(builder).L(builder).V(new oqq(this, 2)));
        }
        ayqw ayqwVar = this.p;
        ayxf ayxfVar = new ayxf(this.g.c().s(oht.f));
        ayrv ayrvVar = aynu.n;
        ord ordVar = this.f;
        aypn E = ordVar.c.a().A(oqj.n).E(azre.b(ordVar.f));
        final oqz oqzVar = ordVar.d;
        oqzVar.getClass();
        aypn E2 = ordVar.c.b().A(oqj.n).E(azre.b(ordVar.f));
        final oqz oqzVar2 = ordVar.e;
        oqzVar2.getClass();
        ayqx[] ayqxVarArr = {E.X(new ayrs() { // from class: oqy
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oqz.this.a((uzc) obj);
            }
        }), E2.X(new ayrs() { // from class: oqy
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oqz.this.a((uzc) obj);
            }
        })};
        final orp orpVar = this.i;
        aypn A = orpVar.d.b.G().A(oqj.s);
        final SwipeRefreshLayout swipeRefreshLayout = orpVar.c;
        ayqwVar.g(ayxfVar.z(azre.b(this.m)).U(new oqq(this, 0)), new ayqw(ayqxVarArr), new ayqw(orpVar.e.X(new ayrs() { // from class: oro
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                orp.this.b.reload();
            }
        }), A.X(new ayrs() { // from class: orn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                SwipeRefreshLayout.this.l(((Boolean) obj).booleanValue());
            }
        })));
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.p.qc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        super.onStart();
        ayqw ayqwVar = this.o;
        final oqo oqoVar = this.d;
        final int i = 1;
        final int i2 = 0;
        ayqx[] ayqxVarArr = {ayqj.F(false).V(new ayrs() { // from class: oqn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oqo oqoVar2 = oqo.this;
                if (((Boolean) obj).booleanValue()) {
                    oqoVar2.a.r();
                } else {
                    oqoVar2.a.f();
                }
            }
        })};
        final oqx oqxVar = this.e;
        aypn t = oqxVar.b().n().q(new ayrs() { // from class: oqt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    oqxVar.a.removeAllViews();
                    return;
                }
                oqx oqxVar2 = oqxVar;
                Integer num = (Integer) obj;
                oqxVar2.a.setVisibility(num.intValue());
                Activity activity = (Activity) oqxVar2.a.getContext();
                if (num.intValue() == 0 && activity != null) {
                    activity.setRequestedOrientation(6);
                } else if (activity != null) {
                    activity.setRequestedOrientation(4);
                }
            }
        }).t(oqj.i);
        ViewGroup viewGroup = oqxVar.a;
        viewGroup.getClass();
        aypn A = oqxVar.a().ad(2).s(oht.g).A(oqj.h);
        oqj oqjVar = oqj.l;
        int i3 = aypn.a;
        aysw.c(i3, "bufferSize");
        ayxy ayxyVar = new ayxy(A, oqjVar, i3);
        ayrv ayrvVar = aynu.j;
        ayqx[] ayqxVarArr2 = {oqxVar.c().A(oqj.k).X(new ayrs() { // from class: oqt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    oqxVar.a.removeAllViews();
                    return;
                }
                oqx oqxVar2 = oqxVar;
                Integer num = (Integer) obj;
                oqxVar2.a.setVisibility(num.intValue());
                Activity activity = (Activity) oqxVar2.a.getContext();
                if (num.intValue() == 0 && activity != null) {
                    activity.setRequestedOrientation(6);
                } else if (activity != null) {
                    activity.setRequestedOrientation(4);
                }
            }
        }), t.X(new oqs(viewGroup, 0)), ayxyVar.A(oqj.j).X(oqu.a)};
        aypn A2 = this.e.c().A(oqj.c);
        WebView webView = this.c;
        webView.getClass();
        ayqwVar.g(new ayqw(ayqxVarArr), new ayqw(ayqxVarArr2), this.f.a.F().A(oqj.d).X(new oqq(this, 1)), A2.X(new oqp(webView, 0)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.k.flush();
        this.o.c();
    }
}
