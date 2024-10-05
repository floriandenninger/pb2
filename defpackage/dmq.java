package defpackage;

import android.view.View;
import com.facebook.litho.ComponentHost;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dmq {
    public final Map a = new HashMap();
    public final dmj b = new dmj();
    public final aeh c = new aeh();
    public final Map d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final dmo f = new dmo(this);
    public final dmn g = new dmn(this);
    public final dmp h = new dmp(this);
    public final dml i;
    public dni j;

    public dmq(dml dmlVar) {
        this.i = dmlVar;
    }

    public static void b(dmk dmkVar) {
        if (dmkVar.d != null) {
            dmkVar.d = null;
        }
        if (dmkVar.e != null) {
            dmkVar.e = null;
        }
    }

    public static void e(dng dngVar, dlf dlfVar) {
        short s = dlfVar.b;
        for (int i = 0; i < s; i++) {
            dngVar.c(dlfVar.c(i));
        }
    }

    public static void h(dng dngVar, float f, dlf dlfVar) {
        short s = dlfVar.b;
        for (int i = 0; i < s; i++) {
            dngVar.d(dlfVar.c(i), f);
        }
    }

    private static String i(int i) {
        return i != -1 ? i != 0 ? i != 1 ? "DISAPPEARED" : "CHANGED" : "APPEARED" : "UNSET";
    }

    private final void j(View view, boolean z) {
        if (view instanceof ComponentHost) {
            if (z) {
                ComponentHost componentHost = (ComponentHost) view;
                if (componentHost.p) {
                    componentHost.p = false;
                    componentHost.setClipChildren(componentHost.q);
                }
            } else {
                ComponentHost componentHost2 = (ComponentHost) view;
                if (!componentHost2.p) {
                    componentHost2.q = componentHost2.getClipChildren();
                    componentHost2.setClipChildren(false);
                    componentHost2.p = true;
                }
            }
        }
        Object parent = view.getParent();
        if (parent instanceof ComponentHost) {
            j((View) parent, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, dng] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dni a(defpackage.dmh r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmq.a(dmh):dni");
    }

    public final void c(dmi dmiVar, dlf dlfVar, dlf dlfVar2) {
        dmk dmkVar = (dmk) this.b.a(dmiVar);
        if (dmkVar == null) {
            dmkVar = new dmk();
            dmj dmjVar = this.b;
            if (dmjVar.d.put(dmiVar, dmkVar) == null) {
                int i = dmiVar.a;
                if (i == 1) {
                    dmjVar.a.put(dmiVar.b, dmiVar);
                } else if (i != 2) {
                    dmjVar.c.put(dmiVar.b, dmiVar);
                } else {
                    String str = dmiVar.c;
                    Map map = (Map) dmjVar.b.get(str);
                    if (map == null) {
                        map = new LinkedHashMap();
                        dmjVar.b.put(str, map);
                    }
                    map.put(dmiVar.b, dmiVar);
                }
            }
        }
        if (dlfVar != null || dlfVar2 != null) {
            if (dlfVar == null) {
                dmkVar.c = 0;
            } else if (dlfVar2 != null) {
                dmkVar.c = 1;
            } else {
                dmkVar.c = 2;
            }
            dmkVar.d = dlfVar;
            dmkVar.e = dlfVar2;
            dlf dlfVar3 = dmkVar.e;
            dju djuVar = dlfVar3 != null ? (dju) dlfVar3.d() : null;
            for (dng dngVar : dmkVar.a.keySet()) {
                dmm dmmVar = (dmm) dmkVar.a.get(dngVar);
                if (djuVar == null) {
                    dmmVar.d = null;
                } else {
                    dmmVar.d = Float.valueOf(dngVar.e(djuVar));
                }
            }
            dmkVar.f = true;
            if (dgp.a) {
                String valueOf = String.valueOf(dmiVar);
                int i2 = dmkVar.c;
                String.valueOf(valueOf).length();
                i(i2).length();
                return;
            }
            return;
        }
        throw new RuntimeException("Both current and next LayoutOutput groups were null!");
    }

    public final void d(dlf dlfVar, boolean z) {
        Object b = dlfVar.b(3);
        if (b instanceof View) {
            j((View) b, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(dmi dmiVar, dlf dlfVar) {
        dmk dmkVar = (dmk) this.b.a(dmiVar);
        if (dmkVar != null) {
            g(dmiVar, dmkVar, dlfVar);
        }
    }

    public final void g(dmi dmiVar, dmk dmkVar, dlf dlfVar) {
        dlf dlfVar2 = dmkVar.b;
        if (dlfVar2 == null && dlfVar == null) {
            return;
        }
        if (dlfVar2 == null || !dlfVar2.equals(dlfVar)) {
            if (dgp.a) {
                String valueOf = String.valueOf(dmiVar);
                String valueOf2 = String.valueOf(dlfVar);
                String.valueOf(valueOf).length();
                String.valueOf(valueOf2).length();
            }
            Map map = dmkVar.a;
            if (dmkVar.b != null) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    e((dng) it.next(), dmkVar.b);
                }
                d(dmkVar.b, true);
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                dnh dnhVar = ((dmm) it2.next()).a;
                dnhVar.b(dlfVar);
                dnhVar.c(dnhVar.c);
            }
            if (dlfVar != null) {
                d(dlfVar, false);
            }
            dmkVar.b = dlfVar;
        }
    }
}
