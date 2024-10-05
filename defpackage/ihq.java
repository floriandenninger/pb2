package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihq implements View.OnClickListener {
    public int a;
    public final ili b;
    public final acqz c;
    public View d;
    public ihp e;
    public AccessibilityManager f;
    public Runnable g;
    public acsc h;
    public int i = 0;
    public final vgz j;
    private final ilm k;

    public ihq(ili iliVar, vgz vgzVar, acqz acqzVar, ilm ilmVar) {
        this.b = iliVar;
        this.j = vgzVar;
        this.c = acqzVar;
        this.k = ilmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        View view = this.d;
        if (view != null) {
            etx.M(view, false);
            this.b.c(this.i);
            this.i = 0;
            c(true);
        }
        this.d = null;
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
            this.g = null;
        }
    }

    public final void b() {
        onClick(this.d);
    }

    public final void c(boolean z) {
        ilr ilrVar;
        ily aG = this.k.aG();
        if (aG == null || (ilrVar = aG.d) == null) {
            return;
        }
        ilrVar.a(z);
    }

    public final void d() {
        if (this.h == null || this.a != 3) {
            return;
        }
        this.c.mM().I(3, new acqx(this.h), null);
        this.h = null;
    }

    public final void e() {
        this.j.b(icu.e, angq.a);
    }

    public final boolean f() {
        View view = this.d;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d == null || !f()) {
            return;
        }
        e();
        a();
        this.a |= 2;
        d();
        ihp ihpVar = this.e;
        if (ihpVar != null) {
            ((ijo) ihpVar).aj.c("r_eod");
        }
    }
}
