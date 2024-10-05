package defpackage;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdl implements Closeable {
    private Semaphore a;

    public vdl(Semaphore semaphore) {
        this.a = semaphore;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Semaphore semaphore = this.a;
        if (semaphore != null) {
            semaphore.release();
            this.a = null;
        }
    }
}
