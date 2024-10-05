package com.google.android.apps.youtube.app.common.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import defpackage.afsi;
import defpackage.ajxc;
import defpackage.fyk;
import defpackage.we;
import defpackage.wk;
import defpackage.ws;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScrollToTopLinearLayoutManager extends OverScrollLinearLayoutManager implements ajxc {
    public int b;
    public boolean c = true;

    @Override // defpackage.wd
    public final void aM(RecyclerView recyclerView) {
        this.b = 0;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final boolean ae() {
        return this.c && super.ae();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void ao(RecyclerView recyclerView, int i) {
        c(recyclerView, i, 0);
    }

    @Override // defpackage.ajxc
    public final void c(RecyclerView recyclerView, int i, int i2) {
        fyk fykVar = new fyk(this, recyclerView.getContext(), Math.abs(i - I()) <= 2, i2);
        fykVar.b = i;
        bd(fykVar);
    }

    @Override // com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager, android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final int e(int i, wk wkVar, ws wsVar) {
        int e = super.e(i, wkVar, wsVar);
        this.b += e;
        return e;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void n(wk wkVar, ws wsVar) {
        try {
            super.n(wkVar, wsVar);
        } catch (ClassCastException e) {
            View aA = aA();
            if (aA == null || aA.getLayoutParams() == null || (aA.getLayoutParams() instanceof we)) {
                throw e;
            }
            String valueOf = String.valueOf(aA);
            String name = aA.getLayoutParams().getClass().getName();
            String valueOf2 = String.valueOf(aA.getParent());
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(name).length() + String.valueOf(valueOf2).length());
            sb.append("UnsafeLayoutParams.\nFOCUSED VIEW: ");
            sb.append(valueOf);
            sb.append(" LayoutParams:");
            sb.append(name);
            sb.append("\nPARENT  VIEW: ");
            sb.append(valueOf2);
            sb.append("\n");
            boolean d = afsi.d(2, 25, sb.toString(), e, 0.05000000074505806d);
            if (!(aA.getParent() instanceof ViewGroup)) {
                throw e;
            }
            ((ViewGroup) aA.getParent()).clearFocus();
            try {
                super.n(wkVar, wsVar);
            } catch (ClassCastException e2) {
                if (d) {
                    afsi.c(2, 25, "UnsafeLayoutParams clear focus and retry layout failed.\n", e2);
                }
                throw e2;
            }
        }
    }
}
