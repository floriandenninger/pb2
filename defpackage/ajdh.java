package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdh {
    public final ampf a = ampf.u();

    public final void a(ajdg ajdgVar) {
        b(ajdgVar, "");
    }

    public final void b(ajdg ajdgVar, String str) {
        yjk.f();
        this.a.p(str, ajdgVar);
    }

    public final void c() {
        yjk.f();
        Iterator it = this.a.q().iterator();
        while (it.hasNext()) {
            ((ajdg) it.next()).lP();
        }
    }

    public final void d(ajdg ajdgVar) {
        e(ajdgVar, "");
    }

    public final void e(ajdg ajdgVar, String str) {
        yjk.f();
        Collection collection = (Collection) this.a.r().get(str);
        if (collection != null) {
            collection.remove(ajdgVar);
        }
    }
}
