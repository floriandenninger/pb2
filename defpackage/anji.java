package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anji {
    public final InputStream a;

    private anji(InputStream inputStream) {
        this.a = inputStream;
    }

    public static anji a(byte[] bArr) {
        return new anji(new ByteArrayInputStream(bArr));
    }
}
