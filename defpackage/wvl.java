package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Locale;

/* compiled from: PG */
@wux(a = xdu.class)
/* loaded from: classes4.dex */
public final class wvl implements wuy, wof {
    private String a;
    private long b;
    private final /* synthetic */ int c;

    public wvl(int i) {
        this.c = i;
    }

    @Override // defpackage.wuy
    public final String a() {
        return this.c != 0 ? "0" : "0.0";
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
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
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        int i = this.c;
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }

    @Override // defpackage.wuy
    public final String b(xcp xcpVar) {
        if (this.c == 0) {
            if (!TextUtils.equals(((MediaAd) xcpVar.c(xdu.class)).m, this.a) || this.b <= 0) {
                return "0.0";
            }
            Locale locale = Locale.US;
            double d = this.b;
            Double.isNaN(d);
            return String.format(locale, "%.1f", Double.valueOf(d / 1000.0d));
        }
        if (TextUtils.equals(((MediaAd) xcpVar.c(xdu.class)).m, this.a)) {
            long j = this.b;
            if (j > 0) {
                return Long.toString(j);
            }
        }
        return "0";
    }
}
