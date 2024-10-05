package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psg {
    public static final byte[] a = {0, 0, 0, 1};
    private static final String[] b = {"", "A", "B", "C"};

    public static Pair a(byte[] bArr) {
        pth pthVar = new pth(bArr);
        pthVar.G(9);
        int i = pthVar.i();
        pthVar.G(20);
        return Pair.create(Integer.valueOf(pthVar.l()), Integer.valueOf(i));
    }

    public static String b(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String c(pti ptiVar) {
        ptiVar.f(24);
        int a2 = ptiVar.a(2);
        boolean g = ptiVar.g();
        int a3 = ptiVar.a(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (ptiVar.g()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = ptiVar.a(8);
        }
        int a4 = ptiVar.a(8);
        Object[] objArr = new Object[5];
        objArr[0] = b[a2];
        objArr[1] = Integer.valueOf(a3);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(true != g ? 'L' : 'H');
        objArr[4] = Integer.valueOf(a4);
        StringBuilder sb = new StringBuilder(pts.D("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (iArr[i5] != 0) {
                break;
            }
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }
}
