package defpackage;

import java.security.InvalidParameterException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyp implements Runnable {
    final Runnable a;
    public final String b;
    public final int c;
    public yyx d;
    public Queue e;
    shf f;
    boolean g;
    boolean h;
    yyo i;

    public yyp(int i, shf shfVar) {
        shfVar.getClass();
        this.b = null;
        this.c = i;
        this.a = null;
        this.i = null;
        this.f = shfVar;
        this.e = new ConcurrentLinkedQueue();
        this.d = new yyx(i, shfVar, 5);
    }

    public yyp(String str, Runnable runnable) {
        this.b = str;
        this.c = -1;
        this.a = runnable;
    }

    private static String c(Object obj) {
        return obj == null ? "null" : "ok";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(yyx yyxVar) {
        Queue queue = this.e;
        if (queue != null) {
            queue.add(yyxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(yyo yyoVar, boolean z) {
        yyoVar.getClass();
        this.i = yyoVar;
        this.g = z;
        shf shfVar = yyoVar.k;
        if (shfVar != null) {
            this.f = shfVar;
            this.e = new ConcurrentLinkedQueue();
            this.d = new yyx(this.b, this.f, 1);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a == null || this.i == null) {
            if (this.d != null) {
                String str = this.b;
                if (str == null) {
                    str = String.valueOf(this.c);
                }
                this.d.g = new InvalidParameterException(String.format("Task %s, cmd=%s, pool=%s", str, c(this.a), c(this.i)));
                return;
            }
            return;
        }
        if (this.d != null) {
            yyr.k(this);
            this.d.b();
        }
        try {
            this.a.run();
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.interrupted();
            }
            yyx yyxVar = this.d;
            if (yyxVar != null) {
                yyxVar.g = e;
            }
        }
        yyx yyxVar2 = this.d;
        if (yyxVar2 != null) {
            yyxVar2.a();
            yyr.j(this);
        }
        yyo yyoVar = this.i;
        synchronized (yyoVar) {
            yyoVar.g -= this.g ? 1 : 0;
            yyoVar.d.add(this);
            yyoVar.f++;
            yyoVar.g();
        }
        if (this.g) {
            yyoVar.h();
        }
    }
}
