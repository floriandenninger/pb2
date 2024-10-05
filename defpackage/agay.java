package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agay implements afwx {
    final /* synthetic */ agaz a;

    public agay(agaz agazVar) {
        this.a = agazVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        atdh atdhVar;
        atdh atdhVar2;
        arwc arwcVar = (arwc) obj;
        agaz agazVar = this.a;
        if (agazVar.c) {
            return;
        }
        final agba agbaVar = agazVar.b;
        atdf atdfVar = arwcVar.c;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        atdc atdcVar = atdfVar.c;
        if (atdcVar == null) {
            atdcVar = atdc.a;
        }
        if ((atdcVar.b & 4) != 0) {
            atdi atdiVar = atdcVar.d;
            if (atdiVar == null) {
                atdiVar = atdi.a;
            }
            if (atdiVar.b == 82258301) {
                atdi atdiVar2 = atdcVar.d;
                if (atdiVar2 == null) {
                    atdiVar2 = atdi.a;
                }
                if (atdiVar2.b == 82258301) {
                    atdhVar = (atdh) atdiVar2.c;
                } else {
                    atdhVar = atdh.a;
                }
                if ((atdhVar.b & 1) != 0) {
                    agax agaxVar = agbaVar.c;
                    atdi atdiVar3 = atdcVar.d;
                    if (atdiVar3 == null) {
                        atdiVar3 = atdi.a;
                    }
                    if (atdiVar3.b == 82258301) {
                        atdhVar2 = (atdh) atdiVar3.c;
                    } else {
                        atdhVar2 = atdh.a;
                    }
                    aqyg aqygVar = atdhVar2.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    String str = aqygVar.d;
                    CharSequence[] charSequenceArr = new CharSequence[atdcVar.c.size()];
                    for (int i = 0; i < atdcVar.c.size(); i++) {
                        atda atdaVar = (atda) atdcVar.c.get(i);
                        if ((atdaVar.b & 2) != 0) {
                            atde atdeVar = atdaVar.d;
                            if (atdeVar == null) {
                                atdeVar = atde.a;
                            }
                            if ((atdeVar.b & 1) != 0) {
                                atde atdeVar2 = atdaVar.d;
                                if (atdeVar2 == null) {
                                    atdeVar2 = atde.a;
                                }
                                aqyg aqygVar2 = atdeVar2.c;
                                if (aqygVar2 == null) {
                                    aqygVar2 = aqyg.a;
                                }
                                charSequenceArr[i] = aqygVar2.d;
                            }
                        }
                    }
                    mh mhVar = new mh(agaxVar.a);
                    mhVar.o(str);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: agav
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            agba agbaVar2 = agba.this;
                            atde atdeVar3 = ((atda) agbaVar2.b.c.get(i2)).d;
                            if (atdeVar3 == null) {
                                atdeVar3 = atde.a;
                            }
                            apxf apxfVar = atdeVar3.e;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            agbaVar2.a.c(apxfVar, null);
                        }
                    };
                    md mdVar = mhVar.a;
                    mdVar.o = charSequenceArr;
                    mdVar.q = onClickListener;
                    mhVar.a.m = new DialogInterface.OnDismissListener() { // from class: agaw
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            agba.this.c.a.finish();
                        }
                    };
                    mhVar.q();
                }
            }
        }
        agbaVar.b = atdcVar;
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
