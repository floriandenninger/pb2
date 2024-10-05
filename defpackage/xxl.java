package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xxl implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ xxp a;

    public xxl(xxp xxpVar) {
        this.a = xxpVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        xwp xwpVar = this.a.am;
        xwpVar.a = xwpVar.getItem(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
