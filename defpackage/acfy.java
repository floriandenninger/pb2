package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acfy implements afwx {
    final /* synthetic */ acgf a;

    public acfy(acgf acgfVar) {
        this.a = acgfVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arrc arrcVar = (arrc) obj;
        if (acfm.b(this.a)) {
            String str = null;
            if (arrcVar != null && arrcVar.c.size() > 0 && ((arqy) arrcVar.c.get(0)).e != 0) {
                arrh arrhVar = ((arqy) arrcVar.c.get(0)).g;
                if (arrhVar == null) {
                    arrhVar = arrh.a;
                }
                if (arrhVar.e > 0) {
                    int i = arrhVar.b;
                    if ((i & 1) != 0) {
                        aqyg aqygVar = arrhVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        str = ajcq.b(aqygVar).toString();
                    } else if ((i & 2) != 0) {
                        aqyg aqygVar2 = arrhVar.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        str = ajcq.b(aqygVar2).toString();
                    }
                }
            }
            acgf acgfVar = this.a;
            acgfVar.av = str;
            acgfVar.ap.setText(str);
            this.a.ap.setVisibility(true == TextUtils.isEmpty(str) ? 4 : 0);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
