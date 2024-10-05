package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fio {
    public final fiu a;

    public fio(fiu fiuVar) {
        this.a = fiuVar;
    }

    public static Long c(aakt aaktVar) {
        asxn b;
        if (aaktVar instanceof awil) {
            return ((awil) aaktVar).getAddedTimestampMillis();
        }
        if (aaktVar instanceof awig) {
            return ((awig) aaktVar).getAddedTimestampMillis();
        }
        if (!(aaktVar instanceof asxs) || (b = ((asxs) aaktVar).b()) == null) {
            return -1L;
        }
        return b.getAddedTimestampMillis();
    }

    private static final aypy d(aakv aakvVar, String str, final aqnf aqnfVar) {
        return aakvVar.f(str).g(awiu.class).x(eoe.l).O(eoe.o).L(new ayrw() { // from class: fig
            @Override // defpackage.ayrw
            public final boolean a(Object obj) {
                int i;
                aqnf aqnfVar2 = aqnf.this;
                awiv awivVar = (awiv) obj;
                aqnf aqnfVar3 = aqnf.FILTER_TYPE_UNSPECIFIED;
                int ordinal = aqnfVar2.ordinal();
                return ordinal != 2 ? ordinal != 3 || (i = awivVar.b) == 1 || i == 3 : awivVar.b == 2;
            }
        }).Y(new eoe(15)).Y(eoe.m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayps a(final aakv aakvVar, String str, final String str2) {
        final int i = 1;
        ayps j = d(aakvVar, str, aqnf.FILTER_TYPE_NONE).P(new ayrv(this) { // from class: fil
            public final /* synthetic */ fio a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                ayqj F;
                if (i == 0) {
                    fio fioVar = this.a;
                    final aakv aakvVar2 = aakvVar;
                    final String str3 = str2;
                    final fin finVar = (fin) obj;
                    return fioVar.a.b().i(new ayrv() { // from class: fim
                        @Override // defpackage.ayrv
                        public final Object a(Object obj2) {
                            String str4 = str3;
                            aakv aakvVar3 = aakvVar2;
                            fin finVar2 = finVar;
                            if (((amsx) obj2).contains(str4)) {
                                return ayps.p();
                            }
                            if (finVar2.b != 156) {
                                return aakvVar3.f(finVar2.a);
                            }
                            return aakvVar3.f(fhe.h(str4));
                        }
                    });
                }
                fio fioVar2 = this.a;
                final aakv aakvVar3 = aakvVar;
                final String str4 = str2;
                final fin finVar2 = (fin) obj;
                if (finVar2.b != 156) {
                    F = ayqj.F(Boolean.valueOf(finVar2.c.matches(str4)));
                } else {
                    F = fioVar2.a.a().i(new ayrv() { // from class: fij
                        @Override // defpackage.ayrv
                        public final Object a(Object obj2) {
                            fin finVar3 = fin.this;
                            aakv aakvVar4 = aakvVar3;
                            if (!((amsx) obj2).contains(finVar3.c)) {
                                return aakvVar4.f(fhe.t(finVar3.c));
                            }
                            return ayps.p();
                        }
                    }).g(awja.class).x(new ayrv() { // from class: fik
                        @Override // defpackage.ayrv
                        public final Object a(Object obj2) {
                            fin finVar3 = fin.this;
                            return Boolean.valueOf(((awja) obj2).f().contains(fhe.u(finVar3.c, str4)));
                        }
                    }).Q(ayqj.F(false));
                }
                return F.G(new ayrv() { // from class: fii
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        return ((Boolean) obj2).booleanValue() ? ammv.j(fin.this) : amlr.a;
                    }
                });
            }
        }).L(eng.k).Y(eoe.j).j();
        final int i2 = 0;
        return j.s(new ayrv(this) { // from class: fil
            public final /* synthetic */ fio a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                ayqj F;
                if (i2 == 0) {
                    fio fioVar = this.a;
                    final aakv aakvVar2 = aakvVar;
                    final String str3 = str2;
                    final fin finVar = (fin) obj;
                    return fioVar.a.b().i(new ayrv() { // from class: fim
                        @Override // defpackage.ayrv
                        public final Object a(Object obj2) {
                            String str4 = str3;
                            aakv aakvVar3 = aakvVar2;
                            fin finVar2 = finVar;
                            if (((amsx) obj2).contains(str4)) {
                                return ayps.p();
                            }
                            if (finVar2.b != 156) {
                                return aakvVar3.f(finVar2.a);
                            }
                            return aakvVar3.f(fhe.h(str4));
                        }
                    });
                }
                fio fioVar2 = this.a;
                final aakv aakvVar3 = aakvVar;
                final String str4 = str2;
                final fin finVar2 = (fin) obj;
                if (finVar2.b != 156) {
                    F = ayqj.F(Boolean.valueOf(finVar2.c.matches(str4)));
                } else {
                    F = fioVar2.a.a().i(new ayrv() { // from class: fij
                        @Override // defpackage.ayrv
                        public final Object a(Object obj2) {
                            fin finVar3 = fin.this;
                            aakv aakvVar4 = aakvVar3;
                            if (!((amsx) obj2).contains(finVar3.c)) {
                                return aakvVar4.f(fhe.t(finVar3.c));
                            }
                            return ayps.p();
                        }
                    }).g(awja.class).x(new ayrv() { // from class: fik
                        @Override // defpackage.ayrv
                        public final Object a(Object obj2) {
                            fin finVar3 = fin.this;
                            return Boolean.valueOf(((awja) obj2).f().contains(fhe.u(finVar3.c, str4)));
                        }
                    }).Q(ayqj.F(false));
                }
                return F.G(new ayrv() { // from class: fii
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        return ((Boolean) obj2).booleanValue() ? ammv.j(fin.this) : amlr.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayqj b(aakv aakvVar, String str, aqnf aqnfVar, int i, fic ficVar) {
        ayqj av;
        aypy Y = d(aakvVar, str, aqnfVar).ao(this.a.b().l(), epc.d).L(new eng(10)).Y(eoe.k).ao(this.a.a().l(), epc.d).L(new eng(11)).Y(eoe.k).Y(eoe.i);
        aakvVar.getClass();
        aypy t = Y.t(new fiy(aakvVar, 1));
        if (ficVar == fic.TIME_DESCENDING) {
            av = t.av().G(new aysr(bea.g));
        } else {
            av = t.av();
        }
        return av.G(eoe.n).G(new fih(i, 0));
    }
}
