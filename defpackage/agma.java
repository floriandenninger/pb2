package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agma implements ypd {
    public final ypa a;
    public final azrw b;
    private final aais c;
    private final afsy d;
    private final Executor e;
    private ayqx f;
    private afsx g;

    public agma(aais aaisVar, afsy afsyVar, Executor executor, ypa ypaVar, azrw azrwVar) {
        aaisVar.getClass();
        this.c = aaisVar;
        afsyVar.getClass();
        this.d = afsyVar;
        executor.getClass();
        this.e = executor;
        ypaVar.getClass();
        this.a = ypaVar;
        this.b = azrwVar;
    }

    public final void a() {
        afsx c = this.d.c();
        if (c.z() || Objects.equals(this.g, c)) {
            return;
        }
        b();
        this.g = c;
        this.f = this.c.a(c).g(aqoz.class).ab(azre.b(this.e)).ax(new ayrs() { // from class: aglz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aqoz aqozVar;
                agpd agpdVar;
                agma agmaVar = agma.this;
                aakz aakzVar = (aakz) obj;
                if (aakzVar.c == null && (aqozVar = (aqoz) aakzVar.b) != null) {
                    aaku aakuVar = aakzVar.d;
                    if ((aakuVar == null || !new agmw(aakuVar).l("license_released")) && (agpdVar = (agpd) agmaVar.b.get()) != null) {
                        try {
                            aone createBuilder = atpq.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atpq atpqVar = (atpq) createBuilder.instance;
                            atpqVar.c = 2;
                            atpqVar.b |= 1;
                            String d = aqozVar.d();
                            createBuilder.copyOnWrite();
                            atpq atpqVar2 = (atpq) createBuilder.instance;
                            d.getClass();
                            atpqVar2.b = 2 | atpqVar2.b;
                            atpqVar2.d = d;
                            aong aongVar = (aong) atpo.b.createBuilder();
                            aongVar.cq(atpl.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                            aonk aonkVar = aqov.b;
                            aone createBuilder2 = aqov.a.createBuilder();
                            aqpc aqpcVar = aqozVar.b;
                            createBuilder2.copyOnWrite();
                            aqov aqovVar = (aqov) createBuilder2.instance;
                            aqpcVar.getClass();
                            aqovVar.e = aqpcVar;
                            aqovVar.c |= 64;
                            aongVar.e(aonkVar, (aqov) createBuilder2.build());
                            createBuilder.copyOnWrite();
                            atpq atpqVar3 = (atpq) createBuilder.instance;
                            atpo atpoVar = (atpo) aongVar.build();
                            atpoVar.getClass();
                            atpqVar3.e = atpoVar;
                            atpqVar3.b |= 4;
                            agpdVar.d((atpq) createBuilder.build());
                        } catch (agpe e) {
                            zga.d("Failed to delete DRM License Entity: ", e);
                        }
                    }
                }
            }
        });
    }

    public final void b() {
        Object obj = this.f;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.f = null;
            this.g = null;
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            a();
            return null;
        }
        if (i == 1) {
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
