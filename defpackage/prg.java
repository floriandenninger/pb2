package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class prg implements ppw {
    private final ppp[] a;
    private final long[] b;

    public prg(ppp[] pppVarArr, long[] jArr) {
        this.a = pppVarArr;
        this.b = jArr;
    }

    @Override // defpackage.ppw
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        int ak = pts.ak(this.b, j, false);
        if (ak < this.b.length) {
            return ak;
        }
        return -1;
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        pse.e(i >= 0);
        pse.e(i < this.b.length);
        return this.b[i];
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        int an = pts.an(this.b, j, false);
        if (an == -1 || this.a[an] == ppp.a) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.a[an]);
    }
}
