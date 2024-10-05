package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afej implements afel {
    public final int a;
    final aenf b;
    final long c;
    final long d;

    public afej(int i, int i2, int i3, aenf aenfVar) {
        this.a = i3;
        this.b = aenfVar;
        if (i == -1) {
            if (i2 == -1) {
                this.c = 11000000L;
                this.d = 10000000L;
                return;
            }
            i = -1;
        }
        if (i == -1) {
            this.c = Long.MAX_VALUE;
        } else {
            this.c = i >= 0 ? i * 1000 : 11000000L;
        }
        if (i2 == -1) {
            this.d = Long.MAX_VALUE;
        } else if (i2 < 0) {
            this.d = 10000000L;
        } else {
            this.d = i2 * 1000;
        }
    }

    @Override // defpackage.afel
    public final int a(int i, bib bibVar) {
        if (i < 0 || bibVar == null) {
            return this.a;
        }
        long max = Math.max(this.b.e(), 1L);
        long j = 0;
        int i2 = i;
        long j2 = 0;
        while (i2 < bibVar.a) {
            long j3 = (bibVar.b[i2] * 8000000) / max;
            j += bibVar.d[i2];
            if (j > this.c) {
                break;
            }
            j2 += j3;
            if (j2 > this.d) {
                break;
            }
            i2++;
        }
        return Math.max(i2 - i, 1);
    }
}
