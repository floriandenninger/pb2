package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ujn {
    public final amnv a;
    public boolean b = true;
    private final ScheduledExecutorService c;

    public ujn(final Context context, final ScheduledExecutorService scheduledExecutorService) {
        this.a = amkq.x(new amnv() { // from class: ujg
            @Override // defpackage.amnv
            public final Object get() {
                ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                Context context2 = context;
                return new ujp(scheduledExecutorService2, new viu(context2, "STREAMZ_ONEGOOGLE_ANDROID"), context2 instanceof Application ? (Application) context2 : null);
            }
        });
        this.c = scheduledExecutorService;
    }

    public final void a(final String str, final String str2) {
        f(new Runnable() { // from class: ujk
            @Override // java.lang.Runnable
            public final void run() {
                ((viz) ((ujp) ujn.this.a.get()).f.get()).b(str, str2);
            }
        });
    }

    public final void b(final String str, final String str2, final String str3, final String str4, final boolean z) {
        f(new Runnable() { // from class: ujm
            @Override // java.lang.Runnable
            public final void run() {
                ((viz) ((ujp) ujn.this.a.get()).c.get()).b(str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void c(final String str, final String str2, final int i, final String str3, final boolean z) {
        f(new Runnable() { // from class: ujl
            @Override // java.lang.Runnable
            public final void run() {
                ujn ujnVar = ujn.this;
                String str4 = str;
                String str5 = str2;
                int i2 = i;
                ((viz) ((ujp) ujnVar.a.get()).b.get()).b(str4, str5, Integer.valueOf(i2), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void d(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        f(new Runnable() { // from class: ujj
            @Override // java.lang.Runnable
            public final void run() {
                ujn ujnVar = ujn.this;
                ((viw) ((ujp) ujnVar.a.get()).e.get()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void e(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        f(new Runnable() { // from class: uji
            @Override // java.lang.Runnable
            public final void run() {
                ujn ujnVar = ujn.this;
                double d2 = d;
                String str4 = str;
                String str5 = str2;
                int i2 = i;
                ((viw) ((ujp) ujnVar.a.get()).d.get()).b(d2, str4, str5, Integer.valueOf(i2), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void f(final Runnable runnable) {
        if (this.b) {
            this.c.schedule(new Runnable() { // from class: ujh
                @Override // java.lang.Runnable
                public final void run() {
                    ujn ujnVar = ujn.this;
                    runnable.run();
                    ujnVar.b = false;
                }
            }, 5L, TimeUnit.SECONDS);
        } else {
            runnable.run();
        }
    }
}
