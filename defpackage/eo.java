package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eo {
    public final ViewGroup a;
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    boolean d = false;

    public eo(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eo b(ViewGroup viewGroup, dd ddVar) {
        ddVar.aj();
        return g(viewGroup);
    }

    public static void f(en enVar) {
        ej.r(enVar.e, enVar.a.O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eo g(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (!(tag instanceof eo)) {
            eo eoVar = new eo(viewGroup);
            viewGroup.setTag(R.id.special_effects_controller_view_tag, eoVar);
            return eoVar;
        }
        return (eo) tag;
    }

    public final en a(ce ceVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            en enVar = (en) arrayList.get(i);
            if (enVar.a.equals(ceVar) && !enVar.c) {
                return enVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        String str;
        String str2;
        boolean aj = jw.aj(this.a);
        synchronized (this.b) {
            d();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((en) it.next()).b();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                en enVar = (en) it2.next();
                if (dd.W(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (aj) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(enVar);
                }
                enVar.d();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                en enVar2 = (en) it3.next();
                if (dd.W(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (aj) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(enVar2);
                }
                enVar2.d();
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            en enVar = (en) arrayList.get(i);
            if (enVar.f == 2) {
                enVar.f(ej.p(enVar.a.K().getVisibility()), 1);
            }
        }
    }

    public final void e(int i, int i2, dj djVar) {
        synchronized (this.b) {
            aio aioVar = new aio();
            en a = a(djVar.b);
            if (a != null) {
                a.f(i, i2);
                return;
            }
            el elVar = new el(i, i2, djVar, aioVar);
            this.b.add(elVar);
            elVar.c(new ek(this, elVar, 1));
            elVar.c(new ek(this, elVar, 0));
        }
    }
}
