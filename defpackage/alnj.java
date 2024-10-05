package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alnj implements AdapterView.OnItemClickListener {
    final /* synthetic */ alnk a;

    public alnj(alnk alnkVar) {
        this.a = alnkVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        if (i < 0) {
            vh vhVar = this.a.a;
            item = !vhVar.u() ? null : vhVar.e.getSelectedItem();
        } else {
            item = this.a.getAdapter().getItem(i);
        }
        this.a.a(item);
        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                vh vhVar2 = this.a.a;
                view = vhVar2.u() ? vhVar2.e.getSelectedView() : null;
                i = this.a.a.o();
                vh vhVar3 = this.a.a;
                j = !vhVar3.u() ? Long.MIN_VALUE : vhVar3.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.a.a.e, view, i, j);
        }
        this.a.a.k();
    }
}
