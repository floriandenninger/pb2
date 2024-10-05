package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymh implements Runnable {
    final /* synthetic */ aymi a;
    private final /* synthetic */ int b;

    public aymh(aymi aymiVar, int i) {
        this.b = i;
        this.a = aymiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            aymi aymiVar = this.a;
            aymiVar.b.execute(new aymh(aymiVar, 1));
            return;
        }
        aymi aymiVar2 = this.a;
        if (!aymiVar2.e) {
            aymiVar2.f = null;
            return;
        }
        long a = aymiVar2.a();
        aymi aymiVar3 = this.a;
        if (aymiVar3.d - a > 0) {
            aymiVar3.f = aymiVar3.a.schedule(new aymh(aymiVar3, 0), this.a.d - a, TimeUnit.NANOSECONDS);
            return;
        }
        aymiVar3.e = false;
        aymiVar3.f = null;
        aymiVar3.c.run();
    }
}
