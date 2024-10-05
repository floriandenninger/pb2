package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dha extends dhk implements Cloneable, dji, div {
    public static final AtomicInteger h = new AtomicInteger(1);
    public static final dit[] i = new dit[0];
    private final String a;
    private boolean b;
    private SparseArray c;
    private SparseIntArray d;
    private Map e;
    List j;
    public int k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public AtomicBoolean p;
    public dhe q;
    public Context r;
    public dgx s;

    public dha() {
        throw null;
    }

    public static boolean A(dhe dheVar, dha dhaVar) {
        djx e;
        return x(dhaVar) || !(dhaVar == null || dheVar == null || (e = dheVar.e()) == null || !e.i.containsKey(Integer.valueOf(dhaVar.k)));
    }

    public static void B(szq szqVar, dha dhaVar) {
        if (dhaVar.j == null) {
            dhaVar.j = new ArrayList();
        }
        dhaVar.j.add(new dnb(szqVar, dhaVar));
    }

    public static boolean v(dha dhaVar) {
        return dhaVar instanceof djl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean w(dha dhaVar) {
        return dhaVar != null && dhaVar.aj() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x(dha dhaVar) {
        return w(dhaVar) && dhaVar.Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y(dha dhaVar) {
        return (dhaVar == null || dhaVar.aj() == 1) ? false : true;
    }

    public static boolean z(dha dhaVar) {
        return dhaVar != null && dhaVar.aj() == 3;
    }

    public final dgx C() {
        if (this.s == null) {
            this.s = new dgx();
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d() {
        return false;
    }

    @Override // defpackage.div
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        if (this.k == dhaVar.k) {
            return true;
        }
        return did.y(this, dhaVar, true);
    }

    public SparseArray g() {
        return this.c;
    }

    public final SparseArray h() {
        if (this.c == null) {
            this.c = new SparseArray();
        }
        return this.c;
    }

    protected dha i() {
        return null;
    }

    public dha j() {
        try {
            dha dhaVar = (dha) super.clone();
            dhaVar.m = null;
            dhaVar.b = false;
            dhaVar.o = false;
            dhaVar.p = new AtomicBoolean();
            dhaVar.q = null;
            dhaVar.d = null;
            dhaVar.e = null;
            return dhaVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dha k(dhe dheVar) {
        dha j = j();
        j.m = this.m;
        j.p(this);
        j.t(dheVar);
        j.q.m = at(dheVar, dheVar.m);
        return j;
    }

    @Override // defpackage.dji
    @Deprecated
    public final dix l() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dlq m() {
        return null;
    }

    public final String n() {
        if (this.n == null && !this.o) {
            this.n = Integer.toString(this.u);
        }
        return this.n;
    }

    public final String o() {
        dha i2 = i();
        if (i2 == null) {
            return this.a;
        }
        String str = this.a;
        while (i2.i() != null) {
            i2 = i2.i();
        }
        String o = i2.o();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(o).length());
        sb.append(str);
        sb.append("(");
        sb.append(o);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(dha dhaVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q() {
        if (this.b) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Duplicate layout of a component: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        this.b = true;
    }

    public final void r(dhe dheVar, int i2, int i3, dlo dloVar) {
        djx e = dheVar.e();
        if (e == null) {
            throw new IllegalStateException(String.valueOf(o()).concat(": Trying to measure a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."));
        }
        djr d = e.d(this);
        if (d == null || !did.x(d.e(), i2, d.H()) || !did.x(d.d(), i3, d.C())) {
            e.j(this);
            d = djt.f(dheVar, this, i2, i3, null, null, null);
            e.i.put(Integer.valueOf(this.k), d);
            if (w(this)) {
                d.ko(i2);
                d.kl(i3);
                d.kn(d.H());
                d.km(d.C());
            }
        }
        dloVar.a = d.H();
        dloVar.b = d.C();
    }

    public void s(dja djaVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t(dhe dheVar) {
        dlq dlqVar;
        Object obj;
        ArrayList arrayList;
        List<dlp> list;
        if ((doa.a || doa.g) && this.m == null) {
            dha dhaVar = dheVar.f;
            String n = n();
            if (dhaVar != null) {
                String str = dhaVar.m;
                if (str != null) {
                    StringBuilder sb = new StringBuilder(str.length() + n.length() + 1);
                    sb.append(str);
                    sb.append(",");
                    sb.append(n);
                    String sb2 = sb.toString();
                    int i2 = 0;
                    if (!this.o) {
                        if (dhaVar.d == null) {
                            dhaVar.d = new SparseIntArray();
                        }
                        int i3 = this.u;
                        int i4 = dhaVar.d.get(i3, 0);
                        dhaVar.d.put(i3, i4 + 1);
                        n = did.B(sb2, i4);
                    } else {
                        if (dhaVar.e == null) {
                            dhaVar.e = new HashMap();
                        }
                        int intValue = dhaVar.e.containsKey(sb2) ? ((Integer) dhaVar.e.get(sb2)).intValue() : 0;
                        dhaVar.e.put(sb2, Integer.valueOf(intValue + 1));
                        if (intValue != 0) {
                            String o = o();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(n).length() + 158 + String.valueOf(o).length());
                            sb3.append("The manual key ");
                            sb3.append(n);
                            sb3.append(" you are setting on this ");
                            sb3.append(o);
                            sb3.append(" is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it.");
                            dhz.a(1, "Component:DuplicateManualKey", sb3.toString());
                            i2 = intValue;
                        }
                        n = did.B(sb2, i2);
                    }
                } else {
                    String o2 = o();
                    String o3 = dhaVar.o();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(o2).length() + 192 + String.valueOf(o3).length());
                    sb4.append("Trying to generate parent-based key for component ");
                    sb4.append(o2);
                    sb4.append(" , but parent ");
                    sb4.append(o3);
                    sb4.append(" has a null global key \". This is most likely a configuration mistake, check the value of ComponentsConfiguration.useGlobalKeys.");
                    dhz.a(2, "Component:NullParentKey", sb4.toString());
                    String valueOf = String.valueOf(n);
                    n = valueOf.length() != 0 ? "null".concat(valueOf) : new String("null");
                }
            }
            this.m = n;
        }
        dhe d = dhe.d(dheVar, this);
        this.q = d;
        au(d.m);
        if (ac()) {
            dlr dlrVar = dheVar.d;
            dlrVar.l();
            dlrVar.j();
            if (ac()) {
                String str2 = this.m;
                synchronized (dlrVar) {
                    dlqVar = (dlq) dlrVar.e.get(str2);
                    dlrVar.f.add(str2);
                }
                if (dlqVar != null) {
                    X(dlqVar, m());
                } else {
                    dhe dheVar2 = this.q;
                    ComponentTree componentTree = dheVar2.j;
                    if (componentTree == null) {
                        M(dheVar2);
                    } else {
                        djp djpVar = componentTree.d;
                        synchronized (djpVar) {
                            obj = djpVar.b.get(this.m);
                            if (obj == null) {
                                obj = new Object();
                                djpVar.b.put(this.m, obj);
                            }
                        }
                        synchronized (obj) {
                            dlq dlqVar2 = (dlq) djpVar.a.get(this.m);
                            if (dlqVar2 == null) {
                                M(this.q);
                                djpVar.a.put(this.m, m());
                            } else {
                                X(dlqVar2, m());
                            }
                        }
                    }
                }
                synchronized (dlrVar) {
                    Map map = dlrVar.a;
                    arrayList = null;
                    list = map == null ? null : (List) map.get(str2);
                }
                if (list != null) {
                    ArrayList arrayList2 = null;
                    for (dlp dlpVar : list) {
                        dlq m = m();
                        m.a(dlpVar);
                        dmh a = m instanceof dhj ? ((dhj) m).a() : null;
                        if (a != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(a);
                        }
                    }
                    dqm.a.addAndGet(list.size());
                    synchronized (dlrVar) {
                        dlrVar.a.remove(str2);
                        Map map2 = dlrVar.b;
                        if (map2 != null) {
                            map2.remove(str2);
                        }
                        dlrVar.d.put(str2, list);
                    }
                    arrayList = arrayList2;
                }
                synchronized (dlrVar) {
                    dlrVar.e.put(str2, m());
                    if (arrayList != null && !arrayList.isEmpty()) {
                        dlrVar.k();
                        dlrVar.c.put(str2, arrayList);
                    }
                }
            }
        }
        AtomicBoolean atomicBoolean = this.p;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
    }

    public boolean u() {
        return this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dha(String str) {
        this.k = h.getAndIncrement();
        this.p = new AtomicBoolean();
        this.b = false;
        this.a = str;
    }
}
