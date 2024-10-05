package defpackage;

import java.util.Arrays;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdb {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public bdb() {
        this(new Random());
    }

    public final int a() {
        return this.b.length;
    }

    public final bdb b(int i) {
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            iArr[i3] = this.a.nextInt(this.b.length + 1);
            int i4 = i3 + 1;
            int nextInt = this.a.nextInt(i4);
            iArr2[i3] = iArr2[nextInt];
            iArr2[nextInt] = i3;
            i3 = i4;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.b.length + i];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr4 = this.b;
            if (i2 < iArr4.length + i) {
                if (i5 >= i || i6 != iArr[i5]) {
                    int i7 = i6 + 1;
                    int i8 = iArr4[i6];
                    iArr3[i2] = i8;
                    if (i8 >= 0) {
                        iArr3[i2] = i8 + i;
                    }
                    i6 = i7;
                } else {
                    iArr3[i2] = iArr2[i5];
                    i5++;
                }
                i2++;
            } else {
                return new bdb(iArr3, new Random(this.a.nextLong()));
            }
        }
    }

    public bdb(Random random) {
        this(new int[0], random);
    }

    public bdb(int[] iArr, Random random) {
        this.b = iArr;
        this.a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.c[iArr[i]] = i;
        }
    }
}
