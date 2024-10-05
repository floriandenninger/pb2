package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgk {
    private final aoae a;

    public tgk(aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = aoaeVar;
    }

    public static final void d(View view) {
        uqq.j();
        tgb b = tgj.b(view);
        b.getClass();
        b.a.f();
        amkq.N(!b.a.m());
        b.a = null;
    }

    @Deprecated
    public final tfy a(int i) {
        return new tfy(awxk.u(i), rtp.h, this.a, this, null, null, null, null, null, null);
    }

    public final tgb b(View view, tfy tfyVar) {
        uqq.j();
        tgb f = tfyVar.f(this.a);
        tgb b = tgj.b(view);
        if (b != null) {
            if (b.c()) {
                if (b.d()) {
                    aoae.z(new IllegalStateException("CVE is already impressed and cannot be replaced."));
                } else {
                    aoae.z(new IllegalStateException("CVE is already attached and cannot be replaced."));
                }
                return b;
            }
            b.b(f);
            return b;
        }
        tgj.q(view, f);
        return f;
    }

    public final void c(View view, tfy tfyVar) {
        tgb b = tgj.b(view);
        if (b == null) {
            b(view, tfyVar);
            return;
        }
        if (b.a().h != ((tgf) tfyVar.c.instance).h) {
            throw new IllegalArgumentException("Disallowed Difference in CVE");
        }
        if (b.a().g != ((tgf) tfyVar.c.instance).g) {
            new tgm(b.e.y()).b(b);
            boolean m = b.a.m();
            if (m) {
                b.e.x(b);
            }
            b.c.clear();
            if (m) {
                b.e.w(b);
            }
            b.b(tfyVar.f(this.a));
        }
    }

    public final void e(View view, tfy tfyVar) {
        if (tgj.b(view) == null) {
            b(view, tfyVar);
        }
    }
}
