package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.ui.webview.AdsInlineWebsite;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmo extends WebViewClient {
    final /* synthetic */ AdsInlineWebsite a;

    public xmo(AdsInlineWebsite adsInlineWebsite) {
        this.a = adsInlineWebsite;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        xmp xmpVar = this.a.a;
        if (xmpVar != null) {
            nhp nhpVar = (nhp) xmpVar;
            ((ImageView) nhpVar.c.findViewById(R.id.back)).setImageTintList(ColorStateList.valueOf(wbs.Q(nhpVar.a, true != nhpVar.d.canGoBack() ? R.attr.ytIconDisabled : R.attr.ytTextPrimary)));
            ((ImageView) nhpVar.c.findViewById(R.id.url_security_icon)).setImageResource(nhpVar.d.getCertificate() != null ? R.drawable.yt_outline_lock_black_18 : R.drawable.yt_outline_alert_triangle_black_18);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        xmp xmpVar = this.a.a;
        if (xmpVar != null) {
            nhp nhpVar = (nhp) xmpVar;
            ((TextView) nhpVar.c.findViewById(R.id.url)).setText(nhp.d(str));
            ((ImageView) nhpVar.c.findViewById(R.id.url_security_icon)).setImageDrawable(null);
        }
    }
}
