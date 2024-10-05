package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vc implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ vh a;

    public vc(vh vhVar) {
        this.a = vhVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ug ugVar;
        if (i == -1 || (ugVar = this.a.e) == null) {
            return;
        }
        ugVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
