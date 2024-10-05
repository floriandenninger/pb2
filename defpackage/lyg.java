package defpackage;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyg implements gab {
    private final DefaultTabsBar a;
    private final ViewGroup b;
    private final ViewGroup c;
    private final axpg d;
    private View e;
    private final List f;
    private lyf g;

    public lyg(axpg axpgVar, AppTabsBar appTabsBar, ConstraintLayout constraintLayout, ViewGroup viewGroup) {
        this.d = axpgVar;
        this.c = viewGroup;
        this.a = appTabsBar;
        this.b = constraintLayout;
        constraintLayout.setVisibility(8);
        this.f = new ArrayList();
    }

    private final void l(fzz fzzVar) {
        final lyf lyfVar = new lyf();
        for (fyz fyzVar : fzzVar.b) {
            if (fyzVar.d()) {
                lyfVar.j((RecyclerView) fyzVar.a());
            } else {
                fyzVar.b(new fyy() { // from class: lye
                    @Override // defpackage.fyy
                    public final void a(View view) {
                        lyf.this.j((RecyclerView) view);
                    }
                });
            }
        }
        View view = fzzVar.a;
        this.e = view;
        this.c.addView(view);
        this.g = lyfVar;
    }

    @Override // defpackage.gab
    public final int a() {
        return 0;
    }

    @Override // defpackage.gab
    public final View b(int i, boolean z, CharSequence charSequence, fzz fzzVar) {
        View g = this.a.g(i, z, charSequence);
        l(fzzVar);
        return g;
    }

    @Override // defpackage.gab
    public final View c(CharSequence charSequence, CharSequence charSequence2, boolean z, fzz fzzVar) {
        View h = this.a.h(charSequence, charSequence2, z);
        l(fzzVar);
        return h;
    }

    @Override // defpackage.gab
    public final View d(int i) {
        return this.a.k(i);
    }

    @Override // defpackage.gab
    public final void e(gaa gaaVar) {
        this.f.add(gaaVar);
    }

    @Override // defpackage.gab
    public final void f() {
        this.e = null;
        this.g = null;
    }

    @Override // defpackage.gab
    public final void g(gaa gaaVar) {
        this.f.remove(gaaVar);
    }

    @Override // defpackage.gab
    public final void h() {
        lyf lyfVar = this.g;
        if (lyfVar != null) {
            Iterator it = lyfVar.a.iterator();
            while (it.hasNext()) {
                ((RecyclerView) it.next()).ak(0);
            }
            ((fzb) this.d.get()).n();
        }
    }

    @Override // defpackage.gab
    public final boolean i() {
        lyf lyfVar = this.g;
        if (lyfVar == null) {
            return false;
        }
        for (RecyclerView recyclerView : lyfVar.a) {
            if (recyclerView.computeVerticalScrollOffset() > 0 && !recyclerView.n.bf()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gab
    public final void j() {
        ((fzb) this.d.get()).n();
    }

    @Override // defpackage.gab
    public final void k(int i) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((gaa) it.next()).b(i, true);
        }
    }
}
