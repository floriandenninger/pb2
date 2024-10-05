package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhz implements xla {
    public final xhx a;
    public final aahd b;
    public final xhw[] c;
    public xhy d;

    public xhz(xhx xhxVar, acra acraVar, aahd aahdVar, xhw... xhwVarArr) {
        xhxVar.getClass();
        this.a = xhxVar;
        acraVar.getClass();
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = xhwVarArr;
        xhxVar.nM(this);
    }

    @Override // defpackage.xla
    public final void a(Bundle bundle) {
        xjk xjkVar;
        xhy f = f();
        if (f == null || (xjkVar = ((wpc) f).e) == null) {
            return;
        }
        xjkVar.c(bundle);
    }

    @Override // defpackage.xla
    public final void b() {
        xhy f = f();
        if (f != null) {
            f.e();
        }
    }

    @Override // defpackage.xla
    public final void c(boolean z) {
        xjk xjkVar;
        xhy f = f();
        if (f == null || (xjkVar = ((wpc) f).e) == null) {
            return;
        }
        xjkVar.g(z);
    }

    @Override // defpackage.xla
    public final void d() {
        xhy f = f();
        if (f != null) {
            wpc wpcVar = (wpc) f;
            ((woy) wpcVar.a.get()).p();
            xjk xjkVar = wpcVar.e;
            if (xjkVar != null) {
                xjkVar.p();
            }
        }
    }

    @Override // defpackage.xla
    public final void e(int i, int i2) {
        xhy f = f();
        if (f != null) {
            wpc wpcVar = (wpc) f;
            ((wvi) wpcVar.b.get()).a = i;
            ((wvi) wpcVar.c.get()).a = i2;
            xjk xjkVar = wpcVar.e;
            if (xjkVar != null) {
                xjkVar.q(i, i2);
            }
        }
    }

    public final xhy f() {
        xhy xhyVar = this.d;
        if (xhyVar != null) {
            return xhyVar;
        }
        return null;
    }
}
