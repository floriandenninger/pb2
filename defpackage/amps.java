package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amps extends AbstractSet {
    final /* synthetic */ ampx a;

    public amps(ampx ampxVar) {
        this.a = ampxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map l = this.a.l();
        if (l != null) {
            return l.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int d = this.a.d(entry.getKey());
            if (d != -1 && amkq.b(this.a.j(d), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map l = this.a.l();
        if (l != null) {
            return l.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.a.q()) {
            return false;
        }
        int c = this.a.c();
        int by = amkq.by(entry.getKey(), entry.getValue(), c, this.a.i(), this.a.r(), this.a.s(), this.a.t());
        if (by == -1) {
            return false;
        }
        this.a.o(by, c);
        r10.f--;
        this.a.m();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
