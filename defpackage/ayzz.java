package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ayzz extends AtomicReference {
    private static final long serialVersionUID = 2346567790059478686L;
    azab a;
    int b;
    long c;

    public ayzz() {
        azab azabVar = new azab(null, 0L);
        this.a = azabVar;
        set(azabVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(azab azabVar) {
        this.a.set(azabVar);
        this.a = azabVar;
        this.b++;
    }

    public final void b(azaa azaaVar) {
        azab azabVar;
        synchronized (azaaVar) {
            if (azaaVar.e) {
                azaaVar.f = true;
                return;
            }
            azaaVar.e = true;
            while (!azaaVar.e()) {
                long j = azaaVar.get();
                Object obj = azaaVar.c;
                Object obj2 = obj;
                if (obj == null) {
                    azab azabVar2 = (azab) get();
                    azaaVar.c = azabVar2;
                    ayeq.j(azaaVar.d, azabVar2.b);
                    obj2 = azabVar2;
                }
                long j2 = j;
                long j3 = 0;
                Object obj3 = obj2;
                while (j2 != 0 && (azabVar = (azab) ((azab) obj3).get()) != null) {
                    Object obj4 = azabVar.a;
                    try {
                        banw banwVar = azaaVar.b;
                        if (obj4 != azqm.a) {
                            if (!(obj4 instanceof azqk)) {
                                banwVar.c(obj4);
                                j3++;
                                j2--;
                                if (azaaVar.e()) {
                                    azaaVar.c = null;
                                    return;
                                }
                                obj3 = azabVar;
                            } else {
                                banwVar.b(((azqk) obj4).a);
                            }
                        } else {
                            banwVar.sh();
                        }
                        azaaVar.c = null;
                        return;
                    } catch (Throwable th) {
                        aynu.c(th);
                        azaaVar.c = null;
                        azaaVar.qc();
                        if (azqm.h(obj4) || azqm.g(obj4)) {
                            return;
                        }
                        azaaVar.b.b(th);
                        return;
                    }
                }
                if (j3 != 0) {
                    azaaVar.c = obj3;
                    if (j != Long.MAX_VALUE) {
                        ayeq.o(azaaVar, j3);
                    }
                }
                synchronized (azaaVar) {
                    if (azaaVar.f) {
                        azaaVar.f = false;
                    } else {
                        azaaVar.e = false;
                        return;
                    }
                }
            }
            azaaVar.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        azab azabVar = (azab) get();
        if (azabVar.a != null) {
            azab azabVar2 = new azab(null, 0L);
            azabVar2.lazySet((azab) azabVar.get());
            set(azabVar2);
        }
    }

    public void d() {
    }
}
