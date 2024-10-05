package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, b = apae.SLOT_TYPE_PLAYBACK_TRACKING, c = {xek.class}, d = {xdf.class, xdg.class})
/* loaded from: classes4.dex */
public final class wss implements wsx, wof, woi {
    private final wsw a;
    private final wyv b;
    private final wog c;
    private final wod d;
    private final acra e;
    private final xgh f;
    private final xev g;
    private final String h;
    private final VideoTrackingAd i;
    private final avwa j;
    private final PlayerConfigModel k;
    private int l;
    private boolean m;
    private final wwn n;

    public wss(wsw wswVar, wyv wyvVar, wog wogVar, wwn wwnVar, wod wodVar, acra acraVar, xgh xghVar, xev xevVar) {
        this.a = wswVar;
        this.b = wyvVar;
        this.c = wogVar;
        this.n = wwnVar;
        this.d = wodVar;
        this.e = acraVar;
        this.f = xghVar;
        this.g = xevVar;
        this.h = (String) xghVar.d(xdf.class);
        VideoTrackingAd videoTrackingAd = (VideoTrackingAd) xevVar.e(xek.class);
        this.i = videoTrackingAd;
        this.j = videoTrackingAd.a;
        this.k = videoTrackingAd.l;
    }

    private final void j(boolean z) {
        asht ashtVar;
        if (this.e == null || (this.j.b & 4) == 0) {
            return;
        }
        ammv ammvVar = this.g.i;
        if (ammvVar.h()) {
            aone createBuilder = asht.a.createBuilder();
            ashd ashdVar = (ashd) ammvVar.c();
            createBuilder.copyOnWrite();
            asht ashtVar2 = (asht) createBuilder.instance;
            ashtVar2.t = ashdVar;
            ashtVar2.c |= 1024;
            ashtVar = (asht) createBuilder.build();
        } else {
            ashtVar = null;
        }
        if (z) {
            this.e.u(new acqx(this.j.d.I()), ashtVar);
        } else {
            this.e.q(new acqx(this.j.d.I()), ashtVar);
        }
    }

    private final void k() {
        if (this.l >= 5) {
            return;
        }
        this.b.a(2, new afxe[0]);
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final void h(int i, String str) {
        if (TextUtils.equals(str, this.h)) {
            if (i == 2) {
                if (!this.k.aL()) {
                    this.b.b(6, new afxe[0]);
                }
                if (this.l == 0) {
                    this.l = 1;
                    return;
                } else {
                    this.b.a(7, new afxe[0]);
                    return;
                }
            }
            if (i == 3) {
                this.b.a(9, new afxe[0]);
                return;
            }
            if (i == 4) {
                this.b.a(8, new afxe[0]);
                return;
            }
            if (i != 7) {
                return;
            }
            try {
                this.d.e(TimeUnit.SECONDS.toMillis(this.i.b));
            } catch (wnw e) {
                whu.m(this.f, this.g, e.toString());
            }
            this.b.b(14, new afxe[0]);
            this.b.b(13, new afxe[0]);
            this.l = 5;
        }
    }

    @Override // defpackage.woi
    public final void i() {
        k();
    }

    @Override // defpackage.wof
    public final void qp(afih afihVar) {
        if (afihVar.n()) {
            xbn xbnVar = new xbn(xbm.d(afihVar));
            if (this.l != 5) {
                this.b.b(8, xbnVar);
                this.b.b(3, xbnVar);
                this.l = 5;
            }
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3 = this.m;
        boolean z4 = aigfVar == aigf.FULLSCREEN;
        this.m = z4;
        try {
            this.d.f(aigfVar, aigfVar2, i, i2, z, z2);
        } catch (wnw e) {
            whu.m(this.f, this.g, e.toString());
        }
        if (!z3 && z4) {
            this.b.a(4, new afxe[0]);
        } else {
            if (!z3 || z4) {
                return;
            }
            this.b.a(5, new afxe[0]);
        }
    }

    @Override // defpackage.wof
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        if (z && TextUtils.equals(str, this.h)) {
            int i = (int) j;
            int i2 = this.i.b * 1000;
            if (i < 0 || i > i2) {
                xgh xghVar = this.f;
                xev xevVar = this.g;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Spurious videoTime: ");
                sb.append(i);
                whu.m(xghVar, xevVar, sb.toString());
                return;
            }
            if (this.k.aL()) {
                this.b.b(6, new afxe[0]);
            }
            try {
                this.d.e(i);
            } catch (wnw e) {
                whu.m(this.f, this.g, e.toString());
            }
            this.b.c(i, new afxe[0]);
            int i3 = (i * 4) / i2;
            if (i3 >= this.l) {
                for (int i4 = i3; i4 >= this.l; i4--) {
                    if (i4 == 1) {
                        this.b.b(10, new afxe[0]);
                    } else if (i4 == 2) {
                        this.b.b(11, new afxe[0]);
                    } else if (i4 == 3) {
                        this.b.b(12, new afxe[0]);
                    }
                }
                this.l = i3 + 1;
            }
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
        this.c.c(this);
    }

    @Override // defpackage.wsx
    public final void qu() {
        this.c.a(this);
        this.n.a.add(this);
        this.d.c();
        try {
            this.d.d(null, this.h);
            this.d.g(this.i);
        } catch (wnw e) {
            whu.m(this.f, this.g, e.toString());
        }
        this.a.a(this.f, this.g);
        if (this.c.d(this.h)) {
            whu.m(this.f, this.g, "Missed play event for discovery");
            h(2, this.h);
        }
        j(true);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        this.c.c(this);
        wwn wwnVar = this.n;
        Iterator it = wwnVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            woi woiVar = (woi) it.next();
            if (amkq.b(woiVar, this)) {
                wwnVar.a.remove(woiVar);
                break;
            }
        }
        k();
        this.a.e(this.f, this.g, i);
        j(false);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
