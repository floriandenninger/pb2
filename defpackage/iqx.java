package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iqx extends akog {
    private View a;
    private View b;
    private View c;
    private int d;
    private boolean e;

    public iqx(ci ciVar) {
        super(ciVar);
        this.d = 0;
        this.e = false;
    }

    private final void h(ammv ammvVar) {
        if (ammvVar.h()) {
            super.c((aufc) ammvVar.c());
        } else {
            super.b();
        }
        int i = this.d;
        if (i > 0) {
            this.d = i - 1;
            i();
        }
    }

    private final void i() {
        if (this.d == 0) {
            View view = this.a;
            view.getClass();
            view.setVisibility(0);
            View view2 = this.b;
            view2.getClass();
            view2.setVisibility(0);
            View view3 = this.c;
            view3.getClass();
            view3.setVisibility(8);
            return;
        }
        View view4 = this.a;
        view4.getClass();
        view4.setVisibility(8);
        View view5 = this.b;
        view5.getClass();
        view5.setVisibility(8);
        View view6 = this.c;
        view6.getClass();
        view6.setVisibility(0);
    }

    private final void j(awos awosVar, syg sygVar, ammv ammvVar) {
        if (ammvVar.h()) {
            super.g(awosVar, sygVar, (aufc) ammvVar.c());
        } else {
            super.f(awosVar, sygVar);
        }
        this.d++;
        i();
    }

    public final void a() {
        while (this.d > 0) {
            b();
        }
    }

    @Override // defpackage.akog, defpackage.akoi
    public final void b() {
        amkq.N(this.e);
        h(amlr.a);
    }

    @Override // defpackage.akog, defpackage.akoi
    public final void c(aufc aufcVar) {
        amkq.N(this.e);
        h(ammv.j(aufcVar));
    }

    public final void d(View view, View view2, View view3) {
        this.a = view;
        this.b = view2;
        this.c = view3;
        i();
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.d > 0;
    }

    @Override // defpackage.akog, defpackage.akoi
    public final void f(awos awosVar, syg sygVar) {
        amkq.N(this.e);
        j(awosVar, sygVar, amlr.a);
    }

    @Override // defpackage.akog, defpackage.akoi
    public final void g(awos awosVar, syg sygVar, aufc aufcVar) {
        amkq.N(this.e);
        j(awosVar, sygVar, ammv.j(aufcVar));
    }
}
