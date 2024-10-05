package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajbv {
    public final long a;
    public final List b;
    public final WeakReference c;
    public boolean d;
    public final Map e;
    public ajbu f;
    public long g;
    public long h;
    public final String i;
    private long j;
    private final Map k;
    private final amml l;
    private final TreeMap m;
    private ajbu n;
    private ajbu o;

    private ajbv(long j, long j2, aixu aixuVar, amml ammlVar, boolean z, String str, ajbu ajbuVar, ajbu... ajbuVarArr) {
        this.h = 0L;
        this.a = j;
        this.j = j2;
        this.c = new WeakReference(aixuVar);
        this.l = ammlVar;
        this.k = new HashMap();
        this.b = new ArrayList();
        this.d = z;
        this.f = ajbuVar;
        for (ajbu ajbuVar2 : ajbuVarArr) {
            this.b.add(ajbuVar2);
            this.k.put(ajbuVar2.e, ajbuVar2);
            ajbuVar2.c = this;
            this.k.put(ajbuVar2.e, ajbuVar2);
            if (ajbuVar != null) {
                this.g += ajbuVar2.b;
            }
        }
        this.g -= j2 - j;
        this.n = this.b.isEmpty() ? null : (ajbu) this.b.get(0);
        this.m = new TreeMap();
        this.e = new HashMap();
        this.i = str;
    }

    private static Pair D(ajbv ajbvVar, long j) {
        TreeMap treeMap = ajbvVar.m;
        Long valueOf = Long.valueOf(j);
        Map.Entry floorEntry = treeMap.floorEntry(valueOf);
        if (floorEntry == null) {
            ajbu ajbuVar = ajbvVar.n;
            if (ajbuVar != null) {
                return new Pair(valueOf, ajbuVar);
            }
            return null;
        }
        ajbv ajbvVar2 = (ajbv) floorEntry.getValue();
        long longValue = ((Long) floorEntry.getKey()).longValue();
        long j2 = j - longValue;
        long j3 = ajbvVar2.j;
        if (longValue != ajbvVar2.h + j3 + ajbvVar2.g || ajbvVar2.f == null) {
            for (ajbu ajbuVar2 : ajbvVar2.b) {
                long j4 = ajbuVar2.b;
                if (j4 > j2) {
                    return new Pair(Long.valueOf(j2), ajbuVar2);
                }
                j2 -= j4;
            }
            if (ajbvVar.n == null) {
                return null;
            }
            return new Pair(Long.valueOf(j), ajbvVar.n);
        }
        return new Pair(Long.valueOf(j3 + j2), ajbvVar2.f);
    }

    private static Pair E(ajbv ajbvVar, String str, long j) {
        ajbu d = ajbvVar.d(str);
        return (str == null || d == null) ? D(ajbvVar, j) : new Pair(Long.valueOf(j), d);
    }

    public static List s(ajbv ajbvVar, String str, long j, long j2) {
        long longValue;
        ajbt a;
        Map.Entry entry;
        ajbt b;
        ajbu ajbuVar;
        ArrayList arrayList = new ArrayList();
        synchronized (ajbvVar) {
            if (ajbvVar.g() && (str == null || ajbvVar.d(str) != null)) {
                ajbu ajbuVar2 = ajbvVar.n;
                if (ajbuVar2 == null || !ajbuVar2.d()) {
                    Pair E = E(ajbvVar, str, j);
                    longValue = E != null ? ((Long) E.first).longValue() : j;
                    ajbuVar2 = E != null ? (ajbu) E.second : null;
                } else {
                    if (str != null && ajbvVar.d(str) != null) {
                        ajbuVar2 = ajbvVar.d(str);
                    }
                    longValue = j;
                }
                HashSet hashSet = new HashSet();
                long j3 = longValue;
                long j4 = j2;
                while (j4 > 0 && ajbuVar2 != null) {
                    if (ajbuVar2.d() || ajbuVar2.a.isEmpty()) {
                        entry = null;
                    } else {
                        entry = ajbuVar2.a.ceilingEntry(Long.valueOf(j3));
                        if (entry != null && hashSet.contains(entry.getValue())) {
                            entry = ajbuVar2.a.ceilingEntry(Long.valueOf(1 + j3));
                        }
                    }
                    if (entry == null) {
                        ajbt a2 = ajbuVar2.b - j3 > 0 ? ajbuVar2.a(j3) : null;
                        ajbv ajbvVar2 = ajbuVar2.c;
                        if (ajbvVar2 == null) {
                            j4 = 0;
                        } else {
                            if (ajbvVar2.z(ajbuVar2.e)) {
                                long j5 = j4;
                                if (ajbvVar2.j == ajbvVar2.a) {
                                    hashSet.add(ajbvVar2);
                                }
                                ajbuVar = ajbvVar2.f;
                                if (ajbuVar != null) {
                                    j3 = ajbvVar2.j;
                                    b = a2;
                                    j4 = j5;
                                } else {
                                    ajbuVar = ajbuVar2;
                                    j4 = 0;
                                }
                            } else {
                                j4 = j4;
                                ajbuVar = ajbvVar2.q(ajbuVar2.e);
                                j3 = 0;
                            }
                            b = a2;
                        }
                    } else {
                        b = ((Long) entry.getKey()).longValue() - j3 > 0 ? ajbuVar2.b(j3, ((Long) entry.getKey()).longValue()) : null;
                        ajbuVar = ((ajbv) entry.getValue()).n;
                        j3 = 0;
                    }
                    if (b != null) {
                        j4 -= b.b - b.a;
                        arrayList.add(b);
                    }
                    ajbuVar2 = ajbuVar;
                }
                if (arrayList.isEmpty() && ajbuVar2 != null && (a = ajbuVar2.a(ajbuVar2.b)) != null) {
                    arrayList.add(a);
                }
                if (!arrayList.isEmpty()) {
                    ajbvVar.o = ajbvVar.d(((ajbt) arrayList.get(arrayList.size() - 1)).b());
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    public final synchronized boolean A(long j, long j2) {
        List s = s(this, null, j, 1L);
        List s2 = s(this, null, j2, 1L);
        if (!s.isEmpty() && !s2.isEmpty()) {
            if (((ajbt) s.get(0)).equals(s2.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void B(ajbu ajbuVar) {
        if (this.k.containsKey(ajbuVar.e)) {
            return;
        }
        if (ajbuVar.c != this) {
            return;
        }
        if (this.b.isEmpty()) {
            this.n = ajbuVar;
        }
        this.b.add(ajbuVar);
        this.k.put(ajbuVar.e, ajbuVar);
    }

    public final synchronized void C(long j, long j2, String str, ajbu... ajbuVarArr) {
        ajbu ajbuVar = this.n;
        aixu aixuVar = (aixu) this.c.get();
        if (ajbuVar == null || (ajbuVarArr.length) == 0 || aixuVar == null) {
            return;
        }
        for (ajbu ajbuVar2 : ajbuVarArr) {
            if (this.k.containsKey(ajbuVar2.e)) {
                return;
            }
        }
        Map.Entry floorEntry = ajbuVar.a.floorEntry(Long.valueOf(j));
        Map.Entry floorEntry2 = ajbuVar.a.floorEntry(Long.valueOf(j2));
        ajbv ajbvVar = null;
        ajbv ajbvVar2 = floorEntry == null ? null : (ajbv) floorEntry.getValue();
        if (floorEntry2 != null) {
            ajbvVar = (ajbv) floorEntry2.getValue();
        }
        if (!(ajbvVar2 != null && ajbvVar == ajbvVar2 && ajbvVar2.f(j) && ajbvVar.f(j2)) && ((ajbvVar2 == null || !ajbvVar2.f(j)) && ((ajbvVar == null || !ajbvVar.f(j2)) && ((ajbvVar2 != null || ajbvVar == null) && (ajbvVar2 == null || ajbvVar2 == ajbvVar))))) {
            ajbv ajbvVar3 = new ajbv(j, j2, aixuVar, this.l, this.d, str, ajbuVar, ajbuVarArr);
            ajbvVar3.f = ajbuVar;
            ajbuVar.a.put(Long.valueOf(ajbvVar3.a), ajbvVar3);
            for (ajbu ajbuVar3 : ajbuVarArr) {
                this.k.put(ajbuVar3.e, ajbuVar3);
            }
            if (this.d) {
                Map.Entry floorEntry3 = ajbuVar.a.floorEntry(Long.valueOf(j - 1));
                if (floorEntry3 != null) {
                    ajbvVar3.h = ((ajbv) floorEntry3.getValue()).h + ((ajbv) floorEntry3.getValue()).g;
                }
                if (ajbvVar3.g != 0) {
                    for (ajbv ajbvVar4 : ajbuVar.a.tailMap(Long.valueOf(j)).values()) {
                        if (ajbvVar4 != ajbvVar3) {
                            w(ajbvVar4);
                            ajbvVar4.h += ajbvVar3.g;
                            v(ajbvVar4);
                        }
                    }
                }
                v(ajbvVar3);
            }
        }
    }

    public synchronized long a(String str, long j) {
        ajbu ajbuVar;
        ajbu d = d(str);
        if (d != null) {
            ajbv ajbvVar = d.c;
            if (ajbvVar.d) {
                if (ajbvVar == null || ajbvVar.f == null) {
                    ajbu ajbuVar2 = this.n;
                    if (ajbuVar2 != null) {
                        long j2 = ajbuVar2.b;
                        if (j2 < j) {
                            j = j2;
                        }
                    }
                    ajbu ajbuVar3 = ajbvVar.n;
                    Map.Entry floorEntry = ajbuVar3 != null ? ajbuVar3.a.floorEntry(Long.valueOf(j)) : null;
                    if (floorEntry != null) {
                        if (((ajbv) floorEntry.getValue()).j <= j) {
                            j += ((ajbv) floorEntry.getValue()).g;
                        }
                        j += ((ajbv) floorEntry.getValue()).h;
                    }
                } else {
                    while (ajbvVar != null && ajbvVar.f != null && ajbvVar.d) {
                        Iterator it = ajbvVar.b.iterator();
                        while (it.hasNext() && (ajbuVar = (ajbu) it.next()) != d) {
                            j += ajbuVar.b;
                        }
                        j += ajbvVar.a + ajbvVar.h;
                        ajbu ajbuVar4 = ajbvVar.f;
                        ajbvVar = ajbuVar4 != null ? ajbuVar4.c : null;
                    }
                }
            }
        }
        return j;
    }

    public synchronized long b(long j) {
        Pair D = D(this, j);
        if (D == null) {
            return j;
        }
        return ((Long) D.first).longValue();
    }

    public synchronized ajbu c(final PlayerResponseModel playerResponseModel, final String str, long j, final int i) {
        return new ajbu(this, new zih() { // from class: ajbs
            @Override // defpackage.zih
            public final Object a() {
                ajbv ajbvVar = ajbv.this;
                String str2 = str;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                int i2 = i;
                aixu aixuVar = (aixu) ajbvVar.c.get();
                if (aixuVar != null) {
                    return aixuVar.i(str2, playerResponseModel2, i2);
                }
                return null;
            }
        }, j, str, playerResponseModel);
    }

    public synchronized ajbu d(String str) {
        if (str == null) {
            return null;
        }
        return (ajbu) this.k.get(str);
    }

    public synchronized List e(String str) {
        ajbv ajbvVar;
        ajbu ajbuVar;
        ajbu ajbuVar2 = (ajbu) this.k.get(str);
        ArrayList arrayList = new ArrayList();
        if (ajbuVar2 == null) {
            return arrayList;
        }
        arrayList.add(str);
        Iterator it = ajbuVar2.a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((ajbv) it.next()).k.keySet());
        }
        for (ajbv ajbvVar2 = ajbuVar2.c; ajbvVar2 != null; ajbvVar2 = ajbvVar2.r()) {
            ajbvVar2.k.keySet().removeAll(arrayList);
        }
        ajbuVar2.c.b.remove(ajbuVar2);
        ajbv ajbvVar3 = ajbuVar2.c;
        if (ajbvVar3.n == ajbuVar2) {
            ajbvVar3.n = (ajbu) amkq.bi(ajbvVar3.b, null);
        }
        boolean z = false;
        if (ajbuVar2.c.b.isEmpty() && (ajbuVar = (ajbvVar = ajbuVar2.c).f) != null) {
            ajbuVar.a.remove(Long.valueOf(ajbvVar.a));
            z = true;
        }
        ajbu ajbuVar3 = this.n;
        if (this.d && ajbuVar3 != null) {
            ajbv ajbvVar4 = ajbuVar2.c;
            long j = ajbvVar4.g;
            if (z) {
                w(ajbvVar4);
            } else {
                j = ajbuVar2.b;
            }
            if (j != 0) {
                for (ajbv ajbvVar5 : ajbuVar3.a.tailMap(Long.valueOf(this.a)).values()) {
                    w(ajbvVar5);
                    if (ajbvVar5 == ajbuVar2.c) {
                        ajbvVar5.g -= j;
                    } else {
                        ajbvVar5.h -= j;
                    }
                    v(ajbvVar5);
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean f(long j) {
        boolean z;
        if (this.a <= j) {
            z = j < this.j;
        }
        return z;
    }

    public synchronized boolean g() {
        return !this.b.isEmpty();
    }

    public synchronized boolean h(String str) {
        boolean z;
        ajbu ajbuVar = this.o;
        if (i() && ajbuVar != null) {
            z = TextUtils.equals(ajbuVar.e, str);
        }
        return z;
    }

    public synchronized boolean i() {
        return this.o != null;
    }

    public synchronized void j() {
        this.d = true;
    }

    public final synchronized long k(long j) {
        ajbu ajbuVar = this.n;
        if (ajbuVar == null || !ajbuVar.d()) {
            return b(j);
        }
        long j2 = this.n.b;
        return j2 < j ? j2 : j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aixt, java.lang.Object] */
    public final synchronized aixx l(aixx aixxVar, String str) {
        ajbu ajbuVar = this.n;
        if (ajbuVar != null && d(str) != null) {
            ?? a = ajbuVar.d.a();
            if (a == 0) {
                return aixxVar;
            }
            aixv aixvVar = new aixv(a.c());
            long a2 = a(str, aixxVar.g());
            aixvVar.b += a2 - aixvVar.a;
            aixvVar.a = a2;
            if (a2 > aixvVar.d) {
                aixvVar.d = a2;
            }
            return aixvVar;
        }
        return aixxVar;
    }

    public final synchronized ajbu m(PlayerResponseModel playerResponseModel, String str, int i) {
        long j;
        j = Long.MAX_VALUE;
        if (!playerResponseModel.C() && !playerResponseModel.E()) {
            j = TimeUnit.SECONDS.toMillis(playerResponseModel.a());
        }
        return c(playerResponseModel, str, j, i);
    }

    public final ajbu n(long j) {
        ajbv ajbvVar;
        ajbu ajbuVar = this.n;
        if (ajbuVar != null && ajbuVar.d()) {
            Pair D = D(this, j);
            ajbu ajbuVar2 = D != null ? (ajbu) D.second : null;
            if (ajbuVar2 != null && (ajbvVar = ajbuVar2.c) != null && ajbvVar != this && ajbvVar.f != null) {
                return ajbuVar2;
            }
        }
        return null;
    }

    public final synchronized ajbu o() {
        return (ajbu) this.b.get(0);
    }

    public final synchronized ajbu p(String str, long j) {
        Map.Entry ceilingEntry;
        Pair E = E(this, str, j);
        if (E == null || (ceilingEntry = ((ajbu) E.second).a.ceilingEntry(Long.valueOf(j))) == null) {
            return q(str);
        }
        return ((ajbv) ceilingEntry.getValue()).n;
    }

    public final synchronized ajbu q(String str) {
        if (!z(str) && this.k.get(str) != null) {
            List list = this.b;
            return (ajbu) list.get(list.indexOf(this.k.get(str)) + 1);
        }
        return null;
    }

    public final ajbv r() {
        ajbu ajbuVar = this.f;
        if (ajbuVar != null) {
            return ajbuVar.c;
        }
        return null;
    }

    public final synchronized List t(ajbu ajbuVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (ajbu ajbuVar2 : this.b) {
            if (z) {
                arrayList2.add(ajbuVar2.e);
            } else if (ajbuVar2 == ajbuVar) {
                z = true;
            }
        }
        arrayList = new ArrayList();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(e((String) arrayList2.get(i)));
        }
        return arrayList;
    }

    public final synchronized List u() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        this.m.clear();
        this.e.clear();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(((ajbu) it.next()).e);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e((String) arrayList.get(i));
        }
        this.n = null;
        this.o = null;
        return arrayList;
    }

    public final void v(ajbv ajbvVar) {
        this.m.put(Long.valueOf(ajbvVar.a + ajbvVar.h), ajbvVar);
        this.m.put(Long.valueOf(ajbvVar.j + ajbvVar.h + ajbvVar.g), ajbvVar);
        String str = ajbvVar.i;
        if (str != null) {
            this.e.put(str, ajbvVar);
        }
    }

    public final void w(ajbv ajbvVar) {
        this.m.remove(Long.valueOf(ajbvVar.a + ajbvVar.h));
        this.m.remove(Long.valueOf(ajbvVar.j + ajbvVar.h + ajbvVar.g));
        String str = ajbvVar.i;
        if (str != null) {
            this.e.remove(str);
        }
    }

    public final synchronized void x() {
        this.l.apply(null);
    }

    public final synchronized boolean y() {
        boolean z;
        ajbu ajbuVar = this.n;
        if (ajbuVar != null) {
            z = ajbuVar.a.isEmpty() ? false : true;
        }
        return z;
    }

    public final synchronized boolean z(String str) {
        boolean z;
        if (g()) {
            z = TextUtils.equals(((ajbu) amkq.bj(this.b)).e, str);
        }
        return z;
    }

    public ajbv(aixu aixuVar, amml ammlVar) {
        this(0L, 0L, aixuVar, ammlVar, false, null, null, new ajbu[0]);
    }
}
