package defpackage;

import java.util.Random;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uuh extends uuj {
    private final Random a;
    private final shf b;
    private final long c;
    private final utx d;

    public uuh(bacs bacsVar, Random random, utx utxVar, shf shfVar) {
        super(bacsVar);
        this.a = random;
        this.c = bacsVar.c;
        this.d = utxVar;
        this.b = shfVar;
    }

    @Override // defpackage.uuj
    public final long a(String str) {
        long j;
        if (ammx.e(str)) {
            j = this.c;
        } else {
            utx utxVar = this.d;
            long d = this.b.d() - utxVar.d;
            if (d >= 14400000) {
                long j2 = d / 14400000;
                long max = Math.max(j2, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = utxVar.a;
                    int i2 = (int) max;
                    int i3 = sArr[i] >> i2;
                    sArr[i] = (short) i3;
                    utxVar.b[i] = (short) (i3 >> i2);
                }
                utxVar.d += j2 * 14400000;
            }
            int hashCode = str.hashCode() * utxVar.c;
            int charAt = ((hashCode >>> 24) + (str.isEmpty() ? (char) 0 : str.charAt(0))) & PrivateKeyType.INVALID;
            int length = ((hashCode >>> 16) + str.length()) & PrivateKeyType.INVALID;
            int min = Math.min((int) utxVar.a[charAt], (int) utxVar.b[length]);
            int i4 = min + 1;
            short min2 = (short) Math.min(32767, i4);
            short[] sArr2 = utxVar.a;
            if (sArr2[charAt] == min) {
                sArr2[charAt] = min2;
            }
            short[] sArr3 = utxVar.b;
            if (sArr3[length] == min) {
                sArr3[length] = min2;
            }
            double sqrt = i4 < 50 ? Math.sqrt(i4) : i4;
            double d2 = this.c;
            Double.isNaN(d2);
            j = (int) (d2 / sqrt);
        }
        if (this.a.nextDouble() * 1000.0d < j) {
            return j;
        }
        return -1L;
    }

    @Override // defpackage.uuj
    public final bacs b(Long l) {
        return c() ? e(l) : d();
    }

    @Override // defpackage.uuj
    public final boolean c() {
        return this.c > 0;
    }
}
