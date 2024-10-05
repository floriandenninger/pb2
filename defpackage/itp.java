package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class itp implements afwx {
    final /* synthetic */ afwx a;
    final /* synthetic */ itq b;

    public itp(itq itqVar, afwx afwxVar) {
        this.b = itqVar;
        this.a = afwxVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.kY(cnqVar);
    }

    @Override // defpackage.cnl
    public final void kZ(Object obj) {
        if (obj instanceof BrowseResponseModel) {
            this.b.a.b(((BrowseResponseModel) obj).a);
        }
        this.a.kZ(obj);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
