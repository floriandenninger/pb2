package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyz implements aijo {
    public final aasy b;
    private final Executor d;
    public final AtomicInteger c = new AtomicInteger(0);
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public iyz(Executor executor, aasy aasyVar) {
        this.b = aasyVar;
        this.d = executor;
    }

    @Override // defpackage.aijo
    public final void qZ(aijr aijrVar) {
        if (this.c.get() == 0) {
            this.d.execute(new iyy(this));
        }
        if (this.c.get() != 2) {
            aijrVar.S.add(0);
        } else {
            aijrVar.S.addAll(this.a);
        }
    }
}
