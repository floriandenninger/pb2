package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnp implements xci {
    public final ypa a;
    private final woh b;
    private final wno c;
    private final wyn d;
    private apxf f;
    private xgh g;
    private xev h;
    private xev i;
    private xeo j;
    private final aadw k;
    private final wpl l;
    private final ajoy m;

    public wnp(woh wohVar, wno wnoVar, wyn wynVar, ajoy ajoyVar, aadw aadwVar, wpl wplVar, ypa ypaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = wohVar;
        this.c = wnoVar;
        this.d = wynVar;
        this.m = ajoyVar;
        this.k = aadwVar;
        this.l = wplVar;
        this.a = ypaVar;
    }

    private final void f(xce xceVar) {
        int a = xev.a(xceVar);
        if (wbs.B(this.k)) {
            this.c.f(this.j, this.g, this.i, a);
        }
        this.c.f(this.j, this.g, this.h, a);
        xgh xghVar = this.g;
        if (xghVar != null) {
            this.c.m(this.j, xghVar);
            this.c.q(this.j, this.g);
        }
    }

    public final void a(PlayerResponseModel playerResponseModel, RemoteVideoAd remoteVideoAd, xce xceVar) {
        this.a.d(new xad(remoteVideoAd, xceVar));
        new xah(this.a, remoteVideoAd, xfn.PRE_ROLL, playerResponseModel, this, xcf.a).a();
        c(xceVar);
    }

    public final void b(RemoteVideoAd remoteVideoAd, String str, PlayerResponseModel playerResponseModel, boolean z) {
        xev xevVar;
        this.f = remoteVideoAd.s;
        if (wbs.B(this.k)) {
            if (this.h != null && (xevVar = this.i) != null) {
                if (TextUtils.equals(remoteVideoAd.m, xevVar.a)) {
                    return;
                } else {
                    f(xce.VIDEO_ERROR);
                }
            }
            xgh c = wyt.c(this.m.x(), str, playerResponseModel, xfn.PRE_ROLL, z);
            this.g = c;
            String a = this.d.c.a(apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, c.a);
            xev b = xev.b(a, apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, 4, xcp.b(new xec(amru.r(xev.b(remoteVideoAd.m, apac.LAYOUT_TYPE_MEDIA, 4, xcp.b(new xeb(remoteVideoAd), new xcv(this), new xde(a)))))));
            this.h = b;
            this.i = (xev) ((List) b.e(xec.class)).get(0);
            xeo b2 = xeo.b(str, playerResponseModel, true);
            this.j = b2;
            this.c.p(b2, this.g);
            this.c.g(this.j, this.g, this.h);
            this.c.g(this.j, this.g, this.i);
            this.c.j(this.j, this.g);
            this.c.b(this.j, this.g, this.h);
            this.c.b(this.j, this.g, this.i);
            return;
        }
        xev xevVar2 = this.h;
        if (xevVar2 != null) {
            if (TextUtils.equals(remoteVideoAd.m, xevVar2.a)) {
                return;
            } else {
                f(xce.VIDEO_ERROR);
            }
        }
        this.g = wyt.c(this.m.x(), str, playerResponseModel, xfn.PRE_ROLL, z);
        this.h = xev.b(remoteVideoAd.m, apac.LAYOUT_TYPE_MEDIA, 4, xcp.b(new xeb(remoteVideoAd), new xcv(this)));
        xeo b3 = xeo.b(str, playerResponseModel, true);
        this.j = b3;
        this.c.p(b3, this.g);
        this.c.g(this.j, this.g, this.h);
        this.c.j(this.j, this.g);
        this.c.b(this.j, this.g, this.h);
    }

    public final void c(xce xceVar) {
        apxf apxfVar;
        if (this.h == null) {
            return;
        }
        if (wbs.B(this.k) && (apxfVar = this.f) != null) {
            this.l.b(apxfVar, null);
        }
        f(xceVar);
    }

    @Override // defpackage.xci
    public final void d(int i, int i2) {
        this.b.d(i, i2);
    }

    @Override // defpackage.xci
    public final void e() {
    }
}
