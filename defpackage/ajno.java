package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajno implements ajnf {
    final /* synthetic */ ajnp a;
    private int[] b;

    public ajno(ajnp ajnpVar) {
        this.a = ajnpVar;
        g();
    }

    private final void f() {
        int a = this.a.a.a() + 1;
        int[] iArr = this.b;
        if (iArr == null) {
            this.b = new int[Math.max(a, 32)];
            return;
        }
        int length = iArr.length;
        if (length < a) {
            int[] iArr2 = new int[Math.max(length + length, a)];
            System.arraycopy(this.b, 0, iArr2, 0, length);
            this.b = iArr2;
        }
    }

    private final void g() {
        this.a.d.clear();
        int a = this.a.a.a();
        f();
        this.a.d.ensureCapacity(a);
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            if (this.a.b.a(this.a.a.c(i2))) {
                this.a.d.add(Integer.valueOf(i2));
                this.b[i2] = i;
                i++;
            } else {
                this.b[i2] = i;
            }
        }
        this.b[a] = i;
        this.a.v();
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        int a = this.a.a.a();
        int[] iArr = this.b;
        int i3 = iArr[i];
        int i4 = i + i2;
        int i5 = iArr[i4] - i3;
        System.arraycopy(iArr, i4, iArr, i, (a + 1) - i);
        if (i5 > 0) {
            this.a.d.subList(i3, i3 + i5).clear();
            while (i <= a) {
                int[] iArr2 = this.b;
                iArr2[i] = iArr2[i] - i5;
                i++;
            }
            this.a.z(i3, i5);
        }
        while (i3 < this.a.a()) {
            ArrayList arrayList = this.a.d;
            arrayList.set(i3, Integer.valueOf(((Integer) arrayList.get(i3)).intValue() - i2));
            i3++;
        }
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        g();
    }

    @Override // defpackage.ajnf
    public final void pc() {
        g();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        g();
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        int a = this.a.a.a();
        f();
        int[] iArr = this.b;
        int i3 = i + i2;
        System.arraycopy(iArr, i, iArr, i3, ((a + 1) - i) - i2);
        int i4 = this.b[i];
        int i5 = 0;
        while (i < i3) {
            Object c = this.a.a.c(i);
            int i6 = i4 + i5;
            this.b[i] = i6;
            if (this.a.b.a(c)) {
                this.a.d.add(i6, Integer.valueOf(i));
                i5++;
            }
            i++;
        }
        for (int i7 = i4 + i5; i7 < this.a.a(); i7++) {
            ArrayList arrayList = this.a.d;
            arrayList.set(i7, Integer.valueOf(((Integer) arrayList.get(i7)).intValue() + i2));
        }
        if (i5 > 0) {
            while (i3 <= a) {
                int[] iArr2 = this.b;
                iArr2[i3] = iArr2[i3] + i5;
                i3++;
            }
            this.a.y(i4, i5);
        }
    }
}
