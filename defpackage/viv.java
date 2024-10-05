package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class viv implements vis {
    long a = 0;

    @Override // defpackage.vis
    public final aobc a() {
        aone createBuilder = aobc.a.createBuilder();
        long j = this.a;
        createBuilder.copyOnWrite();
        aobc aobcVar = (aobc) createBuilder.instance;
        aobcVar.b = 1;
        aobcVar.c = Long.valueOf(j);
        return (aobc) createBuilder.build();
    }

    @Override // defpackage.vis
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
