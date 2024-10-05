package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afva extends afun {
    public afva(afvq afvqVar) {
        super(afvqVar);
    }

    private static final void d(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.afun
    public final String a() {
        return "file";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    @Override // defpackage.afun
    public final void b(Uri uri, ykl yklVar) {
        BufferedInputStream bufferedInputStream;
        Exception e;
        String path = uri.getPath();
        File file = new File(path);
        ?? exists = file.exists();
        if (exists != 0) {
            InputStream inputStream = null;
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 4096);
                    try {
                        int length = (int) file.length();
                        byte[] bArr = new byte[length];
                        int i = 0;
                        int i2 = 0;
                        while (i >= 0 && i2 < length) {
                            i2 += i;
                            i = bufferedInputStream.read(bArr, i2, length - i2);
                        }
                        if (i2 == length) {
                            yklVar.b(uri, bArr);
                        } else {
                            yklVar.a(uri, new IOException("Number of bytes read doesn't match file length."));
                        }
                        d(bufferedInputStream);
                    } catch (IOException e2) {
                        e = e2;
                        yklVar.a(uri, e);
                        d(bufferedInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = exists;
                    d(inputStream);
                    throw th;
                }
            } catch (IOException e3) {
                bufferedInputStream = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                d(inputStream);
                throw th;
            }
        } else {
            yklVar.a(uri, new FileNotFoundException(path));
        }
    }
}
