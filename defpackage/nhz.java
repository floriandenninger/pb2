package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import com.google.android.libraries.youtube.ads.ui.webview.PlayableAdWebView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhz implements ajom {
    public final Context a;
    public final aahd b;
    public final shf c;
    public final PlayableAdWebView d;
    public ajok e;
    public atwm f;
    public acqx g;
    public long h;
    public int i;
    public int j;
    public boolean k = false;
    public boolean l = false;
    private final Executor m;
    private final View n;
    private acqx o;
    private float p;

    public nhz(Context context, aahd aahdVar, shf shfVar, Executor executor, ViewGroup viewGroup) {
        this.a = context;
        this.b = aahdVar;
        this.c = shfVar;
        this.m = executor;
        View inflate = LayoutInflater.from(context).inflate(R.layout.playable_ad, viewGroup, false);
        this.n = inflate;
        PlayableAdWebView playableAdWebView = (PlayableAdWebView) inflate.findViewById(R.id.playable_ad_web_view);
        this.d = playableAdWebView;
        playableAdWebView.getSettings().setJavaScriptEnabled(true);
        playableAdWebView.setScrollBarStyle(0);
        playableAdWebView.setSoundEffectsEnabled(false);
        playableAdWebView.getSettings().setLoadWithOverviewMode(false);
        playableAdWebView.getSettings().setUseWideViewPort(false);
        playableAdWebView.addJavascriptInterface(this, "PlayableAdJavascriptInterface");
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: nhw
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                nhz nhzVar = nhz.this;
                nhzVar.k = true;
                if (nhzVar.l || nhzVar.f == null) {
                    return;
                }
                nhzVar.d();
            }
        });
        playableAdWebView.setWebViewClient(new nhy(this));
        playableAdWebView.a = new View.OnTouchListener() { // from class: nhv
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                nhz nhzVar = nhz.this;
                if (motionEvent.getActionMasked() != 0 || nhzVar.i <= 0) {
                    return false;
                }
                int i = nhzVar.j + 1;
                nhzVar.j = i;
                if (i <= 10) {
                    nhzVar.e.a.I(3, nhzVar.g, null);
                }
                if (nhzVar.j != 1) {
                    return false;
                }
                atwm atwmVar = nhzVar.f;
                if ((atwmVar.b & 128) == 0) {
                    return false;
                }
                aahd aahdVar2 = nhzVar.b;
                apxf apxfVar = atwmVar.i;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar2.c(apxfVar, null);
                return false;
            }
        };
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.n;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.loadUrl("about:blank");
    }

    public final void d() {
        if (this.f.c == 4) {
            float width = this.n.getWidth() / (this.f.c == 4 ? (atwl) r2.d : atwl.a).b;
            float height = this.n.getHeight();
            int floor = (int) Math.floor(Math.min(width, height / (this.f.c == 4 ? (atwl) r3.d : atwl.a).c) * 100.0f);
            this.p = floor / 100.0f;
            this.d.setInitialScale(floor);
            int width2 = this.n.getWidth() - Math.round((this.f.c == 4 ? (atwl) r2.d : atwl.a).b * this.p);
            int height2 = this.n.getHeight() - Math.round((this.f.c == 4 ? (atwl) r3.d : atwl.a).c * this.p);
            int i = width2 / 2;
            int i2 = height2 / 2;
            this.n.setPadding(i, i2, width2 - i, height2 - i2);
        } else {
            this.d.setInitialScale(0);
            this.n.setPadding(0, 0, 0, 0);
        }
        this.d.loadUrl(this.f.f);
        this.e.a.u(this.g, null);
        this.e.a.u(this.o, null);
        this.l = true;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atwm atwmVar = (atwm) obj;
        this.e = ajokVar;
        this.f = atwmVar;
        this.g = new acqx(atwmVar.e);
        this.o = new acqx(acsb.a(93316));
        ajokVar.a.D(this.o);
        this.i = 0;
        this.j = 0;
        this.l = false;
        this.d.clearHistory();
        if (this.l || !this.k) {
            return;
        }
        d();
    }

    @JavascriptInterface
    public void onExit() {
        this.e.a.I(3, this.o, null);
        if ((this.f.b & 512) != 0) {
            this.m.execute(new Runnable() { // from class: nhx
                @Override // java.lang.Runnable
                public final void run() {
                    nhz nhzVar = nhz.this;
                    aahd aahdVar = nhzVar.b;
                    apxf apxfVar = nhzVar.f.k;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                }
            });
        }
    }
}
