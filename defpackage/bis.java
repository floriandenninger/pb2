package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bis {
    public final List a;
    public final int b;
    public final String c;

    private bis(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public static bis a(pth pthVar) {
        try {
            pthVar.H(21);
            int i = pthVar.i() & 3;
            int i2 = pthVar.i();
            int i3 = pthVar.b;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                pthVar.H(1);
                int m = pthVar.m();
                for (int i6 = 0; i6 < m; i6++) {
                    int m2 = pthVar.m();
                    i4 += m2 + 4;
                    pthVar.H(m2);
                }
            }
            pthVar.G(i3);
            byte[] bArr = new byte[i4];
            String str = null;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = pthVar.i() & 127;
                int m3 = pthVar.m();
                int i10 = 0;
                while (i10 < m3) {
                    int m4 = pthVar.m();
                    System.arraycopy(ptb.a, 0, bArr, i7, 4);
                    int i11 = i7 + 4;
                    System.arraycopy(pthVar.a, pthVar.b, bArr, i11, m4);
                    if (i9 == 33 && i10 == 0) {
                        str = psg.c(new pti(bArr, i11, i11 + m4));
                        i10 = 0;
                    }
                    i7 = i11 + m4;
                    pthVar.H(m4);
                    i10++;
                }
            }
            return new bis(i4 == 0 ? null : Collections.singletonList(bArr), i + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw pnr.a("Error parsing HEVC config", e);
        }
    }
}
