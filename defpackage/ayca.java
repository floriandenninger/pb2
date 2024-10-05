package defpackage;

import java.util.BitSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayca {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        c = bitSet;
    }

    public ayca(String str, boolean z) {
        str.getClass();
        this.d = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        amkq.F(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            if (!c.get(charAt)) {
                throw new IllegalArgumentException(amkq.z("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
            i++;
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(amme.a);
    }

    public static ayca c(String str, ayby aybyVar) {
        return new aybx(str, aybyVar);
    }

    public static ayca d(String str, boolean z, aycc ayccVar) {
        return new aycb(str, z, ayccVar);
    }

    public static ayca e(String str, ayaw ayawVar) {
        return new aybz(str);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ayca) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("Key{name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
