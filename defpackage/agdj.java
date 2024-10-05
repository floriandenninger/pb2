package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdj {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final ammv d;

    public agdj(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, ammv ammvVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = ammvVar;
    }

    public final void a() {
        ((agof) this.b.get()).e();
        final agpd agpdVar = (agpd) this.a.get();
        if (!agpdVar.i) {
            agpdVar.e.g(agpdVar);
            aypn aypnVar = (aypn) agpdVar.d.get();
            aypf aypfVar = aypf.DROP_OLDEST;
            aysw.b(aypfVar, "overflowStrategy is null");
            ayzg ayzgVar = new ayzg(aypnVar, aypfVar);
            ayrv ayrvVar = aynu.j;
            ayzgVar.n().E(azre.b(agpdVar.g)).X(new ayrs() { // from class: agpb
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    agpd agpdVar2 = agpd.this;
                    agpg agpgVar = (agpg) agpdVar2.h.get();
                    if (agpgVar == null || agpgVar.d.isEmpty() || !((ysy) agpdVar2.c.get()).p()) {
                        return;
                    }
                    agpgVar.h();
                }
            });
            agpdVar.b();
            agpdVar.i = true;
        }
        final agqa agqaVar = (agqa) this.c.get();
        new ayqw().d(ahbw.c(agqaVar.c, afyf.l).X(new ayrs() { // from class: agpz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                agqa agqaVar2 = agqa.this;
                ahcn ahcnVar = (ahcn) obj;
                aone createBuilder = aqov.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(agqaVar2.b.c());
                createBuilder.copyOnWrite();
                aqov aqovVar = (aqov) createBuilder.instance;
                aqovVar.c |= 8;
                aqovVar.d = seconds;
                aqov aqovVar2 = (aqov) createBuilder.build();
                aong aongVar = (aong) atpo.b.createBuilder();
                aongVar.e(aqov.b, aqovVar2);
                atpo atpoVar = (atpo) aongVar.build();
                try {
                    agpd agpdVar2 = agqaVar2.a;
                    aone createBuilder2 = atpq.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    atpq atpqVar = (atpq) createBuilder2.instance;
                    atpqVar.c = 4;
                    atpqVar.b |= 1;
                    String f = aalt.f(146, ahcnVar.a());
                    createBuilder2.copyOnWrite();
                    atpq atpqVar2 = (atpq) createBuilder2.instance;
                    f.getClass();
                    atpqVar2.b |= 2;
                    atpqVar2.d = f;
                    createBuilder2.copyOnWrite();
                    atpq atpqVar3 = (atpq) createBuilder2.instance;
                    atpoVar.getClass();
                    atpqVar3.e = atpoVar;
                    atpqVar3.b |= 4;
                    agpdVar2.d((atpq) createBuilder2.build());
                } catch (agpe e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zga.b(valueOf.length() != 0 ? "Couldn't update: ".concat(valueOf) : new String("Couldn't update: "));
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Boolean bool;
        final agos agosVar = (agos) ((agpd) this.a.get()).b.get();
        agosVar.h.submit(new Runnable() { // from class: agoq
            @Override // java.lang.Runnable
            public final void run() {
                agos.this.b();
            }
        });
        agosVar.d();
        agosVar.i.g(agosVar);
        final agrh agrhVar = (agrh) ((amna) this.d).a;
        aqvj aqvjVar = agrhVar.d.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353564L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353564L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353564L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            ahbw.c(agrhVar.a, afyf.n).E(agrhVar.b).Y(new ayrs() { // from class: agrg
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    final agrh agrhVar2 = agrh.this;
                    final ahdw ahdwVar = (ahdw) obj;
                    anfq.h(agrhVar2.c.a().m().h(ahdwVar.a()), new amml() { // from class: agrf
                        @Override // defpackage.amml
                        public final Object apply(Object obj2) {
                            agrh agrhVar3 = agrh.this;
                            ahdw ahdwVar2 = ahdwVar;
                            ammv ammvVar = (ammv) obj2;
                            if (ammvVar == null || !ammvVar.h()) {
                                return null;
                            }
                            agrhVar3.c.a().l().g(ahdwVar2.a());
                            return null;
                        }
                    }, angq.a);
                }
            }, zxi.l);
        }
    }
}
