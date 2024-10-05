package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aixl implements aixm {
    public boolean a;
    private yos d;
    private long f;
    private final aixr c = new aixr();
    private final List i = new ArrayList();
    public final List b = new ArrayList();
    private final List j = new ArrayList();
    private final List k = new ArrayList();
    private long e = Long.MIN_VALUE;
    private boolean g = true;
    private boolean h = true;

    private final yos q(long j) {
        return new yos(this.c.a(j));
    }

    private final yos r(long j, long j2) {
        Iterator it;
        aixr aixrVar = this.c;
        if (j2 == Long.MAX_VALUE) {
            it = aixrVar.a(j);
        } else {
            it = aixrVar.b.subSet(aixo.r(j), aixo.r(j2 + 1)).iterator();
        }
        return new yos(it);
    }

    private final void s() {
        amkq.N(!this.a);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            c((aixi) it.next());
        }
        this.i.clear();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            i((aixi) it2.next());
        }
        this.b.clear();
        for (Pair pair : this.j) {
            f((aixi) pair.first, ((Long) pair.second).longValue());
        }
        this.j.clear();
    }

    private final void t() {
        for (wvz wvzVar : this.k) {
            aixr<aixi> aixrVar = this.c;
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (aixi aixiVar : aixrVar) {
                int i = aixiVar.m;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            z = true;
                        }
                    }
                    arrayList.add(new TimelineMarker(aixiVar.q(), aixiVar.p()));
                } else {
                    throw null;
                }
            }
            ahyp ahypVar = new ahyp(z ? ahyo.LIVE_AD_MARKER : ahyo.AD_MARKER, arrayList);
            if (!amkq.b(wvzVar.b, ahypVar)) {
                wvzVar.b = ahypVar;
                ((ypa) wvzVar.a.get()).d(ahypVar);
            }
        }
    }

    public final synchronized long a(long j) {
        amkq.N(!this.a);
        if (this.g) {
            l();
        }
        if (j >= this.e && j > Long.MIN_VALUE && j < Long.MAX_VALUE) {
            if (this.g) {
                zga.l("CueRangeManger state error: isTrackingPaused = true");
            }
            this.a = true;
            if (this.h) {
                this.d = q(this.e + 1);
                this.h = false;
                t();
            }
            while (this.d.hasNext() && j >= ((aixn) this.d.a()).a) {
                aixn aixnVar = (aixn) this.d.next();
                aixi aixiVar = (aixi) aixnVar.b;
                if (aixnVar.c == 1) {
                    aixiVar.l(this.g, false, false, aixnVar.a);
                } else {
                    aixiVar.o();
                }
            }
            this.e = j;
            this.a = false;
            s();
            if (!this.d.hasNext()) {
                return Long.MAX_VALUE;
            }
            return ((aixn) this.d.a()).a - j;
        }
        String l = Long.toString(j);
        String l2 = Long.toString(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 65 + String.valueOf(l2).length());
        sb.append("CueRangeManger state error: currentPosition=");
        sb.append(l);
        sb.append(" lastPositionTracked=");
        sb.append(l2);
        zga.l(sb.toString());
        return Long.MAX_VALUE;
    }

    public final synchronized long b(long j, boolean z) {
        yos r;
        amkq.N(!this.a);
        if (j <= Long.MIN_VALUE || j >= Long.MAX_VALUE) {
            String valueOf = String.valueOf(Long.toString(j));
            zga.l(valueOf.length() != 0 ? "CueRangeManger state error: newPosition=".concat(valueOf) : new String("CueRangeManger state error: newPosition="));
        }
        t();
        long j2 = this.g ? this.f : this.e;
        this.a = true;
        if (j > j2) {
            r = r(j2, j);
        } else {
            r = r(j, j2);
        }
        this.d = r;
        while (this.d.hasNext()) {
            aixn aixnVar = (aixn) this.d.next();
            aixi aixiVar = (aixi) aixnVar.b;
            boolean s = aixiVar.s(j2);
            boolean s2 = aixiVar.s(j);
            long q = aixiVar.q();
            long p = aixiVar.p();
            if (s || !s2) {
                if (s && !s2 && q != p) {
                    aixiVar.o();
                }
            } else if (q != p || aixnVar.c != 2) {
                aixiVar.l(this.g, true, z, j);
            } else {
                aixiVar.o();
            }
        }
        if (this.g) {
            this.f = j;
        } else {
            this.e = j;
        }
        this.d = q(1 + j);
        this.h = false;
        this.a = false;
        s();
        if (this.d.hasNext()) {
            return ((aixn) this.d.a()).a - j;
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.aixm
    public final synchronized void c(aixi aixiVar) {
        if (aixiVar == null) {
            return;
        }
        if (this.a) {
            this.i.add(aixiVar);
            return;
        }
        this.c.b(aixiVar);
        aixiVar.rK(this.e);
        this.h = true;
        t();
    }

    @Override // defpackage.aixm
    public final synchronized void d(List list) {
        if (this.a) {
            this.i.addAll(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aixi aixiVar = (aixi) it.next();
            this.c.b(aixiVar);
            aixiVar.rK(this.e);
        }
        this.h = true;
        t();
    }

    public final void e(aixi aixiVar) {
        if (aixiVar == null) {
            return;
        }
        if (aixiVar.l && aixiVar.s(this.e)) {
            aixiVar.o();
        }
        this.h = true;
    }

    @Override // defpackage.aixm
    public final synchronized void f(aixi aixiVar, long j) {
        if (aixiVar != null) {
            if (this.c.c(aixiVar)) {
                if (this.a) {
                    this.j.add(new Pair(aixiVar, Long.valueOf(j)));
                } else if (this.e < aixiVar.p()) {
                    aixiVar.m(j);
                    this.h = true;
                    t();
                }
            }
        }
    }

    public final synchronized void g() {
        b(9223372036854775806L, false);
        this.g = false;
        k();
    }

    public final synchronized void h() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.f = this.e;
    }

    @Override // defpackage.aixm
    public final synchronized void i(aixi aixiVar) {
        if (aixiVar != null) {
            if (this.c.c(aixiVar)) {
                if (this.a) {
                    this.b.add(aixiVar);
                    return;
                }
                aixr aixrVar = this.c;
                aixi[] aixiVarArr = {aixiVar};
                for (int i = 0; i <= 0; i++) {
                    aixi aixiVar2 = aixiVarArr[i];
                    aixrVar.a.remove(aixiVar2);
                    aixrVar.b.remove(aixiVar2.n);
                    aixrVar.b.remove(aixiVar2.o);
                }
                e(aixiVar);
                t();
            }
        }
    }

    @Override // defpackage.aixm
    public final synchronized void j(final Class cls) {
        aixr aixrVar = this.c;
        amml ammlVar = new amml() { // from class: aixk
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aixl aixlVar = aixl.this;
                aixi aixiVar = (aixi) obj;
                if (cls.isInstance(aixiVar)) {
                    if (aixlVar.a) {
                        aixlVar.b.add(aixiVar);
                        return false;
                    }
                    return true;
                }
                return false;
            }
        };
        zfi zfiVar = new zfi() { // from class: aixj
            @Override // defpackage.zfi
            public final void a(Object obj) {
                aixl.this.e((aixi) obj);
            }
        };
        Iterator it = aixrVar.a.iterator();
        while (it.hasNext()) {
            aixo aixoVar = (aixo) it.next();
            if (((Boolean) ammlVar.apply(aixoVar)).booleanValue()) {
                it.remove();
                aixrVar.b.remove(aixoVar.n);
                aixrVar.b.remove(aixoVar.o);
                zfiVar.a(aixoVar);
            }
        }
        t();
    }

    public final synchronized void k() {
        this.e = Long.MIN_VALUE;
        this.h = true;
        h();
        j(aixi.class);
        this.d = q(this.e);
    }

    public final synchronized void l() {
        if (this.g) {
            this.g = false;
            long j = this.e;
            long j2 = this.f;
            if (j != j2) {
                b(j2, false);
            } else {
                t();
            }
        }
    }

    public final synchronized void m() {
        this.g = false;
        b(-9223372036854775807L, false);
    }

    public final synchronized boolean n() {
        return this.g;
    }

    @Override // defpackage.aixm
    public final synchronized void o(wvz wvzVar) {
        if (this.k.contains(wvzVar)) {
            return;
        }
        this.k.add(wvzVar);
    }

    @Override // defpackage.aixm
    public final synchronized void p(wvz wvzVar) {
        this.k.remove(wvzVar);
    }
}
