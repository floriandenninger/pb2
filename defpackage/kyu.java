package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyu extends jsn {
    private final azrw a;

    public kyu(azrw azrwVar) {
        super(agni.class, kyt.class);
        this.a = azrwVar;
    }

    private static atoo a(agng agngVar) {
        atqa atqaVar = agngVar.l;
        if (atqaVar != null && atqaVar.j.size() != 0) {
            for (atpz atpzVar : atqaVar.j) {
                if ((atpzVar.b & 2) != 0) {
                    atoo atooVar = atpzVar.c;
                    return atooVar == null ? atoo.a : atooVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        avgg k;
        int aM;
        agni agniVar = (agni) obj;
        agng agngVar = agniVar.a;
        agsw m = ((agof) this.a.get()).a().m();
        kys kysVar = new kys();
        int i = 1;
        kysVar.e = true;
        kysVar.c(agngVar.a);
        kysVar.d(agngVar.b);
        atoo a = a(agngVar);
        if (a != null && (a.b & 1) != 0 && (aM = anaf.aM(a.c)) != 0) {
            i = aM;
        }
        kysVar.h = i;
        atoo a2 = a(agngVar);
        avgg avggVar = null;
        if (a2 != null && (a2.b & 2) != 0 && (avggVar = a2.d) == null) {
            avggVar = avgg.a;
        }
        kysVar.a = avggVar;
        kysVar.b = agngVar.f;
        kysVar.d = fia.a(agngVar.a);
        kysVar.e(agngVar.j.getTime());
        long j = agniVar.e;
        agnb agnbVar = agngVar.c;
        if (agnbVar != null) {
            kysVar.c = agnbVar.b;
        }
        Iterator it = agniVar.b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            agnv e = m.e((String) it.next());
            if (e != null && e.i() == agnq.PLAYABLE && (k = e.k()) != null) {
                kysVar.b(k);
                i2++;
                if (i2 >= 4) {
                    break;
                }
            }
        }
        return kysVar.a();
    }
}
