package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtd {
    static final vz a = new ub((char[]) null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dti a(Context context) {
        return new dti(context, new drn(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(dhe dheVar, int i) {
        int i2 = i + 1;
        int i3 = drw.P;
        if (dheVar.f == null) {
            return;
        }
        dheVar.g(new dlp(0, Integer.valueOf(i2)), "updateState:Recycler.onUpdateMeasure");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean c(dim dimVar, dim dimVar2, dim dimVar3, dim dimVar4, dim dimVar5, dim dimVar6, dim dimVar7, dim dimVar8, dim dimVar9, dim dimVar10, dim dimVar11, dim dimVar12, dim dimVar13, dim dimVar14, dim dimVar15, dim dimVar16, dim dimVar17) {
        if (((Integer) dimVar17.a).intValue() == ((Integer) dimVar17.b).intValue() && dimVar.a == dimVar.b && ((Boolean) dimVar2.a).equals(dimVar2.b) && ((Boolean) dimVar3.a).equals(dimVar3.b) && ((Integer) dimVar4.a).equals(dimVar4.b) && ((Integer) dimVar5.a).equals(dimVar5.b) && ((Integer) dimVar6.a).equals(dimVar6.b) && ((Integer) dimVar7.a).equals(dimVar7.b) && ((Boolean) dimVar10.a).equals(dimVar10.b) && ((Integer) dimVar11.a).equals(dimVar11.b) && ((Boolean) dimVar13.a).equals(dimVar13.b) && ((Boolean) dimVar14.a).equals(dimVar14.b) && ((Integer) dimVar15.a).equals(dimVar15.b)) {
            Integer num = (Integer) dimVar8.a;
            Integer num2 = (Integer) dimVar8.b;
            if (num != null ? !num.equals(num2) : num2 != null) {
                return true;
            }
            if (((Integer) dimVar9.a).equals(dimVar9.b)) {
                vz vzVar = (vz) dimVar16.a;
                vz vzVar2 = (vz) dimVar16.b;
                if (vzVar != null ? !vzVar.getClass().equals(vzVar2.getClass()) : vzVar2 != null) {
                    return true;
                }
                ll llVar = (ll) dimVar12.a;
                ll llVar2 = (ll) dimVar12.b;
                if (llVar == null) {
                    if (llVar2 == null) {
                        return false;
                    }
                } else if (llVar.equals(llVar2)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(dti dtiVar, dqr dqrVar, dsz dszVar, List list, wg wgVar, boolean z, ajzj ajzjVar, wh whVar, bvi bviVar) {
        dtiVar.setContentDescription(null);
        dtiVar.setEnabled(z && bviVar != null);
        dtiVar.a = bviVar;
        RecyclerView recyclerView = dtiVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.aD((lo) it.next());
            }
        }
        if (ajzjVar != null) {
            ((drn) recyclerView).W = ajzjVar;
        }
        if (whVar != null) {
            recyclerView.v(whVar);
        }
        if (wgVar != null && recyclerView.H == null) {
            wgVar.e(recyclerView);
        }
        dqrVar.g();
        if (dszVar != null) {
            dszVar.a = dtiVar;
        }
        if (dtiVar.m) {
            recyclerView.requestLayout();
            dtiVar.m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(dhi dhiVar, dqr dqrVar) {
        dqrVar.d(dhiVar.H(), dhiVar.C());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(dhe dheVar, int i, int i2, dlo dloVar, dqr dqrVar) {
        diy H;
        if (dqrVar.f()) {
            int i3 = drw.P;
            H = drw.H(drw.class, dheVar, 946341036, new Object[]{dheVar});
        } else {
            dqrVar.h();
            H = null;
        }
        dqrVar.b(dloVar, i, i2, H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(dti dtiVar, dqr dqrVar, dsz dszVar, wh whVar, List list) {
        RecyclerView recyclerView = dtiVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        dqrVar.i();
        if (dszVar != null) {
            dszVar.a = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.aF((lo) it.next());
            }
        }
        if (whVar != null) {
            recyclerView.Y(whVar);
        }
        ((drn) recyclerView).W = null;
        dtiVar.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(dti dtiVar, dqr dqrVar, wg wgVar) {
        RecyclerView recyclerView = dtiVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        recyclerView.setId(-1);
        dqrVar.e(recyclerView);
        if (wgVar != null) {
            wgVar.e(null);
        }
        dtiVar.l.ae(dtiVar.n);
        dtiVar.n = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void i(dqr dqrVar) {
        dqrVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(dti dtiVar, dqr dqrVar, boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3, int i6, int i7, int i8, CharSequence charSequence, vz vzVar) {
        RecyclerView recyclerView = dtiVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
        }
        recyclerView.setContentDescription(charSequence);
        recyclerView.s = true;
        recyclerView.setClipToPadding(z);
        dtiVar.setClipToPadding(z);
        jw.Y(recyclerView, i, i3, i2, i4);
        recyclerView.setClipChildren(z2);
        dtiVar.setClipChildren(z2);
        recyclerView.setNestedScrollingEnabled(z3);
        dtiVar.setNestedScrollingEnabled(z3);
        recyclerView.setScrollBarStyle(0);
        recyclerView.setHorizontalFadingEdgeEnabled(false);
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setFadingEdgeLength(i6);
        recyclerView.setId(i7);
        recyclerView.setOverScrollMode(i8);
        dtiVar.j(i5);
        if (vzVar == a) {
            vzVar = new ub((char[]) null);
        }
        RecyclerView recyclerView2 = dtiVar.l;
        dtiVar.n = recyclerView2.E;
        recyclerView2.ae(vzVar);
        dqrVar.c(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void k(int i, baql baqlVar) {
        baqlVar.a = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void l(baql baqlVar) {
        baqlVar.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(diy diyVar, baql baqlVar) {
        if (diyVar != null) {
            baqlVar.a = new dtc(diyVar);
        }
    }
}
