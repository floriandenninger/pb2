package defpackage;

import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nht {
    public final afsy a;
    public final wcf b;

    public nht(afsy afsyVar, wcf wcfVar) {
        this.a = afsyVar;
        this.b = wcfVar;
    }

    public nht(wcf wcfVar, afsy afsyVar) {
        wcfVar.getClass();
        this.b = wcfVar;
        afsyVar.getClass();
        this.a = afsyVar;
    }

    public static final zfi a(final AdsWebView adsWebView) {
        return new zfi() { // from class: nhr
            @Override // defpackage.zfi
            public final void a(Object obj) {
                AdsWebView.this.loadUrl((String) obj);
            }
        };
    }
}
