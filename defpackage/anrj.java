package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anrj {
    private static final ThreadLocal a = new anri();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
