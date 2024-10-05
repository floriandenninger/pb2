package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dzi {
    static boolean a = false;
    public static MessageDigest b;
    private static final Object d = new Object();
    private static final Object e = new Object();
    public static final CountDownLatch c = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(dvo dvoVar, String str) {
        byte[] g;
        byte[] byteArray = dvoVar.toByteArray();
        if (((Boolean) pyi.r.e()).booleanValue()) {
            Vector e2 = e(byteArray);
            if (e2 == null || e2.size() == 0) {
                g = g(f().toByteArray(), str, true);
            } else {
                aone createBuilder = dvt.a.createBuilder();
                int size = e2.size();
                for (int i = 0; i < size; i++) {
                    createBuilder.f(aomf.x(g((byte[]) e2.get(i), str, false)));
                }
                aomf x = aomf.x(c(byteArray));
                createBuilder.copyOnWrite();
                dvt dvtVar = (dvt) createBuilder.instance;
                dvtVar.b |= 1;
                dvtVar.d = x;
                g = ((dvt) createBuilder.build()).toByteArray();
            }
        } else {
            if (esv.d == null) {
                throw new GeneralSecurityException();
            }
            byte[] a2 = esv.d.a(byteArray, str != null ? str.getBytes() : new byte[0]);
            aone createBuilder2 = dvt.a.createBuilder();
            createBuilder2.f(aomf.x(a2));
            createBuilder2.copyOnWrite();
            dvt dvtVar2 = (dvt) createBuilder2.instance;
            dvtVar2.e = 2;
            dvtVar2.b |= 4;
            g = ((dvt) createBuilder2.build()).toByteArray();
        }
        return esv.l(g, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        synchronized (e) {
            if (!a) {
                a = true;
                new Thread(new bqc(2, (char[]) null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = defpackage.dzi.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(byte[] r6) {
        /*
            java.lang.Object r0 = defpackage.dzi.d
            monitor-enter(r0)
            b()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = defpackage.dzi.c     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = defpackage.dzi.b     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = defpackage.dzi.b     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzi.c(byte[]):byte[]");
    }

    public static byte[] d(String str, String str2) {
        byte[] m;
        aone createBuilder = dvp.a.createBuilder();
        try {
            if (str.length() < 3) {
                m = str.getBytes("ISO-8859-1");
            } else {
                m = esv.m(str, true);
            }
            aomf x = aomf.x(m);
            createBuilder.copyOnWrite();
            dvp dvpVar = (dvp) createBuilder.instance;
            dvpVar.b |= 1;
            dvpVar.c = x;
            aomf x2 = aomf.x(str2.length() < 3 ? str2.getBytes("ISO-8859-1") : esv.m(str2, true));
            createBuilder.copyOnWrite();
            dvp dvpVar2 = (dvp) createBuilder.instance;
            dvpVar2.b |= 2;
            dvpVar2.d = x2;
            return ((dvp) createBuilder.build()).toByteArray();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    static Vector e(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i = (length + 254) / PrivateKeyType.INVALID;
        Vector vector = new Vector();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * PrivateKeyType.INVALID;
            try {
                int length2 = bArr.length;
                if (length2 - i3 > 255) {
                    length2 = i3 + PrivateKeyType.INVALID;
                }
                vector.add(Arrays.copyOfRange(bArr, i3, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static dvo f() {
        aone createBuilder = dvo.a.createBuilder();
        createBuilder.copyOnWrite();
        dvo dvoVar = (dvo) createBuilder.instance;
        dvoVar.b |= 524288;
        dvoVar.p = 4096L;
        return (dvo) createBuilder.build();
    }

    private static byte[] g(byte[] bArr, String str, boolean z) {
        byte[] array;
        int i = true != z ? PrivateKeyType.INVALID : 239;
        if (bArr.length > i) {
            bArr = f().toByteArray();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        dzj[] dzjVarArr = new dzw().cG;
        int length2 = dzjVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            dzjVarArr[i2].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            aofp aofpVar = new aofp(str.getBytes("UTF-8"));
            int i3 = aofpVar.b;
            int i4 = aofpVar.c;
            for (int i5 = 0; i5 < 256; i5++) {
                i3 = (i3 + 1) & PrivateKeyType.INVALID;
                byte[] bArr4 = aofpVar.a;
                byte b2 = bArr4[i3];
                i4 = (i4 + b2) & PrivateKeyType.INVALID;
                bArr4[i3] = bArr4[i4];
                bArr4[i4] = b2;
                bArr3[i5] = (byte) (bArr4[(bArr4[i3] + b2) & PrivateKeyType.INVALID] ^ bArr3[i5]);
            }
            aofpVar.b = i3;
            aofpVar.c = i4;
        }
        return bArr3;
    }
}
