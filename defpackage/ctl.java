package defpackage;

import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class ctl {
    private final Queue a = ddn.i(20);

    public abstract ctw a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ctw b() {
        ctw ctwVar = (ctw) this.a.poll();
        return ctwVar == null ? a() : ctwVar;
    }

    public final void c(ctw ctwVar) {
        if (this.a.size() < 20) {
            this.a.offer(ctwVar);
        }
    }
}
