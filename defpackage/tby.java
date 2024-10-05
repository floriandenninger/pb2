package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class tby {
    private final int q;
    private final float r;
    public final HashMap a = new HashMap();
    public vw b = null;
    public ajjf p = null;
    public RecyclerView c = null;
    public boolean d = true;
    public final tbx e = new tbx(this);
    public final View.OnLayoutChangeListener f = new tbv(this);
    public final tbu g = new tbu(this);
    public int h = -1;
    public int i = -1;
    public final ArrayList j = new ArrayList();
    public int k = -1;
    public int l = -1;
    public int m = 1;
    public int n = -1;
    public int o = -1;
    private boolean s = false;
    private final tbw t = new tbw(0, null, null);

    public tby(int i, float f) {
        this.q = i;
        this.r = f;
    }

    private static final boolean a(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    public final int b(int i) {
        tbw tbwVar = this.t;
        tbwVar.a = i;
        int binarySearch = Collections.binarySearch(this.j, tbwVar, bea.r);
        return binarySearch < 0 ? -(binarySearch + 1) : binarySearch;
    }

    public final void c() {
        int J2;
        int L;
        tbw tbwVar;
        int i;
        if (this.j.isEmpty() || this.i == 0 || this.h == 0) {
            return;
        }
        wd wdVar = this.c.n;
        if (wdVar instanceof LinearLayoutManager) {
            J2 = ((LinearLayoutManager) wdVar).J();
        } else {
            J2 = wdVar instanceof GridLayoutManager ? ((GridLayoutManager) wdVar).J() : 0;
        }
        this.k = J2;
        wd wdVar2 = this.c.n;
        if (wdVar2 instanceof LinearLayoutManager) {
            L = ((LinearLayoutManager) wdVar2).L();
        } else {
            L = wdVar2 instanceof GridLayoutManager ? ((GridLayoutManager) wdVar2).L() : -1;
        }
        this.l = L;
        int max = Math.max(this.m, (L - this.k) + 1);
        this.m = max;
        int max2 = Math.max(0, this.k - Math.round(max * this.r));
        int round = this.l + Math.round(this.m * this.r);
        int i2 = this.q;
        if ((round - max2) + 1 < i2) {
            round = (i2 + max2) - 1;
        }
        if (round >= this.b.b()) {
            round = this.b.b() - 1;
        }
        int i3 = this.n;
        if (max2 == i3 && round == this.o && !this.s) {
            return;
        }
        this.s = false;
        int min = i3 < 0 ? max2 : Math.min(i3, max2);
        int i4 = this.o;
        int max3 = i4 < 0 ? round : Math.max(i4, round);
        tca tcaVar = null;
        for (int b = b(min); b < this.j.size() && (i = (tbwVar = (tbw) this.j.get(b)).a) <= max3; b++) {
            if (!a(i, max2, round) || tbwVar.b) {
                if (!a(tbwVar.a, max2, round) && tbwVar.b) {
                    tbwVar.b = false;
                    tbwVar.c.b();
                }
            } else {
                if (tcaVar == null) {
                    tcaVar = new tca(this.c.getWidth(), this.c.getHeight(), this.d);
                }
                tbwVar.b = true;
                tcf tcfVar = tbwVar.c;
                int i5 = tcaVar.c ? tcaVar.a : tcaVar.b;
                if (tcfVar.g == null || i5 != tcfVar.h) {
                    tcfVar.h = i5;
                    ComponentTree a = tcfVar.a();
                    int makeMeasureSpec = tcaVar.c ? View.MeasureSpec.makeMeasureSpec(tcaVar.a, 1073741824) : 0;
                    int makeMeasureSpec2 = tcaVar.c ? 0 : View.MeasureSpec.makeMeasureSpec(tcaVar.b, 1073741824);
                    dha dhaVar = tcfVar.f;
                    if (dhaVar != null) {
                        a.x(dhaVar, makeMeasureSpec, makeMeasureSpec2, true, null, 1, null);
                    } else {
                        throw new IllegalArgumentException("Root component can't be null");
                    }
                }
            }
        }
        this.n = max2;
        this.o = round;
    }

    public final void d() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tbw tbwVar = (tbw) arrayList.get(i);
            if (tbwVar.b) {
                tbwVar.c.b();
                tbwVar.b = false;
            }
        }
        this.k = -1;
        this.l = -1;
        this.n = -1;
        this.o = -1;
        this.m = 1;
    }

    public final void e() {
        if ((!this.d || this.c.getWidth() == this.h) && (this.d || this.c.getHeight() == this.i)) {
            return;
        }
        this.h = this.c.getWidth();
        this.i = this.c.getHeight();
        d();
        c();
    }

    public void f() {
        throw null;
    }
}
