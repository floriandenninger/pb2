package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class badb implements badh {
    private final bacw a;
    private final bacu b;
    private bade c;
    private int d;
    private boolean e;
    private long f;

    public badb(bacw bacwVar) {
        this.a = bacwVar;
        bacu bacuVar = ((badd) bacwVar).a;
        this.b = bacuVar;
        bade badeVar = bacuVar.a;
        this.c = badeVar;
        this.d = badeVar != null ? badeVar.b : -1;
    }

    @Override // defpackage.badh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // defpackage.badh
    public final long e(bacu bacuVar, long j) {
        bade badeVar;
        bade badeVar2;
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        bade badeVar3 = this.c;
        if (badeVar3 == null || (badeVar3 == (badeVar2 = this.b.a) && this.d == badeVar2.b)) {
            if (!this.a.n(this.f + 1)) {
                return -1L;
            }
            if (this.c == null && (badeVar = this.b.a) != null) {
                this.c = badeVar;
                this.d = badeVar.b;
            }
            long min = Math.min(8192L, this.b.b - this.f);
            bacu bacuVar2 = this.b;
            long j2 = this.f;
            badi.a(bacuVar2.b, j2, min);
            if (min != 0) {
                bacuVar.b += min;
                bade badeVar4 = bacuVar2.a;
                while (true) {
                    long j3 = badeVar4.c - badeVar4.b;
                    if (j2 < j3) {
                        break;
                    }
                    j2 -= j3;
                    badeVar4 = badeVar4.f;
                }
                long j4 = min;
                while (j4 > 0) {
                    bade b = badeVar4.b();
                    int i = (int) (b.b + j2);
                    b.b = i;
                    b.c = Math.min(i + ((int) j4), b.c);
                    bade badeVar5 = bacuVar.a;
                    if (badeVar5 == null) {
                        b.g = b;
                        b.f = b;
                        bacuVar.a = b;
                    } else {
                        badeVar5.g.d(b);
                    }
                    j4 -= b.c - b.b;
                    badeVar4 = badeVar4.f;
                    j2 = 0;
                }
            }
            this.f += min;
            return min;
        }
        throw new IllegalStateException("Peek source is invalid because upstream source was used");
    }
}
