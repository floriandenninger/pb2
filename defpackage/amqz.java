package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amqz extends amrd {
    public amqz(amre amreVar) {
        super(amreVar);
    }

    @Override // defpackage.amrd
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new amqw(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int e = this.b.e(key);
            if (e != -1 && amkq.b(this.b.a[e], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int bt = amkq.bt(key);
        int f = this.b.f(key, bt);
        if (f == -1 || !amkq.b(this.b.a[f], value)) {
            return false;
        }
        this.b.k(f, bt);
        return true;
    }
}
