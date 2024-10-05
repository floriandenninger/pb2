package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbd implements bda {
    protected final bda[] a;

    public bbd(bda[] bdaVarArr) {
        this.a = bdaVarArr;
    }

    @Override // defpackage.bda
    public final long c() {
        long j = Long.MAX_VALUE;
        for (bda bdaVar : this.a) {
            long c = bdaVar.c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.bda
    public final long jJ() {
        long j = Long.MAX_VALUE;
        for (bda bdaVar : this.a) {
            long jJ = bdaVar.jJ();
            if (jJ != Long.MIN_VALUE) {
                j = Math.min(j, jJ);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.bda
    public final void m(long j) {
        for (bda bdaVar : this.a) {
            bdaVar.m(j);
        }
    }

    @Override // defpackage.bda
    public final boolean o(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long c = c();
            if (c == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (bda bdaVar : this.a) {
                long c2 = bdaVar.c();
                boolean z3 = c2 != Long.MIN_VALUE && c2 <= j;
                if (c2 == c || z3) {
                    z |= bdaVar.o(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.bda
    public final boolean p() {
        for (bda bdaVar : this.a) {
            if (bdaVar.p()) {
                return true;
            }
        }
        return false;
    }
}
