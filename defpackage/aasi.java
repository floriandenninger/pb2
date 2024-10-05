package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aasi implements aasa {
    private final aary a;
    private final Set b;

    public aasi(aary aaryVar) {
        this.a = aaryVar;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = newSetFromMap;
        newSetFromMap.add(aaryVar);
    }

    @Override // defpackage.aasa
    public final void c(arnd arndVar) {
        if ((arndVar.b & 1048576) != 0) {
            for (aary aaryVar : this.b) {
                auxw auxwVar = arndVar.h;
                if (auxwVar == null) {
                    auxwVar = auxw.a;
                }
                aonu aonuVar = auxwVar.c;
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : aaryVar.b.entrySet()) {
                    Iterator it = ((Collection) entry.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            auxv auxvVar = (auxv) it.next();
                            int bh = aobq.bh(auxvVar.c);
                            if (bh != 0 && bh == 3 && aonuVar.contains(Integer.valueOf(auxvVar.b))) {
                                hashSet.add((String) entry.getKey());
                                break;
                            }
                        }
                    }
                }
                aaryVar.b.keySet().removeAll(hashSet);
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    aaryVar.a.f((String) it2.next());
                }
            }
        }
    }

    @Override // defpackage.aasa
    public final void d(aaru aaruVar, arnd arndVar) {
        c(arndVar);
        aary aaryVar = this.a;
        auxw auxwVar = arndVar.h;
        if (auxwVar == null) {
            auxwVar = auxw.a;
        }
        aony aonyVar = auxwVar.b;
        String b = aaruVar.b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        if (aonyVar.isEmpty() || !aaruVar.r()) {
            aaryVar.b.remove(b);
        } else {
            aaryVar.b.put(b, aonyVar);
        }
    }

    @Override // defpackage.aasa
    public final /* synthetic */ boolean f(aaru aaruVar) {
        return true;
    }
}
