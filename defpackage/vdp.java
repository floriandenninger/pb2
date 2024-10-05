package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdp implements Closeable {
    public Closeable a;

    private vdp(Closeable closeable) {
        this.a = closeable;
    }

    public static vdp a(Closeable closeable) {
        return new vdp(closeable);
    }

    public final Closeable b() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
