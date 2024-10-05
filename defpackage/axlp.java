package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axlp extends axkx {
    private static final axna f = axna.d(axlp.class);
    axlc[] d;
    dey e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x031c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v7, types: [dge, axku] */
    /* JADX WARN: Type inference failed for: r10v9, types: [dgl, axku] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axlp(defpackage.axlc... r18) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlp.<init>(axlc[]):void");
    }

    private static final axmc n(axlx axlxVar, axlx axlxVar2) {
        axlw axlwVar;
        if (!(axlxVar instanceof axmc) || !(axlxVar2 instanceof axmc)) {
            f.b("I can only merge ESDescriptors");
            return null;
        }
        axmc axmcVar = (axmc) axlxVar;
        axmc axmcVar2 = (axmc) axlxVar2;
        if (axmcVar.c == axmcVar2.c) {
            int i = axmcVar.f;
            int i2 = axmcVar2.f;
            if (axmcVar.h == axmcVar2.h && axmcVar.a == axmcVar2.a && axmcVar.i == axmcVar2.i && axmcVar.d == axmcVar2.d && axmcVar.b == axmcVar2.b) {
                int i3 = axmcVar.e;
                int i4 = axmcVar2.e;
                String str = axmcVar.g;
                if (str != null) {
                    str.equals(axmcVar2.g);
                } else {
                    String str2 = axmcVar2.g;
                }
                axlz axlzVar = axmcVar.j;
                if (axlzVar == null ? axmcVar2.j != null : !axlzVar.equals(axmcVar2.j)) {
                    axlz axlzVar2 = axmcVar.j;
                    axlz axlzVar3 = axmcVar2.j;
                    axlw axlwVar2 = axlzVar2.h;
                    if (axlwVar2 != null && (axlwVar = axlzVar3.h) != null && !axlwVar2.equals(axlwVar)) {
                        return null;
                    }
                    long j = axlzVar2.f;
                    long j2 = axlzVar3.f;
                    if (j != j2) {
                        axlzVar2.f = (j + j2) / 2;
                    }
                    int i5 = axlzVar2.d;
                    int i6 = axlzVar3.d;
                    axma axmaVar = axlzVar2.g;
                    if (axmaVar == null ? axlzVar3.g != null : !axmaVar.equals(axlzVar3.g)) {
                        return null;
                    }
                    long j3 = axlzVar2.e;
                    long j4 = axlzVar3.e;
                    if (j3 != j4) {
                        axlzVar2.e = Math.max(j3, j4);
                    }
                    if (!axlzVar2.i.equals(axlzVar3.i) || axlzVar2.a != axlzVar3.a || axlzVar2.b != axlzVar3.b || axlzVar2.c != axlzVar3.c) {
                        return null;
                    }
                }
                if (axmcVar.l.equals(axmcVar2.l)) {
                    axmi axmiVar = axmcVar.k;
                    if (axmiVar == null ? axmcVar2.k == null : axmiVar.equals(axmcVar2.k)) {
                        return axmcVar;
                    }
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final dfh b() {
        return this.d[0].b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (axlc axlcVar : this.d) {
            axlcVar.close();
        }
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List d() {
        if (this.d[0].d() == null || this.d[0].d().isEmpty()) {
            return null;
        }
        LinkedList<int[]> linkedList = new LinkedList();
        for (axlc axlcVar : this.d) {
            List<dee> d = axlcVar.d();
            long j = 0;
            while (d.iterator().hasNext()) {
                j += ((dee) r6.next()).a;
            }
            int[] iArr = new int[(int) j];
            int i = 0;
            for (dee deeVar : d) {
                int i2 = 0;
                while (i2 < deeVar.a) {
                    iArr[i] = deeVar.b;
                    i2++;
                    i++;
                }
            }
            linkedList.add(iArr);
        }
        LinkedList linkedList2 = new LinkedList();
        for (int[] iArr2 : linkedList) {
            for (int i3 : iArr2) {
                if (linkedList2.isEmpty() || ((dee) linkedList2.getLast()).b != i3) {
                    linkedList2.add(new dee(1, i3));
                } else {
                    ((dee) linkedList2.getLast()).a++;
                }
            }
        }
        return linkedList2;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List f() {
        if (this.d[0].f() == null || this.d[0].f().isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (axlc axlcVar : this.d) {
            linkedList.addAll(axlcVar.f());
        }
        return linkedList;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final long[] h() {
        if (this.d[0].h() == null || this.d[0].h().length <= 0) {
            return null;
        }
        int i = 0;
        for (axlc axlcVar : this.d) {
            i += axlcVar.h().length;
        }
        long[] jArr = new long[i];
        long j = 0;
        int i2 = 0;
        for (axlc axlcVar2 : this.d) {
            long[] h = axlcVar2.h();
            int length = h.length;
            int i3 = 0;
            while (i3 < length) {
                jArr[i2] = h[i3] + j;
                i3++;
                i2++;
            }
            j += r8.l().size();
        }
        return jArr;
    }

    @Override // defpackage.axlc
    public final dey i() {
        return this.e;
    }

    @Override // defpackage.axlc
    public final axld j() {
        return this.d[0].j();
    }

    @Override // defpackage.axlc
    public final String k() {
        return this.d[0].k();
    }

    @Override // defpackage.axlc
    public final List l() {
        ArrayList arrayList = new ArrayList();
        for (axlc axlcVar : this.d) {
            arrayList.addAll(axlcVar.l());
        }
        return arrayList;
    }

    @Override // defpackage.axlc
    public final synchronized long[] m() {
        long[] jArr;
        int i = 0;
        for (axlc axlcVar : this.d) {
            i += axlcVar.m().length;
        }
        jArr = new long[i];
        int i2 = 0;
        for (axlc axlcVar2 : this.d) {
            long[] m = axlcVar2.m();
            int length = m.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i2 + 1;
                jArr[i2] = m[i3];
                i3++;
                i2 = i4;
            }
        }
        return jArr;
    }
}
