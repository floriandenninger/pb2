package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agsr {
    public final Map a;
    public final long b;
    private final Map c;
    private final Map d;
    private final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public agsr(java.lang.String r8, java.util.Set r9, java.util.LinkedHashSet r10, java.util.List r11, java.util.List r12, long r13) {
        /*
            r7 = this;
            amrz r1 = defpackage.amrz.k(r8, r9)
            amrz r2 = defpackage.amrz.k(r8, r10)
            amrz r3 = defpackage.amrz.k(r8, r11)
            if (r12 == 0) goto L13
            amrz r8 = defpackage.amrz.k(r8, r12)
            goto L17
        L13:
            java.util.Map r8 = java.util.Collections.emptyMap()
        L17:
            r4 = r8
            r0 = r7
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsr.<init>(java.lang.String, java.util.Set, java.util.LinkedHashSet, java.util.List, java.util.List, long):void");
    }

    public agsr(Map map, Map map2, Map map3, Map map4, long j) {
        this.a = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.b = j;
    }

    public final LinkedHashSet a(String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c.get(str);
        return linkedHashSet != null ? linkedHashSet : new LinkedHashSet();
    }

    public final List b(String str) {
        List list = (List) this.d.get(str);
        return list != null ? list : new ArrayList();
    }

    public final List c(String str) {
        return (List) this.e.get(str);
    }
}
