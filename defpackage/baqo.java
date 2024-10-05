package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baqo {
    private Thread a = Thread.currentThread();

    public final void a() {
        if (this.a == null) {
            this.a = Thread.currentThread();
        }
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public final void b() {
        this.a = null;
    }
}
