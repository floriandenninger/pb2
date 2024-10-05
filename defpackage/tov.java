package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tov {
    public final Context a;
    public final tss b;
    public final tme c;
    public final tow d;
    public final trf e;
    public final shf f;
    public final vcw g;
    public final Executor h;
    public final ammv i;
    public final ammv j;
    public final tko k;

    public tov(Context context, tss tssVar, tme tmeVar, tow towVar, trf trfVar, shf shfVar, Executor executor, ammv ammvVar, vcw vcwVar, ammv ammvVar2, tko tkoVar) {
        this.a = context;
        this.b = tssVar;
        this.c = tmeVar;
        this.d = towVar;
        this.e = trfVar;
        this.f = shfVar;
        this.h = executor;
        this.i = ammvVar;
        this.g = vcwVar;
        this.j = ammvVar2;
        this.k = tkoVar;
    }

    public static boolean p(tkv tkvVar, tkv tkvVar2) {
        if (q(tkvVar, tkvVar2) && tkvVar2.f == tkvVar.f && tkvVar2.j == tkvVar.j && tkvVar2.k == tkvVar.k) {
            tkx tkxVar = tkvVar2.l;
            if (tkxVar == null) {
                tkxVar = tkx.a;
            }
            tkx tkxVar2 = tkvVar.l;
            if (tkxVar2 == null) {
                tkxVar2 = tkx.a;
            }
            if (tkxVar.equals(tkxVar2)) {
                int bp = rwh.bp(tkvVar2.i);
                if (bp == 0) {
                    bp = 1;
                }
                int bp2 = rwh.bp(tkvVar.i);
                if (bp2 == 0) {
                    bp2 = 1;
                }
                if (bp == bp2) {
                    int aq = rwh.aq(tkvVar2.q);
                    if (aq == 0) {
                        aq = 1;
                    }
                    int aq2 = rwh.aq(tkvVar.q);
                    if (aq2 == 0) {
                        aq2 = 1;
                    }
                    return aq == aq2;
                }
            }
        }
        return false;
    }

    public static boolean q(tkv tkvVar, tkv tkvVar2) {
        return tkvVar.n.equals(tkvVar2.n);
    }

    public static boolean s(tlh tlhVar, long j) {
        return j > tlhVar.f;
    }

    public static void u(int i, tss tssVar, tkv tkvVar) {
        tssVar.h(i, tkvVar.d, tkvVar.f, tkvVar.r, tkvVar.s);
    }

    public static void v(tss tssVar, tkv tkvVar, tkt tktVar, int i) {
        aone createBuilder = andz.a.createBuilder();
        createBuilder.copyOnWrite();
        andz andzVar = (andz) createBuilder.instance;
        andzVar.c = anaf.q(i);
        andzVar.b |= 1;
        String str = tkvVar.d;
        createBuilder.copyOnWrite();
        andz andzVar2 = (andz) createBuilder.instance;
        str.getClass();
        andzVar2.b |= 2;
        andzVar2.d = str;
        int i2 = tkvVar.f;
        createBuilder.copyOnWrite();
        andz andzVar3 = (andz) createBuilder.instance;
        andzVar3.b |= 4;
        andzVar3.e = i2;
        long j = tkvVar.r;
        createBuilder.copyOnWrite();
        andz andzVar4 = (andz) createBuilder.instance;
        andzVar4.b |= 128;
        andzVar4.i = j;
        String str2 = tkvVar.s;
        createBuilder.copyOnWrite();
        andz andzVar5 = (andz) createBuilder.instance;
        str2.getClass();
        andzVar5.b |= 256;
        andzVar5.j = str2;
        String str3 = tktVar.c;
        createBuilder.copyOnWrite();
        andz andzVar6 = (andz) createBuilder.instance;
        str3.getClass();
        andzVar6.b |= 8;
        andzVar6.f = str3;
        tssVar.a((andz) createBuilder.build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Uri a(Uri uri, tkt tktVar, tkv tkvVar) {
        Uri aM = rwh.aM(this.a, this.i, tktVar, tkvVar);
        Uri a = tto.a(this.a, aM);
        if (this.g.h(aM) && a.toString().equals(uri.toString())) {
            return aM;
        }
        throw new IOException("Isolated file uri does not exist or points to an unexpected target");
    }

    public final Uri b(tkt tktVar, tlg tlgVar, tlh tlhVar) {
        Context context = this.a;
        int bp = rwh.bp(tlgVar.f);
        Uri aY = rwh.aY(context, bp == 0 ? 1 : bp, tlhVar.c, tktVar.g, this.c, this.i, false);
        if (aY != null) {
            return aY;
        }
        tsx.c("%s: Failed to get file uri!", "FileGroupManager");
        throw new tti(28, "Failed to get local file uri");
    }

    public final anhy c(tkv tkvVar) {
        if (!tkvVar.m) {
            return anhv.a;
        }
        try {
            rwh.aQ(this.a, this.i, tkvVar, this.g);
            ArrayList arrayList = new ArrayList(tkvVar.n.size());
            Iterator it = tkvVar.n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tkt tktVar = (tkt) it.next();
                int br = rwh.br(tktVar.m);
                if (br == 0 || br != 2) {
                    arrayList.add(anfq.i(h(tktVar, tkvVar), new tnu(this, tktVar, tkvVar, 1), this.h));
                } else {
                    arrayList.add(anaf.N(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing")));
                    break;
                }
            }
            anhy a = anaf.J(arrayList).a(gip.f, this.h);
            anaf.Y(a, new tos(this, tkvVar), this.h);
            return a;
        } catch (IOException e) {
            tkj a2 = tkl.a();
            a2.a = tkk.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            a2.b = "Unable to cleanup symlink structure";
            a2.c = e;
            return anaf.N(a2.a());
        }
    }

    public final anhy d(final tld tldVar, final tkx tkxVar) {
        final AtomicReference atomicReference = new AtomicReference();
        return aney.i(anfq.i(e(tldVar, false), new anfz() { // from class: tok
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final tov tovVar = tov.this;
                final tld tldVar2 = tldVar;
                final AtomicReference atomicReference2 = atomicReference;
                final tkx tkxVar2 = tkxVar;
                tkv tkvVar = (tkv) obj;
                if (tkvVar == null) {
                    return anfq.i(tovVar.e(tldVar2, true), new anfz() { // from class: tnr
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            tld tldVar3 = tld.this;
                            AtomicReference atomicReference3 = atomicReference2;
                            tkv tkvVar2 = (tkv) obj2;
                            if (tkvVar2 == null) {
                                tkj a = tkl.a();
                                a.a = tkk.GROUP_NOT_FOUND_ERROR;
                                String valueOf = String.valueOf(tldVar3.c);
                                a.b = valueOf.length() != 0 ? "Nothing to download for file group: ".concat(valueOf) : new String("Nothing to download for file group: ");
                                return anaf.N(a.a());
                            }
                            atomicReference3.set(tkvVar2);
                            return anaf.O(tkvVar2);
                        }
                    }, tovVar.h);
                }
                atomicReference2.set(tkvVar);
                tku tkuVar = tkvVar.c;
                if (tkuVar == null) {
                    tkuVar = tku.a;
                }
                int i = tkuVar.g;
                aone builder = tkvVar.toBuilder();
                aone builder2 = tkuVar.toBuilder();
                builder2.copyOnWrite();
                tku tkuVar2 = (tku) builder2.instance;
                tkuVar2.b |= 16;
                tkuVar2.g = i + 1;
                builder.copyOnWrite();
                tkv tkvVar2 = (tkv) builder.instance;
                tku tkuVar3 = (tku) builder2.build();
                tkuVar3.getClass();
                tkvVar2.c = tkuVar3;
                tkvVar2.b |= 1;
                final tkv tkvVar3 = (tkv) builder.build();
                final boolean z = !((tkuVar.b & 8) != 0);
                if (z) {
                    long c = tovVar.f.c();
                    tku tkuVar4 = tkvVar3.c;
                    if (tkuVar4 == null) {
                        tkuVar4 = tku.a;
                    }
                    aone builder3 = tkuVar4.toBuilder();
                    builder3.copyOnWrite();
                    tku tkuVar5 = (tku) builder3.instance;
                    tkuVar5.b |= 8;
                    tkuVar5.f = c;
                    tku tkuVar6 = (tku) builder3.build();
                    aone builder4 = tkvVar3.toBuilder();
                    builder4.copyOnWrite();
                    tkv tkvVar4 = (tkv) builder4.instance;
                    tkuVar6.getClass();
                    tkvVar4.c = tkuVar6;
                    tkvVar4.b = 1 | tkvVar4.b;
                    tkvVar3 = (tkv) builder4.build();
                }
                aone builder5 = tldVar2.toBuilder();
                builder5.copyOnWrite();
                tld tldVar3 = (tld) builder5.instance;
                tldVar3.b |= 8;
                tldVar3.f = false;
                return anfq.i(aney.i(anht.q(anfq.i(tovVar.d.l((tld) builder5.build(), tkvVar3), new anfz() { // from class: toq
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        tov tovVar2 = tov.this;
                        boolean z2 = z;
                        tkv tkvVar5 = tkvVar3;
                        if (!((Boolean) obj2).booleanValue()) {
                            tovVar2.b.g(1036);
                            return anaf.N(new IOException("Unable to update file group metadata"));
                        }
                        if (z2) {
                            tov.u(1072, tovVar2.b, tkvVar5);
                        }
                        return anaf.O(tkvVar5);
                    }
                }, tovVar.h)), IOException.class, jom.h, tovVar.h), new anfz() { // from class: tof
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        anhy N;
                        final tov tovVar2 = tov.this;
                        tkx tkxVar3 = tkxVar2;
                        final tld tldVar4 = tldVar2;
                        final tkv tkvVar5 = (tkv) obj2;
                        if (tkxVar3 == null && (tkxVar3 = tkvVar5.l) == null) {
                            tkxVar3 = tkx.a;
                        }
                        final tkx tkxVar4 = tkxVar3;
                        final ArrayList arrayList = new ArrayList();
                        for (final tkt tktVar : tkvVar5.n) {
                            if (!rwh.aU(tktVar)) {
                                int bp = rwh.bp(tkvVar5.i);
                                if (bp == 0) {
                                    bp = 1;
                                }
                                final tlg be = rwh.be(tktVar, bp);
                                if (Build.VERSION.SDK_INT >= 30) {
                                    N = anfq.i(anfq.i(aney.i(tovVar2.e.c(be), trg.class, new tnz(tovVar2, be, tkvVar5, tktVar, 4), tovVar2.h), new tnz(tovVar2, tkvVar5, tktVar, be, 0), tovVar2.h), new anfz() { // from class: toi
                                        @Override // defpackage.anfz
                                        public final anhy a(Object obj3) {
                                            tov tovVar3 = tov.this;
                                            tld tldVar5 = tldVar4;
                                            tkt tktVar2 = tktVar;
                                            tlg tlgVar = be;
                                            tkx tkxVar5 = tkxVar4;
                                            tkv tkvVar6 = tkvVar5;
                                            try {
                                                return anfq.i(tovVar3.e.d(tldVar5, tktVar2, tlgVar, tkxVar5, tkvVar6.o, tkvVar6.p), new tnz(tovVar3, tkvVar6, tktVar2, tlgVar, 2), tovVar3.h);
                                            } catch (RuntimeException e) {
                                                tkj a = tkl.a();
                                                a.a = tkk.UNKNOWN_ERROR;
                                                a.c = e;
                                                return anaf.N(a.a());
                                            }
                                        }
                                    }, tovVar2.h);
                                } else {
                                    try {
                                        N = tovVar2.e.d(tldVar4, tktVar, be, tkxVar4, tkvVar5.o, tkvVar5.p);
                                    } catch (RuntimeException e) {
                                        tkj a = tkl.a();
                                        a.a = tkk.UNKNOWN_ERROR;
                                        a.c = e;
                                        N = anaf.N(a.a());
                                    }
                                }
                                arrayList.add(N);
                            }
                        }
                        return anaf.H(arrayList).b(new anfy() { // from class: tor
                            @Override // defpackage.anfy
                            public final anhy a() {
                                final tov tovVar3 = tov.this;
                                final tld tldVar5 = tldVar4;
                                final tkv tkvVar6 = tkvVar5;
                                final List list = arrayList;
                                return anfq.i(tovVar3.n(tldVar5, tkvVar6), new anfz() { // from class: tom
                                    @Override // defpackage.anfz
                                    public final anhy a(Object obj3) {
                                        tov tovVar4 = tov.this;
                                        List list2 = list;
                                        tkv tkvVar7 = tkvVar6;
                                        tld tldVar6 = tldVar5;
                                        if (((tot) obj3) != tot.DOWNLOADED) {
                                            tsx.e("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", tldVar6.c, tldVar6.d);
                                            tkb.b(list2, tldVar6.c);
                                            tsx.c("%s: An unknown error has occurred during download", "FileGroupManager");
                                            tkj a2 = tkl.a();
                                            a2.a = tkk.UNKNOWN_ERROR;
                                            throw a2.a();
                                        }
                                        tss tssVar = tovVar4.b;
                                        aone createBuilder = andw.a.createBuilder();
                                        String str = tldVar6.c;
                                        createBuilder.copyOnWrite();
                                        andw andwVar = (andw) createBuilder.instance;
                                        str.getClass();
                                        andwVar.b = 1 | andwVar.b;
                                        andwVar.c = str;
                                        String str2 = tldVar6.d;
                                        createBuilder.copyOnWrite();
                                        andw andwVar2 = (andw) createBuilder.instance;
                                        str2.getClass();
                                        andwVar2.b |= 4;
                                        andwVar2.e = str2;
                                        int i2 = tkvVar7.f;
                                        createBuilder.copyOnWrite();
                                        andw andwVar3 = (andw) createBuilder.instance;
                                        andwVar3.b |= 2;
                                        andwVar3.d = i2;
                                        long j = tkvVar7.r;
                                        createBuilder.copyOnWrite();
                                        andw andwVar4 = (andw) createBuilder.instance;
                                        andwVar4.b |= 32;
                                        andwVar4.h = j;
                                        String str3 = tkvVar7.s;
                                        createBuilder.copyOnWrite();
                                        andw andwVar5 = (andw) createBuilder.instance;
                                        str3.getClass();
                                        andwVar5.b |= 64;
                                        andwVar5.i = str3;
                                        tssVar.j(3, (andw) createBuilder.build());
                                        return anaf.O(tkvVar7);
                                    }
                                }, tovVar3.h);
                            }
                        }, tovVar2.h);
                    }
                }, tovVar.h);
            }
        }, this.h), Exception.class, new anfz() { // from class: too
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final tov tovVar = tov.this;
                AtomicReference atomicReference2 = atomicReference;
                final tld tldVar2 = tldVar;
                final Exception exc = (Exception) obj;
                tkv tkvVar = (tkv) atomicReference2.get();
                if (tkvVar == null) {
                    tkvVar = tkv.a;
                }
                final tkv tkvVar2 = tkvVar;
                anhy O = anaf.O(null);
                if (exc instanceof tkl) {
                    int i = tsx.a;
                    final tkl tklVar = (tkl) exc;
                    final int i2 = 1;
                    O = anfq.i(O, new anfz() { // from class: toh
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            if (i2 == 0) {
                                tov tovVar2 = tovVar;
                                tld tldVar3 = tldVar2;
                                tkl tklVar2 = tklVar;
                                tkv tkvVar3 = tkvVar2;
                                return tovVar2.j(tldVar3, tklVar2, tkvVar3.r, tkvVar3.s);
                            }
                            tov tovVar3 = tovVar;
                            tld tldVar4 = tldVar2;
                            tkl tklVar3 = tklVar;
                            tkv tkvVar4 = tkvVar2;
                            return tovVar3.j(tldVar4, tklVar3, tkvVar4.r, tkvVar4.s);
                        }
                    }, tovVar.h);
                } else if (exc instanceof tkb) {
                    int i3 = tsx.a;
                    amru amruVar = ((tkb) exc).a;
                    int i4 = ((amvj) amruVar).c;
                    anhy anhyVar = O;
                    for (int i5 = 0; i5 < i4; i5++) {
                        Throwable th = (Throwable) amruVar.get(i5);
                        if (!(th instanceof tkl)) {
                            tsx.c("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        } else {
                            final tkl tklVar2 = (tkl) th;
                            final int i6 = 0;
                            anhyVar = anfq.i(anhyVar, new anfz() { // from class: toh
                                @Override // defpackage.anfz
                                public final anhy a(Object obj2) {
                                    if (i6 == 0) {
                                        tov tovVar2 = tovVar;
                                        tld tldVar3 = tldVar2;
                                        tkl tklVar22 = tklVar2;
                                        tkv tkvVar3 = tkvVar2;
                                        return tovVar2.j(tldVar3, tklVar22, tkvVar3.r, tkvVar3.s);
                                    }
                                    tov tovVar3 = tovVar;
                                    tld tldVar4 = tldVar2;
                                    tkl tklVar3 = tklVar2;
                                    tkv tkvVar4 = tkvVar2;
                                    return tovVar3.j(tldVar4, tklVar3, tkvVar4.r, tkvVar4.s);
                                }
                            }, tovVar.h);
                        }
                    }
                    O = anhyVar;
                }
                return anfq.i(O, new anfz() { // from class: tnp
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        throw exc;
                    }
                }, tovVar.h);
            }
        }, this.h);
    }

    public final anhy e(tld tldVar, boolean z) {
        aone builder = tldVar.toBuilder();
        builder.copyOnWrite();
        tld tldVar2 = (tld) builder.instance;
        tldVar2.b |= 8;
        tldVar2.f = z;
        return anfq.i(this.d.g((tld) builder.build()), new top(this, z, 1), this.h);
    }

    public final anhy f(tkv tkvVar) {
        return g(tkvVar, false, false, 0, tkvVar.n.size());
    }

    public final anhy g(final tkv tkvVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i >= i2) {
            if (z) {
                return anaf.O(tot.FAILED);
            }
            if (z2) {
                return anaf.O(tot.PENDING);
            }
            return anaf.O(tot.DOWNLOADED);
        }
        final tkt tktVar = (tkt) tkvVar.n.get(i);
        if (!rwh.aU(tktVar)) {
            int bp = rwh.bp(tkvVar.i);
            tlg be = rwh.be(tktVar, bp != 0 ? bp : 1);
            trf trfVar = this.e;
            return anfq.i(aney.i(anht.q(anfq.i(trfVar.c(be), jom.m, trfVar.k)), trg.class, new tnx(this, tkvVar, 0), this.h), new anfz() { // from class: tnw
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    tov tovVar = tov.this;
                    tkt tktVar2 = tktVar;
                    tkv tkvVar2 = tkvVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    int i3 = i;
                    int i4 = i2;
                    tlc tlcVar = (tlc) obj;
                    if (tlcVar == tlc.DOWNLOAD_COMPLETE) {
                        String str = tktVar2.c;
                        String str2 = tkvVar2.d;
                        int i5 = tsx.a;
                        return tovVar.g(tkvVar2, z3, z4, i3 + 1, i4);
                    }
                    if (tlcVar == tlc.SUBSCRIBED || tlcVar == tlc.DOWNLOAD_IN_PROGRESS) {
                        String str3 = tktVar2.c;
                        String str4 = tkvVar2.d;
                        int i6 = tsx.a;
                        return tovVar.g(tkvVar2, z3, true, i3 + 1, i4);
                    }
                    String str5 = tktVar2.c;
                    String str6 = tkvVar2.d;
                    int i7 = tsx.a;
                    return tovVar.g(tkvVar2, true, z4, i3 + 1, i4);
                }
            }, this.h);
        }
        return g(tkvVar, z, z2, i + 1, i2);
    }

    public final anhy h(tkt tktVar, tkv tkvVar) {
        if (!rwh.aU(tktVar)) {
            int bp = rwh.bp(tkvVar.i);
            if (bp == 0) {
                bp = 1;
            }
            return this.e.b(rwh.be(tktVar, bp));
        }
        return anaf.O(Uri.parse(tktVar.d));
    }

    public final anhy i(final anfz anfzVar) {
        final ArrayList arrayList = new ArrayList();
        return anfq.i(this.d.d(), new anfz() { // from class: ton
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tov tovVar = tov.this;
                List list = arrayList;
                final anfz anfzVar2 = anfzVar;
                for (final tld tldVar : (List) obj) {
                    list.add(anfq.i(tovVar.d.g(tldVar), new anfz() { // from class: tno
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            return anfz.this.a(new tou(tldVar, (tkv) obj2));
                        }
                    }, tovVar.h));
                }
                return anaf.H(list).a(gip.h, tovVar.h);
            }
        }, this.h);
    }

    public final anhy j(tld tldVar, final tkl tklVar, long j, String str) {
        final aone createBuilder = andw.a.createBuilder();
        String str2 = tldVar.c;
        createBuilder.copyOnWrite();
        andw andwVar = (andw) createBuilder.instance;
        str2.getClass();
        andwVar.b |= 1;
        andwVar.c = str2;
        String str3 = tldVar.d;
        createBuilder.copyOnWrite();
        andw andwVar2 = (andw) createBuilder.instance;
        str3.getClass();
        andwVar2.b |= 4;
        andwVar2.e = str3;
        createBuilder.copyOnWrite();
        andw andwVar3 = (andw) createBuilder.instance;
        andwVar3.b |= 32;
        andwVar3.h = j;
        createBuilder.copyOnWrite();
        andw andwVar4 = (andw) createBuilder.instance;
        str.getClass();
        andwVar4.b |= 64;
        andwVar4.i = str;
        tow towVar = this.d;
        aone builder = tldVar.toBuilder();
        builder.copyOnWrite();
        tld tldVar2 = (tld) builder.instance;
        tldVar2.b |= 8;
        tldVar2.f = false;
        return anfq.i(towVar.g((tld) builder.build()), new anfz() { // from class: tol
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tov tovVar = tov.this;
                aone aoneVar = createBuilder;
                tkl tklVar2 = tklVar;
                tkv tkvVar = (tkv) obj;
                if (tkvVar != null) {
                    int i = tkvVar.f;
                    aoneVar.copyOnWrite();
                    andw andwVar5 = (andw) aoneVar.instance;
                    andw andwVar6 = andw.a;
                    andwVar5.b |= 2;
                    andwVar5.d = i;
                }
                tovVar.b.j(anaf.p(tklVar2.a.ao), (andw) aoneVar.build());
                return anaf.O(null);
            }
        }, this.h);
    }

    public final anhy k(final tkv tkvVar, boolean z) {
        this.k.k();
        if (tkvVar == null || !z || !rwh.aT(tkvVar)) {
            return anaf.O(true);
        }
        ArrayList arrayList = new ArrayList(tkvVar.n.size());
        for (tkt tktVar : tkvVar.n) {
            arrayList.add(anfq.i(h(tktVar, tkvVar), new tnu(this, tktVar, tkvVar, 0), this.h));
        }
        return aney.h(anaf.J(arrayList).a(gip.i, this.h), IOException.class, new amml() { // from class: tnl
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                tsx.i((IOException) obj, "%s: Detected corruption of isolated structure for group %s", "FileGroupManager", tkv.this.d);
                return false;
            }
        }, this.h);
    }

    public final anhy l(final tkv tkvVar, final int i, final int i2) {
        int i3 = 1;
        if (i < i2) {
            tkt tktVar = (tkt) tkvVar.n.get(i);
            if (!rwh.aU(tktVar)) {
                int bp = rwh.bp(tkvVar.i);
                if (bp == 0) {
                    bp = 1;
                }
                tlg be = rwh.be(tktVar, bp);
                trf trfVar = this.e;
                return anfq.i(anfq.i(trfVar.c.e(be), new tre(trfVar, be, i3), trfVar.k), new anfz() { // from class: tny
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        tov tovVar = tov.this;
                        tkv tkvVar2 = tkvVar;
                        int i4 = i;
                        int i5 = i2;
                        if (!((Boolean) obj).booleanValue()) {
                            tsx.d("%s: Subscribing to file failed for group: %s", "FileGroupManager", tkvVar2.d);
                            return anaf.O(false);
                        }
                        return tovVar.l(tkvVar2, i4 + 1, i5);
                    }
                }, this.h);
            }
            return l(tkvVar, i + 1, i2);
        }
        return anaf.O(true);
    }

    public final anhy m(tkv tkvVar, tkt tktVar, final tlg tlgVar, final long j) {
        final trf trfVar = this.e;
        return anfq.i(anfq.i(trfVar.c(tlgVar), new anfz() { // from class: trd
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                trf trfVar2 = trf.this;
                long j2 = j;
                tlg tlgVar2 = tlgVar;
                tlh tlhVar = (tlh) obj;
                if (j2 > tlhVar.f) {
                    aone builder = tlhVar.toBuilder();
                    builder.copyOnWrite();
                    tlh tlhVar2 = (tlh) builder.instance;
                    tlhVar2.b |= 8;
                    tlhVar2.f = j2;
                    return trfVar2.c.g(tlgVar2, (tlh) builder.build());
                }
                return anaf.O(true);
            }
        }, trfVar.k), new tnu(this, tktVar, tkvVar, 2), this.h);
    }

    public final anhy n(tld tldVar, tkv tkvVar) {
        String str = tkvVar.d;
        int i = tsx.a;
        return anfq.i(f(tkvVar), new tod(this, tkvVar, tldVar, 2), this.h);
    }

    public final void o(Uri uri, tkv tkvVar, tkt tktVar) {
        try {
            this.g.f(uri);
        } catch (IOException unused) {
            tsx.e("%s: Failed to delete the local copy after android-sharing the file %s, file group %s", "FileGroupManager", tktVar.c, tkvVar.d);
            v(this.b, tkvVar, tktVar, 23);
        }
    }

    public final boolean r(String str) {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy t(final tkv tkvVar, final tkt tktVar, tlh tlhVar, tlg tlgVar, String str, long j, final int i) {
        String str2;
        str2 = "";
        if (tlhVar.e && !s(tlhVar, j)) {
            v(this.b, tkvVar, tktVar, i);
            return anaf.O(true);
        }
        final long max = Math.max(j, tlhVar.f);
        Context context = this.a;
        vcw vcwVar = this.g;
        int i2 = 0;
        try {
            vdc a = vdd.a(context);
            a.a = String.valueOf(str).concat(".lease");
            a.b = max;
            OutputStream outputStream = (OutputStream) vcwVar.c(a.a(), veh.b());
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException unused) {
            tsx.e("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            str2 = String.format("Error while acquiring lease for file %s, group %s", tktVar.c, tkvVar.d);
            i2 = 20;
        } catch (vdj unused2) {
            tsx.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            str2 = String.format("System limit exceeded for file %s, group %s", tktVar.c, tkvVar.d);
            i2 = 25;
        } catch (vdo unused3) {
            tsx.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", tktVar.c, tkvVar.d);
            str2 = String.format("Malformed lease Uri for file %s, group %s", tktVar.c, tkvVar.d);
            i2 = 18;
        } catch (vds e) {
            str2 = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
            String str3 = tktVar.c;
            String str4 = tkvVar.d;
            int i3 = tsx.a;
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "UnsupportedFileStorageOperation was thrown: ".concat(valueOf) : new String("UnsupportedFileStorageOperation was thrown: ");
            i2 = 24;
        }
        if (i2 != 0) {
            throw new tti(i2, str2);
        }
        trf trfVar = this.e;
        aone createBuilder = tlh.a.createBuilder();
        tlc tlcVar = tlc.DOWNLOAD_COMPLETE;
        createBuilder.copyOnWrite();
        tlh tlhVar2 = (tlh) createBuilder.instance;
        tlhVar2.d = tlcVar.h;
        tlhVar2.b |= 2;
        String valueOf2 = String.valueOf(str);
        String concat = valueOf2.length() != 0 ? "android_shared_".concat(valueOf2) : new String("android_shared_");
        createBuilder.copyOnWrite();
        tlh tlhVar3 = (tlh) createBuilder.instance;
        concat.getClass();
        tlhVar3.b |= 1;
        tlhVar3.c = concat;
        createBuilder.copyOnWrite();
        tlh tlhVar4 = (tlh) createBuilder.instance;
        tlhVar4.b |= 4;
        tlhVar4.e = true;
        createBuilder.copyOnWrite();
        tlh tlhVar5 = (tlh) createBuilder.instance;
        tlhVar5.b |= 8;
        tlhVar5.f = max;
        createBuilder.copyOnWrite();
        tlh tlhVar6 = (tlh) createBuilder.instance;
        str.getClass();
        tlhVar6.b |= 16;
        tlhVar6.g = str;
        return anfq.i(trfVar.c.g(tlgVar, (tlh) createBuilder.build()), new anfz() { // from class: tnv
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tov tovVar = tov.this;
                tkt tktVar2 = tktVar;
                tkv tkvVar2 = tkvVar;
                int i4 = i;
                long j2 = max;
                if (!((Boolean) obj).booleanValue()) {
                    tsx.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", tktVar2.c, tkvVar2.d);
                    tov.v(tovVar.b, tkvVar2, tktVar2, 15);
                    return anaf.O(false);
                }
                tss tssVar = tovVar.b;
                aone createBuilder2 = andz.a.createBuilder();
                createBuilder2.copyOnWrite();
                andz andzVar = (andz) createBuilder2.instance;
                andzVar.c = anaf.q(i4);
                andzVar.b |= 1;
                String str5 = tkvVar2.d;
                createBuilder2.copyOnWrite();
                andz andzVar2 = (andz) createBuilder2.instance;
                str5.getClass();
                andzVar2.b = 2 | andzVar2.b;
                andzVar2.d = str5;
                int i5 = tkvVar2.f;
                createBuilder2.copyOnWrite();
                andz andzVar3 = (andz) createBuilder2.instance;
                andzVar3.b |= 4;
                andzVar3.e = i5;
                long j3 = tkvVar2.r;
                createBuilder2.copyOnWrite();
                andz andzVar4 = (andz) createBuilder2.instance;
                andzVar4.b |= 128;
                andzVar4.i = j3;
                String str6 = tkvVar2.s;
                createBuilder2.copyOnWrite();
                andz andzVar5 = (andz) createBuilder2.instance;
                str6.getClass();
                andzVar5.b |= 256;
                andzVar5.j = str6;
                String str7 = tktVar2.c;
                createBuilder2.copyOnWrite();
                andz andzVar6 = (andz) createBuilder2.instance;
                str7.getClass();
                andzVar6.b |= 8;
                andzVar6.f = str7;
                createBuilder2.copyOnWrite();
                andz andzVar7 = (andz) createBuilder2.instance;
                andzVar7.b |= 16;
                andzVar7.g = true;
                createBuilder2.copyOnWrite();
                andz andzVar8 = (andz) createBuilder2.instance;
                andzVar8.b |= 32;
                andzVar8.h = j2;
                tssVar.a((andz) createBuilder2.build());
                return anaf.O(true);
            }
        }, this.h);
    }
}
