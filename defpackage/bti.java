package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bti {
    final long[] a;
    final boolean[] b;

    public bti(int i) {
        long[] jArr = new long[i];
        this.a = jArr;
        boolean[] zArr = new boolean[i];
        this.b = zArr;
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }
}
