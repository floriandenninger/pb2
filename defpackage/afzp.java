package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzp {
    public static final /* synthetic */ int c = 0;
    private static final amsx d = amsx.s("FEnotifications_inbox", "FEshared");
    public final Set b;
    public final Map a = new HashMap();
    private final Map e = new HashMap();

    public afzp(azrw azrwVar) {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        this.b = newSetFromMap;
        newSetFromMap.addAll((Collection) azrwVar.get());
    }

    private final afzn h(String str) {
        for (afzn afznVar : this.a.keySet()) {
            if (TextUtils.equals(afznVar.a, str)) {
                return afznVar;
            }
        }
        return null;
    }

    private final void i(afzn afznVar) {
        this.a.put(afznVar, false);
        f(afznVar.a, afzv.a(afznVar.b, afznVar.d, false));
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((afzo) it.next()).o(afznVar.a, afznVar.b, afznVar.d);
        }
    }

    public final int a(String str) {
        yjk.f();
        int i = 0;
        if (str.equals("FEactivity")) {
            ArrayList arrayList = new ArrayList(Arrays.asList("FEshared", "FEnotifications_inbox"));
            for (afzn afznVar : this.a.keySet()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(afznVar.a, (String) it.next())) {
                        if (!((Boolean) this.a.get(afznVar)).booleanValue()) {
                            i += afznVar.d;
                        }
                        it.remove();
                    }
                }
            }
            return i;
        }
        afzn h = h(str);
        if (h == null || ((Boolean) this.a.get(h)).booleanValue()) {
            return 0;
        }
        return h.d;
    }

    public final azqw b(String str) {
        if (!this.e.containsKey(str)) {
            this.e.put(str, azqv.aq(afzv.b()).av());
        }
        return (azqw) this.e.get(str);
    }

    public final void c(afzo afzoVar, long j) {
        yjk.f();
        this.b.add(afzoVar);
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList, unt.m);
        for (int i = 0; i < arrayList.size(); i++) {
            afzn afznVar = (afzn) arrayList.get(i);
            if (!((Boolean) this.a.get(afznVar)).booleanValue() || afznVar.c > j) {
                String str = afznVar.a;
                boolean z = afznVar.b;
                int i2 = afznVar.d;
                int i3 = afznVar.c;
                if (i == arrayList.size() - 1) {
                    d.contains(afznVar.a);
                }
                afzoVar.o(str, z, i2);
            }
        }
    }

    public final void d(String str) {
        yjk.f();
        afzn h = h(str);
        if (h != null) {
            this.a.put(h, true);
        }
        b(str).c(new afzv(false, 0, true));
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((afzo) it.next()).l(str);
        }
    }

    public final void e(afzn afznVar) {
        yjk.f();
        String str = afznVar.a;
        if (str != null) {
            afzn h = h(str);
            if (h == null) {
                i(afznVar);
                return;
            }
            if (afznVar.c >= h.c) {
                if (h.b != afznVar.b) {
                    this.a.remove(h);
                    i(afznVar);
                } else if (!((Boolean) this.a.get(h)).booleanValue()) {
                    this.a.remove(h);
                    i(afznVar);
                } else if (afznVar.c > h.c) {
                    this.a.remove(h);
                    i(afznVar);
                }
            }
        }
    }

    public final void f(String str, afzv afzvVar) {
        b(str).c(afzvVar);
    }

    public final boolean g(String str) {
        yjk.f();
        if (str.equals("FEactivity")) {
            return g("FEshared") || g("FEnotifications_inbox");
        }
        afzn h = h(str);
        if (h == null) {
            return false;
        }
        return h.b && !((Boolean) this.a.get(h)).booleanValue();
    }
}
