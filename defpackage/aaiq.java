package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaiq extends Exception {
    public final int a;
    public volatile boolean b;
    public final int c;
    public final int d;

    private aaiq(Throwable th, int i, int i2, int i3) {
        super(th);
        this.b = false;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public static aaiq a(Throwable th, int i) {
        return b(th, -1, i, 5);
    }

    public static aaiq b(Throwable th, int i, int i2, int i3) {
        if (th instanceof aaiq) {
            return (aaiq) th;
        }
        return new aaiq(th, i, i2, i3);
    }

    public static aaiq c(Throwable th, int i) {
        return b(th, i, 4, 5);
    }
}
