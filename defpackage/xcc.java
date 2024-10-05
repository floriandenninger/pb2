package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcc extends xca {
    private final wmv i;
    private final PlayerAd j;
    private boolean k;

    public xcc(xev xevVar, PlayerAd playerAd, woz wozVar, boolean z, boolean z2, wmv wmvVar) {
        super(xevVar, 1000 * playerAd.c(), z, z2, wozVar);
        this.j = playerAd;
        this.i = wmvVar;
        wmvVar.b = this;
        this.k = false;
    }

    @Override // defpackage.tez
    public final Set b(tfa tfaVar) {
        return afxf.d(xgt.a(this.j, tfaVar), a);
    }

    @Override // defpackage.xca
    public final tdt f(int i) {
        this.e = this.i.h(i);
        return this.e;
    }

    @Override // defpackage.xca
    public final void h() {
        this.e = this.i.a();
    }

    @Override // defpackage.xca
    public final void i() {
        this.e = this.i.b();
    }

    @Override // defpackage.xca
    public final void j() {
        this.e = this.i.e();
    }

    @Override // defpackage.xca
    public final void k() {
        this.e = this.i.f();
    }

    @Override // defpackage.xca
    public final void l() {
        this.e = this.i.g();
    }

    @Override // defpackage.xca
    public final void m() {
        this.e = this.i.i();
    }

    @Override // defpackage.xca
    public final void n() {
        this.i.k();
    }

    @Override // defpackage.xca
    public final void o(VisibilityChangeEventData visibilityChangeEventData) {
        this.i.l(visibilityChangeEventData);
    }

    @Override // defpackage.xca
    public final void p() {
        this.i.m();
        this.e = this.i.a();
    }

    @Override // defpackage.xca
    public final void q(aigf aigfVar) {
        if (!this.g && aigfVar == aigf.BACKGROUND) {
            this.g = true;
        } else if (this.g && aigfVar != aigf.BACKGROUND) {
            this.g = false;
        }
        if (this.f || aigfVar != aigf.FULLSCREEN) {
            if (!this.f || aigfVar == aigf.FULLSCREEN) {
                return;
            }
            this.e = this.i.c();
            this.f = false;
            return;
        }
        this.e = this.i.d();
        this.f = true;
    }

    @Override // defpackage.xca
    public final void r(long j) {
        this.b = j;
        if (this.k || !this.j.ae() || this.j.c() <= 7 || j < 5000) {
            return;
        }
        this.e = this.i.a.a(tfa.SKIP_SHOWN);
        this.k = true;
    }

    @Override // defpackage.xca
    public final void s(int i, int i2, int i3, int i4) {
        this.i.n(i, i2, i3, i4);
    }
}
