package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amva implements Iterator, j$.util.Iterator {
    private final amuw a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private amux f;

    public amva(amuw amuwVar, Iterator it) {
        this.a = amuwVar;
        this.b = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.c;
            if (i == 0) {
                amux amuxVar = (amux) this.b.next();
                this.f = amuxVar;
                i = amuxVar.a();
                this.d = i;
            }
            this.c = i - 1;
            this.e = true;
            amux amuxVar2 = this.f;
            amuxVar2.getClass();
            return amuxVar2.a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        amkq.s(this.e);
        if (this.d == 1) {
            this.b.remove();
        } else {
            amuw amuwVar = this.a;
            amux amuxVar = this.f;
            amuxVar.getClass();
            amuwVar.remove(amuxVar.a);
        }
        this.d--;
        this.e = false;
    }
}
