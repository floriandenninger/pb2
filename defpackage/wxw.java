package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxw implements wyi {
    public final azrw a;
    public final ajun b = new ajun((short[]) null);

    public wxw(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.b.v(xgxVar.c());
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.b.y(xgxVar.c())) {
            String valueOf = String.valueOf(xgxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wxf(sb.toString());
        }
        if (!(xgxVar instanceof xft)) {
            String valueOf2 = String.valueOf(xgxVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in InterruptCanceledTriggerAdapter");
            throw new wxf(sb2.toString());
        }
        this.b.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
    }
}
