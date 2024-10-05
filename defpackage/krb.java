package defpackage;

import android.view.View;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class krb implements View.OnClickListener {
    final /* synthetic */ krd a;

    public krb(krd krdVar) {
        this.a = krdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        apmg apmgVar;
        krd krdVar = this.a;
        if (krdVar.s == null || (obj = krdVar.r) == null) {
            return;
        }
        if (krdVar.v == 4) {
            apfl apflVar = ((apfm) obj).d;
            if (apflVar == null) {
                apflVar = apfl.a;
            }
            apmh apmhVar = apflVar.c;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apfk apfkVar = ((apfm) obj).e;
            if (apfkVar == null) {
                apfkVar = apfk.a;
            }
            apmh apmhVar2 = apfkVar.b;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        }
        if (apmgVar == null || (apmgVar.b & 16384) == 0) {
            return;
        }
        woq woqVar = this.a.s;
        apxf apxfVar = apmgVar.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        woqVar.qx(apmgVar, Collections.singletonList(apxfVar));
    }
}
