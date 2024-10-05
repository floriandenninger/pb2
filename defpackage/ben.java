package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ben {
    public final int a;
    private final int[] b;
    private final asj[] c;
    private final int[][][] d;

    public ben(int[] iArr, asj[] asjVarArr, int[][][] iArr2) {
        this.b = iArr;
        this.c = asjVarArr;
        this.d = iArr2;
        this.a = iArr.length;
    }

    public final int a(int i) {
        return this.b[i];
    }

    public final int b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            if (this.b[i3] == i) {
                int[][] iArr = this.d[i3];
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    for (int i6 : iArr[i4]) {
                        int D = muf.D(i6);
                        int i7 = 2;
                        if (D == 0 || D == 1 || D == 2) {
                            i7 = 1;
                        } else if (D != 3) {
                            if (D != 4) {
                                throw new IllegalStateException();
                            }
                            i5 = 3;
                        }
                        i5 = Math.max(i5, i7);
                    }
                    i4++;
                }
                i2 = Math.max(i2, i5);
            }
        }
        return i2;
    }

    public final asj c(int i) {
        return this.c[i];
    }
}
