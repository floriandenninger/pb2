package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nto extends ajsu implements glh, oiq, nrg, glt {
    public final ypa a;
    public final zaw b;
    public final fqu c;
    public final ajpd d;
    public final aasm e;
    public final Map f;
    public final Set g;
    public final azqv h;
    public acra i;
    public oiz j;
    public RecyclerView k;
    public LoadingFrameLayout l;
    public boolean m;
    public int n;
    public boolean o = true;
    public String p;
    public boolean q;
    public ayqx r;
    public aubs s;
    public int t;
    private final Set u;
    private final Set v;

    public nto(ypa ypaVar, aahd aahdVar, abds abdsVar, zaw zawVar, aoae aoaeVar, gpe gpeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        final int i = 1;
        this.a = ypaVar;
        this.b = zawVar;
        this.e = abdsVar;
        HashSet hashSet = new HashSet();
        this.g = hashSet;
        hashSet.add(new ajnn(aahdVar));
        hashSet.add(new ajol(this) { // from class: ntk
            public final /* synthetic */ nto a;

            {
                this.a = this;
            }

            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i2) {
                if (i != 0) {
                    ajokVar.f("PLAYLIST_CURRENT_VIDEO_MONITOR", this.a);
                } else {
                    ajokVar.f("PLAYLIST_VIDEO_INTERACTION_LOGGING_TRIGGER", this.a);
                }
            }
        });
        final int i2 = 0;
        hashSet.add(new ajol(this) { // from class: ntk
            public final /* synthetic */ nto a;

            {
                this.a = this;
            }

            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i22) {
                if (i2 != 0) {
                    ajokVar.f("PLAYLIST_CURRENT_VIDEO_MONITOR", this.a);
                } else {
                    ajokVar.f("PLAYLIST_VIDEO_INTERACTION_LOGGING_TRIGGER", this.a);
                }
            }
        });
        this.f = new HashMap();
        this.u = Collections.newSetFromMap(new WeakHashMap());
        this.v = Collections.newSetFromMap(new WeakHashMap());
        this.c = new fqu();
        this.d = new ajpd();
        this.h = azqv.ap();
        aoaeVar.D(this);
        gpeVar.d.n().X(new ntl(this, i2));
    }

    @Override // defpackage.glh
    public final String b() {
        return this.p;
    }

    @Override // defpackage.glh
    public final void c(glg glgVar) {
        this.u.add(glgVar);
    }

    @Override // defpackage.nrg
    public final void d() {
    }

    @Override // defpackage.glt
    public final void f(mkh mkhVar) {
        this.v.remove(mkhVar);
    }

    @Override // defpackage.nrg
    public final void h() {
    }

    public final void i() {
        if (this.o) {
            Object obj = this.h.h.get();
            this.o = (obj == null || azqm.g(obj) || azqm.h(obj) || !((aubs) this.h.ar()).r) ? false : true;
            Integer num = (Integer) this.f.get(this.p);
            if (num != null) {
                l(num.intValue(), false);
            }
        }
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public final void j() {
        this.m = false;
        this.q = false;
        this.k = null;
        this.l = null;
        this.i = null;
        this.j = null;
        this.s = null;
        Object obj = this.r;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.r = null;
        }
    }

    @Override // defpackage.oiq
    public final void k() {
        if (this.m) {
            this.l.c();
        }
    }

    public final void l(int i, boolean z) {
        int max = Math.max(this.c.a(i) - 2, 0);
        wd wdVar = this.k.n;
        if (wdVar instanceof LinearScrollToItemLayoutManager) {
            if (z) {
                ((LinearScrollToItemLayoutManager) wdVar).bC(max);
            } else {
                ((LinearLayoutManager) wdVar).aa(max, 0);
            }
        }
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.c.a;
    }

    public final void m(String str) {
        this.p = str;
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((glg) it.next()).a();
        }
    }

    public final void n() {
        Object mwfVar;
        aubs aubsVar = this.s;
        if (aubsVar == null) {
            return;
        }
        ajpd ajpdVar = this.d;
        this.f.clear();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (aubr aubrVar : aubsVar.i) {
            int i2 = aubrVar.b;
            if ((i2 & 1) != 0) {
                aubw aubwVar = aubrVar.c;
                if (aubwVar == null) {
                    aubwVar = aubw.a;
                }
                int i3 = this.t;
                asvx asvxVar = aubwVar.t;
                if (asvxVar == null) {
                    asvxVar = asvx.a;
                }
                int cY = amkq.cY(asvxVar.c);
                if (cY == 0 || cY != 3) {
                    mwfVar = new mwf(aubwVar);
                } else if (i3 == 1) {
                    mwfVar = new mwc(aubwVar);
                } else {
                    mwfVar = new mkj(aubwVar);
                }
                arrayList.add(mwfVar);
                aubw aubwVar2 = aubrVar.c;
                if (aubwVar2 == null) {
                    aubwVar2 = aubw.a;
                }
                String str = aubwVar2.o;
                this.f.put(str, Integer.valueOf(i));
                aubw aubwVar3 = aubrVar.c;
                if (aubwVar3 == null) {
                    aubwVar3 = aubw.a;
                }
                if (aubwVar3.k) {
                    m(str);
                }
            } else if ((i2 & 128) != 0) {
                aubt aubtVar = aubrVar.e;
                if (aubtVar == null) {
                    aubtVar = aubt.a;
                }
                arrayList.add(new kxw(aubtVar));
            } else if ((i2 & 512) != 0) {
                atdn atdnVar = aubrVar.g;
                if (atdnVar == null) {
                    atdnVar = atdn.a;
                }
                arrayList.add(atdnVar);
            } else if ((i2 & 256) != 0) {
                aqrf aqrfVar = aubrVar.f;
                if (aqrfVar == null) {
                    aqrfVar = aqrf.a;
                }
                arrayList.add(ajds.a(aqrfVar));
            }
            i++;
        }
        ajpdVar.p(arrayList);
        ajpd ajpdVar2 = this.d;
        aubs aubsVar2 = this.s;
        ArrayList arrayList2 = new ArrayList();
        for (aubr aubrVar2 : aubsVar2.i) {
            if ((aubrVar2.b & 32) != 0) {
                aubp aubpVar = aubrVar2.d;
                if (aubpVar == null) {
                    aubpVar = aubp.a;
                }
                arrayList2.add(aubpVar);
            }
        }
        ajpdVar2.addAll(arrayList2);
        this.c.b(this.d);
        this.l.a();
    }

    @Override // defpackage.nrg
    public final void oS() {
    }

    @Override // defpackage.nrg
    public final void oT() {
    }

    @Override // defpackage.glh
    public final void oU(glg glgVar) {
        this.u.remove(glgVar);
    }

    @Override // defpackage.glt
    public final void oV(mkh mkhVar) {
        this.v.add(mkhVar);
    }

    @Override // defpackage.nrg
    public final void oX() {
        Iterator it = new HashSet(this.v).iterator();
        while (it.hasNext()) {
            ((mkh) it.next()).a();
        }
    }
}
