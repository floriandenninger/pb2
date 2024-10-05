package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajrs implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ajrr a;
    final /* synthetic */ ajrt b;

    public ajrs(ajrt ajrtVar, ajrr ajrrVar) {
        this.b = ajrtVar;
        this.a = ajrrVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ajru ajruVar = this.b.e;
        ajrr ajrrVar = this.a;
        if (ajrrVar.a != i) {
            ajrrVar.a = i;
            ajruVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
