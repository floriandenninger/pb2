package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydw implements afwx {
    final /* synthetic */ arpp a;
    final /* synthetic */ arpp b;
    final /* synthetic */ ydx c;

    public ydw(ydx ydxVar, arpp arppVar, arpp arppVar2) {
        this.c = ydxVar;
        this.a = arppVar;
        this.b = arppVar2;
    }

    private final void d() {
        arpp arppVar = this.b;
        if (arppVar != null) {
            this.c.g.c(arppVar);
        }
    }

    private final void e() {
        arpp arppVar = this.a;
        if (arppVar != null) {
            this.c.g.c(arppVar);
        }
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.c.f.dismiss();
        Iterator it = this.c.i.b.iterator();
        while (it.hasNext()) {
            ((yen) it.next()).a();
        }
        this.c.d.e(cnqVar);
        d();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        awhq awhqVar;
        aqdt aqdtVar;
        atcq atcqVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        asfu asfuVar = (asfu) obj;
        this.c.f.dismiss();
        aoae aoaeVar = this.c.i;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aoaeVar.b);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ((yen) arrayList.get(i2)).b();
        }
        this.c.h.m();
        if (asfuVar.e.size() != 0) {
            this.c.e.e(asfuVar.e, null);
        }
        if ((asfuVar.b & 2) == 0) {
            e();
            return;
        }
        asfs asfsVar = asfuVar.d;
        if (asfsVar == null) {
            asfsVar = asfs.a;
        }
        if (asfsVar.b == 96619486) {
            asfs asfsVar2 = asfuVar.d;
            if (asfsVar2 == null) {
                asfsVar2 = asfs.a;
            }
            if (asfsVar2.b == 96619486) {
                atcqVar = (atcq) asfsVar2.c;
            } else {
                atcqVar = atcq.a;
            }
            if ((atcqVar.b & 2) != 0) {
                ajut ajutVar = this.c.b;
                arfs arfsVar = atcqVar.d;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                i = ajutVar.a(b);
            }
            apmh apmhVar = atcqVar.f;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            final apmg apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.c.a);
            if ((atcqVar.b & 1) != 0) {
                aqygVar = atcqVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            AlertDialog.Builder message = builder.setTitle(ajcq.b(aqygVar)).setIcon(i).setMessage(ajcq.j(System.getProperty("line.separator"), ajcq.l(atcqVar.e)));
            if ((apmgVar.b & 256) != 0) {
                aqygVar2 = apmgVar.i;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            AlertDialog create = message.setPositiveButton(ajcq.b(aqygVar2), new DialogInterface.OnClickListener() { // from class: ydv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ydw.this.c.c.I(3, new acqx(apmgVar.t), null);
                }
            }).create();
            this.c.c.u(new acqx(atcqVar.g), null);
            this.c.c.u(new acqx(apmgVar.t), null);
            create.show();
            e();
            return;
        }
        asfs asfsVar3 = asfuVar.d;
        if (asfsVar3 == null) {
            asfsVar3 = asfs.a;
        }
        if (asfsVar3.b == 64099105) {
            asfs asfsVar4 = asfuVar.d;
            if (asfsVar4 == null) {
                asfsVar4 = asfs.a;
            }
            if (asfsVar4.b == 64099105) {
                aqdtVar = (aqdt) asfsVar4.c;
            } else {
                aqdtVar = aqdt.a;
            }
            ydx ydxVar = this.c;
            ajdf.n(ydxVar.a, aqdtVar, ydxVar.e, ydxVar.c, null);
            e();
            return;
        }
        asfs asfsVar5 = asfuVar.d;
        if (asfsVar5 == null) {
            asfsVar5 = asfs.a;
        }
        if (asfsVar5.b == 65500215) {
            zaw zawVar = this.c.d;
            asfs asfsVar6 = asfuVar.d;
            if (asfsVar6 == null) {
                asfsVar6 = asfs.a;
            }
            if (asfsVar6.b == 65500215) {
                awhqVar = (awhq) asfsVar6.c;
            } else {
                awhqVar = awhq.a;
            }
            zawVar.d(yjj.j(awhqVar).toString());
            d();
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
