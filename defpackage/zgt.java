package defpackage;

import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zgt extends AbstractMap implements Map {
    public zgr[] a;
    public volatile int b;
    private final ReferenceQueue c;
    private int d;
    private final int e;
    private int f;
    private Set g;
    private Collection h;
    private final yoz i;

    public zgt(yoz yozVar) {
        amkq.F(true, "capacity < 0: 256");
        this.i = yozVar;
        this.d = 0;
        this.a = new zgr[256];
        this.e = 7500;
        d();
        this.c = new ReferenceQueue();
    }

    public static int a(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode + ((hashCode << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    private final void d() {
        this.f = (int) ((this.a.length * this.e) / 10000);
    }

    private final void e() {
        HashSet hashSet = null;
        while (true) {
            zgr zgrVar = (zgr) this.c.poll();
            if (zgrVar == null) {
                break;
            }
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            hashSet.add(Pair.create(zgrVar, zgrVar.c));
            c(zgrVar);
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        yoz yozVar = this.i;
        yozVar.a.d.writeLock().lock();
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) ((Pair) it.next()).second;
                if (set != null && !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        yozVar.a.n((ypc) it2.next());
                    }
                }
            }
        } finally {
            yozVar.a.d.writeLock().unlock();
        }
    }

    public final zgr b(Object obj) {
        e();
        if (obj != null) {
            int a = a(obj);
            zgr[] zgrVarArr = this.a;
            for (zgr zgrVar = zgrVarArr[(a & Integer.MAX_VALUE) % zgrVarArr.length]; zgrVar != null; zgrVar = zgrVar.d) {
                if (obj.equals(zgrVar.get())) {
                    return zgrVar;
                }
            }
            return null;
        }
        for (zgr zgrVar2 = this.a[0]; zgrVar2 != null; zgrVar2 = zgrVar2.d) {
            if (zgrVar2.b) {
                return zgrVar2;
            }
        }
        return null;
    }

    public final void c(zgr zgrVar) {
        int i = zgrVar.a;
        zgr[] zgrVarArr = this.a;
        int length = (i & Integer.MAX_VALUE) % zgrVarArr.length;
        zgr zgrVar2 = null;
        for (zgr zgrVar3 = zgrVarArr[length]; zgrVar3 != null; zgrVar3 = zgrVar3.d) {
            if (zgrVar == zgrVar3) {
                this.b++;
                if (zgrVar2 == null) {
                    this.a[length] = zgrVar3.d;
                } else {
                    zgrVar2.d = zgrVar3.d;
                }
                this.d--;
                return;
            }
            zgrVar2 = zgrVar3;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.d > 0) {
            this.d = 0;
            Arrays.fill(this.a, (Object) null);
            this.b++;
            do {
            } while (this.c.poll() != null);
        }
    }

    @Override // java.util.AbstractMap
    protected final Object clone() {
        zgt zgtVar = (zgt) super.clone();
        zgtVar.g = null;
        zgtVar.h = null;
        return zgtVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        e();
        if (obj != null) {
            int length = this.a.length;
            while (true) {
                length--;
                if (length < 0) {
                    return false;
                }
                for (zgr zgrVar = this.a[length]; zgrVar != null; zgrVar = zgrVar.d) {
                    if ((zgrVar.get() != null || zgrVar.b) && obj.equals(zgrVar.c)) {
                        return true;
                    }
                }
            }
        } else {
            int length2 = this.a.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    return false;
                }
                for (zgr zgrVar2 = this.a[length2]; zgrVar2 != null; zgrVar2 = zgrVar2.d) {
                    if ((zgrVar2.get() != null || zgrVar2.b) && zgrVar2.c == null) {
                        return true;
                    }
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e();
        return new zgm(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        e();
        if (obj != null) {
            int a = a(obj);
            zgr[] zgrVarArr = this.a;
            for (zgr zgrVar = zgrVarArr[(a & Integer.MAX_VALUE) % zgrVarArr.length]; zgrVar != null; zgrVar = zgrVar.d) {
                if (obj.equals(zgrVar.get())) {
                    return zgrVar.c;
                }
            }
            return null;
        }
        for (zgr zgrVar2 = this.a[0]; zgrVar2 != null; zgrVar2 = zgrVar2.d) {
            if (zgrVar2.b) {
                return zgrVar2.c;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        e();
        if (this.g == null) {
            this.g = new zgn(this);
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zgr zgrVar;
        int i;
        e();
        int i2 = 0;
        if (obj != null) {
            int a = a(obj);
            zgr[] zgrVarArr = this.a;
            i = (a & Integer.MAX_VALUE) % zgrVarArr.length;
            zgrVar = zgrVarArr[i];
            while (zgrVar != null && !obj.equals(zgrVar.get())) {
                zgrVar = zgrVar.d;
            }
        } else {
            zgrVar = this.a[0];
            while (zgrVar != null && !zgrVar.b) {
                zgrVar = zgrVar.d;
            }
            i = 0;
        }
        if (zgrVar == null) {
            this.b++;
            int i3 = this.d + 1;
            this.d = i3;
            if (i3 > this.f) {
                int length = this.a.length;
                int i4 = length + length;
                int i5 = i4 != 0 ? i4 : 1;
                zgr[] zgrVarArr2 = new zgr[i5];
                int i6 = 0;
                while (true) {
                    zgr[] zgrVarArr3 = this.a;
                    if (i6 >= zgrVarArr3.length) {
                        break;
                    }
                    zgr zgrVar2 = zgrVarArr3[i6];
                    while (zgrVar2 != null) {
                        int i7 = zgrVar2.b ? 0 : (zgrVar2.a & Integer.MAX_VALUE) % i5;
                        zgr zgrVar3 = zgrVar2.d;
                        zgrVar2.d = zgrVarArr2[i7];
                        zgrVarArr2[i7] = zgrVar2;
                        zgrVar2 = zgrVar3;
                    }
                    i6++;
                }
                this.a = zgrVarArr2;
                d();
                if (obj != null) {
                    i2 = (Integer.MAX_VALUE & a(obj)) % this.a.length;
                }
            } else {
                i2 = i;
            }
            zgr zgrVar4 = new zgr(obj, obj2, this.c);
            zgr[] zgrVarArr4 = this.a;
            zgrVar4.d = zgrVarArr4[i2];
            zgrVarArr4[i2] = zgrVar4;
            return null;
        }
        Object obj3 = zgrVar.c;
        zgrVar.c = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (map.entrySet() != null) {
            super.putAll(map);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zgr zgrVar;
        zgr zgrVar2;
        e();
        int i = 0;
        if (obj != null) {
            int a = a(obj);
            zgr[] zgrVarArr = this.a;
            i = (a & Integer.MAX_VALUE) % zgrVarArr.length;
            zgrVar = zgrVarArr[i];
            zgrVar2 = null;
            while (zgrVar != null && !obj.equals(zgrVar.get())) {
                zgrVar2 = zgrVar;
                zgrVar = zgrVar.d;
            }
        } else {
            zgrVar = this.a[0];
            zgrVar2 = null;
            while (zgrVar != null && !zgrVar.b) {
                zgrVar2 = zgrVar;
                zgrVar = zgrVar.d;
            }
        }
        if (zgrVar == null) {
            return null;
        }
        this.b++;
        if (zgrVar2 == null) {
            this.a[i] = zgrVar.d;
        } else {
            zgrVar2.d = zgrVar.d;
        }
        this.d--;
        return zgrVar.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        e();
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e();
        if (this.h == null) {
            this.h = new zgp(this);
        }
        return this.h;
    }
}
