package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xpw implements afwx {
    private final ajrn a;
    private final zaw b;
    private final ajqu c;

    public xpw(ajrn ajrnVar, zaw zawVar, ajqu ajquVar) {
        this.a = ajrnVar;
        this.b = zawVar;
        this.c = ajquVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arzq arzqVar = (arzq) obj;
        aumb aumbVar = null;
        if (arzqVar != null) {
            arzr arzrVar = arzqVar.c;
            if (arzrVar == null) {
                arzrVar = arzr.a;
            }
            if (arzrVar.b == 113762946) {
                arzr arzrVar2 = arzqVar.c;
                if (arzrVar2 == null) {
                    arzrVar2 = arzr.a;
                }
                if (arzrVar2.b == 113762946) {
                    aumbVar = (aumb) arzrVar2.c;
                } else {
                    aumbVar = aumb.a;
                }
            }
        }
        if (aumbVar != null) {
            this.a.c(aumbVar, this.c);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
