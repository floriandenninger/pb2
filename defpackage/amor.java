package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class amor implements Iterator, j$.util.Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ amos c;

    public amor(amos amosVar) {
        Iterator it;
        this.c = amosVar;
        this.b = amosVar.b;
        Collection collection = amosVar.b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }

    public amor(amos amosVar, Iterator it) {
        this.c = amosVar;
        this.b = amosVar.b;
        this.a = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.b();
        if (this.c.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.a.remove();
        amos amosVar = this.c;
        amov amovVar = amosVar.e;
        amovVar.b--;
        amosVar.c();
    }
}
