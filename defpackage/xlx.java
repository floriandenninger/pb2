package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xlx extends xlq implements wmu {
    public final PlayerAd b;
    public final xbs c;
    public final xhi d;
    public boolean e;
    public ahcx f;
    public final wmv g;
    private final int h;
    private boolean i;
    private int j;
    private int k;
    private PriorityQueue l;
    private PriorityQueue m;
    private aahd n;
    private ayqx o;

    public xlx(xcl xclVar, xhi xhiVar, InstreamAdBreak instreamAdBreak, PlayerAd playerAd, String str, ahcx ahcxVar, aifv aifvVar, wmv wmvVar, xbs xbsVar, int i, aahd aahdVar) {
        PriorityQueue priorityQueue;
        this.f = null;
        xclVar.getClass();
        this.d = xhiVar;
        playerAd.getClass();
        this.b = playerAd;
        this.g = wmvVar;
        this.k = -1;
        PriorityQueue priorityQueue2 = new PriorityQueue(playerAd.W().size() + 1, a);
        for (aoye aoyeVar : playerAd.W()) {
            if (aoyeVar.d >= 0) {
                priorityQueue2.add(aoyeVar);
            }
        }
        this.l = priorityQueue2;
        int i2 = this.k;
        if (this.b.u() == null) {
            priorityQueue = new PriorityQueue();
        } else {
            PriorityQueue priorityQueue3 = new PriorityQueue();
            Iterator it = this.b.u().h.iterator();
            while (it.hasNext()) {
                xfy a = xfy.a((aozf) it.next(), this.b.c() * 1000);
                if (a != null && a.a > i2) {
                    priorityQueue3.add(a);
                }
            }
            priorityQueue = priorityQueue3;
        }
        this.m = priorityQueue;
        this.f = ahcxVar;
        this.c = xbsVar;
        this.h = i;
        this.n = aahdVar;
        xbsVar.e(instreamAdBreak.f, str);
        xbsVar.d(instreamAdBreak);
        xbsVar.a = new InstreamAdImpl(playerAd);
        xbsVar.c = this.f;
        if (wmvVar != null) {
            wmvVar.b = this;
        }
        this.o = aifvVar.b.X(new ayrs() { // from class: xlw
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                tdt c;
                xlx xlxVar = xlx.this;
                ahcx ahcxVar2 = (ahcx) obj;
                aigf d = xlxVar.f.d();
                aigf aigfVar = aigf.FULLSCREEN;
                aigf d2 = ahcxVar2.d();
                aigf aigfVar2 = aigf.FULLSCREEN;
                aigf d3 = xlxVar.f.d();
                aigf aigfVar3 = aigf.MINIMIZED;
                aigf d4 = ahcxVar2.d();
                aigf aigfVar4 = aigf.MINIMIZED;
                aigf d5 = xlxVar.f.d();
                aigf aigfVar5 = aigf.DEFAULT;
                aigf d6 = ahcxVar2.d();
                aigf aigfVar6 = aigf.DEFAULT;
                xlxVar.f = ahcxVar2;
                xlxVar.c.c = xlxVar.f;
                if (d5 != aigfVar5 && d6 == aigfVar6 && xlxVar.b.u() != null) {
                    xlxVar.E(xlxVar.b.u().q, new afxe[0]);
                }
                if (d3 != aigfVar3 && d4 == aigfVar4 && xlxVar.b.u() != null) {
                    xlxVar.E(xlxVar.b.u().r, new afxe[0]);
                }
                if (d != aigfVar && d2 == aigfVar2) {
                    wmv wmvVar2 = xlxVar.g;
                    c = wmvVar2 != null ? wmvVar2.d() : null;
                    if (xlxVar.b.u() != null) {
                        xlxVar.D(xlxVar.b.u().j, c, xlxVar.c);
                    }
                    xlxVar.F(xlxVar.b.R(), c);
                    return;
                }
                if (d != aigfVar || d2 == aigfVar2) {
                    return;
                }
                wmv wmvVar3 = xlxVar.g;
                c = wmvVar3 != null ? wmvVar3.c() : null;
                if (xlxVar.b.u() != null) {
                    xlxVar.D(xlxVar.b.u().n, c, xlxVar.c);
                }
                xlxVar.F(xlxVar.b.O(), c);
            }
        });
    }

    private final void H() {
        wmv wmvVar = this.g;
        tdt e = wmvVar != null ? wmvVar.e() : null;
        this.d.f(this.b.S());
        F(this.b.Z(), e);
        if (this.b.u() != null) {
            D(this.b.u().b, e, this.c);
        }
    }

    private final boolean I() {
        return this.b.l.aL();
    }

    @Override // defpackage.xlq
    public final void A(int i, int i2, int i3, int i4) {
        wmv wmvVar = this.g;
        if (wmvVar != null) {
            wmvVar.n(i, i2, i3, i4);
        }
    }

    @Override // defpackage.xlq
    public final void B(ahej ahejVar) {
    }

    @Override // defpackage.xlq
    public final void C() {
        wmv wmvVar = this.g;
        if (wmvVar != null) {
            wmvVar.k();
            this.g.j();
            this.g.b = null;
        }
        Object obj = this.o;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.o = null;
        }
    }

    public final void D(List list, tdt tdtVar, xbs xbsVar) {
        E(list, xbsVar.c(tdtVar));
    }

    public final void E(List list, afxe... afxeVarArr) {
        if (this.n == null || list.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (afxeVarArr.length != 0) {
            hashMap.put("MacrosConverters.CustomConvertersKey", afxeVarArr);
        }
        whl.J(this.n, list, hashMap);
    }

    public final boolean F(List list, tdt tdtVar) {
        return this.d.e(list, this.c.c(tdtVar));
    }

    @Override // defpackage.wmu
    public final tfd a() {
        return new tfd(this.b.c() * 1000, this.k, this.f.d() == aigf.FULLSCREEN, this.f.d() == aigf.BACKGROUND);
    }

    @Override // defpackage.wmu
    public final Set b(tfa tfaVar) {
        return afxf.d(xgt.a(this.b, tfaVar), this.c.b);
    }

    @Override // defpackage.wmu
    public final void c(tdt tdtVar) {
        F(this.b.I(), tdtVar);
        if (this.b.u() != null) {
            D(this.b.u().m, tdtVar, this.c);
        }
    }

    @Override // defpackage.wmu
    public final void d(tdt tdtVar) {
        F(this.b.J(), tdtVar);
        if (this.b.u() != null) {
            D(this.b.u().l, tdtVar, this.c);
        }
    }

    @Override // defpackage.wmu
    public final void e(tdt tdtVar) {
        F(this.b.K(), tdtVar);
        if (this.b.u() != null) {
            D(this.b.u().k, tdtVar, this.c);
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
        if (this.i || !this.e) {
            return;
        }
        wmv wmvVar = this.g;
        tdt a = wmvVar != null ? wmvVar.a() : null;
        if (this.b.u() != null) {
            D(this.b.u().o, a, this.c);
        }
        this.d.e(this.b.H(), this.c.c(a), this.c);
    }

    @Override // defpackage.xlq
    public final void j(xce xceVar) {
        tdt tdtVar;
        if (this.i) {
            return;
        }
        this.i = true;
        if (xceVar == xce.VIDEO_ENDED || xceVar == xce.SURVEY_ENDED) {
            xbs xbsVar = this.c;
            xbsVar.d = false;
            xbsVar.e = TimeUnit.SECONDS.toMillis(this.b.c());
            wmv wmvVar = this.g;
            if (wmvVar != null) {
                tdw tdwVar = wmvVar.a;
                Map k = tdwVar.a.k(false);
                tey teyVar = tdwVar.a;
                tdtVar = tey.q(null, k);
            } else {
                tdtVar = null;
            }
            xbp c = this.c.c(tdtVar);
            while (this.l.size() > 0) {
                this.d.c((aoye) this.l.poll(), c);
            }
            while (this.m.size() > 0) {
                this.n.c(((xfy) this.m.poll()).b, null);
            }
            wmv wmvVar2 = this.g;
            F(this.b.N(), wmvVar2 != null ? wmvVar2.b() : null);
            this.j = 5;
        }
        if (xceVar == xce.AD_VIDEO_TIMEOUT) {
            this.d.e(this.b.P(), new xbn(new xbm(xbl.VIDEO_PLAYBACK_ERROR_LOAD_TIMEOUT, "ad.loadtimeout.fatal")));
            if (this.b.u() != null) {
                E(this.b.u().c, new afxe[0]);
            }
        }
    }

    @Override // defpackage.xlq
    public final void k(int i, int i2) {
        wmv wmvVar = this.g;
        tdt i3 = wmvVar != null ? wmvVar.i() : null;
        xbx xbxVar = new xbx(i, i2);
        xbp c = this.c.c(i3);
        this.d.e(this.b.Y(), xbxVar, c);
        if (this.b.u() != null) {
            E(this.b.u().f, xbxVar, c);
        }
    }

    @Override // defpackage.xlq
    public final void m(VisibilityChangeEventData visibilityChangeEventData) {
        wmv wmvVar = this.g;
        if (wmvVar != null) {
            wmvVar.l(visibilityChangeEventData);
        }
    }

    @Override // defpackage.xlq
    public final void n() {
        this.d.f(this.b.L());
        if (this.b.u() != null) {
            E(this.b.u().i, new afxe[0]);
        }
    }

    @Override // defpackage.xlq
    public final void o(afih afihVar) {
        xbn xbnVar = new xbn(xbm.d(afihVar));
        if (this.j != 5) {
            this.d.e(this.b.M(), xbnVar);
            this.d.e(this.b.P(), xbnVar);
            if (this.b.u() != null) {
                E(this.b.u().c, xbnVar);
            }
            this.j = 5;
        }
    }

    @Override // defpackage.xlq
    public final void p() {
    }

    @Override // defpackage.xlq
    public final void q() {
        this.d.f(this.b.T());
        if (this.b.u() != null) {
            E(this.b.u().p, new afxe[0]);
        }
    }

    @Override // defpackage.xlq
    public final void r() {
        this.c.d = false;
        wmv wmvVar = this.g;
        tdt f = wmvVar != null ? wmvVar.f() : null;
        F(this.b.V(), f);
        if (this.b.u() != null) {
            D(this.b.u().d, f, this.c);
        }
    }

    @Override // defpackage.xlq
    public final void s() {
        wmv wmvVar = this.g;
        if (wmvVar != null) {
            wmvVar.m();
        }
    }

    @Override // defpackage.xlq
    public final void t() {
        this.c.d = true;
        if (!this.e && !I()) {
            H();
            this.e = true;
        }
        if (this.j == 0) {
            this.j = 1;
            return;
        }
        wmv wmvVar = this.g;
        tdt g = wmvVar != null ? wmvVar.g() : null;
        F(this.b.X(), g);
        if (this.b.u() != null) {
            D(this.b.u().e, g, this.c);
        }
    }

    @Override // defpackage.xlq
    public final void u() {
    }

    @Override // defpackage.xlq
    public final void v() {
        this.d.f(this.b.M());
        if (this.b.u() != null) {
            E(this.b.u().g, new afxe[0]);
        }
    }

    @Override // defpackage.xlq
    public final void w(xbj xbjVar) {
        G((int) xbjVar.a());
    }

    @Override // defpackage.xlq
    public final void x(xgp xgpVar) {
        String b;
        Parcelable parcelable = this.b;
        if (!(parcelable instanceof SurveyAd) || xgpVar == null) {
            return;
        }
        aoyp aoypVar = xgpVar.a;
        boolean z = aoypVar == null || aoypVar.b;
        xhi xhiVar = this.d;
        aamu aamuVar = (aamu) ((aamr) parcelable).ah().get(0);
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Uri uri : aamuVar.i()) {
            arrayList.add(new AbstractMap.SimpleEntry(uri, xgpVar.a(String.valueOf(aamuVar.b()), aamuVar.f(), aamuVar.d(), aamuVar.e(), aamuVar.h(), uri)));
        }
        afxe[] afxeVarArr = {afxe.f};
        if (arrayList.size() > 0) {
            for (Map.Entry entry : arrayList) {
                Uri uri2 = (Uri) entry.getKey();
                List<Map.Entry> list = (List) entry.getValue();
                if (uri2 != null && !Uri.EMPTY.equals(uri2)) {
                    xhn xhnVar = (xhn) xhiVar;
                    Uri g = xhnVar.g(uri2, afxeVarArr);
                    afxf afxfVar = xhnVar.c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : list) {
                        Matcher matcher = afxf.a.matcher((CharSequence) entry2.getValue());
                        StringBuffer stringBuffer = new StringBuffer();
                        while (matcher.find()) {
                            if (matcher.groupCount() == 1 && (b = afxfVar.b(uri2, matcher.group(1), afxeVarArr)) != null) {
                                matcher.appendReplacement(stringBuffer, Uri.encode(b));
                            }
                        }
                        matcher.appendTail(stringBuffer);
                        arrayList2.add(new AbstractMap.SimpleEntry((String) entry2.getKey(), stringBuffer.toString()));
                    }
                    xhnVar.b.execute(new xhm(xhnVar, g, arrayList2, z));
                }
            }
        }
    }

    @Override // defpackage.xlq
    public final void y() {
        wmv wmvVar = this.g;
        F(this.b.o.w, wmvVar != null ? wmvVar.a() : null);
        if (this.b.u() != null) {
            E(this.b.u().s, new afxe[0]);
        }
    }

    @Override // defpackage.xlq
    public final void z(aheg ahegVar) {
        if (!ahegVar.j() || this.i) {
            return;
        }
        G((int) ahegVar.e());
    }

    private final void G(int i) {
        int i2 = this.h;
        if (i2 <= 0 || i - this.k <= i2) {
            long j = i;
            this.c.e = j;
            if (!this.e && I()) {
                H();
                this.e = true;
            }
            while (true) {
                if (this.l.size() > 0 && i >= ((aoye) this.l.peek()).d) {
                    ((xhn) this.d).c((aoye) this.l.poll(), afxe.f);
                }
            }
            while (this.m.size() > 0 && j >= ((xfy) this.m.peek()).a) {
                this.n.c(((xfy) this.m.poll()).b, null);
            }
            this.k = i;
            int c = this.b.c() * 1000;
            int i3 = c > 0 ? (i * 4) / c : 0;
            if (i3 >= this.j) {
                for (int i4 = i3; i4 >= this.j; i4--) {
                    wmv wmvVar = this.g;
                    if (F(h(this.b, i4), wmvVar != null ? wmvVar.h(i4) : null)) {
                        break;
                    }
                }
                this.j = i3 + 1;
            }
        }
    }
}
