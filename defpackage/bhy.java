package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhy {
    public static final bhy a = new bhy(-3, -9223372036854775807L, -1);
    public final int b;
    public final long c;
    public final long d;

    private bhy(int i, long j, long j2) {
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public static bhy a(long j, long j2) {
        return new bhy(-1, j, j2);
    }

    public static bhy b(long j) {
        return new bhy(0, -9223372036854775807L, j);
    }

    public static bhy c(long j, long j2) {
        return new bhy(-2, j, j2);
    }
}
