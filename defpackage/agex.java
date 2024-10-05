package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agex implements Runnable {
    public final /* synthetic */ agff a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ agex(agff agffVar, String str, int i) {
        this.c = i;
        this.a = agffVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            agff agffVar = this.a;
            String str = this.b;
            if (agffVar.h.z() && agffVar.d(str) != null) {
                yjk.e();
                for (agnz agnzVar : agffVar.e.b(agffVar.c).values()) {
                    if (str.equals(agtw.r(agnzVar.f)) && agtw.aa(agnzVar.f) && agnzVar.c()) {
                        String t = agtw.t(agnzVar.f);
                        ((aghj) agffVar.m.get()).g(t);
                        ((aghj) agffVar.m.get()).e(t);
                        agffVar.t.put(t, agnf.STREAM_DOWNLOAD_PENDING);
                    }
                }
                return;
            }
            return;
        }
        if (i != 1) {
            agff agffVar2 = this.a;
            String str2 = this.b;
            if (agffVar2.h.z()) {
                agffVar2.x(str2);
                return;
            }
            return;
        }
        agff agffVar3 = this.a;
        String str3 = this.b;
        yjk.e();
        agil agilVar = (agil) agffVar3.j.get();
        atrx d = agilVar.d(str3);
        int U = ((agsg) agffVar3.d.get()).U(d);
        agno f = agffVar3.f(str3);
        agsz b = ((agsy) agffVar3.q.get()).b();
        List<String> q = agilVar.q(str3);
        agni n = agilVar.n(str3);
        if (n == null) {
            return;
        }
        agsx l = ((akgl) agffVar3.r.get()).l(n.a, q);
        l.f();
        for (String str4 : q) {
            aghj aghjVar = (aghj) agffVar3.m.get();
            agsx agsxVar = l;
            agff agffVar4 = agffVar3;
            agsz agszVar = b;
            aghjVar.h(str4, str3, null, d, null, U, f, 0, false, false, true);
            agsxVar.e(str4);
            agszVar.c(str4);
            b = agszVar;
            l = agsxVar;
            agffVar3 = agffVar4;
        }
    }
}
