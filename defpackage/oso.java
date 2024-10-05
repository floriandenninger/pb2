package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oso {
    public final osm a;
    public final aifs b;
    public final axpg c;
    public final axpg d;
    public ayqx e;
    public final aadw f;
    private final ayqi g;

    public oso(aadw aadwVar, osm osmVar, aifs aifsVar, axpg axpgVar, axpg axpgVar2, ayqi ayqiVar) {
        this.f = aadwVar;
        this.a = osmVar;
        this.b = aifsVar;
        this.c = axpgVar;
        this.d = axpgVar2;
        this.g = ayqiVar;
    }

    public final void a() {
        if (evr.bf(this.f)) {
            this.e = this.a.c.ab(this.g).ax(new ayrs() { // from class: osn
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    oso osoVar = oso.this;
                    if (((Boolean) obj).booleanValue()) {
                        ((orx) osoVar.c.get()).c(true);
                    } else {
                        ((orx) osoVar.c.get()).b();
                    }
                }
            });
            if (this.a.g()) {
                if (this.b.k) {
                    ort ortVar = (ort) this.d.get();
                    if (ortVar.e) {
                        ortVar.e = false;
                        ortVar.a.e();
                        ortVar.a.g();
                        ortVar.b.m(ortVar);
                        ayrz.c((AtomicReference) ortVar.g);
                    }
                    if (((ort) this.d.get()).f) {
                        ((orx) this.c.get()).h = true;
                    }
                }
                ((orx) this.c.get()).c(false);
            }
        }
    }
}
