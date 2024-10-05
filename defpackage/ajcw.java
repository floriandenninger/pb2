package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajcw {
    public final Context a;
    public final ynx b;
    public volatile aes c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final acw e = new acw(this);
    private final ScheduledExecutorService f;
    private volatile anhy g;

    public ajcw(Context context, ScheduledExecutorService scheduledExecutorService, ynx ynxVar) {
        this.a = context;
        this.f = scheduledExecutorService;
        this.b = ynxVar;
    }

    public final synchronized anhy a() {
        if (this.g != null && !this.g.isCancelled()) {
            return this.g;
        }
        this.g = anaf.V(aci.c(new aeu() { // from class: ajcu
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                String str;
                ajcw ajcwVar = ajcw.this;
                ajcwVar.c = aesVar;
                try {
                    str = ayeq.u(ajcwVar.a);
                } catch (NullPointerException unused) {
                    str = null;
                }
                if (str == null) {
                    aesVar.b();
                } else {
                    Context context = ajcwVar.a;
                    acw acwVar = ajcwVar.e;
                    acwVar.a = context.getApplicationContext();
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(str)) {
                        intent.setPackage(str);
                    }
                    context.bindService(intent, acwVar, 33);
                    ajcwVar.d.set(true);
                }
                return null;
            }
        }), 1000L, TimeUnit.MILLISECONDS, this.f);
        return this.g;
    }

    public final void b() {
        apct apctVar = this.b.a().B;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        if (apctVar.c) {
            a();
        }
    }
}
