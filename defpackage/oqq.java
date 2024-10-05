package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oqq implements ayrs {
    public final /* synthetic */ WebViewFallbackActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ oqq(WebViewFallbackActivity webViewFallbackActivity, int i) {
        this.b = i;
        this.a = webViewFallbackActivity;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                fav.F(this.a, (Uri) obj);
                return;
            } else {
                this.a.b((String) obj);
                return;
            }
        }
        WebViewFallbackActivity webViewFallbackActivity = this.a;
        webViewFallbackActivity.startActivity((Intent) webViewFallbackActivity.l.get());
        webViewFallbackActivity.finish();
    }
}
