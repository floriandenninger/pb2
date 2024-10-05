package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.PlayerAd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xly extends xlk {
    private final xhi a;
    private final InstreamAdBreak b;
    private final PlayerAd c;
    private boolean d;
    private boolean e;

    public xly(xhi xhiVar, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        this.a = xhiVar;
        instreamAdBreak.getClass();
        this.b = instreamAdBreak;
        playerAd.getClass();
        this.c = playerAd;
    }

    private final void e(long j, String str) {
        if (!this.d) {
            this.a.f(this.b.e());
            this.d = true;
        }
        if (this.e || !TextUtils.equals(str, this.c.m)) {
            return;
        }
        long c = this.c.c() * 1000;
        if (j < (-1000) + c || j > c || this.e) {
            return;
        }
        this.a.f(this.b.d());
        this.e = true;
    }

    @Override // defpackage.xlk
    public final void a() {
    }

    @Override // defpackage.xlk
    public final void b() {
    }

    @Override // defpackage.xlk
    public final void c(long j, String str) {
        e(j, str);
    }

    @Override // defpackage.xlk
    public final void d(aheg ahegVar) {
        if (ahegVar.j()) {
            e(ahegVar.e(), ahegVar.i());
        }
    }
}
