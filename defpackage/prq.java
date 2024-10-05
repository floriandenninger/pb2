package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class prq implements ppw {
    public static final prq a = new prq();
    private final List b;

    private prq() {
        this.b = Collections.emptyList();
    }

    @Override // defpackage.ppw
    public final int a() {
        return 1;
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        pse.e(i == 0);
        return 0L;
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }

    public prq(ppp pppVar) {
        this.b = Collections.singletonList(pppVar);
    }
}
