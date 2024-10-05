package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class joe {
    public final aahv a;
    public final aais b;
    public final amrz c;
    public final amrz d;
    public final axzg i;
    private final azqy j;
    public final Map h = new HashMap();
    public final Map e = new ConcurrentHashMap();
    public final Map f = new ConcurrentHashMap();
    public final Map g = new ConcurrentHashMap();

    public joe(final aahv aahvVar, final aais aaisVar, axzg axzgVar, Set set, Set set2, azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = aahvVar;
        this.b = aaisVar;
        this.i = axzgVar;
        HashMap hashMap = new HashMap();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            jpe jpeVar = (jpe) it.next();
            int i = jpeVar.a;
            Integer valueOf = Integer.valueOf(i);
            if (hashMap.containsKey(valueOf)) {
                StringBuilder sb = new StringBuilder(79);
                sb.append("Trying to add duplicate identity entity transformer for fieldNumber=");
                sb.append(i);
                zga.b(sb.toString());
            } else {
                hashMap.put(valueOf, jpeVar);
            }
        }
        this.c = amrz.j(hashMap);
        HashMap hashMap2 = new HashMap();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            jpi jpiVar = (jpi) it2.next();
            int b = jpiVar.b();
            Integer valueOf2 = Integer.valueOf(b);
            if (!hashMap2.containsKey(valueOf2)) {
                hashMap2.put(valueOf2, new HashMap());
            }
            int a = jpiVar.a();
            Map map = (Map) hashMap2.get(valueOf2);
            if (map != null) {
                map.put(Integer.valueOf(a), jpiVar);
            } else {
                StringBuilder sb2 = new StringBuilder(60);
                sb2.append("Cannot add transformer for unknown field number: ");
                sb2.append(b);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        HashMap hashMap3 = new HashMap();
        Iterator it3 = hashMap2.keySet().iterator();
        while (it3.hasNext()) {
            Integer valueOf3 = Integer.valueOf(((Integer) it3.next()).intValue());
            hashMap3.put(valueOf3, amrz.j((Map) hashMap2.get(valueOf3)));
        }
        this.d = amrz.j(hashMap3);
        azqy ap = azqy.ap();
        this.j = ap;
        aypn q = ap.av().F().E((ayqi) azrwVar.get()).s(iub.j).x(jif.j).ae(new ayrv() { // from class: joa
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                final joe joeVar = joe.this;
                return ((ayrl) obj).O(new ayrw() { // from class: jnx
                    @Override // defpackage.ayrw
                    public final boolean a(Object obj2) {
                        return ((Boolean) ammv.i((jph) joe.this.h.get(((joj) obj2).a)).b(icu.p).e(false)).booleanValue();
                    }
                }).ak(TimeUnit.MILLISECONDS).F();
            }
        }).q(izw.i);
        ayrv ayrvVar = new ayrv() { // from class: job
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                aypy i2;
                aahv aahvVar2 = aahv.this;
                aais aaisVar2 = aaisVar;
                final joj jojVar = (joj) obj;
                jpi jpiVar2 = jojVar.b;
                aajc h = jpiVar2.h((String) jpiVar2.d(jojVar.a).c());
                aahu c = aahvVar2.c();
                if (h.b - 1 != 1) {
                    i2 = aaisVar2.c().i(h.a);
                } else {
                    i2 = c.i(h.a);
                }
                return i2.Y(new ayrv() { // from class: joc
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        return ammw.a(joj.this, (ammv) obj2);
                    }
                }).at();
            }
        };
        aysw.c(Integer.MAX_VALUE, "maxConcurrency");
        ayxw ayxwVar = new ayxw(q, ayrvVar);
        ayrv ayrvVar2 = aynu.j;
        ayxwVar.p(izw.k).X(izw.j);
    }

    public final ayqx a(jpr jprVar, final String str, final ayrs ayrsVar, final jpi jpiVar) {
        aypy Y = jprVar.b().Y(new ayrv() { // from class: jod
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return new joj(str, jpiVar, ayrsVar);
            }
        });
        final azqy azqyVar = this.j;
        return Y.ax(new ayrs() { // from class: jnz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                azqy.this.c((joj) obj);
            }
        });
    }

    public final ayrs b(final String str) {
        return new ayrs() { // from class: jny
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                joe joeVar = joe.this;
                String str2 = str;
                ammv ammvVar = (ammv) obj;
                yjk.e();
                jpi jpiVar = (jpi) joeVar.e.get(str2);
                if (jpiVar == null) {
                    String valueOf = String.valueOf(str2);
                    afsi.b(2, 28, valueOf.length() != 0 ? "No entityTransformer for outputEntityKey: ".concat(valueOf) : new String("No entityTransformer for outputEntityKey: "));
                } else {
                    joeVar.d(str2, jpiVar);
                    joeVar.c(jpiVar, (aakt) ammvVar.f(), str2, (jph) joeVar.h.get(str2));
                }
            }
        };
    }

    public final void c(jpi jpiVar, aakt aaktVar, String str, jph jphVar) {
        jpg c = jpiVar.c(aaktVar, str, jphVar);
        jph jphVar2 = c.b;
        if (jphVar2 != null) {
            this.h.put(str, jphVar2);
        }
        aaio c2 = ((aaih) this.a.c()).c();
        c2.d(c.a);
        String valueOf = String.valueOf(jpiVar.g());
        String valueOf2 = String.valueOf(jpiVar.f());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("Failed to update view model ");
        sb.append(valueOf);
        sb.append(" from data model ");
        sb.append(valueOf2);
        evr.bN(c2, sb.toString());
    }

    public final synchronized void d(String str, jpi jpiVar) {
        Map map = (Map) this.f.get(str);
        if (map == null) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No subscriptions for outputEntityKey: ".concat(valueOf) : new String("No subscriptions for outputEntityKey: "));
        }
        Set set = (Set) this.g.get(str);
        if (set == null) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf2.length() != 0 ? "No currentTriggers for outputEntityKey: ".concat(valueOf2) : new String("No currentTriggers for outputEntityKey: "));
        }
        amsx e = jpiVar.e(str);
        amsx<jpr> p = amsx.p(amkq.al(e, set));
        amsx<jpr> p2 = amsx.p(amkq.al(set, e));
        ayrs b = b(str);
        for (jpr jprVar : p2) {
            set.remove(jprVar);
            ayqx ayqxVar = (ayqx) map.remove(jprVar);
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
        }
        set.addAll(p);
        for (jpr jprVar2 : p) {
            map.put(jprVar2, a(jprVar2, str, b, jpiVar));
        }
    }
}
