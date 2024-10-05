package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbb implements bzo {
    public static final String a = ajbh.S("SystemAlarmDispatcher");
    final Context b;
    public final cen c;
    public final bzr d;
    public final caj e;
    final cas f;
    final List g;
    Intent h;
    public caz i;
    public final cfa j;
    private final Handler k;

    public cbb(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f = new cas(applicationContext);
        this.c = new cen();
        caj h = caj.h(context);
        this.e = h;
        bzr bzrVar = h.f;
        this.d = bzrVar;
        this.j = h.i;
        bzrVar.b(this);
        this.g = new ArrayList();
        this.h = null;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.bzo
    public final void a(String str, boolean z) {
        d(new cay(this, cas.d(this.b, str, z), 0));
    }

    public final void b() {
        if (this.k.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void c() {
        ajbh.X().T(new Throwable[0]);
        this.d.c(this);
        cen cenVar = this.c;
        if (!cenVar.a.isShutdown()) {
            cenVar.a.shutdownNow();
        }
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Runnable runnable) {
        this.k.post(runnable);
    }

    public final void e() {
        b();
        PowerManager.WakeLock a2 = ced.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.e.i.a(new cax(this));
        } finally {
            a2.release();
        }
    }

    public final void f(Intent intent, int i) {
        ajbh X = ajbh.X();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i));
        X.T(new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ajbh.X();
            ajbh.W(a, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.g) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            boolean z = !this.g.isEmpty();
            this.g.add(intent);
            if (!z) {
                e();
            }
        }
    }
}
