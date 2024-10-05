package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxx implements wyi, wxa, wof, wok {
    boolean c;
    private final azrw e;
    final ajun d = new ajun((short[]) null);
    final Map a = new HashMap();
    final Map b = new HashMap();
    private String f = "";

    public wxx(azrw azrwVar) {
        this.e = azrwVar;
    }

    private final void m(List list, String str, boolean z) {
        for (xgv xgvVar : this.d.w()) {
            if (TextUtils.equals(((aeqn) xgvVar.c.d(xdj.class)).a, str)) {
                xgx xgxVar = xgvVar.b;
                if (z) {
                    if (xgxVar instanceof xfd) {
                        list.add(xgvVar);
                        return;
                    }
                } else if (xgxVar instanceof xfc) {
                    list.add(xgvVar);
                    return;
                }
            }
        }
        String str2 = true != z ? "Exiting" : "Entering";
        whu.l(null, str2.length() != 0 ? "LiveStreamBreakTransitionTriggerAdapter: cannot activate trigger of type ".concat(str2) : new String("LiveStreamBreakTransitionTriggerAdapter: cannot activate trigger of type "));
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        if (aignVar == aign.NEW) {
            this.a.clear();
            this.b.clear();
            this.f = "";
        } else if (aignVar == aign.PLAYBACK_LOADED) {
            this.c = playerResponseModel.c().ax();
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wok
    public final void i(String str) {
        l(str);
    }

    @Override // defpackage.wok
    public final /* synthetic */ void j(long j) {
    }

    @Override // defpackage.wxa
    public final void k(xev xevVar, String str) {
        for (xev xevVar2 : (List) xevVar.e(xec.class)) {
            if (xevVar2.f(xdu.class)) {
                this.a.put(((MediaAd) xevVar2.e(xdu.class)).m, str);
            }
        }
    }

    public final void l(String str) {
        String str2 = (String) this.a.get(str);
        if (TextUtils.equals(this.f, str2)) {
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        if (!ammx.e(this.f)) {
            m(arrayList, this.f, false);
            this.f = "";
        }
        if (!ammx.e(str2)) {
            m(arrayList, str2, true);
            this.f = str2;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.e.get()).r(arrayList);
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.d.v(xgxVar.c());
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
    public final void qw(String str, int i) {
        if (this.c) {
            if (ammx.e((String) this.a.get(str)) && i == 1) {
                whu.l(null, "LiveStreamBreakTransitionTriggerAdapter: cannot retrieve cuepoint from associated cpn");
            }
            l(str);
        }
    }

    @Override // defpackage.wof
    public final void qy(ahcm ahcmVar) {
        aeqn a = ahcmVar.a();
        this.b.put(a.a, a);
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.d.y(xgxVar.c())) {
            String str = xghVar.a;
            throw new wxf(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        }
        if ((xgxVar instanceof xfd) || (xgxVar instanceof xfc)) {
            this.d.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
            return;
        }
        String str2 = xghVar.a;
        String name = xgxVar.b().name();
        StringBuilder sb = new StringBuilder(str2.length() + 117 + String.valueOf(name).length());
        sb.append("Incorrect TriggerType: Tried to register entry trigger for slot: ");
        sb.append(str2);
        sb.append(" of type ");
        sb.append(name);
        sb.append(" in LiveStreamBreakTransitionTriggerAdapter");
        throw new wxf(sb.toString());
    }
}
