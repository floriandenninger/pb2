package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agye implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ ListAdapter b;
    final /* synthetic */ NonScrollableListView c;

    public agye(NonScrollableListView nonScrollableListView, int i, ListAdapter listAdapter) {
        this.c = nonScrollableListView;
        this.a = i;
        this.b = listAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AdapterView.OnItemClickListener onItemClickListener = this.c.c;
        if (onItemClickListener != null) {
            int i = this.a;
            onItemClickListener.onItemClick(null, view, i, this.b.getItemId(i));
        }
    }
}
