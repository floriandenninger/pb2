package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aayj implements afwx {
    final /* synthetic */ aayh a;

    public aayj(aayh aayhVar) {
        this.a = aayhVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        aayh aayhVar = this.a;
        if (aayhVar != null) {
            aayhVar.e(true);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        boolean z;
        arim arimVar = (arim) obj;
        if (this.a != null) {
            if (arimVar.c.size() != 0) {
                Iterator it = arimVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    asss asssVar = ((arik) it.next()).b;
                    if (asssVar == null) {
                        asssVar = asss.a;
                    }
                    if (!asssVar.e) {
                        z = false;
                        break;
                    }
                }
                this.a.e(z);
                return;
            }
            this.a.j();
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
