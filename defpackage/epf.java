package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class epf implements eoi {
    public final axpg a;
    public final aaea b;
    public final aypy c;
    public final aypy d;

    public epf(axpg axpgVar, aaea aaeaVar, aadw aadwVar, final ayqi ayqiVar) {
        this.a = axpgVar;
        this.b = aaeaVar;
        final aypy B = aaeaVar.a.Y(eoe.d).B();
        final eow eowVar = (eow) axpgVar.get();
        final aypy m = aypy.m(eowVar.g(), eowVar.c.a, new ayro() { // from class: eov
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                eok eokVar = (eok) obj;
                boolean z = false;
                if (eow.k((arfd) obj2, eow.this.b.c().g()) && eokVar.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        if (evr.az(aadwVar)) {
            this.c = aypy.W(false).u(aypy.y(new Callable() { // from class: epd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aypy aypyVar = aypy.this;
                    aypy aypyVar2 = m;
                    return epf.b(aypyVar, aypyVar2).ai(ayqiVar);
                }
            }));
        } else {
            this.c = b(B, m);
        }
        if (evr.aA(aadwVar)) {
            if (evr.az(aadwVar)) {
                this.d = aypy.W(false).u(aypy.y(new Callable() { // from class: epe
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        epf epfVar = epf.this;
                        return epfVar.a().ai(ayqiVar);
                    }
                }));
                return;
            } else {
                this.d = a();
                return;
            }
        }
        this.d = aypy.W(false);
    }

    public static final aypy b(aypy aypyVar, aypy aypyVar2) {
        return aypy.m(aypyVar, aypyVar2, epc.a).B();
    }

    public final aypy a() {
        return aypy.m(this.c, ((eow) this.a.get()).g().Y(eoe.c), epc.c).B();
    }
}
