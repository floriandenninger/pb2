package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yht {
    public final zaw a;
    private final Activity c;
    private final afsy d;
    private final yhk e;
    private final acsy f;
    private final Executor g;
    private WebView h;
    private final wcf j;
    private final axze k;
    public String b = "";
    private int i = 0;

    public yht(Activity activity, wcf wcfVar, afsy afsyVar, yhk yhkVar, acsy acsyVar, zaw zawVar, axze axzeVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = activity;
        this.j = wcfVar;
        this.d = afsyVar;
        this.e = yhkVar;
        this.f = acsyVar;
        this.a = zawVar;
        this.k = axzeVar;
        this.g = executor;
    }

    private final void d() {
        WebView webView = this.h;
        if (webView == null || webView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.h.getParent()).removeView(this.h);
    }

    public final WebView a() {
        d();
        return this.h;
    }

    public final void b(LoadingFrameLayout loadingFrameLayout, String str, boolean z, boolean z2, yhs yhsVar) {
        acsx b = this.f.b(asmn.LATENCY_ACTION_SHOPPING_IN_APP);
        this.h = new WebView(this.c);
        if (this.b.equals(str)) {
            this.i++;
        } else {
            this.b = str;
            this.i = 1;
        }
        if (!z2) {
            loadingFrameLayout.e();
            loadingFrameLayout.c();
        }
        yhp yhpVar = new yhp();
        boolean booleanValue = ((Boolean) this.k.a.a.Y(axzb.h).B().aB()).booleanValue();
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(false);
        yhpVar.a.add(new yhr(this, z2, loadingFrameLayout, str, b, atomicReference, booleanValue, yhsVar));
        this.h.setWebViewClient(yhpVar);
        this.h.setWebChromeClient(new yho());
        this.h.setScrollBarStyle(33554432);
        this.h.setScrollbarFadingEnabled(false);
        if (((Boolean) this.k.a.a.Y(axzb.g).B().aB()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings settings = this.h.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setMixedContentMode(2);
        b.c("stcw_c");
        if (!z) {
            this.h.loadUrl(str);
            return;
        }
        if (!((Boolean) this.k.a.a.Y(axzb.f).B().aB()).booleanValue()) {
            try {
                Account a = this.j.a(this.d.c());
                Activity activity = this.c;
                final WebView webView = this.h;
                webView.getClass();
                this.g.execute(new afsu(activity, a, str, new zfi() { // from class: yhq
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        webView.loadUrl((String) obj);
                    }
                }));
                return;
            } catch (Exception e) {
                zga.d("Failed to execute GoogleSsoAuthTokenTask.", e);
                this.h.loadUrl(str);
                return;
            }
        }
        yhk yhkVar = this.e;
        final WebView webView2 = this.h;
        webView2.getClass();
        yhkVar.b(str, b, new zfi() { // from class: yhq
            @Override // defpackage.zfi
            public final void a(Object obj) {
                webView2.loadUrl((String) obj);
            }
        });
    }

    public final void c(String str) {
        if (this.h == null || !this.b.equals(str)) {
            return;
        }
        int i = this.i - 1;
        this.i = i;
        if (i <= 0) {
            d();
            this.h.destroy();
            this.h = null;
            this.b = "";
            this.i = 0;
        }
    }
}
