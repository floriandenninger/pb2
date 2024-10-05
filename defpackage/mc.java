package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mc implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ mg b;
    final /* synthetic */ md c;

    public mc(md mdVar, AlertController$RecycleListView alertController$RecycleListView, mg mgVar) {
        this.c = mdVar;
        this.a = alertController$RecycleListView;
        this.b = mgVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.s;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.w.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
