package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdx {
    public static final aomw a;
    private static final Field b = c();

    static {
        aomw c = aomw.c();
        c.e(awob.b);
        a = c;
    }

    public static byte[] a(aqrf aqrfVar) {
        InputStream m = ((aomf) aqrfVar.pX(awkc.a)).m();
        Field field = b;
        byte[] bArr = null;
        if (field != null && (m instanceof ByteArrayInputStream)) {
            try {
                bArr = (byte[]) field.get(m);
            } catch (IllegalAccessException unused) {
            }
        }
        return bArr != null ? bArr : ((aomf) aqrfVar.pX(awkc.a)).I();
    }

    public static void b(aong aongVar, awos awosVar) {
        byte[] byteArray = awosVar.toByteArray();
        try {
            byte[] bArr = new byte[aomp.ac(172660663) + aomp.H(byteArray)];
            aomp ak = aomp.ak(bArr);
            int length = byteArray.length;
            ((aomn) ak).B(172660663, 2);
            ((aomn) ak).G(byteArray, length);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to compose Element extension", e);
        }
    }

    private static Field c() {
        try {
            Field declaredField = ByteArrayInputStream.class.getDeclaredField("buf");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
