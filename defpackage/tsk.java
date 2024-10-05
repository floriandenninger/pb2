package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsk {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static void b(vcw vcwVar, tkt tktVar, Uri uri, String str) {
        try {
            if (!vcwVar.h(uri)) {
                tsx.e("%s: Downloaded file %s is not present at %s", "FileValidator", rwh.aP(tktVar), uri);
                tkj a2 = tkl.a();
                a2.a = tkk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw a2.a();
            }
            int bq = rwh.bq(tktVar.f);
            if (bq != 0 && bq == 2) {
                return;
            }
            if (c(vcwVar, uri, str)) {
                return;
            }
            tsx.e("%s: Downloaded file at uri = %s, checksum = %s verification failed", "FileValidator", uri, str);
            tkj a3 = tkl.a();
            a3.a = tkk.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw a3.a();
        } catch (IOException e) {
            tsx.f(e, "%s: Failed to validate download file %s", "FileValidator", rwh.aP(tktVar));
            tkj a4 = tkl.a();
            a4.a = tkk.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            a4.c = e;
            throw a4.a();
        }
    }

    public static boolean c(vcw vcwVar, Uri uri, String str) {
        String a2;
        String str2 = "";
        try {
            InputStream inputStream = (InputStream) vcwVar.c(uri, veg.b());
            try {
                MessageDigest d = d();
                if (d == null) {
                    a2 = "";
                } else {
                    byte[] bArr = new byte[8192];
                    for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                        d.update(bArr, 0, read);
                    }
                    a2 = a(d.digest());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                str2 = a2;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            tsx.d("%s: Failed to open file, uri = %s", "FileValidator", uri);
        }
        return str2.equals(str);
    }

    public static MessageDigest d() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest != null) {
                return messageDigest;
            }
            return null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
