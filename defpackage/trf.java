package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class trf {
    public final Context a;
    public final tme b;
    public final trh c;
    public final tsq d;
    public final vcw e;
    public final ammv f;
    public final ammv g;
    public final tss h;
    public final tow i;
    public final ammv j;
    public final Executor k;

    public trf(Context context, tme tmeVar, trh trhVar, vcw vcwVar, tsq tsqVar, ammv ammvVar, ammv ammvVar2, tss tssVar, tow towVar, ammv ammvVar3, Executor executor) {
        this.a = context;
        this.b = tmeVar;
        this.c = trhVar;
        this.e = vcwVar;
        this.d = tsqVar;
        this.f = ammvVar;
        this.g = ammvVar2;
        this.h = tssVar;
        this.i = towVar;
        this.j = ammvVar3;
        this.k = executor;
    }

    public final anhy a() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                vdc a = vdd.a(this.a);
                a.a = "*.lease";
                this.e.f(a.a());
                this.h.g(1077);
            } catch (vds unused) {
                int i = tsx.a;
            } catch (IOException e) {
                tsx.f(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                this.h.g(1078);
            }
        }
        try {
            this.e.j(rwh.aV(this.a, this.j));
        } catch (IOException e2) {
            this.b.a(e2, "Failure while deleting mdd storage during clear", new Object[0]);
        }
        return anhv.a;
    }

    public final anhy b(tlg tlgVar) {
        return anfq.i(this.c.e(tlgVar), new tre(this, tlgVar, 2), this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy c(tlg tlgVar) {
        return anfq.i(this.c.e(tlgVar), new trb(tlgVar, 1), this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy d(final tld tldVar, final tkt tktVar, final tlg tlgVar, final tkx tkxVar, final int i, final List list) {
        if (tktVar.d.startsWith("inlinefile")) {
            tkj a = tkl.a();
            a.a = tkk.INVALID_INLINE_FILE_URL_SCHEME;
            a.b = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return anaf.N(a.a());
        }
        return anfq.i(this.c.e(tlgVar), new anfz() { // from class: tqu
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                anhy O;
                final trf trfVar = trf.this;
                final tlg tlgVar2 = tlgVar;
                final tld tldVar2 = tldVar;
                final tkt tktVar2 = tktVar;
                final tkx tkxVar2 = tkxVar;
                final int i2 = i;
                final List list2 = list;
                final tlh tlhVar = (tlh) obj;
                if (tlhVar == null) {
                    tsx.d("%s: Start download called on file that doesn't exists. Key = %s!", "SharedFileManager", tlgVar2);
                    trg trgVar = new trg();
                    trfVar.b.a(trgVar, "Shared file not found in downloadFileGroup", new Object[0]);
                    tkj a2 = tkl.a();
                    a2.a = tkk.SHARED_FILE_NOT_FOUND_ERROR;
                    a2.c = trgVar;
                    return anaf.N(a2.a());
                }
                tlc a3 = tlc.a(tlhVar.d);
                if (a3 == null) {
                    a3 = tlc.NONE;
                }
                if (a3 != tlc.DOWNLOAD_COMPLETE) {
                    int bp = rwh.bp(tlgVar2.f);
                    if (bp == 0) {
                        bp = 1;
                    }
                    if (rwh.bf(trfVar.a, trfVar.b).d < tpr.USE_CHECKSUM_ONLY.d || !trfVar.f.h() || ((tmj) trfVar.f.c()).b() == 1) {
                        O = anaf.O(null);
                    } else {
                        O = trfVar.f(tktVar2.l, 0, bp);
                    }
                    return anfq.i(O, new anfz() { // from class: tqy
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            final trf trfVar2 = trf.this;
                            tlh tlhVar2 = tlhVar;
                            final tkt tktVar3 = tktVar2;
                            final tld tldVar3 = tldVar2;
                            final tlg tlgVar3 = tlgVar2;
                            final tkx tkxVar3 = tkxVar2;
                            final int i3 = i2;
                            final List list3 = list2;
                            final tkw tkwVar = (tkw) obj2;
                            final aone builder = tlhVar2.toBuilder();
                            String str = tlhVar2.c;
                            if (tkwVar != null) {
                                str = rwh.bd(str, tkwVar.e);
                            } else if ((tktVar3.b & 32) != 0) {
                                str = rwh.bd(str, tktVar3.i);
                            }
                            final String str2 = str;
                            return anfq.i(anfq.i(trfVar2.i.g(tldVar3), jom.l, trfVar2.k), new anfz() { // from class: tqw
                                @Override // defpackage.anfz
                                public final anhy a(Object obj3) {
                                    anhy O2;
                                    final trf trfVar3 = trf.this;
                                    final aone aoneVar = builder;
                                    final tlg tlgVar4 = tlgVar3;
                                    String str3 = str2;
                                    final tld tldVar4 = tldVar3;
                                    final tkt tktVar4 = tktVar3;
                                    final tkw tkwVar2 = tkwVar;
                                    final tkx tkxVar4 = tkxVar3;
                                    final int i4 = i3;
                                    final List list4 = list3;
                                    tkv tkvVar = (tkv) obj3;
                                    final int i5 = tkvVar.f;
                                    final long j = tkvVar.r;
                                    final String str4 = tkvVar.s;
                                    int bp2 = rwh.bp(tlgVar4.f);
                                    Uri aY = rwh.aY(trfVar3.a, bp2 == 0 ? 1 : bp2, str3, tktVar4.g, trfVar3.b, trfVar3.j, false);
                                    if (aY == null) {
                                        tsx.c("%s: Failed to get file uri!", "SharedFileManager");
                                        tkj a4 = tkl.a();
                                        a4.a = tkk.UNABLE_TO_CREATE_FILE_URI_ERROR;
                                        O2 = anaf.N(a4.a());
                                    } else {
                                        O2 = anaf.O(aY);
                                    }
                                    final anhy anhyVar = O2;
                                    return anfq.i(anfq.i(anht.q(anhyVar), new anfz() { // from class: tqv
                                        @Override // defpackage.anfz
                                        public final anhy a(Object obj4) {
                                            trf trfVar4 = trf.this;
                                            aone aoneVar2 = aoneVar;
                                            tlg tlgVar5 = tlgVar4;
                                            tlc tlcVar = tlc.DOWNLOAD_IN_PROGRESS;
                                            aoneVar2.copyOnWrite();
                                            tlh tlhVar3 = (tlh) aoneVar2.instance;
                                            tlh tlhVar4 = tlh.a;
                                            tlhVar3.d = tlcVar.h;
                                            tlhVar3.b |= 2;
                                            return trfVar4.c.g(tlgVar5, (tlh) aoneVar2.build());
                                        }
                                    }, trfVar3.k), new anfz() { // from class: tra
                                        @Override // defpackage.anfz
                                        public final anhy a(Object obj4) {
                                            trf trfVar4 = trf.this;
                                            anhy anhyVar2 = anhyVar;
                                            tkw tkwVar3 = tkwVar2;
                                            tkt tktVar5 = tktVar4;
                                            tlg tlgVar5 = tlgVar4;
                                            tld tldVar5 = tldVar4;
                                            int i6 = i5;
                                            long j2 = j;
                                            String str5 = str4;
                                            tkx tkxVar5 = tkxVar4;
                                            int i7 = i4;
                                            List list5 = list4;
                                            Uri uri = (Uri) anaf.W(anhyVar2);
                                            if (!trfVar4.f.h() || tkwVar3 == null) {
                                                trh trhVar = trfVar4.c;
                                                vcw vcwVar = trfVar4.e;
                                                int bp3 = rwh.bp(tlgVar5.f);
                                                tsj tsjVar = new tsj(trhVar, vcwVar, tktVar5, bp3 == 0 ? 1 : bp3, trfVar4.h, tldVar5, i6, j2, str5, trfVar4.k);
                                                trfVar4.e(tldVar5, uri);
                                                return trfVar4.d.a(tldVar5, i6, uri, tktVar5.d, tktVar5.e, tkxVar5, tsjVar, i7, list5);
                                            }
                                            Context context = trfVar4.a;
                                            trh trhVar2 = trfVar4.c;
                                            vcw vcwVar2 = trfVar4.e;
                                            tme tmeVar = trfVar4.b;
                                            int bp4 = rwh.bp(tlgVar5.f);
                                            tsh tshVar = new tsh(context, trhVar2, vcwVar2, tmeVar, tktVar5, bp4 == 0 ? 1 : bp4, (tmj) trfVar4.f.c(), tkwVar3, trfVar4.h, tldVar5, i6, j2, str5, trfVar4.j, trfVar4.k);
                                            trfVar4.e(tldVar5, uri);
                                            return trfVar4.d.a(tldVar5, i6, uri, tkwVar3.c, tkwVar3.d, tkxVar5, tshVar, i7, list5);
                                        }
                                    }, trfVar3.k);
                                }
                            }, trfVar2.k);
                        }
                    }, trfVar.k);
                }
                if (trfVar.g.h()) {
                    ((ttu) trfVar.g.c()).g(tldVar2.c, tktVar2.e);
                }
                return anhv.a;
            }
        }, this.k);
    }

    public final void e(tld tldVar, Uri uri) {
        if (this.g.h()) {
            try {
                long a = this.e.a(uri);
                if (a > 0) {
                    ((ttu) this.g.c()).g(tldVar.c, a);
                }
            } catch (IOException unused) {
            }
        }
    }

    public final anhy f(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return anaf.O(null);
        }
        final tkw tkwVar = (tkw) list.get(i);
        int bo = rwh.bo(tkwVar.f);
        if (bo == 0) {
            bo = 1;
        }
        if (bo != ((tmj) this.f.c()).b()) {
            return f(list, i + 1, i2);
        }
        aone createBuilder = tlg.a.createBuilder();
        tks tksVar = tkwVar.g;
        if (tksVar == null) {
            tksVar = tks.a;
        }
        String str = tksVar.b;
        createBuilder.copyOnWrite();
        tlg tlgVar = (tlg) createBuilder.instance;
        str.getClass();
        tlgVar.b |= 4;
        tlgVar.e = str;
        createBuilder.copyOnWrite();
        tlg tlgVar2 = (tlg) createBuilder.instance;
        tlgVar2.f = i2 - 1;
        tlgVar2.b |= 8;
        final tlg tlgVar3 = (tlg) createBuilder.build();
        return anfq.i(this.c.e(tlgVar3), new anfz() { // from class: tqt
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                trf trfVar = trf.this;
                tlg tlgVar4 = tlgVar3;
                tkw tkwVar2 = tkwVar;
                List list2 = list;
                int i3 = i;
                int i4 = i2;
                tlh tlhVar = (tlh) obj;
                if (tlhVar != null) {
                    tlc a = tlc.a(tlhVar.d);
                    if (a == null) {
                        a = tlc.NONE;
                    }
                    if (a == tlc.DOWNLOAD_COMPLETE) {
                        Context context = trfVar.a;
                        int bp = rwh.bp(tlgVar4.f);
                        if (rwh.aY(context, bp == 0 ? 1 : bp, tlhVar.c, tlgVar4.e, trfVar.b, trfVar.j, false) != null) {
                            return anaf.O(tkwVar2);
                        }
                    }
                }
                return trfVar.f(list2, i3 + 1, i4);
            }
        }, this.k);
    }
}
