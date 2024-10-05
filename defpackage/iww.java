package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iww implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ixc a;

    public iww(ixc ixcVar) {
        this.a = ixcVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.s();
        Object selectedItem = adapterView.getSelectedItem();
        if (selectedItem instanceof aqpg) {
            ixc ixcVar = this.a;
            aqyg aqygVar = ((aqpg) selectedItem).l;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(ixcVar.aj, aahk.a(aqygVar, ixcVar.af, false));
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
