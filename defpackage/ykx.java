package defpackage;

import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ykx implements Runnable {
    public ykl a;
    public Object b;
    public Object c;
    public Exception d;
    public boolean e;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            this.a.b(this.b, this.c);
        } else {
            this.a.a(this.b, this.d);
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        LinkedBlockingQueue linkedBlockingQueue = yky.a;
        try {
            yky.a.put(this);
        } catch (InterruptedException e) {
            zga.n("Interrupted when releasing runnable to the queue", e);
        }
    }
}
