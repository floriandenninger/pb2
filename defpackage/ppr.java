package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ppr implements ppw {
    private final long a;
    private final amru b;

    public ppr(long j, amru amruVar) {
        this.a = j;
        this.b = amruVar;
    }

    @Override // defpackage.ppw
    public final int a() {
        return 1;
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        return this.a > j ? 0 : -1;
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        pse.e(i == 0);
        return this.a;
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        return j >= this.a ? this.b : amru.q();
    }
}
