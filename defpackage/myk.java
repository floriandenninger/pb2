package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myk extends myg implements AdapterView.OnItemSelectedListener, mzc {
    public final aqyo m;
    public myk n;
    public myk o;
    private final List p;
    private final boolean q;
    private final boolean r;

    public myk(Context context, aahd aahdVar, acra acraVar, ViewGroup viewGroup, aqzc aqzcVar, aqyo aqyoVar, aaea aaeaVar) {
        super(context, aahdVar, acraVar, viewGroup, aqzcVar, aaeaVar);
        this.m = aqyoVar;
        this.n = null;
        this.o = null;
        this.p = new ArrayList();
        this.q = wbs.u(aaeaVar);
        this.r = wbs.t(aaeaVar);
    }

    private final void l(int i) {
        if (i == 0) {
            myk mykVar = this.n;
            if (mykVar != null) {
                mykVar.k("", false);
                return;
            }
            i = 0;
        }
        if (!m(i) || this.n == null) {
            return;
        }
        this.n.k(!m(i) ? null : (String) this.p.get(i), true);
    }

    private final boolean m(int i) {
        return i >= 0 && i < this.p.size();
    }

    @Override // defpackage.mzc
    public final View d() {
        oG(this.m.k);
        oJ(this.m.k);
        aqyg aqygVar = this.m.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        oI(aqygVar);
        return k("", this.o == null);
    }

    @Override // defpackage.mzc
    public final mzb e(boolean z) {
        boolean z2 = this.j == 0;
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
        return (String) this.p.get(this.j);
    }

    @Override // defpackage.mzc
    public final void g(boolean z) {
        aqyo aqyoVar = this.m;
        boolean z2 = (aqyoVar.b & 4) != 0;
        aqyg aqygVar = aqyoVar.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aqyg aqygVar2 = this.m.e;
        i(z, z2, aqygVar);
    }

    public final View k(String str, boolean z) {
        this.e.setEnabled(z);
        if (z) {
            this.c.setTextColor(wbs.Q(this.a, R.attr.adText2));
            this.d.setTextColor(wbs.Q(this.a, R.attr.adText2));
            TextView textView = this.d;
            aqyg aqygVar = this.m.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.H(textView, ajcq.b(aqygVar), 8);
            this.e.setBackground(aii.a(this.a, R.drawable.ad_spinner_textfield_background_material));
        } else {
            this.c.setTextColor(wbs.Q(this.a, R.attr.ytTextSecondaryInverse));
            this.d.setTextColor(wbs.Q(this.a, R.attr.ytTextSecondaryInverse));
            TextView textView2 = this.d;
            aqyg aqygVar2 = this.m.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            whu.H(textView2, ajcq.b(aqygVar2), 0);
            this.e.setBackground(aii.a(this.a, R.drawable.ad_spinner_textfield_disabled_background_material));
        }
        myj myjVar = new myj(this.e.getContext(), !this.e.isEnabled());
        myjVar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.p.clear();
        for (int i = 0; i < this.m.d.size(); i++) {
            aqyn aqynVar = (aqyn) this.m.d.get(i);
            if (i == 0 || TextUtils.isEmpty(str) || (!TextUtils.isEmpty(str) && str.equals(aqynVar.e))) {
                myjVar.add(aqynVar);
                this.p.add(aqynVar.b);
            }
        }
        this.k = 0;
        if (this.r) {
            this.e.setOnItemSelectedListener(null);
        }
        this.e.setAdapter((SpinnerAdapter) myjVar);
        Spinner spinner = this.e;
        aqyg aqygVar3 = this.m.c;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        spinner.setPrompt(ajcq.b(aqygVar3));
        int i2 = this.k;
        this.j = i2;
        if (this.r) {
            this.e.setSelection(i2, false);
        }
        this.e.setOnItemSelectedListener(this);
        l(this.j);
        return this.b;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        oH(i);
        l(i);
        if (this.q) {
            mzb e = e(this.h.e);
            g(!e.a);
            if (e.a) {
                return;
            }
            nac.b(this.g, new acqx(this.m.k), e.c);
        }
    }
}
