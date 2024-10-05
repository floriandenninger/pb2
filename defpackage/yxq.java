package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxq {
    int a;
    final int[] b;
    final long[] c;
    final /* synthetic */ yxt d;

    public yxq(yxt yxtVar, int i) {
        this.d = yxtVar;
        this.b = new int[i];
        this.c = new long[i];
    }

    public final void a() {
        yxs yxsVar;
        yxt yxtVar;
        yxr c;
        do {
            yxsVar = (yxs) this.d.a.get();
            long[] copyOf = Arrays.copyOf(yxsVar.a, 8);
            long[] copyOf2 = Arrays.copyOf(yxsVar.b, 8);
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                if (i2 == 0) {
                    Arrays.fill(copyOf, 0L);
                    Arrays.fill(copyOf2, 0L);
                    copyOf2 = yxt.t(copyOf2);
                    copyOf = yxt.t(copyOf);
                } else {
                    yxt.m(copyOf2, i2, this.c[i]);
                    if (yxu.f(i2)) {
                        yxt.m(copyOf, i2, this.c[i]);
                    }
                }
            }
            if (Arrays.equals(yxsVar.b, copyOf2)) {
                return;
            }
            yxtVar = this.d;
            c = yxsVar.c();
            c.j(copyOf);
            c.h(copyOf2);
            c.f(true);
        } while (!yxtVar.n(yxsVar, c));
    }

    public final void b(int i, long j) {
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        long[] jArr = this.c;
        this.a = i2 + 1;
        jArr[i2] = j;
    }

    public final void c(int i, boolean z) {
        b(i, true != z ? 0L : 1L);
    }
}
