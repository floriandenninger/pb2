package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anbe {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static anbe e(int i) {
        return new anbd(i);
    }

    public abstract int a();

    public abstract boolean b(anbe anbeVar);

    public abstract byte[] c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (obj instanceof anbe) {
            anbe anbeVar = (anbe) obj;
            anbeVar.d();
            if (b(anbeVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a();
    }

    public final String toString() {
        byte[] c = c();
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 4; i++) {
            byte b = c[i];
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
