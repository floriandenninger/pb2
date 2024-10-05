package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugt {
    public final Queue a = new ArrayDeque();
    public final ugs b;

    public ugt(ugs ugsVar) {
        this.b = ugsVar;
    }

    public final void a() {
        uqq.j();
        while (!this.a.isEmpty()) {
            ((Runnable) this.a.remove()).run();
        }
    }
}
