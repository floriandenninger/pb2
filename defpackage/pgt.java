package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgt {
    private static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] i = {44100, 48000, 32000};
    private static final int[] j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
    private static final int[] l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
    private static final int[] m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
    private static final int[] n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? j[i5 - 1] : k[i5 - 1]) * 12000) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
        } else {
            i7 = n[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144000) / i8) + i9;
        }
        return (((i4 == 1 ? 72000 : 144000) * i7) / i8) + i9;
    }

    public static boolean b(int i2, pgt pgtVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = i[i6];
        if (i3 == 2) {
            i10 /= 2;
        } else if (i3 == 0) {
            i10 /= 4;
        }
        int i11 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            i7 = i3 == 3 ? j[i5 - 1] : k[i5 - 1];
            i8 = (((i7 * 12000) / i10) + i11) * 4;
            i9 = 384;
        } else {
            if (i3 == 3) {
                i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
                i8 = i11 + ((144000 * i7) / i10);
                i9 = 1152;
            } else {
                i7 = n[i5 - 1];
                int i12 = i4 == 1 ? 576 : 1152;
                i8 = i11 + (((i4 == 1 ? 72000 : 144000) * i7) / i10);
                i9 = i12;
            }
        }
        String str = h[3 - i4];
        int i13 = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        pgtVar.a = i3;
        pgtVar.b = str;
        pgtVar.c = i8;
        pgtVar.d = i10;
        pgtVar.e = i13;
        pgtVar.f = i7 * 1000;
        pgtVar.g = i9;
        return true;
    }
}
