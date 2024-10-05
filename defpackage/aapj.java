package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aapj {
    public final PlayerResponseModel a;
    private final awhp b;

    public aapj(awhp awhpVar, PlayerResponseModel playerResponseModel) {
        this.b = awhpVar;
        this.a = playerResponseModel;
    }

    public final CharSequence b() {
        aqyg aqygVar = this.b.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    public static aapj a(aryi aryiVar, long j, aapf aapfVar) {
        awhp awhpVar;
        aryr aryrVar;
        int bG;
        int bG2;
        if (aryiVar != null && (((bG = anaf.bG(aryiVar.c)) != 0 && bG == 3) || ((bG2 = anaf.bG(aryiVar.c)) != 0 && bG2 == 7))) {
            aryh aryhVar = aryiVar.g;
            if (aryhVar == null) {
                aryhVar = aryh.a;
            }
            if (aryhVar.b == 86164011) {
                aryh aryhVar2 = aryiVar.g;
                if (aryhVar2 == null) {
                    aryhVar2 = aryh.a;
                }
                if (aryhVar2.b == 86164011) {
                    awhpVar = (awhp) aryhVar2.c;
                } else {
                    awhpVar = awhp.a;
                }
                if (awhpVar != null || awhpVar.b.d() <= 0 || (aryrVar = (aryr) aarr.c(awhpVar.b.I(), aryr.a)) == null) {
                    return null;
                }
                PlayerResponseModel playerResponseModel = new PlayerResponseModel(aryrVar, j);
                if (aapfVar != null) {
                    playerResponseModel = new PlayerResponseModel(aryrVar, j, aapfVar);
                }
                return new aapj(awhpVar, playerResponseModel);
            }
        }
        awhpVar = null;
        if (awhpVar != null) {
        }
        return null;
    }
}
