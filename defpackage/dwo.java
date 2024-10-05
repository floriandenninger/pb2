package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dwo {
    private static final char[] a;

    static {
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    }

    @Deprecated
    public static String a(byte[] bArr) {
        int length = bArr.length;
        int i = ((length + 2) / 3) * 4;
        char[] cArr = a;
        int i2 = i + (i / Integer.MAX_VALUE);
        char[] cArr2 = new char[i2];
        int i3 = length - 2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            int i7 = ((bArr[i4] << 24) >>> 8) | ((bArr[i4 + 1] << 24) >>> 16) | ((bArr[i4 + 2] << 24) >>> 24);
            cArr2[i5] = cArr[i7 >>> 18];
            int i8 = i5 + 1;
            cArr2[i8] = cArr[(i7 >>> 12) & 63];
            cArr2[i5 + 2] = cArr[(i7 >>> 6) & 63];
            cArr2[i5 + 3] = cArr[i7 & 63];
            i6 += 4;
            if (i6 == Integer.MAX_VALUE) {
                cArr2[i5 + 4] = '\n';
                i5 = i8;
                i6 = 0;
            }
            i4 += 3;
            i5 += 4;
        }
        if (i4 < length) {
            int i9 = length - i4;
            int i10 = (i9 > 2 ? (bArr[i4 + 2] << 24) >>> 24 : 0) | (i9 > 0 ? (bArr[i4] << 24) >>> 8 : 0) | (i9 > 1 ? (bArr[i4 + 1] << 24) >>> 16 : 0);
            if (i9 == 1) {
                cArr2[i5] = cArr[i10 >>> 18];
                cArr2[i5 + 1] = cArr[(i10 >>> 12) & 63];
                cArr2[i5 + 2] = '=';
                cArr2[i5 + 3] = '=';
            } else if (i9 == 2) {
                cArr2[i5] = cArr[i10 >>> 18];
                cArr2[i5 + 1] = cArr[(i10 >>> 12) & 63];
                cArr2[i5 + 2] = cArr[(i10 >>> 6) & 63];
                cArr2[i5 + 3] = '=';
            } else if (i9 == 3) {
                cArr2[i5] = cArr[i10 >>> 18];
                cArr2[i5 + 1] = cArr[(i10 >>> 12) & 63];
                cArr2[i5 + 2] = cArr[(i10 >>> 6) & 63];
                cArr2[i5 + 3] = cArr[i10 & 63];
            }
            if (i6 + 4 == Integer.MAX_VALUE) {
                cArr2[i5 + 4] = '\n';
            }
        }
        while (i2 > 0) {
            int i11 = i2 - 1;
            if (cArr2[i11] != '=') {
                break;
            }
            i2 = i11;
        }
        return new String(cArr2, 0, i2);
    }
}
