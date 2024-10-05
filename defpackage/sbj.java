package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbj extends sbd {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public sbj(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.sbd
    public final Double a() {
        return (Double) this.b.get(this.c);
    }

    @Override // defpackage.sbd
    public final Double b() {
        return (Double) this.a.get(this.c);
    }
}
