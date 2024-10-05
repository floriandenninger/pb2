package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijt implements ayrv {
    private final aaqz a;
    private final afsy b;
    private final aapf c;
    private final Set d;
    private final String e;
    private final long f;

    public aijt(aaqz aaqzVar, afsy afsyVar, aapf aapfVar, Set set, String str, long j) {
        this.a = aaqzVar;
        this.b = afsyVar;
        this.c = aapfVar;
        this.d = set;
        this.e = str;
        this.f = j;
    }

    @Override // defpackage.ayrv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aryr aryrVar;
        asbm asbmVar = (asbm) obj;
        int i = asbmVar.b;
        if (i != 4) {
            if (i == 2) {
                aryrVar = (aryr) asbmVar.c;
            } else {
                aryrVar = aryr.a;
            }
            if ((aryrVar.c & 64) != 0) {
                aaqz aaqzVar = this.a;
                afsx c = this.b.c();
                aqzg aqzgVar = aryrVar.K;
                if (aqzgVar == null) {
                    aqzgVar = aqzg.a;
                }
                arnd arndVar = aryrVar.d;
                if (arndVar == null) {
                    arndVar = arnd.a;
                }
                aaqzVar.a(c, aqzgVar, arndVar);
            }
            long j = this.f;
            PlayerResponseModel playerResponseModel = new PlayerResponseModel(aryrVar, j, PlayerResponseModel.e(this.c, aryrVar, j, this.e));
            for (aapu aapuVar : this.d) {
                if (aapuVar != null) {
                    aapuVar.a(playerResponseModel);
                }
            }
            return playerResponseModel;
        }
        throw new ExecutionException((String) asbmVar.c, null);
    }
}
