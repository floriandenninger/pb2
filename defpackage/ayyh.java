package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayyh extends aypn {
    final Iterable b;

    public ayyh(Iterable iterable) {
        this.b = iterable;
    }

    public static void a(banw banwVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                azpy.b(banwVar);
            } else if (banwVar instanceof aysx) {
                banwVar.f(new ayyf((aysx) banwVar, it));
            } else {
                banwVar.f(new ayyg(banwVar, it));
            }
        } catch (Throwable th) {
            aynu.c(th);
            azpy.f(th, banwVar);
        }
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        try {
            a(banwVar, this.b.iterator());
        } catch (Throwable th) {
            aynu.c(th);
            azpy.f(th, banwVar);
        }
    }
}
