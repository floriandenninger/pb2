package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agsq implements ypd {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private final Context b;
    private final ScheduledExecutorService c;
    private final agsm d;
    private ScheduledFuture e;
    private long f = Long.MAX_VALUE;

    public agsq(Context context, ypa ypaVar, ScheduledExecutorService scheduledExecutorService, agsm agsmVar) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = agsmVar;
        ypaVar.g(this);
    }

    private final synchronized void d(Class cls) {
        this.e = this.c.schedule(new agsp(this, cls), a, TimeUnit.MILLISECONDS);
    }

    final synchronized void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
        this.f = Long.MAX_VALUE;
    }

    public final synchronized void b(Class cls) {
        if (this.d.b() >= this.f) {
            Context context = this.b;
            agzy.a(context, new Intent(context, (Class<?>) cls).setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup"));
            this.f = Long.MAX_VALUE;
            return;
        }
        d(cls);
    }

    public final synchronized void c(String str, long j) {
        try {
            Class<?> cls = Class.forName(str);
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                d(cls);
            }
            if (this.f > j) {
                this.f = j;
            }
        } catch (ClassNotFoundException e) {
            zga.d("Failed to resolve transfer service.", e);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yxl.class, afto.class};
        }
        if (i == 0) {
            a();
            return null;
        }
        if (i == 1) {
            a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
