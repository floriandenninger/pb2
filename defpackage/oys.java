package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class oys extends oyx {
    private final oyq[] a = new oyq[1];
    private int[] b;
    private int[] c;
    private oyq d;
    private int e;
    private long f;

    public oys(oyr... oyrVarArr) {
        for (int i = 0; i <= 0; i++) {
            this.a[i] = oyrVarArr[i].f();
        }
    }

    private final long l(long j) {
        long d = this.d.d(this.e);
        if (d == Long.MIN_VALUE) {
            return j;
        }
        r(d);
        return d;
    }

    private static final void n(oyq oyqVar) {
        try {
            oyqVar.i();
        } catch (IOException e) {
            throw new oxh(e);
        }
    }

    protected abstract void A(long j, long j2, boolean z);

    protected abstract boolean E(MediaFormat mediaFormat);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int J(long j, oyn oynVar, oyp oypVar) {
        return this.d.b(this.e, j, oynVar, oypVar);
    }

    protected long K(long j) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void L() {
        for (int i = 0; i <= 0; i++) {
            this.a[i].j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public long b() {
        return this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final long c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final MediaFormat d(int i) {
        return this.a[this.b[i]].e(this.c[i]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void e(long j, long j2) {
        long K = K(j);
        A(l(K), j2, this.d.l(this.e, K));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void f() {
        oyq oyqVar = this.d;
        if (oyqVar != null) {
            n(oyqVar);
            return;
        }
        for (int i = 0; i <= 0; i++) {
            n(this.a[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void g(long j) {
        long K = K(j);
        this.d.k(K);
        l(K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean j() {
        boolean z = true;
        for (char c = 0; c <= 0; c = 1) {
            z &= this.a[0].m();
        }
        if (!z) {
            return false;
        }
        int i = 0;
        for (char c2 = 0; c2 <= 0; c2 = 1) {
            i += this.a[0].a();
        }
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        long j = 0;
        int i2 = 0;
        for (char c3 = 0; c3 <= 0; c3 = 1) {
            oyq oyqVar = this.a[0];
            int a = oyqVar.a();
            for (int i3 = 0; i3 < a; i3++) {
                MediaFormat e = oyqVar.e(i3);
                try {
                    if (E(e)) {
                        iArr[i2] = 0;
                        iArr2[i2] = i3;
                        i2++;
                        if (j != -1) {
                            long j2 = e.e;
                            if (j2 == -1) {
                                j = -1;
                            } else if (j2 != -2) {
                                j = Math.max(j, j2);
                            }
                        }
                    }
                } catch (oyd e2) {
                    throw new oxh(e2);
                }
            }
        }
        this.f = j;
        this.b = Arrays.copyOf(iArr, i2);
        this.c = Arrays.copyOf(iArr2, i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final int pF() {
        return this.c.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public void pG(int i, long j, boolean z) {
        long K = K(j);
        oyq oyqVar = this.a[this.b[i]];
        this.d = oyqVar;
        int i2 = this.c[i];
        this.e = i2;
        oyqVar.h(i2, K);
        r(K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public void q() {
        this.d.g(this.e);
        this.d = null;
    }

    protected abstract void r(long j);
}
