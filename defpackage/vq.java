package defpackage;

import android.graphics.PointF;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vq extends wg {
    private vo b;
    private vo c;

    public vq() {
        super(null);
    }

    private final vo i(wd wdVar) {
        vo voVar = this.c;
        if (voVar == null || voVar.a != wdVar) {
            this.c = vo.p(wdVar);
        }
        return this.c;
    }

    private final vo j(wd wdVar) {
        vo voVar = this.b;
        if (voVar == null || voVar.a != wdVar) {
            this.b = vo.r(wdVar);
        }
        return this.b;
    }

    private static final int k(View view, vo voVar) {
        return (voVar.d(view) + (voVar.b(view) / 2)) - (voVar.j() + (voVar.k() / 2));
    }

    private static final View l(wd wdVar, vo voVar) {
        int aq = wdVar.aq();
        View view = null;
        if (aq == 0) {
            return null;
        }
        int j = voVar.j() + (voVar.k() / 2);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < aq) {
            View az = wdVar.az(i2);
            int abs = Math.abs((voVar.d(az) + (voVar.b(az) / 2)) - j);
            int i3 = abs < i ? abs : i;
            if (abs < i) {
                view = az;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wg
    public int a(wd wdVar, int i, int i2) {
        vo i3;
        PointF O;
        int at = wdVar.at();
        if (at != 0) {
            View view = null;
            if (wdVar.ae()) {
                i3 = j(wdVar);
            } else {
                i3 = wdVar.ad() ? i(wdVar) : null;
            }
            if (i3 == null) {
                return -1;
            }
            int aq = wdVar.aq();
            boolean z = false;
            View view2 = null;
            int i4 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < aq; i6++) {
                View az = wdVar.az(i6);
                if (az != null) {
                    int k = k(az, i3);
                    if (k <= 0 && k > i4) {
                        view2 = az;
                        i4 = k;
                    }
                    if (k >= 0 && k < i5) {
                        view = az;
                        i5 = k;
                    }
                }
            }
            boolean z2 = !wdVar.ad() ? i2 <= 0 : i <= 0;
            if (z2 && view != null) {
                return wd.bm(view);
            }
            if (!z2 && view2 != null) {
                return wd.bm(view2);
            }
            if (true == z2) {
                view = view2;
            }
            if (view == null) {
                return -1;
            }
            int bm = wd.bm(view);
            int at2 = wdVar.at();
            if ((wdVar instanceof wq) && (O = ((wq) wdVar).O(at2 - 1)) != null && (O.x < 0.0f || O.y < 0.0f)) {
                z = true;
            }
            int i7 = bm + (z == z2 ? -1 : 1);
            if (i7 >= 0 && i7 < at) {
                return i7;
            }
        }
        return -1;
    }

    @Override // defpackage.wg
    public View b(wd wdVar) {
        if (wdVar.ae()) {
            return l(wdVar, j(wdVar));
        }
        if (wdVar.ad()) {
            return l(wdVar, i(wdVar));
        }
        return null;
    }

    @Override // defpackage.wg
    public int[] c(wd wdVar, View view) {
        int[] iArr = new int[2];
        if (wdVar.ad()) {
            iArr[0] = k(view, i(wdVar));
        } else {
            iArr[0] = 0;
        }
        if (wdVar.ae()) {
            iArr[1] = k(view, j(wdVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.wg
    public final wr d(wd wdVar) {
        if (wdVar instanceof wq) {
            return new vp(this, this.a.getContext());
        }
        return null;
    }
}
