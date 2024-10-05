package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgh implements Iterator, j$.util.Iterator {
    final Iterator a;
    final /* synthetic */ adgj b;

    public adgh(adgj adgjVar) {
        this.b = adgjVar;
        this.a = adgjVar.b.entrySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adgi next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return new adgi((String) entry.getKey(), (String) entry.getValue());
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
    public final void remove() {
        this.a.remove();
    }
}
