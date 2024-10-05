package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpc implements xjl, xhy, ahsm, ypd {
    public final azrw a;
    public final azrw b;
    public final azrw c;
    public xjk e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final aaea i;
    private xhz j;
    public final Set d = new CopyOnWriteArraySet();
    private xjq k = xjq.a().a();

    public wpc(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, ypa ypaVar, aaea aaeaVar) {
        this.a = azrwVar;
        this.f = azrwVar2;
        this.g = azrwVar3;
        this.b = azrwVar4;
        this.c = azrwVar5;
        this.h = azrwVar6;
        this.i = aaeaVar;
        ypaVar.g(this);
        ypaVar.a(this, xag.class, new ypb() { // from class: wpb
            @Override // defpackage.ypb
            public final void a(Object obj) {
                xag xagVar = (xag) obj;
                Iterator it = wpc.this.d.iterator();
                while (it.hasNext()) {
                    ((xjj) it.next()).b(xagVar);
                }
            }
        });
    }

    private final boolean q() {
        return this.j != null;
    }

    @Override // defpackage.xjl
    public final xhx a() {
        xhz xhzVar = this.j;
        if (xhzVar == null) {
            return null;
        }
        return xhzVar.a;
    }

    @Override // defpackage.xjl
    public final void b(xjj xjjVar) {
        this.d.add(xjjVar);
    }

    @Override // defpackage.xjl
    public final void c(xjk xjkVar) {
        if (this.e != null) {
            throw new wnw("Tried to override existing listener");
        }
        this.e = xjkVar;
    }

    @Override // defpackage.xjl
    public final void d() {
        m(null);
    }

    @Override // defpackage.xhy
    public final void e() {
        if (!q()) {
            whu.l(null, "Ignoring onAdClickthrough because adOverlay inaccessible");
            return;
        }
        if (((wzq) this.f.get()).d(this.j.a)) {
            return;
        }
        if (wbs.y(this.i)) {
            ((wyk) this.h.get()).d();
        }
        xjk xjkVar = this.e;
        if (xjkVar != null) {
            xjkVar.d();
        }
    }

    @Override // defpackage.xjl
    public final void g(aoxt aoxtVar) {
        xhz xhzVar = this.j;
        if (xhzVar != null) {
            xhw[] xhwVarArr = xhzVar.c;
            int length = xhwVarArr.length;
            for (int i = 0; i < length; i = 1) {
                xhwVarArr[0].a(aoxtVar);
            }
        }
    }

    @Override // defpackage.xjl
    public final void h(xae xaeVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((xjj) it.next()).a(xaeVar);
        }
    }

    @Override // defpackage.ahsm
    public final void i() {
        xjk xjkVar = this.e;
        if (xjkVar != null) {
            xjkVar.k();
        }
    }

    @Override // defpackage.xjl
    public final void j(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
        xjk xjkVar = this.e;
        if (xjkVar != null) {
            xjkVar.r(displayMetrics, rect, rect2);
        }
    }

    @Override // defpackage.xjl
    public final void k(xjj xjjVar) {
        this.d.remove(xjjVar);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xab.class, xiw.class};
        }
        if (i == 0) {
            e();
            return null;
        }
        if (i == 1) {
            xiw xiwVar = (xiw) obj;
            xjk xjkVar = this.e;
            if (xjkVar == null) {
                return null;
            }
            xjkVar.i(xiwVar.a());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.xjl
    public final void l(xjk xjkVar) {
        xjk xjkVar2 = this.e;
        if (xjkVar2 == null || amkq.b(xjkVar, xjkVar2)) {
            this.e = null;
        } else {
            whu.l(null, "Tried to remove unassociated listener");
        }
    }

    @Override // defpackage.xjl
    public final void m(xhz xhzVar) {
        xhz xhzVar2 = this.j;
        if (xhzVar2 != null) {
            xhzVar2.d = null;
        }
        this.j = xhzVar;
        if (xhzVar != null) {
            xhzVar.d = this;
            p(this.k);
        }
        ((wpl) this.g.get()).a = xhzVar != null ? xhzVar.b : null;
    }

    @Override // defpackage.xjl
    public final void n(boolean z) {
        xjk xjkVar = this.e;
        if (xjkVar != null) {
            xjkVar.t(z);
        }
    }

    @Override // defpackage.xjl
    public final void o(boolean z) {
        xjk xjkVar = this.e;
        if (xjkVar != null) {
            xjkVar.u(z);
        }
    }

    @Override // defpackage.xjl
    public final void p(xjq xjqVar) {
        this.k = xjqVar;
        if (q()) {
            this.j.a.qH(xjqVar);
        }
    }
}
