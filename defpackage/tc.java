package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tc implements AdapterView.OnItemClickListener {
    final /* synthetic */ tf a;

    public tc(tf tfVar) {
        this.a = tfVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            tf tfVar = this.a;
            tfVar.d.performItemClick(view, i, tfVar.b.getItemId(i));
        }
        this.a.k();
    }
}
