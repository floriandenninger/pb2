package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iwq implements afwx {
    final /* synthetic */ iwr a;

    public iwq(iwr iwrVar) {
        this.a = iwrVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        iwr iwrVar = this.a;
        iwrVar.ak.b(iwrVar.a.b(cnqVar), true);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aucn aucnVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        apmg apmgVar;
        aqyg aqygVar6;
        arzn arznVar = (arzn) obj;
        arzo arzoVar = arznVar.e;
        if (arzoVar == null) {
            arzoVar = arzo.a;
        }
        if (arzoVar.b == 78398567) {
            iwr iwrVar = this.a;
            arzo arzoVar2 = arznVar.e;
            if (arzoVar2 == null) {
                arzoVar2 = arzo.a;
            }
            if (arzoVar2.b == 78398567) {
                aucnVar = (aucn) arzoVar2.c;
            } else {
                aucnVar = aucn.a;
            }
            iwrVar.ai = evr.bZ(aucnVar);
            iwr iwrVar2 = this.a;
            aucj aucjVar = iwrVar2.ai;
            if (aucjVar != null) {
                final lwp lwpVar = iwrVar2.al;
                lwpVar.r = aucjVar;
                int i = aucjVar.b & 2;
                if (i == 0) {
                    if (i == 0) {
                        zga.b("Missing PlaylistContributionState for playlist collaboration settings page to work.");
                    }
                    lwpVar.c.setVisibility(8);
                } else {
                    lwpVar.c.setVisibility(0);
                    lwpVar.b();
                    aucd aucdVar = aucjVar.d;
                    if (aucdVar == null) {
                        aucdVar = aucd.a;
                    }
                    SwitchCompat switchCompat = lwpVar.e;
                    apmg apmgVar2 = null;
                    if ((aucdVar.b & 2) != 0) {
                        aqygVar = aucdVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    switchCompat.setText(ajcq.b(aqygVar));
                    boolean z = !aucdVar.d;
                    lwpVar.p = z;
                    lwpVar.e.setChecked(z);
                    lwpVar.d(lwpVar.p);
                    lwpVar.e.setOnCheckedChangeListener(new lwn(lwpVar));
                    auce auceVar = aucjVar.e;
                    if (auceVar == null) {
                        auceVar = auce.a;
                    }
                    TextView textView = lwpVar.f;
                    if ((auceVar.b & 2) != 0) {
                        aqygVar2 = auceVar.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    textView.setText(ajcq.b(aqygVar2));
                    if (auceVar.c.size() == 0) {
                        lwpVar.f.setVisibility(0);
                        lwpVar.g.setVisibility(8);
                    } else {
                        lwpVar.q.clear();
                        lwpVar.q.addAll(auceVar.c);
                        lwpVar.g.setVisibility(0);
                        lwpVar.f.setVisibility(8);
                    }
                    TextView textView2 = lwpVar.h;
                    if ((aucjVar.b & 128) != 0) {
                        aqygVar3 = aucjVar.f;
                        if (aqygVar3 == null) {
                            aqygVar3 = aqyg.a;
                        }
                    } else {
                        aqygVar3 = null;
                    }
                    textView2.setText(ajcq.b(aqygVar3));
                    TextView textView3 = lwpVar.i;
                    auch auchVar = aucjVar.g;
                    if (auchVar == null) {
                        auchVar = auch.a;
                    }
                    apmg apmgVar3 = auchVar.c;
                    if (apmgVar3 == null) {
                        apmgVar3 = apmg.a;
                    }
                    if ((apmgVar3.b & 256) != 0) {
                        auch auchVar2 = aucjVar.g;
                        if (auchVar2 == null) {
                            auchVar2 = auch.a;
                        }
                        apmg apmgVar4 = auchVar2.c;
                        if (apmgVar4 == null) {
                            apmgVar4 = apmg.a;
                        }
                        aqygVar4 = apmgVar4.i;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                    } else {
                        aqygVar4 = null;
                    }
                    textView3.setText(ajcq.b(aqygVar4));
                    lwpVar.i.setOnClickListener(new lwm(lwpVar));
                    TextView textView4 = lwpVar.k;
                    if ((aucjVar.b & 8192) != 0) {
                        aqygVar5 = aucjVar.l;
                        if (aqygVar5 == null) {
                            aqygVar5 = aqyg.a;
                        }
                    } else {
                        aqygVar5 = null;
                    }
                    textView4.setText(ajcq.b(aqygVar5));
                    gno gnoVar = lwpVar.l;
                    auch auchVar3 = aucjVar.i;
                    if (auchVar3 == null) {
                        auchVar3 = auch.a;
                    }
                    if ((auchVar3.b & 1) != 0) {
                        auch auchVar4 = aucjVar.i;
                        if (auchVar4 == null) {
                            auchVar4 = auch.a;
                        }
                        apmgVar = auchVar4.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                    } else {
                        apmgVar = null;
                    }
                    gnoVar.b(apmgVar, lwpVar.d);
                    TextView textView5 = lwpVar.m;
                    if ((aucjVar.b & 512) != 0) {
                        aqygVar6 = aucjVar.h;
                        if (aqygVar6 == null) {
                            aqygVar6 = aqyg.a;
                        }
                    } else {
                        aqygVar6 = null;
                    }
                    textView5.setText(ajcq.b(aqygVar6));
                    auch auchVar5 = aucjVar.j;
                    if (auchVar5 == null) {
                        auchVar5 = auch.a;
                    }
                    if ((auchVar5.b & 1) != 0) {
                        auch auchVar6 = aucjVar.j;
                        if (auchVar6 == null) {
                            auchVar6 = auch.a;
                        }
                        apmgVar2 = auchVar6.c;
                        if (apmgVar2 == null) {
                            apmgVar2 = apmg.a;
                        }
                    }
                    lwpVar.n.b(apmgVar2, lwpVar.d);
                    lwpVar.n.c = new ajyc() { // from class: lwl
                        @Override // defpackage.ajyc
                        public final void oC(aong aongVar) {
                            lwp.this.e(2);
                        }
                    };
                    aucd aucdVar2 = aucjVar.d;
                    if (aucdVar2 == null) {
                        aucdVar2 = aucd.a;
                    }
                    if (!aucdVar2.d && aucjVar.k) {
                        lwpVar.i.performClick();
                    }
                }
            }
        }
        iwr iwrVar3 = this.a;
        iwrVar3.aj = iwrVar3.q();
        ((fzb) this.a.ag.get()).j();
        this.a.ak.a();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
