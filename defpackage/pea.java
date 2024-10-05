package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pea {
    public final byte[] a;
    private final int b;
    private int c;
    private int d;

    public pea(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.b = length * 8;
    }

    public final int a() {
        return (this.c * 8) + this.d;
    }

    public final int b(int i) {
        int i2;
        int i3;
        opn.k(a() + i <= this.b);
        if (i == 0) {
            return 0;
        }
        int i4 = this.d;
        if (i4 != 0) {
            i2 = Math.min(i, 8 - i4);
            byte[] bArr = this.a;
            int i5 = this.c;
            byte b = bArr[i5];
            int i6 = this.d;
            i3 = (b >>> i6) & (PrivateKeyType.INVALID >>> (8 - i2));
            int i7 = i6 + i2;
            this.d = i7;
            if (i7 == 8) {
                this.c = i5 + 1;
                this.d = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i8 = i - i2;
        if (i8 > 7) {
            int i9 = i8 >> 3;
            for (int i10 = 0; i10 < i9; i10++) {
                byte[] bArr2 = this.a;
                this.c = this.c + 1;
                i3 = (int) (((bArr2[r7] & 255) << i2) | i3);
                i2 += 8;
            }
        }
        if (i <= i2) {
            return i3;
        }
        int i11 = i - i2;
        byte b2 = this.a[this.c];
        this.d += i11;
        return (((PrivateKeyType.INVALID >>> (8 - i11)) & b2) << i2) | i3;
    }

    public final void c(int i) {
        opn.k(a() + i <= this.b);
        int i2 = this.c + (i / 8);
        this.c = i2;
        int i3 = this.d + (i % 8);
        this.d = i3;
        if (i3 > 7) {
            this.c = i2 + 1;
            this.d = i3 - 8;
        }
    }

    public final boolean d() {
        return b(1) == 1;
    }
}
