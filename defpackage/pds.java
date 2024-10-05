package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pds extends pdz {
    private pgn e;
    private pgm f;
    private boolean g;

    @Override // defpackage.pdz
    public final int a(pbw pbwVar, tfq tfqVar) {
        int i;
        long j = pbwVar.c;
        if (!this.b.a(pbwVar, this.a)) {
            return -1;
        }
        pgx pgxVar = this.a;
        byte[] bArr = pgxVar.a;
        if (this.e == null) {
            this.e = new pgn(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, this.a.c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            pgn pgnVar = this.e;
            int i2 = pgnVar.e;
            int i3 = pgnVar.c;
            this.c.d(MediaFormat.b(null, "audio/x-flac", i2 * i3, -1, (pgnVar.f * 1000000) / i3, pgnVar.d, i3, singletonList, null));
        } else {
            byte b = bArr[0];
            if (b != -1) {
                if ((b & Byte.MAX_VALUE) == 3 && this.f == null) {
                    pgxVar.A(1);
                    int i4 = pgxVar.i() / 18;
                    long[] jArr = new long[i4];
                    long[] jArr2 = new long[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        jArr[i5] = pgxVar.m();
                        jArr2[i5] = pgxVar.m();
                        pgxVar.A(2);
                    }
                    this.f = new pgm(jArr, jArr2);
                }
            } else {
                if (!this.g) {
                    pgm pgmVar = this.f;
                    if (pgmVar != null) {
                        this.d.pK(new pgl(pgmVar, r3.c, j));
                        this.f = null;
                    } else {
                        this.d.pK(pcm.f);
                    }
                    this.g = true;
                }
                pcn pcnVar = this.c;
                pgx pgxVar2 = this.a;
                pcnVar.f(pgxVar2, pgxVar2.c);
                this.a.z(0);
                pgn pgnVar2 = this.e;
                pgx pgxVar3 = this.a;
                pgxVar3.A(4);
                long j2 = pgxVar3.a[pgxVar3.b];
                int i6 = 7;
                while (true) {
                    if (i6 < 0) {
                        break;
                    }
                    if (((1 << i6) & j2) != 0) {
                        i6--;
                    } else if (i6 < 6) {
                        j2 &= r13 - 1;
                        i = 7 - i6;
                    } else if (i6 == 7) {
                        i = 1;
                    }
                }
                i = 0;
                if (i != 0) {
                    for (int i7 = 1; i7 < i; i7++) {
                        if ((pgxVar3.a[pgxVar3.b + i7] & 192) != 128) {
                            StringBuilder sb = new StringBuilder(62);
                            sb.append("Invalid UTF-8 sequence continuation byte: ");
                            sb.append(j2);
                            throw new NumberFormatException(sb.toString());
                        }
                        j2 = (j2 << 6) | (r6 & 63);
                    }
                    pgxVar3.b += i;
                    int i8 = pgnVar2.a;
                    if (i8 == pgnVar2.b) {
                        j2 *= i8;
                    }
                    this.c.g((j2 * 1000000) / pgnVar2.c, 1, this.a.c, 0, null);
                } else {
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("Invalid UTF-8 sequence first byte: ");
                    sb2.append(j2);
                    throw new NumberFormatException(sb2.toString());
                }
            }
        }
        this.a.v();
        return 0;
    }
}
