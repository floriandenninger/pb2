package defpackage;

import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pcv {
    private static final int a = pgz.c("ID3");
    private static final Charset[] b = {Charset.forName("ISO-8859-1"), Charset.forName("UTF-16LE"), Charset.forName("UTF-16BE"), Charset.forName("UTF-8")};

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00df, code lost:
    
        if (r14.a() < r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pch a(defpackage.pbw r17) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcv.a(pbw):pch");
    }

    private static void b(pgx pgxVar, boolean z) {
        int i;
        pgxVar.z(0);
        byte[] bArr = pgxVar.a;
        while (pgxVar.a() >= 10 && pgxVar.c() != 0) {
            int j = z ? pgxVar.j() : pgxVar.g();
            int k = pgxVar.k();
            if ((k & 1) != 0) {
                int i2 = pgxVar.b;
                System.arraycopy(bArr, i2 + 4, bArr, i2, pgxVar.a() - 4);
                j -= 4;
                i = k & (-2);
                pgxVar.y(pgxVar.c - 4);
            } else {
                i = k;
            }
            if ((i & 2) != 0) {
                int i3 = pgxVar.b + 1;
                int i4 = i3;
                int i5 = 0;
                while (true) {
                    i5++;
                    if (i5 >= j) {
                        break;
                    }
                    if ((bArr[i3 - 1] & 255) == 255 && bArr[i3] == 0) {
                        i3++;
                        j--;
                    }
                    bArr[i4] = bArr[i3];
                    i4++;
                    i3++;
                }
                pgxVar.y(pgxVar.c - (i3 - i4));
                System.arraycopy(bArr, i3, bArr, i4, pgxVar.a() - i3);
                i &= -3;
            }
            if (i != k || z) {
                int i6 = pgxVar.b - 6;
                bArr[i6] = (byte) ((j >> 21) & 127);
                bArr[i6 + 1] = (byte) ((j >> 14) & 127);
                bArr[i6 + 2] = (byte) ((j >> 7) & 127);
                bArr[i6 + 3] = (byte) (j & 127);
                bArr[i6 + 4] = (byte) (i >> 8);
                bArr[i6 + 5] = (byte) (i & PrivateKeyType.INVALID);
            }
            pgxVar.A(j);
        }
    }

    private static boolean c(pgx pgxVar, boolean z) {
        pgxVar.z(0);
        while (pgxVar.a() >= 10 && pgxVar.c() != 0) {
            long n = pgxVar.n();
            if (!z) {
                if ((8421504 & n) != 0) {
                    return false;
                }
                n = (((n >> 24) & 127) << 21) | (n & 127) | (((n >> 8) & 127) << 7) | (((n >> 16) & 127) << 14);
            }
            if (n > pgxVar.a() - 2) {
                return false;
            }
            if ((1 & pgxVar.k()) != 0 && pgxVar.a() < 4) {
                return false;
            }
            pgxVar.A((int) n);
        }
        return true;
    }
}
