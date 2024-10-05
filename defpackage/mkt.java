package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkt implements ajom {
    public final keg a;
    public acra b;
    public apmp c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final CompoundButton g;
    private final ahfc h;
    private final int i;
    private CharSequence j;
    private CharSequence k;

    public mkt(Context context, final keg kegVar) {
        this.a = kegVar;
        View inflate = View.inflate(context, R.layout.autonav_toggle, null);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.autonav_title);
        this.f = (TextView) inflate.findViewById(R.id.autonav_toggle_title);
        this.h = new ahfc() { // from class: mks
            @Override // defpackage.ahfc
            public final void t(boolean z) {
                mkt mktVar = mkt.this;
                apmp apmpVar = mktVar.c;
                if ((apmpVar.b & 16777216) != 0) {
                    mktVar.b.I(3, new acqx(apmpVar.v), null);
                }
                mktVar.d(mktVar.a.g());
            }
        };
        CompoundButton compoundButton = (CompoundButton) inflate.findViewById(R.id.autonav_toggle);
        this.g = compoundButton;
        compoundButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mkr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton2, boolean z) {
                keg.this.e(z);
            }
        });
        this.i = inflate.getPaddingTop();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.f(this.h);
    }

    public final void d(boolean z) {
        this.g.setChecked(z);
        this.f.setText(z ? this.k : this.j);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apgv apgvVar = (apgv) obj;
        acra acraVar = ajokVar.a;
        acraVar.getClass();
        this.b = acraVar;
        TextView textView = this.e;
        aqyg aqygVar3 = null;
        if ((apgvVar.b & 1) != 0) {
            aqygVar = apgvVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        this.e.setVisibility(0);
        aulq aulqVar = apgvVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmp apmpVar = (apmp) aulqVar.pX(ButtonRendererOuterClass.toggleButtonRenderer);
        this.c = apmpVar;
        if ((apmpVar.b & 64) != 0) {
            aqygVar2 = apmpVar.h;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        this.j = ajcq.b(aqygVar2);
        apmp apmpVar2 = this.c;
        if ((apmpVar2.b & 4096) != 0 && (aqygVar3 = apmpVar2.n) == null) {
            aqygVar3 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar3);
        this.k = b;
        if (TextUtils.isEmpty(b)) {
            this.k = this.j;
        }
        this.a.d(this.h);
        d(this.a.g());
        int aU = anaf.aU(apgvVar.e);
        int i = (aU == 0 || aU != 2) ? this.i : 0;
        if (i != this.d.getPaddingTop()) {
            View view = this.d;
            view.setPaddingRelative(view.getPaddingStart(), i, this.d.getPaddingEnd(), this.d.getPaddingBottom());
        }
    }
}
