package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkj extends agdv implements ypd {
    public final azrw a;
    public final azrw b;
    public final azrw c;
    private final agdu f;
    private final ypa g;
    private final fka h;
    private final jmp i;

    public jkj(shf shfVar, zfe zfeVar, aaxn aaxnVar, agdu agduVar, agsm agsmVar, ypa ypaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, fka fkaVar, jmp jmpVar, aghp aghpVar, byte[] bArr, byte[] bArr2) {
        super(shfVar, zfeVar, aaxnVar, agduVar, agsmVar, aghpVar, null, null);
        this.f = agduVar;
        this.g = ypaVar;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.h = fkaVar;
        this.i = jmpVar;
    }

    @Override // defpackage.agdv, defpackage.agdt
    public final synchronized int a(String str, agsn agsnVar) {
        if (!((jhc) this.a.get()).b()) {
            this.f.a(str);
            return 0;
        }
        return super.a(str, agsnVar);
    }

    public final void b() {
        final jmp jmpVar = this.i;
        jmpVar.e = jmpVar.d.c().g(asxi.class).ab(azre.b(jmpVar.a)).L(iub.h).Y(jif.f).k(asxi.class).ay(new ayrs() { // from class: jmn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                awjp b;
                jmp jmpVar2 = jmp.this;
                asxi asxiVar = (asxi) obj;
                jmpVar2.b.b(true);
                amxe it = ((amru) asxiVar.getItemsModels()).iterator();
                while (it.hasNext()) {
                    asxd a = ((asxf) it.next()).a();
                    if (a != null && (b = a.b()) != null) {
                        try {
                            agpd agpdVar = jmpVar2.c;
                            aone createBuilder = atpq.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atpq atpqVar = (atpq) createBuilder.instance;
                            atpqVar.c = 1;
                            atpqVar.b |= 1;
                            String d = aalt.d(197, b.getVideoId());
                            createBuilder.copyOnWrite();
                            atpq atpqVar2 = (atpq) createBuilder.instance;
                            d.getClass();
                            atpqVar2.b = 2 | atpqVar2.b;
                            atpqVar2.d = d;
                            aong aongVar = (aong) atpo.b.createBuilder();
                            aongVar.cq(atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                            amru amruVar = aghw.a;
                            aongVar.copyOnWrite();
                            atpo atpoVar = (atpo) aongVar.instance;
                            atpoVar.e();
                            aolo.addAll((Iterable) amruVar, (List) atpoVar.f);
                            aonk aonkVar = astn.b;
                            aone createBuilder2 = astn.a.createBuilder();
                            String d2 = b.d();
                            createBuilder2.copyOnWrite();
                            astn astnVar = (astn) createBuilder2.instance;
                            d2.getClass();
                            astnVar.c |= 1;
                            astnVar.d = d2;
                            aongVar.e(aonkVar, (astn) createBuilder2.build());
                            createBuilder.copyOnWrite();
                            atpq atpqVar3 = (atpq) createBuilder.instance;
                            atpo atpoVar2 = (atpo) aongVar.build();
                            atpoVar2.getClass();
                            atpqVar3.e = atpoVar2;
                            atpqVar3.b |= 4;
                            agpdVar.d((atpq) createBuilder.build());
                        } catch (agpe e) {
                            String valueOf = String.valueOf(e.getMessage());
                            zga.b(valueOf.length() != 0 ? "Couldn't add: ".concat(valueOf) : new String("Couldn't add: "));
                        }
                    }
                }
                Set set = (Set) jmpVar2.d.c().k(137).G(jif.g).X();
                HashSet an = amkq.an();
                for (asxj asxjVar : asxiVar.getItems()) {
                    an.add(asxjVar.b == 1 ? (String) asxjVar.c : "");
                }
                amwe al = amkq.al(set, an);
                aajl c = ((aajv) jmpVar2.d.c()).c();
                amxd it2 = ((amwc) al).iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    asxd asxdVar = (asxd) jmpVar2.d.c().f(str).g(asxd.class).X();
                    if (asxdVar != null) {
                        whu.ae(c, asxdVar);
                        try {
                            agpd agpdVar2 = jmpVar2.c;
                            aone createBuilder3 = atpq.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            atpq atpqVar4 = (atpq) createBuilder3.instance;
                            atpqVar4.c = 2;
                            atpqVar4.b |= 1;
                            String d3 = aalt.d(197, aalt.g(str));
                            createBuilder3.copyOnWrite();
                            atpq atpqVar5 = (atpq) createBuilder3.instance;
                            d3.getClass();
                            atpqVar5.b |= 2;
                            atpqVar5.d = d3;
                            agpdVar2.d((atpq) createBuilder3.build());
                        } catch (agpe e2) {
                            String valueOf2 = String.valueOf(e2.getMessage());
                            zga.b(valueOf2.length() != 0 ? "Couldn't delete: ".concat(valueOf2) : new String("Couldn't delete: "));
                        }
                    }
                }
                evr.bO(c, "Error deleting unreferenced entities");
            }
        }, new ayrs() { // from class: jmo
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                jmp jmpVar2 = jmp.this;
                ayqx ayqxVar = jmpVar2.e;
                ayqxVar.getClass();
                if (ayqxVar.e()) {
                    return;
                }
                ayrz.c((AtomicReference) jmpVar2.e);
            }
        });
        ((jhe) this.b.get()).a();
        this.h.a.d().A(fiv.j).G().ai().n().Y(new ayrs() { // from class: jki
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                jkj jkjVar = jkj.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                aqmc a = aqmd.a();
                a.copyOnWrite();
                ((aqmd) a.instance).d(booleanValue);
                aqmd aqmdVar = (aqmd) a.build();
                arpn a2 = arpp.a();
                a2.copyOnWrite();
                ((arpp) a2.instance).cr(aqmdVar);
                ((acpl) jkjVar.c.get()).c((arpp) a2.build());
                ((jhe) jkjVar.b.get()).a();
            }
        }, izw.g);
        this.e = new jkh(this);
        this.g.g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            ((jhe) this.b.get()).a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
