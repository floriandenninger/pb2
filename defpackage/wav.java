package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wav implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ wax b;

    public wav(wax waxVar, EditText editText) {
        this.b = waxVar;
        this.a = editText;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        aqyg aqygVar;
        if (adapterView.getSelectedItem() == waw.a) {
            return;
        }
        aqpe aqpeVar = (aqpe) adapterView.getSelectedItem();
        EditText editText = this.a;
        aqpg aqpgVar = aqpeVar.c;
        if (aqpgVar == null) {
            aqpgVar = aqpg.a;
        }
        if ((aqpgVar.b & 1) != 0) {
            aqpg aqpgVar2 = aqpeVar.c;
            if (aqpgVar2 == null) {
                aqpgVar2 = aqpg.a;
            }
            aqygVar = aqpgVar2.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        editText.setText(ajcq.b(aqygVar));
        wax waxVar = this.b;
        aqpg aqpgVar3 = aqpeVar.c;
        if (aqpgVar3 == null) {
            aqpgVar3 = aqpg.a;
        }
        waxVar.d = aqpgVar3.g;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
