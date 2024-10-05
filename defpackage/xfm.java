package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfm {
    private static final PlaybackTrackingModel a = new PlaybackTrackingModel(aryj.a);

    public static PlayerResponseModel a(PlayerAd playerAd) {
        if (playerAd.g() != null) {
            return playerAd.g();
        }
        return new PlayerResponseModel(playerAd.e(), playerAd.f(), playerAd.l);
    }

    public static PlayerResponseModel b(aapf aapfVar, aoya aoyaVar, PlayerConfigModel playerConfigModel) {
        aoyaVar.getClass();
        aone createBuilder = aryv.a.createBuilder();
        for (aoyb aoybVar : aoyaVar.b) {
            if (!aoybVar.d.isEmpty() && !TextUtils.equals(aoybVar.d, "null/null") && !aoybVar.e.isEmpty()) {
                aong aongVar = (aong) aqxz.b.createBuilder();
                String trim = aoybVar.e.trim();
                aongVar.copyOnWrite();
                aqxz aqxzVar = (aqxz) aongVar.instance;
                trim.getClass();
                aqxzVar.c |= 2;
                aqxzVar.e = trim;
                String str = aoybVar.d;
                aongVar.copyOnWrite();
                aqxz aqxzVar2 = (aqxz) aongVar.instance;
                str.getClass();
                aqxzVar2.c |= 4;
                aqxzVar2.f = str;
                int i = aoybVar.b;
                aongVar.copyOnWrite();
                aqxz aqxzVar3 = (aqxz) aongVar.instance;
                aqxzVar3.c |= 64;
                aqxzVar3.j = i;
                int i2 = aoybVar.c;
                aongVar.copyOnWrite();
                aqxz aqxzVar4 = (aqxz) aongVar.instance;
                aqxzVar4.c |= 32;
                aqxzVar4.i = i2;
                createBuilder.copyOnWrite();
                aryv aryvVar = (aryv) createBuilder.instance;
                aqxz aqxzVar5 = (aqxz) aongVar.build();
                aqxzVar5.getClass();
                aryvVar.b();
                aryvVar.d.add(aqxzVar5);
            }
        }
        if (Collections.unmodifiableList(((aryv) createBuilder.instance).d).isEmpty()) {
            return null;
        }
        return new PlayerResponseModel(aapfVar.d((aryv) createBuilder.build(), null, aoyaVar.c), a, playerConfigModel);
    }
}
