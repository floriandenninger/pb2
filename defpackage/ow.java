package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ow {
    final Class a;
    final int b;
    final ou c;
    final ov d;
    public final pn e;
    final pl f;
    final pk g;
    public boolean k;
    private final pl q;
    private final pk r;
    final int[] h = new int[2];
    final int[] i = new int[2];
    final int[] j = new int[2];
    private int p = 0;
    public int l = 0;
    int m = 0;
    int n = 0;
    public final SparseIntArray o = new SparseIntArray();

    public ow(Class cls, ou ouVar, ov ovVar) {
        os osVar = new os(this);
        this.q = osVar;
        ot otVar = new ot(this);
        this.r = otVar;
        this.a = cls;
        this.b = 20;
        this.c = ouVar;
        this.d = ovVar;
        this.e = new pn();
        this.f = new pf(osVar);
        this.g = new ph(otVar);
        a();
    }

    public final void a() {
        this.o.clear();
        pk pkVar = this.g;
        int i = this.n + 1;
        this.n = i;
        ((ph) pkVar).c(pj.b(1, i, null));
    }

    public final void b() {
        int i;
        ov ovVar = this.d;
        int[] iArr = this.h;
        iArr[0] = ovVar.a.e.J();
        iArr[1] = ovVar.a.e.L();
        int[] iArr2 = this.h;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.l) {
            return;
        }
        if (this.k) {
            int[] iArr3 = this.i;
            if (i2 > iArr3[1] || (i = iArr3[0]) > i3) {
                this.p = 0;
            } else if (i2 < i) {
                this.p = 1;
            } else if (i2 > i) {
                this.p = 2;
            }
        } else {
            this.p = 0;
        }
        int[] iArr4 = this.i;
        iArr4[0] = i2;
        iArr4[1] = iArr2[1];
        int[] iArr5 = this.j;
        int i4 = this.p;
        int i5 = iArr2[1];
        int i6 = iArr2[0];
        int i7 = (i5 - i6) + 1;
        int i8 = i7 / 2;
        iArr5[0] = i6 - (i4 == 1 ? i7 : i8);
        int i9 = iArr2[1];
        if (i4 != 2) {
            i7 = i8;
        }
        iArr5[1] = i9 + i7;
        iArr5[0] = Math.min(iArr2[0], Math.max(iArr5[0], 0));
        int[] iArr6 = this.j;
        iArr6[1] = Math.max(this.h[1], Math.min(iArr6[1], this.l - 1));
        pk pkVar = this.g;
        int[] iArr7 = this.h;
        int i10 = iArr7[0];
        int i11 = iArr7[1];
        int[] iArr8 = this.j;
        ((ph) pkVar).c(pj.c(2, i10, i11, iArr8[0], iArr8[1], this.p, null));
    }

    public final boolean c() {
        return this.n != this.m;
    }
}
