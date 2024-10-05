package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alse {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public alse() {
    }

    public alse(byte[] bArr) {
    }

    public final void a(alsd alsdVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(alsdVar);
        }
    }

    public final void b(alsc alscVar) {
        alsd alsdVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        alsdVar = (alsd) this.b.poll();
                        if (alsdVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    alsdVar.a(alscVar);
                }
            }
        }
    }

    public final void c(rpu rpuVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(rpuVar);
        }
    }

    public final void d(rpt rptVar) {
        rpu rpuVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        rpuVar = (rpu) this.b.poll();
                        if (rpuVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    rpuVar.a(rptVar);
                }
            }
        }
    }
}
