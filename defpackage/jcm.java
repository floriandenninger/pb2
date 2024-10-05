package defpackage;

import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jcm extends Observable implements fzd, fzk {
    public final boolean a;
    public final aaea b;
    final boolean c;
    public final addf d;
    public final ayqw e = new ayqw();
    ayqx f;
    public Optional g;
    private int h;
    private final ayqi i;
    private Optional j;

    public jcm(acun acunVar, aaea aaeaVar, aadw aadwVar, yqw yqwVar, ayqi ayqiVar, addf addfVar) {
        this.a = acunVar.q;
        this.b = aaeaVar;
        this.i = ayqiVar;
        boolean bh = evr.bh(aadwVar);
        this.c = bh;
        this.d = addfVar;
        this.j = Optional.empty();
        this.g = Optional.empty();
        if (bh) {
            yqwVar.a().R(new ayrm() { // from class: jcj
                @Override // defpackage.ayrm
                public final void a() {
                    jcm jcmVar = jcm.this;
                    jcmVar.e.c();
                    jcmVar.c();
                }
            });
        }
    }

    @Override // defpackage.fzd
    public final void a(zau zauVar, int i) {
        this.j = Optional.of(zauVar);
        this.h = i;
        b().ifPresent(new jcl(this, 0));
        this.e.d(this.b.a.Y(ivh.p).B().ab(this.i).ax(new ayrs() { // from class: jck
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                jcm.this.e(((Boolean) obj).booleanValue());
            }
        }));
    }

    public final Optional b() {
        return this.g.map(iur.j);
    }

    public final void c() {
        ayqx ayqxVar = this.f;
        if (ayqxVar != null) {
            ayqxVar.qc();
            this.f = null;
        }
    }

    public final void d(boolean z) {
        if (this.g.isPresent()) {
            ((MenuItem) this.g.get()).setVisible(z);
            ((MenuItem) this.g.get()).setEnabled(z);
        }
    }

    public final void e(boolean z) {
        Optional b = b();
        if (b.isPresent() && this.j.isPresent()) {
            ((MediaRouteButton) b.get()).e(((zau) this.j.get()).b(((MediaRouteButton) b.get()).getContext().getResources().getDrawable(true != z ? R.drawable.ic_outlined_media_route : R.drawable.ic_outlined_media_route_outline_checked), this.h));
        }
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_cast;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_cast;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return this;
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
        menuItem.setActionView(R.layout.castmediaroutebutton);
        menuItem.setShowAsAction(2);
        if (this.g.isPresent() && this.g.get() == menuItem) {
            return;
        }
        this.g = Optional.of(menuItem);
        if (this.c) {
            c();
            b().ifPresent(new jcl(this, 1));
        }
        setChanged();
        notifyObservers();
    }

    @Override // defpackage.fze
    public final boolean m() {
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 0;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
