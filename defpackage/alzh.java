package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alzh {
    final boolean a = false;
    public final Executor b;
    private final azrw c;

    public alzh(azrw azrwVar, Executor executor) {
        this.b = executor;
        this.c = azrwVar;
    }

    public final amrz a() {
        amkq.N(true);
        Set<alyz> set = (Set) this.c.get();
        amrw h = amrz.h();
        for (alyz alyzVar : set) {
            amkq.F(!alyzVar.a.isEmpty(), "AccountProvider's account type cannot be an empty string.");
            h.g(alyzVar.a, alyzVar.b);
        }
        return h.c();
    }
}
