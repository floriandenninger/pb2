package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agme implements agoy {
    public final agsg a;
    private final anib b;
    private final ScheduledExecutorService c;
    private final agof d;

    public agme(agsg agsgVar, agof agofVar, anib anibVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = agsgVar;
        this.d = agofVar;
        this.b = anibVar;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        final aghj c;
        final String g = aalt.g(atpqVar.d);
        int bU = anaf.bU(atpqVar.c);
        if (bU == 0) {
            bU = 1;
        }
        int i = bU - 1;
        if (i == 1) {
            final atpo atpoVar = atpqVar.e;
            if (atpoVar == null) {
                atpoVar = atpo.b;
            }
            agsn a = this.d.a();
            if (!afsxVar.d().equals(a.q())) {
                return anaf.O(agou.b);
            }
            agsw m = this.d.a().m();
            c = a instanceof agfp ? ((agfp) this.d.a()).c() : null;
            if (c == null) {
                return anaf.O(agou.a);
            }
            return ((anht) anfq.h(anht.q(m.h(g)), new amml() { // from class: agmc
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    agme agmeVar = agme.this;
                    aghj aghjVar = c;
                    String str = g;
                    atpo atpoVar2 = atpoVar;
                    ammv ammvVar = (ammv) obj;
                    if (!ammvVar.h()) {
                        return agou.c;
                    }
                    if (((agnv) ammvVar.c()).b()) {
                        return agou.a;
                    }
                    atwy atwyVar = (atwy) atpoVar2.pX(atwy.b);
                    atrx b = atrx.b(atwyVar.e);
                    if (b == null) {
                        b = atrx.UNKNOWN_FORMAT_TYPE;
                    }
                    atrx atrxVar = b;
                    aghjVar.h(str, (atwyVar.c & 32) != 0 ? atwyVar.h : null, null, atrxVar, atwyVar.f, agmeVar.a.U(atrxVar), agno.OFFLINE_IMMEDIATELY, 0, false, false, false);
                    return agou.a;
                }
            }, this.b)).r(30L, TimeUnit.SECONDS, this.c);
        }
        if (i == 3) {
            agsn a2 = this.d.a();
            if (!afsxVar.d().equals(a2.q())) {
                return anaf.O(agou.b);
            }
            agsw m2 = a2.m();
            final agil A = a2.A();
            if (A == null) {
                return anaf.O(agou.b);
            }
            c = a2 instanceof agfp ? ((agfp) this.d.a()).c() : null;
            if (c == null) {
                return anaf.O(agou.a);
            }
            return ((anht) anfq.h(anht.q(m2.h(g)), new amml() { // from class: agmd
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    agme agmeVar = agme.this;
                    agil agilVar = A;
                    String str = g;
                    aghj aghjVar = c;
                    ammv ammvVar = (ammv) obj;
                    if (!ammvVar.h()) {
                        return agou.c;
                    }
                    agilVar.M(str, false);
                    agnv agnvVar = (agnv) ammvVar.c();
                    atrx e = agilVar.e(str);
                    aghjVar.h(str, null, null, e, null, agmeVar.a.U(e), agnvVar.m, 1, true, true, false);
                    return agou.a;
                }
            }, this.b)).r(30L, TimeUnit.SECONDS, this.c);
        }
        return anaf.O(agou.c);
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        throw new UnsupportedOperationException();
    }
}
