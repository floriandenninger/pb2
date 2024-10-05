package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnm implements ajtk {
    private final Set a;

    public mnm(Set set) {
        this.a = amsx.p(set);
    }

    @Override // defpackage.ajtk
    public final Object a(Object obj) {
        Iterator it = this.a.iterator();
        Object obj2 = obj;
        while (it.hasNext() && (obj2 = ((ajtk) it.next()).a(obj2)) == obj) {
        }
        return obj2;
    }
}
