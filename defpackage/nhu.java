package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.presenter.ads.webview.AdsWebViewCacheController;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhu implements ajom, xmr, euh {
    public final LoadingFrameLayout a;
    public final wng b;
    public final shf c;
    public acra d;
    public apbu e;
    public long f;
    public boolean g;
    public boolean h;
    private final Context i;
    private final AdsWebViewCacheController j;
    private final aahd k;
    private AdsWebView l;
    private final amsj m;

    public nhu(Context context, wng wngVar, shf shfVar, amsj amsjVar, aahd aahdVar, AdsWebViewCacheController adsWebViewCacheController, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.i = context;
        wngVar.getClass();
        this.b = wngVar;
        shfVar.getClass();
        this.c = shfVar;
        amsjVar.getClass();
        this.m = amsjVar;
        adsWebViewCacheController.getClass();
        this.j = adsWebViewCacheController;
        aahdVar.getClass();
        this.k = aahdVar;
        this.g = true;
        this.h = false;
        this.a = (LoadingFrameLayout) LayoutInflater.from(context).inflate(R.layout.loading_ads_web_view, (ViewGroup) null, false).findViewById(R.id.loading_layout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        apbu apbuVar = this.e;
        if (apbuVar != null) {
            amsj amsjVar = this.m;
            amsjVar.a.remove(apbuVar.c);
        }
        this.a.removeAllViews();
        AdsWebView adsWebView = this.l;
        if (adsWebView != null) {
            adsWebView.destroy();
            this.l = null;
        }
    }

    @Override // defpackage.euh
    public final void d() {
        aong aongVar;
        apbu apbuVar = this.e;
        if (apbuVar == null) {
            return;
        }
        AdsWebView adsWebView = this.l;
        if (adsWebView == null) {
            String valueOf = String.valueOf(apbuVar.c);
            afsi.b(1, 1, valueOf.length() != 0 ? "No AdsWebView found for renderer: ".concat(valueOf) : new String("No AdsWebView found for renderer: "));
            return;
        }
        String url = adsWebView.getUrl();
        if (TextUtils.isEmpty(url)) {
            String valueOf2 = String.valueOf(this.e.c);
            afsi.b(1, 1, valueOf2.length() != 0 ? "No url found for AdsWebView: ".concat(valueOf2) : new String("No url found for AdsWebView: "));
            return;
        }
        apbu apbuVar2 = this.e;
        if ((apbuVar2.b & 8) != 0) {
            apxf apxfVar = apbuVar2.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
                apxf apxfVar2 = this.e.f;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aongVar = (aong) apxfVar2.toBuilder();
                aone builder = ((avuo) aongVar.pX(UrlEndpointOuterClass.urlEndpoint)).toBuilder();
                builder.copyOnWrite();
                avuo avuoVar = (avuo) builder.instance;
                url.getClass();
                avuoVar.b = 1 | avuoVar.b;
                avuoVar.c = url;
                aongVar.e(UrlEndpointOuterClass.urlEndpoint, (avuo) builder.build());
                aone builder2 = this.e.toBuilder();
                builder2.copyOnWrite();
                apbu apbuVar3 = (apbu) builder2.instance;
                apxf apxfVar3 = (apxf) aongVar.build();
                apxfVar3.getClass();
                apbuVar3.f = apxfVar3;
                apbuVar3.b |= 8;
                apbu apbuVar4 = (apbu) builder2.build();
                this.e = apbuVar4;
                this.k.c((apxf) aongVar.build(), amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", apbuVar4));
            }
        }
        afsi.b(1, 1, "AdsWebViewPresenter base command not correctly specified.");
        aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(UrlEndpointOuterClass.urlEndpoint, avuo.a);
        aone builder3 = ((avuo) aongVar.pX(UrlEndpointOuterClass.urlEndpoint)).toBuilder();
        builder3.copyOnWrite();
        avuo avuoVar2 = (avuo) builder3.instance;
        url.getClass();
        avuoVar2.b = 1 | avuoVar2.b;
        avuoVar2.c = url;
        aongVar.e(UrlEndpointOuterClass.urlEndpoint, (avuo) builder3.build());
        aone builder22 = this.e.toBuilder();
        builder22.copyOnWrite();
        apbu apbuVar32 = (apbu) builder22.instance;
        apxf apxfVar32 = (apxf) aongVar.build();
        apxfVar32.getClass();
        apbuVar32.f = apxfVar32;
        apbuVar32.b |= 8;
        apbu apbuVar42 = (apbu) builder22.build();
        this.e = apbuVar42;
        this.k.c((apxf) aongVar.build(), amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", apbuVar42));
    }

    public final void e() {
        AdsWebView adsWebView = this.l;
        if (adsWebView == null || adsWebView.getParent() != null) {
            return;
        }
        this.a.addView(this.l);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        acra acraVar;
        AdsWebView adsWebView;
        apbu apbuVar = (apbu) obj;
        if (apbuVar == null) {
            whu.I(this.a, false);
            return;
        }
        this.e = apbuVar;
        if (this.l == null) {
            AdsWebViewCacheController adsWebViewCacheController = this.j;
            Context context = this.i;
            String str = apbuVar.c;
            String str2 = apbuVar.d;
            if (adsWebViewCacheController.a.get(new nhq(str, str2)) == null || (adsWebView = (AdsWebView) adsWebViewCacheController.a.get(new nhq(str, str2))) == null || adsWebView.getParent() != null) {
                adsWebView = new AdsWebView(context);
                nhq nhqVar = new nhq(str, str2);
                adsWebViewCacheController.h(nhqVar);
                adsWebViewCacheController.a.put(nhqVar, adsWebView);
            }
            this.l = adsWebView;
        }
        this.l.onResume();
        this.l.a = this;
        if (this.b.j()) {
            this.j.i((Activity) this.i, this.l, this.e.d, false);
        } else {
            apbu apbuVar2 = this.e;
            if (!apbuVar2.e) {
                this.j.i((Activity) this.i, this.l, apbuVar2.d, apbuVar2.g);
            }
        }
        if (this.e.e) {
            e();
        }
        this.a.e();
        this.a.a();
        if (this.l.getProgress() != 100) {
            this.a.c();
        }
        amsj amsjVar = this.m;
        String str3 = apbuVar.c;
        if (str3 != null) {
            amsjVar.a.put(str3, this);
        }
        whu.I(this.a, true);
        acra acraVar2 = ajokVar.a;
        if (acraVar2 != null) {
            this.d = acraVar2;
        }
        if (this.b.j() || (acraVar = this.d) == null) {
            return;
        }
        acraVar.u(new acqx(apbuVar.h), null);
    }
}
