package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gle {
    public final ci a;
    public final azrw b;
    public final azrw c;

    public gle(ci ciVar, azrw azrwVar, azrw azrwVar2) {
        this.a = ciVar;
        this.b = azrwVar;
        this.c = azrwVar2;
    }

    public static boolean a(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return false;
        }
        return ahbx.j(playerResponseModel.q());
    }

    public static boolean b(PlayerResponseModel playerResponseModel, boolean z, fhg fhgVar) {
        return playerResponseModel != null && c(playerResponseModel) && z && fhgVar != null && !fhgVar.g() && fhgVar.h();
    }

    public static boolean c(PlayerResponseModel playerResponseModel) {
        atvq atvqVar;
        if (playerResponseModel == null) {
            return true;
        }
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        if (videoStreamingData != null && (videoStreamingData.w() || videoStreamingData.H())) {
            return false;
        }
        aryi q = playerResponseModel.q();
        if (!ahbx.j(q)) {
            if (q != null) {
                aryf aryfVar = q.h;
                if (aryfVar == null) {
                    aryfVar = aryf.a;
                }
                if (aryfVar.b == 151635310) {
                    atvqVar = (atvq) aryfVar.c;
                } else {
                    atvqVar = atvq.a;
                }
                if (atvqVar.b) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean d(aixh aixhVar) {
        return (aixhVar == null || aixhVar.c() == null) ? false : true;
    }
}
