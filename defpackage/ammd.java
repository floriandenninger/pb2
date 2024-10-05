package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ammd implements ammy {
    public static ammd d(char c, char c2) {
        return new amlw(c, c2);
    }

    public static String e(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    public static void g(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                charSequence.charAt(0);
            } else if (length == 2) {
                new amly(charSequence.charAt(0), charSequence.charAt(1));
            } else {
                new amlt(charSequence);
            }
        }
    }

    @Override // defpackage.ammy
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public final int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        amkq.W(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (b(charSequence.charAt(length)));
        return false;
    }
}
