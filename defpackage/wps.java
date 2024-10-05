package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wps implements wod, wwp, wwq {
    public final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private xbs e;
    private afxe f;

    public wps(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.a = azrwVar4;
    }

    private final void h(String str) {
        if (this.e == null) {
            throw new wnw(str.length() != 0 ? "No assigned adStatsMacrosConverter when trying to run ".concat(str) : new String("No assigned adStatsMacrosConverter when trying to run "));
        }
    }

    private static boolean i(xgh xghVar, xev xevVar) {
        return xghVar.c() == apae.SLOT_TYPE_PLAYER_BYTES && xevVar.g(apac.LAYOUT_TYPE_MEDIA, xdu.class) && (xevVar.e(xdu.class) instanceof LocalVideoAd);
    }

    @Override // defpackage.wod
    public final Uri a(Uri uri, afxe... afxeVarArr) {
        try {
            return ((afxf) this.b.get()).a(uri, afxeVarArr);
        } catch (zjg e) {
            throw new wnw(e.toString());
        }
    }

    @Override // defpackage.wod
    public final Uri b(Uri uri, Map map) {
        try {
            return ((afxf) this.b.get()).a(uri, new wpq(map));
        } catch (zjg e) {
            throw new wnw(e.toString());
        }
    }

    @Override // defpackage.wod
    public final void c() {
        this.e = ((xbq) this.c.get()).a();
        ((afxf) this.b.get()).e(this.e);
    }

    @Override // defpackage.wod
    public final void d(String str, String str2) {
        h("applyNewPlaybackImpl");
        this.e.e(str, str2);
    }

    @Override // defpackage.wod
    public final void e(long j) {
        h("applyPlaybackPositionImpl");
        this.e.e = j;
    }

    @Override // defpackage.wod
    public final void f(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        h("applyPlayerGeometryEventImpl");
        this.e.c = new ahcx(aigfVar, aigfVar2, i, i2, z, z2);
    }

    @Override // defpackage.wod
    public final void g(VideoTrackingAd videoTrackingAd) {
        h("applyVideoTrackingAdImpl");
        this.e.a = new InstreamAdImpl(videoTrackingAd);
    }

    @Override // defpackage.wwp
    public final void o(xgh xghVar, xev xevVar) {
        if (wbs.y((aaea) this.d.get()) && i(xghVar, xevVar)) {
            if (this.f != null) {
                whu.m(xghVar, xevVar, "Ping migration non-null AdsConverterForExternalPings on media layout entered");
            } else {
                this.f = new wpr(this, xghVar, xevVar);
                ((afxf) this.b.get()).e(this.f);
            }
        }
    }

    @Override // defpackage.wwq
    public final void s(xgh xghVar, xev xevVar, int i) {
        if (this.f != null && i(xghVar, xevVar)) {
            ((afxf) this.b.get()).g(this.f);
            this.f = null;
        }
    }
}
