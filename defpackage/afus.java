package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afus extends afun {
    private final ContentResolver a;

    public afus(ContentResolver contentResolver, afvq afvqVar) {
        super(afvqVar);
        this.a = contentResolver;
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
    public String a() {
        return "content";
    }

    @Override // defpackage.afun
    public final void b(Uri uri, ykl yklVar) {
        InputStream inputStream = null;
        try {
            inputStream = this.a.openInputStream(uri);
            byte[] bArr = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    yklVar.b(uri, byteArrayOutputStream.toByteArray());
                    return;
                }
            }
        } catch (IOException e) {
            yklVar.a(uri, e);
        } finally {
            d(inputStream);
        }
    }
}
