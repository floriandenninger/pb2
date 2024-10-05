package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amoh implements Iterator, j$.util.Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ amoi c;

    public amoh(amoi amoiVar) {
        this.c = amoiVar;
        this.a = amoiVar.a.entrySet().iterator();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        return this.c.a(entry);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        amkq.O(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
