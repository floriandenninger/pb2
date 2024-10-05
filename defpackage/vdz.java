package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdz {
    public final vcw a;
    public final Uri b;

    public vdz(vcw vcwVar, Uri uri) {
        this.a = vcwVar;
        this.b = uri;
    }

    public final void a(InputStream inputStream, long j) {
        vcv b;
        long a = this.a.a(this.b);
        if (j > a) {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(a)));
        }
        if (j > 0) {
            b = new vec(0);
        } else {
            b = veh.b();
        }
        OutputStream outputStream = (OutputStream) this.a.c(this.b, b);
        try {
            anbt.g(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
