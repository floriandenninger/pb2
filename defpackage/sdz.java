package defpackage;

import android.util.Base64;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sdz implements anhh {
    final /* synthetic */ awel a;
    final /* synthetic */ sea b;

    public sdz(sea seaVar, awel awelVar) {
        this.b = seaVar;
        this.a = awelVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        sep sepVar = this.b.b;
        final String encodeToString = Base64.encodeToString(this.a.toByteArray(), 2);
        final seg segVar = (seg) sepVar;
        WebView webView = segVar.b;
        if (webView == null) {
            return;
        }
        webView.post(new Runnable() { // from class: sed
            @Override // java.lang.Runnable
            public final void run() {
                seg.this.b.evaluateJavascript(String.format("receiveDataJson(\"%s\")", encodeToString), null);
            }
        });
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amxh) ((amxh) ((amxh) sea.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge$1", "onFailure", 'U', "WebBridge.java")).q("Error sending message to web.");
    }
}
