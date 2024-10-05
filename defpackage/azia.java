package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azia extends aypy {
    final Iterable a;

    public azia(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    aysa.f(ayqdVar);
                    return;
                }
                azhz azhzVar = new azhz(ayqdVar, it);
                ayqdVar.se(azhzVar);
                if (azhzVar.d) {
                    return;
                }
                while (!azhzVar.c) {
                    try {
                        Object next = azhzVar.b.next();
                        aysw.b(next, "The iterator returned a null value");
                        azhzVar.a.c(next);
                        if (azhzVar.c) {
                            return;
                        }
                        try {
                            if (!azhzVar.b.hasNext()) {
                                if (azhzVar.c) {
                                    return;
                                }
                                azhzVar.a.sh();
                                return;
                            }
                        } catch (Throwable th) {
                            aynu.c(th);
                            azhzVar.a.b(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        aynu.c(th2);
                        azhzVar.a.b(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                aynu.c(th3);
                aysa.h(th3, ayqdVar);
            }
        } catch (Throwable th4) {
            aynu.c(th4);
            aysa.h(th4, ayqdVar);
        }
    }
}
