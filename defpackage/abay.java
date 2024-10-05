package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abay extends aasu {
    final /* synthetic */ abaz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abay(abaz abazVar, aarm aarmVar) {
        super(aarmVar, abazVar.e, arzb.a, abaa.o, abax.a);
        this.a = abazVar;
    }

    @Override // defpackage.aasu
    public final /* bridge */ /* synthetic */ Object h(aooy aooyVar) {
        return (arzb) aooyVar;
    }

    @Override // defpackage.aasu
    public final /* bridge */ /* synthetic */ void m(aaru aaruVar, Object obj) {
        int bC;
        auav b;
        arzb arzbVar = (arzb) obj;
        abaz abazVar = this.a;
        arza arzaVar = (arza) ((aone) aaruVar.a()).build();
        aahu c = abazVar.b.c();
        String str = (arzbVar.b & 16384) != 0 ? arzbVar.i : arzaVar.d;
        for (auau auauVar : arzaVar.e) {
            int bC2 = anaf.bC(auauVar.c);
            int i = 3;
            if (bC2 != 0) {
                int i2 = 2;
                if (bC2 == 2) {
                    String f = aalt.f(231, auauVar.d);
                    c.f(f).H(ayps.w(aumu.d(f).c())).g(aumv.class).r(new nsg(str, 3)).c(new kvr(c, str, i2)).S(ggc.k, zxi.e);
                    ypa ypaVar = abazVar.a;
                    String str2 = auauVar.d;
                    arzd arzdVar = (arzd) adyu.dv(arzaVar.f, arzd.a.getParserForType());
                    if (arzdVar == null) {
                        b = auav.PAGE_SOURCE_UNKNOWN;
                    } else {
                        b = auav.b(arzdVar.b);
                        if (b == null) {
                            b = auav.PAGE_SOURCE_UNKNOWN;
                        }
                    }
                    ypaVar.d(new abbf(str, str2, b, arzbVar));
                }
            }
            int bC3 = anaf.bC(auauVar.c);
            if ((bC3 != 0 && bC3 == 3) || ((bC = anaf.bC(auauVar.c)) != 0 && bC == 19)) {
                c.f(aalt.f(231, auauVar.k)).g(aumv.class).r(new nsg(str, 4)).c(new kvr(c, str, i)).S(ggc.l, zxi.f);
                abazVar.a.d(new abbi(arzaVar.d, auauVar.k, auauVar.e, arzbVar));
            } else {
                int bC4 = anaf.bC(auauVar.c);
                if (bC4 != 0 && bC4 == 4) {
                    abazVar.a.d(new abbh(arzaVar.d, auauVar.e, auauVar.g));
                } else {
                    int bC5 = anaf.bC(auauVar.c);
                    if (bC5 != 0 && bC5 == 36) {
                        abazVar.a.d(new abbg(arzaVar.d, auauVar.e, auauVar.f, arzbVar));
                    } else {
                        int bC6 = anaf.bC(auauVar.c);
                        if (bC6 != 0 && bC6 == 32) {
                            abazVar.a.d(new abbb(arzaVar.d, auauVar.l, true));
                        } else {
                            int bC7 = anaf.bC(auauVar.c);
                            if (bC7 != 0 && bC7 == 33) {
                                abazVar.a.d(new abba(arzaVar.d, zhq.h(arzbVar.g), true));
                            } else {
                                int bC8 = anaf.bC(auauVar.c);
                                if (bC8 != 0 && bC8 == 30) {
                                    abazVar.a.d(new abbd(arzaVar.d, true));
                                } else {
                                    int bC9 = anaf.bC(auauVar.c);
                                    if (bC9 != 0 && bC9 == 11) {
                                        abazVar.a.d(new abbc(arzaVar.d, arzbVar));
                                    } else {
                                        int bC10 = anaf.bC(auauVar.c);
                                        if (bC10 != 0 && bC10 == 15) {
                                            abazVar.a.d(new abbc(arzaVar.d, arzbVar));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.aasu
    public final void n(aaru aaruVar) {
        abaz abazVar = this.a;
        arza arzaVar = (arza) ((aone) aaruVar.a()).build();
        for (auau auauVar : arzaVar.e) {
            int bC = anaf.bC(auauVar.c);
            if (bC != 0 && bC == 32) {
                abazVar.a.d(new abbb(arzaVar.d, auauVar.l, false));
            } else {
                int bC2 = anaf.bC(auauVar.c);
                if (bC2 != 0 && bC2 == 33) {
                    abazVar.a.d(new abba(arzaVar.d, "", false));
                } else {
                    int bC3 = anaf.bC(auauVar.c);
                    if (bC3 != 0 && bC3 == 30) {
                        abazVar.a.d(new abbd(arzaVar.d, false));
                    } else {
                        int bC4 = anaf.bC(auauVar.c);
                        if (bC4 != 0 && bC4 == 2) {
                            abazVar.a.d(new abbe(arzaVar.d, auauVar.d));
                        }
                    }
                }
            }
        }
    }
}
