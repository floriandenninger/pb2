package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aook extends aoom {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    static List a(Object obj, long j) {
        return (List) aoqk.i(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List e(Object obj, long j, int i) {
        aooi aooiVar;
        List arrayList;
        List a = a(obj, j);
        if (a.isEmpty()) {
            if (a instanceof aooj) {
                arrayList = new aooi(i);
            } else if (!(a instanceof aopg) || !(a instanceof aony)) {
                arrayList = new ArrayList(i);
            } else {
                arrayList = ((aony) a).e(i);
            }
            aoqk.v(obj, j, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(a.getClass())) {
            ArrayList arrayList2 = new ArrayList(a.size() + i);
            arrayList2.addAll(a);
            aoqk.v(obj, j, arrayList2);
            aooiVar = arrayList2;
        } else if (a instanceof aoqf) {
            aooi aooiVar2 = new aooi(a.size() + i);
            aooiVar2.addAll((aoqf) a);
            aoqk.v(obj, j, aooiVar2);
            aooiVar = aooiVar2;
        } else {
            if (!(a instanceof aopg) || !(a instanceof aony)) {
                return a;
            }
            aony aonyVar = (aony) a;
            if (aonyVar.c()) {
                return a;
            }
            aony e = aonyVar.e(a.size() + i);
            aoqk.v(obj, j, e);
            return e;
        }
        return aooiVar;
    }

    @Override // defpackage.aoom
    public final List b(Object obj, long j) {
        return e(obj, j, 10);
    }

    @Override // defpackage.aoom
    public final void c(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) aoqk.i(obj, j);
        if (list instanceof aooj) {
            unmodifiableList = ((aooj) list).d();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (!(list instanceof aopg) || !(list instanceof aony)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                aony aonyVar = (aony) list;
                if (aonyVar.c()) {
                    aonyVar.b();
                    return;
                }
                return;
            }
        }
        aoqk.v(obj, j, unmodifiableList);
    }

    @Override // defpackage.aoom
    public final void d(Object obj, Object obj2, long j) {
        List a = a(obj2, j);
        List e = e(obj, j, a.size());
        int size = e.size();
        int size2 = a.size();
        if (size > 0 && size2 > 0) {
            e.addAll(a);
        }
        if (size > 0) {
            a = e;
        }
        aoqk.v(obj, j, a);
    }
}
