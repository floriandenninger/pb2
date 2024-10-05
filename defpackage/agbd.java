package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbd implements agbr {
    private final Context a;
    private final atog b;
    private final Intent c;
    private final Intent d;
    private final Intent e;
    private final ammv f;

    public agbd(Context context, aaea aaeaVar, ammv ammvVar, Intent intent, Intent intent2, Intent intent3) {
        this.a = context;
        this.f = ammvVar;
        this.c = intent;
        this.d = intent2;
        this.e = intent3;
        this.b = aear.A(aaeaVar);
    }

    private final void b(ayrn ayrnVar, ayro ayroVar, apeo apeoVar, apen apenVar, String str, agbs agbsVar, Intent intent, acra acraVar, dy dyVar) {
        int i;
        aqyg aqygVar;
        try {
            Intent intent2 = new Intent(intent);
            aear.L(intent2, agbsVar);
            if ((apenVar.b & 8) != 0) {
                apxf apxfVar = apenVar.f;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aear.O(intent2, apxfVar);
            }
            if ((apeoVar.b & 32768) != 0) {
                aear.R(intent2, ((acqq) acraVar).g);
                intent2.putExtra("interaction_type", 1);
            }
            if ((apeoVar.b & 64) != 0) {
                aovq aovqVar = apeoVar.o;
                if (aovqVar == null) {
                    aovqVar = aovq.a;
                }
                aear.T(intent2, aovqVar);
            }
            if (!str.isEmpty()) {
                aear.G(intent2, str, this.b);
            }
            ayrnVar.a(apenVar, intent2);
            PendingIntent pendingIntent = (PendingIntent) ayroVar.a(this.a, intent2);
            if ((apenVar.b & 1) != 0) {
                ajut ajutVar = (ajut) ((amna) this.f).a;
                arfs arfsVar = apenVar.c;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                i = ajutVar.a(b);
            } else {
                i = 0;
            }
            if ((apenVar.b & 2) != 0) {
                aqygVar = apenVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            dyVar.f(new dv(i, ajcq.b(aqygVar), pendingIntent));
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Exception while creating actions: ");
            sb.append(valueOf);
            zga.b(sb.toString());
        }
    }

    @Override // defpackage.agbr
    public final void a(final apeo apeoVar, final acra acraVar, agbs agbsVar, dy dyVar) {
        int i = 0;
        for (apen apenVar : apeoVar.k) {
            int i2 = i + 1;
            String str = (String) afzz.a.getOrDefault(Integer.valueOf(i), "");
            int i3 = apenVar.b;
            if ((i3 & 16) != 0) {
                b(opu.f, agbc.c, apeoVar, apenVar, str, agbsVar, this.c, acraVar, dyVar);
            } else if ((i3 & 32) != 0) {
                b(opu.e, agbc.a, apeoVar, apenVar, str, agbsVar, this.e, acraVar, dyVar);
            } else if ((i3 & 4) != 0) {
                b(new ayrn() { // from class: agbb
                    @Override // defpackage.ayrn
                    public final void a(Object obj, Object obj2) {
                        acra acraVar2 = acra.this;
                        apeo apeoVar2 = apeoVar;
                        Intent intent = (Intent) obj2;
                        apxf apxfVar = ((apen) obj).e;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aghv.k(intent, apxfVar, acraVar2, (apeoVar2.b & 32768) != 0);
                    }
                }, agbc.a, apeoVar, apenVar, str, agbsVar, this.d, acraVar, dyVar);
                i = i2;
            }
            i = i2;
        }
    }
}
