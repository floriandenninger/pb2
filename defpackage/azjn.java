package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class azjn extends AtomicReference implements azjr {
    private static final long serialVersionUID = 2346567790059478686L;
    azjq a;
    int b;

    public azjn() {
        azjq azjqVar = new azjq(null);
        this.a = azjqVar;
        set(azjqVar);
    }

    final void a(azjq azjqVar) {
        this.a.set(azjqVar);
        this.a = azjqVar;
        this.b++;
    }

    @Override // defpackage.azjr
    public final void b() {
        a(new azjq(azqm.a));
        f();
    }

    @Override // defpackage.azjr
    public final void c(Throwable th) {
        a(new azjq(azqm.b(th)));
        f();
    }

    @Override // defpackage.azjr
    public final void d(Object obj) {
        azqm azqmVar = azqm.a;
        a(new azjq(obj));
        g();
    }

    @Override // defpackage.azjr
    public final void e(azjp azjpVar) {
        if (azjpVar.getAndIncrement() == 0) {
            int i = 1;
            do {
                azjq azjqVar = (azjq) azjpVar.c;
                if (azjqVar == null) {
                    azjqVar = (azjq) get();
                    azjpVar.c = azjqVar;
                }
                while (!azjpVar.d) {
                    azjq azjqVar2 = (azjq) azjqVar.get();
                    if (azjqVar2 != null) {
                        if (azqm.e(azjqVar2.a, azjpVar.b)) {
                            azjpVar.c = null;
                            return;
                        }
                        azjqVar = azjqVar2;
                    } else {
                        azjpVar.c = azjqVar;
                        i = azjpVar.addAndGet(-i);
                    }
                }
                azjpVar.c = null;
                return;
            } while (i != 0);
        }
    }

    final void f() {
        azjq azjqVar = (azjq) get();
        if (azjqVar.a != null) {
            azjq azjqVar2 = new azjq(null);
            azjqVar2.lazySet((azjq) azjqVar.get());
            set(azjqVar2);
        }
    }

    public abstract void g();
}
