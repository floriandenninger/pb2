package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axlr extends axkx {
    final axlc d;
    private final int e;
    private final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axlr(defpackage.axlc r4, long r5, long r7) {
        /*
            r3 = this;
            r0 = r4
            axkx r0 = (defpackage.axkx) r0
            java.lang.String r0 = r0.a
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 6
            r2.<init>(r1)
            java.lang.String r1 = "crop("
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.d = r4
            int r4 = (int) r5
            r3.e = r4
            int r4 = (int) r7
            r3.f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlr.<init>(axlc, long, long):void");
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final dfh b() {
        return ((axla) this.d).k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List d() {
        dee deeVar;
        long j;
        List list = ((axla) this.d).g;
        long j2 = this.e;
        long j3 = this.f;
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            ListIterator listIterator = list.listIterator();
            arrayList = new ArrayList();
            long j4 = 0;
            while (true) {
                deeVar = (dee) listIterator.next();
                j = deeVar.a + j4;
                if (j > j2) {
                    break;
                }
                j4 = j;
            }
            if (j >= j3) {
                arrayList.add(new dee((int) (j3 - j2), deeVar.b));
            } else {
                arrayList.add(new dee((int) (j - j2), deeVar.b));
                int i = deeVar.a;
                while (true) {
                    j4 += i;
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    deeVar = (dee) listIterator.next();
                    if (deeVar.a + j4 >= j3) {
                        break;
                    }
                    arrayList.add(deeVar);
                    i = deeVar.a;
                }
                arrayList.add(new dee((int) (j3 - j4), deeVar.b));
            }
        }
        return arrayList;
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final List f() {
        List list = ((axla) this.d).h;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((axla) this.d).h.subList(this.e, this.f);
    }

    @Override // defpackage.axkx, defpackage.axlc
    public final synchronized long[] h() {
        if (this.d.h() == null) {
            return null;
        }
        long[] h = this.d.h();
        int length = h.length;
        int i = 0;
        while (i < h.length && h[i] < this.e) {
            i++;
        }
        while (length > 0) {
            int i2 = length - 1;
            if (this.f >= h[i2]) {
                break;
            }
            length = i2;
        }
        long[] copyOfRange = Arrays.copyOfRange(this.d.h(), i, length);
        for (int i3 = 0; i3 < copyOfRange.length; i3++) {
            copyOfRange[i3] = copyOfRange[i3] - this.e;
        }
        return copyOfRange;
    }

    @Override // defpackage.axlc
    public final dey i() {
        return ((axla) this.d).e;
    }

    @Override // defpackage.axlc
    public final axld j() {
        return ((axla) this.d).i;
    }

    @Override // defpackage.axlc
    public final String k() {
        return ((axla) this.d).j;
    }

    @Override // defpackage.axlc
    public final List l() {
        return ((axla) this.d).d.subList(this.e, this.f);
    }

    @Override // defpackage.axlc
    public final synchronized long[] m() {
        long[] jArr;
        int i = this.f - this.e;
        jArr = new long[i];
        System.arraycopy(this.d.m(), this.e, jArr, 0, i);
        return jArr;
    }
}
