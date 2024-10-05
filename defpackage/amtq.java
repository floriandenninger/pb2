package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtq implements Iterator, j$.util.Iterator {
    private Iterator a;
    private Iterator b = amtp.a;
    private Iterator c;
    private Deque d;

    public amtq(Iterator it) {
        this.c = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        while (true) {
            java.util.Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                java.util.Iterator it3 = this.c;
                it = null;
                if (it3 == null || !it3.hasNext()) {
                    Deque deque = this.d;
                    if (deque == null || deque.isEmpty()) {
                        break;
                    }
                    this.c = (java.util.Iterator) this.d.removeFirst();
                } else {
                    it = this.c;
                    break;
                }
            }
            this.c = it;
            if (it == null) {
                return false;
            }
            java.util.Iterator it4 = (java.util.Iterator) it.next();
            this.b = it4;
            if (it4 instanceof amtq) {
                amtq amtqVar = (amtq) it4;
                this.b = amtqVar.b;
                if (this.d == null) {
                    this.d = new ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (amtqVar.d != null) {
                    while (!amtqVar.d.isEmpty()) {
                        this.d.addFirst((java.util.Iterator) amtqVar.d.removeLast());
                    }
                }
                this.c = amtqVar.c;
            }
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            java.util.Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        java.util.Iterator it = this.a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.a = null;
    }
}
