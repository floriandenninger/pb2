package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xma extends xlq implements wmu {
    public final PlayerAd b;
    public final xbs c;
    public final wmv d;
    public ahcx e;
    public boolean f;
    private final xhi g;
    private final aahd h;
    private final Set i;
    private final SparseArray j;
    private ayqx k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;

    public xma(xhi xhiVar, InstreamAdBreak instreamAdBreak, PlayerAd playerAd, String str, ahcx ahcxVar, aifv aifvVar, wmv wmvVar, xbs xbsVar, aahd aahdVar) {
        this.e = null;
        this.g = xhiVar;
        playerAd.getClass();
        this.b = playerAd;
        this.c = xbsVar;
        this.h = aahdVar;
        SparseArray sparseArray = new SparseArray();
        if (playerAd.W() != null && !playerAd.W().isEmpty()) {
            for (aoye aoyeVar : playerAd.W()) {
                List list = (List) sparseArray.get(aoyeVar.d);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(aoyeVar);
                sparseArray.put(aoyeVar.d, list);
            }
        }
        this.j = sparseArray;
        this.i = new HashSet();
        for (int i = 1; i < 4; i++) {
            this.i.add(Integer.valueOf(i));
        }
        this.e = ahcxVar;
        this.d = wmvVar;
        if (wmvVar != null) {
            wmvVar.b = this;
        }
        xbsVar.e(instreamAdBreak.f, str);
        xbsVar.d(instreamAdBreak);
        xbsVar.a = new InstreamAdImpl(playerAd);
        xbsVar.c = this.e;
        this.k = aifvVar.b.X(new ayrs() { // from class: xlz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                tdt c;
                xma xmaVar = xma.this;
                ahcx ahcxVar2 = (ahcx) obj;
                aigf d = xmaVar.e.d();
                aigf aigfVar = aigf.FULLSCREEN;
                aigf d2 = ahcxVar2.d();
                aigf aigfVar2 = aigf.FULLSCREEN;
                xmaVar.e = ahcxVar2;
                xmaVar.c.c = xmaVar.e;
                if (xmaVar.f) {
                    if (d != aigfVar && d2 == aigfVar2) {
                        wmv wmvVar2 = xmaVar.d;
                        c = wmvVar2 != null ? wmvVar2.d() : null;
                        if (xmaVar.b.u() != null) {
                            xmaVar.D(xmaVar.b.u().j, c, xmaVar.c);
                        }
                        xmaVar.E(xmaVar.b.R(), c);
                        return;
                    }
                    if (d != aigfVar || d2 == aigfVar2) {
                        return;
                    }
                    wmv wmvVar3 = xmaVar.d;
                    c = wmvVar3 != null ? wmvVar3.c() : null;
                    if (xmaVar.b.u() != null) {
                        xmaVar.D(xmaVar.b.u().n, c, xmaVar.c);
                    }
                    xmaVar.E(xmaVar.b.O(), c);
                }
            }
        });
    }

    private static amru F(List list) {
        if (list == null || list.isEmpty()) {
            return amru.q();
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoye aoyeVar = (aoye) it.next();
            if (aoyeVar != null && (aoyeVar.b & 1) != 0) {
                try {
                    Uri ai = wbs.ai(aoyeVar.c);
                    if (ai != null && !Uri.EMPTY.equals(ai)) {
                        linkedList.add(ai);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return amru.o(linkedList);
    }

    private final void G(long j) {
        this.l = j;
        this.c.e = j;
        if (!this.f) {
            if (j > 1000) {
                return;
            }
            this.n = true;
            wmv wmvVar = this.d;
            tdt e = wmvVar != null ? wmvVar.e() : null;
            this.g.f(this.b.S());
            E(this.b.Z(), e);
            if (this.b.u() != null) {
                D(this.b.u().b, e, this.c);
            }
            this.f = true;
        }
        long c = this.b.c() * 1000;
        Iterator it = this.i.iterator();
        while (true) {
            if (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                long j2 = (intValue * c) / 4;
                if (j >= j2 - 1000 && j <= j2 + 1000) {
                    wmv wmvVar2 = this.d;
                    E(h(this.b, intValue), wmvVar2 != null ? wmvVar2.h(intValue) : null);
                    this.i.remove(Integer.valueOf(intValue));
                }
            } else if (!this.o && j >= c - 1000 && j <= c) {
                wmv wmvVar3 = this.d;
                E(this.b.N(), wmvVar3 != null ? wmvVar3.b() : null);
                this.o = true;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.j.size(); i++) {
            int keyAt = this.j.keyAt(i);
            long j3 = keyAt;
            if (j >= j3 - 1000 && j <= j3 + 1000) {
                this.g.f((List) this.j.get(keyAt));
                hashSet.add(Integer.valueOf(keyAt));
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            this.j.remove(((Integer) it2.next()).intValue());
        }
    }

    private final void H(List list, afxe... afxeVarArr) {
        if (this.h == null || list.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (afxeVarArr.length != 0) {
            hashMap.put("MacrosConverters.CustomConvertersKey", afxeVarArr);
        }
        whl.J(this.h, list, hashMap);
    }

    private final void I() {
        wmv wmvVar = this.d;
        if (wmvVar != null) {
            wmvVar.k();
            this.d.j();
            this.d.b = null;
        }
    }

    @Override // defpackage.xlq
    public final void A(int i, int i2, int i3, int i4) {
        wmv wmvVar = this.d;
        if (wmvVar != null) {
            wmvVar.n(i, i2, i3, i4);
        }
    }

    @Override // defpackage.xlq
    public final void B(ahej ahejVar) {
        if (this.f) {
            if (ahejVar.a() == 9 || ahejVar.a() == 10) {
                I();
            }
        }
    }

    @Override // defpackage.xlq
    public final void C() {
        if (this.f) {
            I();
        }
        Object obj = this.k;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.k = null;
        }
    }

    public final void D(List list, tdt tdtVar, xbs xbsVar) {
        H(list, xbsVar.c(tdtVar));
    }

    public final void E(List list, tdt tdtVar) {
        this.g.e(list, this.c.c(tdtVar));
    }

    @Override // defpackage.wmu
    public final tfd a() {
        return new tfd(this.b.c() * 1000, (int) this.l, this.e.d() == aigf.FULLSCREEN, this.e.d() == aigf.BACKGROUND);
    }

    @Override // defpackage.wmu
    public final Set b(tfa tfaVar) {
        List F;
        LinkedList linkedList = new LinkedList();
        PlayerAd playerAd = this.b;
        tfa tfaVar2 = tfa.START;
        switch (tfaVar) {
            case START:
                F = F(playerAd.Z());
                break;
            case FIRST_QUARTILE:
                F = F(playerAd.Q());
                break;
            case MIDPOINT:
                F = F(playerAd.U());
                break;
            case THIRD_QUARTILE:
                F = F(playerAd.aa());
                break;
            case COMPLETE:
                F = F(playerAd.N());
                break;
            case RESUME:
                F = F(playerAd.X());
                break;
            case PAUSE:
                F = F(playerAd.V());
                break;
            case SUSPEND:
            case SKIP_SHOWN:
            case MUTE:
            case UNMUTE:
            default:
                F = Collections.emptyList();
                break;
            case ABANDON:
                F = F(playerAd.H());
                break;
            case SKIP:
                F = F(playerAd.Y());
                break;
            case VIEWABLE_IMPRESSION:
                F = F(playerAd.K());
                break;
            case MEASURABLE_IMPRESSION:
                F = F(playerAd.J());
                break;
            case GROUPM_VIEWABLE_IMPRESSION:
                F = F(playerAd.I());
                break;
            case FULLSCREEN:
                F = F(playerAd.R());
                break;
            case EXIT_FULLSCREEN:
                F = F(playerAd.O());
                break;
        }
        linkedList.addAll(F);
        return afxf.d(linkedList, this.c.b);
    }

    @Override // defpackage.wmu
    public final void c(tdt tdtVar) {
        if (this.n) {
            E(this.b.I(), tdtVar);
            if (this.b.u() != null) {
                D(this.b.u().m, tdtVar, this.c);
            }
        }
    }

    @Override // defpackage.wmu
    public final void d(tdt tdtVar) {
        if (this.n) {
            E(this.b.J(), tdtVar);
            if (this.b.u() != null) {
                D(this.b.u().l, tdtVar, this.c);
            }
        }
    }

    @Override // defpackage.wmu
    public final void e(tdt tdtVar) {
        if (this.n) {
            E(this.b.K(), tdtVar);
            if (this.b.u() != null) {
                D(this.b.u().k, tdtVar, this.c);
            }
        }
    }

    @Override // defpackage.xlq
    public final xbs f() {
        return this.c;
    }

    @Override // defpackage.xlq
    public final String g() {
        return this.b.m;
    }

    @Override // defpackage.xlq
    public final void i() {
    }

    @Override // defpackage.xlq
    public final void j(xce xceVar) {
    }

    @Override // defpackage.xlq
    public final void k(int i, int i2) {
    }

    @Override // defpackage.xlq
    public final void l(long j) {
        G(j);
    }

    @Override // defpackage.xlq
    public final void m(VisibilityChangeEventData visibilityChangeEventData) {
    }

    @Override // defpackage.xlq
    public final void n() {
        if (this.f) {
            this.g.f(this.b.L());
            if (this.b.u() != null) {
                H(this.b.u().i, new afxe[0]);
            }
        }
    }

    @Override // defpackage.xlq
    public final void o(afih afihVar) {
    }

    @Override // defpackage.xlq
    public final void p() {
    }

    @Override // defpackage.xlq
    public final void q() {
    }

    @Override // defpackage.xlq
    public final void r() {
        this.m = false;
        this.c.d = false;
        if (this.f) {
            wmv wmvVar = this.d;
            tdt f = wmvVar != null ? wmvVar.f() : null;
            E(this.b.V(), f);
            if (this.b.u() != null) {
                D(this.b.u().d, f, this.c);
            }
        }
    }

    @Override // defpackage.xlq
    public final void s() {
        wmv wmvVar;
        if (!this.f || (wmvVar = this.d) == null) {
            return;
        }
        wmvVar.m();
    }

    @Override // defpackage.xlq
    public final void t() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.c.d = true;
        if (this.f) {
            wmv wmvVar = this.d;
            tdt g = wmvVar != null ? wmvVar.g() : null;
            E(this.b.X(), g);
            if (this.b.u() != null) {
                D(this.b.u().e, g, this.c);
            }
        }
    }

    @Override // defpackage.xlq
    public final void u() {
    }

    @Override // defpackage.xlq
    public final void v() {
    }

    @Override // defpackage.xlq
    public final void w(xbj xbjVar) {
    }

    @Override // defpackage.xlq
    public final void x(xgp xgpVar) {
    }

    @Override // defpackage.xlq
    public final void y() {
    }

    @Override // defpackage.xlq
    public final void z(aheg ahegVar) {
        if (ahegVar.j()) {
            G(ahegVar.e());
        }
    }
}
