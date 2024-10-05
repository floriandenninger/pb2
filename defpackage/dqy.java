package defpackage;

import android.graphics.PointF;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dqy extends vb {
    private static int b = Integer.MAX_VALUE;

    public dqy(int i) {
        b = i;
    }

    private final int i(wd wdVar, vo voVar, int i, int i2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vb, defpackage.wg
    public final int a(wd wdVar, int i, int i2) {
        int at;
        View b2;
        int bm;
        int i3;
        PointF O;
        int i4;
        int i5;
        if (!(wdVar instanceof wq) || (at = wdVar.at()) == 0 || (b2 = b(wdVar)) == null || (bm = wd.bm(b2)) == -1 || (O = ((wq) wdVar).O(at - 1)) == null) {
            return -1;
        }
        if (wdVar.ad()) {
            i4 = i(wdVar, vo.p(wdVar), i, 0);
            int i6 = b;
            if (i4 > i6) {
                i4 = i6;
            }
            if (i4 < (-i6)) {
                i4 = -i6;
            }
            if (O.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (wdVar.ae()) {
            i5 = i(wdVar, vo.r(wdVar), 0, i2);
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
        int i7 = bm + i4;
        int i8 = i7 >= 0 ? i7 : 0;
        return i8 >= at ? i3 : i8;
    }
}
