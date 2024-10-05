package defpackage;

import android.accounts.Account;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afyc implements afyb {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final aadw e;

    public afyc(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, aadw aadwVar) {
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.e = aadwVar;
        this.d = azrwVar;
        this.c = azrwVar4;
    }

    private final void b(int i) {
        ((acpz) this.c.get()).b(new acpx(i - 1, 10), aqxl.FLOW_TYPE_CHIME_REGISTRATION);
    }

    @Override // defpackage.afyb
    public final void a() {
        ammv ammvVar;
        b(2);
        atoa atoaVar = this.e.b().w;
        if (atoaVar == null) {
            atoaVar = atoa.a;
        }
        if (atoaVar.d) {
            try {
                ammvVar = ammv.i(((wcf) this.a.get()).a(((afsy) this.b.get()).c()));
            } catch (RemoteException | qnk | qnl e) {
                afsi.c(2, 7, "Get account failed", e);
                ammvVar = amlr.a;
            }
            if (ammvVar.h()) {
                b(3);
                ((ude) this.d.get()).a(amru.r(((Account) ammvVar.c()).name));
                b(4);
            }
        }
    }
}
