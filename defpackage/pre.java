package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pre implements ppw {
    private final List a;
    private final List b;

    public pre(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ppw
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        int aj = pts.aj(this.b, Long.valueOf(j));
        if (aj < this.b.size()) {
            return aj;
        }
        return -1;
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        pse.e(i >= 0);
        pse.e(i < this.b.size());
        return ((Long) this.b.get(i)).longValue();
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        int al = pts.al(this.b, Long.valueOf(j));
        if (al == -1) {
            return Collections.emptyList();
        }
        return (List) this.a.get(al);
    }
}
