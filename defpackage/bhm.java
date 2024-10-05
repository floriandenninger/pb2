package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhm {
    public final Handler a;
    public final bhn b;

    public bhm(Handler handler, bhn bhnVar) {
        if (bhnVar != null) {
            pse.c(handler);
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = bhnVar;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bhl
                @Override // java.lang.Runnable
                public final void run() {
                    bhm bhmVar = bhm.this;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    bhn bhnVar = bhmVar.b;
                    int i = pts.a;
                    bhnVar.z(str2, j3, j4);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bhk
                @Override // java.lang.Runnable
                public final void run() {
                    bhm bhmVar = bhm.this;
                    String str2 = str;
                    bhn bhnVar = bhmVar.b;
                    int i = pts.a;
                    bhnVar.A(str2);
                }
            });
        }
    }

    public final void c(auj aujVar) {
        aujVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new bhg(this, aujVar, 1));
        }
    }

    public final void d(int i, long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new bhe(this, i, j, 1));
        }
    }

    public final void e(auj aujVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new bhg(this, aujVar, 0));
        }
    }

    public final void f(final pms pmsVar, final auk aukVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bhh
                @Override // java.lang.Runnable
                public final void run() {
                    bhm bhmVar = bhm.this;
                    pms pmsVar2 = pmsVar;
                    auk aukVar2 = aukVar;
                    bhn bhnVar = bhmVar.b;
                    int i = pts.a;
                    bhnVar.af();
                    bhmVar.b.E(pmsVar2, aukVar2);
                }
            });
        }
    }

    public final void g(final Object obj) {
        if (this.a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.post(new Runnable() { // from class: bhj
                @Override // java.lang.Runnable
                public final void run() {
                    bhm bhmVar = bhm.this;
                    Object obj2 = obj;
                    long j = elapsedRealtime;
                    bhn bhnVar = bhmVar.b;
                    int i = pts.a;
                    bhnVar.v(obj2, j);
                }
            });
        }
    }

    public final void h(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bhi
                @Override // java.lang.Runnable
                public final void run() {
                    bhm bhmVar = bhm.this;
                    Exception exc2 = exc;
                    bhn bhnVar = bhmVar.b;
                    int i = pts.a;
                    bhnVar.y(exc2);
                }
            });
        }
    }

    public final void i(final aso asoVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bhf
                @Override // java.lang.Runnable
                public final void run() {
                    bhm bhmVar = bhm.this;
                    aso asoVar2 = asoVar;
                    bhn bhnVar = bhmVar.b;
                    int i = pts.a;
                    bhnVar.F(asoVar2);
                }
            });
        }
    }
}
