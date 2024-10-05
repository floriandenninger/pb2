package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lfg implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ awcx a;
    final /* synthetic */ lfi b;

    public lfg(lfi lfiVar, awcx awcxVar) {
        this.b = lfiVar;
        this.a = awcxVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str;
        whu.G(this.b.c, ajcq.b((aqyg) this.a.e.get(i)));
        this.b.b.d(new lda(i));
        Spinner spinner = this.b.d;
        aqyg aqygVar = (aqyg) this.a.d.get(i);
        aqyh aqyhVar = aqygVar.f;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        if ((aqyhVar.b & 1) != 0) {
            aqyh aqyhVar2 = aqygVar.f;
            if (aqyhVar2 == null) {
                aqyhVar2 = aqyh.a;
            }
            aots aotsVar = aqyhVar2.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            str = aotsVar.c;
        } else {
            str = null;
        }
        spinner.setContentDescription(str);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
