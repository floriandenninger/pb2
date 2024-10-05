package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajoa extends BaseAdapter implements ajoo, ajnf {
    private final ajos b;
    private final HashSet d;
    private final Map c = new WeakHashMap();
    public final ajmw a = new ajmw();
    private ajng e = ajnl.a;

    public ajoa(aoae aoaeVar, ajos ajosVar, byte[] bArr) {
        this.b = ajosVar;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        hashSet.add(new ajow(aoaeVar, 1, null));
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.ajoo
    public final void g(ajon ajonVar) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.a();
    }

    @Override // android.widget.Adapter, defpackage.ajoo
    public final Object getItem(int i) {
        return this.e.c(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.e.b(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int c = this.b.c(getItem(i));
        if (c != -1) {
            return c + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ajom q;
        Object item = getItem(i);
        if (j(i)) {
            view = (View) this.c.get(item);
        }
        if (view == null) {
            int c = this.b.c(item);
            if (c != -1) {
                q = this.b.e(c, viewGroup);
            } else {
                q = new ajnm(viewGroup.getContext());
            }
            View a = q.a();
            ahbw.x(a, q, c);
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams != null && !(layoutParams instanceof AbsListView.LayoutParams)) {
                a.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
            }
            view = q.a();
        } else {
            q = ahbw.q(view);
        }
        View a2 = q.a();
        ajok p = a2 != null ? ahbw.p(a2) : null;
        if (p == null) {
            p = new ajok();
            ahbw.v(a2, p);
        }
        p.h();
        p.f("position", Integer.valueOf(i));
        this.a.a(p, this.e, i);
        this.e.mL(p, i);
        q.oB(p, item);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ajon) it.next()).o(q, item);
        }
        if (j(i)) {
            this.c.put(item, view);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.b.d() + 1;
    }

    @Override // defpackage.ajoo
    public final void h(ajng ajngVar) {
        ajngVar.getClass();
        this.e.pf(this);
        this.e = ajngVar;
        ajngVar.lX(this);
        notifyDataSetChanged();
    }

    @Override // defpackage.ajoo
    public final void i(ajon ajonVar) {
        throw null;
    }

    protected final boolean j(int i) {
        return getItemViewType(i) == -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.c.clear();
    }

    @Override // defpackage.ajnf
    public final void pc() {
        notifyDataSetChanged();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.ajoo
    public final void rU(ajol ajolVar) {
        throw null;
    }
}
