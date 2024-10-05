package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cst {
    final dby a;
    final Executor b;

    public cst(dby dbyVar, Executor executor) {
        this.a = dbyVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cst) {
            return this.a.equals(((cst) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
