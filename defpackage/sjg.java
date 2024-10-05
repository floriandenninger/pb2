package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sjg implements Runnable {
    public final Runnable a;
    final /* synthetic */ sjh b;

    public sjg(sjh sjhVar, Runnable runnable) {
        this.b = sjhVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Thread currentThread = Thread.currentThread();
        anic anicVar = this.b.e;
        Runnable runnable = new Runnable() { // from class: sjf
            @Override // java.lang.Runnable
            public final void run() {
                sjg sjgVar = sjg.this;
                Thread thread = currentThread;
                String obj = sjgVar.b.d ? sjgVar.a.toString() : sjgVar.a.getClass().toString();
                String a = sis.a(thread);
                sjgVar.b.c.f();
                String valueOf = String.valueOf(sjgVar.b.c.g());
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 71 + String.valueOf(valueOf).length() + String.valueOf(obj).length());
                sb.append("On ");
                sb.append(a);
                sb.append(" task took longer than 1 ");
                sb.append(valueOf);
                sb.append(" so assumed deadlocked: ");
                sb.append(obj);
                sjl sjlVar = new sjl(sb.toString(), thread.getStackTrace());
                RuntimeException b = amjq.b(thread);
                if (b.getStackTrace().length > 0) {
                    sjlVar.initCause(b);
                }
                ArrayList a2 = sjgVar.b.a.a();
                a2.remove(thread);
                sjp.b(sjgVar.b.b, a2, sjlVar);
            }
        };
        this.b.c.f();
        ania schedule = anicVar.schedule(runnable, 1L, this.b.c.g());
        try {
            this.a.run();
        } finally {
            schedule.cancel(false);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
