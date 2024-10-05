package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahag implements Serializable, ahae {
    private static final int[] a = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int b = 1779033703;
    private int c = -1150833019;
    private int d = 1013904242;
    private int e = -1521486534;
    private int f = 1359893119;
    private int g = -1694144372;
    private int h = 528734635;
    private int i = 1541459225;
    private int j = 0;
    private final byte[] k = new byte[64];
    private final boolean l;

    public ahag(boolean z) {
        this.l = z;
    }

    private static final int e(int i, int i2) {
        int i3 = (1 << i2) - 1;
        return ((i & (i3 ^ (-1))) >>> i2) | ((i & i3) << (32 - i2));
    }

    @Override // defpackage.ahae
    public final int a() {
        int i = this.j;
        if (i <= 0) {
            return 0;
        }
        int i2 = ahah.c;
        return i - 1;
    }

    @Override // defpackage.ahae
    public final void b() {
        this.b = 1779033703;
        this.c = -1150833019;
        this.d = 1013904242;
        this.e = -1521486534;
        this.f = 1359893119;
        this.g = -1694144372;
        this.h = 528734635;
        this.i = 1541459225;
        this.j = 0;
    }

    @Override // defpackage.ahae
    public final void c(byte[] bArr, int i, int i2) {
        int i3;
        if (this.j == 0 && i2 > 0) {
            System.arraycopy(ahah.a, 0, this.k, 0, 1);
            this.j = 1;
        }
        int i4 = i2;
        while (i4 > 0) {
            int i5 = this.j % 64;
            int min = Math.min(64 - i5, i4);
            System.arraycopy(bArr, (i + i2) - i4, this.k, i5, min);
            this.j += min;
            i4 -= min;
            if (i5 + min == 64) {
                int[] iArr = new int[64];
                ByteBuffer wrap = ByteBuffer.wrap(this.k);
                int i6 = 0;
                while (true) {
                    if (i6 >= 16) {
                        break;
                    }
                    iArr[i6] = wrap.getInt();
                    i6++;
                }
                for (i3 = 16; i3 < 64; i3++) {
                    int i7 = i3 - 15;
                    int i8 = iArr[i7];
                    int i9 = iArr[i7];
                    int i10 = i3 - 2;
                    iArr[i3] = iArr[i3 - 16] + ((iArr[i7] >>> 3) ^ (e(i8, 7) ^ e(i9, 18))) + iArr[i3 - 7] + ((e(iArr[i10], 17) ^ e(iArr[i10], 19)) ^ (iArr[i10] >>> 10));
                }
                int i11 = this.b;
                int i12 = this.c;
                int i13 = this.d;
                int i14 = this.e;
                int i15 = this.f;
                int i16 = this.g;
                int i17 = this.h;
                int i18 = this.i;
                int i19 = 0;
                while (i19 < 64) {
                    int e = i18 + ((e(i15, 11) ^ e(i15, 6)) ^ e(i15, 25)) + ((i15 & i16) ^ ((i15 ^ (-1)) & i17)) + a[i19] + iArr[i19];
                    int i20 = i14 + e;
                    int e2 = ((e(i11, 2) ^ e(i11, 13)) ^ e(i11, 22)) + (((i11 & i12) ^ (i11 & i13)) ^ (i12 & i13)) + e;
                    i19++;
                    i18 = i17;
                    i17 = i16;
                    i16 = i15;
                    i15 = i20;
                    int i21 = i12;
                    i12 = i11;
                    i11 = e2;
                    i14 = i13;
                    i13 = i21;
                }
                this.b += i11;
                this.c += i12;
                this.d += i13;
                this.e += i14;
                this.f += i15;
                this.g += i16;
                this.h += i17;
                this.i += i18;
            }
        }
    }

    @Override // defpackage.ahae
    public final byte[] d() {
        int i = 64 - (this.j % 64);
        if (i < 9) {
            i += 64;
        }
        byte[] bArr = new byte[i];
        bArr[0] = Byte.MIN_VALUE;
        ByteBuffer.wrap(bArr).putLong(i - 8, this.j * 8);
        c(bArr, 0, i);
        if (this.l) {
            byte[] bArr2 = new byte[10];
            ByteBuffer.wrap(bArr2).putInt(this.b).putInt(this.c).putShort((short) (this.d >> 16));
            return bArr2;
        }
        byte[] bArr3 = new byte[32];
        ByteBuffer.wrap(bArr3).putInt(this.b).putInt(this.c).putInt(this.d).putInt(this.e).putInt(this.f).putInt(this.g).putInt(this.h).putInt(this.i);
        return bArr3;
    }
}
