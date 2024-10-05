package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aoqu implements aoqs {
    public static long c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(amme.c));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static aoqs d(long j, aopf aopfVar) {
        return new aoqt(j, aopfVar);
    }

    public abstract long a();

    public abstract aopf b();
}
