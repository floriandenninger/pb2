package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azie extends aypy {
    final ayro a;

    public azie(ayro ayroVar) {
        this.a = ayroVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        try {
            azid azidVar = new azid(ayqdVar, this.a, 0);
            ayqdVar.se(azidVar);
            Object obj = azidVar.c;
            if (azidVar.d) {
                azidVar.c = null;
                return;
            }
            ayro ayroVar = azidVar.b;
            while (!azidVar.d) {
                azidVar.f = false;
                try {
                    obj = ayroVar.a(obj, azidVar);
                    if (azidVar.e) {
                        azidVar.d = true;
                        azidVar.c = null;
                        return;
                    }
                } catch (Throwable th) {
                    aynu.c(th);
                    azidVar.c = null;
                    azidVar.d = true;
                    azidVar.c(th);
                    return;
                }
            }
            azidVar.c = null;
        } catch (Throwable th2) {
            aynu.c(th2);
            aysa.h(th2, ayqdVar);
        }
    }
}
