package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmy implements bih {
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public bik e;
    public int f;
    public boolean g;
    public int h;
    public final vak i;
    private final pth j;
    private final SparseIntArray k;
    private final bmv l;
    private boolean m;
    private boolean n;
    private int o;
    private bia p;

    public bmy() {
        this(null);
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.e = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        bia biaVar;
        pse.g(true);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ptq ptqVar = (ptq) this.a.get(i);
            if (ptqVar.e() != -9223372036854775807L) {
                long c = ptqVar.c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            ptqVar.f(j2);
        }
        if (j2 != 0 && (biaVar = this.p) != null) {
            biaVar.a(j2);
        }
        this.j.C(0);
        this.k.clear();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            ((bna) this.b.valueAt(i2)).c();
        }
        this.o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r2 = r2 + 1;
     */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(defpackage.bii r7) {
        /*
            r6 = this;
            pth r0 = r6.j
            byte[] r0 = r0.a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.j(r0, r1, r2)
            r2 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L27
            r3 = 0
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r2 = r2 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.m(r2)
            r7 = 1
            return r7
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmy.g(bii):boolean");
    }

    public bmy(byte[] bArr) {
        ptq ptqVar = new ptq(0L);
        this.i = new vak(null, null, null, null, null);
        this.a = Collections.singletonList(ptqVar);
        this.j = new pth(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.c = sparseBooleanArray;
        this.d = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        this.k = new SparseIntArray();
        this.l = new bmv();
        this.e = bik.t;
        this.h = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.b.put(sparseArray2.keyAt(i), (bna) sparseArray2.valueAt(i));
        }
        this.b.put(0, new bms(new bmw(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02c0, code lost:
    
        if (r2 == false) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.bii r28, defpackage.tfq r29) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmy.h(bii, tfq):int");
    }
}
