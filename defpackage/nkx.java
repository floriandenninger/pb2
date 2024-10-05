package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nkx {
    public final ci a;
    public final akbu b;
    public final Set c;
    public final fka d;
    private final SharedPreferences e;

    public nkx(ci ciVar, akbu akbuVar, SharedPreferences sharedPreferences, fka fkaVar) {
        this.a = ciVar;
        akbuVar.getClass();
        this.b = akbuVar;
        this.e = sharedPreferences;
        this.c = Collections.newSetFromMap(new WeakHashMap());
        this.d = fkaVar;
    }

    private final boolean c(nkw nkwVar, acra acraVar) {
        arej k;
        if (!nkwVar.o()) {
            return false;
        }
        boolean n = nkwVar.n();
        View h = nkwVar.h();
        if (h != null && h.isShown() && nkwVar.m() && !n && (k = nkwVar.k()) != null) {
            this.b.b(k, h, k, acraVar);
        }
        View g = nkwVar.g();
        String string = this.e.getString("add_to_long_press_hint_trigger_video_id", null);
        arej i = nkwVar.i();
        if (g == null || g.getVisibility() != 0 || nkwVar.i() == null || string == null || string.equals(nkwVar.l()) || i == null) {
            return true;
        }
        aref arefVar = i.i;
        if (arefVar == null) {
            arefVar = aref.a;
        }
        int dU = amkq.dU(arefVar.b);
        if (dU == 0 || dU != 4) {
            return true;
        }
        this.b.b(nkwVar.i(), g, i, acraVar);
        return true;
    }

    public final void a(acra acraVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext() && !c((nkw) it.next(), acraVar)) {
        }
    }

    public final void b(nkw nkwVar, acra acraVar) {
        this.c.add(nkwVar);
        c(nkwVar, acraVar);
    }
}
