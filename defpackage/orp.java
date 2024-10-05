package defpackage;

import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class orp {
    public static final Object a = new Object();
    public final WebView b;
    public final SwipeRefreshLayout c;
    public final ord d;
    public final aypn e;

    public orp(WebView webView, final SwipeRefreshLayout swipeRefreshLayout, ord ordVar) {
        this.b = webView;
        swipeRefreshLayout.g = yjk.K(swipeRefreshLayout.getResources().getDisplayMetrics(), 120);
        swipeRefreshLayout.d.invalidate();
        this.c = swipeRefreshLayout;
        this.d = ordVar;
        this.e = aypn.k(new aypp() { // from class: orl
            @Override // defpackage.aypp
            public final void a(final aypo aypoVar) {
                final SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                swipeRefreshLayout2.a = new bvi() { // from class: ork
                    @Override // defpackage.bvi
                    public final void a() {
                        aypo.this.d(orp.a);
                    }
                };
                aypoVar.si(aynu.e(new ayrm() { // from class: orm
                    @Override // defpackage.ayrm
                    public final void a() {
                        SwipeRefreshLayout.this.a = null;
                    }
                }));
            }
        }, aypg.LATEST).J();
    }
}
