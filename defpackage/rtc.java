package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rtc {
    public static final amsx a = amsx.u(13, 207, 103, 407);
    public static final amsx b = amsx.u(14, 203, 110, 403);
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    private rtc(int i, int i2, String str, int i3) {
        this.e = i;
        this.f = i2;
        this.c = str;
        this.d = i3;
    }

    public static rtc a(int i, String str) {
        str.getClass();
        return new rtc(1, i, str, 0);
    }

    public static rtc b(int i) {
        return new rtc(2, 2, null, i);
    }

    public static rtc c(int i, int i2) {
        return new rtc(3, i, null, i2);
    }
}
