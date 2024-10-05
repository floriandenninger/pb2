package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajwt {
    public final ajwv a = new ajws();
    final List b = new CopyOnWriteArrayList();

    public final List a(final List list) {
        final List list2 = (List) aypy.T(list).Y(new ayrv() { // from class: ajwq
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                ajwt ajwtVar = ajwt.this;
                for (ajwv ajwvVar : ajwtVar.b) {
                    if (ajwvVar.e() != null && ajwvVar.e().a(obj)) {
                        return ajwvVar;
                    }
                }
                return ajwtVar.a;
            }
        }).av().X();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            ((ajwv) list2.get(i)).c();
        }
        final int size = list.size();
        if (size > 0) {
            arrayList.add(aypy.y(new Callable() { // from class: ajwr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = size;
                    List list3 = list2;
                    List list4 = list;
                    final ArrayList arrayList2 = new ArrayList(i2);
                    ajwu ajwuVar = new ajwu() { // from class: ajwp
                        @Override // defpackage.ajwu
                        public final void a(Object obj) {
                            arrayList2.add(obj);
                        }
                    };
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((ajwv) list3.get(i3)).b(list4.get(i3), ajwuVar);
                    }
                    return aypy.T(arrayList2);
                }
            }));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        return (List) (arrayList.size() == 1 ? (aypy) arrayList.get(0) : aypy.T(arrayList).r(aysu.a, aypn.a, aypn.a, false)).av().X();
    }

    public final void b(ajwv ajwvVar) {
        if (ajwvVar == null) {
            return;
        }
        this.b.add(0, ajwvVar);
    }
}
