package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pqv {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final pqq d;
    public final pqp e;
    public final pqu f;
    public Bitmap g;

    public pqv(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new pqq(719, 575, 0, 719, 0, 575);
        this.e = new pqp(0, f(), g(), h());
        this.f = new pqu(i2, i3);
    }

    public static pqp a(ptg ptgVar, int i2) {
        int d;
        int d2;
        int i3;
        int i4;
        int i5 = 8;
        int d3 = ptgVar.d(8);
        ptgVar.l(8);
        int i6 = i2 - 2;
        int[] f = f();
        int[] g = g();
        int[] h2 = h();
        while (i6 > 0) {
            int d4 = ptgVar.d(i5);
            int d5 = ptgVar.d(i5);
            int i7 = i6 - 2;
            int[] iArr = (d5 & 128) != 0 ? f : (d5 & 64) != 0 ? g : h2;
            if ((d5 & 1) != 0) {
                i3 = ptgVar.d(i5);
                i4 = ptgVar.d(i5);
                d = ptgVar.d(i5);
                d2 = ptgVar.d(i5);
                i6 = i7 - 4;
            } else {
                int d6 = ptgVar.d(6) << 2;
                int d7 = ptgVar.d(4) << 4;
                i6 = i7 - 2;
                d = ptgVar.d(4) << 4;
                d2 = ptgVar.d(2) << 6;
                i3 = d6;
                i4 = d7;
            }
            if (i3 == 0) {
                d2 = PrivateKeyType.INVALID;
            }
            if (i3 == 0) {
                d = 0;
            }
            int i8 = d3;
            if (i3 == 0) {
                i4 = 0;
            }
            double d8 = i3;
            double d9 = i4 - 128;
            double d10 = d - 128;
            byte b = (byte) (255 - (d2 & PrivateKeyType.INVALID));
            Double.isNaN(d9);
            Double.isNaN(d8);
            int c = pts.c((int) (d8 + (1.402d * d9)), 0, PrivateKeyType.INVALID);
            Double.isNaN(d10);
            Double.isNaN(d8);
            Double.isNaN(d9);
            int c2 = pts.c((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, PrivateKeyType.INVALID);
            Double.isNaN(d10);
            Double.isNaN(d8);
            iArr[d4] = d(b, c, c2, pts.c((int) (d8 + (d10 * 1.772d)), 0, PrivateKeyType.INVALID));
            d3 = i8;
            i5 = 8;
        }
        return new pqp(d3, f, g, h2);
    }

    public static pqr b(ptg ptgVar) {
        int d = ptgVar.d(16);
        ptgVar.l(4);
        int d2 = ptgVar.d(2);
        boolean n = ptgVar.n();
        ptgVar.l(1);
        byte[] bArr = pts.f;
        byte[] bArr2 = pts.f;
        if (d2 == 1) {
            ptgVar.l(ptgVar.d(8) * 16);
        } else if (d2 == 0) {
            int d3 = ptgVar.d(16);
            int d4 = ptgVar.d(16);
            if (d3 > 0) {
                bArr = new byte[d3];
                ptgVar.p(bArr, d3);
            }
            if (d4 > 0) {
                bArr2 = new byte[d4];
                ptgVar.p(bArr2, d4);
            } else {
                bArr2 = bArr;
            }
        }
        return new pqr(d, n, bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b A[LOOP:2: B:41:0x00ab->B:52:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0228 A[LOOP:3: B:87:0x016f->B:98:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0222 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqv.c(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static int d(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static byte[] e(int i2, int i3, ptg ptgVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ptgVar.d(i3);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(PrivateKeyType.INVALID, 1 != (i2 & 1) ? 0 : PrivateKeyType.INVALID, (i2 & 2) != 0 ? PrivateKeyType.INVALID : 0, (i2 & 4) != 0 ? PrivateKeyType.INVALID : 0);
            } else {
                iArr[i2] = d(PrivateKeyType.INVALID, 1 != (i2 & 1) ? 0 : 127, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = PrivateKeyType.INVALID;
            if (i2 < 8) {
                int i4 = 1 != (i2 & 1) ? 0 : PrivateKeyType.INVALID;
                int i5 = (i2 & 2) != 0 ? PrivateKeyType.INVALID : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = d(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                if (i6 == 0) {
                    iArr[i2] = d(PrivateKeyType.INVALID, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i2] = d(127, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i2] = d(PrivateKeyType.INVALID, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = d(PrivateKeyType.INVALID, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }
}
