package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wvx implements anhh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ PlayerResponseModel c;
    final /* synthetic */ String d;
    final /* synthetic */ MediaAd e;
    final /* synthetic */ wvy f;

    public wvx(wvy wvyVar, String str, String str2, PlayerResponseModel playerResponseModel, String str3, MediaAd mediaAd) {
        this.f = wvyVar;
        this.a = str;
        this.b = str2;
        this.c = playerResponseModel;
        this.d = str3;
        this.e = mediaAd;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
        if (watchNextResponseModel == null) {
            return;
        }
        int i = watchNextResponseModel.a.b;
        if ((i & 64) == 0 || (i & 128) == 0 || !((wwz) this.f.c.get()).g().contains(this.a)) {
            return;
        }
        ajoy ajoyVar = (ajoy) this.f.b.get();
        xeo a = xeo.a(this.b, this.c);
        final String str = this.b;
        final PlayerResponseModel playerResponseModel = this.c;
        final String str2 = this.d;
        final String str3 = this.a;
        final MediaAd mediaAd = this.e;
        ajoyVar.w(8, a, new wwc() { // from class: wvw
            /* JADX WARN: Removed duplicated region for block: B:15:0x016b  */
            @Override // defpackage.wwc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List a() {
                /*
                    Method dump skipped, instructions count: 367
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wvw.a():java.util.List");
            }
        });
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        afsi.b(2, 1, "[Control flow] Error resolving WatchNextResponse Future for content video companion opportunity");
    }
}
