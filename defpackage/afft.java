package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afft {
    public static final afft a = new afft(new byte[]{116, 101, 115, 116});
    public final byte[] b;

    public afft(byte[] bArr) {
        this.b = bArr;
    }

    public final String toString() {
        try {
            return new String(this.b, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(this.b);
        }
    }
}
