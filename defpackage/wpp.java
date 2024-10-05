package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpp implements wof {
    public final ypa a;
    public zih b;

    public wpp(ypa ypaVar) {
        this.a = ypaVar;
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        zih zihVar;
        if (aignVar != aign.INTERSTITIAL_REQUESTED || (zihVar = this.b) == null || zihVar.a() == null) {
            return;
        }
        acsx acsxVar = (acsx) this.b.a();
        aone createBuilder = asmb.a.createBuilder();
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmbVar.b |= 131072;
        asmbVar.n = true;
        acsxVar.a((asmb) createBuilder.build());
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
