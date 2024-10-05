package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amoj implements Iterator, j$.util.Iterator {
    final Iterator a;
    Collection b = null;
    Iterator c = amtr.a;
    final /* synthetic */ amov d;

    public amoj(amov amovVar) {
        this.d = amovVar;
        this.a = amovVar.a.entrySet().iterator();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.b = collection;
            this.c = collection.iterator();
        }
        return this.c.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.c.remove();
        Collection collection = this.b;
        collection.getClass();
        if (collection.isEmpty()) {
            this.a.remove();
        }
        amov amovVar = this.d;
        amovVar.b--;
    }
}
