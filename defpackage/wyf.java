package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyf implements wyi, wwo {
    public static final Set a = new aeb(Arrays.asList(0, 2));
    public static final Set b = new aeb(Arrays.asList(3));
    public final azrw c;
    final ajun d = new ajun((short[]) null);
    private final azrw e;

    public wyf(azrw azrwVar, azrw azrwVar2) {
        this.e = azrwVar;
        this.c = azrwVar2;
    }

    @Override // defpackage.wwo
    public final xci b(xgh xghVar, xev xevVar) {
        return new wyd(this, xghVar, xevVar);
    }

    @Override // defpackage.wwo
    public final xci d(xgh xghVar, xev xevVar, wtk wtkVar) {
        return new wye(this, wtkVar, xghVar, xevVar);
    }

    public final void e(xgh xghVar, xev xevVar, String str, Set set) {
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.d.w()) {
            if (TextUtils.equals(str, ((xgg) xgvVar.b).a) && set.contains(Integer.valueOf(xgvVar.a))) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            String valueOf = String.valueOf(set);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("No associated layout for skip click. Exit category: ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            if (xghVar == null || xevVar == null) {
                whu.l(null, sb2);
                return;
            } else {
                whu.m(xghVar, xevVar, sb2);
                return;
            }
        }
        ((wyh) this.e.get()).r(arrayList);
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.d.v(xgxVar.c());
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.d.y(xgxVar.c())) {
            String valueOf = String.valueOf(xgxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wxf(sb.toString());
        }
        if (!(xgxVar instanceof xgg)) {
            String valueOf2 = String.valueOf(xgxVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in SkipButtonClickedTriggerAdapter");
            throw new wxf(sb2.toString());
        }
        this.d.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
    }
}
