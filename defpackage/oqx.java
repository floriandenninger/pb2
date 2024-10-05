package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oqx extends WebChromeClient {
    public static final /* synthetic */ int b = 0;
    public final ViewGroup a;
    private final azrs c = azrh.aN(amlr.a);

    public oqx(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final aypn a() {
        return this.c.i(aypg.BUFFER);
    }

    public final aypn b() {
        return a().A(oqj.m).A(oqj.e).A(oqj.f);
    }

    public final aypn c() {
        return b().A(oqj.g);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        this.c.c(amlr.a);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.c.c(ammv.j(new oqv(view, customViewCallback)));
    }
}
