package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class biy implements biz, bkf {
    private final long a;
    private final bix b;

    public biy(long j) {
        this(j, 0L);
    }

    @Override // defpackage.biz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        return this.b;
    }

    @Override // defpackage.biz
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bkf
    public final long e() {
        return -1L;
    }

    @Override // defpackage.bkf
    public final long f(long j) {
        return 0L;
    }

    public biy(long j, long j2) {
        this.a = j;
        bja bjaVar = j2 == 0 ? bja.a : new bja(0L, j2);
        this.b = new bix(bjaVar, bjaVar);
    }

    public biy() {
        this(-9223372036854775807L);
    }
}
