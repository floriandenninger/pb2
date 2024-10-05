package defpackage;

import android.app.Notification;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class agol implements agon {
    private final shf a;
    private final azrw b;
    private final agom c;
    private final agzr d;
    private long e = 0;

    public agol(shf shfVar, azrw azrwVar, agom agomVar, agzr agzrVar) {
        shfVar.getClass();
        this.a = shfVar;
        azrwVar.getClass();
        this.b = azrwVar;
        agomVar.getClass();
        this.c = agomVar;
        this.d = agzrVar;
    }

    @Override // defpackage.agon
    public final void A(agnz agnzVar) {
        int f = agtw.f(agnzVar.f);
        if (f == 1 || f == 4 || f == 6 || f == 7) {
            String r = agtw.r(agnzVar.f);
            agtw.u(agnzVar.f);
            if (!TextUtils.isEmpty(r)) {
                boolean aa = agtw.aa(agnzVar.f);
                agnh d = ((agof) this.b.get()).a().i().d(r);
                if (d == null || !d.e()) {
                    return;
                }
                if (aa) {
                    j(d);
                    return;
                } else {
                    h(d);
                    return;
                }
            }
            agnv e = ((agof) this.b.get()).a().m().e(agtw.t(agnzVar.f));
            if (e == null || !e.b()) {
                return;
            }
            l(e);
        }
    }

    @Override // defpackage.agon
    public final void B(agnz agnzVar) {
        int f = agtw.f(agnzVar.f);
        if (f == 1 || f == 4 || f == 6 || f == 7) {
            String r = agtw.r(agnzVar.f);
            agtw.u(agnzVar.f);
            if (!TextUtils.isEmpty(r)) {
                agnh d = ((agof) this.b.get()).a().i().d(r);
                if (d == null || !d.e()) {
                    return;
                }
                h(d);
                return;
            }
            agnv e = ((agof) this.b.get()).a().m().e(agtw.t(agnzVar.f));
            if (e == null || !e.u()) {
                return;
            }
            m(e);
        }
    }

    @Override // defpackage.agon
    public final void C(agnz agnzVar, boolean z) {
        long c = this.a.c();
        if ((this.c.a || this.d.b()) && c - this.e < 250) {
            return;
        }
        this.e = c;
        int f = agtw.f(agnzVar.f);
        if (f != 1) {
            if (f == 2) {
                agnv e = ((agof) this.b.get()).a().m().e(agtw.t(agnzVar.f));
                if (e == null) {
                    return;
                }
                p(e);
                return;
            }
            if (f != 4 && f != 6 && f != 7) {
                return;
            }
        }
        String r = agtw.r(agnzVar.f);
        agtw.u(agnzVar.f);
        if (!TextUtils.isEmpty(r)) {
            boolean aa = agtw.aa(agnzVar.f);
            agnh d = ((agof) this.b.get()).a().i().d(r);
            if (d == null) {
                return;
            }
            if (aa) {
                k(d);
                return;
            } else {
                i(d);
                return;
            }
        }
        agnv e2 = ((agof) this.b.get()).a().m().e(agtw.t(agnzVar.f));
        if (e2 == null) {
            return;
        }
        boolean ab = agtw.ab(agnzVar.f);
        if (z) {
            n(e2);
        } else {
            o(e2, ab);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void D(Notification notification) {
        this.c.e("15", 15, notification, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void c(String str) {
        this.c.a(str, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void d(String str) {
        this.c.a(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void e(String str) {
        this.c.a(str, 7);
    }

    protected abstract void h(agnh agnhVar);

    protected abstract void i(agnh agnhVar);

    protected abstract void j(agnh agnhVar);

    protected abstract void k(agnh agnhVar);

    protected abstract void l(agnv agnvVar);

    protected abstract void m(agnv agnvVar);

    protected abstract void n(agnv agnvVar);

    protected abstract void o(agnv agnvVar, boolean z);

    protected abstract void p(agnv agnvVar);

    @Override // defpackage.agon
    public final synchronized void r() {
        this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void s(String str, Notification notification) {
        this.c.c(str, 8, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void t(String str, Notification notification) {
        this.c.d(str, 8, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void u(String str, Notification notification) {
        this.c.c(str, 10, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void v(String str, Notification notification) {
        this.c.d(str, 10, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void w(String str, Notification notification) {
        this.c.d(str, 14, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void x(String str, Notification notification) {
        this.c.c(str, 7, notification);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void y(String str, Notification notification) {
        this.c.d(str, 7, notification);
    }

    @Override // defpackage.agon
    public final void z(agnz agnzVar) {
        int f = agtw.f(agnzVar.f);
        if (f != 1 && f != 4) {
            if (f == 5) {
                agtw.t(agnzVar.f);
                return;
            } else if (f != 6 && f != 7) {
                return;
            }
        }
        String r = agtw.r(agnzVar.f);
        agtw.u(agnzVar.f);
        if (!TextUtils.isEmpty(r)) {
            if (!agtw.aa(agnzVar.f)) {
                c(r);
                return;
            } else {
                d(r);
                return;
            }
        }
        e(agtw.t(agnzVar.f));
    }
}
