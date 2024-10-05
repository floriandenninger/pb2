package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agrl implements agrn {
    private final agro a;
    private final agrw b;
    private final shf c;
    private final SharedPreferences d;
    private final aaea e;
    private final aghr f;
    private final ypa g;

    public agrl(agro agroVar, agrw agrwVar, shf shfVar, SharedPreferences sharedPreferences, aaea aaeaVar, aghr aghrVar, ypa ypaVar) {
        this.a = agroVar;
        this.b = agrwVar;
        this.c = shfVar;
        this.d = sharedPreferences;
        this.e = aaeaVar;
        this.f = aghrVar;
        this.g = ypaVar;
    }

    private static int i(long j) {
        if (j < 0) {
            return Integer.MAX_VALUE;
        }
        return Math.max(1, (int) j);
    }

    private final int j(String str, agsn agsnVar, atqg atqgVar, long j) {
        atqgVar.getClass();
        agrk agrkVar = new agrk(atqgVar, j);
        this.d.edit().putString(yny.L("offline_refresh_continuation_token_%s", str), agrkVar.a).putLong(yny.L("offline_refresh_continuation_expiration_%s", str), agrkVar.b).apply();
        int i = atqgVar.c;
        if (i > this.f.d()) {
            this.a.e(str, i);
            String.format(Locale.US, "[Offline] Schedule deferred continuation in %d seconds", Integer.valueOf(i));
            return 0;
        }
        String.format(Locale.US, "[Offline] Schedule continuation in %d seconds", Integer.valueOf(i));
        if (i > 0) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(i));
            } catch (InterruptedException e) {
                zga.d("[Offline] Thread.sleep interrupted: ", e);
                return 1;
            }
        }
        return k(str, agsnVar, atqgVar.b, j);
    }

    private final int k(String str, agsn agsnVar, String str2, long j) {
        arxq arxqVar;
        zhq.m(str2);
        agrv a = this.b.a();
        str2.getClass();
        a.b = str2;
        try {
            arxp b = this.b.b(a);
            String.format(Locale.US, "[Offline] Offlined video set update count: %d", Integer.valueOf(b.d.size()));
            if ((b.b & 2) != 0) {
                arxqVar = b.e;
                if (arxqVar == null) {
                    arxqVar = arxq.a;
                }
            } else {
                arxqVar = null;
            }
            String.valueOf(String.valueOf(arxqVar)).length();
            if (b.d.size() > 0) {
                g(str, agsnVar, b.d, b.f, j);
            }
            arxq arxqVar2 = b.e;
            if (arxqVar2 == null) {
                arxqVar2 = arxq.a;
            }
            if ((1 & arxqVar2.b) == 0) {
                n(str);
                return 2;
            }
            arxq arxqVar3 = b.e;
            if (arxqVar3 == null) {
                arxqVar3 = arxq.a;
            }
            atqg atqgVar = arxqVar3.c;
            if (atqgVar == null) {
                atqgVar = atqg.a;
            }
            return j(str, agsnVar, atqgVar, j);
        } catch (aasx unused) {
            this.g.d(new agll());
            return 1;
        }
    }

    private final arxp l(Collection collection) {
        arxq arxqVar;
        yjk.e();
        agrv a = this.b.a();
        collection.getClass();
        a.a = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a.a.add((arxu) ((aone) it.next()).build());
        }
        arxp b = this.b.b(a);
        b.d.size();
        if ((b.b & 2) != 0) {
            arxqVar = b.e;
            if (arxqVar == null) {
                arxqVar = arxq.a;
            }
        } else {
            arxqVar = null;
        }
        String.valueOf(String.valueOf(arxqVar)).length();
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Collection m(defpackage.agsn r24, java.util.Set r25, long r26) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agrl.m(agsn, java.util.Set, long):java.util.Collection");
    }

    private final void n(String str) {
        this.d.edit().remove(yny.L("offline_refresh_continuation_token_%s", str)).remove(yny.L("offline_refresh_continuation_expiration_%s", str)).apply();
    }

    private final void o() {
        this.g.d(new agln());
    }

    private final void p(agsn agsnVar, List list, long j) {
        yjk.e();
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arxv arxvVar = (arxv) it.next();
            atqq atqqVar = arxvVar.b;
            if (atqqVar == null) {
                atqqVar = atqq.a;
            }
            for (arxw arxwVar : arxvVar.c) {
                String str = arxwVar.d;
                int bO = anaf.bO(atqqVar.h);
                if (bO == 0 || bO != 2) {
                    atqf atqfVar = atqf.OFFLINE_REFRESH_ACTION_UNKNOWN;
                    int bO2 = anaf.bO(atqqVar.h);
                    if (bO2 == 0) {
                        bO2 = 1;
                    }
                    int i = bO2 - 1;
                    if (i == 2) {
                        sb.append("DELETE");
                    } else if (i == 3) {
                        sb.append("DISABLE");
                    } else if (i == 4) {
                        sb.append("REFRESH");
                    } else if (i == 5) {
                        sb.append("REFRESH_AD");
                    } else if (i == 6) {
                        sb.append("DELETE_AD");
                    } else {
                        sb.append("UNEXPECTED_ACTION_");
                        sb.append((anaf.bO(atqqVar.h) != 0 ? r5 : 1) - 1);
                    }
                    sb.append(" video ");
                    sb.append(str);
                    sb.append("\n");
                }
                f(arxwVar, atqqVar, agsnVar, j, agsnVar.l().b(str));
            }
        }
        String valueOf = String.valueOf(sb.toString());
        if (valueOf.length() != 0) {
            "[Offline] Offline refresh results: ".concat(valueOf);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r1 == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if (r1 == 1) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e A[Catch: all -> 0x014b, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x003c, B:9:0x0043, B:13:0x005b, B:17:0x0060, B:19:0x0069, B:21:0x006f, B:24:0x0078, B:27:0x007f, B:33:0x0094, B:35:0x009a, B:37:0x00ae, B:38:0x00b0, B:40:0x00b4, B:43:0x00bb, B:44:0x00c0, B:46:0x00c6, B:48:0x00d0, B:50:0x00d7, B:51:0x00d4, B:54:0x00dd, B:77:0x00e9, B:56:0x0109, B:58:0x010e, B:60:0x0112, B:61:0x0114, B:63:0x0119, B:65:0x011d, B:66:0x011f, B:68:0x0123, B:69:0x0125, B:80:0x00fd, B:82:0x00da, B:83:0x013a, B:85:0x0140, B:88:0x0146), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.agrn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int a(java.lang.String r17, defpackage.agsn r18) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agrl.a(java.lang.String, agsn):int");
    }

    @Override // defpackage.agrn
    public final arxp b(agsn agsnVar, Set set, long j) {
        try {
            return l(m(agsnVar, set, j));
        } catch (aasx unused) {
            return null;
        }
    }

    @Override // defpackage.agrn
    public final arxp c(agsn agsnVar, Set set) {
        long c = this.c.c();
        arxp b = b(agsnVar, set, c);
        if (b == null) {
            return null;
        }
        p(agsnVar, b.d, c);
        return b;
    }

    @Override // defpackage.agrn
    public final synchronized void d(String str, agsn agsnVar) {
        yjk.e();
        n(str);
        this.d.edit().remove(yny.L("offline_refresh_video_ids_%s", str)).apply();
        this.a.h();
        HashSet hashSet = new HashSet();
        for (agnv agnvVar : agsnVar.m().j()) {
            if (agnvVar.p()) {
                hashSet.add(agnvVar.m());
            }
        }
        if (hashSet.isEmpty()) {
            o();
        } else {
            e(str, hashSet);
            this.a.d(str);
        }
    }

    final void e(String str, Set set) {
        this.d.edit().putStringSet(yny.L("offline_refresh_video_ids_%s", str), set).apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r5 != 5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.arxw r12, defpackage.atqq r13, defpackage.agsn r14, long r15, defpackage.agnu r17) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agrl.f(arxw, atqq, agsn, long, agnu):void");
    }

    final void g(String str, agsn agsnVar, List list, int i, long j) {
        p(agsnVar, list, j);
        if (i > 0) {
            this.a.f(str, i);
        }
    }

    protected final void h(agsn agsnVar, long j, atqq atqqVar, agnu agnuVar) {
        agst l = agsnVar.l();
        agnt c = agnuVar.c();
        c.b = atqqVar;
        c.d = j;
        if (l.k(c.a())) {
            this.g.d(new aglh(agnuVar.a));
        } else {
            String str = agnuVar.a;
            zga.b(str.length() != 0 ? "[Offline] UpdateVideoPolicy failed for video ".concat(str) : new String("[Offline] UpdateVideoPolicy failed for video "));
        }
    }
}
