package defpackage;

import com.google.protos.youtube.api.innertube.SettingRenderer;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akgl {
    public final Map a;
    public final Map b;

    public akgl(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    private final auqc w(auqc auqcVar) {
        auqc auqcVar2 = (auqc) this.b.get(auqcVar);
        return auqcVar2 == null ? auqcVar : auqcVar2;
    }

    private final synchronized int x(agng agngVar, Collection collection) {
        String str = agngVar.a;
        int i = agngVar.f;
        if (collection != null) {
            i -= collection.size();
        }
        agsx k = k(str);
        if (k == null) {
            return i;
        }
        return i - k.a();
    }

    public final aupu a(aupu aupuVar) {
        aupu aupuVar2 = (aupu) this.a.get(aupuVar);
        return aupuVar2 == null ? aupuVar : aupuVar2;
    }

    public final auqa b(aupu aupuVar) {
        aulq aulqVar = a(aupuVar).n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return (auqa) aulqVar.pX(SettingRenderer.settingDialogRenderer);
    }

    public final auqh c(aupu aupuVar) {
        aulq aulqVar = a(aupuVar).n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return (auqh) aulqVar.pX(SettingRenderer.settingSingleOptionMenuRenderer);
    }

    public final void d(aupu aupuVar, boolean z) {
        Map map = this.a;
        aone builder = a(aupuVar).toBuilder();
        builder.copyOnWrite();
        aupu aupuVar2 = (aupu) builder.instance;
        aupuVar2.b |= 64;
        aupuVar2.f = z;
        map.put(aupuVar, (aupu) builder.build());
    }

    public final void e(auqc auqcVar, boolean z) {
        Map map = this.b;
        aone builder = w(auqcVar).toBuilder();
        builder.copyOnWrite();
        auqc auqcVar2 = (auqc) builder.instance;
        auqcVar2.b |= 8;
        auqcVar2.f = z;
        map.put(auqcVar, (auqc) builder.build());
    }

    public final void f(aupu aupuVar, auqa auqaVar) {
        Map map = this.a;
        aone builder = a(aupuVar).toBuilder();
        aulq aulqVar = a(aupuVar).n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aong aongVar = (aong) aulqVar.toBuilder();
        aongVar.e(SettingRenderer.settingDialogRenderer, auqaVar);
        builder.copyOnWrite();
        aupu aupuVar2 = (aupu) builder.instance;
        aulq aulqVar2 = (aulq) aongVar.build();
        aulqVar2.getClass();
        aupuVar2.n = aulqVar2;
        aupuVar2.b |= 32768;
        map.put(aupuVar, (aupu) builder.build());
    }

    public final boolean g(aupu aupuVar) {
        return a(aupuVar).f;
    }

    public final boolean h(auqc auqcVar) {
        return w(auqcVar).f;
    }

    public final boolean i(aupu aupuVar) {
        aulq aulqVar = a(aupuVar).n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return aulqVar.pY(SettingRenderer.settingSingleOptionMenuRenderer);
    }

    public final boolean j(aupu aupuVar) {
        aulq aulqVar = a(aupuVar).n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return aulqVar.pY(SettingRenderer.settingDialogRenderer);
    }

    public final synchronized agsx k(String str) {
        zhq.m(str);
        return (agsx) this.a.get(str);
    }

    public final synchronized agsx l(agng agngVar, Collection collection) {
        agsx agsxVar;
        agngVar.getClass();
        String str = agngVar.a;
        agsxVar = new agsx(this, agngVar, null);
        agsxVar.h(x(agngVar, collection));
        agsxVar.g();
        agsxVar.f();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                agsxVar.e((String) it.next());
            }
        }
        agsx k = k(str);
        if (k != null) {
            Iterator it2 = k.d().iterator();
            while (it2.hasNext()) {
                agsxVar.e((String) it2.next());
            }
        }
        this.a.put(str, agsxVar);
        return agsxVar;
    }

    public final synchronized List m(String str) {
        ArrayList arrayList;
        zhq.m(str);
        arrayList = new ArrayList();
        Set set = (Set) this.b.get(str);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                agsx k = k((String) it.next());
                if (k != null) {
                    arrayList.add(k);
                }
            }
        }
        return arrayList;
    }

    public final synchronized void n(String str, String str2) {
        Set set = (Set) this.b.get(str);
        if (set == null) {
            set = new HashSet();
            this.b.put(str, set);
        }
        set.add(str2);
    }

    public final synchronized void o(String str) {
        zhq.m(str);
        this.a.remove(str);
    }

    public final synchronized void p(String str, String str2) {
        Set set = (Set) this.b.get(str);
        if (set != null) {
            set.remove(str2);
            if (set.isEmpty()) {
                this.b.remove(str);
            }
        }
    }

    public final synchronized aghm q(String str) {
        zhq.m(str);
        return (aghm) this.a.get(str);
    }

    public final synchronized List r(String str) {
        LinkedList linkedList;
        zhq.m(str);
        linkedList = new LinkedList();
        Set set = (Set) this.b.get(str);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aghm q = q((String) it.next());
                if (q != null) {
                    linkedList.add(q);
                }
            }
        }
        return linkedList;
    }

    public final synchronized void s(String str, String str2) {
        zhq.m(str);
        zhq.m(str2);
        Set set = (Set) this.b.get(str);
        if (set == null) {
            set = new HashSet();
            this.b.put(str, set);
        }
        set.add(str2);
    }

    public final synchronized void t(String str, String str2) {
        zhq.m(str);
        zhq.m(str2);
        Set set = (Set) this.b.get(str);
        if (set != null) {
            set.remove(str2);
            if (set.isEmpty()) {
                this.b.remove(str);
            }
        }
    }

    public final synchronized void u(String str) {
        zhq.m(str);
        this.a.remove(str);
    }

    public final synchronized aghm v(bagd bagdVar, Collection collection) {
        aghm aghmVar;
        String str = bagdVar.a;
        aghmVar = new aghm(this, bagdVar, null, null, null);
        aghmVar.e();
        aghmVar.d();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                aghmVar.c((String) it.next());
            }
        }
        this.a.put(str, aghmVar);
        return aghmVar;
    }

    public akgl(byte[] bArr) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public akgl() {
        this.a = DesugarCollections.synchronizedMap(new IdentityHashMap());
        this.b = DesugarCollections.synchronizedMap(new IdentityHashMap());
    }
}
