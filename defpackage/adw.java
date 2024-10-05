package defpackage;

import j$.util.Iterator;
import j$.util.Map;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adw implements Iterator, Map.Entry, j$.util.Iterator, Map.Entry {
    int a;
    int b = -1;
    boolean c;
    final /* synthetic */ adz d;

    public adw(adz adzVar) {
        this.d = adzVar;
        this.a = adzVar.j - 1;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return aec.f(entry.getKey(), this.d.f(this.b)) && aec.f(entry.getValue(), this.d.i(this.b));
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.f(this.b);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.i(this.b);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object f = this.d.f(this.b);
        Object i = this.d.i(this.b);
        return (f == null ? 0 : f.hashCode()) ^ (i != null ? i.hashCode() : 0);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.g(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.h(this.b, obj);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
