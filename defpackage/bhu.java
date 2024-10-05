package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhu implements biz {
    public final bhx a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public bhu(bhx bhxVar, long j, long j2, long j3, long j4, long j5) {
        this.a = bhxVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.biz
    public final long a() {
        return this.f;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        bja bjaVar = new bja(j, bhw.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new bix(bjaVar, bjaVar);
    }

    @Override // defpackage.biz
    public final boolean c() {
        return true;
    }
}
