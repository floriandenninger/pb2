package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yov implements Iterator, j$.util.Iterator {
    private final Iterator a;
    private LinkedList b;
    private Iterator c;

    public yov(yow yowVar) {
        this.a = yowVar.a.entrySet().iterator();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        return this.a.hasNext() || ((it = this.c) != null && it.hasNext());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        while (true) {
            java.util.Iterator it = this.c;
            if (it == null || !it.hasNext()) {
                LinkedList linkedList = (LinkedList) ((Map.Entry) this.a.next()).getValue();
                this.b = linkedList;
                this.c = linkedList.iterator();
            } else {
                return this.c.next();
            }
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.c.remove();
        if (this.b.isEmpty()) {
            this.a.remove();
        }
    }
}
