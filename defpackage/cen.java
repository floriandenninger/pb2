package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cen {
    public final ScheduledExecutorService a;
    public final Map b;
    public final Map c;
    public final Object d;
    private final ThreadFactory e;

    static {
        ajbh.S("WorkTimer");
    }

    public cen() {
        cek cekVar = new cek();
        this.e = cekVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(cekVar);
    }

    public final void a(String str) {
        synchronized (this.d) {
            if (((cem) this.b.remove(str)) != null) {
                ajbh X = ajbh.X();
                String.format("Stopping timer for %s", str);
                X.T(new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}
