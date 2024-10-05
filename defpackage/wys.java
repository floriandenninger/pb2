package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wys {
    public final aaea a;
    public final wym b;

    public wys(aaea aaeaVar, wym wymVar) {
        this.a = aaeaVar;
        this.b = wymVar;
    }

    public static long a(MediaAd mediaAd, int i) {
        amkq.E(true);
        return ((mediaAd.c() * 1000) * i) / 4;
    }
}
