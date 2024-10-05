package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iwx implements afwx {
    final /* synthetic */ iwy a;

    public iwx(iwy iwyVar) {
        this.a = iwyVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.a.d.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        whu.K(this.a.a.ap, R.string.edit_playlist_done, 0);
        PaneDescriptor ca = evr.ca(this.a.a.ag);
        ixc ixcVar = this.a.a;
        ixcVar.q(new iwz(ixcVar, ca));
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
