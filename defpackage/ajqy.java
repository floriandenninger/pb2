package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajqy implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ajra a;
    private final Spinner b;
    private final String c;

    public ajqy(ajra ajraVar, Spinner spinner, String str) {
        this.a = ajraVar;
        this.b = spinner;
        this.c = str;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.a();
        aqpg aqpgVar = (aqpg) this.b.getSelectedItem();
        String str = this.c;
        if (str == null || aqpgVar == null || (aqpgVar.b & 512) == 0) {
            return;
        }
        Spinner spinner = this.b;
        aots aotsVar = aqpgVar.i;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        String str2 = aotsVar.c;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        spinner.setContentDescription(sb.toString());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.a.a();
    }
}
