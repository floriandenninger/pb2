package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class wg {
    public RecyclerView a;
    private Scroller b;
    private final lo c;

    public wg() {
    }

    public abstract int a(wd wdVar, int i, int i2);

    public abstract View b(wd wdVar);

    public abstract int[] c(wd wdVar, View view);

    public wr d(wd wdVar) {
        return h(wdVar);
    }

    public void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aF(this.c);
            this.a.H = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.H != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.aD(this.c);
            RecyclerView recyclerView3 = this.a;
            recyclerView3.H = this;
            this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void f() {
        wd wdVar;
        View b;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (wdVar = recyclerView.n) == null || (b = b(wdVar)) == null) {
            return;
        }
        int[] c = c(wdVar, b);
        int i = 0;
        int i2 = c[0];
        if (i2 != 0) {
            i = i2;
        } else if (c[1] == 0) {
            return;
        }
        this.a.ai(i, c[1]);
    }

    public final int[] g(int i, int i2) {
        this.b.fling(0, 0, i, i2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    @Deprecated
    protected wr h(wd wdVar) {
        if (wdVar instanceof wq) {
            return new xw(this, this.a.getContext());
        }
        return null;
    }

    public wg(byte[] bArr) {
        this.c = new xv(this);
    }
}
