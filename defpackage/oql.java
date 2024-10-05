package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oql implements aab {
    final /* synthetic */ oqm a;

    public oql(oqm oqmVar) {
        this.a = oqmVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        oqm oqmVar = this.a;
        if (oqmVar.a) {
            return;
        }
        oqmVar.a = true;
        Object lM = oqmVar.lM();
        WebViewFallbackActivity webViewFallbackActivity = (WebViewFallbackActivity) oqmVar;
        eed eedVar = (eed) lM;
        webViewFallbackActivity.c = eedVar.o();
        webViewFallbackActivity.d = (oqo) eedVar.kM.get();
        webViewFallbackActivity.e = (oqx) eedVar.kN.get();
        webViewFallbackActivity.f = (ord) eedVar.kT.get();
        webViewFallbackActivity.g = (org) eedVar.kR.get();
        webViewFallbackActivity.n = (wcf) eedVar.a.hM.get();
        webViewFallbackActivity.h = (afsy) eedVar.a.au.get();
        webViewFallbackActivity.i = (orp) eedVar.kU.get();
        webViewFallbackActivity.j = (ScheduledExecutorService) eedVar.a.f.get();
        webViewFallbackActivity.k = ghe.l();
        webViewFallbackActivity.l = eedVar.kV;
        webViewFallbackActivity.m = (Executor) eedVar.a.i.get();
    }
}
