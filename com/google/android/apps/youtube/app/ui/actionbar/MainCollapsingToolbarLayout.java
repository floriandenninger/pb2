package com.google.android.apps.youtube.app.ui.actionbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.alfk;
import defpackage.fzb;
import defpackage.lo;
import defpackage.lzu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainCollapsingToolbarLayout extends alfk {
    public fzb a;
    public boolean b;
    private RecyclerView i;
    private boolean j;
    private lo k;

    public MainCollapsingToolbarLayout(Context context) {
        super(context);
        this.k = new lzu(this);
    }

    private final boolean o() {
        RecyclerView recyclerView;
        if (this.a.p()) {
            return ((this.e == null && this.f == null) || (recyclerView = this.i) == null || recyclerView.getChildCount() <= 0) ? false : true;
        }
        return false;
    }

    public final void a(boolean z) {
        this.j = z;
        l(z);
    }

    public final void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 == recyclerView) {
            d(false);
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aF(this.k);
        }
        this.i = recyclerView;
        if (recyclerView != null) {
            recyclerView.aD(this.k);
            d(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // defpackage.alfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.o()
            if (r0 == 0) goto L4c
            android.support.v7.widget.RecyclerView r5 = r4.i
            wd r5 = r5.n
            android.support.v7.widget.LinearLayoutManager r5 = (android.support.v7.widget.LinearLayoutManager) r5
            int r5 = r5.J()
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L16
        L14:
            r5 = 1
            goto L2e
        L16:
            android.support.v7.widget.RecyclerView r5 = r4.i
            android.view.View r5 = r5.getChildAt(r1)
            int r2 = r5.getHeight()
            int r2 = r2 * 3
            int r2 = r2 / 4
            int r5 = r5.getBottom()
            if (r5 <= 0) goto L2d
            if (r5 > r2) goto L2d
            goto L14
        L2d:
            r5 = 0
        L2e:
            android.view.ViewParent r2 = r4.getParent()
            boolean r2 = r2 instanceof com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout
            if (r2 == 0) goto L41
            android.view.ViewParent r2 = r4.getParent()
            com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout r2 = (com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout) r2
            r3 = r5 ^ 1
            r2.b(r3)
        L41:
            boolean r2 = r4.j
            if (r2 == 0) goto L48
            if (r5 != 0) goto L48
            goto L49
        L48:
            r0 = 0
        L49:
            r4.l(r0)
        L4c:
            r4.b = r5
            super.c(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout.c(boolean, boolean):void");
    }

    public final boolean d(boolean z) {
        if (!o()) {
            return false;
        }
        c(false, z);
        return true;
    }

    public MainCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new lzu(this);
    }

    public MainCollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new lzu(this);
    }
}
