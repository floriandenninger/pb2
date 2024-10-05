package defpackage;

import android.util.LruCache;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpl implements cnd {
    private final LruCache a;

    public afpl(int i) {
        this.a = new afpk(i);
    }

    @Override // defpackage.cnd
    public final synchronized cnc a(String str) {
        cnc cncVar = (cnc) this.a.get(str);
        if (cncVar == null) {
            return null;
        }
        if (!cncVar.a() && !cncVar.b()) {
            if (!cncVar.g.containsKey("X-YouTube-cache-hit")) {
                cncVar.g = new HashMap(cncVar.g);
                cncVar.g.put("X-YouTube-cache-hit", "true");
            }
            return cncVar;
        }
        if (cncVar.g.containsKey("X-YouTube-cache-hit")) {
            cncVar.g.remove("X-YouTube-cache-hit");
        }
        return cncVar;
    }

    @Override // defpackage.cnd
    public final synchronized void b() {
        this.a.evictAll();
    }

    @Override // defpackage.cnd
    public final synchronized void c() {
    }

    @Override // defpackage.cnd
    public final synchronized void d(String str, cnc cncVar) {
        this.a.put(str, cncVar);
    }

    @Override // defpackage.cnd
    public final synchronized void e(String str) {
        this.a.remove(str);
    }

    @Override // defpackage.cnd
    public final synchronized void f(String str) {
        this.a.remove(str);
    }
}
