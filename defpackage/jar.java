package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jar implements afwx {
    final /* synthetic */ afwx a;
    final /* synthetic */ jas b;

    public jar(jas jasVar, afwx afwxVar) {
        this.b = jasVar;
        this.a = afwxVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.kY(cnqVar);
    }

    @Override // defpackage.cnl
    public final void kZ(Object obj) {
        if (obj instanceof WatchNextResponseModel) {
            WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
            asfc asfcVar = watchNextResponseModel.a;
            this.b.a.a(asfcVar);
            if (asfcVar.u.size() != 0) {
                this.b.b.b(asfcVar.u);
            }
            if (this.b.c.h()) {
                ((nqp) this.b.c.c()).k(watchNextResponseModel);
            }
        }
        this.a.kZ(obj);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
