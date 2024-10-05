package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpq {
    public final azrw a;
    public final azrw b;

    public akpq(azrw azrwVar, azrw azrwVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    private static final agsv h(List list, List list2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            agnp agnpVar = (agnp) it.next();
            if (list.contains(agnpVar.f())) {
                hashSet.add(agnpVar.f());
            } else {
                arrayList2.add(agnpVar);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return new agsv(hashSet, arrayList, arrayList2);
    }

    public final akpp a(List list) {
        aaxn aaxnVar = (aaxn) this.a.get();
        aaxnVar.getClass();
        Executor executor = (Executor) this.b.get();
        executor.getClass();
        list.getClass();
        return new akpp(aaxnVar, executor, list, null, null);
    }

    public final akpi b(akpr akprVar) {
        akprVar.getClass();
        Executor executor = (Executor) this.a.get();
        executor.getClass();
        Executor executor2 = (Executor) this.b.get();
        executor2.getClass();
        return new akpi(akprVar, executor, executor2);
    }

    public final ajyd c(View view) {
        aahd aahdVar = (aahd) this.b.get();
        aahdVar.getClass();
        aoae aoaeVar = (aoae) this.a.get();
        view.getClass();
        return new ajyd(aahdVar, aoaeVar, view, null);
    }

    public final aijv d(afwx afwxVar, String str, long j) {
        aapf aapfVar = (aapf) this.a.get();
        aapfVar.getClass();
        Set set = (Set) this.b.get();
        set.getClass();
        return new aijv(aapfVar, set, afwxVar, str, j);
    }

    public final long e(String str, String str2, String str3) {
        agnv p = ((agil) this.b.get()).p(str);
        if (p == null || p.e) {
            return 0L;
        }
        Set t = ((agil) this.b.get()).t(str);
        if (!t.isEmpty() && (t.size() != 1 || str2 == null || !t.contains(str2))) {
            return 0L;
        }
        agil agilVar = (agil) this.b.get();
        zhq.m(str);
        Set g = agilVar.l.g(str);
        if (g.isEmpty() || (g.size() == 1 && str3 != null && g.contains(str3))) {
            return p.e();
        }
        return 0L;
    }

    public final boolean f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agnv p = ((agil) this.b.get()).p((String) it.next());
            if (p == null || !p.l.b()) {
                return false;
            }
        }
        return true;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, byte[] bArr, char[] cArr, byte[] bArr2) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, short[] sArr, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, char[] cArr, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, byte[] bArr, char[] cArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, short[] sArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, char[] cArr) {
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2, byte[] bArr) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public akpq(azrw azrwVar, azrw azrwVar2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public final agsr g(String str, String str2, List list, List list2, atrg atrgVar, byte[] bArr, boolean z, long j, atrx atrxVar, int i) {
        byte[] bArr2;
        Iterator it;
        int i2;
        PlayerResponseModel l;
        agsv agsvVar;
        amkq.E((str != null) ^ (str2 != null));
        String str3 = true != ammx.e(str) ? str : str2;
        str3.getClass();
        HashSet<String> hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        atrg atrgVar2 = atrg.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
        int ordinal = atrgVar.ordinal();
        long j2 = 0;
        if (ordinal == 2 || ordinal == 3) {
            agsv h = h(list, list2);
            agzx agzxVar = (agzx) this.a.get();
            int a = ahab.a(atrxVar, -1);
            if (a != -1) {
                long j3 = j;
                long j4 = 0;
                for (String str4 : h.b) {
                    long e = e(str4, str, str2);
                    j3 += e;
                    j4 -= e;
                    hashSet.add(str4);
                }
                if (j3 < 0) {
                    HashMap hashMap = new HashMap();
                    for (String str5 : h.a) {
                        hashMap.put(str5, Long.valueOf(e(str5, str, str2)));
                    }
                    ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
                    Collections.sort(arrayList3, unt.p);
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Map.Entry entry = (Map.Entry) arrayList3.get(i3);
                        if (j3 >= 0) {
                            break;
                        }
                        j3 += ((Long) entry.getValue()).longValue();
                        j4 -= ((Long) entry.getValue()).longValue();
                        hashSet.add((String) entry.getKey());
                    }
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = list2.iterator();
                long j5 = j3;
                long j6 = j4;
                while (it2.hasNext()) {
                    agnp agnpVar = (agnp) it2.next();
                    String f = agnpVar.f();
                    if (h.a.contains(f)) {
                        arrayList.add(agnpVar.f());
                    } else if (!hashSet2.contains(f)) {
                        if (true != z) {
                            bArr2 = bArr;
                            it = it2;
                            i2 = 2;
                        } else {
                            bArr2 = bArr;
                            it = it2;
                            i2 = 3;
                        }
                        try {
                            l = agzxVar.l(f, i2, bArr2);
                        } catch (aasx unused) {
                        }
                        if (agzx.i(l) && agzx.h(l)) {
                            agsvVar = h;
                            VideoStreamingData videoStreamingData = l.c;
                            boolean e2 = agzx.e(a);
                            FormatStreamModel k = agzxVar.k(a, Integer.MAX_VALUE, i, videoStreamingData, true, l.c());
                            FormatStreamModel k2 = e2 ? null : agzxVar.k(a, Integer.MAX_VALUE, i, videoStreamingData, false, l.c());
                            if (k != null && (e2 || k2 != null)) {
                                long j7 = k.j() + (k2 == null ? 0L : k2.j());
                                if (j5 >= j7) {
                                    j5 -= j7;
                                    j6 += j7;
                                    linkedHashSet.add(agnpVar);
                                    arrayList.add(f);
                                    hashSet2.add(f);
                                }
                            }
                            it2 = it;
                            h = agsvVar;
                        }
                        agsvVar = h;
                        it2 = it;
                        h = agsvVar;
                    } else {
                        arrayList.add(agnpVar.f());
                    }
                    it = it2;
                    agsvVar = h;
                    it2 = it;
                    h = agsvVar;
                }
                for (String str6 : hashSet) {
                    if (arrayList.contains(str6)) {
                        arrayList.removeAll(Collections.singleton(str6));
                    }
                }
                j2 = j6;
            }
        } else {
            agsv h2 = h(list, list2);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((agnp) it3.next()).f());
            }
            hashSet.addAll(h2.b);
            linkedHashSet.addAll(h2.c);
        }
        if (atrgVar == atrg.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE) {
            if (!f(arrayList)) {
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    agnv p = ((agil) this.b.get()).p((String) it4.next());
                    if (p != null && p.l == agnf.COMPLETE) {
                        it4.remove();
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                String str7 = (String) it5.next();
                if (!hashSet.contains(str7)) {
                    if (linkedHashMap.containsKey(str7)) {
                        linkedHashMap.put(str7, Integer.valueOf(((Integer) linkedHashMap.get(str7)).intValue() + 1));
                    } else {
                        linkedHashMap.put(str7, 1);
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str8 = (String) arrayList.get(i4);
                if (linkedHashMap2.containsKey(str8)) {
                    linkedHashMap2.put(str8, Integer.valueOf(((Integer) linkedHashMap2.get(str8)).intValue() + 1));
                } else {
                    linkedHashMap2.put(str8, 1);
                }
            }
            for (String str9 : linkedHashMap2.keySet()) {
                linkedHashMap.put(str9, Integer.valueOf(Math.max(linkedHashMap.containsKey(str9) ? ((Integer) linkedHashMap.get(str9)).intValue() : 0, ((Integer) linkedHashMap2.get(str9)).intValue())));
            }
            for (String str10 : linkedHashMap.keySet()) {
                for (int i5 = 0; i5 < ((Integer) linkedHashMap.get(str10)).intValue(); i5++) {
                    arrayList2.add(str10);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return new agsr(str3, hashSet, linkedHashSet, arrayList, null, j2);
        }
        return new agsr(str3, hashSet, linkedHashSet, arrayList, arrayList2, j2);
    }
}
