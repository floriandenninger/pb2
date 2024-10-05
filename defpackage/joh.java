package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class joh implements ypd {
    public final azrw a;
    public final azrw b;
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;

    public joh(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        this.a = azrwVar6;
        this.d = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.g = azrwVar4;
        this.b = azrwVar5;
    }

    public final void a() {
        ((ayqi) this.a.get()).f(new jog(this, 1));
    }

    public final void b() {
        HashSet<Class> hashSet = new HashSet();
        Iterator it = ((Set) this.g.get()).iterator();
        while (it.hasNext()) {
            hashSet.add(((jpe) it.next()).b);
        }
        Iterator it2 = ((Set) this.f.get()).iterator();
        while (it2.hasNext()) {
            hashSet.add(((jpi) it2.next()).g());
        }
        aahu c = ((aahv) this.d.get()).c();
        final joe joeVar = (joe) this.e.get();
        for (Class cls : hashSet) {
            Set set = this.c;
            aypy ab = c.a(cls).ab((ayqi) this.a.get());
            joeVar.getClass();
            set.add(ab.ay(new ayrs() { // from class: jof
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    jpi jpiVar;
                    aakt aaktVar;
                    joe joeVar2 = joe.this;
                    String str = (String) obj;
                    yjk.e();
                    int a = aalt.a(str);
                    amrz amrzVar = joeVar2.c;
                    Integer valueOf = Integer.valueOf(a);
                    if (!amrzVar.containsKey(valueOf)) {
                        int a2 = aalt.a(str);
                        awas z = etx.z(str, joeVar2.i);
                        if (z != null) {
                            int i = z.d;
                            Map map = (Map) joeVar2.d.get(Integer.valueOf(a2));
                            if (map != null) {
                                jpiVar = (jpi) map.get(Integer.valueOf(i));
                            } else {
                                StringBuilder sb = new StringBuilder(105);
                                sb.append("Unable to find transformer from data model field number ");
                                sb.append(i);
                                sb.append(" to view model field number");
                                sb.append(a2);
                                zga.b(sb.toString());
                            }
                        }
                        jpiVar = null;
                    } else {
                        jpiVar = (jpi) joeVar2.c.get(valueOf);
                    }
                    if (jpiVar == null) {
                        String valueOf2 = String.valueOf(str);
                        zga.b(valueOf2.length() != 0 ? "Unable to find transformer for outputEntityKey = ".concat(valueOf2) : new String("Unable to find transformer for outputEntityKey = "));
                        return;
                    }
                    if (!joeVar2.f.containsKey(str)) {
                        joeVar2.f.put(str, new ConcurrentHashMap());
                    }
                    if (!joeVar2.g.containsKey(str)) {
                        joeVar2.g.put(str, Collections.newSetFromMap(new ConcurrentHashMap()));
                    }
                    Map map2 = (Map) joeVar2.f.get(str);
                    ayrs b = joeVar2.b(str);
                    joeVar2.e.put(str, jpiVar);
                    Set set2 = (Set) joeVar2.g.get(str);
                    amsx e = jpiVar.e(str);
                    set2.addAll(e);
                    amxd listIterator = e.listIterator();
                    while (listIterator.hasNext()) {
                        jpr jprVar = (jpr) listIterator.next();
                        map2.put(jprVar, joeVar2.a(jprVar, str, b, jpiVar));
                    }
                    ammv d = jpiVar.d(str);
                    if (d.h()) {
                        aajc h = jpiVar.h((String) d.c());
                        if (h.b - 1 != 1) {
                            aaktVar = (aakt) joeVar2.b.c().f(h.a).X();
                        } else {
                            aaktVar = (aakt) joeVar2.a.c().f(h.a).X();
                        }
                        joeVar2.c(jpiVar, aaktVar, str, null);
                    }
                }
            }, izw.l));
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            ((ayqi) this.a.get()).f(new jog(this, 2));
            return null;
        }
        if (i == 1) {
            ((ayqi) this.a.get()).f(new jog(this, 0));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
