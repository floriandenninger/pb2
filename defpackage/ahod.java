package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahod {
    private final Context a;
    private final SparseArray b = new SparseArray();

    public ahod(Context context) {
        this.a = context;
    }

    public final String a(int i) {
        String str = (String) this.b.get(i, null);
        if (str != null) {
            return str;
        }
        try {
            InputStream openRawResource = this.a.getResources().openRawResource(i);
            byte[] bArr = new byte[openRawResource.available()];
            if (openRawResource.read(bArr) <= 0) {
                return "";
            }
            String str2 = new String(bArr, Charset.defaultCharset());
            this.b.put(i, str2);
            return str2;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            zga.c("ShaderSourceCache", valueOf.length() != 0 ? "Error retrieving resource: ".concat(valueOf) : new String("Error retrieving resource: "));
            return "";
        }
    }
}
