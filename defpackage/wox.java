package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wox implements wnz, wof {
    public final abds a;
    public final abdt b;
    public acra c;
    private final Executor d;
    private final Map e;

    public wox(Executor executor, abds abdsVar, abdt abdtVar) {
        this.d = executor;
        abdsVar.getClass();
        this.a = abdsVar;
        abdtVar.getClass();
        this.b = abdtVar;
        this.e = new HashMap();
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        if (aignVar == aign.NEW) {
            this.e.clear();
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wnz
    public final anhy i(MediaAd mediaAd) {
        if (!this.e.containsKey(mediaAd.m)) {
            this.e.put(mediaAd.m, anfq.h(anaf.O(mediaAd), new amml() { // from class: wow
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    wox woxVar = wox.this;
                    MediaAd mediaAd2 = (MediaAd) obj;
                    if (TextUtils.isEmpty(mediaAd2.n())) {
                        return null;
                    }
                    String n = mediaAd2.n();
                    byte[] bArr = mediaAd2.h;
                    String z = mediaAd2.z();
                    String m = mediaAd2.m();
                    abdu b = woxVar.b.b();
                    b.s = true;
                    b.v(n);
                    if (bArr.length <= 0) {
                        zga.b("Ad Watch Next Request Missing Tracking Params. See b/22612847");
                    } else {
                        b.m(bArr);
                    }
                    if (true == TextUtils.isEmpty(z)) {
                        z = "";
                    }
                    b.e(z);
                    if (true == TextUtils.isEmpty(m)) {
                        m = "";
                    }
                    m.getClass();
                    b.c = m;
                    try {
                        WatchNextResponseModel d = woxVar.a.d(b);
                        acra acraVar = woxVar.c;
                        if (acraVar != null) {
                            acraVar.D(new acqx(d.d()));
                            woxVar.c.r(mediaAd2.m);
                        }
                        return d;
                    } catch (aasx e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                        sb.append("Error making WatchNextRequest: ");
                        sb.append(valueOf);
                        whu.l(null, sb.toString());
                        return null;
                    }
                }
            }, this.d));
        }
        return (anhy) this.e.get(mediaAd.m);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
