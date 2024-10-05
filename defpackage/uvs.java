package defpackage;

import android.os.Build;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvs extends amqr implements Map {
    private static final boolean a;
    private final java.util.Map b;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT != 21 && Build.VERSION.SDK_INT != 22) {
            z = false;
        }
        a = z;
    }

    private uvs(java.util.Map map) {
        this.b = map;
    }

    public static uvs a() {
        return a ? new uvs(DesugarCollections.synchronizedMap(new HashMap())) : new uvs(new ConcurrentHashMap());
    }

    @Override // defpackage.amqr
    protected final java.util.Map b() {
        return this.b;
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

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // defpackage.amqr, defpackage.amqt
    protected final /* synthetic */ Object g() {
        return this.b;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        if (a) {
            synchronized (this.b) {
                if (!this.b.containsKey(obj)) {
                    return this.b.put(obj, obj2);
                }
                return this.b.get(obj);
            }
        }
        return ((ConcurrentHashMap) this.b).putIfAbsent(obj, obj2);
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
}
