package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.ListAdapter;
import com.google.protos.youtube.api.innertube.ModifyReportFormCommandOuterClass$ModifyReportFormCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrn {
    public final Context a;
    public final aahd b;
    public final acra c;
    private final ansv d;
    private final eun e;

    public ajrn(Context context, aahd aahdVar, acra acraVar, ansv ansvVar, eun eunVar, byte[] bArr, byte[] bArr2) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = acraVar;
        this.d = ansvVar;
        this.e = eunVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(apxf apxfVar, ajrk ajrkVar) {
        if (apxfVar == null || !apxfVar.pY(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand)) {
            return;
        }
        int cg = anaf.cg(((ModifyReportFormCommandOuterClass$ModifyReportFormCommand) apxfVar.pX(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand)).b);
        if (cg == 0) {
            cg = 1;
        }
        if (cg == 4) {
            ajrkVar.e();
            return;
        }
        aqyg aqygVar = null;
        apmg apmgVar = null;
        if (cg == 5) {
            ajrp ajrpVar = ajrkVar.b;
            apmh apmhVar = ajrpVar.a.g;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((1 & apmhVar.b) != 0) {
                apmh apmhVar2 = ajrpVar.a.g;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmgVar = apmhVar2.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            }
            ajrkVar.c(apmgVar);
            return;
        }
        if (cg != 2) {
            if (cg == 3) {
                ajrkVar.a();
                return;
            }
            return;
        }
        apll a = ajrkVar.b.a();
        if (a != null) {
            ajro ajroVar = ajrkVar.c;
            if ((1 & a.b) != 0 && (aqygVar = a.c) == null) {
                aqygVar = aqyg.a;
            }
            Spanned a2 = aahk.a(aqygVar, ajrkVar.a, false);
            ajroVar.d.setVisibility(0);
            ajroVar.e.setContentDescription(a2);
            ajroVar.e.setVisibility(0);
            ajroVar.f.setText(a2);
            ajroVar.f.setVisibility(0);
        }
    }

    public final void b(atsu atsuVar, Map map) {
        if ((atsuVar.b & 32) != 0) {
            aahd aahdVar = this.b;
            apxf apxfVar = atsuVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, map);
        }
    }

    public final void c(aumb aumbVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        if (yjj.l(this.a).isFinishing()) {
            return;
        }
        ajrk ajrkVar = new ajrk(this.a, this.b, new ajrp(aumbVar), new ajrl(this, obj), this.d, this.e, null, null);
        if (ajrkVar.d.isShowing()) {
            return;
        }
        ajro ajroVar = ajrkVar.c;
        ajrp ajrpVar = ajrkVar.b;
        aumb aumbVar2 = ajrpVar.a;
        aqyg aqygVar3 = null;
        if ((aumbVar2.b & 2) != 0) {
            aqygVar = aumbVar2.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        atsx atsxVar = ajrpVar.b;
        if ((atsxVar.b & 1) != 0) {
            aqygVar2 = atsxVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        ajroVar.a.setText((Spanned) amkq.Z(b, ajcq.b(aqygVar2)));
        ajrkVar.c.b.setAdapter((ListAdapter) ajrkVar.e);
        ajrp ajrpVar2 = ajrkVar.b;
        aahd aahdVar = ajrkVar.a;
        aumb aumbVar3 = ajrpVar2.a;
        if ((aumbVar3.b & 8) != 0 && (aqygVar3 = aumbVar3.e) == null) {
            aqygVar3 = aqyg.a;
        }
        Spanned a = aahk.a(aqygVar3, aahdVar, false);
        if (a != null) {
            ajro ajroVar2 = ajrkVar.c;
            ajroVar2.c.setText(a);
            ajroVar2.c.setVisibility(0);
        }
        ajrkVar.e.setNotifyOnChange(false);
        ajrkVar.e.clear();
        ajrkVar.e.addAll(ajrkVar.b.b.c);
        ajrkVar.e.setNotifyOnChange(true);
        ajrkVar.d.show();
        ajrkVar.b();
    }
}
