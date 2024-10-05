package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bkk {
    public final int d;

    public bkk(int i) {
        this.d = i;
    }

    public static int e(int i) {
        return i & 16777215;
    }

    public static int f(int i) {
        return (i >> 24) & PrivateKeyType.INVALID;
    }

    public static String g(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 16) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 8) & PrivateKeyType.INVALID));
        sb.append((char) (i & PrivateKeyType.INVALID));
        return sb.toString();
    }

    public String toString() {
        return g(this.d);
    }
}
