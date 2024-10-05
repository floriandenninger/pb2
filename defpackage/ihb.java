package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihb extends lo {
    public final /* synthetic */ ihl a;
    private int b = -1;

    public ihb(ihl ihlVar) {
        this.a = ihlVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        ihn ihnVar;
        Iterator it = this.a.l.iterator();
        while (it.hasNext()) {
            ((ihh) it.next()).n(i);
        }
        ihl ihlVar = this.a;
        ihlVar.u = i;
        if (i != 0) {
            if (i == 1) {
                this.b = ihlVar.y;
                ReelSnackbarController reelSnackbarController = ihlVar.g;
                if (reelSnackbarController != null) {
                    reelSnackbarController.g();
                    return;
                }
                return;
            }
            int i2 = ihlVar.z;
            if (i2 == -1) {
                ihj ihjVar = ihlVar.m;
                View b = ihjVar.b(ihjVar.b.p);
                if (b != null) {
                    ihl ihlVar2 = ihjVar.b;
                    i2 = ihf.bm(b);
                } else {
                    i2 = -1;
                }
            }
            long D = this.a.n.D(i2);
            ihl ihlVar3 = this.a;
            long j = ihlVar3.w;
            Object obj = ihlVar3.c.get();
            if (obj != null && ((aujz) obj).B && i2 != -1 && D >= 0 && D != j) {
                this.b = i2;
                this.a.o.a(true);
                if (!this.a.g().isPresent() || !(((ihm) this.a.g().get()).f instanceof iim)) {
                    j(i2);
                    return;
                } else {
                    ilb ilbVar = ((iim) ((ihm) this.a.g().get()).f).v.f;
                    ilbVar.a(this.a.D.d, Optional.of(new iha(this, ilbVar, i2)));
                    return;
                }
            }
            this.b = this.a.y;
            return;
        }
        Optional g = ihlVar.g();
        if (this.a.v && g.isPresent() && ((ihm) g.get()).a() != null && (ihnVar = this.a.f) != null) {
            ihnVar.g(((ihm) g.get()).a().d, 0L);
        }
        ReelRecyclerView reelRecyclerView = this.a.o;
        if (reelRecyclerView != null) {
            reelRecyclerView.a(false);
        }
        ihl ihlVar4 = this.a;
        if (!ihlVar4.v) {
            int I = ihlVar4.p.I();
            if (this.a.n.C() != -1 && I == 0) {
                I = this.a.n.y();
            }
            if (I != -1) {
                ihl ihlVar5 = this.a;
                ihlVar5.y = I;
                ihlVar5.m(this.b);
                this.b = -1;
                this.a.l(false);
                return;
            }
            return;
        }
        ihlVar4.v = false;
        ReelPlayerView reelPlayerView = ihlVar4.D;
        if (reelPlayerView != null) {
            reelPlayerView.setScrollX(0);
            this.a.D.setScrollY(0);
        }
        ihe iheVar = this.a.t;
        if (iheVar == null || iheVar.c == null) {
            return;
        }
        ihm ihmVar = iheVar.b;
        String str = ihmVar.a().d;
        arsd arsdVar = ihmVar.e;
        boolean ab = etx.ab(ihmVar.a());
        if (arsdVar != null) {
            this.a.t.c.m(str, arsdVar, ihmVar.a, ab, ihmVar.c, ihmVar.a());
        }
        this.a.t.c.l();
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        ReelPlayerView reelPlayerView = this.a.D;
        reelPlayerView.setScrollX(reelPlayerView.getScrollX() + i);
        reelPlayerView.setScrollY(reelPlayerView.getScrollY() + i2);
    }

    public final void j(int i) {
        ihl ihlVar = this.a;
        ihlVar.v = true;
        ihlVar.y = i;
        ihlVar.m(this.b);
        this.b = -1;
        ihl ihlVar2 = this.a;
        ihlVar2.z = -1;
        ihlVar2.l(true);
        int scrollY = this.a.D.getScrollY();
        int scrollX = this.a.D.getScrollX();
        int height = this.a.D.getHeight();
        int width = this.a.D.getWidth();
        if (scrollY > 0) {
            this.a.D.setScrollY(scrollY - height);
            return;
        }
        if (scrollY < 0) {
            this.a.D.setScrollY(scrollY + height);
        } else if (scrollX > 0) {
            this.a.D.setScrollX(scrollX - width);
        } else if (scrollX < 0) {
            this.a.D.setScrollX(scrollX + width);
        }
    }
}
