package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybe {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final anbp b = aycd.b;

    public static int a(aycd aycdVar) {
        return aycdVar.d;
    }

    public static ayca b(String str, aybd aybdVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return ayca.d(str, z, aybdVar);
    }

    public static aycd c(byte[]... bArr) {
        return new aycd(bArr.length >> 1, bArr);
    }

    public static aycd d(int i, Object[] objArr) {
        return new aycd(i, objArr);
    }

    public static Object[] e(aycd aycdVar) {
        Object[] objArr = new Object[aycdVar.a()];
        for (int i = 0; i < aycdVar.d; i++) {
            int i2 = i + i;
            objArr[i2] = aycdVar.g(i);
            int i3 = i2 + 1;
            Object c = aycdVar.c(i);
            if (c instanceof byte[]) {
                objArr[i3] = c;
            } else {
                throw null;
            }
        }
        return objArr;
    }

    public static byte[][] f(aycd aycdVar) {
        byte[][] bArr = new byte[aycdVar.a()];
        Object[] objArr = aycdVar.c;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, aycdVar.a());
        } else {
            for (int i = 0; i < aycdVar.d; i++) {
                int i2 = i + i;
                bArr[i2] = aycdVar.g(i);
                bArr[i2 + 1] = aycdVar.h(i);
            }
        }
        return bArr;
    }
}
