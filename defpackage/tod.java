package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tod implements anfz {
    public final /* synthetic */ tov a;
    public final /* synthetic */ tkv b;
    public final /* synthetic */ tld c;
    private final /* synthetic */ int d;

    public /* synthetic */ tod(tov tovVar, tkv tkvVar, tld tldVar, int i) {
        this.d = i;
        this.a = tovVar;
        this.b = tkvVar;
        this.c = tldVar;
    }

    public /* synthetic */ tod(tov tovVar, tld tldVar, tkv tkvVar, int i) {
        this.d = i;
        this.a = tovVar;
        this.c = tldVar;
        this.b = tkvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int aq;
        anhy anhyVar;
        int i = 3;
        int i2 = 1;
        switch (this.d) {
            case 0:
                tov tovVar = this.a;
                tkv tkvVar = this.b;
                tld tldVar = this.c;
                if (!tovVar.j.h() || (aq = rwh.aq(tkvVar.q)) == 0 || aq == 1) {
                    return anaf.O(true);
                }
                tub tubVar = (tub) ((amnv) tovVar.j.c()).get();
                int i3 = tkvVar.q;
                String str = tldVar.c;
                return tubVar.a();
            case 1:
                tov tovVar2 = this.a;
                tkv tkvVar2 = this.b;
                tld tldVar2 = this.c;
                tkv tkvVar3 = (tkv) obj;
                if (tkvVar3 != null) {
                    return anaf.O(Boolean.valueOf(tov.p(tkvVar2, tkvVar3)));
                }
                aone builder = tldVar2.toBuilder();
                builder.copyOnWrite();
                tld tldVar3 = (tld) builder.instance;
                tldVar3.b |= 8;
                tldVar3.f = true;
                return anfq.i(tovVar2.d.g((tld) builder.build()), new tnq(tkvVar2, null == true ? 1 : 0), tovVar2.h);
            case 2:
                tov tovVar3 = this.a;
                tkv tkvVar4 = this.b;
                tld tldVar4 = this.c;
                tot totVar = (tot) obj;
                if (totVar == tot.FAILED) {
                    tov.u(1008, tovVar3.b, tkvVar4);
                    return anaf.O(tot.FAILED);
                }
                if (totVar == tot.PENDING) {
                    tov.u(1007, tovVar3.b, tkvVar4);
                    return anaf.O(tot.PENDING);
                }
                amkq.E(totVar == tot.DOWNLOADED);
                if (!rwh.aT(tkvVar4)) {
                    anhyVar = anhv.a;
                } else {
                    anhyVar = tovVar3.c(tkvVar4);
                }
                return anfq.i(anhyVar, new tod(tovVar3, tkvVar4, tldVar4, i), tovVar3.h);
            case 3:
                final tov tovVar4 = this.a;
                tkv tkvVar5 = this.b;
                final tld tldVar5 = this.c;
                long c = tovVar4.f.c();
                tku tkuVar = tkvVar5.c;
                if (tkuVar == null) {
                    tkuVar = tku.a;
                }
                aone builder2 = tkuVar.toBuilder();
                builder2.copyOnWrite();
                tku tkuVar2 = (tku) builder2.instance;
                tkuVar2.b |= 4;
                tkuVar2.e = c;
                tku tkuVar3 = (tku) builder2.build();
                aone builder3 = tkvVar5.toBuilder();
                builder3.copyOnWrite();
                tkv tkvVar6 = (tkv) builder3.instance;
                tkuVar3.getClass();
                tkvVar6.c = tkuVar3;
                tkvVar6.b |= 1;
                final tkv tkvVar7 = (tkv) builder3.build();
                aone builder4 = tldVar5.toBuilder();
                builder4.copyOnWrite();
                tld tldVar6 = (tld) builder4.instance;
                tldVar6.b |= 8;
                tldVar6.f = true;
                final tld tldVar7 = (tld) builder4.build();
                return anfq.i(tovVar4.d.g(tldVar7), new anfz() { // from class: toj
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        final tov tovVar5 = tov.this;
                        tld tldVar8 = tldVar7;
                        final tkv tkvVar8 = tkvVar7;
                        final tld tldVar9 = tldVar5;
                        final tkv tkvVar9 = (tkv) obj2;
                        return anfq.i(tovVar5.d.l(tldVar8, tkvVar8), new anfz() { // from class: tnn
                            @Override // defpackage.anfz
                            public final anhy a(Object obj3) {
                                final tov tovVar6 = tov.this;
                                tld tldVar10 = tldVar9;
                                final tkv tkvVar10 = tkvVar9;
                                final tkv tkvVar11 = tkvVar8;
                                if (!((Boolean) obj3).booleanValue()) {
                                    tovVar6.b.g(1036);
                                    return anaf.O(tot.FAILED);
                                }
                                anaf.O(true);
                                aone builder5 = tldVar10.toBuilder();
                                builder5.copyOnWrite();
                                tld tldVar11 = (tld) builder5.instance;
                                tldVar11.b |= 8;
                                tldVar11.f = false;
                                return anfq.i(tovVar6.d.i((tld) builder5.build()), new anfz() { // from class: tob
                                    @Override // defpackage.anfz
                                    public final anhy a(Object obj4) {
                                        tov tovVar7 = tov.this;
                                        tkv tkvVar12 = tkvVar10;
                                        tkv tkvVar13 = tkvVar11;
                                        if (!((Boolean) obj4).booleanValue()) {
                                            tovVar7.b.g(1036);
                                        }
                                        anhy anhyVar2 = anhv.a;
                                        if (tkvVar12 != null) {
                                            anhyVar2 = anfq.h(tovVar7.d.a(tkvVar12), new toc(tovVar7, 0), tovVar7.h);
                                        }
                                        return anfq.i(anhyVar2, new tnx(tovVar7, tkvVar13, 3), tovVar7.h);
                                    }
                                }, tovVar6.h);
                            }
                        }, tovVar5.h);
                    }
                }, tovVar4.h);
            case 4:
                tov tovVar5 = this.a;
                tld tldVar8 = this.c;
                tkv tkvVar8 = this.b;
                tle tleVar = (tle) obj;
                if (tleVar == null) {
                    tleVar = tle.a;
                }
                if (!tleVar.b) {
                    String str2 = tldVar8.c;
                    String str3 = tldVar8.d;
                    int i4 = tsx.a;
                    tov.u(1055, tovVar5.b, tkvVar8);
                    throw new tmy();
                }
                return anaf.O(null);
            case 5:
                tov tovVar6 = this.a;
                tld tldVar9 = this.c;
                tkv tkvVar9 = this.b;
                aone builder5 = tldVar9.toBuilder();
                builder5.copyOnWrite();
                tld tldVar10 = (tld) builder5.instance;
                tldVar10.b |= 8;
                tldVar10.f = false;
                return anfq.i(tovVar6.d.g((tld) builder5.build()), new tod(tovVar6, tkvVar9, tldVar9, i2), tovVar6.h);
            case 6:
                tov tovVar7 = this.a;
                tld tldVar11 = this.c;
                tkv tkvVar10 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    aone builder6 = tldVar11.toBuilder();
                    builder6.copyOnWrite();
                    tld tldVar12 = (tld) builder6.instance;
                    tldVar12.b |= 8;
                    tldVar12.f = false;
                    return amkq.n(anfq.i(tovVar7.d.l((tld) builder6.build(), tkvVar10), new tns(tovVar7, i), tovVar7.h), new tod(tovVar7, tkvVar10, tldVar11, (int) (null == true ? 1 : 0)), tovVar7.h);
                }
                throw new IOException("Subscribing to group failed");
            default:
                tov tovVar8 = this.a;
                tld tldVar13 = this.c;
                tkv tkvVar11 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    aone builder7 = tldVar13.toBuilder();
                    builder7.copyOnWrite();
                    tld tldVar14 = (tld) builder7.instance;
                    tldVar14.b |= 8;
                    tldVar14.f = false;
                    return amkq.n(anfq.i(tovVar8.d.g((tld) builder7.build()), new tnx(tovVar8, tkvVar11, i2), tovVar8.h), new tog(tovVar8, tldVar13, i2), tovVar8.h);
                }
                String str4 = tldVar13.c;
                int i5 = tsx.a;
                return anaf.O(false);
        }
    }
}
