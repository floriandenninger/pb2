package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bht {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    private bht(List list, int i, int i2, int i3, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static bht a(pth pthVar) {
        String str;
        int i;
        int i2;
        float f;
        try {
            pthVar.H(4);
            int i3 = (pthVar.i() & 3) + 1;
            if (i3 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int i4 = pthVar.i() & 31;
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(b(pthVar));
            }
            int i6 = pthVar.i();
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(b(pthVar));
            }
            if (i4 > 0) {
                pta c = ptb.c((byte[]) arrayList.get(0), i3, ((byte[]) arrayList.get(0)).length);
                int i8 = c.e;
                int i9 = c.f;
                float f2 = c.g;
                str = psg.b(c.a, c.b, c.c);
                i = i8;
                i2 = i9;
                f = f2;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new bht(arrayList, i3, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw pnr.a("Error parsing AVC config", e);
        }
    }

    private static byte[] b(pth pthVar) {
        int m = pthVar.m();
        int i = pthVar.b;
        pthVar.H(m);
        byte[] bArr = pthVar.a;
        byte[] bArr2 = psg.a;
        byte[] bArr3 = new byte[m + 4];
        System.arraycopy(psg.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, m);
        return bArr3;
    }
}
