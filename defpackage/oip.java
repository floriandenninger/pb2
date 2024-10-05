package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oip implements oir {
    private static final int[] i = {1, 2, 4, 8, 16};
    public final nuv a;
    public final SparseArray b;
    public final azqv c;
    public final azqv d;
    public final nwx e;
    public zch f;
    public ayqx g;
    public int h;
    private final ogt j;
    private final int k;
    private final int l;

    public oip(View view, View view2, View view3, View view4, nqp nqpVar, ogt ogtVar, nuv nuvVar) {
        yzr yzrVar = new yzr(view, 0L, 8);
        yzr yzrVar2 = new yzr(view2, 0L, 8);
        nti ntiVar = nti.a;
        yzr yzrVar3 = new yzr(view3);
        yzrVar3.l(ntiVar);
        yzr C = nqpVar.C();
        yzr yzrVar4 = new yzr(view4, 0L, 8);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_header_height);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_entry_point_height);
        this.a = nuvVar;
        this.j = ogtVar;
        SparseArray sparseArray = new SparseArray(5);
        this.b = sparseArray;
        this.h = 1;
        this.k = dimensionPixelSize;
        this.l = dimensionPixelSize2;
        this.c = azqv.aq(false);
        this.d = azqv.aq(false);
        this.e = nqpVar.h();
        sparseArray.put(1, n(yzrVar));
        sparseArray.put(2, n(yzrVar2));
        sparseArray.put(4, n(yzrVar3));
        sparseArray.put(8, n(C));
        sparseArray.put(16, n(yzrVar4));
    }

    static int b(int i2) {
        if (m(i2, 8)) {
            return 8;
        }
        if (m(i2, 4) && m(i2, 2)) {
            return 6;
        }
        return i2 & 19;
    }

    private final int l(int i2, int i3, boolean z) {
        return !((oio) this.b.get(i3)).a ? i2 : z ? i2 | i3 : i2 & (i3 ^ (-1));
    }

    private static boolean m(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    private static oio n(yzr yzrVar) {
        return new oio(yzrVar);
    }

    @Override // defpackage.oir
    public final void a(boolean z) {
        if (z) {
            f(4);
        } else {
            c(4);
        }
    }

    public final void c(int i2) {
        d(i2, null);
    }

    public final void d(int i2, zcg zcgVar) {
        i(l(this.h, i2, false), true, zcgVar);
    }

    public final void e(int i2) {
        i(l(this.h, i2, false), false, null);
    }

    public final void f(int i2) {
        g(i2, null);
    }

    public final void g(int i2, zcg zcgVar) {
        i(l(this.h, i2, true), true, zcgVar);
    }

    public final void h(int i2) {
        i(l(this.h, i2, true), false, null);
    }

    public final void i(int i2, boolean z, zcg zcgVar) {
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int[] iArr = i;
        for (int i5 = 0; i5 < 5; i5++) {
            int i6 = iArr[i5];
            oio oioVar = (oio) this.b.get(i6);
            if (oioVar.a) {
                arrayList.add(Integer.valueOf(i6));
                zch zchVar = this.f;
                if (zchVar != null) {
                    oioVar.b.j(zchVar);
                }
            }
        }
        int b = b(this.h);
        int b2 = b(i2);
        int i7 = b ^ b2;
        this.h = i2;
        if (z) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                int intValue = ((Integer) arrayList.get(i8)).intValue();
                oio oioVar2 = (oio) this.b.get(intValue);
                if (m(19, intValue)) {
                    oioVar2.a(m(b | i2, intValue), false);
                } else if (m(i7, intValue)) {
                    if (intValue == 8) {
                        yzr yzrVar = ((oio) this.b.get(8)).b;
                        if (zcgVar == null) {
                            yzrVar.l(nti.b);
                        } else {
                            yzrVar.l(zcgVar);
                        }
                        intValue = 8;
                    }
                    oioVar2.a(m(b2, intValue), true);
                    zch zchVar2 = this.f;
                    if (zchVar2 != null) {
                        oioVar2.b.h(zchVar2);
                    }
                } else {
                    oioVar2.a(m(b2, intValue), false);
                }
            }
        } else {
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                int intValue2 = ((Integer) arrayList.get(i9)).intValue();
                ((oio) this.b.get(intValue2)).a(m(b2, intValue2), false);
            }
        }
        this.j.b(m(4, i2), m(i2, 8));
        View view = ((oio) this.b.get(1)).b.b;
        if (m(this.h, 16)) {
            i4 = yjk.aa(view.getContext()) ? this.l : 0;
            i3 = 0;
        } else {
            i3 = m(this.h, 2) ? this.k : 0;
            i4 = 0;
        }
        view.setPadding(0, i3, 0, i4);
        this.c.c(Boolean.valueOf(((oio) this.b.get(16)).b.f()));
        this.d.c(Boolean.valueOf(k(16)));
    }

    public final void j(nwx nwxVar) {
        this.g = nwxVar.l.X(new oim(this, 0));
    }

    public final boolean k(int i2) {
        return m(this.h, i2);
    }
}
