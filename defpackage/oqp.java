package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oqp implements ayrs {
    public final /* synthetic */ WebView a;
    private final /* synthetic */ int b;

    public /* synthetic */ oqp(WebView webView, int i) {
        this.b = i;
        this.a = webView;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.setSystemUiVisibility(((Integer) obj).intValue());
        } else {
            this.a.loadUrl((String) obj);
        }
    }
}
