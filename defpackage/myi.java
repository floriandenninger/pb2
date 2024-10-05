package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myi implements mzc {
    public final aahd a;
    public final acra b;
    public final aqzc c;
    public final aqym d;
    public final boolean e;
    public boolean f = false;
    private final Context g;
    private final View h;
    private final View i;
    private final YouTubeTextView j;
    private final TextView k;
    private final TextView l;
    private final CheckBox m;
    private final YouTubeTextView n;
    private final boolean o;

    public myi(Context context, aahd aahdVar, acra acraVar, ViewGroup viewGroup, aqzc aqzcVar, aqym aqymVar, aaea aaeaVar) {
        this.a = aahdVar;
        this.b = acraVar;
        this.g = context;
        this.c = aqzcVar;
        this.d = aqymVar;
        this.o = wbs.m(aaeaVar);
        this.e = wbs.u(aaeaVar);
        View inflate = LayoutInflater.from(context).inflate(true != i() ? R.layout.formfill_checkbox_input : R.layout.formfill_checkbox_input_red_error_text_below, viewGroup, false);
        this.h = inflate;
        this.i = inflate.findViewById(R.id.background);
        this.j = (YouTubeTextView) inflate.findViewById(R.id.helper_text);
        this.k = (TextView) inflate.findViewById(R.id.error_text);
        this.l = (TextView) inflate.findViewById(R.id.header);
        this.m = (CheckBox) inflate.findViewById(R.id.checkbox);
        this.n = (YouTubeTextView) inflate.findViewById(R.id.label);
    }

    @Override // defpackage.mzc
    public final View a() {
        return this.h;
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
        if (this.l != null && i()) {
            TextView textView = this.l;
            aqyg aqygVar = this.d.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar));
        }
        YouTubeTextView youTubeTextView = this.j;
        aqyg aqygVar2 = this.d.f;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(youTubeTextView, aahk.a(aqygVar2, this.a, false));
        YouTubeTextView youTubeTextView2 = this.n;
        aqyg aqygVar3 = this.d.e;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        youTubeTextView2.setText(aahk.a(aqygVar3, this.a, false));
        aqyg aqygVar4 = this.d.e;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        adyu.cd(aqygVar4, this.b);
        this.m.setChecked(this.d.c);
        this.b.u(new acqx(this.d.l), null);
        this.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: myh
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                myi myiVar = myi.this;
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = ashk.a.createBuilder();
                int i = true != z ? 3 : 2;
                createBuilder2.copyOnWrite();
                ashk ashkVar = (ashk) createBuilder2.instance;
                ashkVar.c = i - 1;
                ashkVar.b |= 1;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashk ashkVar2 = (ashk) createBuilder2.build();
                ashkVar2.getClass();
                ashtVar.m = ashkVar2;
                ashtVar.b |= 32768;
                myiVar.b.I(3, new acqx(myiVar.d.l), (asht) createBuilder.build());
                if (!myiVar.f) {
                    aahd aahdVar = myiVar.a;
                    apxf apxfVar = myiVar.c.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                    myiVar.f = true;
                }
                if (myiVar.i() && !myiVar.e) {
                    myiVar.g(false);
                }
                if (myiVar.e) {
                    mzb e = myiVar.e(myiVar.c.e);
                    myiVar.g(!e.a);
                    if (e.a) {
                        return;
                    }
                    nac.b(myiVar.b, new acqx(myiVar.d.l), e.c);
                }
            }
        });
        return this.h;
    }

    @Override // defpackage.mzc
    public final mzb e(boolean z) {
        ashb ashbVar = null;
        if (!this.d.d || this.m.isChecked()) {
            return mzb.a(true, null, null);
        }
        apxf apxfVar = this.d.j;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aqym aqymVar = this.d;
        if ((aqymVar.b & 256) != 0 && (ashbVar = aqymVar.k) == null) {
            ashbVar = ashb.a;
        }
        return mzb.a(false, apxfVar, ashbVar);
    }

    @Override // defpackage.mzc
    public final String f() {
        return true != this.m.isChecked() ? "" : "checked";
    }

    @Override // defpackage.mzc
    public final void g(boolean z) {
        if (i()) {
            if (z) {
                aqym aqymVar = this.d;
                if ((aqymVar.b & 16) != 0) {
                    TextView textView = this.k;
                    aqyg aqygVar = aqymVar.g;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    whu.G(textView, ajcq.b(aqygVar));
                }
                zev.c(this.g, this.h, this.k.getText());
                this.m.setButtonTintList(wbs.S(this.g, R.attr.adsCheckboxError));
                return;
            }
            this.k.setVisibility(4);
            this.m.setButtonTintList(this.o ? wbs.S(this.g, R.attr.ytTextPrimary) : null);
            return;
        }
        if (z) {
            aqym aqymVar2 = this.d;
            if ((aqymVar2.b & 16) != 0) {
                YouTubeTextView youTubeTextView = this.j;
                aqyg aqygVar2 = aqymVar2.g;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                whu.G(youTubeTextView, ajcq.b(aqygVar2));
            }
            zev.c(this.g, this.h, this.j.getText());
            View view = this.i;
            if (view != null) {
                view.setBackgroundColor(wbs.Q(this.g, true != this.o ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
                return;
            }
            return;
        }
        YouTubeTextView youTubeTextView2 = this.j;
        aqyg aqygVar3 = this.d.f;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(youTubeTextView2, ajcq.b(aqygVar3));
        View view2 = this.i;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
    }

    @Override // defpackage.mzc
    public final boolean h() {
        aqym aqymVar = this.d;
        return this.m.isChecked() != ((aqymVar.b & 1) != 0 && aqymVar.c);
    }

    public final boolean i() {
        int aN = aocz.aN(this.d.i);
        return aN != 0 && aN == 2;
    }
}
