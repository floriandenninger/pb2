package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aanc {
    public static final int[] a = {7680, 5120, 3840, 2560, 1920, 1280, 854, 640, 428, 256};
    public static final int[] b = {4320, 2880, 2160, 1440, 1080, 720, 480, 360, 240, 144};

    public static int a(int i, int i2) {
        if (i > 3840 || i2 > 2160) {
            return -1;
        }
        for (int i3 = 3; i3 < 10; i3++) {
            if (i > a[i3] || i2 > b[i3]) {
                return b[i3 - 1];
            }
        }
        return (i > 0 || i2 > 0) ? 144 : -1;
    }
}
