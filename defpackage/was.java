package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class was implements wan {
    private final ci a;
    private final ypa b;
    private final aaea c;
    private final slv d;
    private final acra e;
    private bv f;
    private bv g;
    private boolean i = true;
    private war h = war.WL;

    public was(ci ciVar, ypa ypaVar, slv slvVar, acra acraVar, aaea aaeaVar) {
        this.a = ciVar;
        this.b = ypaVar;
        this.d = slvVar;
        this.c = aaeaVar;
        this.e = acraVar;
    }

    private final void o(bv bvVar, Bundle bundle) {
        bundle.putBundle("fragment_args", bvVar.m);
        bundle.putParcelable("fragment_saved_state", this.a.getSupportFragmentManager().c(bvVar));
    }

    private static final void p(dn dnVar, String str, Bundle bundle, bv bvVar) {
        bvVar.ah((Fragment$SavedState) bundle.getParcelable("fragment_saved_state"));
        bvVar.af(bundle.getBundle("fragment_args"));
        dnVar.r(bvVar, str);
        dnVar.d();
    }

    @Override // defpackage.wao
    public final void aG(apxf apxfVar) {
        wao waoVar = (wao) n();
        if (waoVar != null) {
            waoVar.aG(apxfVar);
        }
    }

    @Override // defpackage.wbg
    public final void aI(int i, int i2, int i3) {
        wbg wbgVar = (wbg) n();
        if (wbgVar != null) {
            wbgVar.aI(i, i2, i3);
        }
    }

    @Override // defpackage.war
    public final void b() {
        this.b.d(new wap());
        this.h.b();
    }

    @Override // defpackage.war
    public final void c() {
        this.h.c();
    }

    @Override // defpackage.war
    public final void d() {
        this.b.d(new wap());
        this.h.d();
    }

    @Override // defpackage.wan
    public final void e() {
        this.i = true;
    }

    @Override // defpackage.wan
    public final void f() {
        this.i = false;
    }

    @Override // defpackage.wan
    public final void g() {
        this.g = null;
    }

    @Override // defpackage.wan
    public final void h() {
        this.f = null;
        this.d.a();
    }

    @Override // defpackage.wan
    public final void i(war warVar) {
        if (warVar == null) {
            warVar = war.WL;
        }
        this.h = warVar;
    }

    @Override // defpackage.wan
    public final void j(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (this.i || m() != null) {
            return;
        }
        boolean z2 = true;
        amkq.E(charSequence != null && charSequence.length() > 0);
        amkq.E(i > 0);
        amkq.E(i2 >= 0 && i2 < 13);
        amkq.E(i3 > 0 && i3 <= 31);
        if (z && (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0))) {
            z2 = false;
        }
        amkq.E(z2);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("birthday_picker_title", charSequence);
        bundle.putInt("birthday_picker_year", i);
        bundle.putInt("birthday_picker_month", i2);
        bundle.putInt("birthday_picker_day", i3);
        bundle.putBoolean("birthday_picker_hide_year", z);
        wae waeVar = new wae();
        waeVar.af(bundle);
        this.g = waeVar;
        dn k = this.a.getSupportFragmentManager().k();
        k.r(this.g, "birthday_picker_fragment");
        k.d();
    }

    @Override // defpackage.wan
    public final void k(apxf apxfVar) {
        apxfVar.getClass();
        amkq.E(apxfVar.pY(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint));
        if (this.i || n() != null) {
            return;
        }
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) apxfVar.pX(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint);
        byte[] I = channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.c.I();
        int aE = anaf.aE(channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.d);
        if (aE == 0) {
            aE = 1;
        }
        this.f = wam.aL(I, aE, this.e);
        dn k = this.a.getSupportFragmentManager().k();
        k.r(this.f, "channel_creation_fragment");
        k.d();
        this.e.d(acsb.b(124448), apxfVar, null);
    }

    @Override // defpackage.wan
    public final void l() {
        aoub aoubVar = this.c.a().x;
        if (aoubVar == null) {
            aoubVar = aoub.a;
        }
        if (!aoubVar.b && !this.i && n() != null) {
            Bundle bundle = new Bundle();
            o(n(), bundle);
            dn k = this.a.getSupportFragmentManager().k();
            k.m(this.f);
            wam wamVar = new wam();
            this.f = wamVar;
            p(k, "channel_creation_fragment", bundle, wamVar);
        }
        if (this.i || m() == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        o(m(), bundle2);
        dn k2 = this.a.getSupportFragmentManager().k();
        k2.m(this.g);
        wae waeVar = new wae();
        this.g = waeVar;
        p(k2, "birthday_picker_fragment", bundle2, waeVar);
    }

    final bv m() {
        bv bvVar = this.g;
        if (bvVar != null) {
            return bvVar;
        }
        bv bvVar2 = (bv) this.a.getSupportFragmentManager().f("birthday_picker_fragment");
        this.g = bvVar2;
        return bvVar2;
    }

    @Override // defpackage.war
    public final void mG() {
        this.h.mG();
    }

    final bv n() {
        bv bvVar = this.f;
        if (bvVar != null) {
            return bvVar;
        }
        bv bvVar2 = (bv) this.a.getSupportFragmentManager().f("channel_creation_fragment");
        this.f = bvVar2;
        return bvVar2;
    }
}
