package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijv implements afwx {
    private final aapf a;
    private final Set b;
    private final afwx c;
    private final String d;
    private final long e;

    public aijv(aapf aapfVar, Set set, afwx afwxVar, String str, long j) {
        this.a = aapfVar;
        this.b = set;
        this.c = afwxVar;
        this.d = str;
        this.e = j;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.c.kY(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aryr aryrVar = (aryr) obj;
        long j = this.e;
        PlayerResponseModel playerResponseModel = new PlayerResponseModel(aryrVar, j, PlayerResponseModel.e(this.a, aryrVar, j, this.d));
        for (aapu aapuVar : this.b) {
            if (aapuVar != null) {
                aapuVar.a(playerResponseModel);
            }
        }
        this.c.kZ(playerResponseModel);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
