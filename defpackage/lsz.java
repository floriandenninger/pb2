package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lsz {
    public final zn a;
    public final Map b;
    public ajwi c;
    public ajol d;
    public Set e;
    public Set f;
    public Set g;
    private final zi h;

    public lsz() {
        lsv lsvVar = new lsv(this);
        this.h = lsvVar;
        this.a = new zn(lsvVar);
        this.b = new IdentityHashMap();
    }

    public static int a(wv wvVar, ajpd ajpdVar, ajoo ajooVar) {
        return ajpdVar.indexOf(ajooVar.getItem(wvVar.b()));
    }

    public static ajom b(wv wvVar) {
        if (wvVar == null) {
            return null;
        }
        if (wvVar instanceof ajor) {
            return ((ajor) wvVar).t;
        }
        return ahbw.q(wvVar.a);
    }

    public static Object c(ajok ajokVar, String str, Class cls) {
        Object c = ajokVar != null ? ajokVar.c(str) : null;
        if (cls.isInstance(c)) {
            return cls.cast(c);
        }
        return null;
    }

    public static void g(ajok ajokVar, String str, Object obj) {
        if (obj != null) {
            ajokVar.f(str, obj);
        }
    }

    public static void h(Set set, Object obj) {
        if (set == null) {
            return;
        }
        set.remove(obj);
    }

    private static Set l(Set set, Object obj) {
        if (obj == null) {
            return set;
        }
        if (set == null) {
            set = new HashSet();
        }
        set.add(obj);
        return set;
    }

    public final void d(lsw lswVar) {
        this.g = l(this.g, lswVar);
    }

    public final void e(lsx lsxVar) {
        this.f = l(this.f, lsxVar);
    }

    public final void f(lsy lsyVar) {
        this.e = l(this.e, lsyVar);
    }

    public final boolean i(RecyclerView recyclerView) {
        return recyclerView == this.c.K;
    }

    public final boolean j(wv wvVar) {
        return this.b.get(b(wvVar)) != null;
    }

    public final boolean k(wv wvVar, wv wvVar2) {
        ajpd ajpdVar = (ajpd) this.b.get(b(wvVar));
        return ajpdVar != null && ajpdVar == ((ajpd) this.b.get(b(wvVar2)));
    }
}
