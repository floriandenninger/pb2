package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aekc implements aeku {
    zgd a;
    final long b;
    private boolean c;

    aekc() {
        this(0L);
    }

    @Override // defpackage.aeku
    public final synchronized int a(long j, int i, byte[] bArr, int i2) {
        if (j > 2147483647L) {
            afsi.b(2, 8, "position_greater_than_int_max_value");
            return 0;
        }
        if (j > ((aekb) this.a.get()).size()) {
            afsi.b(2, 8, "position_greater_than_size");
            return 0;
        }
        int min = Math.min((int) (((aekb) this.a.get()).size() - j), i);
        ((aekb) this.a.get()).a((int) j, min, bArr, i2);
        return min;
    }

    @Override // defpackage.aeku
    public final long b() {
        return this.b;
    }

    @Override // defpackage.aeku
    public final synchronized void c() {
        this.c = true;
    }

    @Override // defpackage.aeku
    public final synchronized void d(byte[] bArr, int i, int i2, aelt aeltVar) {
        ((aekb) this.a.get()).write(bArr, i, i2);
    }

    @Override // defpackage.aeku
    public final synchronized boolean e(long j) {
        return ((long) ((aekb) this.a.get()).size()) > j;
    }

    @Override // defpackage.aeku
    public final synchronized boolean f() {
        return this.c;
    }

    public aekc(long j) {
        this.a = new aeka();
        this.c = false;
        this.b = j;
    }
}
