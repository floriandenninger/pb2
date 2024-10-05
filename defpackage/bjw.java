package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjw {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final bkb c = new bkb();
    public int d;
    public int e;
    public long f;
    public bjx g;

    public final long a(bii biiVar, int i) {
        biiVar.k(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }
}
