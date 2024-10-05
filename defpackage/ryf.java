package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ryf implements Iterator, java.util.Iterator {
    final /* synthetic */ ryg a;
    private final long b;
    private final long c;
    private long d;
    private int e = 1;

    public ryf(ryg rygVar, long j, long j2) {
        this.a = rygVar;
        this.b = j;
        this.c = j2;
        b(1);
    }

    @Override // j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long next() {
        long j = this.d;
        ryg rygVar = this.a;
        this.d = rygVar.a(rygVar.a, j, this.e);
        return Long.valueOf(j);
    }

    public final void b(int i) {
        ryg.d(i);
        this.e = i;
        ryg rygVar = this.a;
        this.d = rygVar.b(rygVar.a, this.b, i);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.d <= this.c;
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove");
    }
}
