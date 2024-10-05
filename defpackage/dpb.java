package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpb {
    private static final List i = new ArrayList();
    public int a;
    public int b;
    public int c;
    public int d;
    public dte e;
    public List f;
    public List g;
    public List h;

    public dpb(int i2, int i3, int i4, int i5, dte dteVar, List list, List list2, List list3) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = dteVar == null ? dqv.q() : dteVar;
        if (list == null) {
            this.f = i;
        } else {
            int size = list.size();
            this.f = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                dte dteVar2 = (dte) list.get(i6);
                List list4 = this.f;
                if (dteVar2 == null) {
                    dteVar2 = dqv.q();
                }
                list4.add(dteVar2);
            }
        }
        if (list2 != null) {
            this.g = Collections.unmodifiableList(list2);
        }
        if (list3 != null) {
            this.h = Collections.unmodifiableList(list3);
        }
    }

    public static dpb a(int i2, int i3, int i4, int i5, dte dteVar, List list, List list2, List list3) {
        return new dpb(i2, i3, i4, i5, dteVar, list, list2, list3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dpb b(dpb dpbVar) {
        return a(dpbVar.a, dpbVar.b, dpbVar.c, dpbVar.d, dpbVar.e, dpbVar.f, dpbVar.g, dpbVar.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dpb c(dpb dpbVar, int i2) {
        int i3 = dpbVar.c;
        return a(dpbVar.a, dpbVar.b + i2, i3 >= 0 ? i3 + i2 : -1, dpbVar.d, dpbVar.e, dpbVar.f, dpbVar.g, dpbVar.h);
    }

    public static dpb d(int i2, dte dteVar, Object obj, Object obj2) {
        return a(i2, 0, -1, 1, dteVar, null, obj != null ? Collections.singletonList(obj) : null, obj2 != null ? Collections.singletonList(obj2) : null);
    }

    public static dpb e(Object obj) {
        return d(3, dqv.q(), obj, null);
    }
}
