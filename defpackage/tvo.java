package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tvo {
    public final int a;
    public final String b;
    public final String c;
    public final Throwable d;
    public final int e;

    public tvo(int i, int i2, String str, String str2, Throwable th) {
        this.e = i;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = th;
    }

    public static tvo a(int i, Throwable th) {
        return new tvo(i, -1, th.getMessage(), null, th);
    }

    public static tvo b(int i) {
        return new tvo(i, -1, null, null, null);
    }

    public static tvo c(String str) {
        return new tvo(3, -1, str, null, null);
    }
}
