package defpackage;

import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mal implements fzk, fzj {
    private final gji a;
    private final ysy b;
    private final zbi c;
    private apxf d = apxf.a;
    private String e;
    private int f;
    private final rxm g;
    private final lkb h;

    public mal(gji gjiVar, ysy ysyVar, rxm rxmVar, zbi zbiVar, lkb lkbVar, byte[] bArr, byte[] bArr2) {
        this.a = gjiVar;
        ysyVar.getClass();
        this.b = ysyVar;
        rxmVar.getClass();
        this.g = rxmVar;
        zbiVar.getClass();
        this.c = zbiVar;
        this.h = lkbVar;
    }

    private final void p(boolean z, int i) {
        gji gjiVar = this.a;
        gjiVar.d(this.h.c(this.d, this.e, this.f, z, i, gjiVar.n()));
    }

    @Override // defpackage.fzj
    public final void a() {
        p(false, -1);
    }

    @Override // defpackage.fzj
    public final void b(int i) {
        p(false, i);
    }

    @Override // defpackage.fzj
    public final void c() {
        p(true, -1);
    }

    @Override // defpackage.fzj
    public final void d(String str) {
        apxf apxfVar = apxf.a;
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        apxfVar.getClass();
        aong aongVar = (aong) apxfVar.toBuilder();
        aonk aonkVar = SearchEndpointOuterClass.searchEndpoint;
        aong aongVar2 = (aong) ((aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint)).toBuilder();
        aongVar2.copyOnWrite();
        aunn aunnVar = (aunn) aongVar2.instance;
        str.getClass();
        aunnVar.b = 1 | aunnVar.b;
        aunnVar.c = str;
        aongVar.e(aonkVar, (aunn) aongVar2.build());
        this.d = (apxf) aongVar.build();
    }

    @Override // defpackage.fzs
    public final void e(String str) {
        this.e = str;
    }

    @Override // defpackage.fzs
    public final void f() {
        this.f = 10349;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_search;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_search;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        menuItem.setActionView((View) null);
        menuItem.setShowAsAction(2);
        menuItem.setIcon(R.drawable.yt_outline_search_black_24);
    }

    @Override // defpackage.fze
    public final boolean m() {
        if (this.g.a || this.b.o()) {
            a();
            return true;
        }
        this.c.b();
        return false;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 50;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
