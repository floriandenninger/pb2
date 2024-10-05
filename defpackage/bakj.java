package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bakj extends bakf implements Serializable, bakb {
    private static final bakb a = new baki();
    private static final long serialVersionUID = -2110953284060001145L;
    private final bajy b;
    private final int[] c;

    /* JADX INFO: Access modifiers changed from: protected */
    public bakj(long j) {
        this.b = bajy.d();
        int[] M = bale.n.M(a, j);
        int[] iArr = new int[8];
        this.c = iArr;
        System.arraycopy(M, 0, iArr, 4, 4);
    }

    @Override // defpackage.bakb
    public final int b(int i) {
        return this.c[i];
    }

    @Override // defpackage.bakb
    public final bajy e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bakj() {
        bajy g = bajk.g();
        bajf d = bajk.d(null);
        this.b = g;
        this.c = d.M(this, 0L);
    }
}
