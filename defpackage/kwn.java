package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kwn implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ kwq a;

    public kwn(kwq kwqVar) {
        this.a = kwqVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (!(itemAtPosition instanceof aqpg) || (((aqpg) itemAtPosition).b & 8192) == 0) {
            return;
        }
        this.a.dismiss();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
