package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aopw implements Iterator, j$.util.Iterator {
    final /* synthetic */ aopy a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public aopw(aopy aopyVar) {
        this.a = aopyVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.b.entrySet().iterator();
        }
        return this.d;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.b + 1 >= this.a.a.size()) {
            return !this.a.b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        if (i < this.a.a.size()) {
            return (Map.Entry) this.a.a.get(this.b);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        this.a.g();
        if (this.b < this.a.a.size()) {
            aopy aopyVar = this.a;
            int i = this.b;
            this.b = i - 1;
            aopyVar.e(i);
            return;
        }
        a().remove();
    }
}
