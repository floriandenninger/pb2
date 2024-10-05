package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lvi implements gab {
    public final axpg a;
    public final RtlAwareViewPager b;
    public final ArrayList c;
    public final List d;
    private final axpg e;
    private final axpg f;
    private final lvg g;
    private int h = -1;
    private final ArrayList i;
    private lvh j;

    public lvi(axpg axpgVar, axpg axpgVar2, axpg axpgVar3, RtlAwareViewPager rtlAwareViewPager) {
        axpgVar.getClass();
        this.f = axpgVar;
        rtlAwareViewPager.getClass();
        this.b = rtlAwareViewPager;
        axpgVar2.getClass();
        this.a = axpgVar2;
        this.e = axpgVar3;
        this.i = new ArrayList(10);
        this.c = new ArrayList(10);
        ((ViewGroup) axpgVar3.get()).setVisibility(8);
        ((DefaultTabsBar) axpgVar2.get()).k = new lve(this);
        lvg lvgVar = new lvg(this);
        this.g = lvgVar;
        rtlAwareViewPager.k(lvgVar);
        rtlAwareViewPager.k = new lvf(this);
        this.d = new ArrayList();
    }

    private final void m(fzz fzzVar) {
        ((ViewGroup) this.e.get()).setVisibility(((DefaultTabsBar) this.a.get()).j() > 1 ? 0 : 8);
        final lvh lvhVar = new lvh();
        for (fyz fyzVar : fzzVar.b) {
            if (fyzVar.d()) {
                lvhVar.j((RecyclerView) fyzVar.a());
            } else {
                fyzVar.b(new fyy() { // from class: lvd
                    @Override // defpackage.fyy
                    public final void a(View view) {
                        lvh.this.j((RecyclerView) view);
                    }
                });
            }
        }
        this.c.add(fzzVar.a);
        this.i.add(lvhVar);
        this.g.m();
    }

    @Override // defpackage.gab
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.gab
    public final View b(int i, boolean z, CharSequence charSequence, fzz fzzVar) {
        View g = ((DefaultTabsBar) this.a.get()).g(i, z, charSequence);
        m(fzzVar);
        return g;
    }

    @Override // defpackage.gab
    public final View c(CharSequence charSequence, CharSequence charSequence2, boolean z, fzz fzzVar) {
        View h = ((DefaultTabsBar) this.a.get()).h(charSequence, charSequence2, z);
        m(fzzVar);
        return h;
    }

    @Override // defpackage.gab
    public final View d(int i) {
        return ((DefaultTabsBar) this.a.get()).k(i);
    }

    @Override // defpackage.gab
    public final void e(gaa gaaVar) {
        this.d.add(gaaVar);
    }

    @Override // defpackage.gab
    public final void f() {
        this.c.clear();
        this.g.m();
        this.i.clear();
        this.j = null;
    }

    @Override // defpackage.gab
    public final void g(gaa gaaVar) {
        this.d.remove(gaaVar);
    }

    @Override // defpackage.gab
    public final void h() {
        lvh lvhVar = this.j;
        if (lvhVar != null) {
            Iterator it = lvhVar.a.iterator();
            while (it.hasNext()) {
                ((RecyclerView) it.next()).ak(0);
            }
            ((fzb) this.f.get()).n();
        }
    }

    @Override // defpackage.gab
    public final boolean i() {
        lvh lvhVar = this.j;
        if (lvhVar == null) {
            return false;
        }
        for (RecyclerView recyclerView : lvhVar.a) {
            if (recyclerView.computeVerticalScrollOffset() > 0 && !recyclerView.n.bf()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gab
    public final void j() {
        ((fzb) this.f.get()).n();
    }

    @Override // defpackage.gab
    public final void k(int i) {
        if (i < 0 || i >= ((DefaultTabsBar) this.a.get()).j()) {
            return;
        }
        if (i == this.b.a()) {
            l(i, true);
        }
        this.b.m(i, false);
    }

    public final void l(int i, boolean z) {
        int i2 = this.h;
        if (i2 != -1) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                if (!((gaa) it.next()).oW(i2)) {
                    it.remove();
                }
            }
        }
        ((DefaultTabsBar) this.a.get()).m(i, false);
        this.h = i;
        this.j = (lvh) this.i.get(i);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((gaa) it2.next()).b(i, z);
        }
    }
}
