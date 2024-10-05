package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akny {
    public final aknt a;
    public final Executor b;
    public final shf c;
    public final AtomicInteger e = new AtomicInteger();
    public final aef d = new aknw(this);

    public akny(aknt akntVar, Executor executor, shf shfVar) {
        this.a = akntVar;
        this.b = executor;
        this.c = shfVar;
    }
}
