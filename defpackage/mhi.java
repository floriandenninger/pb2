package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhi extends gfp implements gge {
    private final azrw e;
    private final Handler f = new mhh(this, Looper.getMainLooper());
    public gfq d = gfq.a;

    public mhi(azrw azrwVar) {
        this.e = azrwVar;
    }

    public static void a(View view, int i) {
        if (view != null) {
            view.animate().cancel();
            view.setAlpha(i);
        }
    }

    public static boolean b(ggr ggrVar) {
        return (ggrVar == null || ggrVar.j() == null) ? false : true;
    }

    private final void c(gfq gfqVar) {
        gfqVar.c(false);
        if (b(gfqVar.b())) {
            return;
        }
        ((zcd) this.e.get()).c(null);
        a(gfqVar.a(), 1);
    }

    @Override // defpackage.gfp, defpackage.ggf
    public final void g(gfq gfqVar) {
        c(gfqVar);
    }

    @Override // defpackage.gfp
    protected final boolean i(gfq gfqVar, int i) {
        if (i != 0) {
            return true;
        }
        c(gfqVar);
        return true;
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        if (i2 == 0) {
            this.d = gfq.a;
            this.f.removeMessages(0);
            return;
        }
        if (i2 == 1) {
            gfqVar.c(true);
            this.d = gfqVar;
        } else {
            if (i2 != 2) {
                return;
            }
            ggr b = gfqVar.b();
            if (b(b)) {
                fpx fpxVar = (fpx) b.j().d.get();
                if (fpxVar != null) {
                    fpxVar.a(true);
                }
            } else {
                ((zcd) this.e.get()).c(gfqVar.a());
            }
            this.f.sendEmptyMessage(0);
        }
    }
}
