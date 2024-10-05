package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class top implements anfz {
    public final /* synthetic */ tov a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ top(tov tovVar, boolean z, int i) {
        this.c = i;
        this.a = tovVar;
        this.b = z;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            final tov tovVar = this.a;
            final boolean z = this.b;
            ArrayList arrayList = new ArrayList();
            for (final tld tldVar : (List) obj) {
                if (!tldVar.f) {
                    arrayList.add(anfq.i(tovVar.d.g(tldVar), new anfz() { // from class: tnm
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            tov tovVar2 = tov.this;
                            boolean z2 = z;
                            tld tldVar2 = tldVar;
                            tkv tkvVar = (tkv) obj2;
                            if (tkvVar != null) {
                                int aq = rwh.aq(tkvVar.q);
                                boolean z3 = true;
                                if (aq == 0 || aq == 1) {
                                    tkx tkxVar = tkvVar.l;
                                    if (tkxVar == null) {
                                        tkxVar = tkx.a;
                                    }
                                    int bm = rwh.bm(tkxVar.d);
                                    if (bm == 0 || bm != 2) {
                                        tkx tkxVar2 = tkvVar.l;
                                        if (tkxVar2 == null) {
                                            tkxVar2 = tkx.a;
                                        }
                                        int bm2 = rwh.bm(tkxVar2.d);
                                        if (bm2 != 0 && bm2 == 3) {
                                            long c = tovVar2.f.c();
                                            tku tkuVar = tkvVar.c;
                                            if (tkuVar == null) {
                                                tkuVar = tku.a;
                                            }
                                            long j = (c - tkuVar.d) / 1000;
                                            tkx tkxVar3 = tkvVar.l;
                                            if (tkxVar3 == null) {
                                                tkxVar3 = tkx.a;
                                            }
                                            if (j > tkxVar3.e) {
                                                aone builder = tkvVar.toBuilder();
                                                tkx tkxVar4 = tkvVar.l;
                                                if (tkxVar4 == null) {
                                                    tkxVar4 = tkx.a;
                                                }
                                                aone builder2 = tkxVar4.toBuilder();
                                                builder2.copyOnWrite();
                                                tkx tkxVar5 = (tkx) builder2.instance;
                                                tkxVar5.d = 1;
                                                tkxVar5.b = 2 | tkxVar5.b;
                                                builder.copyOnWrite();
                                                tkv tkvVar2 = (tkv) builder.instance;
                                                tkx tkxVar6 = (tkx) builder2.build();
                                                tkxVar6.getClass();
                                                tkvVar2.l = tkxVar6;
                                                tkvVar2.b |= 1024;
                                                tkvVar = (tkv) builder.build();
                                            }
                                        }
                                        z3 = false;
                                    }
                                    String str = tkvVar.d;
                                    int i = tsx.a;
                                    if (z2 || z3) {
                                        tkx tkxVar7 = tkvVar.l;
                                        if (tkxVar7 == null) {
                                            tkxVar7 = tkx.a;
                                        }
                                        return tovVar2.d(tldVar2, tkxVar7);
                                    }
                                    return anaf.O(null);
                                }
                            }
                            return anaf.O(null);
                        }
                    }, tovVar.h));
                }
            }
            return anaf.H(arrayList).a(gip.j, tovVar.h);
        }
        tov tovVar2 = this.a;
        tkv tkvVar = (tkv) obj;
        return anfq.i(tovVar2.k(tkvVar, this.b), new tnq(tkvVar, 2), tovVar2.h);
    }
}
