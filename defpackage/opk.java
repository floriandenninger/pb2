package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class opk implements mkc {
    public final shf a;
    public final axpg b;
    public final aok c;
    public int d = 0;
    private final akbu e;
    private final acqz f;

    public opk(shf shfVar, akbu akbuVar, acqz acqzVar, axpg axpgVar, aok aokVar) {
        this.a = shfVar;
        this.e = akbuVar;
        this.f = acqzVar;
        this.b = axpgVar;
        this.c = aokVar;
    }

    @Override // defpackage.mkc
    public final akbl a() {
        return new opj(this, 0);
    }

    @Override // defpackage.mkc
    public final void b(PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null || paneDescriptor.e() == null) {
            return;
        }
        aplt apltVar = (aplt) paneDescriptor.e().pX(BrowseEndpointOuterClass.browseEndpoint);
        if ((apltVar.b & 1) == 0 || !"FElibrary".equals(apltVar.c)) {
            return;
        }
        ynm.n(this.c, ((ywr) this.b.get()).b(mjy.j), oph.a, ynm.b);
    }

    @Override // defpackage.mkc
    public final void c(zfi zfiVar) {
        ynm.p(this.c, ((ywr) this.b.get()).a(), oph.c, new opg(this, zfiVar, 1));
    }

    @Override // defpackage.mkc
    public final void d(zfi zfiVar) {
        ynm.p(this.c, ((ywr) this.b.get()).a(), oph.d, new opg(this, zfiVar, 0));
    }

    @Override // defpackage.mkc
    public final void e() {
        this.d++;
    }

    @Override // defpackage.mkc
    public final void f(View view, aths athsVar) {
        arej arejVar;
        if ((athsVar.b & 1024) != 0) {
            athr athrVar = athsVar.h;
            if (athrVar == null) {
                athrVar = athr.a;
            }
            if (athrVar.b == 102716411) {
                arejVar = (arej) athrVar.c;
            } else {
                arejVar = arej.a;
            }
        } else {
            arejVar = null;
        }
        arej arejVar2 = arejVar;
        if (view == null || arejVar2 == null) {
            return;
        }
        this.e.c(arejVar2, view, athsVar, this.f.mM(), new opj(this, 1));
    }

    @Override // defpackage.mkc
    public final void g(mka mkaVar, View view, akbl akblVar) {
        this.e.c((arej) mkaVar.b.get(), view, mkaVar.a, this.f.mM(), akblVar);
    }
}
