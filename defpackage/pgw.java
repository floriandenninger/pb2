package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgw {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public pgw() {
    }

    public pgw(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public pgw(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    private final void g() {
        int i;
        int i2;
        int i3 = this.b;
        boolean z = true;
        if (i3 < 0 || (i = this.c) < 0 || i >= 8 || (i3 >= (i2 = this.d) && (i3 != i2 || i != 0))) {
            z = false;
        }
        opn.k(z);
    }

    public final int a(int i) {
        int i2;
        int i3;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = this.c;
            if (i7 != 0) {
                byte[] bArr = this.a;
                int i8 = this.b;
                i3 = ((bArr[i8 + 1] & 255) >>> (8 - i7)) | ((bArr[i8] & 255) << i7);
            } else {
                i3 = this.a[this.b];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.b++;
        }
        if (i > 0) {
            int i9 = this.c + i;
            byte b = (byte) (PrivateKeyType.INVALID >> (8 - i));
            if (i9 > 8) {
                byte[] bArr2 = this.a;
                int i10 = this.b;
                int i11 = i10 + 1;
                i2 = (b & (((255 & bArr2[i11]) >> (16 - i9)) | ((bArr2[i10] & 255) << (i9 - 8)))) | i5;
                this.b = i11;
            } else {
                byte[] bArr3 = this.a;
                int i12 = this.b;
                i2 = (b & ((255 & bArr3[i12]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.b = i12 + 1;
                }
            }
            i5 = i2;
            this.c = i9 % 8;
        }
        g();
        return i5;
    }

    public final int b() {
        int i = 0;
        while (!f()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? a(i) : 0);
    }

    public final int c() {
        int b = b();
        return (b % 2 == 0 ? -1 : 1) * ((b + 1) / 2);
    }

    public final void d(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        g();
    }

    public final void e(int i) {
        int i2 = this.b + (i / 8);
        this.b = i2;
        int i3 = this.c + (i % 8);
        this.c = i3;
        if (i3 > 7) {
            this.b = i2 + 1;
            this.c = i3 - 8;
        }
        g();
    }

    public final boolean f() {
        return a(1) == 1;
    }
}
