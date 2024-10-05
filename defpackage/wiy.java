package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wiy implements afwx {
    final /* synthetic */ wig a;

    public wiy(wig wigVar) {
        this.a = wigVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.b(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aati aatiVar = (aati) obj;
        aata a = aatiVar.a();
        if (a == null) {
            List c = aatiVar.c();
            if (c.size() == 1) {
                a = (aata) c.get(0);
            }
        }
        if (a != null) {
            this.a.c(a);
        } else {
            this.a.a();
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
