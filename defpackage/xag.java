package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class xag extends ynz {
    private final xaf a;
    private final xfn b;
    private final xci d;
    private final PlayerResponseModel e;
    private final xcf f;
    private final PlayerAd g;
    private final String h;

    public xag(xaf xafVar, xfn xfnVar, xci xciVar, PlayerResponseModel playerResponseModel, PlayerAd playerAd, String str, xcf xcfVar) {
        xafVar.getClass();
        this.a = xafVar;
        this.b = xfnVar;
        this.d = xciVar;
        this.e = playerResponseModel;
        this.g = playerAd;
        this.h = str;
        this.f = xcfVar;
    }

    public xaf a() {
        return this.a;
    }

    public xfn b() {
        return this.b;
    }

    public PlayerAd c() {
        return this.g;
    }

    public String d() {
        PlayerAd playerAd = this.g;
        if (playerAd == null) {
            return null;
        }
        return playerAd.m;
    }

    public String e() {
        return this.h;
    }
}
