package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgy {
    public final tfn a;
    public final shf c;
    public final tgr d = new tgx(this);
    public int e = 0;
    public Runnable f = null;
    public Runnable g = null;
    public final thb b = new thb();

    public tgy(tfn tfnVar, shf shfVar) {
        this.a = tfnVar;
        this.c = shfVar;
    }

    public final void a() {
        this.f = null;
        thb thbVar = this.b;
        if (thbVar.c.isEmpty() && thbVar.a.isEmpty() && thbVar.b.isEmpty() && thbVar.e.isEmpty()) {
            return;
        }
        amil l = amjw.l("GIL:AutoProcessBatch");
        try {
            this.a.c(new tfm() { // from class: tgu
                /* JADX WARN: Finally extract failed */
                @Override // defpackage.tfm
                public final List a() {
                    tgy tgyVar = tgy.this;
                    thb thbVar2 = tgyVar.b;
                    amil l2 = amjw.l("GIL:CreateInsertGrafts");
                    try {
                        for (tgb tgbVar : thbVar2.a) {
                            if (tgbVar.b == -1) {
                                thbVar2.b(tgbVar);
                            }
                        }
                        thbVar2.a.clear();
                        Iterator it = thbVar2.d.iterator();
                        while (it.hasNext()) {
                            ((tgb) it.next()).b = -1;
                        }
                        thbVar2.d.clear();
                        l2.close();
                        amil l3 = amjw.l("GIL:CreateVisibilityGrafts");
                        try {
                            Iterator it2 = thbVar2.b.iterator();
                            while (true) {
                                int i = 1;
                                if (it2.hasNext()) {
                                    tgb tgbVar2 = (tgb) it2.next();
                                    amkq.Q(tgbVar2.d(), "Not impressed: %s", tgbVar2);
                                    int f = tgbVar2.f();
                                    aong aongVar = tgbVar2.c;
                                    int r = anaf.r(((tgf) aongVar.instance).e);
                                    if (r == 0) {
                                        r = 1;
                                    }
                                    if (r != f) {
                                        int r2 = anaf.r(((tgf) aongVar.instance).e);
                                        if (r2 == 0) {
                                            r2 = 1;
                                        }
                                        int i2 = r2 - 1;
                                        if (i2 == 2 || i2 == 4) {
                                            if (f == 2) {
                                                continue;
                                            } else {
                                                amkq.O(1 == (f ^ 1), "Repressed VE was visible.");
                                            }
                                        }
                                        aongVar.copyOnWrite();
                                        tgf tgfVar = (tgf) aongVar.instance;
                                        int i3 = f - 1;
                                        if (f != 0) {
                                            tgfVar.e = i3;
                                            tgfVar.b |= 2;
                                            List arrayList = new ArrayList();
                                            sgf.O(tgbVar2, arrayList);
                                            thbVar2.a(arrayList, 0).f(tgbVar2, arrayList);
                                        } else {
                                            throw null;
                                        }
                                    }
                                } else {
                                    thbVar2.b.clear();
                                    l3.close();
                                    if (!thbVar2.e.isEmpty()) {
                                        amil l4 = amjw.l("GIL:CreateRemoveGrafts");
                                        try {
                                            for (Map.Entry entry : thbVar2.e.entrySet()) {
                                                Collection<tgf> collection = (Collection) entry.getValue();
                                                for (tgf tgfVar2 : collection) {
                                                    tgb tgbVar3 = (tgb) entry.getKey();
                                                    int r3 = anaf.r(tgfVar2.e);
                                                    if (r3 != 0 && r3 != i) {
                                                    }
                                                    ArrayList arrayList2 = new ArrayList();
                                                    aong aongVar2 = (aong) tgfVar2.toBuilder();
                                                    aongVar2.copyOnWrite();
                                                    tgf tgfVar3 = (tgf) aongVar2.instance;
                                                    tgfVar3.e = i;
                                                    tgfVar3.b |= 2;
                                                    arrayList2.add((tgf) aongVar2.build());
                                                    if (tgbVar3 != null) {
                                                        sgf.O(tgbVar3, arrayList2);
                                                    }
                                                    thbVar2.a(arrayList2, 0).e(new thh(3, arrayList2, -1));
                                                    i = 1;
                                                }
                                                collection.clear();
                                                thbVar2.f = collection;
                                                i = 1;
                                            }
                                            l4.close();
                                            thbVar2.e.clear();
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (tgyVar.e >= 0) {
                                        return tgyVar.b.c();
                                    }
                                    if (tgyVar.g != null) {
                                        return null;
                                    }
                                    tgyVar.g = new tgw(tgyVar, 1);
                                    uqq.k(tgyVar.g, -tgyVar.e);
                                    return null;
                                }
                            }
                        } finally {
                            try {
                                l3.close();
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            l2.close();
                        } catch (Throwable unused2) {
                        }
                        throw th2;
                    }
                }
            });
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void b() {
        if (this.f != null) {
            return;
        }
        tgw tgwVar = new tgw(this, 0);
        this.f = tgwVar;
        int i = this.e;
        if (i > 0) {
            uqq.k(tgwVar, i);
        } else {
            uqq.l(tgwVar);
        }
    }
}
