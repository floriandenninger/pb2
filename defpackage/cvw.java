package defpackage;

import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvw {
    private static final Queue a = ddn.i(0);
    private int b;
    private int c;
    private Object d;

    private cvw() {
    }

    public static cvw b(Object obj) {
        cvw cvwVar;
        Queue queue = a;
        synchronized (queue) {
            cvwVar = (cvw) queue.poll();
        }
        if (cvwVar == null) {
            cvwVar = new cvw();
        }
        cvwVar.d = obj;
        cvwVar.c = 0;
        cvwVar.b = 0;
        return cvwVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cvw) {
            cvw cvwVar = (cvw) obj;
            int i = cvwVar.c;
            int i2 = cvwVar.b;
            if (this.d.equals(cvwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
