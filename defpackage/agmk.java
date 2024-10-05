package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmk implements agoy {
    private final agrq a;
    private final agsg b;
    private final agzz c;
    private final ypa d;
    private final agof e;

    public agmk(agrq agrqVar, agsg agsgVar, agof agofVar, agzz agzzVar, ypa ypaVar) {
        this.a = agrqVar;
        this.b = agsgVar;
        this.e = agofVar;
        this.c = agzzVar;
        this.d = ypaVar;
    }

    @Override // defpackage.agoy
    public final agox a(atpq atpqVar) {
        return agox.a;
    }

    @Override // defpackage.agoy
    public final anhy b(afsx afsxVar, atpq atpqVar) {
        agou agouVar;
        agnp a;
        agou agouVar2;
        String g = aalt.g(atpqVar.d);
        if (!g.isEmpty()) {
            atpo atpoVar = atpqVar.e;
            if (atpoVar == null) {
                atpoVar = atpo.b;
            }
            awjk awjkVar = (awjk) atpoVar.pX(awjk.b);
            int bU = anaf.bU(atpqVar.c);
            if (bU == 0) {
                bU = 1;
            }
            int i = bU - 1;
            if (i != 1) {
                if (i == 2) {
                    agsn a2 = this.e.a();
                    if (!afsxVar.d().equals(a2.q())) {
                        agouVar2 = agou.b;
                    } else {
                        agil A = a2.A();
                        if (A == null) {
                            agouVar2 = agou.b;
                        } else if (A.D(g, 2)) {
                            A.v(g);
                            this.d.f(new aglb(g));
                            agouVar2 = agou.a;
                        } else {
                            agouVar2 = agou.b;
                        }
                    }
                    return anaf.O(agouVar2);
                }
                Object[] objArr = new Object[2];
                int bU2 = anaf.bU(atpqVar.c);
                if (bU2 == 0) {
                    bU2 = 1;
                }
                objArr[0] = Integer.valueOf(bU2 - 1);
                objArr[1] = 151;
                zga.e("Could not handle action: %s for type %s", objArr);
                return anaf.O(agou.c);
            }
            agsn a3 = this.e.a();
            if (!afsxVar.d().equals(a3.q())) {
                agouVar = agou.b;
            } else {
                agil A2 = a3.A();
                if (A2 == null) {
                    agouVar = agou.b;
                } else {
                    this.c.b(true);
                    atrx b = atrx.b(awjkVar.e);
                    if (b == null) {
                        b = atrx.UNKNOWN_FORMAT_TYPE;
                    }
                    atrx atrxVar = b;
                    String str = awjkVar.h;
                    byte[] I = (awjkVar.c & 1) != 0 ? awjkVar.d.I() : null;
                    agnv p = A2.p(g);
                    if (p == null || p.s()) {
                        if (A2.c(g) == null) {
                            int i2 = awjkVar.c;
                            if ((i2 & 4) == 0 || (i2 & 8) == 0) {
                                try {
                                    a = this.a.a(g);
                                } catch (ExecutionException unused) {
                                    agouVar = agou.c;
                                }
                            } else {
                                awjq awjqVar = awjkVar.f;
                                if (awjqVar == null) {
                                    awjqVar = awjq.a;
                                }
                                awid awidVar = awjkVar.g;
                                if (awidVar == null) {
                                    awidVar = awid.a;
                                }
                                aone createBuilder = atqx.a.createBuilder();
                                String str2 = awjqVar.e;
                                createBuilder.copyOnWrite();
                                atqx atqxVar = (atqx) createBuilder.instance;
                                str2.getClass();
                                atqxVar.b |= 1;
                                atqxVar.c = str2;
                                String str3 = awjqVar.g;
                                createBuilder.copyOnWrite();
                                atqx atqxVar2 = (atqx) createBuilder.instance;
                                str3.getClass();
                                atqxVar2.b |= 8;
                                atqxVar2.f = str3;
                                long seconds = TimeUnit.MILLISECONDS.toSeconds(awjqVar.h);
                                createBuilder.copyOnWrite();
                                atqx atqxVar3 = (atqx) createBuilder.instance;
                                atqxVar3.b |= 32;
                                atqxVar3.h = seconds;
                                int i3 = awjqVar.i;
                                createBuilder.copyOnWrite();
                                atqx atqxVar4 = (atqx) createBuilder.instance;
                                atqxVar4.b |= 8192;
                                atqxVar4.o = i3;
                                String az = wbs.az(awjqVar.i);
                                createBuilder.copyOnWrite();
                                atqx atqxVar5 = (atqx) createBuilder.instance;
                                az.getClass();
                                atqxVar5.b |= 16;
                                atqxVar5.g = az;
                                long j = awjqVar.m;
                                createBuilder.copyOnWrite();
                                atqx atqxVar6 = (atqx) createBuilder.instance;
                                atqxVar6.b |= 64;
                                atqxVar6.i = j;
                                awjm awjmVar = awjqVar.q;
                                if (awjmVar == null) {
                                    awjmVar = awjm.a;
                                }
                                String str4 = awjmVar.c;
                                createBuilder.copyOnWrite();
                                atqx atqxVar7 = (atqx) createBuilder.instance;
                                str4.getClass();
                                atqxVar7.b |= 1024;
                                atqxVar7.l = str4;
                                awjm awjmVar2 = awjqVar.q;
                                if (awjmVar2 == null) {
                                    awjmVar2 = awjm.a;
                                }
                                String str5 = awjmVar2.d;
                                createBuilder.copyOnWrite();
                                atqx atqxVar8 = (atqx) createBuilder.instance;
                                str5.getClass();
                                atqxVar8.b |= 2048;
                                atqxVar8.m = str5;
                                awjm awjmVar3 = awjqVar.q;
                                if (awjmVar3 == null) {
                                    awjmVar3 = awjm.a;
                                }
                                String str6 = awjmVar3.e;
                                createBuilder.copyOnWrite();
                                atqx atqxVar9 = (atqx) createBuilder.instance;
                                str6.getClass();
                                atqxVar9.b |= 4096;
                                atqxVar9.n = str6;
                                avgg avggVar = awjqVar.j;
                                if (avggVar == null) {
                                    avggVar = avgg.a;
                                }
                                createBuilder.copyOnWrite();
                                atqx atqxVar10 = (atqx) createBuilder.instance;
                                avggVar.getClass();
                                atqxVar10.d = avggVar;
                                atqxVar10.b |= 2;
                                aone createBuilder2 = atot.a.createBuilder();
                                aone createBuilder3 = atos.a.createBuilder();
                                String str7 = awidVar.e;
                                createBuilder3.copyOnWrite();
                                atos atosVar = (atos) createBuilder3.instance;
                                str7.getClass();
                                atosVar.b |= 1;
                                atosVar.c = str7;
                                String str8 = awidVar.f;
                                createBuilder3.copyOnWrite();
                                atos atosVar2 = (atos) createBuilder3.instance;
                                str8.getClass();
                                atosVar2.b |= 4;
                                atosVar2.e = str8;
                                avgg avggVar2 = awidVar.g;
                                if (avggVar2 == null) {
                                    avggVar2 = avgg.a;
                                }
                                createBuilder3.copyOnWrite();
                                atos atosVar3 = (atos) createBuilder3.instance;
                                avggVar2.getClass();
                                atosVar3.d = avggVar2;
                                atosVar3.b |= 2;
                                createBuilder2.copyOnWrite();
                                atot atotVar = (atot) createBuilder2.instance;
                                atos atosVar4 = (atos) createBuilder3.build();
                                atosVar4.getClass();
                                atotVar.c = atosVar4;
                                atotVar.b |= 1;
                                atot atotVar2 = (atot) createBuilder2.build();
                                createBuilder.copyOnWrite();
                                atqx atqxVar11 = (atqx) createBuilder.instance;
                                atotVar2.getClass();
                                atqxVar11.e = atotVar2;
                                atqxVar11.b |= 4;
                                aong aongVar = (aong) aqyg.a.createBuilder();
                                aong aongVar2 = (aong) aqyi.a.createBuilder();
                                awnd awndVar = awjqVar.k;
                                if (awndVar == null) {
                                    awndVar = awnd.a;
                                }
                                String str9 = awndVar.c;
                                aongVar2.copyOnWrite();
                                aqyi aqyiVar = (aqyi) aongVar2.instance;
                                str9.getClass();
                                aqyiVar.b |= 1;
                                aqyiVar.c = str9;
                                aongVar.ck((aqyi) aongVar2.build());
                                createBuilder.copyOnWrite();
                                atqx atqxVar12 = (atqx) createBuilder.instance;
                                aqyg aqygVar = (aqyg) aongVar.build();
                                aqygVar.getClass();
                                atqxVar12.k = aqygVar;
                                atqxVar12.b |= 512;
                                a = agnp.c((atqx) createBuilder.build());
                            }
                            if (A2.ac(a, atrxVar, str, this.b.U(atrxVar), agno.OFFLINE_IMMEDIATELY, 0, I, agnf.ACTIVE)) {
                                agnb agnbVar = a.a;
                                if (agnbVar != null) {
                                    if (A2.c.b(agnbVar.a) == null) {
                                        A2.c.c(agnbVar);
                                    } else {
                                        A2.c.d(agnbVar);
                                    }
                                }
                                a3.m().w(g, true);
                                agouVar = agou.a;
                            } else {
                                agouVar = agou.c;
                            }
                        } else {
                            A2.R(g, agnf.ACTIVE, atrxVar, str, 0, I);
                            A2.E(g);
                            A2.V(g, agnf.ACTIVE);
                            a3.m().w(g, true);
                            agouVar = agou.a;
                        }
                    } else if (p.u() && (!p.a() || p.y() || p.t() || p.r())) {
                        a3.l().c(g);
                        A2.V(g, agnf.ACTIVE);
                        A2.x(g);
                        a3.m().w(g, true);
                        agouVar = agou.a;
                    } else if (!p.e) {
                        A2.E(g);
                        a3.m().w(g, false);
                        agouVar = agou.a;
                    } else {
                        agouVar = agou.a;
                    }
                }
            }
            return anaf.O(agouVar);
        }
        return anaf.O(agou.c);
    }

    @Override // defpackage.agoy
    public final anhy c(afsx afsxVar, amru amruVar) {
        throw new UnsupportedOperationException();
    }
}
