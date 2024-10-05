package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgd {
    public boolean a;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public byte[] h = PlayerAd.f;
    public aamn i = aamn.UNKNOWN;
    public Uri j;
    public PlayerResponseModel k;
    public apxf l;
    public asgk m;

    public final RemoteVideoAd a() {
        return new RemoteVideoAd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }
}
