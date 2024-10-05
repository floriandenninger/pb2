package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyk implements wyi, xjk, wwp, wwq {
    final ajun a = new ajun((short[]) null);
    private final azrw b;
    private String c;

    public wyk(azrw azrwVar) {
        this.b = azrwVar;
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xjk
    public final void d() {
        if (this.c == null) {
            whu.l(null, "Ping migration VisitAdvertiserLinkClickedTriggerAdapter has no active media layout for click event");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.w().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xgv xgvVar = (xgv) it.next();
            if (TextUtils.equals(((xha) xgvVar.b).a, this.c)) {
                arrayList.add(xgvVar);
                break;
            }
        }
        if (!arrayList.isEmpty()) {
            ((wyh) this.b.get()).r(arrayList);
        } else {
            whu.l(null, "Ping migration VisitAdvertiserLinkClickedTriggerAdapter has null triggered bundle for click event");
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void i(xiv xivVar) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.wwp
    public final void o(xgh xghVar, xev xevVar) {
        if (xghVar.c() == apae.SLOT_TYPE_PLAYER_BYTES && xevVar.b == apac.LAYOUT_TYPE_MEDIA) {
            this.c = xevVar.a;
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void q(int i, int i2) {
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
        if (!(xgxVar instanceof xha)) {
            String name = xgxVar.b().name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 93);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(name);
            sb2.append(" in VisitAdvertiserLinkClickedTriggerAdapter");
            throw new wxf(sb2.toString());
        }
        this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.wwq
    public final void s(xgh xghVar, xev xevVar, int i) {
        if (TextUtils.equals(xevVar.a, this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xjk
    public final /* synthetic */ void u(boolean z) {
    }
}
