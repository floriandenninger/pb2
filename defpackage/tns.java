package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tns implements anfz {
    public final /* synthetic */ tov a;
    private final /* synthetic */ int b;

    public /* synthetic */ tns(tov tovVar, int i) {
        this.b = i;
        this.a = tovVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int aq;
        int i = this.b;
        int i2 = 1;
        if (i == 0) {
            final tov tovVar = this.a;
            final tou touVar = (tou) obj;
            final tkv tkvVar = touVar.b;
            if (tkvVar == null) {
                return anhv.a;
            }
            for (final tkt tktVar : tkvVar.n) {
                int bp = rwh.bp(tkvVar.i);
                if (bp == 0) {
                    bp = 1;
                }
                final tlg be = rwh.be(tktVar, bp);
                final trf trfVar = tovVar.e;
                aney.i(anfq.i(anht.q(trfVar.c(be)), new anfz() { // from class: tqs
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        final trf trfVar2 = trf.this;
                        final tlg tlgVar = be;
                        final tkt tktVar2 = tktVar;
                        final tlh tlhVar = (tlh) obj2;
                        tlc a = tlc.a(tlhVar.d);
                        if (a == null) {
                            a = tlc.NONE;
                        }
                        if (a != tlc.DOWNLOAD_COMPLETE) {
                            return anhv.a;
                        }
                        return aney.i(anfq.i(anht.q(trfVar2.b(tlgVar)), new anfz() { // from class: tqx
                            @Override // defpackage.anfz
                            public final anhy a(Object obj3) {
                                trf trfVar3 = trf.this;
                                tlh tlhVar2 = tlhVar;
                                tkt tktVar3 = tktVar2;
                                Uri uri = (Uri) obj3;
                                if (uri == null) {
                                    tkj a2 = tkl.a();
                                    a2.a = tkk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                    throw a2.a();
                                }
                                if (tlhVar2.e) {
                                    if (!trfVar3.e.h(uri)) {
                                        tkj a3 = tkl.a();
                                        a3.a = tkk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                        throw a3.a();
                                    }
                                } else {
                                    tsk.b(trfVar3.e, tktVar3, uri, tktVar3.g);
                                }
                                return anhv.a;
                            }
                        }, trfVar2.k), tkl.class, new anfz() { // from class: tqz
                            @Override // defpackage.anfz
                            public final anhy a(Object obj3) {
                                trf trfVar3 = trf.this;
                                tlh tlhVar2 = tlhVar;
                                tlg tlgVar2 = tlgVar;
                                tsx.d("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((tkl) obj3).a);
                                aone builder = tlhVar2.toBuilder();
                                tlc tlcVar = tlc.CORRUPTED;
                                builder.copyOnWrite();
                                tlh tlhVar3 = (tlh) builder.instance;
                                tlhVar3.d = tlcVar.h;
                                tlhVar3.b |= 2;
                                return anfq.i(anht.q(trfVar3.c.g(tlgVar2, (tlh) builder.build())), jom.n, trfVar3.k);
                            }
                        }, trfVar2.k);
                    }
                }, trfVar.k), trg.class, new anfz() { // from class: toe
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        tov tovVar2 = tov.this;
                        tkv tkvVar2 = tkvVar;
                        tou touVar2 = touVar;
                        tsx.c("%s: Missing file. Logging and deleting file group.", "FileGroupManager");
                        tov.u(1062, tovVar2.b, tkvVar2);
                        tovVar2.k.e();
                        return anfq.h(tovVar2.d.i(touVar2.a), rtp.o, tovVar2.h);
                    }
                }, tovVar.h);
            }
            return anhv.a;
        }
        if (i == 1) {
            tov tovVar2 = this.a;
            tkv tkvVar2 = (tkv) obj;
            if (tkvVar2 == null || (aq = rwh.aq(tkvVar2.q)) == 0 || aq == 1) {
                return anaf.O(true);
            }
            return ((tub) ((amnv) tovVar2.j.c()).get()).a();
        }
        int i3 = 2;
        if (i == 2) {
            tov tovVar3 = this.a;
            tou touVar2 = (tou) obj;
            tld tldVar = touVar2.a;
            tkv tkvVar3 = touVar2.b;
            if (tkvVar3 == null || !tldVar.f || !rwh.aT(tkvVar3)) {
                return anhv.a;
            }
            return anfq.i(tovVar3.k(tkvVar3, true), new tnx(tovVar3, tkvVar3, i3), tovVar3.h);
        }
        if (i == 3) {
            tov tovVar4 = this.a;
            if (((Boolean) obj).booleanValue()) {
                return anhv.a;
            }
            tovVar4.b.g(1036);
            return anaf.N(new IOException("Failed to commit new group metadata to disk."));
        }
        if (i == 4) {
            tov tovVar5 = this.a;
            ArrayList arrayList = new ArrayList();
            for (tld tldVar2 : (List) obj) {
                if (!tovVar5.r(tldVar2.d)) {
                    arrayList.add(anfq.i(tovVar5.d.g(tldVar2), new tog(tovVar5, tldVar2, 0), tovVar5.h));
                }
            }
            return anaf.H(arrayList).a(gip.g, tovVar5.h);
        }
        if (i == 5) {
            tov tovVar6 = this.a;
            ArrayList arrayList2 = new ArrayList();
            for (tld tldVar3 : (List) obj) {
                if (!tldVar3.f) {
                    arrayList2.add(anfq.i(tovVar6.d.g(tldVar3), new tns(tovVar6, i2), tovVar6.h));
                }
            }
            return anaf.H(arrayList2).a(gip.k, tovVar6.h);
        }
        tov tovVar7 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (tld tldVar4 : (List) obj) {
            if (!tldVar4.f) {
                arrayList3.add(anfq.i(tovVar7.d.g(tldVar4), new tog(tovVar7, tldVar4, i3), tovVar7.h));
            }
        }
        return anaf.H(arrayList3).a(gip.l, tovVar7.h);
    }
}
