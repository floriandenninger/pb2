package defpackage;

import java.io.Closeable;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdm implements Closeable {
    public Semaphore a;

    public vdm(Semaphore semaphore) {
        this.a = semaphore;
    }

    public final Semaphore a() {
        Semaphore semaphore = this.a;
        this.a = null;
        return semaphore;
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
