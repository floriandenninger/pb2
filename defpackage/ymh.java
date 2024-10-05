package defpackage;

import java.util.LinkedHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public class ymh implements ylz {
    public final int a;
    final LinkedHashMap b;

    public ymh(int i) {
        this.a = i;
        this.b = new ymg(this, ((int) Math.ceil(i / 0.75f)) + 1);
    }

    @Override // defpackage.ylz
    public synchronized Object a(Object obj) {
        obj.getClass();
        return this.b.get(obj);
    }

    @Override // defpackage.ylz
    public synchronized Object b(Object obj) {
        obj.getClass();
        return this.b.remove(obj);
    }

    @Override // defpackage.ylz
    public final synchronized void c() {
        this.b.clear();
    }

    @Override // defpackage.ylz
    public synchronized void d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.b.put(obj, obj2);
    }

    @Override // defpackage.ylz
    public final boolean e(Object obj) {
        throw null;
    }

    public synchronized String toString() {
        return this.b.toString();
    }
}
