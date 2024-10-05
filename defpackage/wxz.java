package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxz implements wyi {
    final ajun a = new ajun((short[]) null);
    private final azrw b;

    public wxz(azrw azrwVar) {
        this.b = azrwVar;
    }

    public final void b(xev xevVar, int i) {
        String str = xevVar.a;
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            if (TextUtils.equals(((xfp) xgvVar.b).a, str)) {
                int i2 = xgvVar.a;
                if (i2 != 1) {
                    if (i2 == 2 && i == 2) {
                        arrayList.add(xgvVar);
                    }
                } else if (i == 0) {
                    arrayList.add(xgvVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.a.v(xgxVar.c());
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.a.y(xgxVar.c())) {
            String valueOf = String.valueOf(xgxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wxf(sb.toString());
        }
        if (!(xgxVar instanceof xfp)) {
            String valueOf2 = String.valueOf(xgxVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 92);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in OnLayoutSelfExitRequestedTriggerAdapter");
            throw new wxf(sb2.toString());
        }
        this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
    }
}
