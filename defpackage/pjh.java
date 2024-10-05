package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
class pjh {
    public final int d;

    public pjh(int i) {
        this.d = i;
    }

    public static int c(int i) {
        return i & 16777215;
    }

    public static int d(int i) {
        return (i >> 24) & PrivateKeyType.INVALID;
    }

    public static String e(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 16) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 8) & PrivateKeyType.INVALID));
        sb.append((char) (i & PrivateKeyType.INVALID));
        return sb.toString();
    }

    public String toString() {
        return e(this.d);
    }
}
