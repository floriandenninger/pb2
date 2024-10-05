package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adz extends aeg implements Map, j$.util.Map {
    adt a;
    adv b;
    adx c;

    public adz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] a(Object[] objArr, int i) {
        int i2 = this.j;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.i[i3 + i3 + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
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
    public final Set entrySet() {
        adt adtVar = this.a;
        if (adtVar != null) {
            return adtVar;
        }
        adt adtVar2 = new adt(this);
        this.a = adtVar2;
        return adtVar2;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        adv advVar = this.b;
        if (advVar != null) {
            return advVar;
        }
        adv advVar2 = new adv(this);
        this.b = advVar2;
        return advVar2;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        j(this.j + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        adx adxVar = this.c;
        if (adxVar != null) {
            return adxVar;
        }
        adx adxVar2 = new adx(this);
        this.c = adxVar2;
        return adxVar2;
    }

    public adz(int i) {
        super(i);
    }

    public adz(aeg aegVar) {
        k(aegVar);
    }
}
