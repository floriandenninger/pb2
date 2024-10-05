package defpackage;

import android.graphics.PointF;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vb extends wg {
    private vo b;
    private vo c;

    public vb() {
        super(null);
    }

    private int i(wd wdVar, vo voVar, int i, int i2) {
        int[] g = g(i, i2);
        int aq = wdVar.aq();
        float f = 1.0f;
        if (aq != 0) {
            int i3 = Integer.MAX_VALUE;
            int i4 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < aq; i5++) {
                View az = wdVar.az(i5);
                int bm = wd.bm(az);
                if (bm != -1) {
                    int i6 = bm < i3 ? bm : i3;
                    if (bm < i3) {
                        view = az;
                    }
                    if (bm > i4) {
                        view2 = az;
                        i4 = bm;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(voVar.a(view), voVar.a(view2)) - Math.min(voVar.d(view), voVar.d(view2));
                if (max != 0) {
                    f = max / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(g[0]) > Math.abs(g[1]) ? g[0] : g[1]) / f);
    }

    private final vo j(wd wdVar) {
        vo voVar = this.c;
        if (voVar == null || voVar.a != wdVar) {
            this.c = vo.p(wdVar);
        }
        return this.c;
    }

    private final vo k(wd wdVar) {
        vo voVar = this.b;
        if (voVar == null || voVar.a != wdVar) {
            this.b = vo.r(wdVar);
        }
        return this.b;
    }

    private static final int l(View view, vo voVar) {
        return (voVar.d(view) + (voVar.b(view) / 2)) - (voVar.j() + (voVar.k() / 2));
    }

    private static final View m(wd wdVar, vo voVar) {
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
        int at;
        View b;
        int bm;
        int i3;
        PointF O;
        int i4;
        int i5;
        if (!(wdVar instanceof wq) || (at = wdVar.at()) == 0 || (b = b(wdVar)) == null || (bm = wd.bm(b)) == -1 || (O = ((wq) wdVar).O(at - 1)) == null) {
            return -1;
        }
        if (wdVar.ad()) {
            i4 = i(wdVar, j(wdVar), i, 0);
            if (O.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (wdVar.ae()) {
            i5 = i(wdVar, k(wdVar), 0, i2);
            if (O.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (true == wdVar.ae()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = bm + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= at ? i3 : i7;
    }

    @Override // defpackage.wg
    public final View b(wd wdVar) {
        if (wdVar.ae()) {
            return m(wdVar, k(wdVar));
        }
        if (wdVar.ad()) {
            return m(wdVar, j(wdVar));
        }
        return null;
    }

    @Override // defpackage.wg
    public final int[] c(wd wdVar, View view) {
        int[] iArr = new int[2];
        if (wdVar.ad()) {
            iArr[0] = l(view, j(wdVar));
        } else {
            iArr[0] = 0;
        }
        if (wdVar.ae()) {
            iArr[1] = l(view, k(wdVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
