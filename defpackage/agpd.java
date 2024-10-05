package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpd implements ypd {
    public final axpg a;
    public final azrw b;
    public final azrw c;
    public final azrw d;
    public final ypa e;
    public final afsy f;
    public final ScheduledExecutorService g;
    public boolean i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private int m = 0;
    public final AtomicReference h = new AtomicReference();

    public agpd(azrw azrwVar, axpg axpgVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, ypa ypaVar, afsy afsyVar, azrw azrwVar6, ScheduledExecutorService scheduledExecutorService) {
        this.j = azrwVar;
        this.a = axpgVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.k = azrwVar5;
        this.e = ypaVar;
        this.f = afsyVar;
        this.l = azrwVar6;
        this.g = scheduledExecutorService;
    }

    public final void a() {
        agpg agpgVar = (agpg) this.h.get();
        if (agpgVar != null) {
            agpgVar.f();
            this.h.set(null);
        }
    }

    public final void b() {
        if (this.f.t()) {
            e(this.f.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(agpg agpgVar, Collection collection) {
        amru<String> o;
        if (collection.isEmpty()) {
            return;
        }
        aalc c = ((aais) this.k.get()).a(agpgVar.a).c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            agov agovVar = (agov) it.next();
            if (!agovVar.i) {
                String d = aalt.d(169, agovVar.a);
                d.getClass();
                amkq.O(!d.isEmpty(), "key cannot be empty");
                aone createBuilder = atpu.a.createBuilder();
                createBuilder.copyOnWrite();
                atpu atpuVar = (atpu) createBuilder.instance;
                atpuVar.b |= 1;
                atpuVar.e = d;
                atpr atprVar = new atpr(createBuilder);
                atpq atpqVar = agovVar.c;
                aone aoneVar = atprVar.a;
                aoneVar.copyOnWrite();
                atpu atpuVar2 = (atpu) aoneVar.instance;
                atpqVar.getClass();
                atpuVar2.f = atpqVar;
                atpuVar2.b |= 2;
                Long valueOf = Long.valueOf(agovVar.d);
                aone aoneVar2 = atprVar.a;
                long longValue = valueOf.longValue();
                aoneVar2.copyOnWrite();
                atpu atpuVar3 = (atpu) aoneVar2.instance;
                atpuVar3.c = 11;
                atpuVar3.d = Long.valueOf(longValue);
                String str = agovVar.g;
                aone aoneVar3 = atprVar.a;
                aoneVar3.copyOnWrite();
                atpu atpuVar4 = (atpu) aoneVar3.instance;
                str.getClass();
                atpuVar4.b |= 16;
                atpuVar4.g = str;
                Integer valueOf2 = Integer.valueOf(agovVar.e.get());
                aone aoneVar4 = atprVar.a;
                int intValue = valueOf2.intValue();
                aoneVar4.copyOnWrite();
                atpu atpuVar5 = (atpu) aoneVar4.instance;
                atpuVar5.b |= 128;
                atpuVar5.l = intValue;
                Boolean valueOf3 = Boolean.valueOf(agovVar.j);
                aone aoneVar5 = atprVar.a;
                boolean booleanValue = valueOf3.booleanValue();
                aoneVar5.copyOnWrite();
                atpu atpuVar6 = (atpu) aoneVar5.instance;
                atpuVar6.b |= 256;
                atpuVar6.m = booleanValue;
                if (agovVar.a().h()) {
                    String str2 = (String) agovVar.a().c();
                    aone aoneVar6 = atprVar.a;
                    aoneVar6.copyOnWrite();
                    atpu atpuVar7 = (atpu) aoneVar6.instance;
                    atpuVar7.b |= 32;
                    atpuVar7.h = str2;
                }
                if (agovVar.b().h()) {
                    String str3 = (String) agovVar.b().c();
                    aone aoneVar7 = atprVar.a;
                    aoneVar7.copyOnWrite();
                    atpu atpuVar8 = (atpu) aoneVar7.instance;
                    atpuVar8.b |= 64;
                    atpuVar8.j = str3;
                }
                if (agovVar.d() && (o = amru.o(agovVar.f)) != null && !o.isEmpty()) {
                    for (String str4 : o) {
                        aone aoneVar8 = atprVar.a;
                        aoneVar8.copyOnWrite();
                        atpu atpuVar9 = (atpu) aoneVar8.instance;
                        str4.getClass();
                        aony aonyVar = atpuVar9.i;
                        if (!aonyVar.c()) {
                            atpuVar9.i = aonm.mutableCopy(aonyVar);
                        }
                        atpuVar9.i.add(str4);
                    }
                }
                c.d(atprVar.a(((aais) this.k.get()).a(this.f.c())));
            } else {
                c.g(aalt.d(169, agovVar.a));
            }
        }
        if (agpgVar.a.d().equals(this.f.c().d())) {
            try {
                c.b().T();
            } catch (RuntimeException e) {
                zga.d("[Offline] orchestration error writing to store", e);
                a();
                int i = this.m;
                this.m = i + 1;
                if (i < 5) {
                    b();
                }
            }
        }
    }

    public final void d(atpq atpqVar) {
        if (this.h.get() == null) {
            b();
        }
        agpg agpgVar = (agpg) this.h.get();
        if (agpgVar == null) {
            throw new agpe("No active identity");
        }
        c(agpgVar, agpgVar.c(((agoz) this.j.get()).a(atpqVar, null), null));
        ((agpi) this.a.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(afsx afsxVar) {
        agpg agpgVar = (agpg) this.h.get();
        if (agpgVar == null || !agpgVar.a.b().equals(afsxVar.b())) {
            try {
                ajyw ajywVar = (ajyw) this.l.get();
                ysy ysyVar = (ysy) ajywVar.c.get();
                ysyVar.getClass();
                acpz acpzVar = (acpz) ajywVar.a.get();
                acpzVar.getClass();
                agoz agozVar = (agoz) ajywVar.b.get();
                agozVar.getClass();
                afsxVar.getClass();
                agpg agpgVar2 = new agpg(ysyVar, acpzVar, agozVar, afsxVar);
                agpgVar2.e = new agpa(this);
                aair a = ((aais) this.k.get()).a(agpgVar2.a);
                amru amruVar = (amru) a.k(169).X();
                HashSet hashSet = new HashSet();
                int size = amruVar.size();
                for (int i = 0; i < size; i++) {
                    atpt atptVar = (atpt) a.f((String) amruVar.get(i)).X();
                    if (atptVar != null) {
                        agov agovVar = new agov(atptVar);
                        if (agovVar.d()) {
                            agpgVar2.b.put(agovVar.a, agovVar);
                        } else if (agovVar.b().h()) {
                            String str = (String) agovVar.b().c();
                            if (!agpgVar2.c.containsKey(str)) {
                                agpgVar2.c.put(str, new HashSet());
                            }
                            ((Set) agpgVar2.c.get(str)).add(agovVar);
                        } else {
                            hashSet.add(agovVar);
                        }
                    }
                }
                agpgVar2.j(hashSet);
                this.h.set(agpgVar2);
            } catch (RuntimeException e) {
                zga.d("Couldn't initialize orchestration queue", e);
                afsi.c(2, 28, "Couldn't initialize orchestration queue", e);
            }
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            this.g.execute(new Runnable() { // from class: agpc
                @Override // java.lang.Runnable
                public final void run() {
                    agpd agpdVar = agpd.this;
                    agpdVar.e(agpdVar.f.c());
                }
            });
            return null;
        }
        if (i == 1) {
            agpi agpiVar = (agpi) this.a.get();
            anhy anhyVar = agpiVar.a;
            if (anhyVar != null && !anhyVar.isDone()) {
                agpiVar.a.cancel(true);
            }
            a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
