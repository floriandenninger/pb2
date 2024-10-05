package com.google.android.apps.youtube.app.ui.presenter.ads.webview;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import defpackage.afsu;
import defpackage.any;
import defpackage.aok;
import defpackage.ayph;
import defpackage.azre;
import defpackage.nhq;
import defpackage.nht;
import defpackage.wjb;
import defpackage.wjc;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zga;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdsWebViewCacheController implements any, ypd {
    public final Map a = new HashMap();
    private final ypa b;
    private final nht c;

    public AdsWebViewCacheController(ypa ypaVar, nht nhtVar) {
        ypaVar.getClass();
        this.b = ypaVar;
        nhtVar.getClass();
        this.c = nhtVar;
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h((nhq) arrayList.get(i));
        }
    }

    public final void h(nhq nhqVar) {
        if (this.a.containsKey(nhqVar)) {
            AdsWebView adsWebView = (AdsWebView) this.a.get(nhqVar);
            if (adsWebView != null) {
                if (adsWebView.getParent() != null) {
                    ((ViewGroup) adsWebView.getParent()).removeView(adsWebView);
                }
                adsWebView.destroy();
            }
            this.a.remove(nhqVar);
        }
    }

    public final void i(Activity activity, final AdsWebView adsWebView, final String str, boolean z) {
        if (z) {
            nht nhtVar = this.c;
            try {
                ayph.w(new afsu(activity, nhtVar.b.a(nhtVar.a.c()), str, nht.a(adsWebView))).E(azre.c()).Q();
                return;
            } catch (Exception e) {
                zga.d("Failed to execute GoogleSsoAuthTokenTask.", e);
                return;
            }
        }
        activity.runOnUiThread(new Runnable() { // from class: nhs
            @Override // java.lang.Runnable
            public final void run() {
                AdsWebView adsWebView2 = AdsWebView.this;
                nht.a(adsWebView2).a(str);
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wjc.class};
        }
        if (i == 0) {
            wjc wjcVar = (wjc) obj;
            if (wjcVar.a() != wjb.FINISHED || !wjcVar.c()) {
                return null;
            }
            g();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.b.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.b.g(this);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
