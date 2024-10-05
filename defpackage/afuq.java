package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afuq implements afvq {
    public final afvq a;
    private final Executor b;

    private afuq(Executor executor, afvq afvqVar) {
        this.b = executor;
        this.a = afvqVar;
    }

    public static afuq a(Executor executor, afvq afvqVar) {
        executor.getClass();
        afvqVar.getClass();
        return new afuq(executor, afvqVar);
    }

    @Override // defpackage.afvq
    public final void c(Object obj, ykl yklVar) {
        obj.getClass();
        yklVar.getClass();
        try {
            this.b.execute(new afup(this, obj, yklVar));
        } catch (RejectedExecutionException e) {
            yklVar.a(obj, e);
        }
    }
}
