package defpackage;

import java.io.EOFException;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdy {
    private static final int a = pgz.c("OggS");

    public static void a(pdx pdxVar, int i, pdw pdwVar) {
        int i2;
        pdwVar.b = 0;
        pdwVar.a = 0;
        do {
            int i3 = pdwVar.b;
            int i4 = i + i3;
            if (i4 >= pdxVar.c) {
                return;
            }
            int[] iArr = pdxVar.f;
            pdwVar.b = i3 + 1;
            i2 = iArr[i4];
            pdwVar.a += i2;
        } while (i2 == 255);
    }

    public static void b(pbw pbwVar) {
        int i;
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j = pbwVar.b;
            if (j != -1) {
                long j2 = pbwVar.c;
                if (i2 + j2 > j && (i2 = (int) (j - j2)) < 4) {
                    throw new EOFException();
                }
            }
            int i3 = 0;
            pbwVar.l(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        pbwVar.j(i3);
                        return;
                    }
                    i3++;
                }
            }
            pbwVar.j(i);
        }
    }

    public static boolean c(pbw pbwVar, pdx pdxVar, pgx pgxVar, boolean z) {
        pgxVar.v();
        pdxVar.a();
        long j = pbwVar.b;
        if ((j != -1 && j - pbwVar.d() < 27) || !pbwVar.l(pgxVar.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        }
        if (pgxVar.n() != a) {
            if (z) {
                return false;
            }
            throw new oyo("expected OggS capture pattern at begin of page");
        }
        if (pgxVar.h() != 0) {
            if (z) {
                return false;
            }
            throw new oyo("unsupported bit stream revision");
        }
        pdxVar.a = pgxVar.h();
        byte[] bArr = pgxVar.a;
        int i = pgxVar.b;
        int i2 = i + 1;
        pgxVar.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        pgxVar.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        pgxVar.b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        pgxVar.b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        pgxVar.b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        pgxVar.b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        pgxVar.b = i8;
        byte b7 = bArr[i7];
        pgxVar.b = i8 + 1;
        pdxVar.b = ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48) | ((bArr[i8] & 255) << 56);
        pgxVar.l();
        pgxVar.l();
        pgxVar.l();
        pdxVar.c = pgxVar.h();
        pgxVar.v();
        int i9 = pdxVar.c;
        pdxVar.d = i9 + 27;
        pbwVar.g(pgxVar.a, 0, i9);
        for (int i10 = 0; i10 < pdxVar.c; i10++) {
            pdxVar.f[i10] = pgxVar.h();
            pdxVar.e += pdxVar.f[i10];
        }
        return true;
    }

    public static int d(byte b, int i) {
        return (b >> 1) & (PrivateKeyType.INVALID >>> (8 - i));
    }
}
