package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pax extends paw {
    final List d;

    public pax(pas pasVar, long j, long j2, int i, long j3, List list, List list2) {
        super(pasVar, j, j2, i, j3, list);
        this.d = list2;
    }

    @Override // defpackage.paw
    public final int a(long j) {
        return (this.a + this.d.size()) - 1;
    }

    @Override // defpackage.paw
    public final pas c(pav pavVar, int i) {
        return (pas) this.d.get(i - this.a);
    }

    @Override // defpackage.paw
    public final boolean d() {
        return true;
    }
}
