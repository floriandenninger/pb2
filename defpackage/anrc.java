package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrc {
    public final byte[] a;

    public anrc(int i, ahli ahliVar) {
        int i2;
        double d;
        ahli ahliVar2 = ahliVar;
        this.a = new byte[i + i];
        double d2 = i - 1;
        int i3 = 0;
        double d3 = 0.0d;
        int i4 = 0;
        while (true) {
            i2 = i >> 2;
            d = 65279.0d;
            if (i3 >= i2) {
                break;
            }
            d3 = ahliVar2.a(i3, d2) * 65279.0d;
            byte[] bArr = this.a;
            int i5 = i4 + 1;
            bArr[i4] = (byte) (d3 / 256.0d);
            i4 = i5 + 1;
            bArr[i5] = (byte) (d3 % 256.0d);
            i3++;
        }
        int i6 = i2 + 3;
        while (i6 < i) {
            double a = ((ahliVar2.a(i6, d2) * d) - d3) / 4.0d;
            byte[] bArr2 = this.a;
            int i7 = i4 + 1;
            bArr2[i4] = (byte) (r7 / 256.0d);
            int i8 = i7 + 1;
            bArr2[i7] = (byte) (r7 % 256.0d);
            int i9 = i8 + 1;
            double d4 = d2;
            bArr2[i8] = (byte) (r7 / 256.0d);
            int i10 = i9 + 1;
            bArr2[i9] = (byte) (r7 % 256.0d);
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (r7 / 256.0d);
            int i12 = i11 + 1;
            bArr2[i11] = (byte) (r7 % 256.0d);
            d3 = d3 + a + a + a + a;
            int i13 = i12 + 1;
            bArr2[i12] = (byte) (d3 / 256.0d);
            i4 = i13 + 1;
            bArr2[i13] = (byte) (d3 % 256.0d);
            i6 += 4;
            ahliVar2 = ahliVar;
            d2 = d4;
            d = 65279.0d;
        }
        double d5 = d2;
        for (int i14 = i6 - 3; i14 < i; i14++) {
            double a2 = ahliVar.a(i14, d5) * 65279.0d;
            byte[] bArr3 = this.a;
            int i15 = i4 + 1;
            bArr3[i4] = (byte) (a2 / 256.0d);
            i4 = i15 + 1;
            bArr3[i15] = (byte) (a2 % 256.0d);
        }
    }

    public anrc(byte[] bArr) {
        this.a = bArr;
    }

    public static anrc a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new anrc(bArr, bArr.length);
    }

    public final byte[] b() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private anrc(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }
}
