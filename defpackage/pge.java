package defpackage;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pge {
    public pgb a;
    public boolean b;
    private final ExecutorService c;

    public pge(String str) {
        this.c = pgz.m(str);
    }

    public final void a() {
        opn.k(this.b);
        pgb pgbVar = this.a;
        pgbVar.a.i();
        if (pgbVar.b != null) {
            pgbVar.b.interrupt();
        }
    }

    public final void b() {
        c(null);
    }

    public final void c(Runnable runnable) {
        if (this.b) {
            a();
        }
        if (runnable != null) {
            this.c.submit(runnable);
        }
        this.c.shutdown();
    }

    public final void d(pgc pgcVar, pga pgaVar) {
        Looper myLooper = Looper.myLooper();
        opn.k(myLooper != null);
        e(myLooper, pgcVar, pgaVar);
    }

    public final void e(Looper looper, pgc pgcVar, pga pgaVar) {
        opn.k(!this.b);
        this.b = true;
        pgb pgbVar = new pgb(this, looper, pgcVar, pgaVar);
        this.a = pgbVar;
        this.c.submit(pgbVar);
    }
}
