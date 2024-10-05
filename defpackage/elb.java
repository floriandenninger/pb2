package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class elb extends wwk implements eki {
    private boolean j;

    public elb(azrw azrwVar, ekm ekmVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, whu whuVar, byte[] bArr, byte[] bArr2) {
        super(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10);
        ekmVar.a(this);
    }

    @Override // defpackage.wwk, defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        if (this.j) {
            return;
        }
        super.f(aignVar, playerResponseModel, aixhVar, str, str2);
    }

    @Override // defpackage.wwk, defpackage.woj
    public final void i(PlayerResponseModel playerResponseModel) {
        if (this.j) {
            return;
        }
        super.i(playerResponseModel);
    }

    @Override // defpackage.eki
    public final void n(ekh ekhVar) {
    }

    @Override // defpackage.eki
    public final void o(ekj ekjVar) {
        this.j = true;
    }

    @Override // defpackage.eki
    public final void s() {
        this.j = false;
    }
}
