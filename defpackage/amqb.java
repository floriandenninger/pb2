package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amqb extends amqd {
    public static final amqd g(int i) {
        return i < 0 ? amqd.c : i > 0 ? amqd.d : amqd.b;
    }

    @Override // defpackage.amqd
    public final int a() {
        return 0;
    }

    @Override // defpackage.amqd
    public final amqd b(int i, int i2) {
        return g(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // defpackage.amqd
    public final amqd c(Comparable comparable, Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.amqd
    public final amqd d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.amqd
    public final amqd e(boolean z, boolean z2) {
        return g(anaf.an(z, z2));
    }

    @Override // defpackage.amqd
    public final amqd f(boolean z, boolean z2) {
        return g(anaf.an(z2, z));
    }
}
