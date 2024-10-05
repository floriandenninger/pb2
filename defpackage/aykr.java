package defpackage;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykr implements Runnable {
    final /* synthetic */ ayks a;
    private final /* synthetic */ int b;

    public aykr(ayks ayksVar, int i) {
        this.b = i;
        this.a = ayksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ayai a = this.a.c.a();
            try {
                ayks ayksVar = this.a;
                axzr c = ayksVar.f.c(ayksVar.d, ayksVar.e);
                this.a.c.c(a);
                ayks ayksVar2 = this.a;
                synchronized (ayksVar2) {
                    if (ayksVar2.b == null) {
                        ayksVar2.i(c);
                        ayksVar2.h();
                    }
                }
                ayks ayksVar3 = this.a;
                ayksVar3.f.c.o.execute(new aykr(ayksVar3, 0));
                return;
            } catch (Throwable th) {
                this.a.c.c(a);
                throw th;
            }
        }
        ayks ayksVar4 = this.a;
        Collection collection = ayksVar4.f.c.w;
        if (collection != null) {
            collection.remove(ayksVar4);
            if (this.a.f.c.w.isEmpty()) {
                aykx aykxVar = this.a.f.c;
                aykxVar.Q.c(aykxVar.x, false);
                aykx aykxVar2 = this.a.f.c;
                aykxVar2.w = null;
                if (aykxVar2.A.get()) {
                    this.a.f.c.z.a(aykx.d);
                }
            }
        }
    }
}
