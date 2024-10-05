package defpackage;

import android.os.StrictMode;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baec implements Closeable {
    private final StrictMode.ThreadPolicy a;
    private final StrictMode.VmPolicy b;

    private baec(StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    public baec(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.a = threadPolicy;
        this.b = vmPolicy;
    }

    public static baec a() {
        return new baec(StrictMode.allowThreadDiskReads());
    }

    public static baec b() {
        return new baec(StrictMode.allowThreadDiskWrites());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
