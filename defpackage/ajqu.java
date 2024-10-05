package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqu implements afwx {
    public ammv a = amlr.a;
    public Object b = this;
    private final Context c;
    private final aahd d;
    private final zaw e;
    private final azrw f;
    private final ajdh g;

    public ajqu(Context context, aahd aahdVar, zaw zawVar, azrw azrwVar, ajdh ajdhVar) {
        this.c = context;
        this.d = aahdVar;
        this.e = zawVar;
        this.f = azrwVar;
        this.g = ajdhVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.e.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final void kZ(Object obj) {
        asmt asmtVar;
        aqvu aqvuVar;
        if (obj instanceof arqh) {
            arqh arqhVar = (arqh) obj;
            arqk arqkVar = arqhVar.f;
            if (arqkVar == null) {
                arqkVar = arqk.a;
            }
            if (arqkVar.b == 171313147) {
                arqk arqkVar2 = arqhVar.f;
                if (arqkVar2 == null) {
                    arqkVar2 = arqk.a;
                }
                if (arqkVar2.b == 171313147) {
                    asmtVar = (asmt) arqkVar2.c;
                } else {
                    asmtVar = asmt.a;
                }
            } else {
                asmtVar = null;
            }
            if (asmtVar != null) {
                ((ajrc) this.f.get()).a(asmtVar, this.a, this.b);
            }
            arqk arqkVar3 = arqhVar.f;
            if (arqkVar3 == null) {
                arqkVar3 = arqk.a;
            }
            if (arqkVar3.b == 85374086) {
                arqk arqkVar4 = arqhVar.f;
                if (arqkVar4 == null) {
                    arqkVar4 = arqk.a;
                }
                if (arqkVar4.b == 85374086) {
                    aqvuVar = (aqvu) arqkVar4.c;
                } else {
                    aqvuVar = aqvu.a;
                }
            } else {
                aqvuVar = null;
            }
            if (aqvuVar != null) {
                ajdj.g(this.c, aqvuVar, this.d, this.g, this.b);
            }
            if (arqhVar.g.size() > 0) {
                this.d.d(arqhVar.g, null);
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
