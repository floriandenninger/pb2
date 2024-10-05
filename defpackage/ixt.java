package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixt implements afwx {
    final /* synthetic */ ixu a;

    public ixt(ixu ixuVar) {
        this.a = ixuVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.aj.e(cnqVar);
        this.a.dismiss();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        awhq awhqVar;
        atcp atcpVar;
        avkt avktVar;
        final awgt awgtVar;
        aqdt aqdtVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        asga asgaVar = (asga) obj;
        final ixu ixuVar = this.a;
        ixuVar.ai.mM().D(new acqx(asgaVar.g));
        if (!asgaVar.f.isEmpty()) {
            ixuVar.af.b(asgaVar.f);
            ixuVar.dismiss();
            return;
        }
        if ((asgaVar.b & 2) != 0) {
            asfq asfqVar = asgaVar.d;
            if (asfqVar == null) {
                asfqVar = asfq.a;
            }
            aqyg aqygVar3 = null;
            if ((asfqVar.b & 128) != 0) {
                asfq asfqVar2 = asgaVar.d;
                if (asfqVar2 == null) {
                    asfqVar2 = asfq.a;
                }
                awhqVar = asfqVar2.e;
                if (awhqVar == null) {
                    awhqVar = awhq.a;
                }
            } else {
                awhqVar = null;
            }
            asfq asfqVar3 = asgaVar.d;
            if (asfqVar3 == null) {
                asfqVar3 = asfq.a;
            }
            if (asfqVar3.c == 94946882) {
                asfq asfqVar4 = asgaVar.d;
                if (asfqVar4 == null) {
                    asfqVar4 = asfq.a;
                }
                if (asfqVar4.c == 94946882) {
                    atcpVar = (atcp) asfqVar4.d;
                } else {
                    atcpVar = atcp.a;
                }
            } else {
                atcpVar = null;
            }
            asfq asfqVar5 = asgaVar.d;
            if (asfqVar5 == null) {
                asfqVar5 = asfq.a;
            }
            if (asfqVar5.c == 161497951) {
                asfq asfqVar6 = asgaVar.d;
                if (asfqVar6 == null) {
                    asfqVar6 = asfq.a;
                }
                if (asfqVar6.c == 161497951) {
                    avktVar = (avkt) asfqVar6.d;
                } else {
                    avktVar = avkt.a;
                }
            } else {
                avktVar = null;
            }
            if (atcpVar != null) {
                ixuVar.aK();
                ixuVar.aI();
                ixuVar.aM("");
                ixuVar.at.add(atcpVar);
                return;
            }
            if (avktVar == null) {
                asfq asfqVar7 = asgaVar.d;
                if (asfqVar7 == null) {
                    asfqVar7 = asfq.a;
                }
                if (asfqVar7.c == 58521717) {
                    asfq asfqVar8 = asgaVar.d;
                    if (asfqVar8 == null) {
                        asfqVar8 = asfq.a;
                    }
                    if (asfqVar8.c == 58521717) {
                        awgtVar = (awgt) asfqVar8.d;
                    } else {
                        awgtVar = awgt.a;
                    }
                } else {
                    awgtVar = null;
                }
                asgd asgdVar = asgaVar.e;
                if (asgdVar == null) {
                    asgdVar = asgd.a;
                }
                if (asgdVar.b == 64099105) {
                    asgd asgdVar2 = asgaVar.e;
                    if (asgdVar2 == null) {
                        asgdVar2 = asgd.a;
                    }
                    if (asgdVar2.b == 64099105) {
                        aqdtVar = (aqdt) asgdVar2.c;
                    } else {
                        aqdtVar = aqdt.a;
                    }
                } else {
                    aqdtVar = null;
                }
                if (awgtVar == null) {
                    if (awhqVar != null) {
                        ixuVar.aH().a(yjj.j(awhqVar));
                    }
                    ixuVar.dismiss();
                    return;
                }
                if (aqdtVar != null) {
                    if (ixuVar.as == null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ixuVar.ae);
                        if ((aqdtVar.b & 1) != 0) {
                            aqygVar = aqdtVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        AlertDialog.Builder message = builder.setTitle(ajcq.b(aqygVar)).setMessage(ahbl.p(aqdtVar, null));
                        if ((aqdtVar.b & 2097152) != 0) {
                            aqygVar2 = aqdtVar.p;
                            if (aqygVar2 == null) {
                                aqygVar2 = aqyg.a;
                            }
                        } else {
                            aqygVar2 = null;
                        }
                        AlertDialog.Builder positiveButton = message.setPositiveButton(ajcq.b(aqygVar2), new DialogInterface.OnClickListener() { // from class: ixo
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ixu.this.aN(awgtVar);
                            }
                        });
                        if ((aqdtVar.b & 4194304) != 0 && (aqygVar3 = aqdtVar.q) == null) {
                            aqygVar3 = aqyg.a;
                        }
                        ixuVar.as = positiveButton.setNegativeButton(ajcq.b(aqygVar3), new ixn(ixuVar, 0)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ixm
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ixu.this.dismiss();
                            }
                        }).create();
                    }
                    ixuVar.as.show();
                } else {
                    ixuVar.aN(awgtVar);
                }
                if (awhqVar != null) {
                    ixuVar.aH().a.d(yjj.j(awhqVar).toString());
                    return;
                }
                return;
            }
            ixuVar.aK();
            ixuVar.at.l();
            ixuVar.aI();
            ixuVar.aM("");
            ixuVar.at.add(avktVar);
            return;
        }
        ixuVar.dismiss();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
