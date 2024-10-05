package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wdr {
    public final Uri a;
    public final MessageDigest b;
    public final long c;

    private wdr(Uri uri, MessageDigest messageDigest, long j) {
        this.b = messageDigest;
        this.a = uri;
        this.c = j;
    }

    public static wdr a(ContentResolver contentResolver, Uri uri) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(contentResolver.openInputStream(uri), 8192);
            DigestInputStream digestInputStream = null;
            try {
                DigestInputStream digestInputStream2 = new DigestInputStream(bufferedInputStream, messageDigest);
                try {
                    byte[] bArr = new byte[8192];
                    long j = 0;
                    while (true) {
                        int read = digestInputStream2.read(bArr);
                        if (read < 0) {
                            wdr wdrVar = new wdr(uri, digestInputStream2.getMessageDigest(), j);
                            digestInputStream2.close();
                            return wdrVar;
                        }
                        j += read;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = null;
                    digestInputStream = digestInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (digestInputStream != null) {
                        digestInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
