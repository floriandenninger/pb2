package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoqk {
    public static final boolean a;
    public static final boolean b;
    static final long c;
    static final boolean d;
    private static final Unsafe e;
    private static final Class f;
    private static final boolean g;
    private static final boolean h;
    private static final aoqj i;
    private static final long j;

    /* JADX WARN: Removed duplicated region for block: B:15:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
    static {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoqk.<clinit>():void");
    }

    private aoqk() {
    }

    private static int A(Class cls) {
        if (b) {
            return i.j(cls);
        }
        return -1;
    }

    private static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void C(Class cls) {
        if (b) {
            i.r(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(long j2) {
        return i.a(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double b(Object obj, long j2) {
        return i.b(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(Object obj, long j2) {
        return i.c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Object obj, long j2) {
        return i.k(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(ByteBuffer byteBuffer) {
        return i.l(byteBuffer, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long f(Object obj, long j2) {
        return i.l(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long g(Field field) {
        return i.m(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Class cls) {
        try {
            return e.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object i(Object obj, long j2) {
        return i.n(obj, j2);
    }

    public static Field j() {
        Field B = B(Buffer.class, "effectiveDirectAddress");
        if (B != null) {
            return B;
        }
        Field B2 = B(Buffer.class, "address");
        if (B2 == null || B2.getType() != Long.TYPE) {
            return null;
        }
        return B2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new aoqg());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(long j2, byte[] bArr, long j3, long j4) {
        i.d(j2, bArr, j3, j4);
    }

    public static void m(Throwable th) {
        Logger logger = Logger.getLogger(aoqk.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(Object obj, long j2, boolean z) {
        i.e(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(byte[] bArr, long j2, byte b2) {
        i.f(bArr, c + j2, b2);
    }

    public static void p(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        t(obj, j3, ((b2 & 255) << i2) | (d(obj, j3) & ((PrivateKeyType.INVALID << i2) ^ (-1))));
    }

    public static void q(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        t(obj, j3, ((b2 & 255) << i2) | (d(obj, j3) & ((PrivateKeyType.INVALID << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(Object obj, long j2, double d2) {
        i.g(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(Object obj, long j2, float f2) {
        i.h(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(Object obj, long j2, int i2) {
        i.o(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(Object obj, long j2, long j3) {
        i.p(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(Object obj, long j2, Object obj2) {
        i.q(obj, j2, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean w(Class cls) {
        try {
            Class cls2 = f;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x(Object obj, long j2) {
        return i.i(obj, j2);
    }

    public static boolean y(Object obj, long j2) {
        return ((byte) ((d(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & PrivateKeyType.INVALID)) != 0;
    }

    public static boolean z(Object obj, long j2) {
        return ((byte) ((d(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & PrivateKeyType.INVALID)) != 0;
    }
}
