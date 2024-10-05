package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ylr {
    private final Executor a;
    private final Runnable b;
    private final ylg c;

    public ylr(Executor executor, ylg ylgVar, Runnable runnable) {
        this.a = executor;
        this.c = ylgVar;
        this.b = runnable;
    }

    public final yll a(ambx ambxVar, aooy aooyVar) {
        return new yll(this.a, this.c, this.b, ambxVar, aooyVar);
    }

    public final ylq b(azrw azrwVar) {
        return new ylq(this.a, this.c, this.b, azrwVar);
    }
}
