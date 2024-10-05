package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gne implements gnf {
    private final sxd a;
    private final Map b = new ConcurrentHashMap();
    private ayqx c;

    public gne(sxd sxdVar) {
        this.a = sxdVar;
    }

    @Override // defpackage.gnf
    public final void a() {
        if (this.c != null) {
            return;
        }
        this.c = this.a.a("Egl0aGVtZS1zZXQgSygB").ab(ayqr.a()).L(gsv.b).i(aypg.LATEST).A(fiv.r).A(fiv.s).X(new ayrs() { // from class: gnd
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gne gneVar = gne.this;
                avfb avfbVar = (avfb) obj;
                if ((avfbVar.b & 2) == 0 || Collections.unmodifiableMap(avfbVar.d).isEmpty()) {
                    return;
                }
                gneVar.c(avfbVar);
            }
        });
    }

    @Override // defpackage.gnf
    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.c = null;
        }
    }

    public final void c(avfb avfbVar) {
        amrw h = amrz.h();
        int[] iArr = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            if (i2 != 1) {
                String aZ = anaf.aZ(i2);
                if (i2 != 0) {
                    String str = (String) Collections.unmodifiableMap(avfbVar.d).get(aZ);
                    if (str != null) {
                        ammv ammvVar = (ammv) this.a.a(str).aB();
                        if (ammvVar.h()) {
                            h.g(aZ, (byte[]) ammvVar.c());
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        this.b.put(avfbVar.c, h.c());
    }

    @Override // defpackage.gnf
    public final void d(avfb avfbVar, int i) {
        c(avfbVar);
        e(i);
    }

    @Override // defpackage.gnf
    public final void e(int i) {
        for (String str : this.b.keySet()) {
            if (this.b.get(str) != null) {
                amrz amrzVar = (amrz) this.b.get(str);
                String aZ = anaf.aZ(i);
                if (i == 0) {
                    throw null;
                }
                if (amrzVar.containsKey(aZ)) {
                    this.a.b(str, (byte[]) ((amrz) this.b.get(str)).get(anaf.aZ(i)));
                }
            }
        }
    }
}
