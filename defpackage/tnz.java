package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tnz implements anfz {
    public final /* synthetic */ tov a;
    public final /* synthetic */ tkv b;
    public final /* synthetic */ tkt c;
    public final /* synthetic */ tlg d;
    private final /* synthetic */ int e;

    public /* synthetic */ tnz(tov tovVar, tkt tktVar, tkv tkvVar, tlg tlgVar, int i) {
        this.e = i;
        this.a = tovVar;
        this.c = tktVar;
        this.b = tkvVar;
        this.d = tlgVar;
    }

    public /* synthetic */ tnz(tov tovVar, tkv tkvVar, tkt tktVar, tlg tlgVar, int i) {
        this.e = i;
        this.a = tovVar;
        this.b = tkvVar;
        this.c = tktVar;
        this.d = tlgVar;
    }

    public /* synthetic */ tnz(tov tovVar, tlg tlgVar, tkv tkvVar, tkt tktVar, int i) {
        this.e = i;
        this.a = tovVar;
        this.d = tlgVar;
        this.b = tkvVar;
        this.c = tktVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.e;
        if (i == 0) {
            tov tovVar = this.a;
            tkv tkvVar = this.b;
            tkt tktVar = this.c;
            tlg tlgVar = this.d;
            tlh tlhVar = (tlh) obj;
            long j = tkvVar.k;
            try {
            } catch (tti e) {
                tov.v(tovVar.b, tkvVar, tktVar, e.a);
            }
            if (tlhVar.e) {
                String str = tktVar.c;
                String str2 = tkvVar.d;
                int i2 = tsx.a;
                return anfq.i(tovVar.t(tkvVar, tktVar, tlhVar, tlgVar, tlhVar.g, j, 3), jom.i, tovVar.h);
            }
            String str3 = tktVar.o;
            if (!TextUtils.isEmpty(str3)) {
                if (rwh.bb(tovVar.a, str3, tkvVar, tktVar, tovVar.g)) {
                    String str4 = tktVar.c;
                    String str5 = tkvVar.d;
                    int i3 = tsx.a;
                    return anfq.i(tovVar.t(tkvVar, tktVar, tlhVar, tlgVar, str3, j, 4), jom.j, tovVar.h);
                }
                int br = rwh.br(tktVar.m);
                if (br != 0 && br == 2) {
                    tlc a = tlc.a(tlhVar.d);
                    if (a == null) {
                        a = tlc.NONE;
                    }
                    if (a == tlc.DOWNLOAD_COMPLETE) {
                        String str6 = tktVar.c;
                        String str7 = tkvVar.d;
                        int i4 = tsx.a;
                        rwh.ba(tovVar.a, str3, tovVar.b(tktVar, tlgVar, tlhVar), tkvVar, tktVar, tovVar.g, false);
                        return anfq.i(tovVar.t(tkvVar, tktVar, tlhVar, tlgVar, str3, j, 6), jom.k, tovVar.h);
                    }
                }
            }
            String str8 = tktVar.c;
            String str9 = tkvVar.d;
            int i5 = tsx.a;
            return anhv.a;
        }
        if (i != 1) {
            if (i == 2) {
                tov tovVar2 = this.a;
                tkv tkvVar2 = this.b;
                tkt tktVar2 = this.c;
                tlg tlgVar2 = this.d;
                return anfq.i(aney.i(tovVar2.e.c(tlgVar2), trg.class, new tnz(tovVar2, tlgVar2, tkvVar2, tktVar2, 3), tovVar2.h), new tnz(tovVar2, tktVar2, tkvVar2, tlgVar2, 1), tovVar2.h);
            }
            if (i == 3) {
                tov tovVar3 = this.a;
                tlg tlgVar3 = this.d;
                tkv tkvVar3 = this.b;
                tkt tktVar3 = this.c;
                trg trgVar = (trg) obj;
                tsx.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", tlgVar3);
                tovVar3.c.a(trgVar, "Shared file not found in downloadFileGroup", new Object[0]);
                tov.v(tovVar3.b, tkvVar3, tktVar3, 26);
                return anaf.N(trgVar);
            }
            tov tovVar4 = this.a;
            tlg tlgVar4 = this.d;
            tkv tkvVar4 = this.b;
            tkt tktVar4 = this.c;
            trg trgVar2 = (trg) obj;
            tsx.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", tlgVar4);
            tovVar4.c.a(trgVar2, "Shared file not found in downloadFileGroup", new Object[0]);
            tov.v(tovVar4.b, tkvVar4, tktVar4, 26);
            return anaf.N(trgVar2);
        }
        final tov tovVar5 = this.a;
        final tkt tktVar5 = this.c;
        final tkv tkvVar5 = this.b;
        final tlg tlgVar5 = this.d;
        tlh tlhVar2 = (tlh) obj;
        String str10 = tktVar5.o;
        final long j2 = tkvVar5.k;
        tlc a2 = tlc.a(tlhVar2.d);
        if (a2 == null) {
            a2 = tlc.NONE;
        }
        if (a2 != tlc.DOWNLOAD_COMPLETE) {
            return anhv.a;
        }
        if (tlhVar2.e) {
            if (!tov.s(tlhVar2, j2)) {
                return anhv.a;
            }
            String str11 = tktVar5.c;
            String str12 = tkvVar5.d;
            int i6 = tsx.a;
            return anfq.i(tovVar5.t(tkvVar5, tktVar5, tlhVar2, tlgVar5, tlhVar2.g, j2, 27), new anfz() { // from class: toa
                @Override // defpackage.anfz
                public final anhy a(Object obj2) {
                    tov tovVar6 = tov.this;
                    tkv tkvVar6 = tkvVar5;
                    tkt tktVar6 = tktVar5;
                    tlg tlgVar6 = tlgVar5;
                    long j3 = j2;
                    if (((Boolean) obj2).booleanValue()) {
                        return anhv.a;
                    }
                    return tovVar6.m(tkvVar6, tktVar6, tlgVar6, j3);
                }
            }, tovVar5.h);
        }
        try {
            if (!TextUtils.isEmpty(str10)) {
                final Uri b = tovVar5.b(tktVar5, tlgVar5, tlhVar2);
                if (rwh.bb(tovVar5.a, str10, tkvVar5, tktVar5, tovVar5.g)) {
                    String str13 = tktVar5.c;
                    String str14 = tkvVar5.d;
                    int i7 = tsx.a;
                    final int i8 = 1;
                    return anfq.i(tovVar5.t(tkvVar5, tktVar5, tlhVar2, tlgVar5, str10, j2, 5), new anfz() { // from class: tnt
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            if (i8 == 0) {
                                tov tovVar6 = tovVar5;
                                Uri uri = b;
                                tkv tkvVar6 = tkvVar5;
                                tkt tktVar6 = tktVar5;
                                tlg tlgVar6 = tlgVar5;
                                long j3 = j2;
                                if (((Boolean) obj2).booleanValue()) {
                                    tovVar6.o(uri, tkvVar6, tktVar6);
                                    return anhv.a;
                                }
                                return tovVar6.m(tkvVar6, tktVar6, tlgVar6, j3);
                            }
                            tov tovVar7 = tovVar5;
                            Uri uri2 = b;
                            tkv tkvVar7 = tkvVar5;
                            tkt tktVar7 = tktVar5;
                            tlg tlgVar7 = tlgVar5;
                            long j4 = j2;
                            if (((Boolean) obj2).booleanValue()) {
                                tovVar7.o(uri2, tkvVar7, tktVar7);
                                return anhv.a;
                            }
                            return tovVar7.m(tkvVar7, tktVar7, tlgVar7, j4);
                        }
                    }, tovVar5.h);
                }
                int br2 = rwh.br(tktVar5.m);
                if (br2 != 0 && br2 == 2) {
                    String str15 = tktVar5.c;
                    String str16 = tkvVar5.d;
                    int i9 = tsx.a;
                    rwh.ba(tovVar5.a, str10, b, tkvVar5, tktVar5, tovVar5.g, true);
                    anhy t = tovVar5.t(tkvVar5, tktVar5, tlhVar2, tlgVar5, str10, j2, 7);
                    final int i10 = 0;
                    return anfq.i(t, new anfz() { // from class: tnt
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            if (i10 == 0) {
                                tov tovVar6 = tovVar5;
                                Uri uri = b;
                                tkv tkvVar6 = tkvVar5;
                                tkt tktVar6 = tktVar5;
                                tlg tlgVar6 = tlgVar5;
                                long j3 = j2;
                                if (((Boolean) obj2).booleanValue()) {
                                    tovVar6.o(uri, tkvVar6, tktVar6);
                                    return anhv.a;
                                }
                                return tovVar6.m(tkvVar6, tktVar6, tlgVar6, j3);
                            }
                            tov tovVar7 = tovVar5;
                            Uri uri2 = b;
                            tkv tkvVar7 = tkvVar5;
                            tkt tktVar7 = tktVar5;
                            tlg tlgVar7 = tlgVar5;
                            long j4 = j2;
                            if (((Boolean) obj2).booleanValue()) {
                                tovVar7.o(uri2, tkvVar7, tktVar7);
                                return anhv.a;
                            }
                            return tovVar7.m(tkvVar7, tktVar7, tlgVar7, j4);
                        }
                    }, tovVar5.h);
                }
            }
            int br3 = rwh.br(tktVar5.m);
            if (br3 != 0 && br3 == 2) {
                tov.v(tovVar5.b, tkvVar5, tktVar5, 16);
            }
        } catch (tti e2) {
            tov.v(tovVar5.b, tkvVar5, tktVar5, e2.a);
        }
        String str17 = tktVar5.c;
        String str18 = tkvVar5.d;
        int i11 = tsx.a;
        return tovVar5.m(tkvVar5, tktVar5, tlgVar5, j2);
    }
}
