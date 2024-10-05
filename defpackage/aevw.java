package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aevw {
    final bbr a;
    bav c;
    boolean d;
    pou e;
    long b = 0;
    long f = -1;

    public aevw(bbr bbrVar) {
        this.a = bbrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        long j = this.f;
        if (j == -1) {
            return Long.MIN_VALUE;
        }
        return j * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(long j) {
        afki.b(j >= 0);
        if (this.b == j) {
            return false;
        }
        this.b = j;
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(long j) {
        afki.b(j > 0 || j == -1);
        if (this.f != j) {
            this.f = j;
            bav bavVar = this.c;
            if (bavVar != null) {
                bavVar.n(0L, a());
                return true;
            }
        }
        return false;
    }
}
