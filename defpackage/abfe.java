package defpackage;

import j$.util.Map;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abfe implements abey {
    private final abff a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final abfa f;

    public abfe(abfa abfaVar, abff abffVar) {
        this.f = abfaVar;
        this.a = abffVar;
    }

    private static String f(apni apniVar) {
        apnh b = apniVar.b();
        StringBuilder sb = new StringBuilder(b.name());
        if (b == apnh.SCREEN_EXIT) {
            sb.append(";");
            sb.append(apniVar.e().d().name());
        }
        return sb.toString();
    }

    private final synchronized Map g(Iterable iterable) {
        EnumMap enumMap;
        enumMap = new EnumMap(avep.class);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abez abezVar = (abez) this.b.get((String) it.next());
            if (abezVar != null) {
                ((List) Map.EL.computeIfAbsent(enumMap, avep.a(abezVar.a.b), opb.p)).add(abezVar);
            }
        }
        return enumMap;
    }

    @Override // defpackage.abey
    public final synchronized void a(apni apniVar) {
        HashSet hashSet = (HashSet) this.d.remove(f(apniVar));
        if (hashSet == null) {
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
    }

    @Override // defpackage.abey
    public final synchronized void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aveq aveqVar = (aveq) it.next();
            abez abezVar = new abez(aveqVar);
            this.b.put(aveqVar.d, abezVar);
            ((HashSet) Map.EL.computeIfAbsent(this.c, abezVar.b(), opb.q)).add(abezVar.c());
            ((HashSet) Map.EL.computeIfAbsent(this.d, f(abezVar.a()), opb.r)).add(abezVar.c());
        }
        e(avkc.TASK_REGISTERED);
    }

    public final synchronized void c(String str) {
        this.a.a.c(str);
        anhy anhyVar = (anhy) this.e.remove(str);
        if (anhyVar != null) {
            anhyVar.cancel(false);
        } else {
            d(str);
        }
    }

    public final synchronized void d(String str) {
        this.e.remove(str);
        abez abezVar = (abez) this.b.remove(str);
        if (abezVar == null) {
            return;
        }
        HashSet hashSet = (HashSet) this.c.get(abezVar.b());
        if (hashSet != null) {
            hashSet.remove(str);
        }
        HashSet hashSet2 = (HashSet) this.d.get(f(abezVar.a()));
        if (hashSet2 == null) {
            return;
        }
        hashSet2.remove(str);
    }

    public final synchronized void e(avkc avkcVar) {
        HashSet hashSet = (HashSet) this.c.remove(avkcVar);
        if (hashSet == null) {
            return;
        }
        for (Map.Entry entry : g(hashSet).entrySet()) {
            abfa abfaVar = this.f;
            avep avepVar = (avep) entry.getKey();
            avep avepVar2 = avep.PREFETCH_CONFIG;
            java.util.Map a = (avepVar.ordinal() != 0 ? abex.g : abfaVar.a).a((List) entry.getValue());
            for (Map.Entry entry2 : a.entrySet()) {
                final String str = (String) entry2.getKey();
                ynm.l((anhy) entry2.getValue(), angq.a, new ynk() { // from class: abfb
                    @Override // defpackage.zfi
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        abfe.this.d(str);
                    }
                }, new ynl() { // from class: abfc
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        abfe.this.d(str);
                    }
                }, new Runnable() { // from class: abfd
                    @Override // java.lang.Runnable
                    public final void run() {
                        abfe.this.d(str);
                    }
                });
            }
            this.e.putAll(a);
        }
    }
}
