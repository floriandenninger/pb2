package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xpi implements afwx {
    public Map a;
    private final aahd b;
    private final xnm c;
    private final zaw d;

    public xpi(aahd aahdVar, xnm xnmVar, zaw zawVar) {
        this.b = aahdVar;
        xnmVar.getClass();
        this.c = xnmVar;
        zawVar.getClass();
        this.d = zawVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.d.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arlt arltVar = (arlt) obj;
        Iterator it = arltVar.c.iterator();
        while (it.hasNext()) {
            this.c.a((arlj) it.next(), null);
        }
        this.b.d(arltVar.d, this.a);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
