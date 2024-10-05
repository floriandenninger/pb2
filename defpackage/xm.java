package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xm implements AdapterView.OnItemClickListener {
    final /* synthetic */ SearchView a;

    public xm(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.onItemClicked(i, 0, null);
    }
}
