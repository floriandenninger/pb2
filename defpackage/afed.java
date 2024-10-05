package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afed extends afdy {
    public boolean d;
    public long e;
    private long f;

    public afed(ozt oztVar, afdw afdwVar, int i, Handler handler, ozr ozrVar, int i2, int i3, pbh pbhVar, boolean z) {
        super(oztVar, afdwVar, i, handler, ozrVar, i2, i3, pbhVar);
        this.d = z;
    }

    @Override // defpackage.afdy, defpackage.ozs, defpackage.oyq
    public final int b(int i, long j, oyn oynVar, oyp oypVar) {
        if (this.d) {
            long a = this.a.a();
            if (this.a.h((-30000) + j) && this.f <= 0) {
                this.e += this.a.a() - a;
            }
        }
        int b = super.b(i, j, oynVar, oypVar);
        long j2 = this.f;
        if (j2 > 0 && oypVar != null && oypVar.e >= j2) {
            this.f = 0L;
        }
        return b;
    }

    @Override // defpackage.ozs, defpackage.oyq
    public final void k(long j) {
        this.f = j;
        super.k(j);
    }
}
