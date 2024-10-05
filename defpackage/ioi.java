package defpackage;

import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ioi implements akxi {
    final /* synthetic */ ioj a;

    public ioi(ioj iojVar) {
        this.a = iojVar;
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void b(String str, long j, long j2) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void c(String str, akzw akzwVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void d(String str, aufk aufkVar) {
    }

    @Override // defpackage.akxi
    public final void e(final String str, final double d) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ioe
            @Override // java.lang.Runnable
            public final void run() {
                ioi ioiVar = ioi.this;
                String str2 = str;
                double d2 = d;
                god godVar = (god) ioiVar.a.e.get(str2);
                if (godVar != null) {
                    godVar.e = d2;
                    ioiVar.a.k(str2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void f(final String str, final long j, final long j2, double d) {
        this.a.a.runOnUiThread(new Runnable() { // from class: iof
            @Override // java.lang.Runnable
            public final void run() {
                ioi ioiVar = ioi.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                god godVar = (god) ioiVar.a.e.get(str2);
                if (godVar != null) {
                    double d2 = j4;
                    if (d2 != -1.0d) {
                        double d3 = j3;
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        double d4 = d3 / d2;
                        godVar.f = d4;
                        if (d4 > 0.0d) {
                            godVar.e = 1.0d;
                        }
                    }
                    ioiVar.a.k(str2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void g(final String str, final akzp akzpVar) {
        this.a.a.runOnUiThread(new Runnable() { // from class: iog
            @Override // java.lang.Runnable
            public final void run() {
                ioi ioiVar = ioi.this;
                String str2 = str;
                akzp akzpVar2 = akzpVar;
                god godVar = (god) ioiVar.a.e.get(str2);
                if (godVar != null) {
                    godVar.c(akzpVar2);
                    ioiVar.a.l(godVar);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void h(final akzs akzsVar) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ioc
            @Override // java.lang.Runnable
            public final void run() {
                ioi ioiVar = ioi.this;
                akzs akzsVar2 = akzsVar;
                akzr a = akzr.a(akzsVar2.Z);
                if (a == null) {
                    a = akzr.UNKNOWN;
                }
                if (a == akzr.UNKNOWN || a == akzr.NOT_CREATED) {
                    ioiVar.a.e(akzsVar2);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void i(String str, akzs akzsVar) {
    }

    @Override // defpackage.akxi
    public final void j(final String str) {
        this.a.a.runOnUiThread(new Runnable() { // from class: iod
            @Override // java.lang.Runnable
            public final void run() {
                ioi ioiVar = ioi.this;
                god godVar = (god) ioiVar.a.e.get(str);
                if (godVar != null) {
                    godVar.b();
                    ioiVar.a.l(godVar);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void k(final String str, final boolean z) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ioh
            @Override // java.lang.Runnable
            public final void run() {
                ioi ioiVar = ioi.this;
                boolean z2 = z;
                String str2 = str;
                if (!z2) {
                    ioiVar.a.j();
                }
                ioiVar.a.d(str2);
                if (z2) {
                    whu.K(ioiVar.a.a, R.string.reel_upload_bottomsheet_upload_deleted, 1);
                }
                ioiVar.a.i();
            }
        });
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void l(String str, avuh avuhVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void m(String str, String str2) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void n(String str, akzr akzrVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void o(String str, int i) {
    }
}
