package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class yxu {
    public static final /* synthetic */ int a = 0;

    static {
        int i = yxx.b;
    }

    public static int a(yxx yxxVar, yxw yxwVar) {
        return (int) yxxVar.f(yxwVar);
    }

    public static int b(int i, int i2) {
        return i | (i2 << 16) | 268435456;
    }

    public static int c(int i, int i2) {
        return i | (i2 << 16);
    }

    public static int d(int i) {
        return (char) i;
    }

    public static long e(int i) {
        if (((i >>> 16) & 4095) >= 64) {
            return -1L;
        }
        return (1 << r4) - 1;
    }

    public static boolean f(int i) {
        return (i & 268435456) == 0;
    }
}
