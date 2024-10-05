package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xlh implements aijo {
    public final MediaAd a;

    public xlh(MediaAd mediaAd) {
        this.a = mediaAd;
        zhq.m(mediaAd.g);
    }

    @Override // defpackage.aijo
    public final void qZ(aijr aijrVar) {
        aamn aamnVar = ((RemoteVideoAd) this.a).d;
        final int dL = amkq.dL(Integer.parseInt(aamnVar != null ? aamnVar.g : aamn.UNKNOWN.g));
        if (dL == 0) {
            dL = 1;
        }
        MediaAd mediaAd = this.a;
        String str = mediaAd.i;
        final int i = true != ((RemoteVideoAd) mediaAd).a ? 1 : 2;
        aijrVar.w = true;
        aijrVar.W = 3;
        aijrVar.V = dL;
        aijrVar.c = str;
        aijrVar.X = i;
        aijrVar.L = mediaAd.g;
        aijrVar.d(new aijq() { // from class: xlg
            @Override // defpackage.aijq
            public final void a(afpi afpiVar) {
                xlh xlhVar = xlh.this;
                int i2 = dL;
                int i3 = i;
                afpiVar.d("isAdRequest", true);
                afpiVar.b("adType", 2L);
                afpiVar.b("adSystem", i2 - 1);
                afpiVar.b("instreamType", i3 - 1);
                afpiVar.c("hostVideoId", xlhVar.a.g);
            }
        });
    }
}
