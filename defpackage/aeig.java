package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeig {
    public final HashMap a = new HashMap();
    public final LruCache b = new LruCache(5);
    private final shf c;

    public aeig(shf shfVar) {
        this.c = shfVar;
    }

    private final aely e(String str) {
        double d;
        double d2;
        f();
        String str2 = null;
        aejw aejwVar = null;
        for (String str3 : this.a.keySet()) {
            if (!TextUtils.equals(str3, str)) {
                aejw aejwVar2 = (aejw) this.a.get(str3);
                shf shfVar = this.c;
                if (aejwVar2 != null || aejwVar != null) {
                    if (aejwVar2 == null || aejwVar != null) {
                        if (aejwVar2 != null) {
                            boolean m = adyu.m(aejwVar2, shfVar);
                            boolean m2 = adyu.m(aejwVar, shfVar);
                            if (m && m2) {
                                d = aejwVar.c.a;
                                d2 = aejwVar2.c.a;
                            } else if (!m) {
                                if (!m2) {
                                    d = aejwVar.c.a;
                                    d2 = aejwVar2.c.a;
                                }
                            }
                            if (((int) (d - d2)) <= 0) {
                            }
                        }
                    }
                    aejwVar = (aejw) this.a.get(str3);
                    str2 = str3;
                }
            }
        }
        if (str2 == null || aejwVar == null) {
            return null;
        }
        return new aely(str2, (int) aejwVar.c.a, aejwVar.b);
    }

    private final void f() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (this.c.d() - ((aejw) ((Map.Entry) it.next()).getValue()).a > 3600000) {
                it.remove();
            }
        }
    }

    public final synchronized aely a(String str) {
        return e(str);
    }

    public final synchronized aely b() {
        return e(null);
    }

    public final synchronized void c() {
        this.a.clear();
    }

    public final synchronized void d(String str, double d) {
        if (str == null) {
            return;
        }
        f();
        aejw aejwVar = (aejw) this.a.get(str);
        if (aejwVar == null) {
            aejwVar = new aejw((Uri) this.b.get(str));
            this.a.put(str, aejwVar);
        }
        aejwVar.a = this.c.d();
        aejx aejxVar = aejwVar.c;
        double d2 = aejxVar.a;
        if (d2 < 0.0d) {
            aejxVar.a = d;
        } else {
            aejxVar.a = (d2 * 0.8500000238418579d) + (d * 0.1499999761581421d);
        }
    }
}
