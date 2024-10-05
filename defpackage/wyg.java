package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyg implements wyi {
    public final azrw a;
    public final azrw b;
    public final ajun c = new ajun((short[]) null);

    public wyg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar3;
        ((wqb) azrwVar2.get()).b(this);
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.c.v(xgxVar.c());
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.c.y(xgxVar.c())) {
            String valueOf = String.valueOf(xgxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wxf(sb.toString());
        }
        if (!(xgxVar instanceof xgq)) {
            String valueOf2 = String.valueOf(xgxVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 82);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in SurveySubmittedTriggerAdapter");
            throw new wxf(sb2.toString());
        }
        this.c.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
    }
}
