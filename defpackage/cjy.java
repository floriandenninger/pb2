package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjy implements Closeable {
    public final HttpURLConnection a;

    public cjy(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    public final boolean a() {
        try {
            return this.a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.disconnect();
    }
}
