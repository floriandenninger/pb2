package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lwd implements akxi {
    final /* synthetic */ lwj a;

    public lwd(lwj lwjVar) {
        this.a = lwjVar;
    }

    @Override // defpackage.akxi
    public final void a(final String str, final boolean z, final boolean z2) {
        this.a.b.execute(new Runnable() { // from class: lvt
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                boolean z3 = z;
                boolean z4 = z2;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    b.a(z3, z4);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void b(final String str, final long j, final long j2) {
        this.a.b.execute(new Runnable() { // from class: lvw
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                long j3 = j2;
                long j4 = j;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    if (j3 > 0) {
                        double d = j4;
                        double d2 = j3;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        double d3 = d / d2;
                        if (d3 < 0.0d || d3 > 1.0d) {
                            b.i = -1.0d;
                        } else {
                            b.i = d3;
                        }
                    }
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void c(final String str, final akzw akzwVar) {
        this.a.b.execute(new Runnable() { // from class: lwb
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                akzw akzwVar2 = akzwVar;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    String str3 = akzwVar2.c;
                    str3.getClass();
                    b.c = str3;
                    akzv a = akzv.a(akzwVar2.e);
                    if (a == null) {
                        a = akzv.PRIVATE;
                    }
                    b.y = lwj.l(a);
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void d(String str, aufk aufkVar) {
    }

    @Override // defpackage.akxi
    public final void e(final String str, final double d) {
        this.a.b.execute(new Runnable() { // from class: lvv
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                double d2 = d;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    if (d2 < 0.0d || d2 > 1.0d) {
                        b.h = -1.0d;
                    } else {
                        b.h = d2;
                    }
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void f(final String str, final long j, final long j2, final double d) {
        this.a.b.execute(new Runnable() { // from class: lvx
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                double d2 = d;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    if (j4 != -1) {
                        double d3 = j3;
                        double d4 = j4;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        b.j = d3 / d4;
                    }
                    b.k = d2;
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void g(final String str, final akzp akzpVar) {
        this.a.b.execute(new Runnable() { // from class: lvz
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                akzp akzpVar2 = akzpVar;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    b.c(akzpVar2);
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void h(final akzs akzsVar) {
        this.a.b.execute(new Runnable() { // from class: lvq
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                akzs akzsVar2 = akzsVar;
                if (akzsVar2.u || !akzsVar2.t) {
                    lwdVar.a.d(akzsVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void i(final String str, final akzs akzsVar) {
        this.a.b.execute(new Runnable() { // from class: lwa
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                akzs akzsVar2 = akzsVar;
                if (lwdVar.a.b(str2, null) == null) {
                    lwdVar.a.d(akzsVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void j(final String str) {
        this.a.b.execute(new Runnable() { // from class: lvu
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                goc b = lwdVar.a.b(str, null);
                if (b != null) {
                    b.b();
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void k(final String str, final boolean z) {
        this.a.b.execute(new Runnable() { // from class: lvs
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                boolean z2 = z;
                lwdVar.a.c.d(new goa());
                goc b = lwdVar.a.b(str2, null);
                if (b == null || !z2) {
                    return;
                }
                lwj lwjVar = lwdVar.a;
                lwj.k(lwjVar.i, b);
                lwj.k(lwjVar.j, b);
                lwj.k(lwjVar.k, b);
                lwjVar.h.remove(b);
                whu.K(lwdVar.a.a, R.string.delete_inprogress_upload_done, 1);
            }
        });
    }

    @Override // defpackage.akxi
    public final void l(final String str, final avuh avuhVar) {
        this.a.b.execute(new Runnable() { // from class: lwc
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                avuh avuhVar2 = avuhVar;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    b.d(avuhVar2);
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void m(final String str, final String str2) {
        this.a.b.execute(new Runnable() { // from class: lvr
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str3 = str;
                String str4 = str2;
                goc b = lwdVar.a.b(str3, null);
                if (b != null) {
                    zhq.m(str4);
                    if (TextUtils.isEmpty(b.g)) {
                        b.g = str4;
                    } else if (!str4.equals(b.g)) {
                        String str5 = b.g;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 43 + String.valueOf(str4).length());
                        sb.append("Video id is not allowed to change from ");
                        sb.append(str5);
                        sb.append(" to ");
                        sb.append(str4);
                        throw new AssertionError(sb.toString());
                    }
                    lwdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void n(String str, akzr akzrVar) {
    }

    @Override // defpackage.akxi
    public final void o(final String str, final int i) {
        this.a.b.execute(new Runnable() { // from class: lvy
            @Override // java.lang.Runnable
            public final void run() {
                lwd lwdVar = lwd.this;
                String str2 = str;
                int i2 = i;
                goc b = lwdVar.a.b(str2, null);
                if (b != null) {
                    b.g(i2);
                    lwdVar.a.i(b);
                }
            }
        });
    }
}
