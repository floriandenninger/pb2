package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amrz implements Map, Serializable, j$.util.Map {
    public static final /* synthetic */ int a = 0;
    private transient amsx b;
    private transient amsx c;
    private transient amrl d;

    public static amrw h() {
        return new amrw();
    }

    public static amrw i(int i) {
        amkq.t(i, "expectedSize");
        return new amrw(i);
    }

    public static amrz j(Map map) {
        if (!(map instanceof amrz) || (map instanceof SortedMap)) {
            Set entrySet = map.entrySet();
            amrw amrwVar = new amrw(entrySet instanceof Collection ? entrySet.size() : 4);
            amrwVar.h(entrySet);
            return amrwVar.c();
        }
        amrz amrzVar = (amrz) map;
        amrzVar.sa();
        return amrzVar;
    }

    public static amrz k(Object obj, Object obj2) {
        amkq.r(obj, obj2);
        return amvo.a(1, new Object[]{obj, obj2});
    }

    public static amrz l(Object obj, Object obj2, Object obj3, Object obj4) {
        amkq.r(obj, obj2);
        amkq.r(obj3, obj4);
        return amvo.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static amrz m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        amkq.r(obj, obj2);
        amkq.r(obj3, obj4);
        amkq.r(obj5, obj6);
        return amvo.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static amrz n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        amkq.r(obj, obj2);
        amkq.r(obj3, obj4);
        amkq.r(obj5, obj6);
        amkq.r(obj7, obj8);
        return amvo.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static amrz o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        amkq.r(obj, obj2);
        amkq.r(obj3, obj4);
        amkq.r(obj5, obj6);
        amkq.r(obj7, obj8);
        amkq.r(obj9, obj10);
        return amvo.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract amrl d();

    @Override // java.util.Map, j$.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public amrl values() {
        amrl amrlVar = this.d;
        if (amrlVar != null) {
            return amrlVar;
        }
        amrl d = d();
        this.d = d;
        return d;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract amsx g();

    @Override // java.util.Map, j$.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return amkq.ak(entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final amsx entrySet() {
        amsx amsxVar = this.b;
        if (amsxVar != null) {
            return amsxVar;
        }
        amsx rY = rY();
        this.b = rY;
        return rY;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final amsx keySet() {
        amsx amsxVar = this.c;
        if (amsxVar != null) {
            return amsxVar;
        }
        amsx g = g();
        this.c = g;
        return g;
    }

    public abstract amsx rY();

    public amxd rZ() {
        throw null;
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public abstract void sa();

    public final String toString() {
        int size = size();
        amkq.t(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    Object writeReplace() {
        return new amry(this);
    }
}
