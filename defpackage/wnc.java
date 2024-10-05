package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnc implements aioa, woo, ypd {
    public final List a;
    public wmz b;
    public InstreamAd c;
    public boolean d;
    public boolean e;
    public final Set f = new HashSet();
    public final Map g = new HashMap();
    public final xls h;
    public final Activity i;
    public final ajjz j;
    public final wzq k;
    public View l;
    public ajok m;
    private final List n;

    public wnc(Activity activity, ajjz ajjzVar, xls xlsVar, wzq wzqVar, List list, List list2) {
        this.i = activity;
        this.j = ajjzVar;
        this.h = xlsVar;
        this.k = wzqVar;
        this.n = list;
        this.a = list2;
    }

    public final wmy a(PlayerResponseModel playerResponseModel, String str, ashd ashdVar) {
        for (wmy wmyVar : this.n) {
            if (wmyVar.g(str, playerResponseModel, ashdVar)) {
                return wmyVar;
            }
        }
        return null;
    }

    public final void b(wmy wmyVar) {
        this.n.add(wmyVar);
    }

    public final void c() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((wmz) it.next()).e(this.l);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((wmz) it2.next()).e(this.l);
        }
        d(null);
        this.g.clear();
        this.l = null;
        this.c = null;
        this.d = false;
        this.e = false;
    }

    public final void d(wmz wmzVar) {
        View view;
        ajok ajokVar;
        this.b = wmzVar;
        if (wmzVar == null || (view = this.l) == null || (ajokVar = this.m) == null) {
            return;
        }
        wmzVar.d(view, ajokVar);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().a.E(ayqr.a()).X(new ayrs() { // from class: wmx
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                wnc wncVar = wnc.this;
                yjk.f();
                aign aignVar = aign.NEW;
                int ordinal = ((ahef) obj).c().ordinal();
                if (ordinal == 0) {
                    wncVar.c();
                } else {
                    if (ordinal != 8) {
                        return;
                    }
                    wncVar.d = true;
                }
            }
        })};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wnd.class, xad.class};
        }
        if (i != 0) {
            if (i == 1) {
                xad xadVar = (xad) obj;
                wmz wmzVar = this.b;
                if (wmzVar == null) {
                    return null;
                }
                wmzVar.h(xadVar);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        wnd wndVar = (wnd) obj;
        wmz wmzVar2 = this.b;
        if (wmzVar2 == null || this.l == null || !(wmzVar2 instanceof wna)) {
            return null;
        }
        wna wnaVar = (wna) wmzVar2;
        MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) this.g.get(wndVar.a);
        if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer == null) {
            return null;
        }
        if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.e) {
            this.b.e(this.l);
            return null;
        }
        if ((multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.b & 2) == 0) {
            return null;
        }
        aulq aulqVar = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        this.b.e(this.l);
        if (!wnaVar.k(aulqVar, this.e)) {
            String valueOf = String.valueOf(aulqVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb2.append("Unable to load companion card with renderer ");
            sb2.append(valueOf);
            afsi.b(2, 1, sb2.toString());
        }
        this.b.d(this.l, this.m);
        return null;
    }
}
