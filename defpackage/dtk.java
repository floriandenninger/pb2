package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtk extends wg {
    public RecyclerView b;
    private vo c;
    private vo d;
    private wd e;
    private wd f;
    private final int g;

    public dtk(int i) {
        super(null);
        this.g = i;
    }

    private final vo i(wd wdVar) {
        if (this.d == null || this.f != wdVar) {
            this.d = vo.p(wdVar);
            this.f = wdVar;
        }
        return this.d;
    }

    private final vo j(wd wdVar) {
        if (this.c == null || this.e != wdVar) {
            this.c = vo.r(wdVar);
            this.e = wdVar;
        }
        return this.c;
    }

    private static View k(wd wdVar, vo voVar) {
        int aq = wdVar.aq();
        View view = null;
        if (aq == 0) {
            return null;
        }
        int j = voVar.j();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < aq) {
            View az = wdVar.az(i2);
            int abs = Math.abs(voVar.d(az) - j);
            int i3 = abs < i ? abs : i;
            if (abs < i) {
                view = az;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    private static final int l(View view, vo voVar) {
        return voVar.d(view) - voVar.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wg
    public final int a(wd wdVar, int i, int i2) {
        int bm;
        PointF O;
        int at = wdVar.at();
        if (at == 0) {
            return -1;
        }
        boolean ad = wdVar.ad();
        vo i3 = ad ? i(wdVar) : j(wdVar);
        int aq = wdVar.aq();
        View view = null;
        if (aq != 0) {
            int j = i3.j();
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < aq; i5++) {
                View az = wdVar.az(i5);
                int d = i3.d(az);
                int abs = Math.abs(d - j);
                if (d < j && abs < i4) {
                    view = az;
                    i4 = abs;
                }
            }
        }
        if (view == null || (bm = wd.bm(view)) == -1) {
            return -1;
        }
        boolean z = true;
        boolean z2 = !ad ? i2 <= 0 : i <= 0;
        if (!(wdVar instanceof wq) || (O = ((wq) wdVar).O(at - 1)) == null || (O.x >= 0.0f && O.y >= 0.0f)) {
            z = false;
        }
        if (z2) {
            int i6 = this.g;
            bm = z ? bm - i6 : bm + i6;
        }
        int i7 = bm >= 0 ? bm : 0;
        return i7 >= at ? at - 1 : i7;
    }

    @Override // defpackage.wg
    public final View b(wd wdVar) {
        if (wdVar.ae()) {
            return k(wdVar, j(wdVar));
        }
        if (wdVar.ad()) {
            return k(wdVar, i(wdVar));
        }
        return null;
    }

    @Override // defpackage.wg
    public final int[] c(wd wdVar, View view) {
        int[] iArr = new int[2];
        if (wdVar.ad()) {
            iArr[0] = l(view, i(wdVar));
        } else {
            iArr[0] = 0;
        }
        if (wdVar.ae()) {
            iArr[1] = l(view, j(wdVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.wg
    public final void e(RecyclerView recyclerView) {
        this.b = recyclerView;
        super.e(recyclerView);
    }

    @Override // defpackage.wg
    protected final wr h(wd wdVar) {
        if (wdVar instanceof wq) {
            return new dtj(this, this.b.getContext());
        }
        return null;
    }
}
