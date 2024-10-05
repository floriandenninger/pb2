package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class naa extends myg implements AdapterView.OnItemSelectedListener, mzc {
    private final aqys m;
    private final boolean n;
    private final boolean o;

    public naa(Context context, aahd aahdVar, acra acraVar, ViewGroup viewGroup, aqzc aqzcVar, aqys aqysVar, aaea aaeaVar) {
        super(context, aahdVar, acraVar, viewGroup, aqzcVar, aaeaVar);
        this.m = aqysVar;
        this.n = wbs.u(aaeaVar);
        this.o = wbs.t(aaeaVar);
    }

    @Override // defpackage.mzc
    public final View d() {
        oG(this.m.i);
        oJ(this.m.i);
        aqyg aqygVar = this.m.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        oI(aqygVar);
        TextView textView = this.d;
        aqyg aqygVar2 = this.m.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar2));
        mzz mzzVar = new mzz(this.e.getContext());
        mzzVar.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        for (int i = 0; i < this.m.d.size(); i++) {
            aqyr aqyrVar = (aqyr) this.m.d.get(i);
            mzzVar.add(aqyrVar);
            if (aqyrVar.d) {
                this.k = i;
            }
        }
        this.e.setAdapter((SpinnerAdapter) mzzVar);
        Spinner spinner = this.e;
        aqyg aqygVar3 = this.m.c;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        spinner.setPrompt(ajcq.b(aqygVar3));
        if (this.o) {
            this.e.setSelection(this.k, false);
            this.j = this.k;
        } else {
            int i2 = this.k;
            if (i2 > 0) {
                this.e.setSelection(i2);
                this.j = this.k;
            }
        }
        this.e.setOnItemSelectedListener(this);
        return this.b;
    }

    @Override // defpackage.mzc
    public final mzb e(boolean z) {
        aqys aqysVar = this.m;
        boolean z2 = ((aqyr) aqysVar.d.get(this.j)).e;
        apxf apxfVar = this.m.g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ashb ashbVar = this.m.h;
        if (ashbVar == null) {
            ashbVar = ashb.a;
        }
        return j(z2, apxfVar, ashbVar);
    }

    @Override // defpackage.mzc
    public final String f() {
        aqys aqysVar = this.m;
        return ((aqyr) aqysVar.d.get(this.j)).b;
    }

    @Override // defpackage.mzc
    public final void g(boolean z) {
        aqys aqysVar = this.m;
        boolean z2 = (aqysVar.b & 4) != 0;
        aqyg aqygVar = aqysVar.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aqyg aqygVar2 = this.m.e;
        i(z, z2, aqygVar);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        oH(i);
        if (this.n) {
            mzb e = e(this.h.e);
            g(!e.a);
            if (e.a) {
                return;
            }
            nac.b(this.g, new acqx(this.m.i), e.c);
        }
    }
}
