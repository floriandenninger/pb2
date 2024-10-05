package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anbp {
    public static final anbp d = new anbm("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final anbp e = new anbm("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final anbp f;

    static {
        new anbo("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new anbo("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f = new anbl(new anbk("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void c(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract anbp f();

    public CharSequence g(CharSequence charSequence) {
        throw null;
    }

    public final String i(byte[] bArr) {
        int length = bArr.length;
        amkq.M(0, length, length);
        StringBuilder sb = new StringBuilder(e(length));
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] j(CharSequence charSequence) {
        try {
            CharSequence g = g(charSequence);
            int d2 = d(g.length());
            byte[] bArr = new byte[d2];
            int a = a(bArr, g);
            if (a == d2) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (anbn e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
