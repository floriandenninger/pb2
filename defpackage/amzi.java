package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amzi extends amzk {
    public final int[] a;
    public final int b;
    private final amyt d;
    private final amyt e;

    public amzi(amyt amytVar, amyt amytVar2) {
        this.d = amytVar;
        this.e = amytVar2;
        int b = amytVar2.b();
        anaf.e(b <= 28, "metadata size too large");
        int[] iArr = new int[b];
        this.a = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            amyc d = d(i);
            long j2 = d.c | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (d.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = d.b ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = j2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = j2;
        }
        this.b = i2;
    }

    @Override // defpackage.amzk
    public final int a() {
        return this.b;
    }

    @Override // defpackage.amzk
    public final Set b() {
        return new amzg(this);
    }

    @Override // defpackage.amzk
    public final void c(amza amzaVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            amyc d = d(i2 & 31);
            if (!d.b) {
                amzaVar.a(d, d.d(e(i2)), obj);
            } else {
                amzaVar.b(d, new amzh(this, d, i2), obj);
            }
        }
    }

    public final amyc d(int i) {
        return (i >= 0 ? this.e : this.d).c(i);
    }

    public final Object e(int i) {
        return (i >= 0 ? this.e : this.d).e(i);
    }
}
