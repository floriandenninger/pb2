package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyb implements wyi, wof {
    public String a;
    final ajun b = new ajun((short[]) null);
    private final azrw c;
    private aigf d;

    public wyb(azrw azrwVar) {
        this.c = azrwVar;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.b.v(xgxVar.c());
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3 = this.d != aigf.FULLSCREEN && aigfVar == aigf.FULLSCREEN;
        boolean z4 = this.d == aigf.FULLSCREEN && aigfVar != aigf.FULLSCREEN;
        if (z3 || z4) {
            ArrayList arrayList = new ArrayList();
            for (xgv xgvVar : this.b.w()) {
                if (z3) {
                    xgx xgxVar = xgvVar.b;
                    if (xgxVar instanceof xff) {
                        if (TextUtils.equals(((xff) xgxVar).a, this.a)) {
                            arrayList.add(xgvVar);
                        }
                    }
                }
                if (z4) {
                    xgx xgxVar2 = xgvVar.b;
                    if ((xgxVar2 instanceof xfg) && TextUtils.equals(((xfg) xgxVar2).a, this.a)) {
                        arrayList.add(xgvVar);
                    }
                }
            }
            this.d = aigfVar;
            if (arrayList.isEmpty()) {
                return;
            }
            ((wyh) this.c.get()).r(arrayList);
            return;
        }
        this.d = aigfVar;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final void qw(String str, int i) {
        this.a = str;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.b.y(xgxVar.c())) {
            String str = xghVar.a;
            throw new wxf(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        }
        if ((xgxVar instanceof xff) || (xgxVar instanceof xfg)) {
            this.b.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
            return;
        }
        String str2 = xghVar.a;
        String name = xgxVar.b().name();
        StringBuilder sb = new StringBuilder(str2.length() + 105 + String.valueOf(name).length());
        sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
        sb.append(str2);
        sb.append(" of type ");
        sb.append(name);
        sb.append(" in PlayerGeometryEventTriggerAdapter");
        throw new wxf(sb.toString());
    }
}
