package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amqx extends amrd {
    final /* synthetic */ amre a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqx(amre amreVar) {
        super(amreVar);
        this.a = amreVar;
    }

    @Override // defpackage.amrd
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new amqv(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = this.a.c(key);
            if (c != -1 && amkq.b(value, this.a.b[c])) {
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
        int d = this.a.d(key, bt);
        if (d == -1 || !amkq.b(value, this.a.b[d])) {
            return false;
        }
        this.a.j(d, bt);
        return true;
    }
}
