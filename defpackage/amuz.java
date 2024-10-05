package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amuz extends amwd {
    final /* synthetic */ ampd a;

    public amuz(ampd ampdVar) {
        this.a = ampdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof amux) {
            amux amuxVar = (amux) obj;
            if (amuxVar.a() > 0 && this.a.a(amuxVar.a) == amuxVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof amux)) {
            return false;
        }
        amux amuxVar = (amux) obj;
        Object obj2 = amuxVar.a;
        int a = amuxVar.a();
        if (a != 0) {
            return this.a.h(obj2, a);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b();
    }

    public amuz() {
    }
}
