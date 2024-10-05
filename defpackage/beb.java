package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class beb implements bel {
    protected final asi a;
    protected final int b;
    public final int[] c;
    private final pms[] d;
    private final long[] e;
    private int f;

    public beb(asi asiVar, int... iArr) {
        this(asiVar, iArr, null);
    }

    @Override // defpackage.ask
    public final int a(int i) {
        return this.c[i];
    }

    @Override // defpackage.ask
    public final int b(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ask
    public final int c(pms pmsVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == pmsVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ask
    public final int d() {
        return this.c.length;
    }

    @Override // defpackage.ask
    public final asi e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            beb bebVar = (beb) obj;
            if (this.a == bebVar.a && Arrays.equals(this.c, bebVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ask
    public final pms f(int i) {
        return this.d[i];
    }

    @Override // defpackage.bel
    public int g(long j, List list) {
        return list.size();
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        this.f = identityHashCode;
        return identityHashCode;
    }

    @Override // defpackage.bel
    public void l() {
    }

    @Override // defpackage.bel
    public void m() {
    }

    @Override // defpackage.bel
    public void n(float f) {
    }

    @Override // defpackage.bel
    public final pms p() {
        return this.d[h()];
    }

    @Override // defpackage.bel
    public boolean q(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean r = r(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.b) {
                if (r) {
                    break;
                }
                r = (i2 == i || r(i2, elapsedRealtime)) ? false : true;
                i2++;
            } else if (!r) {
                return false;
            }
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], pts.ai(elapsedRealtime, j));
        return true;
    }

    @Override // defpackage.bel
    public boolean r(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.bel
    public final /* synthetic */ void s() {
    }

    public beb(asi asiVar, int[] iArr, byte[] bArr) {
        int length = iArr.length;
        pse.g(length > 0);
        pse.c(asiVar);
        this.a = asiVar;
        this.b = length;
        this.d = new pms[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = asiVar.a(iArr[i]);
        }
        Arrays.sort(this.d, bea.a);
        this.c = new int[this.b];
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i2 >= i3) {
                this.e = new long[i3];
                return;
            }
            int[] iArr2 = this.c;
            pms pmsVar = this.d[i2];
            int i4 = 0;
            while (true) {
                pms[] pmsVarArr = asiVar.b;
                if (i4 >= pmsVarArr.length) {
                    i4 = -1;
                    break;
                } else if (pmsVar == pmsVarArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }
}
