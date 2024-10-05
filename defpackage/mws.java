package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mws extends uu {
    private final int c;

    public mws(int i) {
        this.c = i;
    }

    @Override // defpackage.uu
    public final int a(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        return (i - 1) % i2;
    }

    @Override // defpackage.uu
    public final int b(int i) {
        if (i == 0) {
            return this.c;
        }
        return 1;
    }

    @Override // defpackage.uu
    public final int c(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        return ((i - 1) / i2) + 1;
    }
}
