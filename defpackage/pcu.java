package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pcu implements pcw {
    private final long a;
    private final int b;
    private final long c;

    public pcu(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2 != -1 ? d(j2) : -1L;
    }

    @Override // defpackage.pcw
    public final long a() {
        return this.c;
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        if (this.c == -1) {
            return 0L;
        }
        return this.a + ((j * this.b) / 8000000);
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return this.c != -1;
    }

    @Override // defpackage.pcw
    public final long d(long j) {
        return (Math.max(0L, j - this.a) * 8000000) / this.b;
    }
}
