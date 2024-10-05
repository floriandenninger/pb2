package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zib {
    public static MessageDigest a;

    static {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            a = messageDigest;
            messageDigest.reset();
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("Fatal error: system missing SHA-256 implementation.");
        }
    }

    private zib() {
    }
}
