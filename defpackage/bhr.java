package defpackage;

import androidx.media3.common.DrmInitData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhr {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            int i5 = f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b2 = bArr[7];
        if ((b2 & 254) != 186) {
            return 0;
        }
        return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
    }

    public static pms c(pth pthVar, String str, String str2, DrmInitData drmInitData) {
        int i = b[(pthVar.i() & 192) >> 6];
        int i2 = pthVar.i();
        int i3 = d[(i2 & 56) >> 3];
        if ((i2 & 4) != 0) {
            i3++;
        }
        pmr pmrVar = new pmr();
        pmrVar.a = str;
        pmrVar.k = "audio/ac3";
        pmrVar.x = i3;
        pmrVar.y = i;
        pmrVar.n = drmInitData;
        pmrVar.c = str2;
        return pmrVar.a();
    }

    public static pms d(pth pthVar, String str, String str2, DrmInitData drmInitData) {
        pthVar.H(2);
        int i = b[(pthVar.i() & 192) >> 6];
        int i2 = pthVar.i();
        int i3 = d[(i2 & 14) >> 1];
        if ((i2 & 1) != 0) {
            i3++;
        }
        if (((pthVar.i() & 30) >> 1) > 0 && (2 & pthVar.i()) != 0) {
            i3 += 2;
        }
        String str3 = (pthVar.a() <= 0 || (pthVar.i() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        pmr pmrVar = new pmr();
        pmrVar.a = str;
        pmrVar.k = str3;
        pmrVar.x = i3;
        pmrVar.y = i;
        pmrVar.n = drmInitData;
        pmrVar.c = str2;
        return pmrVar.a();
    }
}
