package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class blb implements biz {
    final /* synthetic */ blc a;

    public blb(blc blcVar) {
        this.a = blcVar;
    }

    @Override // defpackage.biz
    public final long a() {
        blc blcVar = this.a;
        return blcVar.c.d(blcVar.d);
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        long e = this.a.c.e(j);
        blc blcVar = this.a;
        bja bjaVar = new bja(j, pts.m((((e * (r3 - r5)) / blcVar.d) + r5) - 30000, blcVar.a, (-1) + blcVar.b));
        return new bix(bjaVar, bjaVar);
    }

    @Override // defpackage.biz
    public final boolean c() {
        return true;
    }
}
