package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayom {
    public static volatile aomw a = aomw.a();

    public static long a(InputStream inputStream, OutputStream outputStream) {
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static aycf b(aooy aooyVar) {
        return new ayol(aooyVar);
    }

    public static void c(aomw aomwVar) {
        aomwVar.getClass();
        a = aomwVar;
    }
}
