package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gap implements gbh {
    public boolean a = false;
    public BottomUiContainer b;
    public gbi c;
    private final gov e;

    public gap(aadw aadwVar, jgp jgpVar, byte[] bArr, byte[] bArr2) {
        long j;
        apwy b = aadwVar.b();
        if (b != null) {
            atej atejVar = b.k;
            if (((atejVar == null ? atej.a : atejVar).b & 32768) != 0) {
                atej atejVar2 = b.k;
                audu auduVar = (atejVar2 == null ? atej.a : atejVar2).l;
                j = (auduVar == null ? audu.a : auduVar).b;
                this.e = jgpVar.b(fav.RATE_LIMIT_PROMO_LAST_ALLOWED, j, TimeUnit.SECONDS);
            }
        }
        j = d;
        this.e = jgpVar.b(fav.RATE_LIMIT_PROMO_LAST_ALLOWED, j, TimeUnit.SECONDS);
    }

    private final int k() {
        gbi gbiVar = this.c;
        if (gbiVar != null) {
            return gbiVar.a();
        }
        return 0;
    }

    @Override // defpackage.gbh
    public final BottomUiContainer a() {
        return this.b;
    }

    @Override // defpackage.gbh
    public final gbi b() {
        return this.c;
    }

    @Override // defpackage.gbh
    public final void c(boolean z) {
        int k = k();
        if (k == 1) {
            if (!z) {
                return;
            }
        } else if (k == 0) {
            return;
        }
        this.b.i(3);
    }

    @Override // defpackage.gbh
    public final void d(BottomUiContainer bottomUiContainer) {
        if (this.a) {
            return;
        }
        this.a = true;
        bottomUiContainer.getClass();
        this.b = bottomUiContainer;
    }

    @Override // defpackage.gbh
    public final void e(gbi gbiVar) {
    }

    @Override // defpackage.gbh
    public final void f() {
        this.c = null;
    }

    @Override // defpackage.gbh
    public final void g(gbi gbiVar) {
        this.c = gbiVar;
        if (gbiVar.b()) {
            this.e.a();
        }
    }

    @Override // defpackage.gbh
    public final void h(int i) {
        yny.z(this.b, yny.k(i), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.gbh
    public final void i(gbf gbfVar) {
        this.b.a = gbfVar;
    }

    @Override // defpackage.gbh
    public final boolean j(gbi gbiVar) {
        return (gbiVar.a() == 1 || k() != 1) && !(gbiVar.b() && !this.e.b());
    }
}
