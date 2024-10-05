package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iwe extends ivp implements giy {
    public fjs a;
    public boolean ae;
    public rxm af;
    public lkb ag;
    public aoae ah;
    private Object ai;
    private Fragment$SavedState aj;
    private Object ak;
    private Fragment$SavedState al;
    private PaneDescriptor am;
    private boolean an;
    private boolean ao;
    private boolean aw = false;
    private PaneBackStack ax;
    public its b;
    View c;
    final amnv d;
    final amnv e;

    public iwe() {
        final int i = 0;
        this.d = new amnv(this) { // from class: iwb
            public final /* synthetic */ iwe a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                if (i == 0) {
                    iwe iweVar = this.a;
                    PaneDescriptor a = iweVar.b.a(iweVar.aN());
                    a.l(iweVar.ae);
                    return a;
                }
                iwe iweVar2 = this.a;
                if (iweVar2.ae) {
                    return iweVar2.ag.e();
                }
                aone createBuilder = aplt.a.createBuilder();
                createBuilder.copyOnWrite();
                aplt apltVar = (aplt) createBuilder.instance;
                apltVar.b |= 1;
                apltVar.c = "FEhistory";
                aplt apltVar2 = (aplt) createBuilder.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
                return iweVar2.b.a((apxf) aongVar.build());
            }
        };
        final int i2 = 1;
        this.e = new amnv(this) { // from class: iwb
            public final /* synthetic */ iwe a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                if (i2 == 0) {
                    iwe iweVar = this.a;
                    PaneDescriptor a = iweVar.b.a(iweVar.aN());
                    a.l(iweVar.ae);
                    return a;
                }
                iwe iweVar2 = this.a;
                if (iweVar2.ae) {
                    return iweVar2.ag.e();
                }
                aone createBuilder = aplt.a.createBuilder();
                createBuilder.copyOnWrite();
                aplt apltVar = (aplt) createBuilder.instance;
                apltVar.b |= 1;
                apltVar.c = "FEhistory";
                aplt apltVar2 = (aplt) createBuilder.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
                return iweVar2.b.a((apxf) aongVar.build());
            }
        };
    }

    private final PaneDescriptor aF() {
        if (aG() != null) {
            return PaneDescriptor.b(aG());
        }
        PaneDescriptor paneDescriptor = this.am;
        return paneDescriptor != null ? paneDescriptor : (PaneDescriptor) this.e.get();
    }

    private final gir aG() {
        return (gir) mN().f("detail_fragment_tag");
    }

    private final void aI(boolean z) {
        if (q() != null) {
            return;
        }
        PaneDescriptor paneDescriptor = (PaneDescriptor) this.d.get();
        gir d = paneDescriptor.d();
        Fragment$SavedState fragment$SavedState = this.aj;
        if (fragment$SavedState != null) {
            d.ah(fragment$SavedState);
        }
        dn k = mN().k();
        k.u(R.id.master_layout, d, "master_fragment_tag");
        if (z) {
            bh(aG(), paneDescriptor, true);
            k.i = 8194;
        }
        k.a();
    }

    private final void aJ() {
        PaneBackStack.BackStackEntry c = s().c();
        c.getClass();
        this.am = c.a;
        this.al = c.b;
        this.ak = c.c;
        bh(aG(), this.am, true);
        aH(this.am, false);
    }

    private final boolean bg(PaneDescriptor paneDescriptor) {
        gir aG = aG();
        return aG != null && this.b.f(PaneDescriptor.b(aG)) && this.b.g(paneDescriptor);
    }

    private static final void bh(gir girVar, PaneDescriptor paneDescriptor, boolean z) {
        aone createBuilder = atmc.a.createBuilder();
        boolean z2 = true;
        if (girVar == null || girVar.mM() == null || girVar.mM().k() == null) {
            z2 = false;
        } else {
            String k = girVar.mM().k();
            createBuilder.copyOnWrite();
            atmc atmcVar = (atmc) createBuilder.instance;
            k.getClass();
            atmcVar.b |= 1;
            atmcVar.c = k;
        }
        if (z) {
            int i = acrb.MOBILE_BACK_BUTTON.Jk;
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b |= 2;
            atmcVar2.d = i;
        } else if (!z2) {
            return;
        }
        paneDescriptor.j((atmc) createBuilder.build());
    }

    private final PaneBackStack s() {
        if (this.ax == null) {
            this.ax = new PaneBackStack();
        }
        return this.ax;
    }

    @Override // defpackage.giy
    public final boolean E() {
        return !r() && s().e();
    }

    @Override // defpackage.giy
    public final boolean F() {
        if (E()) {
            return false;
        }
        if (this.an) {
            aJ();
            this.ao = true;
        } else if (s().e()) {
            aI(true);
            this.ao = false;
        } else {
            aJ();
            this.ao = true;
        }
        return true;
    }

    @Override // defpackage.giy
    public final boolean G() {
        if (E()) {
            return false;
        }
        if (this.an) {
            if (PaneDescriptor.m(aF(), (PaneDescriptor) this.e.get(), this.ah)) {
                return false;
            }
            aH((PaneDescriptor) this.e.get(), false);
            this.ao = true;
        } else {
            aI(true);
            this.ao = false;
        }
        return true;
    }

    @Override // defpackage.giy
    public final boolean H(PaneDescriptor paneDescriptor) {
        if (r() && !bg(paneDescriptor)) {
            return false;
        }
        if (bg(paneDescriptor)) {
            bh(aG(), paneDescriptor, false);
            gir aG = aG();
            s().d(PaneDescriptor.b(aG), mN().c(aG), aG.aT(), null);
        } else {
            bh(q(), paneDescriptor, false);
            s().f();
        }
        aH(paneDescriptor, false);
        this.ao = true;
        return true;
    }

    @Override // defpackage.giy
    public final boolean J() {
        if (!this.an) {
            return F();
        }
        if (PaneDescriptor.m(aF(), (PaneDescriptor) this.e.get(), this.ah)) {
            return false;
        }
        if (F()) {
            return true;
        }
        aH((PaneDescriptor) this.e.get(), false);
        return true;
    }

    @Override // defpackage.gir
    public final int aK() {
        return 720;
    }

    @Override // defpackage.gir
    public final Optional aR(PaneDescriptor paneDescriptor) {
        if (PaneDescriptor.m(paneDescriptor, (PaneDescriptor) this.d.get(), this.ah)) {
            return Optional.ofNullable(this.ai);
        }
        if (PaneDescriptor.m(paneDescriptor, this.am, this.ah)) {
            return Optional.ofNullable(this.ak);
        }
        return Optional.empty();
    }

    @Override // defpackage.gir
    public final void aY(Object obj) {
        if (obj instanceof iwd) {
            iwd iwdVar = (iwd) obj;
            this.ai = iwdVar.a;
            this.aj = iwdVar.d;
            this.ak = iwdVar.b;
            this.am = iwdVar.f;
            this.ax = iwdVar.c;
            this.al = iwdVar.e;
            this.ao = iwdVar.g;
            this.ae = iwdVar.h;
            this.aw = true;
        }
    }

    @Override // defpackage.gir
    public final boolean bb() {
        return this.an;
    }

    @Override // defpackage.gir
    public final gad lv() {
        return (this.an || !this.ao) ? this.as : aG().lv();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        if (qX().getConfiguration().smallestScreenWidthDp >= 720) {
            inflate = layoutInflater.inflate(R.layout.library_split_fragment_sw720dp, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.library_split_fragment, viewGroup, false);
        }
        this.c = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.master_layout);
        if (qX().getConfiguration().smallestScreenWidthDp >= 840) {
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(qX().getDimensionPixelSize(R.dimen.master_layout_width_sw840dp), -1));
        } else if (qX().getConfiguration().smallestScreenWidthDp >= 720) {
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(qX().getDimensionPixelSize(R.dimen.master_layout_width_sw720dp), -1));
        }
        View findViewById = this.c.findViewById(R.id.detail_layout);
        boolean z = findViewById != null && findViewById.getVisibility() == 0;
        this.an = z;
        this.ao = this.ao || z;
        if (!this.aw) {
            this.ae = this.af.a && this.a.h();
        }
        if (!r()) {
            aI(false);
        }
        if (this.ao) {
            aH(aF(), true);
        }
        return this.c;
    }

    @Override // defpackage.giy
    public final /* synthetic */ void o() {
        throw null;
    }

    public final gir q() {
        return (gir) mN().f("master_fragment_tag");
    }

    final boolean r() {
        return !this.an && this.ao;
    }

    @Override // defpackage.gir
    public final Object aT() {
        iwc iwcVar = new iwc();
        if (r()) {
            iwcVar.a = this.ai;
            iwcVar.d = this.aj;
        } else {
            iwcVar.a = q().aT();
            iwcVar.d = mN().c(q());
        }
        if (this.ao) {
            iwcVar.b = aG().aT();
            iwcVar.c = s();
            iwcVar.f = aF();
            iwcVar.e = mN().c(aG());
        }
        iwcVar.g = Boolean.valueOf(this.ao);
        iwcVar.h = Boolean.valueOf(this.ae);
        Boolean bool = iwcVar.g;
        if (bool == null || iwcVar.h == null) {
            StringBuilder sb = new StringBuilder();
            if (iwcVar.g == null) {
                sb.append(" showingDetail");
            }
            if (iwcVar.h == null) {
                sb.append(" startedInOfflineMode");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new iwd(iwcVar.a, iwcVar.b, iwcVar.c, iwcVar.d, iwcVar.e, iwcVar.f, bool.booleanValue(), iwcVar.h.booleanValue());
    }

    private final void aH(PaneDescriptor paneDescriptor, boolean z) {
        Fragment$SavedState fragment$SavedState;
        boolean z2 = this.an;
        int i = R.id.master_layout;
        if (z2) {
            i = R.id.detail_layout;
        } else if (q() != null && !z) {
            this.ai = q().aT();
            this.aj = mN().c(q());
        }
        gir d = paneDescriptor.d();
        if (d.m == null) {
            d.af(new Bundle());
        }
        if (this.an) {
            d.m.putBoolean("needs_nested_header", true);
        }
        if (paneDescriptor == this.am && (fragment$SavedState = this.al) != null) {
            d.ah(fragment$SavedState);
        }
        dn k = mN().k();
        k.u(i, d, "detail_fragment_tag");
        k.i = 0;
        k.a();
    }
}
