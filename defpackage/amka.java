package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amka extends anhf {
    private amka(anhy anhyVar) {
        super(anhyVar);
    }

    public static amka c(anhy anhyVar) {
        if (anhyVar instanceof amka) {
            return (amka) anhyVar;
        }
        return new amka(anhyVar);
    }

    public final amka a(Class cls, amml ammlVar, Executor executor) {
        return new amka(aney.h(this.b, cls, amjk.a(ammlVar), executor));
    }

    public final amka b(Class cls, anfz anfzVar, Executor executor) {
        return new amka(amkq.k(this.b, cls, anfzVar, executor));
    }

    public final amka h(amml ammlVar, Executor executor) {
        return new amka(amkq.m(this.b, ammlVar, executor));
    }

    public final amka i(anfz anfzVar, Executor executor) {
        return new amka(amkq.n(this.b, anfzVar, executor));
    }
}
