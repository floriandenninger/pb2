package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jct implements fzk {
    private final Context a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final acwr e;
    private final acwv f;
    private final adfa g;
    private final adlt h;
    private final dd i;
    private final boolean j;
    private final adfc k;

    public jct(Context context, dd ddVar, acwr acwrVar, acwv acwvVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, adfc adfcVar, adfa adfaVar, adlt adltVar, acun acunVar) {
        this.a = context;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = acwrVar;
        this.f = acwvVar;
        this.k = adfcVar;
        this.g = adfaVar;
        this.h = adltVar;
        this.i = ddVar;
        this.j = acunVar.q;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_cast_overflow;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_cast_overflow;
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
        return false;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        menuItem.setShowAsAction(0);
        if (this.j) {
            menuItem.setVisible(true);
        } else {
            menuItem.setVisible(bpw.k((bph) this.b.get(), 1));
        }
    }

    @Override // defpackage.fze
    public final boolean m() {
        yjk.f();
        if (!this.f.b()) {
            this.f.a((Activity) this.a);
        } else {
            bpv j = bpw.j();
            if (this.h.g() == null && ((addy) this.c.get()).L(j)) {
                bpw.o(1);
            }
            if (!this.e.e()) {
                this.e.b();
            }
            if (!this.k.a(this.i)) {
                adlm g = this.h.g();
                if (g == null || g.a() == 2) {
                    bnq c = adfa.c((bph) this.b.get(), null);
                    c.qh(this.i, c.getClass().getCanonicalName());
                } else {
                    bog b = this.g.b();
                    b.qh(this.i, b.getClass().getCanonicalName());
                }
            }
        }
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 101;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
