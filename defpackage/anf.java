package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anf {
    public static final anf a = new anf();
    private static final and b = and.a;

    private anf() {
    }

    public static final void a(ce ceVar, String str) {
        ceVar.getClass();
        anb anbVar = new anb(ceVar, str);
        anf anfVar = a;
        anfVar.j(anbVar);
        and h = anfVar.h(ceVar);
        if (h.b.contains(anc.DETECT_FRAGMENT_REUSE) && anfVar.k(h, ceVar.getClass(), anbVar.getClass())) {
            anfVar.i(h, anbVar);
        }
    }

    public static final void b(ce ceVar, ViewGroup viewGroup) {
        ceVar.getClass();
        ang angVar = new ang(ceVar, viewGroup);
        anf anfVar = a;
        anfVar.j(angVar);
        and h = anfVar.h(ceVar);
        if (h.b.contains(anc.DETECT_FRAGMENT_TAG_USAGE) && anfVar.k(h, ceVar.getClass(), angVar.getClass())) {
            anfVar.i(h, angVar);
        }
    }

    public static final void c(ce ceVar) {
        anh anhVar = new anh(ceVar);
        anf anfVar = a;
        anfVar.j(anhVar);
        and h = anfVar.h(ceVar);
        if (h.b.contains(anc.DETECT_TARGET_FRAGMENT_USAGE) && anfVar.k(h, ceVar.getClass(), anhVar.getClass())) {
            anfVar.i(h, anhVar);
        }
    }

    public static final void d(ce ceVar) {
        anj anjVar = new anj(ceVar);
        anf anfVar = a;
        anfVar.j(anjVar);
        and h = anfVar.h(ceVar);
        if (h.b.contains(anc.DETECT_RETAIN_INSTANCE_USAGE) && anfVar.k(h, ceVar.getClass(), anjVar.getClass())) {
            anfVar.i(h, anjVar);
        }
    }

    public static final void e(ce ceVar, boolean z) {
        anl anlVar = new anl(ceVar, z);
        anf anfVar = a;
        anfVar.j(anlVar);
        and h = anfVar.h(ceVar);
        if (h.b.contains(anc.DETECT_SET_USER_VISIBLE_HINT) && anfVar.k(h, ceVar.getClass(), anlVar.getClass())) {
            anfVar.i(h, anlVar);
        }
    }

    public static final void f(ce ceVar, ViewGroup viewGroup) {
        ceVar.getClass();
        ano anoVar = new ano(ceVar, viewGroup);
        anf anfVar = a;
        anfVar.j(anoVar);
        and h = anfVar.h(ceVar);
        if (h.b.contains(anc.DETECT_WRONG_FRAGMENT_CONTAINER) && anfVar.k(h, ceVar.getClass(), anoVar.getClass())) {
            anfVar.i(h, anoVar);
        }
    }

    public static final void g(ce ceVar, ce ceVar2) {
        ank ankVar = new ank(ceVar, ceVar2);
        anf anfVar = a;
        anfVar.j(ankVar);
        and h = anfVar.h(ceVar);
        if (h.b.contains(anc.DETECT_TARGET_FRAGMENT_USAGE) && anfVar.k(h, ceVar.getClass(), ankVar.getClass())) {
            anfVar.i(h, ankVar);
        }
    }

    private final and h(ce ceVar) {
        while (ceVar != null) {
            if (ceVar.ar()) {
                ceVar.mO();
            }
            ceVar = ceVar.C;
        }
        return b;
    }

    private final void i(and andVar, ann annVar) {
        ce ceVar = annVar.a;
        String name = ceVar.getClass().getName();
        if (andVar.b.contains(anc.PENALTY_LOG)) {
            azul.a("Policy violation in ", name);
        }
        if (andVar.b.contains(anc.PENALTY_DEATH)) {
            ane aneVar = new ane(name, annVar);
            if (ceVar.ar()) {
                Handler handler = ceVar.mO().m.d;
                if (azul.c(handler.getLooper(), Looper.myLooper())) {
                    aneVar.run();
                    return;
                } else {
                    handler.post(aneVar);
                    return;
                }
            }
            aneVar.run();
        }
    }

    private final void j(ann annVar) {
        if (dd.W(3)) {
            azul.a("StrictMode violation in ", annVar.a.getClass().getName());
        }
    }

    private final boolean k(and andVar, Class cls, Class cls2) {
        Set set = (Set) andVar.c.get(cls);
        if (set == null) {
            return true;
        }
        return (azul.c(cls2.getSuperclass(), ann.class) || !set.contains(cls2.getSuperclass())) && !set.contains(cls2);
    }
}
