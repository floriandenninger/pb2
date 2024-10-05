package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymx {
    final Object a;
    Future b;
    boolean c;

    public aymx(Object obj) {
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future a() {
        this.c = true;
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Future future) {
        synchronized (this.a) {
            if (!this.c) {
                this.b = future;
            }
        }
    }
}
