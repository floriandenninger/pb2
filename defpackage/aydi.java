package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aydi extends ayah {
    private static final Logger b = Logger.getLogger(aydi.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.ayah
    public final ayai a() {
        ayai ayaiVar = (ayai) a.get();
        return ayaiVar == null ? ayai.b : ayaiVar;
    }

    @Override // defpackage.ayah
    public final ayai b(ayai ayaiVar) {
        ayai a2 = a();
        a.set(ayaiVar);
        return a2;
    }

    @Override // defpackage.ayah
    public final void c(ayai ayaiVar, ayai ayaiVar2) {
        if (a() != ayaiVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (ayaiVar2 != ayai.b) {
            a.set(ayaiVar2);
        } else {
            a.set(null);
        }
    }
}
