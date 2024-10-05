package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.qp;
import defpackage.qq;
import defpackage.qt;
import defpackage.rg;
import defpackage.yk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, qp, rg {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private qq b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.rg
    public final void a(qq qqVar) {
        this.b = qqVar;
    }

    @Override // defpackage.qp
    public final boolean b(qt qtVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((qt) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        yk l = yk.l(context, attributeSet, a, i, 0);
        if (l.q(0)) {
            setBackgroundDrawable(l.h(0));
        }
        if (l.q(1)) {
            setDivider(l.h(1));
        }
        l.o();
    }
}
