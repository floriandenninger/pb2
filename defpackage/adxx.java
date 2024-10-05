package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxx implements amnv {
    public final azrw a;
    public phk b;
    private final axpg c;
    private final SharedPreferences d;
    private final Map e = new HashMap();
    private final aadw f;

    public adxx(aadw aadwVar, azrw azrwVar, axpg axpgVar, SharedPreferences sharedPreferences) {
        this.f = aadwVar;
        this.a = azrwVar;
        this.c = axpgVar;
        this.d = sharedPreferences;
    }

    @Override // defpackage.amnv
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized phg get() {
        phk adxyVar;
        atej atejVar = this.f.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        aquu aquuVar = atejVar.n;
        if (aquuVar == null) {
            aquuVar = aquu.a;
        }
        int ba = aocz.ba(aquuVar.c);
        if (ba != 0 && ba == 2) {
            return null;
        }
        azrw azrwVar = this.a;
        if (azrwVar == null) {
            return null;
        }
        File file = (File) azrwVar.get();
        if (file == null) {
            return null;
        }
        phg phgVar = (phg) this.e.get(file);
        if (phgVar == null) {
            afhp.a(new File(file, "exo"));
            File file2 = new File(file, "exo");
            atej atejVar2 = this.f.b().k;
            if (atejVar2 == null) {
                atejVar2 = atej.a;
            }
            aquu aquuVar2 = atejVar2.n;
            if (aquuVar2 == null) {
                aquuVar2 = aquu.a;
            }
            int ba2 = aocz.ba(aquuVar2.c);
            if (ba2 == 0) {
                ba2 = 1;
            }
            if (ba2 - 1 == 3) {
                azrw azrwVar2 = this.a;
                uqa uqaVar = azrwVar2 != null ? new uqa(azrwVar2, 6) : null;
                aqut aqutVar = aquuVar2.d;
                if (aqutVar == null) {
                    aqutVar = aqut.a;
                }
                aqut aqutVar2 = aquuVar2.e;
                if (aqutVar2 == null) {
                    aqutVar2 = aqut.a;
                }
                adxyVar = new adxy(uqaVar, aqutVar, aqutVar2);
                this.b = adxyVar;
            } else {
                long aa = wbs.aa(aquuVar2.b, 67108864L);
                long aa2 = wbs.aa(aquuVar2.b, 268435456L);
                double H = yjk.H();
                Double.isNaN(H);
                if (H * 0.1d > aa2) {
                    aa = aa2;
                }
                adxyVar = new phu(aa);
                this.b = adxyVar;
            }
            phgVar = new phy(file2, adxyVar, aquuVar.f ? ((ajkn) this.c.get()).e(this.d).getEncoded() : null, aquuVar.g);
            this.e.put(file, phgVar);
        }
        return phgVar;
    }
}
