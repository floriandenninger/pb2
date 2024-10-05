package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyc {
    static final long a = TimeUnit.SECONDS.toMicros(5);
    public final afhf b;

    public adyc(afhf afhfVar) {
        afki.a(afhfVar);
        this.b = afhfVar;
    }

    public static void b(ate ateVar) {
        try {
            ateVar.j();
        } catch (IOException unused) {
        }
    }

    public static bdm c(bih bihVar) {
        return new bdm(bihVar, -1, null);
    }

    public final adyb a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (j3 <= 0 || j4 <= 0) {
            return null;
        }
        double d = j4;
        double d2 = j3;
        Double.isNaN(d2);
        Double.isNaN(d);
        long j5 = a;
        double d3 = j5;
        Double.isNaN(d3);
        long j6 = (long) ((d2 / d) * d3);
        double d4 = j5;
        Double.isNaN(d);
        Double.isNaN(d4);
        int ceil = (int) Math.ceil(d / d4);
        int[] iArr = new int[ceil];
        long[] jArr = new long[ceil];
        long[] jArr2 = new long[ceil];
        long[] jArr3 = new long[ceil];
        for (int i = 0; i < ceil; i++) {
            iArr[i] = (int) Math.min(j6, j3);
            long j7 = i;
            jArr[i] = j7 * j6;
            long j8 = a;
            jArr2[i] = Math.min(j4, j8);
            jArr3[i] = j7 * j8;
            j3 -= iArr[i];
            j4 -= jArr2[i];
        }
        return adyb.b(new bib(iArr, jArr, jArr2, jArr3));
    }
}
