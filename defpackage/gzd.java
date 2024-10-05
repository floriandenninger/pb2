package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gzd extends RecyclerView {
    public LinearLayoutManager W;
    public long aa;
    public Runnable ab;
    public gyi ac;
    public boolean ad;
    public boolean ae;
    public lo af;
    public lo ag;
    public lo ah;

    public gzd(Context context) {
        super(context);
        this.ad = false;
        this.ae = false;
    }

    public static int a(long j, long j2) {
        return (int) ((((float) j) / ((float) j2)) * 6.0f);
    }

    public final long aH(int i, int i2) {
        int i3;
        int w;
        gzb gzbVar = (gzb) this.m;
        if (gzbVar == null) {
            return 0L;
        }
        if (this.ad) {
            i3 = (i + i2) - gzbVar.j;
            w = gzbVar.k * gzbVar.e;
        } else {
            i3 = i + i2;
            w = gzbVar.w();
        }
        int max = Math.max(w, getMeasuredWidth());
        if (max == 0) {
            return 0L;
        }
        return (i3 * gzbVar.f) / max;
    }

    public final long aI() {
        if (this.ad) {
            gzb gzbVar = (gzb) this.m;
            return aH(computeHorizontalScrollOffset(), gzbVar != null ? gzbVar.j : 0);
        }
        return aH(computeHorizontalScrollOffset(), 0);
    }

    public final long aJ() {
        if (this.ad) {
            gzb gzbVar = (gzb) this.m;
            return aH(computeHorizontalScrollOffset(), getMeasuredWidth() - (gzbVar != null ? gzbVar.j : 0));
        }
        return aH(computeHorizontalScrollOffset(), getMeasuredWidth());
    }

    public final void aK() {
        lo loVar = this.af;
        if (loVar != null) {
            loVar.b(this, 101);
        }
    }

    public final void aL(boolean z) {
        this.ae = z;
        gzb gzbVar = (gzb) this.m;
        if (gzbVar != null) {
            gzbVar.n = z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final int computeHorizontalScrollOffset() {
        int J2;
        View S;
        if (this.ad) {
            gzb gzbVar = (gzb) this.m;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.n;
            if (gzbVar == null || linearLayoutManager == null || (S = linearLayoutManager.S((J2 = linearLayoutManager.J()))) == null) {
                return 0;
            }
            if (J2 != 0) {
                return gzbVar.j + ((J2 - 1) * gzbVar.k) + Math.abs(S.getLeft());
            }
            return Math.abs(S.getLeft());
        }
        return super.computeHorizontalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        gzb gzbVar = (gzb) this.m;
        if (gzbVar != null) {
            gzbVar.h.clear();
            gzbVar.i.evictAll();
            gzbVar.d.h(gzbVar);
        }
        super.onDetachedFromWindow();
    }
}
