package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyl implements adxr {
    public final amnv a;
    public amnv b;
    public final acpl c;
    final Map d;
    public final HashMap e;
    public HashMap f;
    public final afhs g;
    private final azrw h;
    private final afhe i;
    private final Map j;

    public adyl(amnv amnvVar, azrw azrwVar, afhe afheVar, adxo adxoVar, adyj adyjVar, acpl acplVar, afhs afhsVar) {
        advx advxVar = advx.e;
        this.a = amnvVar;
        this.h = azrwVar;
        this.b = advxVar;
        this.i = afheVar;
        this.c = acplVar;
        this.g = afhsVar;
        this.d = DesugarCollections.synchronizedMap(new adyk());
        this.j = amrz.l(0, adxoVar, 3, adyjVar);
        HashMap hashMap = new HashMap();
        if (afhsVar.C()) {
            Iterator it = ((phg) amnvVar.get()).g().iterator();
            while (it.hasNext()) {
                j(hashMap, (String) it.next());
            }
        }
        this.e = hashMap;
        this.f = u(advxVar, afhsVar);
    }

    public static void j(HashMap hashMap, String str) {
        String t = adyu.t(str);
        String s = adyu.s(str);
        HashMap hashMap2 = (HashMap) hashMap.get(t);
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            hashMap.put(t, hashMap2);
        }
        long p = adyu.p(str);
        if (!hashMap2.containsKey(s) || ((affp) hashMap2.get(s)).a < p) {
            new TreeSet();
            hashMap2.put(s, new affp(p, (byte[]) null));
        }
    }

    static final long l(adyb adybVar, long j) {
        int binarySearch = Arrays.binarySearch(adybVar.e(), j);
        if (binarySearch == -1) {
            return -1L;
        }
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        return adybVar.f()[binarySearch] + ((adybVar.d()[binarySearch] * (j - adybVar.e()[binarySearch])) / adybVar.c()[binarySearch]);
    }

    public static final String m(Set set, String str, String str2) {
        Iterator it = set.iterator();
        long j = Long.MIN_VALUE;
        String str3 = null;
        while (it.hasNext()) {
            for (String str4 : ((phg) it.next()).g()) {
                if (str4 != null && Objects.equals(str, adyu.t(str4)) && str2.equals(adyu.s(str4))) {
                    long p = adyu.p(str4);
                    if (str3 == null || p > j) {
                        str3 = str4;
                        j = p;
                    }
                }
            }
        }
        return str3;
    }

    public static final boolean n(Set set, String str, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((phg) it.next()).l(str, j, j2)) {
                return true;
            }
        }
        return false;
    }

    static final long o(adyb adybVar, long j) {
        int a = adybVar.a(j);
        return adybVar.e()[a] + ((adybVar.c()[a] * (j - adybVar.f()[a])) / adybVar.d()[a]);
    }

    private final String p(String str, String str2) {
        String i = i(str, str2, true);
        long p = i != null ? adyu.p(i) : Long.MIN_VALUE;
        String i2 = i(str, str2, false);
        return (i2 != null ? adyu.p(i2) : Long.MIN_VALUE) > p ? i2 : i;
    }

    private final Set q() {
        List list = (List) this.b.get();
        phg phgVar = (phg) this.a.get();
        if (list.isEmpty()) {
            if (phgVar != null) {
                return Collections.singleton(phgVar);
            }
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        if (phgVar != null) {
            hashSet.add(phgVar);
        }
        return hashSet;
    }

    private final boolean r(String str, String str2, long j, int i, int i2, int i3) {
        String m;
        adyb h;
        zhq.m(str);
        zhq.m(str2);
        for (int i4 = i2; i4 <= i3; i4++) {
            if (i4 == 1) {
                if (this.h.get() == null) {
                    continue;
                } else {
                    Set q = q();
                    if (this.g.C()) {
                        m = p(str, str2);
                    } else {
                        m = m(q, str, str2);
                    }
                    String str3 = m;
                    if (str3 != null && (h = h(q, str3)) != null) {
                        int a = h.a(j);
                        int min = Math.min(h.e().length - 1, a + i);
                        if (min >= a && min < h.e().length) {
                            long o = o(h, j);
                            if (n(q, str3, o, h.e()[min] - o)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                adxo adxoVar = (adxo) this.j.get(Integer.valueOf(i4));
                if (adxoVar != null && adxoVar.a(str, str2, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static adxp s(long j, int i) {
        return new adxp(j, i);
    }

    private static final adxp t(long j) {
        return new adxp(j, -1L, -1L, -1L);
    }

    private static HashMap u(amnv amnvVar, afhs afhsVar) {
        HashMap hashMap = new HashMap();
        if (afhsVar.C()) {
            Iterator it = amsx.p((Collection) amnvVar.get()).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((phg) it.next()).g().iterator();
                while (it2.hasNext()) {
                    j(hashMap, (String) it2.next());
                }
            }
        }
        return hashMap;
    }

    private static final adxp v(Set set, String str, adyb adybVar, long j, boolean z) {
        long j2 = j;
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            for (phl phlVar : ((phg) it.next()).f(str)) {
                adxq adxqVar = new adxq(l(adybVar, phlVar.b), l(adybVar, phlVar.b + phlVar.c));
                adxq adxqVar2 = new adxq(adxqVar.a, adxqVar.b);
                long j3 = adxqVar.b;
                TreeSet treeSet2 = new TreeSet((SortedSet) treeSet.subSet(adxqVar2, true, new adxq(j3, j3), true));
                if (!treeSet2.isEmpty() && ((adxq) treeSet2.last()).b > adxqVar.b) {
                    treeSet2.remove(treeSet2.last());
                }
                treeSet.removeAll(treeSet2);
                adxq adxqVar3 = (adxq) treeSet.floor(adxqVar);
                adxq adxqVar4 = (adxq) treeSet.ceiling(adxqVar);
                boolean z2 = adxqVar3 != null && adxqVar3.a(adxqVar);
                if (!adxqVar.a(adxqVar4) || adxqVar4 == null) {
                    if (!z2) {
                        treeSet.add(adxqVar);
                    } else {
                        adxqVar3.b = Math.max(adxqVar.b, adxqVar3.b);
                    }
                } else if (!z2) {
                    adxqVar.b = Math.max(adxqVar.b, adxqVar4.b);
                    treeSet.add(adxqVar);
                    if (!adxqVar.equals(adxqVar4)) {
                        treeSet.remove(adxqVar4);
                    }
                } else {
                    adxqVar3.b = Math.max(adxqVar.b, adxqVar4.b);
                    if (!adxqVar3.equals(adxqVar4)) {
                        treeSet.remove(adxqVar4);
                    }
                }
            }
        }
        adxq adxqVar5 = new adxq(j2, 2147483647L);
        adxq adxqVar6 = (adxq) treeSet.floor(adxqVar5);
        if (adxqVar6 == null || j2 >= adxqVar6.b) {
            adxqVar6 = (adxq) treeSet.higher(adxqVar5);
            if (!z || adxqVar6 == null) {
                return new adxp(j, o(adybVar, j), 0L, -1L);
            }
            j2 = adxqVar6.a;
        }
        long j4 = j2;
        int a = adybVar.a(adxqVar6.b);
        if (a != adybVar.a.a - 1 || adxqVar6.b != adybVar.f()[a] + adybVar.d()[a]) {
            long o = o(adybVar, j4);
            long j5 = adxqVar6.b;
            return new adxp(j4, o, j5, o(adybVar, j5));
        }
        return new adxp(j4, o(adybVar, j4), Long.MAX_VALUE, o(adybVar, adxqVar6.b));
    }

    @Override // defpackage.adxr
    public final long a(FormatStreamModel formatStreamModel, long j) {
        adxp adxpVar;
        String m;
        if (formatStreamModel.N()) {
            String str = formatStreamModel.b;
            if (!TextUtils.isEmpty(str)) {
                adxpVar = c(str, formatStreamModel.e, j, false);
            } else {
                adxpVar = s(j, 2);
            }
        } else {
            adxpVar = null;
        }
        if (adxpVar == null || adxpVar.c == -1) {
            String str2 = formatStreamModel.b;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = formatStreamModel.e;
                long j2 = formatStreamModel.j();
                long micros = TimeUnit.MILLISECONDS.toMicros(formatStreamModel.c);
                zhq.m(str2);
                zhq.m(str3);
                if (this.h.get() == null) {
                    adxpVar = t(j);
                } else {
                    adyb a = ((adyc) this.h.get()).a(j2, micros);
                    if (a == null) {
                        adxpVar = t(j);
                    } else {
                        Set q = q();
                        if (this.g.C()) {
                            m = p(str2, str3);
                        } else {
                            m = m(q, str2, str3);
                        }
                        String str4 = m;
                        if (str4 == null) {
                            adxpVar = t(j);
                        } else {
                            adxpVar = v(q, str4, a, j, false);
                        }
                    }
                }
            } else {
                adxpVar = t(j);
            }
        }
        long j3 = adxpVar.c;
        return j3 == Long.MAX_VALUE ? TimeUnit.MILLISECONDS.toMicros(formatStreamModel.c) : j3;
    }

    @Override // defpackage.adxr
    public final adxp b(FormatStreamModel formatStreamModel, long j) {
        String m;
        String str = formatStreamModel.b;
        if (!TextUtils.isEmpty(str)) {
            zhq.m(formatStreamModel.e);
            if (this.h.get() == null) {
                return t(j);
            }
            amsx p = amsx.p((Collection) this.b.get());
            if (!this.g.C()) {
                m = m(p, str, formatStreamModel.e);
            } else {
                m = i(str, formatStreamModel.e, true);
            }
            String str2 = m;
            if (str2 == null) {
                return t(j);
            }
            adyb h = h(p, str2);
            return h == null ? t(j) : v(p, str2, h, j, false);
        }
        return t(j);
    }

    @Override // defpackage.adxr
    public final adxp c(String str, String str2, long j, boolean z) {
        String m;
        zhq.m(str);
        zhq.m(str2);
        if (this.h.get() == null) {
            return s(j, 3);
        }
        Set q = q();
        if (this.g.C()) {
            m = p(str, str2);
        } else {
            m = m(q, str, str2);
        }
        String str3 = m;
        if (str3 == null) {
            return s(j, 4);
        }
        adyb h = h(q, str3);
        return h == null ? s(j, 5) : v(q, str3, h, j, z);
    }

    @Override // defpackage.adxr
    public final void d(amnv amnvVar) {
        if (this.g.C()) {
            this.f.clear();
            this.f = u(amnvVar, this.g);
        }
        afki.a(amnvVar);
        this.b = amnvVar;
    }

    @Override // defpackage.adxr
    public final boolean e(String str, String str2, long j, int i, int i2, int i3) {
        return r(str, str2, j, i, i2, i3);
    }

    @Override // defpackage.adxr
    public final boolean f(FormatStreamModel formatStreamModel) {
        String m;
        adyb h;
        amsx p = amsx.p((Collection) this.b.get());
        if (!this.g.C()) {
            m = m(p, formatStreamModel.b, formatStreamModel.e);
        } else {
            m = i(formatStreamModel.b, formatStreamModel.e, true);
        }
        String str = m;
        if (str == null || (h = h(p, str)) == null) {
            return false;
        }
        int length = h.e().length - 1;
        return n(p, str, 0L, ((int) h.e()[length]) + h.c()[length]);
    }

    @Override // defpackage.adxr
    public final boolean g(String str, int i, String str2, long j, int i2) {
        return r(str, ozv.b(i, str2), j, 1, i2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.adyb h(java.util.Set r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adyl.h(java.util.Set, java.lang.String):adyb");
    }

    public final String i(String str, String str2, boolean z) {
        HashMap hashMap;
        affp affpVar;
        if (str == null) {
            return null;
        }
        if (z) {
            hashMap = this.f;
        } else {
            hashMap = this.e;
        }
        HashMap hashMap2 = (HashMap) hashMap.get(str);
        if (hashMap2 == null || (affpVar = (affp) hashMap2.get(str2)) == null) {
            return null;
        }
        return adyu.q(str, str2, affpVar.a);
    }

    public final void k() {
        phg phgVar = (phg) this.a.get();
        if (phgVar == null) {
            return;
        }
        Iterator it = phgVar.g().iterator();
        while (it.hasNext()) {
            muf.L(phgVar, (String) it.next());
        }
        if (this.g.C()) {
            this.e.clear();
        }
    }
}
