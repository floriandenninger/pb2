package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mb implements AdapterView.OnItemClickListener {
    final /* synthetic */ mg a;
    final /* synthetic */ md b;

    public mb(md mdVar, mg mgVar) {
        this.b = mdVar;
        this.a = mgVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.q.onClick(this.a.b, i);
        if (this.b.u) {
            return;
        }
        this.a.b.dismiss();
    }
}
