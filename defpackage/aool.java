package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aool extends aoom {
    static aony a(Object obj, long j) {
        return (aony) aoqk.i(obj, j);
    }

    @Override // defpackage.aoom
    public final List b(Object obj, long j) {
        aony a = a(obj, j);
        if (a.c()) {
            return a;
        }
        int size = a.size();
        aony e = a.e(size == 0 ? 10 : size + size);
        aoqk.v(obj, j, e);
        return e;
    }

    @Override // defpackage.aoom
    public final void c(Object obj, long j) {
        a(obj, j).b();
    }

    @Override // defpackage.aoom
    public final void d(Object obj, Object obj2, long j) {
        aony a = a(obj, j);
        aony a2 = a(obj2, j);
        int size = a.size();
        int size2 = a2.size();
        if (size > 0 && size2 > 0) {
            if (!a.c()) {
                a = a.e(size2 + size);
            }
            a.addAll(a2);
        }
        if (size > 0) {
            a2 = a;
        }
        aoqk.v(obj, j, a2);
    }
}
