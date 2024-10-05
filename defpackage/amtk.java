package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtk extends amqp {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public amtk(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        amkq.aW(it, this.b);
        return new amtj(it);
    }
}
