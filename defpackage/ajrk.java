package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrk {
    public final aahd a;
    public final ajrp b;
    public final ajro c;
    public final mi d;
    public final ajru e;
    public final ajrl f;

    public ajrk(final Context context, aahd aahdVar, ajrp ajrpVar, ajrl ajrlVar, ansv ansvVar, final eun eunVar, byte[] bArr, byte[] bArr2) {
        this.a = aahdVar;
        this.b = ajrpVar;
        this.f = ajrlVar;
        ajro ajroVar = new ajro(context);
        this.c = ajroVar;
        ajroVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ajri
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apxf apxfVar;
                ajrk ajrkVar = ajrk.this;
                apll a = ajrkVar.b.a();
                if (z) {
                    apxfVar = a.g;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = a.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                }
                ajrn.a(apxfVar, ajrkVar);
            }
        });
        mh mhVar = new mh(context);
        mhVar.c(true);
        mhVar.p(ajroVar);
        mhVar.h(R.string.cancel, hgs.l);
        mhVar.k(R.string.ok, new DialogInterface.OnClickListener() { // from class: ajrf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ajrk ajrkVar = ajrk.this;
                ajrl ajrlVar2 = ajrkVar.f;
                atsu a = ajrkVar.e.a();
                boolean isChecked = ajrkVar.c.e.isChecked();
                ajrn ajrnVar = ajrlVar2.b;
                Object obj = ajrlVar2.a;
                if (a == null) {
                    return;
                }
                ajrkVar.d(false);
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", Boolean.valueOf(isChecked));
                if (obj != null) {
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                }
                atsw atswVar = a.e;
                if (atswVar == null) {
                    atswVar = atsw.a;
                }
                if ((atswVar.b & 1) == 0 || isChecked) {
                    ajrnVar.b(a, hashMap);
                    return;
                }
                atsw atswVar2 = a.e;
                if (atswVar2 == null) {
                    atswVar2 = atsw.a;
                }
                aqdt aqdtVar = atswVar2.c;
                if (aqdtVar == null) {
                    aqdtVar = aqdt.a;
                }
                aqdt aqdtVar2 = aqdtVar;
                ajdf.p(ajrnVar.a, aqdtVar2, ajrnVar.b, ajrnVar.c, null, new ajrm(ajrnVar, aqdtVar2, a, hashMap), obj);
            }
        });
        mi b = mhVar.b();
        this.d = b;
        final byte[] bArr3 = null;
        b.setOnShowListener(new DialogInterface.OnShowListener(context, eunVar, bArr3) { // from class: ajrh
            public final /* synthetic */ Context b;
            public final /* synthetic */ eun c;

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ajrk ajrkVar = ajrk.this;
                Context context2 = this.b;
                eun eunVar2 = this.c;
                ajrkVar.d.b(-2).setTextColor(wbs.Q(context2, R.attr.ytCallToAction));
                ajrkVar.d.b(-1).setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{wbs.Q(context2, R.attr.ytTextDisabled), wbs.Q(context2, R.attr.ytCallToAction)}));
                eunVar2.a = true;
            }
        });
        b.setOnCancelListener(new DialogInterface.OnCancelListener(bArr3) { // from class: ajre
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                eun.this.a = false;
            }
        });
        b.setOnDismissListener(new DialogInterface.OnDismissListener(bArr3) { // from class: ajrg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                eun.this.a = false;
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(wbs.Q(context, R.attr.ytBrandBackgroundSolid));
        gradientDrawable.setStroke(1, wbs.Q(context, R.attr.ytVerifiedBadgeBackground));
        b.getWindow().setBackgroundDrawable(gradientDrawable);
        b.getWindow().getDecorView().setPadding(1, 1, 1, 1);
        ajru ajruVar = new ajru(context, ansvVar, null);
        this.e = ajruVar;
        ajruVar.registerDataSetObserver(new ajrj(this));
    }

    public final void a() {
        ajro ajroVar = this.c;
        ajroVar.d.setVisibility(8);
        ajroVar.e.setChecked(false);
        ajroVar.e.setVisibility(8);
        ajroVar.f.setVisibility(8);
    }

    public final void b() {
        e();
        d(false);
        a();
    }

    public final void c(apmg apmgVar) {
        aqyg aqygVar;
        if (apmgVar != null) {
            Button b = this.d.b(-1);
            if ((apmgVar.b & 256) != 0) {
                aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            b.setText(ajcq.b(aqygVar));
        }
    }

    public final void d(boolean z) {
        this.d.b(-1).setEnabled(z);
    }

    public final void e() {
        apmg apmgVar;
        ajrp ajrpVar = this.b;
        apmh apmhVar = ajrpVar.a.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar2 = null;
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = ajrpVar.a.f;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        apmh apmhVar3 = ajrpVar.b.e;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        if ((apmhVar3.b & 1) != 0) {
            apmh apmhVar4 = ajrpVar.b.e;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmgVar2 = apmhVar4.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
        }
        c((apmg) amkq.Z(apmgVar, apmgVar2));
    }
}
