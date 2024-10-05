package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.FlowTopBarRendererOuterClass;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class itm {
    public final Map a = new HashMap();
    private final jlb b;

    public itm(jlb jlbVar, byte[] bArr) {
        this.b = jlbVar;
    }

    public final itl a(aqxd aqxdVar, itj itjVar, iti itiVar, Optional optional, acra acraVar) {
        jlb jlbVar = this.b;
        aahd aahdVar = (aahd) jlbVar.a.get();
        aahdVar.getClass();
        axpg axpgVar = ((axqv) jlbVar.c).get();
        axpgVar.getClass();
        ajdw ajdwVar = (ajdw) jlbVar.f.get();
        ajdwVar.getClass();
        aahv aahvVar = (aahv) jlbVar.b.get();
        aahvVar.getClass();
        afsy afsyVar = (afsy) jlbVar.d.get();
        afsyVar.getClass();
        ayqi ayqiVar = (ayqi) jlbVar.e.get();
        ayqiVar.getClass();
        aqxdVar.getClass();
        itjVar.getClass();
        itiVar.getClass();
        final itl itlVar = new itl(aahdVar, axpgVar, ajdwVar, aahvVar, afsyVar, ayqiVar, aqxdVar, itjVar, itiVar, optional, acraVar);
        itlVar.c();
        itlVar.p = aypy.m(itlVar.d.h(itlVar.n, true).L(gsv.s), itlVar.k, epc.j).Y(ism.n).k(aqxg.class).ab(itlVar.e).Y(ism.o).ax(new ayrs() { // from class: ith
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                itl itlVar2 = itl.this;
                String str = ((aqxi) obj).d;
                if (!itlVar2.j.containsKey(str) || itlVar2.j.get(str) == null) {
                    if (itlVar2.o.isPresent()) {
                        itlVar2.a.a((apxf) itlVar2.o.get());
                    }
                    if (itlVar2.h.isPresent()) {
                        ((itk) itlVar2.h.get()).i();
                        return;
                    }
                    return;
                }
                aqxj aqxjVar = (aqxj) itlVar2.j.get(str);
                aulq aulqVar = aqxjVar.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                    if (itlVar2.h.isPresent()) {
                        ((itk) itlVar2.h.get()).g();
                    }
                    ajok ajokVar = new ajok();
                    ajokVar.a(itlVar2.i);
                    ajdw ajdwVar2 = itlVar2.c;
                    aulq aulqVar2 = aqxjVar.d;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    ajdwVar2.oB(ajokVar, ajds.a((aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer)));
                    if ((aqxjVar.b & 4) == 0) {
                        itlVar2.f.f((aqxk) itlVar2.m.pX(FlowTopBarRendererOuterClass.flowTopBarRenderer));
                    } else {
                        itj itjVar2 = itlVar2.f;
                        aulq aulqVar3 = aqxjVar.e;
                        if (aulqVar3 == null) {
                            aulqVar3 = aulq.a;
                        }
                        itjVar2.f((aqxk) aulqVar3.pX(FlowTopBarRendererOuterClass.flowTopBarRenderer));
                    }
                    if ((aqxjVar.b & 8) != 0) {
                        aulq aulqVar4 = aqxjVar.f;
                        if (aulqVar4 == null) {
                            aulqVar4 = aulq.a;
                        }
                        if (aulqVar4.pY(ElementRendererOuterClass.elementRenderer)) {
                            iti itiVar2 = itlVar2.g;
                            aulq aulqVar5 = aqxjVar.f;
                            if (aulqVar5 == null) {
                                aulqVar5 = aulq.a;
                            }
                            itiVar2.a((aqrf) aulqVar5.pX(ElementRendererOuterClass.elementRenderer));
                            return;
                        }
                    }
                    itlVar2.g.a(null);
                }
            }
        });
        this.a.put(aqxdVar.c, itlVar);
        return itlVar;
    }

    public final void b(String str) {
        itl itlVar = (itl) this.a.remove(str);
        if (itlVar != null) {
            itlVar.c();
            itlVar.c.b(null);
            if (itlVar.n.isEmpty()) {
                return;
            }
            aalc c = itlVar.d.c();
            c.g(itlVar.n);
            c.b().T();
        }
    }
}
