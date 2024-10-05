package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwa {
    public final Context a;
    public final trp b;

    public hwa(Context context, trp trpVar, byte[] bArr, byte[] bArr2) {
        this.a = context;
        this.b = trpVar;
    }

    public final FileOutputStream a(Uri uri) {
        OutputStream c = uzm.c(this.a, uri, uzl.a);
        if (c instanceof FileOutputStream) {
            return (FileOutputStream) c;
        }
        String valueOf = String.valueOf(c.getClass().getName());
        throw new IOException(valueOf.length() != 0 ? "OutputStream instance is not FileOutputStream cls:".concat(valueOf) : new String("OutputStream instance is not FileOutputStream cls:"));
    }
}
