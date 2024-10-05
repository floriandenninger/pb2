package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class myr implements AdapterView.OnItemSelectedListener, mzc {
    public final acra a;
    public final aqys b;
    private final Context c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final Spinner g;
    private final aahd h;
    private final aqzc i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private int m = 0;
    private int n = 0;
    private boolean o = false;

    public myr(Context context, aahd aahdVar, acra acraVar, ViewGroup viewGroup, aqzc aqzcVar, aqys aqysVar, aaea aaeaVar) {
        this.h = aahdVar;
        this.a = acraVar;
        this.c = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_dropdown_input, viewGroup, false);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.label);
        this.f = (TextView) inflate.findViewById(R.id.helper_text);
        this.g = (Spinner) inflate.findViewById(R.id.spinner);
        this.i = aqzcVar;
        this.b = aqysVar;
        this.j = wbs.m(aaeaVar);
        this.k = wbs.u(aaeaVar);
        this.l = wbs.t(aaeaVar);
    }

    @Override // defpackage.mzc
    public final View a() {
        return this.d;
    }

    @Override // defpackage.mzc
    public final asgz b(asgz asgzVar) {
        return asgzVar;
    }

    @Override // defpackage.mzc
    public final ashq c(ashq ashqVar) {
        return ashqVar;
    }

    @Override // defpackage.mzc
    public final View d() {
        this.g.setOnTouchListener(new View.OnTouchListener() { // from class: myq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                myr myrVar = myr.this;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                myrVar.a.I(3, new acqx(myrVar.b.i), null);
                return false;
            }
        });
        TextView textView = this.e;
        aqyg aqygVar = this.b.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.f;
        aqyg aqygVar2 = this.b.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        myp mypVar = new myp(this.g.getContext());
        mypVar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        for (int i = 0; i < this.b.d.size(); i++) {
            aqyr aqyrVar = (aqyr) this.b.d.get(i);
            mypVar.add(aqyrVar);
            if (aqyrVar.d) {
                this.n = i;
            }
        }
        this.g.setAdapter((SpinnerAdapter) mypVar);
        Spinner spinner = this.g;
        aqyg aqygVar3 = this.b.c;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        spinner.setPrompt(ajcq.b(aqygVar3));
        if (this.l) {
            this.g.setSelection(this.n, false);
            this.m = this.n;
        } else {
            int i2 = this.n;
            if (i2 > 0) {
                this.g.setSelection(i2);
                this.m = this.n;
            }
        }
        this.g.setOnItemSelectedListener(this);
        this.a.u(new acqx(this.b.i), null);
        return this.d;
    }

    @Override // defpackage.mzc
    public final mzb e(boolean z) {
        aqys aqysVar = this.b;
        if (!((aqyr) aqysVar.d.get(this.m)).e) {
            return mzb.a(true, null, null);
        }
        apxf apxfVar = this.b.g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ashb ashbVar = this.b.h;
        if (ashbVar == null) {
            ashbVar = ashb.a;
        }
        return mzb.a(false, apxfVar, ashbVar);
    }

    @Override // defpackage.mzc
    public final String f() {
        aqys aqysVar = this.b;
        return ((aqyr) aqysVar.d.get(this.m)).b;
    }

    @Override // defpackage.mzc
    public final void g(boolean z) {
        if (z) {
            if (this.j) {
                this.e.setTextColor(wbs.Q(this.c, R.attr.ytErrorIndicator));
                this.g.setBackground(aii.a(this.c, R.drawable.ad_spinner_textfield_error_background_material));
            }
            if ((this.b.b & 4) != 0) {
                if (this.j) {
                    this.f.setTextColor(wbs.Q(this.c, R.attr.ytErrorIndicator));
                }
                TextView textView = this.f;
                aqyg aqygVar = this.b.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                whu.G(textView, ajcq.b(aqygVar));
            }
            this.d.setBackgroundColor(wbs.Q(this.c, true != this.j ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
            return;
        }
        TextView textView2 = this.f;
        aqyg aqygVar2 = this.b.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        this.d.setBackgroundColor(0);
        if (this.j) {
            this.e.setTextColor(wbs.Q(this.c, R.attr.adText2));
            this.f.setTextColor(wbs.Q(this.c, R.attr.adText2));
            this.g.setBackground(aii.a(this.c, R.drawable.ad_spinner_textfield_background_material));
        }
    }

    @Override // defpackage.mzc
    public final boolean h() {
        return this.m != this.n;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.m = i;
        if (!this.o) {
            aahd aahdVar = this.h;
            apxf apxfVar = this.i.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            this.o = true;
        }
        if (this.k) {
            mzb e = e(this.i.e);
            g(true ^ e.a);
            if (e.a) {
                return;
            }
            nac.b(this.a, new acqx(this.b.i), e.c);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
