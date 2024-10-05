package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aerf implements aeru {
    private final aeru d;
    private aeru e;
    private boolean f;
    private boolean g;
    private final Queue b = new ArrayDeque();
    public final long a = SystemClock.elapsedRealtime();

    public aerf(aeru aeruVar) {
        this.d = aeruVar;
    }

    public final void A(aeru aeruVar) {
        afki.d(this.e == null);
        this.e = aeruVar;
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.aeru
    public final afjf a() {
        aeru aeruVar = this.e;
        return aeruVar != null ? aeruVar.a() : ((aemt) this.d).a;
    }

    @Override // defpackage.aeru
    public final void b(int i) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aequ(this, i, 2));
        } else {
            aeruVar.b(i);
        }
    }

    @Override // defpackage.aeru
    public final void c(int i) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aequ(this, i, 1));
        } else {
            aeruVar.c(i);
        }
    }

    @Override // defpackage.aesn
    public final void d() {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqy(this, 0));
        } else if (!this.g || this.f) {
            this.g = true;
            aeruVar.d();
        }
    }

    @Override // defpackage.aesn
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aesh[] aeshVarArr) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqv(this, j2, 1));
            throw new aesf(1000);
        }
        aeruVar.e(formatStreamModel, j, j2, aeshVarArr);
    }

    @Override // defpackage.aesn
    public final void f() {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqy(this, 2));
        } else {
            aeruVar.f();
        }
    }

    @Override // defpackage.aesn
    public final void g(final afih afihVar) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new Runnable() { // from class: aeqz
                @Override // java.lang.Runnable
                public final void run() {
                    aerf.this.g(afihVar);
                }
            });
        } else {
            aeruVar.g(afihVar);
        }
    }

    @Override // defpackage.aesn
    public final void h(final aeqq aeqqVar) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new Runnable() { // from class: aeqx
                @Override // java.lang.Runnable
                public final void run() {
                    aerf.this.h(aeqqVar);
                }
            });
        } else {
            aeruVar.h(aeqqVar);
        }
    }

    @Override // defpackage.aesn
    public final void i(final String str, final afgj afgjVar) {
        if (this.e != null || (!str.equals("cir") && !str.equals("ecir"))) {
            aeru aeruVar = this.e;
            if (aeruVar == null) {
                this.b.add(new Runnable() { // from class: aerc
                    @Override // java.lang.Runnable
                    public final void run() {
                        aerf.this.i(str, afgjVar);
                    }
                });
                return;
            } else {
                aeruVar.i(str, afgjVar);
                return;
            }
        }
        this.d.i(str, afgjVar);
    }

    @Override // defpackage.aesn
    public final void j(afqu afquVar) {
        throw new IllegalStateException("Early Media Prep tried to emit onLoaded() event");
    }

    @Override // defpackage.aesn
    public final void k(final long j, final long j2) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new Runnable() { // from class: aeqw
                @Override // java.lang.Runnable
                public final void run() {
                    aerf.this.k(j, j2);
                }
            });
        } else {
            aeruVar.k(j, j2);
        }
    }

    @Override // defpackage.aesn
    public final void l(final String str) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new Runnable() { // from class: aerb
                @Override // java.lang.Runnable
                public final void run() {
                    aerf.this.l(str);
                }
            });
        } else {
            aeruVar.l(str);
        }
    }

    @Override // defpackage.aesn
    public final void m() {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqy(this, 3));
        } else if (this.f) {
            aeruVar.m();
        }
    }

    @Override // defpackage.aesn
    public final void n() {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqy(this, 4));
        } else if (!this.f) {
            d();
        } else {
            aeruVar.n();
        }
    }

    @Override // defpackage.aesn
    public final void o(long j) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqv(this, j, 0));
        } else {
            aeruVar.o(j);
        }
    }

    @Override // defpackage.aesn
    public final void p(final float f) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new Runnable() { // from class: aere
                @Override // java.lang.Runnable
                public final void run() {
                    aerf.this.p(f);
                }
            });
        } else {
            aeruVar.p(f);
        }
    }

    @Override // defpackage.aesn
    public final void q() {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqy(this, 1));
            this.b.add(new aeqy(this, 5));
        } else {
            this.f = true;
            aeruVar.q();
        }
    }

    @Override // defpackage.aesn
    public final void r() {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqy(this, 6));
        } else {
            aeruVar.r();
        }
    }

    @Override // defpackage.aesn
    public final void s(long j) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqv(this, j, 2));
        } else {
            aeruVar.s(j);
        }
    }

    @Override // defpackage.aesn
    public final void t(long j) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqv(this, j, 3));
        } else {
            aeruVar.t(j);
        }
    }

    @Override // defpackage.aesn
    public final void u(long j) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqv(this, j, 4));
        } else {
            aeruVar.u(j);
        }
    }

    @Override // defpackage.aesn
    public final void v() {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqy(this, 7));
        } else {
            aeruVar.v();
        }
    }

    @Override // defpackage.aesn
    public final void w(final String str, final String str2) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new Runnable() { // from class: aerd
                @Override // java.lang.Runnable
                public final void run() {
                    aerf.this.w(str, str2);
                }
            });
        } else {
            aeruVar.w(str, str2);
        }
    }

    @Override // defpackage.aesn
    public final void x(int i) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aequ(this, i, 0));
        } else {
            aeruVar.x(i);
        }
    }

    @Override // defpackage.aesn
    public final void y(long j) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new aeqv(this, j, 5));
        } else {
            aeruVar.y(j);
        }
    }

    @Override // defpackage.aesn
    public final void z(final avzr avzrVar) {
        aeru aeruVar = this.e;
        if (aeruVar == null) {
            this.b.add(new Runnable() { // from class: aera
                @Override // java.lang.Runnable
                public final void run() {
                    aerf.this.z(avzrVar);
                }
            });
        } else {
            aeruVar.z(avzrVar);
        }
    }
}
