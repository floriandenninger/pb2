package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xah {
    private final ypa a;
    private final PlayerAd b;
    private final xfn c;
    private final PlayerResponseModel d;
    private final xci e;
    private final xcf f;

    public xah(ypa ypaVar, PlayerAd playerAd, xfn xfnVar, PlayerResponseModel playerResponseModel, xci xciVar, xcf xcfVar) {
        ypaVar.getClass();
        this.a = ypaVar;
        this.b = playerAd;
        xfnVar.getClass();
        this.c = xfnVar;
        playerResponseModel.getClass();
        this.d = playerResponseModel;
        xciVar.getClass();
        this.e = xciVar;
        xcfVar.getClass();
        this.f = xcfVar;
    }

    private final void c(xaf xafVar, String str) {
        this.a.d(new xag(xafVar, this.c, this.e, this.d, this.b, str, this.f));
    }

    public final void a() {
        c(xaf.AD_VIDEO_ENDED, null);
    }

    public final void b(aign aignVar, String str) {
        aign aignVar2 = aign.NEW;
        int ordinal = aignVar.ordinal();
        if (ordinal == 4) {
            c(xaf.AD_VIDEO_PLAY_REQUESTED, str);
        } else {
            if (ordinal != 5) {
                return;
            }
            c(xaf.AD_VIDEO_PLAYING, str);
        }
    }
}
