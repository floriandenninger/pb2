package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akxh implements akxi {
    public final Set a = new CopyOnWriteArraySet();
    private final Executor b;

    public akxh(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.akxi
    public final void a(final String str, final boolean z, final boolean z2) {
        this.b.execute(new Runnable() { // from class: akwx
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                boolean z3 = z;
                boolean z4 = z2;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).a(str2, z3, z4);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void b(final String str, final long j, final long j2) {
        this.b.execute(new Runnable() { // from class: akxa
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).b(str2, j3, j4);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void c(final String str, final akzw akzwVar) {
        this.b.execute(new Runnable() { // from class: akxg
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                akzw akzwVar2 = akzwVar;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).c(str2, akzwVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void d(final String str, final aufk aufkVar) {
        this.b.execute(new Runnable() { // from class: akwt
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                aufk aufkVar2 = aufkVar;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).d(str2, aufkVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void e(final String str, final double d) {
        this.b.execute(new Runnable() { // from class: akwz
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                double d2 = d;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).e(str2, d2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void f(final String str, final long j, final long j2, final double d) {
        this.b.execute(new Runnable() { // from class: akxb
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                double d2 = d;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).f(str2, j3, j4, d2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void g(final String str, final akzp akzpVar) {
        this.b.execute(new Runnable() { // from class: akxd
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                akzp akzpVar2 = akzpVar;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).g(str2, akzpVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void h(final akzs akzsVar) {
        this.b.execute(new Runnable() { // from class: akws
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                akzs akzsVar2 = akzsVar;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).h(akzsVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void i(final String str, final akzs akzsVar) {
        this.b.execute(new Runnable() { // from class: akxf
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                akzs akzsVar2 = akzsVar;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).i(str2, akzsVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void j(final String str) {
        this.b.execute(new Runnable() { // from class: akwy
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).j(str2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void k(final String str, final boolean z) {
        this.b.execute(new Runnable() { // from class: akww
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                boolean z2 = z;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).k(str2, z2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void l(final String str, final avuh avuhVar) {
        this.b.execute(new Runnable() { // from class: akwu
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                avuh avuhVar2 = avuhVar;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).l(str2, avuhVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void m(final String str, final String str2) {
        this.b.execute(new Runnable() { // from class: akwv
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str3 = str;
                String str4 = str2;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).m(str3, str4);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void n(final String str, final akzr akzrVar) {
        this.b.execute(new Runnable() { // from class: akxe
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                akzr akzrVar2 = akzrVar;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).n(str2, akzrVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void o(final String str, final int i) {
        this.b.execute(new Runnable() { // from class: akxc
            @Override // java.lang.Runnable
            public final void run() {
                akxh akxhVar = akxh.this;
                String str2 = str;
                int i2 = i;
                Iterator it = akxhVar.a.iterator();
                while (it.hasNext()) {
                    ((akxi) it.next()).o(str2, i2);
                }
            }
        });
    }

    public final void p(akxi akxiVar) {
        this.a.add(akxiVar);
    }

    public final void q(akxi akxiVar) {
        this.a.remove(akxiVar);
    }
}
