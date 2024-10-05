package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aijf implements afwx {
    final /* synthetic */ aijg a;
    private final afwx b;
    private final acsx c;

    public aijf(aijg aijgVar, afwx afwxVar, acsx acsxVar) {
        this.a = aijgVar;
        this.b = afwxVar;
        this.c = acsxVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.kY(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
        aijg aijgVar = this.a;
        afwx afwxVar = this.b;
        acsx acsxVar = this.c;
        aijgVar.a.d(new ahdm());
        if (acsxVar != null) {
            acsxVar.c("wn_r");
        }
        afwxVar.kZ(watchNextResponseModel);
    }

    @Override // defpackage.afwx
    public final void lK() {
        this.b.lK();
    }
}
