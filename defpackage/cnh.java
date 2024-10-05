package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnh {
    public final int a;
    public final byte[] b;
    public final Map c;
    public final List d;
    public final boolean e;
    public final long f;

    private cnh(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : Collections.unmodifiableList(list);
        this.e = z;
        this.f = j;
    }

    @Deprecated
    public cnh(int i, byte[] bArr, Map map) {
        this(i, bArr, map, false, 0L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cnh(int r9, byte[] r10, java.util.Map r11, boolean r12, long r13) {
        /*
            r8 = this;
            if (r11 != 0) goto L5
            r0 = 0
        L3:
            r4 = r0
            goto L42
        L5:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L10
            java.util.List r0 = java.util.Collections.emptyList()
            goto L3
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            cnf r3 = new cnf
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L21
        L42:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnh.<init>(int, byte[], java.util.Map, boolean, long):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cnh(int r9, byte[] r10, boolean r11, long r12, java.util.List r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L5
            r0 = 0
        L3:
            r3 = r0
            goto L32
        L5:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L3
        L10:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            r1 = r14
            amru r1 = (defpackage.amru) r1
            amxe r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            cnf r2 = (defpackage.cnf) r2
            java.lang.String r3 = r2.a
            java.lang.String r2 = r2.b
            r0.put(r3, r2)
            goto L1e
        L32:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnh.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public cnh(byte[] bArr, Map map) {
        this(200, bArr, map, false, 0L);
    }
}
