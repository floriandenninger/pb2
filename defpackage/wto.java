package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wto {
    final /* synthetic */ wtp a;

    public wto(wtp wtpVar) {
        this.a = wtpVar;
    }

    public final PlayerAd a() {
        return this.a.e;
    }

    public final PlayerResponseModel b() {
        return this.a.d;
    }

    public final String c() {
        return this.a.c;
    }

    public final void d(xce xceVar) {
        this.a.f = null;
        int a = xev.a(xceVar);
        if (a == 0) {
            this.a.qv(0);
            wtp wtpVar = this.a;
            wtpVar.a.l(wtpVar.b);
        } else {
            if (a == 1) {
                this.a.a.k(new wxd("Custom display error"));
                return;
            }
            if (a == 2) {
                if (this.a.e.qB() <= 0) {
                    wtp wtpVar2 = this.a;
                    wtpVar2.g.b(wtpVar2.b, 2);
                    return;
                }
                return;
            }
            wtr wtrVar = this.a.a;
            StringBuilder sb = new StringBuilder(53);
            sb.append("Unrecognized scenario for custom display: ");
            sb.append(a);
            wtrVar.k(new wxd(sb.toString()));
        }
    }
}
