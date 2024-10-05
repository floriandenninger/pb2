package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfq {
    final /* synthetic */ jqr b;
    private final acsc c;
    public asht a = null;
    private Boolean d = null;

    public hfq(jqr jqrVar, acsc acscVar, byte[] bArr) {
        this.b = jqrVar;
        this.c = acscVar;
    }

    public final void a() {
        Boolean bool = this.d;
        if (bool == null || !bool.booleanValue()) {
            ((acqq) this.b.a).D(new acqx(this.c));
            return;
        }
        this.b.a.n(new acqx(this.c));
    }

    public final void b() {
        i(3);
    }

    public final void c() {
        i(2049);
    }

    public final void d() {
        this.b.a.q(new acqx(this.c), this.a);
    }

    public final void e() {
        this.b.a.u(new acqx(this.c), this.a);
    }

    public final void f() {
        i(65);
    }

    public final void g() {
        Boolean bool = this.d;
        if (bool == null) {
            throw new IllegalStateException("visibilityChanged() called without first calling withVisibility(...)");
        }
        if (bool.booleanValue()) {
            e();
        } else {
            d();
        }
    }

    public final void h(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void i(int i) {
        this.b.a.I(i, new acqx(this.c), this.a);
    }

    public final void j(View view) {
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        h(z);
    }
}
