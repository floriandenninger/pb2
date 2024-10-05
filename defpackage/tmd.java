package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmd implements tlk {
    public final Context a;
    public final tss b;
    public final ammv c;
    public final tqd d;
    public final vcw e;
    public final Executor f;
    public final ammv g;
    private final List h;
    private final anha i = anha.a();

    public tmd(Context context, tss tssVar, tqd tqdVar, Executor executor, List list, ammv ammvVar, vcw vcwVar, ammv ammvVar2) {
        new HashMap();
        this.a = context;
        this.b = tssVar;
        this.h = list;
        this.c = ammvVar;
        this.f = executor;
        this.d = tqdVar;
        this.e = vcwVar;
        this.g = ammvVar2;
    }

    public static tjw f(String str, int i, int i2, String str2, aols aolsVar) {
        aone createBuilder = tjw.a.createBuilder();
        createBuilder.copyOnWrite();
        tjw tjwVar = (tjw) createBuilder.instance;
        str.getClass();
        tjwVar.b |= 1;
        tjwVar.c = str;
        createBuilder.copyOnWrite();
        tjw tjwVar2 = (tjw) createBuilder.instance;
        tjwVar2.b |= 4;
        tjwVar2.e = i;
        if (i2 > 0) {
            createBuilder.copyOnWrite();
            tjw tjwVar3 = (tjw) createBuilder.instance;
            tjwVar3.b |= 8;
            tjwVar3.f = i2;
        }
        if (str2 != null) {
            createBuilder.copyOnWrite();
            tjw tjwVar4 = (tjw) createBuilder.instance;
            tjwVar4.b |= 2;
            tjwVar4.d = str2;
        }
        if (aolsVar != null) {
            createBuilder.copyOnWrite();
            tjw tjwVar5 = (tjw) createBuilder.instance;
            tjwVar5.g = aolsVar;
            tjwVar5.b |= 16;
        }
        return (tjw) createBuilder.build();
    }

    private final anhy j(final boolean z) {
        final int i = 1;
        anhy i2 = anfq.i(anht.q(g()), new anfz(this) { // from class: tlz
            public final /* synthetic */ tmd a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                if (i == 0) {
                    tmd tmdVar = this.a;
                    return tmdVar.d.b(z);
                }
                tmd tmdVar2 = this.a;
                return tmdVar2.d.b(z);
            }
        }, this.f);
        final int i3 = 0;
        return anfq.i(anfq.i(i2, new tlt(this, i3), this.f), new anfz(this) { // from class: tlz
            public final /* synthetic */ tmd a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                if (i3 == 0) {
                    tmd tmdVar = this.a;
                    return tmdVar.d.b(z);
                }
                tmd tmdVar2 = this.a;
                return tmdVar2.d.b(z);
            }
        }, this.f);
    }

    @Override // defpackage.tlk
    public final anhy a(final tka tkaVar) {
        return this.i.b(amjk.b(new anfy() { // from class: tlo
            @Override // defpackage.anfy
            public final anhy a() {
                tmd tmdVar = tmd.this;
                tka tkaVar2 = tkaVar;
                String str = tkaVar2.a.c;
                int i = tsx.a;
                tkf tkfVar = tkaVar2.a;
                if ((tkfVar.b & 2) == 0) {
                    aone builder = tkfVar.toBuilder();
                    String packageName = tmdVar.a.getPackageName();
                    builder.copyOnWrite();
                    tkf tkfVar2 = (tkf) builder.instance;
                    packageName.getClass();
                    tkfVar2.b |= 2;
                    tkfVar2.d = packageName;
                    tkfVar = (tkf) builder.build();
                } else if (!tmdVar.a.getPackageName().equals(tkfVar.d)) {
                    tsx.e("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", tkfVar.c, tmdVar.a.getPackageName(), tkfVar.d);
                    return anaf.O(false);
                }
                aone createBuilder = tld.a.createBuilder();
                String str2 = tkfVar.c;
                createBuilder.copyOnWrite();
                tld tldVar = (tld) createBuilder.instance;
                str2.getClass();
                tldVar.b |= 1;
                tldVar.c = str2;
                String str3 = tkfVar.d;
                createBuilder.copyOnWrite();
                tld tldVar2 = (tld) createBuilder.instance;
                str3.getClass();
                tldVar2.b = 2 | tldVar2.b;
                tldVar2.d = str3;
                try {
                    final tkv tkvVar = (tkv) aonm.parseFrom(tkv.a, tkfVar.toByteArray(), aomw.a());
                    final tqd tqdVar = tmdVar.d;
                    final tld tldVar3 = (tld) createBuilder.build();
                    String str4 = tldVar3.c;
                    return amkq.n(tqdVar.c(), new anfz() { // from class: tpx
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
                        
                            r13 = true;
                         */
                        @Override // defpackage.anfz
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final defpackage.anhy a(java.lang.Object r19) {
                            /*
                                Method dump skipped, instructions count: 1178
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.tpx.a(java.lang.Object):anhy");
                        }
                    }, tqdVar.n);
                } catch (aoob e) {
                    tsx.f(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return anaf.O(false);
                }
            }
        }), this.f);
    }

    @Override // defpackage.tlk
    public final anhy b(final tkq tkqVar) {
        return this.i.b(new anfy() { // from class: tlq
            @Override // defpackage.anfy
            public final anhy a() {
                final tmd tmdVar = tmd.this;
                final tkq tkqVar2 = tkqVar;
                tqd tqdVar = tmdVar.d;
                int i = tsx.a;
                return anfq.i(anfq.i(tqdVar.c(), new tpu(tqdVar, 5), tqdVar.n), new anfz() { // from class: tlx
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        final tmd tmdVar2 = tmd.this;
                        final tkq tkqVar3 = tkqVar2;
                        anhy O = anaf.O(amru.f());
                        for (final Pair pair : (List) obj) {
                            O = anfq.i(O, new anfz() { // from class: tlu
                                @Override // defpackage.anfz
                                public final anhy a(Object obj2) {
                                    final tmd tmdVar3 = tmd.this;
                                    Pair pair2 = pair;
                                    tkq tkqVar4 = tkqVar3;
                                    final amrp amrpVar = (amrp) obj2;
                                    tld tldVar = (tld) pair2.first;
                                    tkv tkvVar = (tkv) pair2.second;
                                    if (!tkqVar4.a) {
                                        ammv ammvVar = tkqVar4.c;
                                        if ((ammvVar.h() && !TextUtils.equals((CharSequence) ammvVar.c(), tldVar.c)) || (tkqVar4.b && (tldVar.b & 4) != 0)) {
                                            return anaf.O(amrpVar);
                                        }
                                    }
                                    return anfq.h(anfq.h(tmdVar3.i(tkvVar, (tldVar.b & 4) != 0 ? tldVar.e : null, true != tldVar.f ? 3 : 2), new amml() { // from class: tlr
                                        @Override // defpackage.amml
                                        public final Object apply(Object obj3) {
                                            tmd tmdVar4 = tmd.this;
                                            tjx tjxVar = (tjx) obj3;
                                            if (tjxVar != null) {
                                                tss tssVar = tmdVar4.b;
                                                aone createBuilder = andw.a.createBuilder();
                                                String str = tjxVar.c;
                                                createBuilder.copyOnWrite();
                                                andw andwVar = (andw) createBuilder.instance;
                                                str.getClass();
                                                andwVar.b |= 1;
                                                andwVar.c = str;
                                                String str2 = tjxVar.d;
                                                createBuilder.copyOnWrite();
                                                andw andwVar2 = (andw) createBuilder.instance;
                                                str2.getClass();
                                                andwVar2.b |= 4;
                                                andwVar2.e = str2;
                                                int i2 = tjxVar.f;
                                                createBuilder.copyOnWrite();
                                                andw andwVar3 = (andw) createBuilder.instance;
                                                andwVar3.b |= 2;
                                                andwVar3.d = i2;
                                                int size = tjxVar.h.size();
                                                createBuilder.copyOnWrite();
                                                andw andwVar4 = (andw) createBuilder.instance;
                                                andwVar4.b |= 8;
                                                andwVar4.f = size;
                                                String str3 = tjxVar.j;
                                                createBuilder.copyOnWrite();
                                                andw andwVar5 = (andw) createBuilder.instance;
                                                str3.getClass();
                                                andwVar5.b |= 64;
                                                andwVar5.i = str3;
                                                long j = tjxVar.i;
                                                createBuilder.copyOnWrite();
                                                andw andwVar6 = (andw) createBuilder.instance;
                                                andwVar6.b |= 32;
                                                andwVar6.h = j;
                                                tssVar.c((andw) createBuilder.build());
                                            }
                                            return tjxVar;
                                        }
                                    }, tmdVar3.f), new amml() { // from class: tmb
                                        @Override // defpackage.amml
                                        public final Object apply(Object obj3) {
                                            amrp amrpVar2 = amrp.this;
                                            tjx tjxVar = (tjx) obj3;
                                            if (tjxVar != null) {
                                                amrpVar2.h(tjxVar);
                                            }
                                            return amrpVar2;
                                        }
                                    }, tmdVar3.f);
                                }
                            }, tmdVar2.f);
                        }
                        return anfq.h(O, rtp.k, tmdVar2.f);
                    }
                }, tmdVar.f);
            }
        }, this.f);
    }

    @Override // defpackage.tlk
    public final void d(final tkn tknVar) {
        final String str = tknVar.a;
        aone createBuilder = tld.a.createBuilder();
        createBuilder.copyOnWrite();
        tld tldVar = (tld) createBuilder.instance;
        str.getClass();
        tldVar.b |= 1;
        tldVar.c = str;
        String packageName = this.a.getPackageName();
        createBuilder.copyOnWrite();
        tld tldVar2 = (tld) createBuilder.instance;
        packageName.getClass();
        tldVar2.b |= 2;
        tldVar2.d = packageName;
        final tld tldVar3 = (tld) createBuilder.build();
        anaf.Y(anfq.h(anaf.T(new anfy() { // from class: tlp
            @Override // defpackage.anfy
            public final anhy a() {
                final ammv ammvVar;
                tmd tmdVar = tmd.this;
                tkn tknVar2 = tknVar;
                String str2 = str;
                final tld tldVar4 = tldVar3;
                if (tknVar2.c.h()) {
                    if (tmdVar.g.h()) {
                        ttu ttuVar = (ttu) tmdVar.g.c();
                        aafk aafkVar = (aafk) tknVar2.c.c();
                        synchronized (ttu.class) {
                            if (!ttuVar.d.containsKey(str2)) {
                                ttuVar.d.put(str2, new veb(new ttt(ttuVar, str2, aafkVar), ttuVar.a, 1000L, TimeUnit.MILLISECONDS));
                            }
                        }
                    } else {
                        tkj a = tkl.a();
                        a.a = tkk.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
                        a.b = "downloadFileGroup: DownloadListener is present but Download Monitor is not provided!";
                        return anaf.N(a.a());
                    }
                }
                if (tknVar2.b.h()) {
                    ammvVar = ammv.j((tkx) aonm.parseFrom(tkx.a, ((tkg) tknVar2.b.c()).toByteArray(), aomw.a()));
                } else {
                    ammvVar = amlr.a;
                }
                final tqd tqdVar = tmdVar.d;
                String str3 = tldVar4.c;
                String str4 = tldVar4.d;
                int i = tsx.a;
                return anfq.i(anfq.i(tqdVar.c(), new anfz() { // from class: tpz
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        tqd tqdVar2 = tqd.this;
                        return tqdVar2.d.d(tldVar4, (tkx) ammvVar.f());
                    }
                }, tqdVar.n), new tlt(tmdVar, 2), tmdVar.f);
            }
        }, this.f), new amml() { // from class: tly
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                tmd tmdVar = tmd.this;
                tkn tknVar2 = tknVar;
                String str2 = str;
                tjx tjxVar = (tjx) obj;
                if (tknVar2.c.h()) {
                    aafk aafkVar = (aafk) tknVar2.c.c();
                    aafl aaflVar = aafkVar.a;
                    aaflVar.g.put(tjxVar.c, new aaft(tjxVar, aaflVar.e, aaflVar.c, aaflVar.d));
                    aafl aaflVar2 = aafkVar.a;
                    aaflVar2.h.c(amrz.j(aaflVar2.g));
                    if (tmdVar.g.h()) {
                        ((ttu) tmdVar.g.c()).h(str2);
                    }
                }
                return tjxVar;
            }
        }, this.f), new tmc(this, tknVar, str), this.f);
    }

    @Override // defpackage.tlk
    public final void e() {
        anha anhaVar = this.i;
        Callable g = amjk.g(new Callable() { // from class: tma
            @Override // java.util.concurrent.Callable
            public final Object call() {
                tmd tmdVar = tmd.this;
                if (!tmdVar.c.h()) {
                    tsx.c("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                tmh tmhVar = (tmh) tmdVar.c.c();
                tmhVar.a("MDD.CHARGING.PERIODIC.TASK", 21600L, 3, amlr.a);
                tmhVar.a("MDD.MAINTENANCE.PERIODIC.GCM.TASK", 86400L, 3, amlr.a);
                tmhVar.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", 21600L, 1, amlr.a);
                tmhVar.a("MDD.WIFI.CHARGING.PERIODIC.TASK", 21600L, 2, amlr.a);
                return null;
            }
        });
        anhaVar.b(new angu(g), this.f);
    }

    public final anhy g() {
        ArrayList arrayList = new ArrayList();
        for (aafp aafpVar : this.h) {
            aqie aqieVar = aafpVar.a.b().C;
            if (aqieVar == null) {
                aqieVar = aqie.a;
            }
            arrayList.add(((aafc) aafpVar.b.get()).b(aqieVar.b));
        }
        return anaf.H(arrayList).a(gip.e, this.f);
    }

    public final List h(Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : this.e.b(uri)) {
            if (this.e.i(uri2)) {
                arrayList.addAll(h(uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    aone createBuilder = tjw.a.createBuilder();
                    String replaceFirst = path.replaceFirst(str, "");
                    createBuilder.copyOnWrite();
                    tjw tjwVar = (tjw) createBuilder.instance;
                    replaceFirst.getClass();
                    tjwVar.b |= 1;
                    tjwVar.c = replaceFirst;
                    long a = this.e.a(uri2);
                    createBuilder.copyOnWrite();
                    tjw tjwVar2 = (tjw) createBuilder.instance;
                    tjwVar2.b |= 4;
                    tjwVar2.e = (int) a;
                    String uri3 = uri2.toString();
                    createBuilder.copyOnWrite();
                    tjw tjwVar3 = (tjw) createBuilder.instance;
                    uri3.getClass();
                    tjwVar3.b |= 2;
                    tjwVar3.d = uri3;
                    arrayList.add((tjw) createBuilder.build());
                }
            }
        }
        return arrayList;
    }

    public final anhy i(final tkv tkvVar, String str, final int i) {
        if (tkvVar == null) {
            return anaf.O(null);
        }
        aone createBuilder = tjx.a.createBuilder();
        String str2 = tkvVar.d;
        createBuilder.copyOnWrite();
        tjx tjxVar = (tjx) createBuilder.instance;
        str2.getClass();
        tjxVar.b |= 1;
        tjxVar.c = str2;
        String str3 = tkvVar.e;
        createBuilder.copyOnWrite();
        tjx tjxVar2 = (tjx) createBuilder.instance;
        str3.getClass();
        tjxVar2.b |= 2;
        tjxVar2.d = str3;
        int i2 = tkvVar.f;
        createBuilder.copyOnWrite();
        tjx tjxVar3 = (tjx) createBuilder.instance;
        tjxVar3.b |= 8;
        tjxVar3.f = i2;
        aols aolsVar = tkvVar.g;
        if (aolsVar == null) {
            aolsVar = aols.a;
        }
        createBuilder.copyOnWrite();
        tjx tjxVar4 = (tjx) createBuilder.instance;
        aolsVar.getClass();
        tjxVar4.l = aolsVar;
        tjxVar4.b |= 128;
        long j = tkvVar.r;
        createBuilder.copyOnWrite();
        tjx tjxVar5 = (tjx) createBuilder.instance;
        tjxVar5.b |= 32;
        tjxVar5.i = j;
        String str4 = tkvVar.s;
        createBuilder.copyOnWrite();
        tjx tjxVar6 = (tjx) createBuilder.instance;
        str4.getClass();
        tjxVar6.b |= 64;
        tjxVar6.j = str4;
        createBuilder.copyOnWrite();
        tjx tjxVar7 = (tjx) createBuilder.instance;
        tjxVar7.g = i - 1;
        tjxVar7.b |= 16;
        aony aonyVar = tkvVar.t;
        createBuilder.copyOnWrite();
        tjx tjxVar8 = (tjx) createBuilder.instance;
        aony aonyVar2 = tjxVar8.k;
        if (!aonyVar2.c()) {
            tjxVar8.k = aonm.mutableCopy(aonyVar2);
        }
        aolo.addAll((Iterable) aonyVar, (List) tjxVar8.k);
        if (str != null) {
            createBuilder.copyOnWrite();
            tjx tjxVar9 = (tjx) createBuilder.instance;
            tjxVar9.b |= 4;
            tjxVar9.e = str;
        }
        if ((tkvVar.b & 32) != 0) {
            aols aolsVar2 = tkvVar.h;
            if (aolsVar2 == null) {
                aolsVar2 = aols.a;
            }
            createBuilder.copyOnWrite();
            tjx tjxVar10 = (tjx) createBuilder.instance;
            aolsVar2.getClass();
            tjxVar10.m = aolsVar2;
            tjxVar10.b |= 256;
        }
        anhy O = anaf.O(createBuilder);
        for (final tkt tktVar : tkvVar.n) {
            O = anfq.i(O, new anfz() { // from class: tlw
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    aols aolsVar3;
                    final tmd tmdVar = tmd.this;
                    int i3 = i;
                    final tkt tktVar2 = tktVar;
                    final tkv tkvVar2 = tkvVar;
                    final aone aoneVar = (aone) obj;
                    if (i3 != 2) {
                        String str5 = tktVar2.c;
                        int i4 = tktVar2.e;
                        int i5 = tktVar2.j;
                        if ((tktVar2.b & 8192) != 0) {
                            aolsVar3 = tktVar2.q;
                            if (aolsVar3 == null) {
                                aolsVar3 = aols.a;
                            }
                        } else {
                            aolsVar3 = null;
                        }
                        aoneVar.w(tmd.f(str5, i4, i5, null, aolsVar3));
                        return anaf.O(aoneVar);
                    }
                    final tqd tqdVar = tmdVar.d;
                    String str6 = tktVar2.c;
                    int i6 = tsx.a;
                    return anfq.i(anfq.i(tqdVar.c(), new anfz() { // from class: tpw
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            final tqd tqdVar2 = tqd.this;
                            final tkt tktVar3 = tktVar2;
                            final tkv tkvVar3 = tkvVar2;
                            return anfq.h(tqdVar2.d.h(tktVar3, tkvVar3), new amml() { // from class: tqc
                                @Override // defpackage.amml
                                public final Object apply(Object obj3) {
                                    tqd tqdVar3 = tqd.this;
                                    tkv tkvVar4 = tkvVar3;
                                    tkt tktVar4 = tktVar3;
                                    Uri uri = (Uri) obj3;
                                    if (uri != null && rwh.aT(tkvVar4)) {
                                        try {
                                            uri = tqdVar3.d.a(uri, tktVar4, tkvVar4);
                                        } catch (IOException e) {
                                            tsx.f(e, "%s getDataFileUri %s %s unable to get isolated file uri!", "MDDManager", tktVar4.c, tkvVar4.d);
                                            uri = null;
                                        }
                                    }
                                    if (uri == null || (tktVar4.b & 256) == 0) {
                                        return uri;
                                    }
                                    awzo awzoVar = tktVar4.k;
                                    if (awzoVar == null) {
                                        awzoVar = awzo.a;
                                    }
                                    tqdVar3.p.h();
                                    return awzoVar.b.size() != 0 ? uri.buildUpon().encodedFragment(veo.a(awzoVar)).build() : uri;
                                }
                            }, tqdVar2.n);
                        }
                    }, tqdVar.n), new anfz() { // from class: tlv
                        @Override // defpackage.anfz
                        public final anhy a(Object obj2) {
                            aols aolsVar4;
                            tmd tmdVar2 = tmd.this;
                            aone aoneVar2 = aoneVar;
                            tkt tktVar3 = tktVar2;
                            Uri uri = (Uri) obj2;
                            if (uri == null) {
                                tkj a = tkl.a();
                                a.a = tkk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                a.b = "getDataFileUri() resolved to null";
                                return anaf.N(a.a());
                            }
                            try {
                                if (tmdVar2.e.i(uri)) {
                                    String path = uri.getPath();
                                    if (path != null) {
                                        List h = tmdVar2.h(uri, path);
                                        aoneVar2.copyOnWrite();
                                        tjx tjxVar11 = (tjx) aoneVar2.instance;
                                        tjx tjxVar12 = tjx.a;
                                        tjxVar11.a();
                                        aolo.addAll((Iterable) h, (List) tjxVar11.h);
                                    }
                                } else {
                                    String str7 = tktVar3.c;
                                    int i7 = tktVar3.e;
                                    int i8 = tktVar3.j;
                                    String uri2 = uri.toString();
                                    if ((tktVar3.b & 8192) != 0) {
                                        aolsVar4 = tktVar3.q;
                                        if (aolsVar4 == null) {
                                            aolsVar4 = aols.a;
                                        }
                                    } else {
                                        aolsVar4 = null;
                                    }
                                    aoneVar2.w(tmd.f(str7, i7, i8, uri2, aolsVar4));
                                }
                            } catch (IOException e) {
                                String valueOf = String.valueOf(uri);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                                sb.append("Failed to list files under directory:");
                                sb.append(valueOf);
                                tsx.j(e, sb.toString());
                            }
                            return anaf.O(aoneVar2);
                        }
                    }, tmdVar.f);
                }
            }, this.f);
        }
        return aney.h(anfq.h(anht.q(O), rtp.l, this.f), tkl.class, rtp.n, this.f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.tlk
    public final anhy c(String str) {
        char c;
        int i = 1;
        switch (str.hashCode()) {
            case -2105562759:
                if (str.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1202768674:
                if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -69128772:
                if (str.equals("MDD.CHARGING.PERIODIC.TASK")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 437964371:
                if (str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            anha anhaVar = this.i;
            final tqd tqdVar = this.d;
            return anhaVar.b(new anfy() { // from class: tls
                @Override // defpackage.anfy
                public final anhy a() {
                    final tqd tqdVar2 = tqd.this;
                    int i2 = tsx.a;
                    return anfq.i(anfq.i(anht.q(tqdVar2.c()), new tpu(tqdVar2, 8), angq.a), new anfz() { // from class: tpt
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            anhy i3;
                            anhy i4;
                            Class<ttw> cls;
                            anhy O;
                            tqd tqdVar3 = tqd.this;
                            Integer num = (Integer) obj;
                            ArrayList arrayList = new ArrayList();
                            int i5 = tsx.a;
                            int i6 = 1;
                            arrayList.add(anfq.i(tqdVar3.c(), new tpu(tqdVar3, i6), tqdVar3.n));
                            tqdVar3.p.s();
                            tov tovVar = tqdVar3.d;
                            int i7 = 0;
                            arrayList.add(tovVar.i(new tns(tovVar, i7)));
                            tqdVar3.p.u();
                            tov tovVar2 = tqdVar3.d;
                            int i8 = 4;
                            arrayList.add(anfq.i(tovVar2.d.d(), new tns(tovVar2, i8), tovVar2.h));
                            tqdVar3.p.t();
                            tqdVar3.p.k();
                            tov tovVar3 = tqdVar3.d;
                            int i9 = 2;
                            arrayList.add(tovVar3.i(new tns(tovVar3, i9)));
                            tqdVar3.p.w();
                            tnj tnjVar = tqdVar3.h;
                            arrayList.add(amkq.n(amkq.n(tnjVar.b.e(), new tna(tnjVar, i7), tnjVar.j), new tna(tnjVar, 5), tnjVar.j));
                            tqdVar3.c.g(1053);
                            final tsw tswVar = tqdVar3.k;
                            final int intValue = num.intValue();
                            tswVar.e.r();
                            if (!tsx.a(100L)) {
                                i3 = anaf.O(null);
                            } else {
                                i3 = anfq.i(tswVar.b.c(), new anfz() { // from class: tsu
                                    @Override // defpackage.anfz
                                    public final anhy a(Object obj2) {
                                        final tsw tswVar2 = tsw.this;
                                        final int i10 = intValue;
                                        anhy O2 = anaf.O(null);
                                        anhy anhyVar = O2;
                                        for (Pair pair : (List) obj2) {
                                            final tld tldVar = (tld) pair.first;
                                            final tkv tkvVar = (tkv) pair.second;
                                            if (tkvVar != null) {
                                                aone createBuilder = andw.a.createBuilder();
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
                                                int i11 = tkvVar.f;
                                                createBuilder.copyOnWrite();
                                                andw andwVar3 = (andw) createBuilder.instance;
                                                andwVar3.b |= 2;
                                                andwVar3.d = i11;
                                                int size = tkvVar.n.size();
                                                createBuilder.copyOnWrite();
                                                andw andwVar4 = (andw) createBuilder.instance;
                                                andwVar4.b |= 8;
                                                andwVar4.f = size;
                                                boolean isEmpty = tldVar.e.isEmpty();
                                                createBuilder.copyOnWrite();
                                                andw andwVar5 = (andw) createBuilder.instance;
                                                andwVar5.b |= 16;
                                                andwVar5.g = !isEmpty;
                                                long j = tkvVar.r;
                                                createBuilder.copyOnWrite();
                                                andw andwVar6 = (andw) createBuilder.instance;
                                                andwVar6.b |= 32;
                                                andwVar6.h = j;
                                                String str4 = tkvVar.s;
                                                createBuilder.copyOnWrite();
                                                andw andwVar7 = (andw) createBuilder.instance;
                                                str4.getClass();
                                                andwVar7.b |= 64;
                                                andwVar7.i = str4;
                                                final andw andwVar8 = (andw) createBuilder.build();
                                                anhyVar = anfq.i(anhyVar, new anfz() { // from class: tsv
                                                    @Override // defpackage.anfz
                                                    public final anhy a(Object obj3) {
                                                        anhy h;
                                                        final tsw tswVar3 = tsw.this;
                                                        tkv tkvVar2 = tkvVar;
                                                        tld tldVar2 = tldVar;
                                                        int i12 = i10;
                                                        final andw andwVar9 = andwVar8;
                                                        aone createBuilder2 = aned.a.createBuilder();
                                                        createBuilder2.copyOnWrite();
                                                        aned anedVar = (aned) createBuilder2.instance;
                                                        anedVar.b |= 8;
                                                        anedVar.f = i12;
                                                        tku tkuVar = tkvVar2.c;
                                                        if (tkuVar == null) {
                                                            tkuVar = tku.a;
                                                        }
                                                        if ((tkuVar.b & 2) == 0) {
                                                            createBuilder2.copyOnWrite();
                                                            aned anedVar2 = (aned) createBuilder2.instance;
                                                            anedVar2.b |= 2;
                                                            anedVar2.d = -1L;
                                                        } else {
                                                            tku tkuVar2 = tkvVar2.c;
                                                            if (tkuVar2 == null) {
                                                                tkuVar2 = tku.a;
                                                            }
                                                            long j2 = tkuVar2.d;
                                                            createBuilder2.copyOnWrite();
                                                            aned anedVar3 = (aned) createBuilder2.instance;
                                                            anedVar3.b |= 2;
                                                            anedVar3.d = j2 / 1000;
                                                        }
                                                        int i13 = 1;
                                                        if (!tldVar2.f) {
                                                            createBuilder2.copyOnWrite();
                                                            aned anedVar4 = (aned) createBuilder2.instance;
                                                            anedVar4.b |= 4;
                                                            anedVar4.e = -1L;
                                                            h = anfq.h(tswVar3.a.f(tkvVar2), new acqg(createBuilder2, i13), tswVar3.d);
                                                        } else {
                                                            createBuilder2.copyOnWrite();
                                                            aned anedVar5 = (aned) createBuilder2.instance;
                                                            anedVar5.c = anaf.o(3);
                                                            anedVar5.b = 1 | anedVar5.b;
                                                            tku tkuVar3 = tkvVar2.c;
                                                            if (tkuVar3 == null) {
                                                                tkuVar3 = tku.a;
                                                            }
                                                            if ((tkuVar3.b & 4) == 0) {
                                                                createBuilder2.copyOnWrite();
                                                                aned anedVar6 = (aned) createBuilder2.instance;
                                                                anedVar6.b |= 4;
                                                                anedVar6.e = -1L;
                                                            } else {
                                                                tku tkuVar4 = tkvVar2.c;
                                                                if (tkuVar4 == null) {
                                                                    tkuVar4 = tku.a;
                                                                }
                                                                long j3 = tkuVar4.e;
                                                                createBuilder2.copyOnWrite();
                                                                aned anedVar7 = (aned) createBuilder2.instance;
                                                                anedVar7.b |= 4;
                                                                anedVar7.e = j3 / 1000;
                                                            }
                                                            h = anaf.O((aned) createBuilder2.build());
                                                        }
                                                        return anfq.h(h, new amml() { // from class: tst
                                                            @Override // defpackage.amml
                                                            public final Object apply(Object obj4) {
                                                                tsw.this.c.d(andwVar9, (aned) obj4);
                                                                return null;
                                                            }
                                                        }, tswVar3.d);
                                                    }
                                                }, tswVar2.d);
                                            }
                                        }
                                        return anhyVar;
                                    }
                                }, tswVar.d);
                            }
                            arrayList.add(i3);
                            final tth tthVar = tqdVar3.j;
                            final int intValue2 = num.intValue();
                            tthVar.i.C();
                            if (!tsx.a(100L)) {
                                i4 = anaf.O(null);
                            } else {
                                i4 = anfq.i(tthVar.a.c(), new anfz() { // from class: tte
                                    @Override // defpackage.anfz
                                    public final anhy a(Object obj2) {
                                        final tth tthVar2 = tth.this;
                                        final int i10 = intValue2;
                                        final List list = (List) obj2;
                                        return anfq.i(tthVar2.a.e(), new anfz() { // from class: ttf
                                            @Override // defpackage.anfz
                                            public final anhy a(Object obj3) {
                                                Set set;
                                                final tth tthVar3 = tth.this;
                                                List list2 = list;
                                                final int i11 = i10;
                                                for (tkv tkvVar : (List) obj3) {
                                                    aone createBuilder = tld.a.createBuilder();
                                                    String str2 = tkvVar.d;
                                                    createBuilder.copyOnWrite();
                                                    tld tldVar = (tld) createBuilder.instance;
                                                    str2.getClass();
                                                    tldVar.b = 1 | tldVar.b;
                                                    tldVar.c = str2;
                                                    if (ammx.e(tkvVar.e)) {
                                                        createBuilder.copyOnWrite();
                                                        tld tldVar2 = (tld) createBuilder.instance;
                                                        tldVar2.b |= 2;
                                                        tldVar2.d = "com.google.android.gms";
                                                    } else {
                                                        String str3 = tkvVar.e;
                                                        createBuilder.copyOnWrite();
                                                        tld tldVar3 = (tld) createBuilder.instance;
                                                        str3.getClass();
                                                        tldVar3.b |= 2;
                                                        tldVar3.d = str3;
                                                    }
                                                    list2.add(Pair.create((tld) createBuilder.build(), tkvVar));
                                                }
                                                final HashMap hashMap = new HashMap();
                                                HashMap hashMap2 = new HashMap();
                                                HashMap hashMap3 = new HashMap();
                                                final HashMap hashMap4 = new HashMap();
                                                HashSet hashSet = new HashSet();
                                                AtomicLong atomicLong = new AtomicLong(0L);
                                                ArrayList arrayList2 = new ArrayList();
                                                Iterator it = list2.iterator();
                                                while (it.hasNext()) {
                                                    Pair pair = (Pair) it.next();
                                                    tld tldVar4 = (tld) pair.first;
                                                    tkv tkvVar2 = (tkv) pair.second;
                                                    Set b = tth.b(hashMap2, tth.a(tldVar4));
                                                    String a = tth.a(tldVar4);
                                                    zsd zsdVar = (zsd) hashMap.get(a);
                                                    if (zsdVar == null) {
                                                        hashMap.put(a, new zsd());
                                                        zsdVar = (zsd) hashMap.get(a);
                                                    }
                                                    zsd zsdVar2 = zsdVar;
                                                    if (tldVar4.f) {
                                                        set = tth.b(hashMap3, tth.a(tldVar4));
                                                        hashMap4.put(tth.a(tldVar4), tkvVar2);
                                                    } else {
                                                        set = null;
                                                    }
                                                    Set set2 = set;
                                                    for (tkt tktVar : tkvVar2.n) {
                                                        int bp = rwh.bp(tkvVar2.i);
                                                        if (bp == 0) {
                                                            bp = 1;
                                                        }
                                                        tlg be = rwh.be(tktVar, bp);
                                                        tld tldVar5 = tldVar4;
                                                        Iterator it2 = it;
                                                        ArrayList arrayList3 = arrayList2;
                                                        arrayList3.add(anfq.h(anfq.h(aney.i(anht.q(tthVar3.b.b(be)), trg.class, jom.o, tthVar3.h), new amml() { // from class: ttc
                                                            @Override // defpackage.amml
                                                            public final Object apply(Object obj4) {
                                                                tth tthVar4 = tth.this;
                                                                Uri uri = (Uri) obj4;
                                                                if (uri != null) {
                                                                    try {
                                                                        return Long.valueOf(tthVar4.c.a(uri));
                                                                    } catch (IOException e) {
                                                                        tsx.f(e, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
                                                                    }
                                                                }
                                                                return 0L;
                                                            }
                                                        }, tthVar3.h), new amml(hashSet, be, atomicLong, b, zsdVar2, tldVar5, set2, null, null) { // from class: ttd
                                                            public final /* synthetic */ Set a;
                                                            public final /* synthetic */ tlg b;
                                                            public final /* synthetic */ AtomicLong c;
                                                            public final /* synthetic */ Set d;
                                                            public final /* synthetic */ tld e;
                                                            public final /* synthetic */ Set f;
                                                            public final /* synthetic */ zsd g;

                                                            @Override // defpackage.amml
                                                            public final Object apply(Object obj4) {
                                                                Set set3 = this.a;
                                                                tlg tlgVar = this.b;
                                                                AtomicLong atomicLong2 = this.c;
                                                                Set set4 = this.d;
                                                                zsd zsdVar3 = this.g;
                                                                tld tldVar6 = this.e;
                                                                Set set5 = this.f;
                                                                Long l = (Long) obj4;
                                                                if (!set3.contains(tlgVar)) {
                                                                    atomicLong2.getAndAdd(l.longValue());
                                                                    set3.add(tlgVar);
                                                                }
                                                                if (!set4.contains(tlgVar)) {
                                                                    zsdVar3.a += l.longValue();
                                                                    set4.add(tlgVar);
                                                                }
                                                                if (!tldVar6.f) {
                                                                    return null;
                                                                }
                                                                set5.getClass();
                                                                if (set5.contains(tlgVar)) {
                                                                    return null;
                                                                }
                                                                zsdVar3.b += l.longValue();
                                                                set5.add(tlgVar);
                                                                return null;
                                                            }
                                                        }, tthVar3.h));
                                                        arrayList2 = arrayList3;
                                                        tkvVar2 = tkvVar2;
                                                        tldVar4 = tldVar5;
                                                        it = it2;
                                                        atomicLong = atomicLong;
                                                    }
                                                }
                                                final AtomicLong atomicLong2 = atomicLong;
                                                return anaf.H(arrayList2).a(new Callable() { // from class: ttg
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        tth tthVar4 = tth.this;
                                                        Map map = hashMap;
                                                        Map map2 = hashMap4;
                                                        AtomicLong atomicLong3 = atomicLong2;
                                                        int i12 = i11;
                                                        aone createBuilder2 = anei.a.createBuilder();
                                                        for (String str4 : map.keySet()) {
                                                            List h = amnm.c("|").h(str4);
                                                            aone createBuilder3 = andw.a.createBuilder();
                                                            String str5 = (String) h.get(0);
                                                            createBuilder3.copyOnWrite();
                                                            andw andwVar = (andw) createBuilder3.instance;
                                                            str5.getClass();
                                                            andwVar.b |= 1;
                                                            andwVar.c = str5;
                                                            String str6 = (String) h.get(1);
                                                            createBuilder3.copyOnWrite();
                                                            andw andwVar2 = (andw) createBuilder3.instance;
                                                            str6.getClass();
                                                            andwVar2.b |= 4;
                                                            andwVar2.e = str6;
                                                            tkv tkvVar3 = (tkv) map2.get(str4);
                                                            if (tkvVar3 == null) {
                                                                createBuilder3.copyOnWrite();
                                                                andw andwVar3 = (andw) createBuilder3.instance;
                                                                andwVar3.b |= 2;
                                                                andwVar3.d = -1;
                                                            } else {
                                                                int i13 = tkvVar3.f;
                                                                createBuilder3.copyOnWrite();
                                                                andw andwVar4 = (andw) createBuilder3.instance;
                                                                andwVar4.b |= 2;
                                                                andwVar4.d = i13;
                                                                long j = tkvVar3.r;
                                                                createBuilder3.copyOnWrite();
                                                                andw andwVar5 = (andw) createBuilder3.instance;
                                                                andwVar5.b |= 32;
                                                                andwVar5.h = j;
                                                                String str7 = tkvVar3.s;
                                                                createBuilder3.copyOnWrite();
                                                                andw andwVar6 = (andw) createBuilder3.instance;
                                                                str7.getClass();
                                                                andwVar6.b |= 64;
                                                                andwVar6.i = str7;
                                                            }
                                                            andw andwVar7 = (andw) createBuilder3.build();
                                                            createBuilder2.copyOnWrite();
                                                            anei aneiVar = (anei) createBuilder2.instance;
                                                            andwVar7.getClass();
                                                            aony aonyVar = aneiVar.c;
                                                            if (!aonyVar.c()) {
                                                                aneiVar.c = aonm.mutableCopy(aonyVar);
                                                            }
                                                            aneiVar.c.add(andwVar7);
                                                            zsd zsdVar3 = (zsd) map.get(str4);
                                                            long j2 = zsdVar3.a;
                                                            createBuilder2.copyOnWrite();
                                                            anei aneiVar2 = (anei) createBuilder2.instance;
                                                            aonx aonxVar = aneiVar2.d;
                                                            if (!aonxVar.c()) {
                                                                aneiVar2.d = aonm.mutableCopy(aonxVar);
                                                            }
                                                            aneiVar2.d.f(j2);
                                                            long j3 = zsdVar3.b;
                                                            createBuilder2.copyOnWrite();
                                                            anei aneiVar3 = (anei) createBuilder2.instance;
                                                            aonx aonxVar2 = aneiVar3.e;
                                                            if (!aonxVar2.c()) {
                                                                aneiVar3.e = aonm.mutableCopy(aonxVar2);
                                                            }
                                                            aneiVar3.e.f(j3);
                                                        }
                                                        long j4 = atomicLong3.get();
                                                        createBuilder2.copyOnWrite();
                                                        anei aneiVar4 = (anei) createBuilder2.instance;
                                                        aneiVar4.b |= 1;
                                                        aneiVar4.f = j4;
                                                        long j5 = 0;
                                                        try {
                                                            Uri aV = rwh.aV(tthVar4.e, tthVar4.g);
                                                            if (tthVar4.c.h(aV)) {
                                                                j5 = ((Long) tthVar4.c.c(aV, vec.b())).longValue();
                                                            }
                                                        } catch (IOException e) {
                                                            tsx.f(e, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
                                                            tthVar4.f.a(e, "Failed to call Mobstore to compute MDD Directory bytes used!", new Object[0]);
                                                        }
                                                        createBuilder2.copyOnWrite();
                                                        anei aneiVar5 = (anei) createBuilder2.instance;
                                                        aneiVar5.b |= 2;
                                                        aneiVar5.g = j5;
                                                        createBuilder2.copyOnWrite();
                                                        anei aneiVar6 = (anei) createBuilder2.instance;
                                                        aneiVar6.b |= 4;
                                                        aneiVar6.h = i12;
                                                        tthVar4.d.f((anei) createBuilder2.build());
                                                        return null;
                                                    }
                                                }, tthVar3.h);
                                            }
                                        }, tthVar2.h);
                                    }
                                }, tthVar.h);
                            }
                            arrayList.add(i4);
                            tta ttaVar = tqdVar3.l;
                            ttaVar.d.z();
                            if (!tsx.a(100L)) {
                                synchronized (ttw.class) {
                                    rwh.ar(ttaVar.b, "gms_icing_mdd_network_usage_monitor", ttaVar.c).edit().clear().commit();
                                }
                                O = anaf.O(null);
                            } else {
                                HashSet hashSet = new HashSet();
                                aone createBuilder = aneg.a.createBuilder();
                                Class<ttw> cls2 = ttw.class;
                                synchronized (cls2) {
                                    try {
                                        SharedPreferences ar = rwh.ar(ttaVar.b, "gms_icing_mdd_network_usage_monitor", ttaVar.c);
                                        Iterator<String> it = ar.getAll().keySet().iterator();
                                        long j = 0;
                                        long j2 = 0;
                                        while (it.hasNext()) {
                                            List h = amnm.c("|").h(it.next());
                                            if (h.size() >= i8) {
                                                String str2 = (String) h.get(i7);
                                                String str3 = (String) h.get(i6);
                                                int parseInt = Integer.parseInt((String) h.get(i9));
                                                String c2 = ttw.c(str2, str3, parseInt);
                                                if (!hashSet.contains(c2)) {
                                                    hashSet.add(c2);
                                                    String d = ttw.d(c2, "w");
                                                    String d2 = ttw.d(c2, "c");
                                                    cls = cls2;
                                                    try {
                                                        long j3 = ar.getLong(d, 0L);
                                                        long j4 = ar.getLong(d2, 0L);
                                                        aone createBuilder2 = andw.a.createBuilder();
                                                        String str4 = (String) h.get(0);
                                                        createBuilder2.copyOnWrite();
                                                        andw andwVar = (andw) createBuilder2.instance;
                                                        str4.getClass();
                                                        andwVar.b |= 4;
                                                        andwVar.e = str4;
                                                        String str5 = (String) h.get(1);
                                                        createBuilder2.copyOnWrite();
                                                        andw andwVar2 = (andw) createBuilder2.instance;
                                                        str5.getClass();
                                                        andwVar2.b |= 1;
                                                        andwVar2.c = str5;
                                                        createBuilder2.copyOnWrite();
                                                        andw andwVar3 = (andw) createBuilder2.instance;
                                                        andwVar3.b |= 2;
                                                        andwVar3.d = parseInt;
                                                        andw andwVar4 = (andw) createBuilder2.build();
                                                        aone createBuilder3 = anef.a.createBuilder();
                                                        createBuilder3.copyOnWrite();
                                                        anef anefVar = (anef) createBuilder3.instance;
                                                        andwVar4.getClass();
                                                        anefVar.c = andwVar4;
                                                        anefVar.b |= 1;
                                                        createBuilder3.copyOnWrite();
                                                        anef anefVar2 = (anef) createBuilder3.instance;
                                                        anefVar2.b |= 2;
                                                        anefVar2.d = j3;
                                                        createBuilder3.copyOnWrite();
                                                        anef anefVar3 = (anef) createBuilder3.instance;
                                                        anefVar3.b |= 4;
                                                        anefVar3.e = j4;
                                                        anef anefVar4 = (anef) createBuilder3.build();
                                                        createBuilder.copyOnWrite();
                                                        aneg anegVar = (aneg) createBuilder.instance;
                                                        anefVar4.getClass();
                                                        aony aonyVar = anegVar.c;
                                                        if (!aonyVar.c()) {
                                                            anegVar.c = aonm.mutableCopy(aonyVar);
                                                        }
                                                        anegVar.c.add(anefVar4);
                                                        j += j3;
                                                        j2 += j4;
                                                        cls2 = cls;
                                                        i6 = 1;
                                                        i7 = 0;
                                                        i9 = 2;
                                                        i8 = 4;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        throw th;
                                                    }
                                                }
                                            }
                                            cls = cls2;
                                            j = j;
                                            j2 = j2;
                                            cls2 = cls;
                                            i6 = 1;
                                            i7 = 0;
                                            i9 = 2;
                                            i8 = 4;
                                        }
                                        Class<ttw> cls3 = cls2;
                                        long j5 = j;
                                        long j6 = j2;
                                        ar.edit().clear().commit();
                                        createBuilder.copyOnWrite();
                                        aneg anegVar2 = (aneg) createBuilder.instance;
                                        anegVar2.b |= 1;
                                        anegVar2.d = j5;
                                        createBuilder.copyOnWrite();
                                        aneg anegVar3 = (aneg) createBuilder.instance;
                                        anegVar3.b |= 2;
                                        anegVar3.e = j6;
                                        ttaVar.a.e((aneg) createBuilder.build());
                                        O = anaf.O(null);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cls = cls2;
                                    }
                                }
                            }
                            arrayList.add(O);
                            if (tqdVar3.o.h()) {
                                tov tovVar4 = tqdVar3.d;
                                arrayList.add(anfq.i(tovVar4.d.d(), new tns(tovVar4, 5), tovVar4.h));
                            }
                            rwh.ar(tqdVar3.b, "gms_icing_mdd_manager_metadata", tqdVar3.m).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
                            return anaf.H(arrayList).a(gip.m, tqdVar3.n);
                        }
                    }, tqdVar2.n);
                }
            }, this.f);
        }
        if (c == 1) {
            return anfq.i(g(), new tlt(this, i), this.f);
        }
        if (c == 2) {
            return j(false);
        }
        if (c == 3) {
            return j(true);
        }
        int i2 = tsx.a;
        return anaf.N(new IllegalArgumentException(str.length() != 0 ? "Unknown task tag sent to MDD.handleTask() ".concat(str) : new String("Unknown task tag sent to MDD.handleTask() ")));
    }
}
