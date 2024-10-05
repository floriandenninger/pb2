package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yme implements Closeable {
    public final InputStream[] a;

    public yme(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.a) {
            ymf.c(inputStream);
        }
    }
}
