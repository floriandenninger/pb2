package defpackage;

import android.graphics.Bitmap;
import android.webkit.CookieManager;
import android.webkit.WebView;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ord extends uze {
    public final azqw a;
    public final azqw b;
    public final org c;
    public final oqz d;
    public final oqz e;
    public final Executor f;
    private final azqw g;
    private final orj h;

    public ord(org orgVar, oqz oqzVar, oqz oqzVar2, orj orjVar, Executor executor) {
        super(oqzVar, oqzVar2);
        this.g = azqv.ap().av();
        this.a = azqy.ap().av();
        this.b = azqv.aq(ora.IDLE).av();
        this.c = orgVar;
        this.d = oqzVar;
        this.e = oqzVar2;
        this.h = orjVar;
        this.f = executor;
        oqzVar.a(new uzc((List) orgVar.a().Z()));
        oqzVar2.a(new uzc((List) orgVar.b().Z()));
    }

    @Override // defpackage.uze
    public final boolean a(String str) {
        this.a.c(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        this.g.c(new orc(str, webView.canGoBack()));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.c(ora.IDLE);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        amru q;
        orj orjVar = this.h;
        String language = ((Locale) orjVar.c.get()).getLanguage();
        String str2 = orjVar.b;
        if (str2 == null || orjVar.a.getCookie(str2) == null) {
            q = amru.q();
        } else {
            q = (amru) DesugarArrays.stream(orjVar.a.getCookie(orjVar.b).split(";")).map(opb.c).filter(new nty(3)).collect(ampm.a);
        }
        String str3 = (String) amkq.bi(q, "");
        Map hashMap = new HashMap();
        if (!str3.isEmpty()) {
            if (str3.startsWith("PREF=")) {
                str3 = str3.substring(5);
            }
            hashMap = (Map) DesugarArrays.stream(str3.split("&")).filter(nty.d).map(opb.d).collect(Collectors.toMap(opb.g, opb.h));
        }
        hashMap.put("hl", language);
        orh orhVar = new orh();
        orhVar.a = amrz.j(amrz.j(hashMap));
        amrz amrzVar = orhVar.a;
        if (amrzVar == null) {
            throw new IllegalStateException("Missing required properties: keyValues");
        }
        String str4 = (String) Collection.EL.stream(new ori(amrzVar).a.entrySet()).sorted(Comparator$CC.comparing(opb.f)).map(opb.e).collect(Collectors.joining("&"));
        String str5 = orjVar.b;
        if (str5 != null) {
            CookieManager cookieManager = orjVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 5);
            sb.append("PREF=");
            sb.append(str4);
            sb.append("");
            cookieManager.setCookie(str5, sb.toString());
        }
        super.onPageStarted(webView, str, bitmap);
        this.b.c(ora.LOADING);
    }
}
