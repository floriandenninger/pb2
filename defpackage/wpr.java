package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wpr implements afxe {
    final /* synthetic */ xgh a;
    final /* synthetic */ xev b;
    final /* synthetic */ wps c;

    public wpr(wps wpsVar, xgh xghVar, xev xevVar) {
        this.c = wpsVar;
        this.a = xghVar;
        this.b = xevVar;
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        xcp xcpVar = null;
        if (!((Map) this.c.a.get()).containsKey(str)) {
            return null;
        }
        wuy wuyVar = (wuy) ((Map) this.c.a.get()).get(str);
        xgh xghVar = this.a;
        xev xevVar = this.b;
        wux wuxVar = (wux) wuyVar.getClass().getAnnotation(wux.class);
        if (wuxVar == null) {
            xcpVar = xcp.a;
        } else {
            Class a = wuxVar.a();
            if (xevVar.k.d(a)) {
                xcpVar = xevVar.k;
            } else if (xghVar.g.d(a)) {
                xcpVar = xghVar.g;
            }
        }
        if (xcpVar != null) {
            return wuyVar.b(xcpVar);
        }
        return wuyVar.a();
    }

    @Override // defpackage.afxe
    public final String b() {
        return "AdsConverterForExternalPings";
    }
}
