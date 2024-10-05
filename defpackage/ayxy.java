package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxy extends ayvs {
    final ayrv c;
    final int d;

    public ayxy(aypn aypnVar, ayrv ayrvVar, int i) {
        super(aypnVar);
        this.c = ayrvVar;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        aypn aypnVar = this.b;
        if (aypnVar instanceof Callable) {
            try {
                Object call = ((Callable) aypnVar).call();
                if (call == null) {
                    azpy.b(banwVar);
                    return;
                }
                try {
                    ayyh.a(banwVar, this.c.a(call).iterator());
                    return;
                } catch (Throwable th) {
                    aynu.c(th);
                    azpy.f(th, banwVar);
                    return;
                }
            } catch (Throwable th2) {
                aynu.c(th2);
                azpy.f(th2, banwVar);
                return;
            }
        }
        aypnVar.aa(new ayxx(banwVar, this.c, this.d));
    }
}
