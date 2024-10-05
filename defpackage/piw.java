package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class piw implements piy {
    public pix c;
    public int d;
    private int h;
    private long i;
    final long[] e = new long[1];
    final double[] f = new double[1];
    final String[] g = new String[1];
    private byte[] j = new byte[8];
    public final ArrayDeque a = new ArrayDeque();
    public final pje b = new pje();

    private final boolean b(pit pitVar, int i, long[] jArr) {
        if (!pitVar.i(this.j, 0, i)) {
            return false;
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.j[i2] & 255);
        }
        jArr[0] = j;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x040c, code lost:
    
        throw defpackage.pnr.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x06b1, code lost:
    
        if (r4 != 7) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x00c3, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.piy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.pit r28) {
        /*
            Method dump skipped, instructions count: 2798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.piw.a(pit):boolean");
    }
}
