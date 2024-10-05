package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hmv extends afww {
    final /* synthetic */ hmw a;

    /* JADX INFO: Access modifiers changed from: protected */
    public hmv(hmw hmwVar) {
        this.a = hmwVar;
    }

    @Override // defpackage.afww, defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("SCMusicController: Error getting player response", cnqVar.getCause());
        e(cnqVar);
    }

    @Override // defpackage.afww, defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
        o(playerResponseModel);
        this.a.k(playerResponseModel);
    }
}
