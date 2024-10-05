package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ekc implements eki, ekg, xjk {
    public final azrw a;
    public final azrw b;
    public final Map c = new HashMap();
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final Executor g;
    private ekj h;

    public ekc(ekm ekmVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, Executor executor) {
        this.d = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
        this.g = executor;
        ekmVar.a(this);
    }

    public final void a(ekb ekbVar) {
        if (ekbVar.e != null || ekbVar.d == null || ekbVar.c == null || !ekbVar.b.b.isDone()) {
            return;
        }
        try {
            wyw wywVar = (wyw) this.f.get();
            aryr aryrVar = (aryr) ekbVar.b.b.get();
            xgh xghVar = ekbVar.a;
            xev xevVar = ekbVar.c;
            String str = ekbVar.d;
            wog wogVar = (wog) wywVar.c.get();
            wod wodVar = (wod) wywVar.b.get();
            whu whuVar = wywVar.d;
            ekbVar.e = new ekd(wogVar, wodVar, ((wyw) wywVar.a.get()).a(xghVar, xevVar), aryrVar, xghVar, xevVar, str);
            ekd ekdVar = ekbVar.e;
            if (ekdVar.c != 0) {
                return;
            }
            ekdVar.c = 1;
            ekdVar.a.a(ekdVar);
        } catch (InterruptedException | ExecutionException | wxd e) {
            whu.l(ekbVar.a, e.getMessage());
        }
    }

    @Override // defpackage.ekg
    public final void b() {
        for (ekb ekbVar : this.c.values()) {
            ekd ekdVar = ekbVar.e;
            if (ekdVar != null) {
                ekdVar.a.c(ekdVar);
                if (ekdVar.c == 2) {
                    ekdVar.c = 3;
                    ekdVar.b.b(2, new afxe[0]);
                }
            }
            if (ekbVar.f && ekbVar.c != null) {
                ((wno) this.b.get()).f(xeo.a, ekbVar.a, ekbVar.c, 4);
            }
            if (ekbVar.c != null) {
                wno wnoVar = (wno) this.b.get();
                xeo xeoVar = xeo.a;
                xgh xghVar = ekbVar.a;
                wnoVar.v(ekbVar.c);
            }
            if (ekbVar.f) {
                ((wno) this.b.get()).m(xeo.a, ekbVar.a);
            }
            ((wno) this.b.get()).q(xeo.a, ekbVar.a);
        }
        this.c.clear();
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.ekg
    public final void f(xgb xgbVar, String str) {
        ekb ekbVar = (ekb) this.c.get(xgbVar.a);
        if (ekbVar == null) {
            return;
        }
        ekbVar.d = str;
        a(ekbVar);
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void h(xgb xgbVar) {
    }

    @Override // defpackage.xjk
    public final void i(xiv xivVar) {
        if (xivVar != xiv.SKIP) {
            return;
        }
        ekj ekjVar = this.h;
        if (ekjVar == null) {
            whu.l(null, "Received onMuteAdEvent with no registered reelMuteRequestApi");
            return;
        }
        yjk.f();
        ((ijo) ekjVar).bh(ihk.a(4), true);
    }

    @Override // defpackage.ekg
    public final void j(List list) {
        int i;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xgb xgbVar = (xgb) it.next();
            ekb ekbVar = new ekb(xgh.b(((wyt) this.d.get()).b.b(apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM), apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM, 3, xcp.b(new xea(xgbVar))), xgbVar);
            arrayList.add(ekbVar);
            this.c.put(xgbVar.a, ekbVar);
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            final ekb ekbVar2 = (ekb) arrayList.get(i);
            ((wno) this.b.get()).p(xeo.a, ekbVar2.a);
            ekbVar2.b.b.d(new Runnable() { // from class: eka
                @Override // java.lang.Runnable
                public final void run() {
                    avwa avwaVar;
                    amrz c;
                    aowc aowcVar;
                    ekc ekcVar = ekc.this;
                    ekb ekbVar3 = ekbVar2;
                    if (ekcVar.c.containsKey(ekbVar3.b.a)) {
                        try {
                            aryr aryrVar = (aryr) ekbVar3.b.b.get();
                            if (aryrVar == null) {
                                return;
                            }
                            Iterator it2 = aryrVar.m.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    avwaVar = null;
                                    break;
                                }
                                aryk arykVar = (aryk) it2.next();
                                if (arykVar.b == 84813246) {
                                    aowcVar = (aowc) arykVar.c;
                                } else {
                                    aowcVar = aowc.a;
                                }
                                for (aowd aowdVar : aowcVar.c) {
                                    if ((aowdVar.b & 64) != 0) {
                                        avwaVar = aowdVar.g;
                                        if (avwaVar == null) {
                                            avwaVar = avwa.a;
                                        }
                                    }
                                }
                            }
                            if (avwaVar == null) {
                                return;
                            }
                            wyn wynVar = (wyn) ekcVar.a.get();
                            xgh xghVar = ekbVar3.a;
                            xgb xgbVar2 = ekbVar3.b;
                            String a = wynVar.c.a(apac.LAYOUT_TYPE_MEDIA, xghVar.a);
                            apac apacVar = apac.LAYOUT_TYPE_MEDIA;
                            wys wysVar = wynVar.b;
                            if (wbs.l(wysVar.a)) {
                                amrw h = amrz.h();
                                aoyi aoyiVar = avwaVar.c;
                                if (aoyiVar == null) {
                                    aoyiVar = aoyi.a;
                                }
                                if (!aoyiVar.m.isEmpty()) {
                                    xcd a2 = xcd.a(wysVar.b.c(apah.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED), a);
                                    aoyi aoyiVar2 = avwaVar.c;
                                    if (aoyiVar2 == null) {
                                        aoyiVar2 = aoyi.a;
                                    }
                                    h.g(a2, aoyiVar2.m);
                                }
                                aoyi aoyiVar3 = avwaVar.c;
                                if (aoyiVar3 == null) {
                                    aoyiVar3 = aoyi.a;
                                }
                                if (!aoyiVar3.n.isEmpty()) {
                                    xbz a3 = xbz.a(wysVar.b.c(apah.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED), a);
                                    aoyi aoyiVar4 = avwaVar.c;
                                    if (aoyiVar4 == null) {
                                        aoyiVar4 = aoyi.a;
                                    }
                                    h.g(a3, aoyiVar4.n);
                                }
                                aoyi aoyiVar5 = avwaVar.c;
                                if (aoyiVar5 == null) {
                                    aoyiVar5 = aoyi.a;
                                }
                                if (!aoyiVar5.o.isEmpty()) {
                                    xby a4 = xby.a(wysVar.b.c(apah.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED), a);
                                    aoyi aoyiVar6 = avwaVar.c;
                                    if (aoyiVar6 == null) {
                                        aoyiVar6 = aoyi.a;
                                    }
                                    h.g(a4, aoyiVar6.o);
                                }
                                c = h.c();
                            } else {
                                c = amvo.b;
                            }
                            amrz amrzVar = c;
                            wyo wyoVar = wynVar.a;
                            aoyi aoyiVar7 = avwaVar.c;
                            if (aoyiVar7 == null) {
                                aoyiVar7 = aoyi.a;
                            }
                            ekbVar3.c = new xev(a, apacVar, 3, amru.q(), amru.q(), amru.q(), amrzVar, amlr.a, amlr.a, ammv.j(wyoVar.a(new VideoAdTrackingModel(aoyiVar7))), xcp.b(new xdy(aryrVar), new xea(xgbVar2)));
                            ((wno) ekcVar.b.get()).g(xeo.a, ekbVar3.a, ekbVar3.c);
                            ekcVar.a(ekbVar3);
                            if (ekbVar3.f) {
                                ((wno) ekcVar.b.get()).b(xeo.a, ekbVar3.a, ekbVar3.c);
                            }
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
                }
            }, this.g);
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.ekg
    public final void l(xgb xgbVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = xgbVar.a;
        if (!this.c.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            whu.l(null, "Got onPageEnter for unregistered reel");
            return;
        }
        ekb ekbVar = (ekb) this.c.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        ekbVar.f = true;
        ((wno) this.b.get()).j(xeo.a, ekbVar.a);
        if (ekbVar.c == null) {
            return;
        }
        ((wno) this.b.get()).b(xeo.a, ekbVar.a, ekbVar.c);
    }

    @Override // defpackage.ekg
    public final void m(int i, xgb xgbVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = xgbVar.a;
        if (!this.c.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            whu.l(null, "Got onPageExit for unregistered reel");
            return;
        }
        ekb ekbVar = (ekb) this.c.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        try {
            if (ekbVar.c == null) {
                whu.l(ekbVar.a, "Got onPageExit with playerResponse not yet bound");
            } else {
                if (ekbVar.f) {
                    ((wno) this.b.get()).f(xeo.a, ekbVar.a, ekbVar.c, i != 0 ? i != 1 ? 3 : 0 : 2);
                }
                ekd ekdVar = ekbVar.e;
                if (ekdVar != null && ekdVar.c == 2 && i == 0) {
                    ekdVar.b.a(17, new afxe[0]);
                }
            }
            ((wno) this.b.get()).m(xeo.a, ekbVar.a);
        } finally {
            ekbVar.f = false;
        }
    }

    @Override // defpackage.eki
    public final void n(ekh ekhVar) {
        ekhVar.a(this);
    }

    @Override // defpackage.eki
    public final void o(ekj ekjVar) {
        try {
            ((xjl) this.e.get()).c(this);
        } catch (wnw e) {
            whu.l(null, e.getMessage());
        }
        this.h = ekjVar;
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void q(int i, int i2) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.eki
    public final void s() {
        ((xjl) this.e.get()).l(this);
        this.h = null;
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void v(xgb xgbVar) {
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void w() {
    }
}
