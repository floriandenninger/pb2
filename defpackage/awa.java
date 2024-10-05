package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awa {
    public final awb a;
    private final Handler b;

    public awa(Handler handler, awb awbVar) {
        if (awbVar != null) {
            pse.c(handler);
        } else {
            handler = null;
        }
        this.b = handler;
        this.a = awbVar;
    }

    public final void a(Exception exc) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new avw(this, exc, 1));
        }
    }

    public final void b(Exception exc) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new avw(this, exc, 0));
        }
    }

    public final void c(final String str, final long j, final long j2) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: avy
                @Override // java.lang.Runnable
                public final void run() {
                    awa awaVar = awa.this;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    awb awbVar = awaVar.a;
                    int i = pts.a;
                    awbVar.d(str2, j3, j4);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: avx
                @Override // java.lang.Runnable
                public final void run() {
                    awa awaVar = awa.this;
                    String str2 = str;
                    awb awbVar = awaVar.a;
                    int i = pts.a;
                    awbVar.e(str2);
                }
            });
        }
    }

    public final void e(auj aujVar) {
        aujVar.a();
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new avu(this, aujVar, 1));
        }
    }

    public final void f(auj aujVar) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new avu(this, aujVar, 0));
        }
    }

    public final void g(final pms pmsVar, final auk aukVar) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: avv
                @Override // java.lang.Runnable
                public final void run() {
                    awa awaVar = awa.this;
                    pms pmsVar2 = pmsVar;
                    auk aukVar2 = aukVar;
                    awb awbVar = awaVar.a;
                    int i = pts.a;
                    awbVar.V();
                    awaVar.a.h(pmsVar2, aukVar2);
                }
            });
        }
    }

    public final void h(final long j) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: avt
                @Override // java.lang.Runnable
                public final void run() {
                    awa awaVar = awa.this;
                    long j2 = j;
                    awb awbVar = awaVar.a;
                    int i = pts.a;
                    awbVar.i(j2);
                }
            });
        }
    }

    public final void i(final boolean z) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: avz
                @Override // java.lang.Runnable
                public final void run() {
                    awa awaVar = awa.this;
                    boolean z2 = z;
                    awb awbVar = awaVar.a;
                    int i = pts.a;
                    awbVar.x(z2);
                }
            });
        }
    }

    public final void j(final int i, final long j, final long j2) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: avs
                @Override // java.lang.Runnable
                public final void run() {
                    awa awaVar = awa.this;
                    int i2 = i;
                    long j3 = j;
                    long j4 = j2;
                    awb awbVar = awaVar.a;
                    int i3 = pts.a;
                    awbVar.k(i2, j3, j4);
                }
            });
        }
    }
}
