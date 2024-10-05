package defpackage;

import android.webkit.CookieManager;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class orj {
    public final CookieManager a;
    public final String b;
    public final azrw c;

    public orj(CookieManager cookieManager, URI uri, azrw azrwVar) {
        this.a = cookieManager;
        this.b = uri.getHost();
        this.c = azrwVar;
    }
}
