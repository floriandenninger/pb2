package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvt implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ kvw a;

    public kvt(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object selectedItem = adapterView.getSelectedItem();
        if (selectedItem instanceof aqpg) {
            aqpg aqpgVar = (aqpg) selectedItem;
            if ((aqpgVar.b & 8192) != 0) {
                aahd aahdVar = this.a.a;
                apxf apxfVar = aqpgVar.j;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
            if ((aqpgVar.b & 8192) != 0) {
                int bu = anaf.bu(aqpgVar.c == 6 ? ((Integer) aqpgVar.d).intValue() : 0);
                if (bu == 2 || bu == 3) {
                    this.a.c(1);
                }
            }
        }
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.a.c;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
